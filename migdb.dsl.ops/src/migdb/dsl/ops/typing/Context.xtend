package migdb.dsl.ops.typing

import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import java.util.TreeSet
import org.apache.log4j.Logger

class Context {
	static Logger LOG = Logger::getLogger(typeof(Context))
	Map<String, PropertySet> classes
	Map<String, String> subclasses
	public static List<String> PRIMITIVES = newArrayList("Integer", "Bool", "Char", "String")
	public static String TOP = "Top"
	
	new() {
		classes = new HashMap<String, PropertySet>()
		subclasses = new HashMap<String, String>()
	}
	
	/**
	 * Context checks
	 */
	//Checks if the name equals to primitive types
	def isPrimitive(String name) {
		return PRIMITIVES.contains(name) 
	}
	
	//Checks if the name equals to TOP
	def isTop(String name) {
		return TOP.equalsIgnoreCase(name)
	}
	
	//Checks if the context Gamma contains the class
	def existsClass(String name) {
		return classes.containsKey(name)
	}
	
	//Checks if the context Gamma contains the class's property
	def existsProperty(String clazz, String name) {
		return classes.get(clazz)?.contains(name)
	}
	
	//Checks if the context Gamma contains the class's property
	def existsProperty(String clazz, String name, String type, int low, int upper) {
		val prop = classes.get(clazz)?.get(name)
		if(!prop.identityEquals(null))
			return type.equalsIgnoreCase(prop.type)	&& low == prop.low && upper == prop.upper
		return false
	}
	
	//Checks if the context Gamma contains the class's asociation (type is a class)
	def existsAsociation(String clazz, String name, String type, int low, int upper) {
		return !isPrimitive(type) && existsProperty(clazz, name, type, low, upper)
	}
	
	//Checks if the context Gamma contains any property with given type
	def existsPropertyType(String clazz) {
		for(PropertySet ps : classes.values)
			if(ps.types.contains(clazz))
				return true
		return false
	}
	
	//Checks if the context Gamma contains the child-parent relationship
	def existsSubclass(String child, String parent) {
		return subclasses.containsKey(child) && subclasses.get(child)?.equals(parent)
	}
	
	/**
	 * Auxiliary functions
	 */
	//Checks if class has any properties
	 def hasProp(String clazz) {
		return !classes.get(clazz)?.empty
	}
	
	//Checks if class and its parents have given property
	def boolean inParprop(String clazz, String prop) {
		if(!classes.containsKey(clazz) || clazz == TOP)
			return false
		if(classes.get(clazz).contains(prop))
			return true
		return inParprop(par(clazz), prop)
	}

	//Checks if subclasses and its subclasses of the class have given property
	def private boolean inSubprop(String clazz, String prop) {
		if(!classes.containsKey(clazz) || clazz == TOP)
			return false
		for(cls : sub(clazz)) {
			if(classes.get(cls).contains(prop))
				return true
			if(inSubprop(cls, prop))
				return true
		}
		return false
	}
	
	//Checks if siblings and its subclasses of the class have given property
	def boolean inSibprop(String clazz, String prop) {
		if(!classes.containsKey(clazz) || clazz == TOP)
			return false
		for(cls : sub(par(clazz)).filter[sub | sub != clazz]) {
			if(classes.get(cls).contains(prop))
				return true
			if(inSubprop(cls, prop))
				return true
		}
		return false
	}
	
	//Checks if the class and its parents and subclasses have the property
	def boolean inAllprop(String clazz, String prop) {
		return inParprop(clazz, prop) || inSubprop(clazz, prop)
	}
	
	//Checks if the class's and its subclasses' properties are not present
	//in wannabe parent class and its parents
	def boolean isDisjoint(String clazz, String parent) {
		if(!classes.containsKey(clazz) || clazz == TOP)
			return true
		if(!classes.containsKey(parent) || parent == TOP)
			return true
		var parentProp = new TreeSet<String>()
		var childProp = new TreeSet<String>()
		
		var currPar = parent
		while(currPar != TOP) {
			parentProp.addAll(classes.get(currPar).names)
			currPar = par(currPar)
		}
		
		var queue = newArrayList(clazz)
		while(!queue.empty) {
			var currCls = queue.remove(0)
			childProp.addAll(classes.get(currCls).names)
			queue.addAll(sub(currCls))
		}
				
		parentProp.retainAll(childProp)
		return parentProp.empty;
	}
	
	//Returns parent name or TOP
	def par(String clazz) {
		if(!subclasses.containsKey(clazz))
			return TOP
		return subclasses.get(clazz)
	}
	
	//Checks if there is cycle in a class hierarchy
	def boolean inPreds(String clazz, String whatClass) {
		if(clazz == whatClass)
			return true
		
		var parent = par(clazz)
		while(parent != TOP) {
			if(parent == whatClass)
				return true
			parent = par(parent)	
		}		
		return false
	}
	
	//Returns list of direct subclasses of the class
	def Set<String> sub(String clazz) {
		val result = new TreeSet<String>()
		if(clazz == TOP)
			return result
		subclasses.forEach[key, value | 
			if(clazz == value)
				result.add(key)
		]
		return result
	}

	//Checks if the class has any subclasses
	def hasSub(String clazz) {
		return !sub(clazz).empty
	}
	
	/**
	 * Classes
	 */
	//Adds the class to the context Gamma
	def Context addClass(String name) {
		classes.put(name, new PropertySet())
		return this
	}
	
	//Removes the class from the context Gamma
	def Context removeClass(String name) {
		classes.remove(name)
		return this
	}
	
	/**
	 * Properties
	 */
	//Adds new property to the context Gamma
	def Context addProperty(String clazz, String name, String type, int low, int up) {
		classes.get(clazz).add(name, type, low, up)
		return this
	}
	
	//Removes the property from the context Gamma
	def Context removeProperty(String clazz, String name) {
		classes.get(clazz).remove(name);
		return this
	}
	
	//Moves the property to another class within context Gamma
	def Context moveProperty(String clazz, String name, String clazzNew, String nameNew) {
		val prop = getProperty(clazz, name)
		if(!prop.identityEquals(null)) {
			classes.get(clazz).remove(name);
			classes.get(clazzNew).add(nameNew, prop.type, prop.low, prop.upper)
		}
		return this
	}
	
	//Copies the property to another class withing context Gamma
	def Context copyProperty(String clazz, String name, String clazzNew) {
		val prop = getProperty(clazz, name)
		if(!prop.identityEquals(null) && clazz != clazzNew) {
			classes.get(clazzNew).add(prop.name, prop.type, prop.low, prop.upper)
		}
		return this
	}
	
	//Returns internal represenation of the property
	def PropertySet$Property getProperty(String clazz, String name) {
		return classes.get(clazz)?.get(name)
	}
	
	/**
	 * Subclasses
	 */
	//Adds child <: parent relationship to the context Gamma
	def Context addSubclass(String child, String parent) {
		subclasses.put(child, parent)
		return this
	}
	
	//Removes child <: parent relationship from the context Gamma
	def Context removeSubclass(String child) {
		subclasses.remove(child)
		return this
	}
	 
}