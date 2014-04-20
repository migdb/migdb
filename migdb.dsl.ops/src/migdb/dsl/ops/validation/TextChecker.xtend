package migdb.dsl.ops.validation

import mm.app.ops.AddParent
import mm.app.ops.AddProperty
import mm.app.ops.AddStandardClass
import mm.app.ops.ExtractClass
import mm.app.ops.ExtractSubClass
import mm.app.ops.ExtractSuperClass
import mm.app.ops.MoveProperties
import mm.app.ops.PullUpProperties
import mm.app.ops.PushDownProperties
import mm.app.ops.RemoveEntity
import mm.app.ops.RemoveParent
import mm.app.ops.RemoveProperty
import mm.app.ops.RenameProperty
import java.util.List

class TextChecker {
	static List<String> PRIMITIVES = newArrayList("Integer", "Bool", "Char", "String")
	static String TOP = "Top"
	
	def reservedKey(String name) {
		return '''«name» is reserved keyword'''.toString
	}
	
	def private prop(String name) {
		if(PRIMITIVES.contains(name))
			return reservedKey(name)
		return null
	}
			
	def private cls(String clazz) {
		if(TOP == clazz || PRIMITIVES.contains(clazz))
			return reservedKey(clazz)
		return null
	}
	
	def private type(String type) {
		if(TOP == type)
			return reservedKey(type)
		return null
	}
			
	def dispatch check(AddStandardClass op) {
		return cls(op.name)
	}
		
	def dispatch check(AddProperty op) {
		val msg = prop(op.name)
		if(msg.identityEquals(null))
			return type(op.typeName)
		return msg
	}
		
	def dispatch check(RenameProperty op) {
		return prop(op.newName)
	}
		
	def dispatch check(AddParent op) {
		return cls(op.parentClassName)
	}
	
	def dispatch check(ExtractClass op) {
		val msg = prop(op.associationPropertyName)
		if(msg.identityEquals(null))
			return cls(op.extractClassName)
		return msg
	}
	
	def dispatch check(ExtractSubClass op) {
		return cls(op.extractedClassName)
	}
	
	def dispatch check(ExtractSuperClass op) {
		return cls(op.extractParentName)
	}

/***/
	def dispatch check(MoveProperties op) {}
	def dispatch check(PullUpProperties op) {}
	def dispatch check(PushDownProperties op) {}
	def dispatch check(RemoveEntity op) {}
	def dispatch check(RemoveParent op) {}
	def dispatch check(RemoveProperty op) {}
}