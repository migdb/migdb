package migdb.dsl.ops.typing

import mm.app.ops.AddProperty
import mm.app.ops.AddStandardClass
import mm.app.ops.RemoveEntity
import mm.app.ops.RemoveProperty
import mm.app.ops.RenameProperty
import mm.app.ops.MoveProperties
import mm.app.ops.PullUpProperties
import mm.app.ops.PushDownProperties
import mm.app.ops.AddParent
import mm.app.ops.RemoveParent
import mm.app.ops.ExtractClass
import mm.app.ops.ExtractSubClass
import mm.app.ops.ExtractSuperClass

class TypeChecker {

	/**
	 * Type rules
	 */
	//T-AddCls
	def dispatch TypeResult check(AddStandardClass op, Context g) {
		if(g.existsClass(op.name))
			return error(g, Errors::classExists(op.name))
		return ok(op.apply(g))
	}
	
	//T-RemCls
	def dispatch TypeResult check(RemoveEntity op, Context g) {
		if(!g.existsClass(op.name))
			return error(g, Errors::classNotExists(op.name))
		if(g.hasProp(op.name))
			return error(g, Errors::classHasProperties(op.name))
		if(g.hasSub(op.name))
			return error(g, Errors::classHasSubclasses(op.name))
		if(g.existsPropertyType(op.name))
			return error(g, Errors::classTypeExists(op.name))
		return ok(op.apply(g))
	}
	
	//T-AddProp1-3
	def dispatch TypeResult check(AddProperty op, Context g) {		
		if(!g.existsClass(op.owningClassName))
			return error(g, Errors::classNotExists(op.owningClassName))
		if(!g.existsClass(op.typeName) && !g.isPrimitive(op.typeName))
			return error(g, Errors::typeDontExists(op.typeName))
		if(op.upperBound <= 0 || op.lowerBound < 0 || op.lowerBound > op.upperBound)
			return error(g, Errors::boundsInvalid(op.lowerBound, op.upperBound))
		if(g.inAllprop(op.owningClassName, op.name))
			return error(g, Errors::propertyExists(op.owningClassName, op.name))
		return ok(op.apply(g))
	}
	
	//T-RemProp
	def dispatch TypeResult check(RemoveProperty op, Context g) {
		if(!g.existsClass(op.owningClassName))
			return error(g, Errors::classNotExists(op.owningClassName))
		if(!g.existsProperty(op.owningClassName, op.name))
			return error(g, Errors::propertyNotExists(op.owningClassName, op.name))
		return ok(op.apply(g))
	}
	
	//T-NamProp
	def dispatch TypeResult check(RenameProperty op, Context g) {		
		if(!g.existsClass(op.owningClassName))
			return error(g, Errors::classNotExists(op.owningClassName))
		if(!g.existsProperty(op.owningClassName, op.name))
			return error(g, Errors::propertyNotExists(op.owningClassName, op.name))
		if(g.inAllprop(op.owningClassName, op.newName))
			return error(g, Errors::propertyExists(op.owningClassName, op.newName))
		return ok(op.apply(g))
	}

	//T-MovProp
	def dispatch TypeResult check(MoveProperties op, Context g) {
		if(!g.existsClass(op.sourceClassName))
			return error(g, Errors::classNotExists(op.sourceClassName))
		if(!g.existsProperty(op.sourceClassName, op.propertiesNames.head))
			return error(g, Errors::propertyNotExists(op.sourceClassName, op.propertiesNames.head))
		if(!g.existsProperty(op.sourceClassName, op.linkName))
			return error(g, Errors::propertyNotExists(op.sourceClassName, op.linkName))
		val asoc = g.getProperty(op.sourceClassName, op.linkName)
		if(!g.existsClass(asoc.type))
			return error(g, Errors::propertyTypeInvalid(asoc.type, op.propertiesNames.head))
		if(asoc.low != 1 || asoc.upper != 1)
			return error(g, Errors::boundsInvalid(op.sourceClassName, op.linkName, 1, 1))
		if(g.inAllprop(asoc.type, op.propertiesNames.head))
			return error(g, Errors::propertyExists(asoc.type, op.propertiesNames.head))
		return ok(op.apply(g))
	}	
	
