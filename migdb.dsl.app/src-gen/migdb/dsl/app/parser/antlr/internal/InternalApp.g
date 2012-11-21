/*
* generated by Xtext
*/
grammar InternalApp;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package migdb.dsl.app.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package migdb.dsl.app.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import migdb.dsl.app.services.AppGrammarAccess;

}

@parser::members {

 	private AppGrammarAccess grammarAccess;
 	
    public InternalAppParser(TokenStream input, AppGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "ModelRoot";	
   	}
   	
   	@Override
   	protected AppGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModelRoot
entryRuleModelRoot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRootRule()); }
	 iv_ruleModelRoot=ruleModelRoot 
	 { $current=$iv_ruleModelRoot.current; } 
	 EOF 
;

// Rule ModelRoot
ruleModelRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getModelRootAccess().getStructureParserRuleCall()); 
    }
    this_Structure_0=ruleStructure
    { 
        $current = $this_Structure_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleStructure
entryRuleStructure returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStructureRule()); }
	 iv_ruleStructure=ruleStructure 
	 { $current=$iv_ruleStructure.current; } 
	 EOF 
;

// Rule Structure
ruleStructure returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getStructureAccess().getEntitiesModelEntityParserRuleCall_0()); 
	    }
		lv_entities_0_0=ruleModelEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStructureRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_0_0, 
        		"ModelEntity");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleModelEntity
entryRuleModelEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelEntityRule()); }
	 iv_ruleModelEntity=ruleModelEntity 
	 { $current=$iv_ruleModelEntity.current; } 
	 EOF 
;

// Rule ModelEntity
ruleModelEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getModelEntityAccess().getGeneralClassParserRuleCall_0()); 
    }
    this_GeneralClass_0=ruleGeneralClass
    { 
        $current = $this_GeneralClass_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getModelEntityAccess().getPrimitiveClassParserRuleCall_1()); 
    }
    this_PrimitiveClass_1=rulePrimitiveClass
    { 
        $current = $this_PrimitiveClass_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleGeneralClass
entryRuleGeneralClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGeneralClassRule()); }
	 iv_ruleGeneralClass=ruleGeneralClass 
	 { $current=$iv_ruleGeneralClass.current; } 
	 EOF 
;

// Rule GeneralClass
ruleGeneralClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getGeneralClassAccess().getEmbeddedClassParserRuleCall_0()); 
    }
    this_EmbeddedClass_0=ruleEmbeddedClass
    { 
        $current = $this_EmbeddedClass_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getGeneralClassAccess().getStandardClassParserRuleCall_1()); 
    }
    this_StandardClass_1=ruleStandardClass
    { 
        $current = $this_StandardClass_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePrimitiveClass
entryRulePrimitiveClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitiveClassRule()); }
	 iv_rulePrimitiveClass=rulePrimitiveClass 
	 { $current=$iv_rulePrimitiveClass.current; } 
	 EOF 
;

// Rule PrimitiveClass
rulePrimitiveClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='primitive' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimitiveClassAccess().getPrimitiveKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveClassAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitiveClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimitiveClassAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 
	    }
		lv_primitiveType_3_0=rulePrimitiveType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimitiveClassRule());
	        }
       		set(
       			$current, 
       			"primitiveType",
        		lv_primitiveType_3_0, 
        		"PrimitiveType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEmbeddedClass
entryRuleEmbeddedClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEmbeddedClassRule()); }
	 iv_ruleEmbeddedClass=ruleEmbeddedClass 
	 { $current=$iv_ruleEmbeddedClass.current; } 
	 EOF 
;

// Rule EmbeddedClass
ruleEmbeddedClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='embedded' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEmbeddedClassAccess().getEmbeddedKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEmbeddedClassAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEmbeddedClassAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='id' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEmbeddedClassAccess().getIdKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedClassRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyCrossReference_4_0()); 
	}

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedClassRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_5_0()); 
	}

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedClassRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_6_0()); 
	}

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEmbeddedClassAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleStandardClass
entryRuleStandardClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStandardClassRule()); }
	 iv_ruleStandardClass=ruleStandardClass 
	 { $current=$iv_ruleStandardClass.current; } 
	 EOF 
;

// Rule StandardClass
ruleStandardClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_isAbstract_0_0=	'abstract' 
    {
        newLeafNode(lv_isAbstract_0_0, grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStandardClassRule());
	        }
       		setWithLastConsumed($current, "isAbstract", true, "abstract");
	    }

)
)?	otherlv_1='class' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStandardClassAccess().getClassKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getStandardClassAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStandardClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(	otherlv_3='extends' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStandardClassAccess().getExtendsKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStandardClassRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getStandardClassAccess().getParentStandardClassCrossReference_3_1_0()); 
	}

)
)	otherlv_5='by' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStandardClassAccess().getByKeyword_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_3_3_0()); 
	    }
		lv_inheritanceType_6_0=ruleInheritanceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStandardClassRule());
	        }
       		set(
       			$current, 
       			"inheritanceType",
        		lv_inheritanceType_6_0, 
        		"InheritanceType");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getStandardClassAccess().getLeftCurlyBracketKeyword_4());
    }
