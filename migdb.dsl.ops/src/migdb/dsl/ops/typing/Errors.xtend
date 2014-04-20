package migdb.dsl.ops.typing

class Errors {
	
	def static reservedKey(String name)
		'''«name» is reserved keyword'''
		
	def static classExists(String name)
		'''Class «name» already exists'''
	
	def static classNotExists(String name)
		'''Class «name» does not exist'''
	
	def static classHasProperties(String name)
		'''Class «name» has properties'''
	
	def static classHasSubclasses(String name)
		'''Class «name» has subclasses'''
		
	def static classHasNoSubclasses(String name)
		'''Class «name» has no subclasses'''
		
	def static classHasParent(String name)
		'''Class «name» already has parent class'''
		
	def static classHasNoParent(String name)
		'''Class «name» has no parent class'''
	
	def static classTypeExists(String name)
		'''Class «name» is used as property type'''
		
	def static classCycle(String name)
		'''Cycle in class hierarchy of «name»'''
	
	def static typeDontExists(String name)
		'''Type «name» does not exist'''
	
	def static boundsInvalid(int lower, int upper)
		'''Invalid bounds - lower: «lower», upper: «upper»'''
	
	def static boundsInvalid(String clazz, String name, int lower, int upper)
		'''Property «name» in class «clazz» has invalid bounds - excepted [«lower»..«upper»]'''
	
	def static propertyExists(String clazz, String name)
		'''Property «name» already exists in class hierarchy of «clazz»'''
	
	def static propertyNotExists(String clazz, String name)
		'''Property «name» does not exist in class «clazz»'''
		
	def static propertyTypeInvalid(String clazz, String name)
		'''Property «name» has primitive type, expected class'''
	
	def static propertyNotEqual(String clazz, String name)
		'''Property «name» in class «clazz» has different type/bounds'''
	
	def static propertyNotDisjoint(String clazz, String parent)
		'''Some properties of class hierarchy «parent» exist in «clazz» or vice-versa'''
}