	//T-PullUp
	def dispatch TypeResult check(PullUpProperties op, Context g) {
		if(!g.existsClass(op.childClassName))
			return error(g, Errors::classNotExists(op.childClassName))
		if(g.isTop(g.par(op.childClassName)))
			return error(g, Errors::classHasNoParent(op.childClassName))
		if(!g.existsProperty(op.childClassName, op.pulledPropertiesNames.head))
			return error(g, Errors::propertyNotExists(op.childClassName, op.pulledPropertiesNames.head))
		if(g.inSibprop(op.childClassName, op.pulledPropertiesNames.head))
			return error(g, Errors::propertyExists(op.childClassName, op.pulledPropertiesNames.head))
		return ok(op.apply(g))
	}
	
	//T-PushDown
	def dispatch TypeResult check(PushDownProperties op, Context g) {
		if(!g.existsClass(op.childClassName))
			return error(g, Errors::classNotExists(op.childClassName))
		if(!g.existsProperty(op.childClassName, op.pushedPropertiesNames.head))
			return error(g, Errors::propertyNotExists(op.childClassName, op.pushedPropertiesNames.head))
		if(!g.hasSub(op.childClassName))
			return error(g, Errors::classHasNoSubclasses(op.childClassName))
		return ok(op.apply(g))
	}
	
	//T-SetPar
	def dispatch TypeResult check(AddParent op, Context g) {
		if(!g.existsClass(op.className))
			return error(g, Errors::classNotExists(op.className))
		if(!g.existsClass(op.parentClassName))
			return error(g, Errors::classNotExists(op.parentClassName))
		if(g.inPreds(op.parentClassName, op.className))
			return error(g, Errors::classCycle(op.className))
		if(!g.isDisjoint(op.className, op.parentClassName))
			return error(g, Errors::propertyNotDisjoint(op.className, op.parentClassName))
		return ok(op.apply(g))
	}

	//T-RemPar
	def dispatch TypeResult check(RemoveParent op, Context g) {
		if(!g.existsClass(op.className))
			return error(g, Errors::classNotExists(op.className))
		if(g.isTop(g.par(op.className)))
			return error(g, Errors::classHasNoParent(op.className))
		return ok(op.apply(g))
	}
	
	//T-ExtCls
	def dispatch TypeResult check(ExtractClass op, Context g) {
		if(!g.existsClass(op.sourceClassName))
			return error(g, Errors::classNotExists(op.sourceClassName))
		if(!g.existsProperty(op.sourceClassName, op.propertyNames.head))
			return error(g, Errors::propertyNotExists(op.sourceClassName, op.propertyNames.head))
		if(g.existsClass(op.extractClassName))
			return error(g, Errors::classExists(op.extractClassName))
		if(g.inAllprop(op.sourceClassName, op.associationPropertyName))
			return error(g, Errors::propertyExists(op.sourceClassName, op.associationPropertyName))
		return ok(op.apply(g))
	}
	
	//T-ExtSub
	def dispatch TypeResult check(ExtractSubClass op, Context g) {
		if(!g.existsClass(op.sourceClassName))
			return error(g, Errors::classNotExists(op.sourceClassName))
		if(!g.existsProperty(op.sourceClassName, op.extractedPropertiesNames.head))
			return error(g, Errors::propertyNotExists(op.sourceClassName, op.extractedPropertiesNames.head))
		if(g.existsClass(op.extractedClassName))
			return error(g, Errors::classExists(op.extractedClassName))
		return ok(op.apply(g))
	}
	
	//T-ExtSuper
	def dispatch TypeResult check(ExtractSuperClass op, Context g) {
		var PropertySet$Property first
		for(cls : op.sourceClassesName) {
			if(!g.existsClass(cls))
				return error(g, Errors::classNotExists(cls))
			if(!g.isTop(g.par(cls)))
				return error(g, Errors::classHasParent(cls))
			if(!g.existsProperty(cls, op.propertyNames.head))
				return error(g, Errors::propertyNotExists(cls, op.propertyNames.head))

			if(first.identityEquals(null))
				first = g.getProperty(cls,op.propertyNames.head)
			else if(!g.existsProperty(cls, first.name, first.type, first.low, first.upper))
				return error(g, Errors::propertyNotEqual(cls, first.name))
		}
		if(g.existsClass(op.extractParentName))
			return error(g, Errors::classExists(op.extractParentName))
		return ok(op.apply(g))
	}
	