(	otherlv_8='id' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getStandardClassAccess().getIdKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getStandardClassRule());
	        }
        }
	otherlv_9=RULE_ID
	{
		newLeafNode(otherlv_9, grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyCrossReference_5_1_0()); 
	}

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_0_0()); 
	    }
		lv_properties_10_0=ruleMultipliableProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStandardClassRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_10_0, 
        		"MultipliableProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_1_0()); 
	    }
		lv_properties_11_0=ruleMultipliableProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStandardClassRule());
	        }
       		add(
       			$current, 
       			"properties",
        		lv_properties_11_0, 
        		"MultipliableProperty");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getStandardClassAccess().getRightCurlyBracketKeyword_7());
    }
)
;







// Entry rule entryRuleMultipliableProperty
entryRuleMultipliableProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultipliablePropertyRule()); }
	 iv_ruleMultipliableProperty=ruleMultipliableProperty 
	 { $current=$iv_ruleMultipliableProperty.current; } 
	 EOF 
;

// Rule MultipliableProperty
ruleMultipliableProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getAssociationPropertyParserRuleCall_0()); 
    }
    this_AssociationProperty_0=ruleAssociationProperty
    { 
        $current = $this_AssociationProperty_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getPrimitivePropertyParserRuleCall_1()); 
    }
    this_PrimitiveProperty_1=rulePrimitiveProperty
    { 
        $current = $this_PrimitiveProperty_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getNestedPropertyParserRuleCall_2()); 
    }
    this_NestedProperty_2=ruleNestedProperty
    { 
        $current = $this_NestedProperty_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEmbeddedProperty
entryRuleEmbeddedProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEmbeddedPropertyRule()); }
	 iv_ruleEmbeddedProperty=ruleEmbeddedProperty 
	 { $current=$iv_ruleEmbeddedProperty.current; } 
	 EOF 
;

// Rule EmbeddedProperty
ruleEmbeddedProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='EmbeddedProperty' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEmbeddedPropertyAccess().getEmbeddedPropertyKeyword_0());
    }
(
(
		lv_isMandatory_1_0=	'mandatory' 
    {
        newLeafNode(lv_isMandatory_1_0, grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
	        }
       		setWithLastConsumed($current, "isMandatory", true, "mandatory");
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEmbeddedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEmbeddedPropertyAccess().getColonKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRulePrimitiveProperty
entryRulePrimitiveProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimitivePropertyRule()); }
	 iv_rulePrimitiveProperty=rulePrimitiveProperty 
	 { $current=$iv_rulePrimitiveProperty.current; } 
	 EOF 
;

// Rule PrimitiveProperty
rulePrimitiveProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='PrimitiveProperty' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertyAccess().getPrimitivePropertyKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(
(
		lv_isOrdered_2_0=	'ordered' 
    {
        newLeafNode(lv_isOrdered_2_0, grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed($current, "isOrdered", true, "ordered");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(
(
		lv_isUnique_3_0=	'unique' 
    {
        newLeafNode(lv_isUnique_3_0, grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed($current, "isUnique", true, "unique");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
	}

)(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getPrimitivePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)((	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPrimitivePropertyAccess().getLeftSquareBracketKeyword_3_0_0());
    }
(
(
		lv_upperBound_6_0=RULE_INT
		{
			newLeafNode(lv_upperBound_6_0, grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"INT");
	    }

)
))
    |(((
(
		lv_lowerBound_7_0=RULE_INT
		{
			newLeafNode(lv_lowerBound_7_0, grammarAccess.getPrimitivePropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_7_0, 
        		"INT");
	    }

)
)	otherlv_8='..' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getPrimitivePropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
    }
(
(
		lv_upperBound_9_0=RULE_INT
		{
			newLeafNode(lv_upperBound_9_0, grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_9_0, 
        		"INT");
	    }

)
))	otherlv_10=']' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getPrimitivePropertyAccess().getRightSquareBracketKeyword_3_1_1());
    }
))?	otherlv_11=':' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getPrimitivePropertyAccess().getColonKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
        }
	otherlv_12=RULE_ID
	{
		newLeafNode(otherlv_12, grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassCrossReference_5_0()); 
	}

)
)(	otherlv_13='=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getPrimitivePropertyAccess().getEqualsSignKeyword_6_0());
    }
