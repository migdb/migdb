package migdb.dsl.ide.tests

import migdb.dsl.ops.OpsInjectorProvider
import mm.app.AppPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(OpsInjectorProvider))
class UnitTest extends XtextTest {

	@Before
	def init() {
		AppPackage::eINSTANCE.eClass(); //http://www.levysiqueira.com.br/2013/07/junit-error-xtext/
		suppressSerialization();
	}
	
	@Test
	def addParent1() {
		testFile("addParent1.ops");
		assertConstraints(inLine(9, "Cycle in class hierarchy of Fruit"));
	}
	
	@Test
	def addParent2() {
		testFile("addParent2.ops");
		assertConstraints(inLine(11, "Some properties of class hierarchy Banana exist in Food or vice-versa"));
	}
	
	@Test
	def addProperty1() {
		testFile("addProperty1.ops");
		assertConstraints(inLine(8, "Property test already exists in class hierarchy of Food"));
	}
	
	@Test
	def void extractClass1() {
		testFile("extractClass1.ops");
		assertConstraints(inLine(10, "Property margo already exists in class hierarchy of Fruit"));
	}
	
	@Test
	def extractSub1() {
		testFile("extractSub1.ops");
		assertConstraints(inLine(9, "Property test2 does not exist in class Fruit"));
	}
	
	@Test
	def extractSub2() {
		testFile("extractSub2.ops");
		assertConstraints(inLine(11, "Property test already exists in class hierarchy of Food"));
	}
	
	@Test
	def extractSuper1() {
		testFile("extractSuper1.ops");
		assertConstraints(inLine(8, "Class Banan already exists"));
	}
	
	@Test
	def extractSuper2() {
		testFile("extractSuper2.ops");
		assertConstraints(inLine(6, "Property koko2 does not exist in class Fruit"));
	}
	
	@Test
	def extractSuper3() {
		testFile("extractSuper3.ops");
		assertConstraints(inLine(6, "Class Fruit already exists"));
	}
	
	@Test
	def extractSuper4() {
		testFile("extractSuper4.ops");
		assertConstraints(inLine(9, "Class Banana already has parent class"));
	}
	
	@Test
	def moveProperty1() {
		testFile("moveProperty1.ops");
		assertConstraints(inLine(9, "Class Ghost does not exist"));
	}
	
	@Test
	def moveProperty2() {
		testFile("moveProperty2.ops");
		assertConstraints(inLine(8, "Property leaf2 does not exist in class Fruit"));
	}
	
	@Test
	def moveProperty3() {
		testFile("moveProperty3.ops");
		assertConstraints(inLine(8, "Property leaf in class Fruit has invalid bounds - excepted [1..1]"));
	}
	
	@Test
	def moveProperty4() {
		testFile("moveProperty4.ops");
		assertConstraints(inLine(8, "Property koko has primitive type, expected class"));
	}
	
	@Test
	def pushDown1() {
		testFile("pushDown1.ops");
		assertConstraints(inLine(11, "Property koko does not exist in class Fruit"));
	}
	
	@Test
	def pushDown2() {
		testFile("pushDown2.ops");
		assertConstraints(inLine(5, "Class Food has no subclasses"));
	}
	
	@Test
	def renameProperty1() {
		testFile("renameProperty1.ops");
		assertConstraints(inLine(9, "Property test already exists in class hierarchy of Fruit"));
	}
	
	@Test
	def renameProperty2() {
		testFile("renameProperty2.ops");
		assertConstraints(inLine(9, "Property koko already exists in class hierarchy of Food"));
	}
	
	def inLine(int line, String text) {
		issues.inLine(line).theOneAndOnlyContains(text);
	}
}