	/**
	 * Context changers
	 */
	 //T-AddCls
	def dispatch Context apply(AddStandardClass op, Context g) {
		return g.addClass(op.name)
	}
	
	//T-RemCls
	def dispatch Context apply(RemoveEntity op, Context g) {
		return g.removeClass(op.name)
	}
	
	//T-AddProp1-3
	def dispatch Context apply(AddProperty op, Context g) {
		return g.addProperty(
			op.owningClassName, op.name, op.typeName, op.lowerBound, op.upperBound
		)
	}
	
	//T-RemProp
	def dispatch Context apply(RemoveProperty op, Context g) {
		return g.removeProperty(op.owningClassName, op.name)
	}
	
	//T-NamProp
	def dispatch Context apply(RenameProperty op, Context g) {
		return g.moveProperty(op.owningClassName, op.name, op.owningClassName, op.newName)
	}
	
	//T-MovProp
	def dispatch Context apply(MoveProperties op, Context g) {
		val asoc = g.getProperty(op.sourceClassName, op.linkName)
		return g.moveProperty(op.sourceClassName, op.propertiesNames.head,
					asoc.type, op.propertiesNames.head)
	}
	
	//T-PullUp
	def dispatch Context apply(PullUpProperties op, Context g) {
		return g.moveProperty(op.childClassName, op.pulledPropertiesNames.head,
					g.par(op.childClassName), op.pulledPropertiesNames.head)
	}
	
	//T-PushDown
	def dispatch Context apply(PushDownProperties op, Context g) {
		g.sub(op.childClassName).forEach[cls |
			g.copyProperty(op.childClassName, op.pushedPropertiesNames.head, cls)
		]
		return g.removeProperty(op.childClassName, op.pushedPropertiesNames.head)
	}
	
	//T-SetPar
	def dispatch Context apply(AddParent op, Context g) {
		return g.addSubclass(op.className, op.parentClassName)
	}
	
	//T-RemPar
	def dispatch Context apply(RemoveParent op, Context g) {
		return g.removeSubclass(op.className)
	}
	
	//T-ExtCls
	def dispatch Context apply(ExtractClass op, Context g) {
		return g.addClass(op.extractClassName)
				.addProperty(op.sourceClassName, op.associationPropertyName, op.extractClassName, 1, 1)
		 		.addProperty(op.extractClassName, op.oppositePropertyName, op.sourceClassName, 1, 1)
		 		.moveProperty(op.sourceClassName, op.propertyNames.head, op.extractClassName, op.propertyNames.head)
	}
	
	//T-ExtSub
	def dispatch Context apply(ExtractSubClass op, Context g) {
		g.addClass(op.extractedClassName)
		g.addSubclass(op.extractedClassName, op.sourceClassName)
		g.sub(op.sourceClassName).forEach[child |
			g.copyProperty(op.sourceClassName, op.extractedPropertiesNames.head, child)
		]
		return g.removeProperty(op.sourceClassName, op.extractedPropertiesNames.head)
	}
	
	//T-ExtSuper
	def dispatch Context apply(ExtractSuperClass op, Context g) {
		g.addClass(op.extractParentName)
		g.copyProperty(op.sourceClassesName.head, op.propertyNames.head, op.extractParentName)
		op.sourceClassesName.forEach[cls |
			g.addSubclass(cls, op.extractParentName)
			g.removeProperty(cls, op.propertyNames.head)
		]
		return g
	}
	
	/**
	 * Auxiliary methods
	 */
	 def error(Context g, CharSequence message) {
	 	return new TypeResult(g, message)
	 }
	 
	 def ok(Context g) {
	 	return new TypeResult(g)
	 }
}