(
(
		lv_defaultValue_14_0=RULE_ID
		{
			newLeafNode(lv_defaultValue_14_0, grammarAccess.getPrimitivePropertyAccess().getDefaultValueIDTerminalRuleCall_6_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimitivePropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_14_0, 
        		"ID");
	    }

)
))?)
;





// Entry rule entryRuleAssociationProperty
entryRuleAssociationProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssociationPropertyRule()); }
	 iv_ruleAssociationProperty=ruleAssociationProperty 
	 { $current=$iv_ruleAssociationProperty.current; } 
	 EOF 
;

// Rule AssociationProperty
ruleAssociationProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='AssociationProperty' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAssociationPropertyAccess().getAssociationPropertyKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(
(
		lv_isOrdered_2_0=	'ordered' 
    {
        newLeafNode(lv_isOrdered_2_0, grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed($current, "isOrdered", true, "ordered");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(
(
		lv_isUnique_3_0=	'unique' 
    {
        newLeafNode(lv_isUnique_3_0, grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed($current, "isUnique", true, "unique");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
	}

)(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getAssociationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)((	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAssociationPropertyAccess().getLeftSquareBracketKeyword_3_0_0());
    }
(
(
		lv_upperBound_6_0=RULE_INT
		{
			newLeafNode(lv_upperBound_6_0, grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"INT");
	    }

)
))
    |(((
(
		lv_lowerBound_7_0=RULE_INT
		{
			newLeafNode(lv_lowerBound_7_0, grammarAccess.getAssociationPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_7_0, 
        		"INT");
	    }

)
)	otherlv_8='..' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAssociationPropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
    }
(
(
		lv_upperBound_9_0=RULE_INT
		{
			newLeafNode(lv_upperBound_9_0, grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_9_0, 
        		"INT");
	    }

)
))	otherlv_10=']' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getAssociationPropertyAccess().getRightSquareBracketKeyword_3_1_1());
    }
))?(	otherlv_11='oposite' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getAssociationPropertyAccess().getOpositeKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
        }
	otherlv_12=RULE_ID
	{
		newLeafNode(otherlv_12, grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyCrossReference_4_1_0()); 
	}

)
))?	otherlv_13=':' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getAssociationPropertyAccess().getColonKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssociationPropertyRule());
	        }
        }
	otherlv_14=RULE_ID
	{
		newLeafNode(otherlv_14, grammarAccess.getAssociationPropertyAccess().getTypeStandardClassCrossReference_6_0()); 
	}

)
))
;





// Entry rule entryRuleNestedProperty
entryRuleNestedProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNestedPropertyRule()); }
	 iv_ruleNestedProperty=ruleNestedProperty 
	 { $current=$iv_ruleNestedProperty.current; } 
	 EOF 
;

// Rule NestedProperty
ruleNestedProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='NestedProperty' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNestedPropertyAccess().getNestedPropertyKeyword_0());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0);
	 				}
					({true}?=>(
(
		lv_isOrdered_2_0=	'ordered' 
    {
        newLeafNode(lv_isOrdered_2_0, grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed($current, "isOrdered", true, "ordered");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1);
	 				}
					({true}?=>(
(
		lv_isUnique_3_0=	'unique' 
    {
        newLeafNode(lv_isUnique_3_0, grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed($current, "isUnique", true, "unique");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
	}

)(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getNestedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)((	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getNestedPropertyAccess().getLeftSquareBracketKeyword_3_0_0());
    }
(
(
		lv_upperBound_6_0=RULE_INT
		{
			newLeafNode(lv_upperBound_6_0, grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"INT");
	    }

)
))
    |(((
(
		lv_lowerBound_7_0=RULE_INT
		{
			newLeafNode(lv_lowerBound_7_0, grammarAccess.getNestedPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_7_0, 
        		"INT");
	    }

)
)	otherlv_8='..' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getNestedPropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
    }
(
(
		lv_upperBound_9_0=RULE_INT
		{
			newLeafNode(lv_upperBound_9_0, grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"upperBound",
        		lv_upperBound_9_0, 
        		"INT");
	    }

)
))	otherlv_10=']' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getNestedPropertyAccess().getRightSquareBracketKeyword_3_1_1());
    }
))?	otherlv_11=':' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getNestedPropertyAccess().getColonKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedPropertyRule());
	        }
        }
	otherlv_12=RULE_ID
	{
		newLeafNode(otherlv_12, grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassCrossReference_5_0()); 
	}

)
))
;







// Rule PrimitiveType
rulePrimitiveType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='boolean' 
	{
        $current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='char' 
	{
        $current = grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='int' 
	{
        $current = grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2()); 
    }
));



// Rule InheritanceType
ruleInheritanceType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='joined' 
	{
        $current = grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='tablePerClass' 
	{
        $current = grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='singleTable' 
	{
        $current = grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2()); 
    }
));



RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


