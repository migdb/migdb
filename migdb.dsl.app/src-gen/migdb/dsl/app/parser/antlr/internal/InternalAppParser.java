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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitive'", "':'", "'embedded'", "'{'", "'id'", "'}'", "'abstract'", "'class'", "'extends'", "'by'", "'EmbeddedProperty'", "'mandatory'", "'PrimitiveProperty'", "'ordered'", "'unique'", "'['", "'..'", "']'", "'='", "'AssociationProperty'", "'oposite'", "'NestedProperty'", "'boolean'", "'char'", "'int'", "'joined'", "'tablePerClass'", "'singleTable'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAppParser.tokenNames; }
    public String getGrammarFileName() { return "../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g"; }



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



    // $ANTLR start "entryRuleModelRoot"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:68:1: entryRuleModelRoot returns [EObject current=null] : iv_ruleModelRoot= ruleModelRoot EOF ;
    public final EObject entryRuleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRoot = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:69:2: (iv_ruleModelRoot= ruleModelRoot EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:70:2: iv_ruleModelRoot= ruleModelRoot EOF
            {
             newCompositeNode(grammarAccess.getModelRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelRoot_in_entryRuleModelRoot75);
            iv_ruleModelRoot=ruleModelRoot();

            state._fsp--;

             current =iv_ruleModelRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRoot"


    // $ANTLR start "ruleModelRoot"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:77:1: ruleModelRoot returns [EObject current=null] : this_Structure_0= ruleStructure ;
    public final EObject ruleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Structure_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:80:28: (this_Structure_0= ruleStructure )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:82:5: this_Structure_0= ruleStructure
            {
             
                    newCompositeNode(grammarAccess.getModelRootAccess().getStructureParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_ruleModelRoot131);
            this_Structure_0=ruleStructure();

            state._fsp--;

             
                    current = this_Structure_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelRoot"


    // $ANTLR start "entryRuleStructure"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:98:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:99:2: (iv_ruleStructure= ruleStructure EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:100:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_entryRuleStructure165);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructure175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:107:1: ruleStructure returns [EObject current=null] : ( (lv_entities_0_0= ruleModelEntity ) )* ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:110:28: ( ( (lv_entities_0_0= ruleModelEntity ) )* )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:111:1: ( (lv_entities_0_0= ruleModelEntity ) )*
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:111:1: ( (lv_entities_0_0= ruleModelEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:112:1: (lv_entities_0_0= ruleModelEntity )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:112:1: (lv_entities_0_0= ruleModelEntity )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:113:3: lv_entities_0_0= ruleModelEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureAccess().getEntitiesModelEntityParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleModelEntity_in_ruleStructure220);
            	    lv_entities_0_0=ruleModelEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_0_0, 
            	            		"ModelEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleModelEntity"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:137:1: entryRuleModelEntity returns [EObject current=null] : iv_ruleModelEntity= ruleModelEntity EOF ;
    public final EObject entryRuleModelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelEntity = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:138:2: (iv_ruleModelEntity= ruleModelEntity EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:139:2: iv_ruleModelEntity= ruleModelEntity EOF
            {
             newCompositeNode(grammarAccess.getModelEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelEntity_in_entryRuleModelEntity256);
            iv_ruleModelEntity=ruleModelEntity();

            state._fsp--;

             current =iv_ruleModelEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelEntity266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelEntity"


    // $ANTLR start "ruleModelEntity"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:146:1: ruleModelEntity returns [EObject current=null] : (this_GeneralClass_0= ruleGeneralClass | this_PrimitiveClass_1= rulePrimitiveClass ) ;
    public final EObject ruleModelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralClass_0 = null;

        EObject this_PrimitiveClass_1 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:149:28: ( (this_GeneralClass_0= ruleGeneralClass | this_PrimitiveClass_1= rulePrimitiveClass ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:150:1: (this_GeneralClass_0= ruleGeneralClass | this_PrimitiveClass_1= rulePrimitiveClass )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:150:1: (this_GeneralClass_0= ruleGeneralClass | this_PrimitiveClass_1= rulePrimitiveClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||(LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:151:5: this_GeneralClass_0= ruleGeneralClass
                    {
                     
                            newCompositeNode(grammarAccess.getModelEntityAccess().getGeneralClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralClass_in_ruleModelEntity313);
                    this_GeneralClass_0=ruleGeneralClass();

                    state._fsp--;

                     
                            current = this_GeneralClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:161:5: this_PrimitiveClass_1= rulePrimitiveClass
                    {
                     
                            newCompositeNode(grammarAccess.getModelEntityAccess().getPrimitiveClassParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveClass_in_ruleModelEntity340);
                    this_PrimitiveClass_1=rulePrimitiveClass();

                    state._fsp--;

                     
                            current = this_PrimitiveClass_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelEntity"


    // $ANTLR start "entryRuleGeneralClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:177:1: entryRuleGeneralClass returns [EObject current=null] : iv_ruleGeneralClass= ruleGeneralClass EOF ;
    public final EObject entryRuleGeneralClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralClass = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:178:2: (iv_ruleGeneralClass= ruleGeneralClass EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:179:2: iv_ruleGeneralClass= ruleGeneralClass EOF
            {
             newCompositeNode(grammarAccess.getGeneralClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralClass_in_entryRuleGeneralClass375);
            iv_ruleGeneralClass=ruleGeneralClass();

            state._fsp--;

             current =iv_ruleGeneralClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralClass385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralClass"


    // $ANTLR start "ruleGeneralClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:186:1: ruleGeneralClass returns [EObject current=null] : (this_EmbeddedClass_0= ruleEmbeddedClass | this_StandardClass_1= ruleStandardClass ) ;
    public final EObject ruleGeneralClass() throws RecognitionException {
        EObject current = null;

        EObject this_EmbeddedClass_0 = null;

        EObject this_StandardClass_1 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:189:28: ( (this_EmbeddedClass_0= ruleEmbeddedClass | this_StandardClass_1= ruleStandardClass ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:190:1: (this_EmbeddedClass_0= ruleEmbeddedClass | this_StandardClass_1= ruleStandardClass )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:190:1: (this_EmbeddedClass_0= ruleEmbeddedClass | this_StandardClass_1= ruleStandardClass )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:191:5: this_EmbeddedClass_0= ruleEmbeddedClass
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralClassAccess().getEmbeddedClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEmbeddedClass_in_ruleGeneralClass432);
                    this_EmbeddedClass_0=ruleEmbeddedClass();

                    state._fsp--;

                     
                            current = this_EmbeddedClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:201:5: this_StandardClass_1= ruleStandardClass
                    {
                     
                            newCompositeNode(grammarAccess.getGeneralClassAccess().getStandardClassParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStandardClass_in_ruleGeneralClass459);
                    this_StandardClass_1=ruleStandardClass();

                    state._fsp--;

                     
                            current = this_StandardClass_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralClass"


    // $ANTLR start "entryRulePrimitiveClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:217:1: entryRulePrimitiveClass returns [EObject current=null] : iv_rulePrimitiveClass= rulePrimitiveClass EOF ;
    public final EObject entryRulePrimitiveClass() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveClass = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:218:2: (iv_rulePrimitiveClass= rulePrimitiveClass EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:219:2: iv_rulePrimitiveClass= rulePrimitiveClass EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveClassRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveClass_in_entryRulePrimitiveClass494);
            iv_rulePrimitiveClass=rulePrimitiveClass();

            state._fsp--;

             current =iv_rulePrimitiveClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveClass504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveClass"


    // $ANTLR start "rulePrimitiveClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:226:1: rulePrimitiveClass returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) ) ;
    public final EObject rulePrimitiveClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_primitiveType_3_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:229:28: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:230:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:230:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:230:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_primitiveType_3_0= rulePrimitiveType ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePrimitiveClass541); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveClassAccess().getPrimitiveKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:235:1: (lv_name_1_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveClass558); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePrimitiveClass575); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveClassAccess().getColonKeyword_2());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:256:1: ( (lv_primitiveType_3_0= rulePrimitiveType ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:257:1: (lv_primitiveType_3_0= rulePrimitiveType )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:257:1: (lv_primitiveType_3_0= rulePrimitiveType )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:258:3: lv_primitiveType_3_0= rulePrimitiveType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_rulePrimitiveClass596);
            lv_primitiveType_3_0=rulePrimitiveType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveClassRule());
            	        }
                   		set(
                   			current, 
                   			"primitiveType",
                    		lv_primitiveType_3_0, 
                    		"PrimitiveType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveClass"


    // $ANTLR start "entryRuleEmbeddedClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:282:1: entryRuleEmbeddedClass returns [EObject current=null] : iv_ruleEmbeddedClass= ruleEmbeddedClass EOF ;
    public final EObject entryRuleEmbeddedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedClass = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:283:2: (iv_ruleEmbeddedClass= ruleEmbeddedClass EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:284:2: iv_ruleEmbeddedClass= ruleEmbeddedClass EOF
            {
             newCompositeNode(grammarAccess.getEmbeddedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmbeddedClass_in_entryRuleEmbeddedClass632);
            iv_ruleEmbeddedClass=ruleEmbeddedClass();

            state._fsp--;

             current =iv_ruleEmbeddedClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmbeddedClass642); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbeddedClass"


    // $ANTLR start "ruleEmbeddedClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:291:1: ruleEmbeddedClass returns [EObject current=null] : (otherlv_0= 'embedded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleEmbeddedClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:294:28: ( (otherlv_0= 'embedded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:295:1: (otherlv_0= 'embedded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:295:1: (otherlv_0= 'embedded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:295:3: otherlv_0= 'embedded' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEmbeddedClass679); 

                	newLeafNode(otherlv_0, grammarAccess.getEmbeddedClassAccess().getEmbeddedKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:300:1: (lv_name_1_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:300:1: (lv_name_1_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedClass696); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEmbeddedClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEmbeddedClass713); 

                	newLeafNode(otherlv_2, grammarAccess.getEmbeddedClassAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEmbeddedClass725); 

                	newLeafNode(otherlv_3, grammarAccess.getEmbeddedClassAccess().getIdKeyword_3());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:325:1: ( (otherlv_4= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:326:1: (otherlv_4= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:326:1: (otherlv_4= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:327:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedClassRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedClass745); 

            		newLeafNode(otherlv_4, grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyCrossReference_4_0()); 
            	

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:338:2: ( (otherlv_5= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:339:1: (otherlv_5= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:339:1: (otherlv_5= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:340:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedClassRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedClass765); 

            		newLeafNode(otherlv_5, grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_5_0()); 
            	

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:351:2: ( (otherlv_6= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:352:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:352:1: (otherlv_6= RULE_ID )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:353:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEmbeddedClassRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedClass785); 

            	    		newLeafNode(otherlv_6, grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_6_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEmbeddedClass798); 

                	newLeafNode(otherlv_7, grammarAccess.getEmbeddedClassAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmbeddedClass"


    // $ANTLR start "entryRuleStandardClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:376:1: entryRuleStandardClass returns [EObject current=null] : iv_ruleStandardClass= ruleStandardClass EOF ;
    public final EObject entryRuleStandardClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardClass = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:377:2: (iv_ruleStandardClass= ruleStandardClass EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:378:2: iv_ruleStandardClass= ruleStandardClass EOF
            {
             newCompositeNode(grammarAccess.getStandardClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStandardClass_in_entryRuleStandardClass834);
            iv_ruleStandardClass=ruleStandardClass();

            state._fsp--;

             current =iv_ruleStandardClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStandardClass844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardClass"


    // $ANTLR start "ruleStandardClass"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:385:1: ruleStandardClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )? otherlv_7= '{' (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )? ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleStandardClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_inheritanceType_6_0 = null;

        EObject lv_properties_10_0 = null;

        EObject lv_properties_11_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:388:28: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )? otherlv_7= '{' (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )? ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )? otherlv_12= '}' ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:389:1: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )? otherlv_7= '{' (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )? ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )? otherlv_12= '}' )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:389:1: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )? otherlv_7= '{' (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )? ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )? otherlv_12= '}' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:389:2: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )? otherlv_7= '{' (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )? ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )? otherlv_12= '}'
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:389:2: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:390:1: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:390:1: (lv_isAbstract_0_0= 'abstract' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:391:3: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStandardClass887); 

                            newLeafNode(lv_isAbstract_0_0, grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStandardClassRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStandardClass913); 

                	newLeafNode(otherlv_1, grammarAccess.getStandardClassAccess().getClassKeyword_1());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:408:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:409:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:409:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:410:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStandardClass930); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStandardClassAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStandardClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:426:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:426:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'by' ( (lv_inheritanceType_6_0= ruleInheritanceType ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStandardClass948); 

                        	newLeafNode(otherlv_3, grammarAccess.getStandardClassAccess().getExtendsKeyword_3_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:430:1: ( (otherlv_4= RULE_ID ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:431:1: (otherlv_4= RULE_ID )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:431:1: (otherlv_4= RULE_ID )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:432:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStandardClassRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStandardClass968); 

                    		newLeafNode(otherlv_4, grammarAccess.getStandardClassAccess().getParentStandardClassCrossReference_3_1_0()); 
                    	

                    }


                    }

                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStandardClass980); 

                        	newLeafNode(otherlv_5, grammarAccess.getStandardClassAccess().getByKeyword_3_2());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:447:1: ( (lv_inheritanceType_6_0= ruleInheritanceType ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:448:1: (lv_inheritanceType_6_0= ruleInheritanceType )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:448:1: (lv_inheritanceType_6_0= ruleInheritanceType )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:449:3: lv_inheritanceType_6_0= ruleInheritanceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInheritanceType_in_ruleStandardClass1001);
                    lv_inheritanceType_6_0=ruleInheritanceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStandardClassRule());
                    	        }
                           		set(
                           			current, 
                           			"inheritanceType",
                            		lv_inheritanceType_6_0, 
                            		"InheritanceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStandardClass1015); 

                	newLeafNode(otherlv_7, grammarAccess.getStandardClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:469:1: (otherlv_8= 'id' ( (otherlv_9= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:469:3: otherlv_8= 'id' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStandardClass1028); 

                        	newLeafNode(otherlv_8, grammarAccess.getStandardClassAccess().getIdKeyword_5_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:473:1: ( (otherlv_9= RULE_ID ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:474:1: (otherlv_9= RULE_ID )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:474:1: (otherlv_9= RULE_ID )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:475:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStandardClassRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStandardClass1048); 

                    		newLeafNode(otherlv_9, grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:486:4: ( ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23||LA9_0==30||LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:486:5: ( (lv_properties_10_0= ruleMultipliableProperty ) ) ( (lv_properties_11_0= ruleMultipliableProperty ) )*
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:486:5: ( (lv_properties_10_0= ruleMultipliableProperty ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:487:1: (lv_properties_10_0= ruleMultipliableProperty )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:487:1: (lv_properties_10_0= ruleMultipliableProperty )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:488:3: lv_properties_10_0= ruleMultipliableProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_ruleStandardClass1072);
                    lv_properties_10_0=ruleMultipliableProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStandardClassRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_10_0, 
                            		"MultipliableProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:504:2: ( (lv_properties_11_0= ruleMultipliableProperty ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23||LA8_0==30||LA8_0==32) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:505:1: (lv_properties_11_0= ruleMultipliableProperty )
                    	    {
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:505:1: (lv_properties_11_0= ruleMultipliableProperty )
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:506:3: lv_properties_11_0= ruleMultipliableProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_ruleStandardClass1093);
                    	    lv_properties_11_0=ruleMultipliableProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStandardClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_11_0, 
                    	            		"MultipliableProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStandardClass1108); 

                	newLeafNode(otherlv_12, grammarAccess.getStandardClassAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardClass"


    // $ANTLR start "entryRuleMultipliableProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:536:1: entryRuleMultipliableProperty returns [EObject current=null] : iv_ruleMultipliableProperty= ruleMultipliableProperty EOF ;
    public final EObject entryRuleMultipliableProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipliableProperty = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:537:2: (iv_ruleMultipliableProperty= ruleMultipliableProperty EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:538:2: iv_ruleMultipliableProperty= ruleMultipliableProperty EOF
            {
             newCompositeNode(grammarAccess.getMultipliablePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_entryRuleMultipliableProperty1146);
            iv_ruleMultipliableProperty=ruleMultipliableProperty();

            state._fsp--;

             current =iv_ruleMultipliableProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipliableProperty1156); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipliableProperty"


    // $ANTLR start "ruleMultipliableProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:545:1: ruleMultipliableProperty returns [EObject current=null] : (this_AssociationProperty_0= ruleAssociationProperty | this_PrimitiveProperty_1= rulePrimitiveProperty | this_NestedProperty_2= ruleNestedProperty ) ;
    public final EObject ruleMultipliableProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationProperty_0 = null;

        EObject this_PrimitiveProperty_1 = null;

        EObject this_NestedProperty_2 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:548:28: ( (this_AssociationProperty_0= ruleAssociationProperty | this_PrimitiveProperty_1= rulePrimitiveProperty | this_NestedProperty_2= ruleNestedProperty ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:549:1: (this_AssociationProperty_0= ruleAssociationProperty | this_PrimitiveProperty_1= rulePrimitiveProperty | this_NestedProperty_2= ruleNestedProperty )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:549:1: (this_AssociationProperty_0= ruleAssociationProperty | this_PrimitiveProperty_1= rulePrimitiveProperty | this_NestedProperty_2= ruleNestedProperty )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:550:5: this_AssociationProperty_0= ruleAssociationProperty
                    {
                     
                            newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getAssociationPropertyParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssociationProperty_in_ruleMultipliableProperty1203);
                    this_AssociationProperty_0=ruleAssociationProperty();

                    state._fsp--;

                     
                            current = this_AssociationProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:560:5: this_PrimitiveProperty_1= rulePrimitiveProperty
                    {
                     
                            newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getPrimitivePropertyParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveProperty_in_ruleMultipliableProperty1230);
                    this_PrimitiveProperty_1=rulePrimitiveProperty();

                    state._fsp--;

                     
                            current = this_PrimitiveProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:570:5: this_NestedProperty_2= ruleNestedProperty
                    {
                     
                            newCompositeNode(grammarAccess.getMultipliablePropertyAccess().getNestedPropertyParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNestedProperty_in_ruleMultipliableProperty1257);
                    this_NestedProperty_2=ruleNestedProperty();

                    state._fsp--;

                     
                            current = this_NestedProperty_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipliableProperty"


    // $ANTLR start "entryRuleEmbeddedProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:586:1: entryRuleEmbeddedProperty returns [EObject current=null] : iv_ruleEmbeddedProperty= ruleEmbeddedProperty EOF ;
    public final EObject entryRuleEmbeddedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedProperty = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:587:2: (iv_ruleEmbeddedProperty= ruleEmbeddedProperty EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:588:2: iv_ruleEmbeddedProperty= ruleEmbeddedProperty EOF
            {
             newCompositeNode(grammarAccess.getEmbeddedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmbeddedProperty_in_entryRuleEmbeddedProperty1292);
            iv_ruleEmbeddedProperty=ruleEmbeddedProperty();

            state._fsp--;

             current =iv_ruleEmbeddedProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmbeddedProperty1302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbeddedProperty"


    // $ANTLR start "ruleEmbeddedProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:595:1: ruleEmbeddedProperty returns [EObject current=null] : (otherlv_0= 'EmbeddedProperty' ( (lv_isMandatory_1_0= 'mandatory' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleEmbeddedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:598:28: ( (otherlv_0= 'EmbeddedProperty' ( (lv_isMandatory_1_0= 'mandatory' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:599:1: (otherlv_0= 'EmbeddedProperty' ( (lv_isMandatory_1_0= 'mandatory' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:599:1: (otherlv_0= 'EmbeddedProperty' ( (lv_isMandatory_1_0= 'mandatory' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:599:3: otherlv_0= 'EmbeddedProperty' ( (lv_isMandatory_1_0= 'mandatory' ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEmbeddedProperty1339); 

                	newLeafNode(otherlv_0, grammarAccess.getEmbeddedPropertyAccess().getEmbeddedPropertyKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:603:1: ( (lv_isMandatory_1_0= 'mandatory' ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:604:1: (lv_isMandatory_1_0= 'mandatory' )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:604:1: (lv_isMandatory_1_0= 'mandatory' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:605:3: lv_isMandatory_1_0= 'mandatory'
            {
            lv_isMandatory_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEmbeddedProperty1357); 

                    newLeafNode(lv_isMandatory_1_0, grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
            	        }
                   		setWithLastConsumed(current, "isMandatory", true, "mandatory");
            	    

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:618:2: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:619:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:619:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:620:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedProperty1387); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEmbeddedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEmbeddedProperty1404); 

                	newLeafNode(otherlv_3, grammarAccess.getEmbeddedPropertyAccess().getColonKeyword_3());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:640:1: ( (otherlv_4= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:641:1: (otherlv_4= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:641:1: (otherlv_4= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:642:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEmbeddedPropertyRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmbeddedProperty1424); 

            		newLeafNode(otherlv_4, grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmbeddedProperty"


    // $ANTLR start "entryRulePrimitiveProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:661:1: entryRulePrimitiveProperty returns [EObject current=null] : iv_rulePrimitiveProperty= rulePrimitiveProperty EOF ;
    public final EObject entryRulePrimitiveProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveProperty = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:662:2: (iv_rulePrimitiveProperty= rulePrimitiveProperty EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:663:2: iv_rulePrimitiveProperty= rulePrimitiveProperty EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveProperty_in_entryRulePrimitiveProperty1460);
            iv_rulePrimitiveProperty=rulePrimitiveProperty();

            state._fsp--;

             current =iv_rulePrimitiveProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveProperty1470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveProperty"


    // $ANTLR start "rulePrimitiveProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:670:1: rulePrimitiveProperty returns [EObject current=null] : (otherlv_0= 'PrimitiveProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )? ) ;
    public final EObject rulePrimitiveProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOrdered_2_0=null;
        Token lv_isUnique_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_upperBound_6_0=null;
        Token lv_lowerBound_7_0=null;
        Token otherlv_8=null;
        Token lv_upperBound_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_defaultValue_14_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:673:28: ( (otherlv_0= 'PrimitiveProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )? ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:674:1: (otherlv_0= 'PrimitiveProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )? )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:674:1: (otherlv_0= 'PrimitiveProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )? )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:674:3: otherlv_0= 'PrimitiveProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitiveProperty1507); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertyAccess().getPrimitivePropertyKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:678:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:680:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:680:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:681:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:684:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:685:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:685:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:687:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:687:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:688:5: {...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePrimitiveProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:688:114: ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:689:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:692:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:692:7: {...}? => ( (lv_isOrdered_2_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrimitiveProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:692:16: ( (lv_isOrdered_2_0= 'ordered' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:693:1: (lv_isOrdered_2_0= 'ordered' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:693:1: (lv_isOrdered_2_0= 'ordered' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:694:3: lv_isOrdered_2_0= 'ordered'
            	    {
            	    lv_isOrdered_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitiveProperty1570); 

            	            newLeafNode(lv_isOrdered_2_0, grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:714:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:714:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:715:5: {...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePrimitiveProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:715:114: ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:716:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:719:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:719:7: {...}? => ( (lv_isUnique_3_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrimitiveProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:719:16: ( (lv_isUnique_3_0= 'unique' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:720:1: (lv_isUnique_3_0= 'unique' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:720:1: (lv_isUnique_3_0= 'unique' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:721:3: lv_isUnique_3_0= 'unique'
            	    {
            	    lv_isUnique_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitiveProperty1655); 

            	            newLeafNode(lv_isUnique_3_0, grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isUnique", true, "unique");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	

            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:748:2: ( (lv_name_4_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:749:1: (lv_name_4_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:749:1: (lv_name_4_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:750:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveProperty1725); 

            			newLeafNode(lv_name_4_0, grammarAccess.getPrimitivePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:766:2: ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:766:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:766:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:766:5: otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePrimitiveProperty1744); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimitivePropertyAccess().getLeftSquareBracketKeyword_3_0_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:770:1: ( (lv_upperBound_6_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:771:1: (lv_upperBound_6_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:771:1: (lv_upperBound_6_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:772:3: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePrimitiveProperty1761); 

                    			newLeafNode(lv_upperBound_6_0, grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']'
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:8: ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:789:8: ( (lv_lowerBound_7_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:790:1: (lv_lowerBound_7_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:790:1: (lv_lowerBound_7_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:791:3: lv_lowerBound_7_0= RULE_INT
                    {
                    lv_lowerBound_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePrimitiveProperty1792); 

                    			newLeafNode(lv_lowerBound_7_0, grammarAccess.getPrimitivePropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePrimitiveProperty1809); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimitivePropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:811:1: ( (lv_upperBound_9_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:812:1: (lv_upperBound_9_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:812:1: (lv_upperBound_9_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:813:3: lv_upperBound_9_0= RULE_INT
                    {
                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulePrimitiveProperty1826); 

                    			newLeafNode(lv_upperBound_9_0, grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePrimitiveProperty1844); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimitivePropertyAccess().getRightSquareBracketKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePrimitiveProperty1859); 

                	newLeafNode(otherlv_11, grammarAccess.getPrimitivePropertyAccess().getColonKeyword_4());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:837:1: ( (otherlv_12= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:838:1: (otherlv_12= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:838:1: (otherlv_12= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:839:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveProperty1879); 

            		newLeafNode(otherlv_12, grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassCrossReference_5_0()); 
            	

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:850:2: (otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:850:4: otherlv_13= '=' ( (lv_defaultValue_14_0= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulePrimitiveProperty1892); 

                        	newLeafNode(otherlv_13, grammarAccess.getPrimitivePropertyAccess().getEqualsSignKeyword_6_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:854:1: ( (lv_defaultValue_14_0= RULE_ID ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:855:1: (lv_defaultValue_14_0= RULE_ID )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:855:1: (lv_defaultValue_14_0= RULE_ID )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:856:3: lv_defaultValue_14_0= RULE_ID
                    {
                    lv_defaultValue_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveProperty1909); 

                    			newLeafNode(lv_defaultValue_14_0, grammarAccess.getPrimitivePropertyAccess().getDefaultValueIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitivePropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_14_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveProperty"


    // $ANTLR start "entryRuleAssociationProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:880:1: entryRuleAssociationProperty returns [EObject current=null] : iv_ruleAssociationProperty= ruleAssociationProperty EOF ;
    public final EObject entryRuleAssociationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationProperty = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:881:2: (iv_ruleAssociationProperty= ruleAssociationProperty EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:882:2: iv_ruleAssociationProperty= ruleAssociationProperty EOF
            {
             newCompositeNode(grammarAccess.getAssociationPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociationProperty_in_entryRuleAssociationProperty1952);
            iv_ruleAssociationProperty=ruleAssociationProperty();

            state._fsp--;

             current =iv_ruleAssociationProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociationProperty1962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationProperty"


    // $ANTLR start "ruleAssociationProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:889:1: ruleAssociationProperty returns [EObject current=null] : (otherlv_0= 'AssociationProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ;
    public final EObject ruleAssociationProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOrdered_2_0=null;
        Token lv_isUnique_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_upperBound_6_0=null;
        Token lv_lowerBound_7_0=null;
        Token otherlv_8=null;
        Token lv_upperBound_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:892:28: ( (otherlv_0= 'AssociationProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:893:1: (otherlv_0= 'AssociationProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:893:1: (otherlv_0= 'AssociationProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:893:3: otherlv_0= 'AssociationProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAssociationProperty1999); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationPropertyAccess().getAssociationPropertyKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:897:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:899:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:899:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:900:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:903:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:904:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:904:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:906:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:906:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:907:5: {...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:907:116: ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:908:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:911:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:911:7: {...}? => ( (lv_isOrdered_2_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:911:16: ( (lv_isOrdered_2_0= 'ordered' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:912:1: (lv_isOrdered_2_0= 'ordered' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:912:1: (lv_isOrdered_2_0= 'ordered' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:913:3: lv_isOrdered_2_0= 'ordered'
            	    {
            	    lv_isOrdered_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAssociationProperty2062); 

            	            newLeafNode(lv_isOrdered_2_0, grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:933:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:933:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:934:5: {...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:934:116: ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:935:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:938:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:938:7: {...}? => ( (lv_isUnique_3_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:938:16: ( (lv_isUnique_3_0= 'unique' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:939:1: (lv_isUnique_3_0= 'unique' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:939:1: (lv_isUnique_3_0= 'unique' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:940:3: lv_isUnique_3_0= 'unique'
            	    {
            	    lv_isUnique_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAssociationProperty2147); 

            	            newLeafNode(lv_isUnique_3_0, grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isUnique", true, "unique");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	

            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:967:2: ( (lv_name_4_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:968:1: (lv_name_4_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:968:1: (lv_name_4_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:969:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociationProperty2217); 

            			newLeafNode(lv_name_4_0, grammarAccess.getAssociationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:985:2: ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:985:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:985:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:985:5: otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssociationProperty2236); 

                        	newLeafNode(otherlv_5, grammarAccess.getAssociationPropertyAccess().getLeftSquareBracketKeyword_3_0_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:989:1: ( (lv_upperBound_6_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:990:1: (lv_upperBound_6_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:990:1: (lv_upperBound_6_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:991:3: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAssociationProperty2253); 

                    			newLeafNode(lv_upperBound_6_0, grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']'
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:8: ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1008:8: ( (lv_lowerBound_7_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1009:1: (lv_lowerBound_7_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1009:1: (lv_lowerBound_7_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1010:3: lv_lowerBound_7_0= RULE_INT
                    {
                    lv_lowerBound_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAssociationProperty2284); 

                    			newLeafNode(lv_lowerBound_7_0, grammarAccess.getAssociationPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssociationProperty2301); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssociationPropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1030:1: ( (lv_upperBound_9_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1031:1: (lv_upperBound_9_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1031:1: (lv_upperBound_9_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1032:3: lv_upperBound_9_0= RULE_INT
                    {
                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAssociationProperty2318); 

                    			newLeafNode(lv_upperBound_9_0, grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAssociationProperty2336); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssociationPropertyAccess().getRightSquareBracketKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1052:4: (otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1052:6: otherlv_11= 'oposite' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAssociationProperty2352); 

                        	newLeafNode(otherlv_11, grammarAccess.getAssociationPropertyAccess().getOpositeKeyword_4_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1056:1: ( (otherlv_12= RULE_ID ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1057:1: (otherlv_12= RULE_ID )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1057:1: (otherlv_12= RULE_ID )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1058:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociationProperty2372); 

                    		newLeafNode(otherlv_12, grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAssociationProperty2386); 

                	newLeafNode(otherlv_13, grammarAccess.getAssociationPropertyAccess().getColonKeyword_5());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1073:1: ( (otherlv_14= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1074:1: (otherlv_14= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1074:1: (otherlv_14= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1075:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationPropertyRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociationProperty2406); 

            		newLeafNode(otherlv_14, grammarAccess.getAssociationPropertyAccess().getTypeStandardClassCrossReference_6_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationProperty"


    // $ANTLR start "entryRuleNestedProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1094:1: entryRuleNestedProperty returns [EObject current=null] : iv_ruleNestedProperty= ruleNestedProperty EOF ;
    public final EObject entryRuleNestedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedProperty = null;


        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1095:2: (iv_ruleNestedProperty= ruleNestedProperty EOF )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1096:2: iv_ruleNestedProperty= ruleNestedProperty EOF
            {
             newCompositeNode(grammarAccess.getNestedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNestedProperty_in_entryRuleNestedProperty2442);
            iv_ruleNestedProperty=ruleNestedProperty();

            state._fsp--;

             current =iv_ruleNestedProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedProperty2452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedProperty"


    // $ANTLR start "ruleNestedProperty"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1103:1: ruleNestedProperty returns [EObject current=null] : (otherlv_0= 'NestedProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ) ;
    public final EObject ruleNestedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOrdered_2_0=null;
        Token lv_isUnique_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_upperBound_6_0=null;
        Token lv_lowerBound_7_0=null;
        Token otherlv_8=null;
        Token lv_upperBound_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1106:28: ( (otherlv_0= 'NestedProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1107:1: (otherlv_0= 'NestedProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1107:1: (otherlv_0= 'NestedProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1107:3: otherlv_0= 'NestedProperty' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )? otherlv_11= ':' ( (otherlv_12= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNestedProperty2489); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedPropertyAccess().getNestedPropertyKeyword_0());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1111:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1113:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1113:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1114:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1117:2: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )* )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1118:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1118:3: ( ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1120:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1120:4: ({...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1121:5: {...}? => ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNestedProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1121:111: ( ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1122:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1125:6: ({...}? => ( (lv_isOrdered_2_0= 'ordered' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1125:7: {...}? => ( (lv_isOrdered_2_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNestedProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1125:16: ( (lv_isOrdered_2_0= 'ordered' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1126:1: (lv_isOrdered_2_0= 'ordered' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1126:1: (lv_isOrdered_2_0= 'ordered' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1127:3: lv_isOrdered_2_0= 'ordered'
            	    {
            	    lv_isOrdered_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNestedProperty2552); 

            	            newLeafNode(lv_isOrdered_2_0, grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNestedPropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1147:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1147:4: ({...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1148:5: {...}? => ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNestedProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1148:111: ( ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1149:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1152:6: ({...}? => ( (lv_isUnique_3_0= 'unique' ) ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1152:7: {...}? => ( (lv_isUnique_3_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNestedProperty", "true");
            	    }
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1152:16: ( (lv_isUnique_3_0= 'unique' ) )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1153:1: (lv_isUnique_3_0= 'unique' )
            	    {
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1153:1: (lv_isUnique_3_0= 'unique' )
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1154:3: lv_isUnique_3_0= 'unique'
            	    {
            	    lv_isUnique_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNestedProperty2637); 

            	            newLeafNode(lv_isUnique_3_0, grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNestedPropertyRule());
            	    	        }
            	           		setWithLastConsumed(current, "isUnique", true, "unique");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	

            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1181:2: ( (lv_name_4_0= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1182:1: (lv_name_4_0= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1182:1: (lv_name_4_0= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1183:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNestedProperty2707); 

            			newLeafNode(lv_name_4_0, grammarAccess.getNestedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNestedPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1199:2: ( (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) ) | ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' ) )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1199:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1199:3: (otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1199:5: otherlv_5= '[' ( (lv_upperBound_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNestedProperty2726); 

                        	newLeafNode(otherlv_5, grammarAccess.getNestedPropertyAccess().getLeftSquareBracketKeyword_3_0_0());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1203:1: ( (lv_upperBound_6_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1204:1: (lv_upperBound_6_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1204:1: (lv_upperBound_6_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1205:3: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNestedProperty2743); 

                    			newLeafNode(lv_upperBound_6_0, grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNestedPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:6: ( ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) ) otherlv_10= ']'
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:7: ( ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:8: ( (lv_lowerBound_7_0= RULE_INT ) ) otherlv_8= '..' ( (lv_upperBound_9_0= RULE_INT ) )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1222:8: ( (lv_lowerBound_7_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1223:1: (lv_lowerBound_7_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1223:1: (lv_lowerBound_7_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1224:3: lv_lowerBound_7_0= RULE_INT
                    {
                    lv_lowerBound_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNestedProperty2774); 

                    			newLeafNode(lv_lowerBound_7_0, grammarAccess.getNestedPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNestedPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNestedProperty2791); 

                        	newLeafNode(otherlv_8, grammarAccess.getNestedPropertyAccess().getFullStopFullStopKeyword_3_1_0_1());
                        
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1244:1: ( (lv_upperBound_9_0= RULE_INT ) )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1245:1: (lv_upperBound_9_0= RULE_INT )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1245:1: (lv_upperBound_9_0= RULE_INT )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1246:3: lv_upperBound_9_0= RULE_INT
                    {
                    lv_upperBound_9_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNestedProperty2808); 

                    			newLeafNode(lv_upperBound_9_0, grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNestedPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNestedProperty2826); 

                        	newLeafNode(otherlv_10, grammarAccess.getNestedPropertyAccess().getRightSquareBracketKeyword_3_1_1());
                        

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNestedProperty2841); 

                	newLeafNode(otherlv_11, grammarAccess.getNestedPropertyAccess().getColonKeyword_4());
                
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1270:1: ( (otherlv_12= RULE_ID ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1271:1: (otherlv_12= RULE_ID )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1271:1: (otherlv_12= RULE_ID )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1272:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNestedPropertyRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleNestedProperty2861); 

            		newLeafNode(otherlv_12, grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassCrossReference_5_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedProperty"


    // $ANTLR start "rulePrimitiveType"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1293:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1295:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1296:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1296:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1296:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1296:2: (enumLiteral_0= 'boolean' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1296:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePrimitiveType2913); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1302:6: (enumLiteral_1= 'char' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1302:6: (enumLiteral_1= 'char' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1302:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePrimitiveType2930); 

                            current = grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1308:6: (enumLiteral_2= 'int' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1308:6: (enumLiteral_2= 'int' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1308:8: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePrimitiveType2947); 

                            current = grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleInheritanceType"
    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1318:1: ruleInheritanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) ) ;
    public final Enumerator ruleInheritanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1320:28: ( ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1321:1: ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1321:1: ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1321:2: (enumLiteral_0= 'joined' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1321:2: (enumLiteral_0= 'joined' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1321:4: enumLiteral_0= 'joined'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInheritanceType2992); 

                            current = grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1327:6: (enumLiteral_1= 'tablePerClass' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1327:6: (enumLiteral_1= 'tablePerClass' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1327:8: enumLiteral_1= 'tablePerClass'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInheritanceType3009); 

                            current = grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1333:6: (enumLiteral_2= 'singleTable' )
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1333:6: (enumLiteral_2= 'singleTable' )
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1333:8: enumLiteral_2= 'singleTable'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInheritanceType3026); 

                            current = grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInheritanceType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModelRoot_in_entryRuleModelRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_ruleModelRoot131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructure175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelEntity_in_ruleStructure220 = new BitSet(new long[]{0x0000000000062802L});
        public static final BitSet FOLLOW_ruleModelEntity_in_entryRuleModelEntity256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelEntity266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralClass_in_ruleModelEntity313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveClass_in_ruleModelEntity340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralClass_in_entryRuleGeneralClass375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralClass385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedClass_in_ruleGeneralClass432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardClass_in_ruleGeneralClass459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveClass_in_entryRulePrimitiveClass494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveClass504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePrimitiveClass541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveClass558 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePrimitiveClass575 = new BitSet(new long[]{0x0000000E00000000L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_rulePrimitiveClass596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedClass_in_entryRuleEmbeddedClass632 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedClass642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleEmbeddedClass679 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedClass696 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEmbeddedClass713 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEmbeddedClass725 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedClass745 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedClass765 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedClass785 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleEmbeddedClass798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardClass_in_entryRuleStandardClass834 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStandardClass844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleStandardClass887 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStandardClass913 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStandardClass930 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleStandardClass948 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStandardClass968 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStandardClass980 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_ruleInheritanceType_in_ruleStandardClass1001 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStandardClass1015 = new BitSet(new long[]{0x0000000140818000L});
        public static final BitSet FOLLOW_15_in_ruleStandardClass1028 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStandardClass1048 = new BitSet(new long[]{0x0000000140810000L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_ruleStandardClass1072 = new BitSet(new long[]{0x0000000140810000L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_ruleStandardClass1093 = new BitSet(new long[]{0x0000000140810000L});
        public static final BitSet FOLLOW_16_in_ruleStandardClass1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_entryRuleMultipliableProperty1146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipliableProperty1156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationProperty_in_ruleMultipliableProperty1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveProperty_in_ruleMultipliableProperty1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedProperty_in_ruleMultipliableProperty1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedProperty_in_entryRuleEmbeddedProperty1292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedProperty1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEmbeddedProperty1339 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEmbeddedProperty1357 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedProperty1387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEmbeddedProperty1404 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmbeddedProperty1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveProperty_in_entryRulePrimitiveProperty1460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveProperty1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePrimitiveProperty1507 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_24_in_rulePrimitiveProperty1570 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_25_in_rulePrimitiveProperty1655 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveProperty1725 = new BitSet(new long[]{0x0000000004001020L});
        public static final BitSet FOLLOW_26_in_rulePrimitiveProperty1744 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveProperty1761 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveProperty1792 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulePrimitiveProperty1809 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_rulePrimitiveProperty1826 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePrimitiveProperty1844 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePrimitiveProperty1859 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveProperty1879 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_rulePrimitiveProperty1892 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveProperty1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationProperty_in_entryRuleAssociationProperty1952 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociationProperty1962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAssociationProperty1999 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_24_in_ruleAssociationProperty2062 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_25_in_ruleAssociationProperty2147 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationProperty2217 = new BitSet(new long[]{0x0000000084001020L});
        public static final BitSet FOLLOW_26_in_ruleAssociationProperty2236 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAssociationProperty2253 = new BitSet(new long[]{0x0000000080001000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAssociationProperty2284 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAssociationProperty2301 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAssociationProperty2318 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAssociationProperty2336 = new BitSet(new long[]{0x0000000080001000L});
        public static final BitSet FOLLOW_31_in_ruleAssociationProperty2352 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationProperty2372 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAssociationProperty2386 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationProperty2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedProperty_in_entryRuleNestedProperty2442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedProperty2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleNestedProperty2489 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_24_in_ruleNestedProperty2552 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_25_in_ruleNestedProperty2637 = new BitSet(new long[]{0x0000000003000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNestedProperty2707 = new BitSet(new long[]{0x0000000004001020L});
        public static final BitSet FOLLOW_26_in_ruleNestedProperty2726 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNestedProperty2743 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNestedProperty2774 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleNestedProperty2791 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNestedProperty2808 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleNestedProperty2826 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNestedProperty2841 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleNestedProperty2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulePrimitiveType2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePrimitiveType2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePrimitiveType2947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleInheritanceType2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleInheritanceType3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleInheritanceType3026 = new BitSet(new long[]{0x0000000000000002L});
    }


}