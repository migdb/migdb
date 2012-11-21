package migdb.dsl.ops.parser.antlr.internal; 

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
import migdb.dsl.ops.services.OpsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'primitive'", "'embedded'", "'abstract'", "'class'", "'->'", "'<'", "'!<'", "'!abstract'", "'!'", "'+='", "'!ordered'", "'ordered'", "'!unique'", "'unique'", "':'", "'['", "'..'", "']'", "'.'", "'-='", "'<->'", "'!<->'", "'copy'", "'move'", "'extract'", "','", "'strict'", "'force'", "'tolerant'", "'boolean'", "'char'", "'int'", "'joined'", "'tablePerClass'", "'singleTable'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOpsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOpsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOpsParser.tokenNames; }
    public String getGrammarFileName() { return "../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g"; }



     	private OpsGrammarAccess grammarAccess;
     	
        public InternalOpsParser(TokenStream input, OpsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ModelRoot";	
       	}
       	
       	@Override
       	protected OpsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModelRoot"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:68:1: entryRuleModelRoot returns [EObject current=null] : iv_ruleModelRoot= ruleModelRoot EOF ;
    public final EObject entryRuleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRoot = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:69:2: (iv_ruleModelRoot= ruleModelRoot EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:70:2: iv_ruleModelRoot= ruleModelRoot EOF
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
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:77:1: ruleModelRoot returns [EObject current=null] : this_Operations_0= ruleOperations ;
    public final EObject ruleModelRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Operations_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:80:28: (this_Operations_0= ruleOperations )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:82:5: this_Operations_0= ruleOperations
            {
             
                    newCompositeNode(grammarAccess.getModelRootAccess().getOperationsParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperations_in_ruleModelRoot131);
            this_Operations_0=ruleOperations();

            state._fsp--;

             
                    current = this_Operations_0; 
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


    // $ANTLR start "entryRuleOperations"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:98:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:99:2: (iv_ruleOperations= ruleOperations EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:100:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperations_in_entryRuleOperations165);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperations175); 

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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:107:1: ruleOperations returns [EObject current=null] : ( (lv_operations_0_0= ruleModelOperation ) )* ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:110:28: ( ( (lv_operations_0_0= ruleModelOperation ) )* )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:111:1: ( (lv_operations_0_0= ruleModelOperation ) )*
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:111:1: ( (lv_operations_0_0= ruleModelOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==20||(LA1_0>=34 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:112:1: (lv_operations_0_0= ruleModelOperation )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:112:1: (lv_operations_0_0= ruleModelOperation )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:113:3: lv_operations_0_0= ruleModelOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationsAccess().getOperationsModelOperationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleModelOperation_in_ruleOperations220);
            	    lv_operations_0_0=ruleModelOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_0_0, 
            	            		"ModelOperation");
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleModelOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:137:1: entryRuleModelOperation returns [EObject current=null] : iv_ruleModelOperation= ruleModelOperation EOF ;
    public final EObject entryRuleModelOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelOperation = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:138:2: (iv_ruleModelOperation= ruleModelOperation EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:139:2: iv_ruleModelOperation= ruleModelOperation EOF
            {
             newCompositeNode(grammarAccess.getModelOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelOperation_in_entryRuleModelOperation256);
            iv_ruleModelOperation=ruleModelOperation();

            state._fsp--;

             current =iv_ruleModelOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelOperation266); 

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
    // $ANTLR end "entryRuleModelOperation"


    // $ANTLR start "ruleModelOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:146:1: ruleModelOperation returns [EObject current=null] : (this_AtomicOperation_0= ruleAtomicOperation | this_DecomposableOperation_1= ruleDecomposableOperation ) ;
    public final EObject ruleModelOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicOperation_0 = null;

        EObject this_DecomposableOperation_1 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:149:28: ( (this_AtomicOperation_0= ruleAtomicOperation | this_DecomposableOperation_1= ruleDecomposableOperation ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:150:1: (this_AtomicOperation_0= ruleAtomicOperation | this_DecomposableOperation_1= ruleDecomposableOperation )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:150:1: (this_AtomicOperation_0= ruleAtomicOperation | this_DecomposableOperation_1= ruleDecomposableOperation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==20||(LA2_0>=34 && LA2_0<=35)) ) {
                alt2=1;
            }
            else if ( (LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:151:5: this_AtomicOperation_0= ruleAtomicOperation
                    {
                     
                            newCompositeNode(grammarAccess.getModelOperationAccess().getAtomicOperationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicOperation_in_ruleModelOperation313);
                    this_AtomicOperation_0=ruleAtomicOperation();

                    state._fsp--;

                     
                            current = this_AtomicOperation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:161:5: this_DecomposableOperation_1= ruleDecomposableOperation
                    {
                     
                            newCompositeNode(grammarAccess.getModelOperationAccess().getDecomposableOperationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDecomposableOperation_in_ruleModelOperation340);
                    this_DecomposableOperation_1=ruleDecomposableOperation();

                    state._fsp--;

                     
                            current = this_DecomposableOperation_1; 
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
    // $ANTLR end "ruleModelOperation"


    // $ANTLR start "entryRuleAtomicOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:177:1: entryRuleAtomicOperation returns [EObject current=null] : iv_ruleAtomicOperation= ruleAtomicOperation EOF ;
    public final EObject entryRuleAtomicOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicOperation = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:178:2: (iv_ruleAtomicOperation= ruleAtomicOperation EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:179:2: iv_ruleAtomicOperation= ruleAtomicOperation EOF
            {
             newCompositeNode(grammarAccess.getAtomicOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicOperation_in_entryRuleAtomicOperation375);
            iv_ruleAtomicOperation=ruleAtomicOperation();

            state._fsp--;

             current =iv_ruleAtomicOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicOperation385); 

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
    // $ANTLR end "entryRuleAtomicOperation"


    // $ANTLR start "ruleAtomicOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:186:1: ruleAtomicOperation returns [EObject current=null] : (this_AddPrimitiveClass_0= ruleAddPrimitiveClass | this_AddEmbeddedClass_1= ruleAddEmbeddedClass | this_AddStandardClass_2= ruleAddStandardClass | this_RenameEntity_3= ruleRenameEntity | this_SetParent_4= ruleSetParent | this_SetAbstract_5= ruleSetAbstract | this_RemoveEntity_6= ruleRemoveEntity | this_AddProperty_7= ruleAddProperty | this_RenameProperty_8= ruleRenameProperty | this_RemoveProperty_9= ruleRemoveProperty | this_SetType_10= ruleSetType | this_SetOpposite_11= ruleSetOpposite | this_SetBounds_12= ruleSetBounds | this_SetOrdered_13= ruleSetOrdered | this_SetUnique_14= ruleSetUnique | this_CopyProperty_15= ruleCopyProperty | this_MoveProperty_16= ruleMoveProperty ) ;
    public final EObject ruleAtomicOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AddPrimitiveClass_0 = null;

        EObject this_AddEmbeddedClass_1 = null;

        EObject this_AddStandardClass_2 = null;

        EObject this_RenameEntity_3 = null;

        EObject this_SetParent_4 = null;

        EObject this_SetAbstract_5 = null;

        EObject this_RemoveEntity_6 = null;

        EObject this_AddProperty_7 = null;

        EObject this_RenameProperty_8 = null;

        EObject this_RemoveProperty_9 = null;

        EObject this_SetType_10 = null;

        EObject this_SetOpposite_11 = null;

        EObject this_SetBounds_12 = null;

        EObject this_SetOrdered_13 = null;

        EObject this_SetUnique_14 = null;

        EObject this_CopyProperty_15 = null;

        EObject this_MoveProperty_16 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:189:28: ( (this_AddPrimitiveClass_0= ruleAddPrimitiveClass | this_AddEmbeddedClass_1= ruleAddEmbeddedClass | this_AddStandardClass_2= ruleAddStandardClass | this_RenameEntity_3= ruleRenameEntity | this_SetParent_4= ruleSetParent | this_SetAbstract_5= ruleSetAbstract | this_RemoveEntity_6= ruleRemoveEntity | this_AddProperty_7= ruleAddProperty | this_RenameProperty_8= ruleRenameProperty | this_RemoveProperty_9= ruleRemoveProperty | this_SetType_10= ruleSetType | this_SetOpposite_11= ruleSetOpposite | this_SetBounds_12= ruleSetBounds | this_SetOrdered_13= ruleSetOrdered | this_SetUnique_14= ruleSetUnique | this_CopyProperty_15= ruleCopyProperty | this_MoveProperty_16= ruleMoveProperty ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:190:1: (this_AddPrimitiveClass_0= ruleAddPrimitiveClass | this_AddEmbeddedClass_1= ruleAddEmbeddedClass | this_AddStandardClass_2= ruleAddStandardClass | this_RenameEntity_3= ruleRenameEntity | this_SetParent_4= ruleSetParent | this_SetAbstract_5= ruleSetAbstract | this_RemoveEntity_6= ruleRemoveEntity | this_AddProperty_7= ruleAddProperty | this_RenameProperty_8= ruleRenameProperty | this_RemoveProperty_9= ruleRemoveProperty | this_SetType_10= ruleSetType | this_SetOpposite_11= ruleSetOpposite | this_SetBounds_12= ruleSetBounds | this_SetOrdered_13= ruleSetOrdered | this_SetUnique_14= ruleSetUnique | this_CopyProperty_15= ruleCopyProperty | this_MoveProperty_16= ruleMoveProperty )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:190:1: (this_AddPrimitiveClass_0= ruleAddPrimitiveClass | this_AddEmbeddedClass_1= ruleAddEmbeddedClass | this_AddStandardClass_2= ruleAddStandardClass | this_RenameEntity_3= ruleRenameEntity | this_SetParent_4= ruleSetParent | this_SetAbstract_5= ruleSetAbstract | this_RemoveEntity_6= ruleRemoveEntity | this_AddProperty_7= ruleAddProperty | this_RenameProperty_8= ruleRenameProperty | this_RemoveProperty_9= ruleRemoveProperty | this_SetType_10= ruleSetType | this_SetOpposite_11= ruleSetOpposite | this_SetBounds_12= ruleSetBounds | this_SetOrdered_13= ruleSetOrdered | this_SetUnique_14= ruleSetUnique | this_CopyProperty_15= ruleCopyProperty | this_MoveProperty_16= ruleMoveProperty )
            int alt3=17;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:191:5: this_AddPrimitiveClass_0= ruleAddPrimitiveClass
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getAddPrimitiveClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAddPrimitiveClass_in_ruleAtomicOperation432);
                    this_AddPrimitiveClass_0=ruleAddPrimitiveClass();

                    state._fsp--;

                     
                            current = this_AddPrimitiveClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:201:5: this_AddEmbeddedClass_1= ruleAddEmbeddedClass
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getAddEmbeddedClassParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAddEmbeddedClass_in_ruleAtomicOperation459);
                    this_AddEmbeddedClass_1=ruleAddEmbeddedClass();

                    state._fsp--;

                     
                            current = this_AddEmbeddedClass_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:211:5: this_AddStandardClass_2= ruleAddStandardClass
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getAddStandardClassParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAddStandardClass_in_ruleAtomicOperation486);
                    this_AddStandardClass_2=ruleAddStandardClass();

                    state._fsp--;

                     
                            current = this_AddStandardClass_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:221:5: this_RenameEntity_3= ruleRenameEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getRenameEntityParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRenameEntity_in_ruleAtomicOperation513);
                    this_RenameEntity_3=ruleRenameEntity();

                    state._fsp--;

                     
                            current = this_RenameEntity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:231:5: this_SetParent_4= ruleSetParent
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetParentParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetParent_in_ruleAtomicOperation540);
                    this_SetParent_4=ruleSetParent();

                    state._fsp--;

                     
                            current = this_SetParent_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:241:5: this_SetAbstract_5= ruleSetAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetAbstractParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetAbstract_in_ruleAtomicOperation567);
                    this_SetAbstract_5=ruleSetAbstract();

                    state._fsp--;

                     
                            current = this_SetAbstract_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:251:5: this_RemoveEntity_6= ruleRemoveEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getRemoveEntityParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRemoveEntity_in_ruleAtomicOperation594);
                    this_RemoveEntity_6=ruleRemoveEntity();

                    state._fsp--;

                     
                            current = this_RemoveEntity_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:261:5: this_AddProperty_7= ruleAddProperty
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getAddPropertyParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAddProperty_in_ruleAtomicOperation621);
                    this_AddProperty_7=ruleAddProperty();

                    state._fsp--;

                     
                            current = this_AddProperty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:271:5: this_RenameProperty_8= ruleRenameProperty
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getRenamePropertyParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRenameProperty_in_ruleAtomicOperation648);
                    this_RenameProperty_8=ruleRenameProperty();

                    state._fsp--;

                     
                            current = this_RenameProperty_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:281:5: this_RemoveProperty_9= ruleRemoveProperty
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getRemovePropertyParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRemoveProperty_in_ruleAtomicOperation675);
                    this_RemoveProperty_9=ruleRemoveProperty();

                    state._fsp--;

                     
                            current = this_RemoveProperty_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:291:5: this_SetType_10= ruleSetType
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetTypeParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetType_in_ruleAtomicOperation702);
                    this_SetType_10=ruleSetType();

                    state._fsp--;

                     
                            current = this_SetType_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:301:5: this_SetOpposite_11= ruleSetOpposite
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetOppositeParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetOpposite_in_ruleAtomicOperation729);
                    this_SetOpposite_11=ruleSetOpposite();

                    state._fsp--;

                     
                            current = this_SetOpposite_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:311:5: this_SetBounds_12= ruleSetBounds
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetBoundsParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetBounds_in_ruleAtomicOperation756);
                    this_SetBounds_12=ruleSetBounds();

                    state._fsp--;

                     
                            current = this_SetBounds_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:321:5: this_SetOrdered_13= ruleSetOrdered
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetOrderedParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetOrdered_in_ruleAtomicOperation783);
                    this_SetOrdered_13=ruleSetOrdered();

                    state._fsp--;

                     
                            current = this_SetOrdered_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:331:5: this_SetUnique_14= ruleSetUnique
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getSetUniqueParserRuleCall_14()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSetUnique_in_ruleAtomicOperation810);
                    this_SetUnique_14=ruleSetUnique();

                    state._fsp--;

                     
                            current = this_SetUnique_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:341:5: this_CopyProperty_15= ruleCopyProperty
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getCopyPropertyParserRuleCall_15()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCopyProperty_in_ruleAtomicOperation837);
                    this_CopyProperty_15=ruleCopyProperty();

                    state._fsp--;

                     
                            current = this_CopyProperty_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:351:5: this_MoveProperty_16= ruleMoveProperty
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicOperationAccess().getMovePropertyParserRuleCall_16()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMoveProperty_in_ruleAtomicOperation864);
                    this_MoveProperty_16=ruleMoveProperty();

                    state._fsp--;

                     
                            current = this_MoveProperty_16; 
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
    // $ANTLR end "ruleAtomicOperation"


    // $ANTLR start "entryRuleDecomposableOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:367:1: entryRuleDecomposableOperation returns [EObject current=null] : iv_ruleDecomposableOperation= ruleDecomposableOperation EOF ;
    public final EObject entryRuleDecomposableOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposableOperation = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:368:2: (iv_ruleDecomposableOperation= ruleDecomposableOperation EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:369:2: iv_ruleDecomposableOperation= ruleDecomposableOperation EOF
            {
             newCompositeNode(grammarAccess.getDecomposableOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposableOperation_in_entryRuleDecomposableOperation899);
            iv_ruleDecomposableOperation=ruleDecomposableOperation();

            state._fsp--;

             current =iv_ruleDecomposableOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecomposableOperation909); 

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
    // $ANTLR end "entryRuleDecomposableOperation"


    // $ANTLR start "ruleDecomposableOperation"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:376:1: ruleDecomposableOperation returns [EObject current=null] : (this_ExtractClass_0= ruleExtractClass | this_ExtractParent_1= ruleExtractParent ) ;
    public final EObject ruleDecomposableOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ExtractClass_0 = null;

        EObject this_ExtractParent_1 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:379:28: ( (this_ExtractClass_0= ruleExtractClass | this_ExtractParent_1= ruleExtractParent ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:380:1: (this_ExtractClass_0= ruleExtractClass | this_ExtractParent_1= ruleExtractParent )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:380:1: (this_ExtractClass_0= ruleExtractClass | this_ExtractParent_1= ruleExtractParent )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==27) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:381:5: this_ExtractClass_0= ruleExtractClass
                    {
                     
                            newCompositeNode(grammarAccess.getDecomposableOperationAccess().getExtractClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtractClass_in_ruleDecomposableOperation956);
                    this_ExtractClass_0=ruleExtractClass();

                    state._fsp--;

                     
                            current = this_ExtractClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:391:5: this_ExtractParent_1= ruleExtractParent
                    {
                     
                            newCompositeNode(grammarAccess.getDecomposableOperationAccess().getExtractParentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtractParent_in_ruleDecomposableOperation983);
                    this_ExtractParent_1=ruleExtractParent();

                    state._fsp--;

                     
                            current = this_ExtractParent_1; 
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
    // $ANTLR end "ruleDecomposableOperation"


    // $ANTLR start "entryRuleAddPrimitiveClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:407:1: entryRuleAddPrimitiveClass returns [EObject current=null] : iv_ruleAddPrimitiveClass= ruleAddPrimitiveClass EOF ;
    public final EObject entryRuleAddPrimitiveClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddPrimitiveClass = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:408:2: (iv_ruleAddPrimitiveClass= ruleAddPrimitiveClass EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:409:2: iv_ruleAddPrimitiveClass= ruleAddPrimitiveClass EOF
            {
             newCompositeNode(grammarAccess.getAddPrimitiveClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddPrimitiveClass_in_entryRuleAddPrimitiveClass1018);
            iv_ruleAddPrimitiveClass=ruleAddPrimitiveClass();

            state._fsp--;

             current =iv_ruleAddPrimitiveClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddPrimitiveClass1028); 

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
    // $ANTLR end "entryRuleAddPrimitiveClass"


    // $ANTLR start "ruleAddPrimitiveClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:416:1: ruleAddPrimitiveClass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'primitive' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) ) ;
    public final EObject ruleAddPrimitiveClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_primitiveType_3_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:419:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'primitive' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:420:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'primitive' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:420:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'primitive' ( (lv_primitiveType_3_0= rulePrimitiveType ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:420:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'primitive' ( (lv_primitiveType_3_0= rulePrimitiveType ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:420:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:421:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:421:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:422:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddPrimitiveClass1070); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAddPrimitiveClassAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPrimitiveClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAddPrimitiveClass1087); 

                	newLeafNode(otherlv_1, grammarAccess.getAddPrimitiveClassAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAddPrimitiveClass1099); 

                	newLeafNode(otherlv_2, grammarAccess.getAddPrimitiveClassAccess().getPrimitiveKeyword_2());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:446:1: ( (lv_primitiveType_3_0= rulePrimitiveType ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:447:1: (lv_primitiveType_3_0= rulePrimitiveType )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:447:1: (lv_primitiveType_3_0= rulePrimitiveType )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:448:3: lv_primitiveType_3_0= rulePrimitiveType
            {
             
            	        newCompositeNode(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_ruleAddPrimitiveClass1120);
            lv_primitiveType_3_0=rulePrimitiveType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddPrimitiveClassRule());
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
    // $ANTLR end "ruleAddPrimitiveClass"


    // $ANTLR start "entryRuleAddEmbeddedClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:472:1: entryRuleAddEmbeddedClass returns [EObject current=null] : iv_ruleAddEmbeddedClass= ruleAddEmbeddedClass EOF ;
    public final EObject entryRuleAddEmbeddedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEmbeddedClass = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:473:2: (iv_ruleAddEmbeddedClass= ruleAddEmbeddedClass EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:474:2: iv_ruleAddEmbeddedClass= ruleAddEmbeddedClass EOF
            {
             newCompositeNode(grammarAccess.getAddEmbeddedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddEmbeddedClass_in_entryRuleAddEmbeddedClass1156);
            iv_ruleAddEmbeddedClass=ruleAddEmbeddedClass();

            state._fsp--;

             current =iv_ruleAddEmbeddedClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddEmbeddedClass1166); 

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
    // $ANTLR end "entryRuleAddEmbeddedClass"


    // $ANTLR start "ruleAddEmbeddedClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:481:1: ruleAddEmbeddedClass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'embedded' ) ;
    public final EObject ruleAddEmbeddedClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:484:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'embedded' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:485:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'embedded' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:485:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'embedded' )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:485:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'embedded'
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:485:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:486:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:486:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:487:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddEmbeddedClass1208); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAddEmbeddedClassAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddEmbeddedClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAddEmbeddedClass1225); 

                	newLeafNode(otherlv_1, grammarAccess.getAddEmbeddedClassAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAddEmbeddedClass1237); 

                	newLeafNode(otherlv_2, grammarAccess.getAddEmbeddedClassAccess().getEmbeddedKeyword_2());
                

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
    // $ANTLR end "ruleAddEmbeddedClass"


    // $ANTLR start "entryRuleAddStandardClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:519:1: entryRuleAddStandardClass returns [EObject current=null] : iv_ruleAddStandardClass= ruleAddStandardClass EOF ;
    public final EObject entryRuleAddStandardClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddStandardClass = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:520:2: (iv_ruleAddStandardClass= ruleAddStandardClass EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:521:2: iv_ruleAddStandardClass= ruleAddStandardClass EOF
            {
             newCompositeNode(grammarAccess.getAddStandardClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddStandardClass_in_entryRuleAddStandardClass1273);
            iv_ruleAddStandardClass=ruleAddStandardClass();

            state._fsp--;

             current =iv_ruleAddStandardClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddStandardClass1283); 

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
    // $ANTLR end "entryRuleAddStandardClass"


    // $ANTLR start "ruleAddStandardClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:528:1: ruleAddStandardClass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )? otherlv_5= 'class' ) ;
    public final EObject ruleAddStandardClass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isAbstract_3_0=null;
        Token otherlv_5=null;
        Enumerator lv_inheritanceType_4_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:531:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )? otherlv_5= 'class' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:532:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )? otherlv_5= 'class' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:532:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )? otherlv_5= 'class' )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:532:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )? otherlv_5= 'class'
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:532:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:533:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:533:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:534:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddStandardClass1325); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAddStandardClassAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddStandardClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAddStandardClass1342); 

                	newLeafNode(otherlv_1, grammarAccess.getAddStandardClassAccess().getEqualsSignKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:554:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14||(LA6_0>=44 && LA6_0<=46)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:556:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:556:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:557:2: ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
                    	
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:560:2: ( ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?)
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:561:3: ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+ {...}?
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:561:3: ( ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( LA5_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                            alt5=1;
                        }
                        else if ( LA5_0 >=44 && LA5_0<=46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:563:4: ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )
                    	    {
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:563:4: ({...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:564:5: {...}? => ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleAddStandardClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0)");
                    	    }
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:564:113: ( ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:565:6: ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0);
                    	    	 				
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:568:6: ({...}? => ( (lv_isAbstract_3_0= 'abstract' ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:568:7: {...}? => ( (lv_isAbstract_3_0= 'abstract' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAddStandardClass", "true");
                    	    }
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:568:16: ( (lv_isAbstract_3_0= 'abstract' ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:569:1: (lv_isAbstract_3_0= 'abstract' )
                    	    {
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:569:1: (lv_isAbstract_3_0= 'abstract' )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:570:3: lv_isAbstract_3_0= 'abstract'
                    	    {
                    	    lv_isAbstract_3_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAddStandardClass1405); 

                    	            newLeafNode(lv_isAbstract_3_0, grammarAccess.getAddStandardClassAccess().getIsAbstractAbstractKeyword_2_0_0());
                    	        

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAddStandardClassRule());
                    	    	        }
                    	           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    	    

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:590:4: ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) )
                    	    {
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:590:4: ({...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:591:5: {...}? => ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleAddStandardClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1)");
                    	    }
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:591:113: ( ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:592:6: ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1);
                    	    	 				
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:595:6: ({...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:595:7: {...}? => ( (lv_inheritanceType_4_0= ruleInheritanceType ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleAddStandardClass", "true");
                    	    }
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:595:16: ( (lv_inheritanceType_4_0= ruleInheritanceType ) )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:596:1: (lv_inheritanceType_4_0= ruleInheritanceType )
                    	    {
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:596:1: (lv_inheritanceType_4_0= ruleInheritanceType )
                    	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:597:3: lv_inheritanceType_4_0= ruleInheritanceType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAddStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInheritanceType_in_ruleAddStandardClass1493);
                    	    lv_inheritanceType_4_0=ruleInheritanceType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAddStandardClassRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"inheritanceType",
                    	            		lv_inheritanceType_4_0, 
                    	            		"InheritanceType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2()) ) {
                        throw new FailedPredicateException(input, "ruleAddStandardClass", "getUnorderedGroupHelper().canLeave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2())");
                    }

                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
                    	

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAddStandardClass1552); 

                	newLeafNode(otherlv_5, grammarAccess.getAddStandardClassAccess().getClassKeyword_3());
                

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
    // $ANTLR end "ruleAddStandardClass"


    // $ANTLR start "entryRuleRenameEntity"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:640:1: entryRuleRenameEntity returns [EObject current=null] : iv_ruleRenameEntity= ruleRenameEntity EOF ;
    public final EObject entryRuleRenameEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEntity = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:641:2: (iv_ruleRenameEntity= ruleRenameEntity EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:642:2: iv_ruleRenameEntity= ruleRenameEntity EOF
            {
             newCompositeNode(grammarAccess.getRenameEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameEntity_in_entryRuleRenameEntity1588);
            iv_ruleRenameEntity=ruleRenameEntity();

            state._fsp--;

             current =iv_ruleRenameEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameEntity1598); 

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
    // $ANTLR end "entryRuleRenameEntity"


    // $ANTLR start "ruleRenameEntity"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:649:1: ruleRenameEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_newName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRenameEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_newName_2_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:652:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_newName_2_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_newName_2_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_newName_2_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:653:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_newName_2_0= RULE_ID ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:653:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:654:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:654:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:655:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameEntity1640); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRenameEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRenameEntity1657); 

                	newLeafNode(otherlv_1, grammarAccess.getRenameEntityAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:675:1: ( (lv_newName_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:676:1: (lv_newName_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:676:1: (lv_newName_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:677:3: lv_newName_2_0= RULE_ID
            {
            lv_newName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameEntity1674); 

            			newLeafNode(lv_newName_2_0, grammarAccess.getRenameEntityAccess().getNewNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenameEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRenameEntity"


    // $ANTLR start "entryRuleSetParent"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:701:1: entryRuleSetParent returns [EObject current=null] : iv_ruleSetParent= ruleSetParent EOF ;
    public final EObject entryRuleSetParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetParent = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:702:2: (iv_ruleSetParent= ruleSetParent EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:703:2: iv_ruleSetParent= ruleSetParent EOF
            {
             newCompositeNode(grammarAccess.getSetParentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetParent_in_entryRuleSetParent1715);
            iv_ruleSetParent=ruleSetParent();

            state._fsp--;

             current =iv_ruleSetParent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetParent1725); 

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
    // $ANTLR end "entryRuleSetParent"


    // $ANTLR start "ruleSetParent"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:710:1: ruleSetParent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' ) ) ;
    public final EObject ruleSetParent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_parentName_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:713:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:714:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:714:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:714:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:714:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:715:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:715:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:716:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetParent1767); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSetParentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetParentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:732:2: ( (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) ) | otherlv_3= '!<' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:732:3: (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:732:3: (otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:732:5: otherlv_1= '<' ( (lv_parentName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSetParent1786); 

                        	newLeafNode(otherlv_1, grammarAccess.getSetParentAccess().getLessThanSignKeyword_1_0_0());
                        
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:736:1: ( (lv_parentName_2_0= RULE_ID ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:737:1: (lv_parentName_2_0= RULE_ID )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:737:1: (lv_parentName_2_0= RULE_ID )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:738:3: lv_parentName_2_0= RULE_ID
                    {
                    lv_parentName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetParent1803); 

                    			newLeafNode(lv_parentName_2_0, grammarAccess.getSetParentAccess().getParentNameIDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetParentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parentName",
                            		lv_parentName_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:755:7: otherlv_3= '!<'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSetParent1827); 

                        	newLeafNode(otherlv_3, grammarAccess.getSetParentAccess().getExclamationMarkLessThanSignKeyword_1_1());
                        

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
    // $ANTLR end "ruleSetParent"


    // $ANTLR start "entryRuleSetAbstract"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:767:1: entryRuleSetAbstract returns [EObject current=null] : iv_ruleSetAbstract= ruleSetAbstract EOF ;
    public final EObject entryRuleSetAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAbstract = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:768:2: (iv_ruleSetAbstract= ruleSetAbstract EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:769:2: iv_ruleSetAbstract= ruleSetAbstract EOF
            {
             newCompositeNode(grammarAccess.getSetAbstractRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetAbstract_in_entryRuleSetAbstract1864);
            iv_ruleSetAbstract=ruleSetAbstract();

            state._fsp--;

             current =iv_ruleSetAbstract; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetAbstract1874); 

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
    // $ANTLR end "entryRuleSetAbstract"


    // $ANTLR start "ruleSetAbstract"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:776:1: ruleSetAbstract returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' ) ) ;
    public final EObject ruleSetAbstract() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isAbstract_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:779:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:780:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:780:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:780:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:780:2: ( (lv_name_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:781:1: (lv_name_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:781:1: (lv_name_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:782:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetAbstract1916); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSetAbstractAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetAbstractRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:798:2: ( ( (lv_isAbstract_1_0= 'abstract' ) ) | otherlv_2= '!abstract' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:798:3: ( (lv_isAbstract_1_0= 'abstract' ) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:798:3: ( (lv_isAbstract_1_0= 'abstract' ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:799:1: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:799:1: (lv_isAbstract_1_0= 'abstract' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:800:3: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSetAbstract1940); 

                            newLeafNode(lv_isAbstract_1_0, grammarAccess.getSetAbstractAccess().getIsAbstractAbstractKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetAbstractRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:814:7: otherlv_2= '!abstract'
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSetAbstract1971); 

                        	newLeafNode(otherlv_2, grammarAccess.getSetAbstractAccess().getAbstractKeyword_1_1());
                        

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
    // $ANTLR end "ruleSetAbstract"


    // $ANTLR start "entryRuleRemoveEntity"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:826:1: entryRuleRemoveEntity returns [EObject current=null] : iv_ruleRemoveEntity= ruleRemoveEntity EOF ;
    public final EObject entryRuleRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEntity = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:827:2: (iv_ruleRemoveEntity= ruleRemoveEntity EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:828:2: iv_ruleRemoveEntity= ruleRemoveEntity EOF
            {
             newCompositeNode(grammarAccess.getRemoveEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRemoveEntity_in_entryRuleRemoveEntity2008);
            iv_ruleRemoveEntity=ruleRemoveEntity();

            state._fsp--;

             current =iv_ruleRemoveEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRemoveEntity2018); 

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
    // $ANTLR end "entryRuleRemoveEntity"


    // $ANTLR start "ruleRemoveEntity"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:835:1: ruleRemoveEntity returns [EObject current=null] : (otherlv_0= '!' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:838:28: ( (otherlv_0= '!' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:839:1: (otherlv_0= '!' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:839:1: (otherlv_0= '!' ( (lv_name_1_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:839:3: otherlv_0= '!' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRemoveEntity2055); 

                	newLeafNode(otherlv_0, grammarAccess.getRemoveEntityAccess().getExclamationMarkKeyword_0());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:843:1: ( (lv_name_1_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:844:1: (lv_name_1_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:844:1: (lv_name_1_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:845:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRemoveEntity2072); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRemoveEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRemoveEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRemoveEntity"


    // $ANTLR start "entryRuleAddProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:869:1: entryRuleAddProperty returns [EObject current=null] : iv_ruleAddProperty= ruleAddProperty EOF ;
    public final EObject entryRuleAddProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddProperty = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:870:2: (iv_ruleAddProperty= ruleAddProperty EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:871:2: iv_ruleAddProperty= ruleAddProperty EOF
            {
             newCompositeNode(grammarAccess.getAddPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddProperty_in_entryRuleAddProperty2113);
            iv_ruleAddProperty=ruleAddProperty();

            state._fsp--;

             current =iv_ruleAddProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddProperty2123); 

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
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:878:1: ruleAddProperty returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '+=' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_type_9_0= RULE_ID ) ) (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )? (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAddProperty() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isOrdered_4_0=null;
        Token otherlv_5=null;
        Token lv_isUnique_6_0=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token lv_upperBound_11_0=null;
        Token lv_lowerBound_12_0=null;
        Token otherlv_13=null;
        Token lv_upperBound_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_defaultValue_17_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:881:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '+=' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_type_9_0= RULE_ID ) ) (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )? (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )? ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:882:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '+=' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_type_9_0= RULE_ID ) ) (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )? (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )? )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:882:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '+=' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_type_9_0= RULE_ID ) ) (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )? (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )? )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:882:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '+=' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) ) ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_type_9_0= RULE_ID ) ) (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )? (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )?
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:882:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:883:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:883:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:884:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddProperty2165); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getAddPropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAddProperty2182); 

                	newLeafNode(otherlv_1, grammarAccess.getAddPropertyAccess().getPlusSignEqualsSignKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:904:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:906:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:906:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:907:2: ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:910:2: ( ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )* )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:911:3: ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )*
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:911:3: ( ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 >=22 && LA11_0<=23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 >=24 && LA11_0<=25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:913:4: ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:913:4: ({...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:914:5: {...}? => ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAddProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:914:108: ( ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:915:6: ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:918:6: ({...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:918:7: {...}? => (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAddProperty", "true");
            	    }
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:918:16: (otherlv_3= '!ordered' | ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==22) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==23) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:918:18: otherlv_3= '!ordered'
            	            {
            	            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAddProperty2240); 

            	                	newLeafNode(otherlv_3, grammarAccess.getAddPropertyAccess().getOrderedKeyword_2_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:923:6: ( (lv_isOrdered_4_0= 'ordered' ) )
            	            {
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:923:6: ( (lv_isOrdered_4_0= 'ordered' ) )
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:924:1: (lv_isOrdered_4_0= 'ordered' )
            	            {
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:924:1: (lv_isOrdered_4_0= 'ordered' )
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:925:3: lv_isOrdered_4_0= 'ordered'
            	            {
            	            lv_isOrdered_4_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAddProperty2264); 

            	                    newLeafNode(lv_isOrdered_4_0, grammarAccess.getAddPropertyAccess().getIsOrderedOrderedKeyword_2_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	            	        }
            	                   		setWithLastConsumed(current, "isOrdered", true, "ordered");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:945:4: ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:945:4: ({...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:946:5: {...}? => ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAddProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:946:108: ( ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:947:6: ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:950:6: ({...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:950:7: {...}? => (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAddProperty", "true");
            	    }
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:950:16: (otherlv_5= '!unique' | ( (lv_isUnique_6_0= 'unique' ) ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==24) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==25) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:950:18: otherlv_5= '!unique'
            	            {
            	            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAddProperty2345); 

            	                	newLeafNode(otherlv_5, grammarAccess.getAddPropertyAccess().getUniqueKeyword_2_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:955:6: ( (lv_isUnique_6_0= 'unique' ) )
            	            {
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:955:6: ( (lv_isUnique_6_0= 'unique' ) )
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:956:1: (lv_isUnique_6_0= 'unique' )
            	            {
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:956:1: (lv_isUnique_6_0= 'unique' )
            	            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:957:3: lv_isUnique_6_0= 'unique'
            	            {
            	            lv_isUnique_6_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAddProperty2369); 

            	                    newLeafNode(lv_isUnique_6_0, grammarAccess.getAddPropertyAccess().getIsUniqueUniqueKeyword_2_1_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	            	        }
            	                   		setWithLastConsumed(current, "isUnique", true, "unique");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	

            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:984:2: ( (lv_name_7_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:985:1: (lv_name_7_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:985:1: (lv_name_7_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:986:3: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddProperty2440); 

            			newLeafNode(lv_name_7_0, grammarAccess.getAddPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"ID");
            	    

            }


            }

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAddProperty2457); 

                	newLeafNode(otherlv_8, grammarAccess.getAddPropertyAccess().getColonKeyword_4());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1006:1: ( (lv_type_9_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1007:1: (lv_type_9_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1007:1: (lv_type_9_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1008:3: lv_type_9_0= RULE_ID
            {
            lv_type_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddProperty2474); 

            			newLeafNode(lv_type_9_0, grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_9_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1024:2: (otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1024:4: otherlv_10= '[' ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) ) otherlv_15= ']'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAddProperty2492); 

                        	newLeafNode(otherlv_10, grammarAccess.getAddPropertyAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1028:1: ( ( (lv_upperBound_11_0= RULE_INT ) ) | ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==29) ) {
                            alt13=1;
                        }
                        else if ( (LA13_1==28) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1028:2: ( (lv_upperBound_11_0= RULE_INT ) )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1028:2: ( (lv_upperBound_11_0= RULE_INT ) )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1029:1: (lv_upperBound_11_0= RULE_INT )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1029:1: (lv_upperBound_11_0= RULE_INT )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1030:3: lv_upperBound_11_0= RULE_INT
                            {
                            lv_upperBound_11_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAddProperty2510); 

                            			newLeafNode(lv_upperBound_11_0, grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAddPropertyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"upperBound",
                                    		lv_upperBound_11_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1047:6: ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1047:6: ( ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )? )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1047:7: ( (lv_lowerBound_12_0= RULE_INT ) ) otherlv_13= '..' ( (lv_upperBound_14_0= RULE_INT ) )?
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1047:7: ( (lv_lowerBound_12_0= RULE_INT ) )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1048:1: (lv_lowerBound_12_0= RULE_INT )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1048:1: (lv_lowerBound_12_0= RULE_INT )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1049:3: lv_lowerBound_12_0= RULE_INT
                            {
                            lv_lowerBound_12_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAddProperty2539); 

                            			newLeafNode(lv_lowerBound_12_0, grammarAccess.getAddPropertyAccess().getLowerBoundINTTerminalRuleCall_6_1_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAddPropertyRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lowerBound",
                                    		lv_lowerBound_12_0, 
                                    		"INT");
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAddProperty2556); 

                                	newLeafNode(otherlv_13, grammarAccess.getAddPropertyAccess().getFullStopFullStopKeyword_6_1_1_1());
                                
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1069:1: ( (lv_upperBound_14_0= RULE_INT ) )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==RULE_INT) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1070:1: (lv_upperBound_14_0= RULE_INT )
                                    {
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1070:1: (lv_upperBound_14_0= RULE_INT )
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1071:3: lv_upperBound_14_0= RULE_INT
                                    {
                                    lv_upperBound_14_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAddProperty2573); 

                                    			newLeafNode(lv_upperBound_14_0, grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_1_2_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getAddPropertyRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"upperBound",
                                            		lv_upperBound_14_0, 
                                            		"INT");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAddProperty2593); 

                        	newLeafNode(otherlv_15, grammarAccess.getAddPropertyAccess().getRightSquareBracketKeyword_6_2());
                        

                    }
                    break;

            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1091:3: (otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1091:5: otherlv_16= '=' ( (lv_defaultValue_17_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAddProperty2608); 

                        	newLeafNode(otherlv_16, grammarAccess.getAddPropertyAccess().getEqualsSignKeyword_7_0());
                        
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1095:1: ( (lv_defaultValue_17_0= RULE_ID ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1096:1: (lv_defaultValue_17_0= RULE_ID )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1096:1: (lv_defaultValue_17_0= RULE_ID )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1097:3: lv_defaultValue_17_0= RULE_ID
                    {
                    lv_defaultValue_17_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAddProperty2625); 

                    			newLeafNode(lv_defaultValue_17_0, grammarAccess.getAddPropertyAccess().getDefaultValueIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_17_0, 
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
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleRenameProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1121:1: entryRuleRenameProperty returns [EObject current=null] : iv_ruleRenameProperty= ruleRenameProperty EOF ;
    public final EObject entryRuleRenameProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameProperty = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1122:2: (iv_ruleRenameProperty= ruleRenameProperty EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1123:2: iv_ruleRenameProperty= ruleRenameProperty EOF
            {
             newCompositeNode(grammarAccess.getRenamePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameProperty_in_entryRuleRenameProperty2668);
            iv_ruleRenameProperty=ruleRenameProperty();

            state._fsp--;

             current =iv_ruleRenameProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameProperty2678); 

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
    // $ANTLR end "entryRuleRenameProperty"


    // $ANTLR start "ruleRenameProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1130:1: ruleRenameProperty returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_newName_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRenameProperty() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_newName_4_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1133:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_newName_4_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1134:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_newName_4_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1134:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_newName_4_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1134:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_newName_4_0= RULE_ID ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1134:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1135:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1135:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1136:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameProperty2720); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getRenamePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenamePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRenameProperty2737); 

                	newLeafNode(otherlv_1, grammarAccess.getRenamePropertyAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1156:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1157:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1157:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1158:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameProperty2754); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRenamePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenamePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRenameProperty2771); 

                	newLeafNode(otherlv_3, grammarAccess.getRenamePropertyAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1178:1: ( (lv_newName_4_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1179:1: (lv_newName_4_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1179:1: (lv_newName_4_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1180:3: lv_newName_4_0= RULE_ID
            {
            lv_newName_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRenameProperty2788); 

            			newLeafNode(lv_newName_4_0, grammarAccess.getRenamePropertyAccess().getNewNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRenamePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newName",
                    		lv_newName_4_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRenameProperty"


    // $ANTLR start "entryRuleRemoveProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1204:1: entryRuleRemoveProperty returns [EObject current=null] : iv_ruleRemoveProperty= ruleRemoveProperty EOF ;
    public final EObject entryRuleRemoveProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveProperty = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1205:2: (iv_ruleRemoveProperty= ruleRemoveProperty EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1206:2: iv_ruleRemoveProperty= ruleRemoveProperty EOF
            {
             newCompositeNode(grammarAccess.getRemovePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRemoveProperty_in_entryRuleRemoveProperty2829);
            iv_ruleRemoveProperty=ruleRemoveProperty();

            state._fsp--;

             current =iv_ruleRemoveProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRemoveProperty2839); 

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
    // $ANTLR end "entryRuleRemoveProperty"


    // $ANTLR start "ruleRemoveProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1213:1: ruleRemoveProperty returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '-=' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRemoveProperty() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1216:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '-=' ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1217:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '-=' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1217:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '-=' ( (lv_name_2_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1217:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '-=' ( (lv_name_2_0= RULE_ID ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1217:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1218:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1218:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1219:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRemoveProperty2881); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getRemovePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRemovePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRemoveProperty2898); 

                	newLeafNode(otherlv_1, grammarAccess.getRemovePropertyAccess().getHyphenMinusEqualsSignKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1239:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1240:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1240:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1241:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRemoveProperty2915); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRemovePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRemovePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRemoveProperty"


    // $ANTLR start "entryRuleSetType"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1265:1: entryRuleSetType returns [EObject current=null] : iv_ruleSetType= ruleSetType EOF ;
    public final EObject entryRuleSetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetType = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1266:2: (iv_ruleSetType= ruleSetType EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1267:2: iv_ruleSetType= ruleSetType EOF
            {
             newCompositeNode(grammarAccess.getSetTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetType_in_entryRuleSetType2956);
            iv_ruleSetType=ruleSetType();

            state._fsp--;

             current =iv_ruleSetType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetType2966); 

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
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1274:1: ruleSetType returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ;
    public final EObject ruleSetType() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1277:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1278:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1278:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1278:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1278:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1279:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1279:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1280:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetType3008); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getSetTypeAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetType3025); 

                	newLeafNode(otherlv_1, grammarAccess.getSetTypeAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1300:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1301:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1301:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1302:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetType3042); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSetTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSetType3059); 

                	newLeafNode(otherlv_3, grammarAccess.getSetTypeAccess().getColonKeyword_3());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1322:1: ( (lv_type_4_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1323:1: (lv_type_4_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1323:1: (lv_type_4_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1324:3: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetType3076); 

            			newLeafNode(lv_type_4_0, grammarAccess.getSetTypeAccess().getTypeIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRuleSetOpposite"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1348:1: entryRuleSetOpposite returns [EObject current=null] : iv_ruleSetOpposite= ruleSetOpposite EOF ;
    public final EObject entryRuleSetOpposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOpposite = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1349:2: (iv_ruleSetOpposite= ruleSetOpposite EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1350:2: iv_ruleSetOpposite= ruleSetOpposite EOF
            {
             newCompositeNode(grammarAccess.getSetOppositeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetOpposite_in_entryRuleSetOpposite3117);
            iv_ruleSetOpposite=ruleSetOpposite();

            state._fsp--;

             current =iv_ruleSetOpposite; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetOpposite3127); 

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
    // $ANTLR end "entryRuleSetOpposite"


    // $ANTLR start "ruleSetOpposite"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1357:1: ruleSetOpposite returns [EObject current=null] : ( ( (lv_firstClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_firstPropertyName_2_0= RULE_ID ) ) ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' ) ( (lv_secondClassName_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_secondPropertyName_7_0= RULE_ID ) ) ) ;
    public final EObject ruleSetOpposite() throws RecognitionException {
        EObject current = null;

        Token lv_firstClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_firstPropertyName_2_0=null;
        Token lv_isOpposite_3_0=null;
        Token otherlv_4=null;
        Token lv_secondClassName_5_0=null;
        Token otherlv_6=null;
        Token lv_secondPropertyName_7_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1360:28: ( ( ( (lv_firstClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_firstPropertyName_2_0= RULE_ID ) ) ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' ) ( (lv_secondClassName_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_secondPropertyName_7_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1361:1: ( ( (lv_firstClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_firstPropertyName_2_0= RULE_ID ) ) ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' ) ( (lv_secondClassName_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_secondPropertyName_7_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1361:1: ( ( (lv_firstClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_firstPropertyName_2_0= RULE_ID ) ) ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' ) ( (lv_secondClassName_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_secondPropertyName_7_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1361:2: ( (lv_firstClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_firstPropertyName_2_0= RULE_ID ) ) ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' ) ( (lv_secondClassName_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_secondPropertyName_7_0= RULE_ID ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1361:2: ( (lv_firstClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1362:1: (lv_firstClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1362:1: (lv_firstClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1363:3: lv_firstClassName_0_0= RULE_ID
            {
            lv_firstClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOpposite3169); 

            			newLeafNode(lv_firstClassName_0_0, grammarAccess.getSetOppositeAccess().getFirstClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOppositeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstClassName",
                    		lv_firstClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetOpposite3186); 

                	newLeafNode(otherlv_1, grammarAccess.getSetOppositeAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1383:1: ( (lv_firstPropertyName_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1384:1: (lv_firstPropertyName_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1384:1: (lv_firstPropertyName_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1385:3: lv_firstPropertyName_2_0= RULE_ID
            {
            lv_firstPropertyName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOpposite3203); 

            			newLeafNode(lv_firstPropertyName_2_0, grammarAccess.getSetOppositeAccess().getFirstPropertyNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOppositeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"firstPropertyName",
                    		lv_firstPropertyName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1401:2: ( ( (lv_isOpposite_3_0= '<->' ) ) | otherlv_4= '!<->' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1401:3: ( (lv_isOpposite_3_0= '<->' ) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1401:3: ( (lv_isOpposite_3_0= '<->' ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1402:1: (lv_isOpposite_3_0= '<->' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1402:1: (lv_isOpposite_3_0= '<->' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1403:3: lv_isOpposite_3_0= '<->'
                    {
                    lv_isOpposite_3_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSetOpposite3227); 

                            newLeafNode(lv_isOpposite_3_0, grammarAccess.getSetOppositeAccess().getIsOppositeLessThanSignHyphenMinusGreaterThanSignKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetOppositeRule());
                    	        }
                           		setWithLastConsumed(current, "isOpposite", true, "<->");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1417:7: otherlv_4= '!<->'
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSetOpposite3258); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetOppositeAccess().getExclamationMarkLessThanSignHyphenMinusGreaterThanSignKeyword_3_1());
                        

                    }
                    break;

            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1421:2: ( (lv_secondClassName_5_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1422:1: (lv_secondClassName_5_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1422:1: (lv_secondClassName_5_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1423:3: lv_secondClassName_5_0= RULE_ID
            {
            lv_secondClassName_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOpposite3276); 

            			newLeafNode(lv_secondClassName_5_0, grammarAccess.getSetOppositeAccess().getSecondClassNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOppositeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"secondClassName",
                    		lv_secondClassName_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetOpposite3293); 

                	newLeafNode(otherlv_6, grammarAccess.getSetOppositeAccess().getFullStopKeyword_5());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1443:1: ( (lv_secondPropertyName_7_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1444:1: (lv_secondPropertyName_7_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1444:1: (lv_secondPropertyName_7_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1445:3: lv_secondPropertyName_7_0= RULE_ID
            {
            lv_secondPropertyName_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOpposite3310); 

            			newLeafNode(lv_secondPropertyName_7_0, grammarAccess.getSetOppositeAccess().getSecondPropertyNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOppositeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"secondPropertyName",
                    		lv_secondPropertyName_7_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSetOpposite"


    // $ANTLR start "entryRuleSetBounds"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1469:1: entryRuleSetBounds returns [EObject current=null] : iv_ruleSetBounds= ruleSetBounds EOF ;
    public final EObject entryRuleSetBounds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetBounds = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1470:2: (iv_ruleSetBounds= ruleSetBounds EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1471:2: iv_ruleSetBounds= ruleSetBounds EOF
            {
             newCompositeNode(grammarAccess.getSetBoundsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetBounds_in_entryRuleSetBounds3351);
            iv_ruleSetBounds=ruleSetBounds();

            state._fsp--;

             current =iv_ruleSetBounds; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetBounds3361); 

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
    // $ANTLR end "entryRuleSetBounds"


    // $ANTLR start "ruleSetBounds"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1478:1: ruleSetBounds returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleSetBounds() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_upperBound_4_0=null;
        Token lv_lowerBound_5_0=null;
        Token otherlv_6=null;
        Token lv_upperBound_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1481:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )? ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1482:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )? )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1482:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )? )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1482:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )?
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1482:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1483:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1483:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1484:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetBounds3403); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getSetBoundsAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetBounds3420); 

                	newLeafNode(otherlv_1, grammarAccess.getSetBoundsAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1504:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1505:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1505:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1506:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetBounds3437); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSetBoundsAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetBoundsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1522:2: (otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1522:4: otherlv_3= '[' ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) ) otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSetBounds3455); 

                        	newLeafNode(otherlv_3, grammarAccess.getSetBoundsAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1526:1: ( ( (lv_upperBound_4_0= RULE_INT ) ) | ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_INT) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==28) ) {
                            alt18=2;
                        }
                        else if ( (LA18_1==29) ) {
                            alt18=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1526:2: ( (lv_upperBound_4_0= RULE_INT ) )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1526:2: ( (lv_upperBound_4_0= RULE_INT ) )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1527:1: (lv_upperBound_4_0= RULE_INT )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1527:1: (lv_upperBound_4_0= RULE_INT )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1528:3: lv_upperBound_4_0= RULE_INT
                            {
                            lv_upperBound_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSetBounds3473); 

                            			newLeafNode(lv_upperBound_4_0, grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSetBoundsRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"upperBound",
                                    		lv_upperBound_4_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1545:6: ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1545:6: ( ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )? )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1545:7: ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '..' ( (lv_upperBound_7_0= RULE_INT ) )?
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1545:7: ( (lv_lowerBound_5_0= RULE_INT ) )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1546:1: (lv_lowerBound_5_0= RULE_INT )
                            {
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1546:1: (lv_lowerBound_5_0= RULE_INT )
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1547:3: lv_lowerBound_5_0= RULE_INT
                            {
                            lv_lowerBound_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSetBounds3502); 

                            			newLeafNode(lv_lowerBound_5_0, grammarAccess.getSetBoundsAccess().getLowerBoundINTTerminalRuleCall_3_1_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSetBoundsRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"lowerBound",
                                    		lv_lowerBound_5_0, 
                                    		"INT");
                            	    

                            }


                            }

                            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSetBounds3519); 

                                	newLeafNode(otherlv_6, grammarAccess.getSetBoundsAccess().getFullStopFullStopKeyword_3_1_1_1());
                                
                            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1567:1: ( (lv_upperBound_7_0= RULE_INT ) )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==RULE_INT) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1568:1: (lv_upperBound_7_0= RULE_INT )
                                    {
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1568:1: (lv_upperBound_7_0= RULE_INT )
                                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1569:3: lv_upperBound_7_0= RULE_INT
                                    {
                                    lv_upperBound_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSetBounds3536); 

                                    			newLeafNode(lv_upperBound_7_0, grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_1_2_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getSetBoundsRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"upperBound",
                                            		lv_upperBound_7_0, 
                                            		"INT");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSetBounds3556); 

                        	newLeafNode(otherlv_8, grammarAccess.getSetBoundsAccess().getRightSquareBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleSetBounds"


    // $ANTLR start "entryRuleSetOrdered"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1597:1: entryRuleSetOrdered returns [EObject current=null] : iv_ruleSetOrdered= ruleSetOrdered EOF ;
    public final EObject entryRuleSetOrdered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetOrdered = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1598:2: (iv_ruleSetOrdered= ruleSetOrdered EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1599:2: iv_ruleSetOrdered= ruleSetOrdered EOF
            {
             newCompositeNode(grammarAccess.getSetOrderedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetOrdered_in_entryRuleSetOrdered3594);
            iv_ruleSetOrdered=ruleSetOrdered();

            state._fsp--;

             current =iv_ruleSetOrdered; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetOrdered3604); 

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
    // $ANTLR end "entryRuleSetOrdered"


    // $ANTLR start "ruleSetOrdered"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1606:1: ruleSetOrdered returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' ) ) ;
    public final EObject ruleSetOrdered() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_isOrdered_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1609:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1610:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1610:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1610:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1610:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1611:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1611:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1612:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOrdered3646); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getSetOrderedAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOrderedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetOrdered3663); 

                	newLeafNode(otherlv_1, grammarAccess.getSetOrderedAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1632:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1633:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1633:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1634:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetOrdered3680); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSetOrderedAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetOrderedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1650:2: ( ( (lv_isOrdered_3_0= 'ordered' ) ) | otherlv_4= '!ordered' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1650:3: ( (lv_isOrdered_3_0= 'ordered' ) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1650:3: ( (lv_isOrdered_3_0= 'ordered' ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1651:1: (lv_isOrdered_3_0= 'ordered' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1651:1: (lv_isOrdered_3_0= 'ordered' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1652:3: lv_isOrdered_3_0= 'ordered'
                    {
                    lv_isOrdered_3_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSetOrdered3704); 

                            newLeafNode(lv_isOrdered_3_0, grammarAccess.getSetOrderedAccess().getIsOrderedOrderedKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetOrderedRule());
                    	        }
                           		setWithLastConsumed(current, "isOrdered", true, "ordered");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1666:7: otherlv_4= '!ordered'
                    {
                    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSetOrdered3735); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetOrderedAccess().getOrderedKeyword_3_1());
                        

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
    // $ANTLR end "ruleSetOrdered"


    // $ANTLR start "entryRuleSetUnique"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1678:1: entryRuleSetUnique returns [EObject current=null] : iv_ruleSetUnique= ruleSetUnique EOF ;
    public final EObject entryRuleSetUnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetUnique = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1679:2: (iv_ruleSetUnique= ruleSetUnique EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1680:2: iv_ruleSetUnique= ruleSetUnique EOF
            {
             newCompositeNode(grammarAccess.getSetUniqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetUnique_in_entryRuleSetUnique3772);
            iv_ruleSetUnique=ruleSetUnique();

            state._fsp--;

             current =iv_ruleSetUnique; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetUnique3782); 

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
    // $ANTLR end "entryRuleSetUnique"


    // $ANTLR start "ruleSetUnique"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1687:1: ruleSetUnique returns [EObject current=null] : ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' ) ) ;
    public final EObject ruleSetUnique() throws RecognitionException {
        EObject current = null;

        Token lv_owningClassName_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_isUnique_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1690:28: ( ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1691:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1691:1: ( ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1691:2: ( (lv_owningClassName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1691:2: ( (lv_owningClassName_0_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1692:1: (lv_owningClassName_0_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1692:1: (lv_owningClassName_0_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1693:3: lv_owningClassName_0_0= RULE_ID
            {
            lv_owningClassName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetUnique3824); 

            			newLeafNode(lv_owningClassName_0_0, grammarAccess.getSetUniqueAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetUniqueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSetUnique3841); 

                	newLeafNode(otherlv_1, grammarAccess.getSetUniqueAccess().getFullStopKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1713:1: ( (lv_name_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1714:1: (lv_name_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1714:1: (lv_name_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1715:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSetUnique3858); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSetUniqueAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetUniqueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1731:2: ( ( (lv_isUnique_3_0= 'unique' ) ) | otherlv_4= '!unique' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1731:3: ( (lv_isUnique_3_0= 'unique' ) )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1731:3: ( (lv_isUnique_3_0= 'unique' ) )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1732:1: (lv_isUnique_3_0= 'unique' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1732:1: (lv_isUnique_3_0= 'unique' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1733:3: lv_isUnique_3_0= 'unique'
                    {
                    lv_isUnique_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSetUnique3882); 

                            newLeafNode(lv_isUnique_3_0, grammarAccess.getSetUniqueAccess().getIsUniqueUniqueKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetUniqueRule());
                    	        }
                           		setWithLastConsumed(current, "isUnique", true, "unique");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1747:7: otherlv_4= '!unique'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSetUnique3913); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetUniqueAccess().getUniqueKeyword_3_1());
                        

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
    // $ANTLR end "ruleSetUnique"


    // $ANTLR start "entryRuleCopyProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1759:1: entryRuleCopyProperty returns [EObject current=null] : iv_ruleCopyProperty= ruleCopyProperty EOF ;
    public final EObject entryRuleCopyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopyProperty = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1760:2: (iv_ruleCopyProperty= ruleCopyProperty EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1761:2: iv_ruleCopyProperty= ruleCopyProperty EOF
            {
             newCompositeNode(grammarAccess.getCopyPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopyProperty_in_entryRuleCopyProperty3950);
            iv_ruleCopyProperty=ruleCopyProperty();

            state._fsp--;

             current =iv_ruleCopyProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopyProperty3960); 

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
    // $ANTLR end "entryRuleCopyProperty"


    // $ANTLR start "ruleCopyProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1768:1: ruleCopyProperty returns [EObject current=null] : (otherlv_0= 'copy' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) ) ;
    public final EObject ruleCopyProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_owningClassName_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_targetClassName_6_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1771:28: ( (otherlv_0= 'copy' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1772:1: (otherlv_0= 'copy' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1772:1: (otherlv_0= 'copy' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1772:3: otherlv_0= 'copy' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleCopyProperty3997); 

                	newLeafNode(otherlv_0, grammarAccess.getCopyPropertyAccess().getCopyKeyword_0());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1776:1: ( (lv_type_1_0= ruleMergeType ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1777:1: (lv_type_1_0= ruleMergeType )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1777:1: (lv_type_1_0= ruleMergeType )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1778:3: lv_type_1_0= ruleMergeType
            {
             
            	        newCompositeNode(grammarAccess.getCopyPropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMergeType_in_ruleCopyProperty4018);
            lv_type_1_0=ruleMergeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCopyPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"MergeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1794:2: ( (lv_owningClassName_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1795:1: (lv_owningClassName_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1795:1: (lv_owningClassName_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1796:3: lv_owningClassName_2_0= RULE_ID
            {
            lv_owningClassName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCopyProperty4035); 

            			newLeafNode(lv_owningClassName_2_0, grammarAccess.getCopyPropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCopyProperty4052); 

                	newLeafNode(otherlv_3, grammarAccess.getCopyPropertyAccess().getFullStopKeyword_3());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1816:1: ( (lv_name_4_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1817:1: (lv_name_4_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1817:1: (lv_name_4_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1818:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCopyProperty4069); 

            			newLeafNode(lv_name_4_0, grammarAccess.getCopyPropertyAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCopyProperty4086); 

                	newLeafNode(otherlv_5, grammarAccess.getCopyPropertyAccess().getHyphenMinusGreaterThanSignKeyword_5());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1838:1: ( (lv_targetClassName_6_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1839:1: (lv_targetClassName_6_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1839:1: (lv_targetClassName_6_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1840:3: lv_targetClassName_6_0= RULE_ID
            {
            lv_targetClassName_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCopyProperty4103); 

            			newLeafNode(lv_targetClassName_6_0, grammarAccess.getCopyPropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCopyPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetClassName",
                    		lv_targetClassName_6_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCopyProperty"


    // $ANTLR start "entryRuleMoveProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1864:1: entryRuleMoveProperty returns [EObject current=null] : iv_ruleMoveProperty= ruleMoveProperty EOF ;
    public final EObject entryRuleMoveProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveProperty = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1865:2: (iv_ruleMoveProperty= ruleMoveProperty EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1866:2: iv_ruleMoveProperty= ruleMoveProperty EOF
            {
             newCompositeNode(grammarAccess.getMovePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveProperty_in_entryRuleMoveProperty4144);
            iv_ruleMoveProperty=ruleMoveProperty();

            state._fsp--;

             current =iv_ruleMoveProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveProperty4154); 

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
    // $ANTLR end "entryRuleMoveProperty"


    // $ANTLR start "ruleMoveProperty"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1873:1: ruleMoveProperty returns [EObject current=null] : (otherlv_0= 'move' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) ) ;
    public final EObject ruleMoveProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_owningClassName_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_targetClassName_6_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1876:28: ( (otherlv_0= 'move' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1877:1: (otherlv_0= 'move' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1877:1: (otherlv_0= 'move' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1877:3: otherlv_0= 'move' ( (lv_type_1_0= ruleMergeType ) ) ( (lv_owningClassName_2_0= RULE_ID ) ) otherlv_3= '.' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '->' ( (lv_targetClassName_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMoveProperty4191); 

                	newLeafNode(otherlv_0, grammarAccess.getMovePropertyAccess().getMoveKeyword_0());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1881:1: ( (lv_type_1_0= ruleMergeType ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1882:1: (lv_type_1_0= ruleMergeType )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1882:1: (lv_type_1_0= ruleMergeType )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1883:3: lv_type_1_0= ruleMergeType
            {
             
            	        newCompositeNode(grammarAccess.getMovePropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMergeType_in_ruleMoveProperty4212);
            lv_type_1_0=ruleMergeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMovePropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"MergeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1899:2: ( (lv_owningClassName_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1900:1: (lv_owningClassName_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1900:1: (lv_owningClassName_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1901:3: lv_owningClassName_2_0= RULE_ID
            {
            lv_owningClassName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveProperty4229); 

            			newLeafNode(lv_owningClassName_2_0, grammarAccess.getMovePropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMovePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"owningClassName",
                    		lv_owningClassName_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMoveProperty4246); 

                	newLeafNode(otherlv_3, grammarAccess.getMovePropertyAccess().getFullStopKeyword_3());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1921:1: ( (lv_name_4_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1922:1: (lv_name_4_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1922:1: (lv_name_4_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1923:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveProperty4263); 

            			newLeafNode(lv_name_4_0, grammarAccess.getMovePropertyAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMovePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMoveProperty4280); 

                	newLeafNode(otherlv_5, grammarAccess.getMovePropertyAccess().getHyphenMinusGreaterThanSignKeyword_5());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1943:1: ( (lv_targetClassName_6_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1944:1: (lv_targetClassName_6_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1944:1: (lv_targetClassName_6_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1945:3: lv_targetClassName_6_0= RULE_ID
            {
            lv_targetClassName_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMoveProperty4297); 

            			newLeafNode(lv_targetClassName_6_0, grammarAccess.getMovePropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMovePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetClassName",
                    		lv_targetClassName_6_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMoveProperty"


    // $ANTLR start "entryRuleExtractClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1969:1: entryRuleExtractClass returns [EObject current=null] : iv_ruleExtractClass= ruleExtractClass EOF ;
    public final EObject entryRuleExtractClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractClass = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1970:2: (iv_ruleExtractClass= ruleExtractClass EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1971:2: iv_ruleExtractClass= ruleExtractClass EOF
            {
             newCompositeNode(grammarAccess.getExtractClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractClass_in_entryRuleExtractClass4338);
            iv_ruleExtractClass=ruleExtractClass();

            state._fsp--;

             current =iv_ruleExtractClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractClass4348); 

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
    // $ANTLR end "entryRuleExtractClass"


    // $ANTLR start "ruleExtractClass"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1978:1: ruleExtractClass returns [EObject current=null] : (otherlv_0= 'extract' ( (lv_sourceClassName_1_0= RULE_ID ) ) otherlv_2= '.' otherlv_3= '[' ( (lv_extractPropertiesNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )* otherlv_7= ']' otherlv_8= '->' ( (lv_extractClassName_9_0= RULE_ID ) ) ) ;
    public final EObject ruleExtractClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sourceClassName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_extractPropertiesNames_4_0=null;
        Token otherlv_5=null;
        Token lv_extractPropertiesNames_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_extractClassName_9_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1981:28: ( (otherlv_0= 'extract' ( (lv_sourceClassName_1_0= RULE_ID ) ) otherlv_2= '.' otherlv_3= '[' ( (lv_extractPropertiesNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )* otherlv_7= ']' otherlv_8= '->' ( (lv_extractClassName_9_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1982:1: (otherlv_0= 'extract' ( (lv_sourceClassName_1_0= RULE_ID ) ) otherlv_2= '.' otherlv_3= '[' ( (lv_extractPropertiesNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )* otherlv_7= ']' otherlv_8= '->' ( (lv_extractClassName_9_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1982:1: (otherlv_0= 'extract' ( (lv_sourceClassName_1_0= RULE_ID ) ) otherlv_2= '.' otherlv_3= '[' ( (lv_extractPropertiesNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )* otherlv_7= ']' otherlv_8= '->' ( (lv_extractClassName_9_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1982:3: otherlv_0= 'extract' ( (lv_sourceClassName_1_0= RULE_ID ) ) otherlv_2= '.' otherlv_3= '[' ( (lv_extractPropertiesNames_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )* otherlv_7= ']' otherlv_8= '->' ( (lv_extractClassName_9_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleExtractClass4385); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractClassAccess().getExtractKeyword_0());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1986:1: ( (lv_sourceClassName_1_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1987:1: (lv_sourceClassName_1_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1987:1: (lv_sourceClassName_1_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:1988:3: lv_sourceClassName_1_0= RULE_ID
            {
            lv_sourceClassName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractClass4402); 

            			newLeafNode(lv_sourceClassName_1_0, grammarAccess.getExtractClassAccess().getSourceClassNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourceClassName",
                    		lv_sourceClassName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleExtractClass4419); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractClassAccess().getFullStopKeyword_2());
                
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtractClass4431); 

                	newLeafNode(otherlv_3, grammarAccess.getExtractClassAccess().getLeftSquareBracketKeyword_3());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2012:1: ( (lv_extractPropertiesNames_4_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2013:1: (lv_extractPropertiesNames_4_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2013:1: (lv_extractPropertiesNames_4_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2014:3: lv_extractPropertiesNames_4_0= RULE_ID
            {
            lv_extractPropertiesNames_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractClass4448); 

            			newLeafNode(lv_extractPropertiesNames_4_0, grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractClassRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"extractPropertiesNames",
                    		lv_extractPropertiesNames_4_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2030:2: (otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2030:4: otherlv_5= ',' ( (lv_extractPropertiesNames_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleExtractClass4466); 

            	        	newLeafNode(otherlv_5, grammarAccess.getExtractClassAccess().getCommaKeyword_5_0());
            	        
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2034:1: ( (lv_extractPropertiesNames_6_0= RULE_ID ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2035:1: (lv_extractPropertiesNames_6_0= RULE_ID )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2035:1: (lv_extractPropertiesNames_6_0= RULE_ID )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2036:3: lv_extractPropertiesNames_6_0= RULE_ID
            	    {
            	    lv_extractPropertiesNames_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractClass4483); 

            	    			newLeafNode(lv_extractPropertiesNames_6_0, grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractClassRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"extractPropertiesNames",
            	            		lv_extractPropertiesNames_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExtractClass4502); 

                	newLeafNode(otherlv_7, grammarAccess.getExtractClassAccess().getRightSquareBracketKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtractClass4514); 

                	newLeafNode(otherlv_8, grammarAccess.getExtractClassAccess().getHyphenMinusGreaterThanSignKeyword_7());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2060:1: ( (lv_extractClassName_9_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2061:1: (lv_extractClassName_9_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2061:1: (lv_extractClassName_9_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2062:3: lv_extractClassName_9_0= RULE_ID
            {
            lv_extractClassName_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractClass4531); 

            			newLeafNode(lv_extractClassName_9_0, grammarAccess.getExtractClassAccess().getExtractClassNameIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"extractClassName",
                    		lv_extractClassName_9_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleExtractClass"


    // $ANTLR start "entryRuleExtractParent"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2086:1: entryRuleExtractParent returns [EObject current=null] : iv_ruleExtractParent= ruleExtractParent EOF ;
    public final EObject entryRuleExtractParent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractParent = null;


        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2087:2: (iv_ruleExtractParent= ruleExtractParent EOF )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2088:2: iv_ruleExtractParent= ruleExtractParent EOF
            {
             newCompositeNode(grammarAccess.getExtractParentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractParent_in_entryRuleExtractParent4572);
            iv_ruleExtractParent=ruleExtractParent();

            state._fsp--;

             current =iv_ruleExtractParent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractParent4582); 

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
    // $ANTLR end "entryRuleExtractParent"


    // $ANTLR start "ruleExtractParent"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2095:1: ruleExtractParent returns [EObject current=null] : (otherlv_0= 'extract' otherlv_1= '[' ( (lv_sourceClassesName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )* otherlv_5= ']' otherlv_6= '.' otherlv_7= '[' ( (lv_extractPropertiesName_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '->' ( (lv_extractParentName_13_0= RULE_ID ) ) ) ;
    public final EObject ruleExtractParent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sourceClassesName_2_0=null;
        Token otherlv_3=null;
        Token lv_sourceClassesName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_extractPropertiesName_8_0=null;
        Token otherlv_9=null;
        Token lv_extractPropertiesName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_extractParentName_13_0=null;

         enterRule(); 
            
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2098:28: ( (otherlv_0= 'extract' otherlv_1= '[' ( (lv_sourceClassesName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )* otherlv_5= ']' otherlv_6= '.' otherlv_7= '[' ( (lv_extractPropertiesName_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '->' ( (lv_extractParentName_13_0= RULE_ID ) ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2099:1: (otherlv_0= 'extract' otherlv_1= '[' ( (lv_sourceClassesName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )* otherlv_5= ']' otherlv_6= '.' otherlv_7= '[' ( (lv_extractPropertiesName_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '->' ( (lv_extractParentName_13_0= RULE_ID ) ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2099:1: (otherlv_0= 'extract' otherlv_1= '[' ( (lv_sourceClassesName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )* otherlv_5= ']' otherlv_6= '.' otherlv_7= '[' ( (lv_extractPropertiesName_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '->' ( (lv_extractParentName_13_0= RULE_ID ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2099:3: otherlv_0= 'extract' otherlv_1= '[' ( (lv_sourceClassesName_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )* otherlv_5= ']' otherlv_6= '.' otherlv_7= '[' ( (lv_extractPropertiesName_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )* otherlv_11= ']' otherlv_12= '->' ( (lv_extractParentName_13_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleExtractParent4619); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractParentAccess().getExtractKeyword_0());
                
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtractParent4631); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_1());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2107:1: ( (lv_sourceClassesName_2_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2108:1: (lv_sourceClassesName_2_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2108:1: (lv_sourceClassesName_2_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2109:3: lv_sourceClassesName_2_0= RULE_ID
            {
            lv_sourceClassesName_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractParent4648); 

            			newLeafNode(lv_sourceClassesName_2_0, grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractParentRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"sourceClassesName",
                    		lv_sourceClassesName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2125:2: (otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2125:4: otherlv_3= ',' ( (lv_sourceClassesName_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleExtractParent4666); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExtractParentAccess().getCommaKeyword_3_0());
            	        
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2129:1: ( (lv_sourceClassesName_4_0= RULE_ID ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2130:1: (lv_sourceClassesName_4_0= RULE_ID )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2130:1: (lv_sourceClassesName_4_0= RULE_ID )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2131:3: lv_sourceClassesName_4_0= RULE_ID
            	    {
            	    lv_sourceClassesName_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractParent4683); 

            	    			newLeafNode(lv_sourceClassesName_4_0, grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractParentRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"sourceClassesName",
            	            		lv_sourceClassesName_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExtractParent4702); 

                	newLeafNode(otherlv_5, grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleExtractParent4714); 

                	newLeafNode(otherlv_6, grammarAccess.getExtractParentAccess().getFullStopKeyword_5());
                
            otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtractParent4726); 

                	newLeafNode(otherlv_7, grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_6());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2159:1: ( (lv_extractPropertiesName_8_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2160:1: (lv_extractPropertiesName_8_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2160:1: (lv_extractPropertiesName_8_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2161:3: lv_extractPropertiesName_8_0= RULE_ID
            {
            lv_extractPropertiesName_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractParent4743); 

            			newLeafNode(lv_extractPropertiesName_8_0, grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractParentRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"extractPropertiesName",
                    		lv_extractPropertiesName_8_0, 
                    		"ID");
            	    

            }


            }

            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2177:2: (otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2177:4: otherlv_9= ',' ( (lv_extractPropertiesName_10_0= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleExtractParent4761); 

            	        	newLeafNode(otherlv_9, grammarAccess.getExtractParentAccess().getCommaKeyword_8_0());
            	        
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2181:1: ( (lv_extractPropertiesName_10_0= RULE_ID ) )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2182:1: (lv_extractPropertiesName_10_0= RULE_ID )
            	    {
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2182:1: (lv_extractPropertiesName_10_0= RULE_ID )
            	    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2183:3: lv_extractPropertiesName_10_0= RULE_ID
            	    {
            	    lv_extractPropertiesName_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractParent4778); 

            	    			newLeafNode(lv_extractPropertiesName_10_0, grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_8_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractParentRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"extractPropertiesName",
            	            		lv_extractPropertiesName_10_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExtractParent4797); 

                	newLeafNode(otherlv_11, grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_9());
                
            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtractParent4809); 

                	newLeafNode(otherlv_12, grammarAccess.getExtractParentAccess().getHyphenMinusGreaterThanSignKeyword_10());
                
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2207:1: ( (lv_extractParentName_13_0= RULE_ID ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2208:1: (lv_extractParentName_13_0= RULE_ID )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2208:1: (lv_extractParentName_13_0= RULE_ID )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2209:3: lv_extractParentName_13_0= RULE_ID
            {
            lv_extractParentName_13_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtractParent4826); 

            			newLeafNode(lv_extractParentName_13_0, grammarAccess.getExtractParentAccess().getExtractParentNameIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtractParentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"extractParentName",
                    		lv_extractParentName_13_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleExtractParent"


    // $ANTLR start "ruleMergeType"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2235:1: ruleMergeType returns [Enumerator current=null] : ( (enumLiteral_0= 'strict' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'tolerant' ) ) ;
    public final Enumerator ruleMergeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2237:28: ( ( (enumLiteral_0= 'strict' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'tolerant' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2238:1: ( (enumLiteral_0= 'strict' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'tolerant' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2238:1: ( (enumLiteral_0= 'strict' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'tolerant' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2238:2: (enumLiteral_0= 'strict' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2238:2: (enumLiteral_0= 'strict' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2238:4: enumLiteral_0= 'strict'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMergeType4883); 

                            current = grammarAccess.getMergeTypeAccess().getStrictEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMergeTypeAccess().getStrictEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2244:6: (enumLiteral_1= 'force' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2244:6: (enumLiteral_1= 'force' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2244:8: enumLiteral_1= 'force'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMergeType4900); 

                            current = grammarAccess.getMergeTypeAccess().getForceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMergeTypeAccess().getForceEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2250:6: (enumLiteral_2= 'tolerant' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2250:6: (enumLiteral_2= 'tolerant' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2250:8: enumLiteral_2= 'tolerant'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMergeType4917); 

                            current = grammarAccess.getMergeTypeAccess().getTolerantEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMergeTypeAccess().getTolerantEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleMergeType"


    // $ANTLR start "rulePrimitiveType"
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2260:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2262:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2263:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2263:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'int' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt26=1;
                }
                break;
            case 42:
                {
                alt26=2;
                }
                break;
            case 43:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2263:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2263:2: (enumLiteral_0= 'boolean' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2263:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_rulePrimitiveType4962); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2269:6: (enumLiteral_1= 'char' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2269:6: (enumLiteral_1= 'char' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2269:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePrimitiveType4979); 

                            current = grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2275:6: (enumLiteral_2= 'int' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2275:6: (enumLiteral_2= 'int' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2275:8: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePrimitiveType4996); 

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
    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2285:1: ruleInheritanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) ) ;
    public final Enumerator ruleInheritanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2287:28: ( ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) ) )
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2288:1: ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) )
            {
            // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2288:1: ( (enumLiteral_0= 'joined' ) | (enumLiteral_1= 'tablePerClass' ) | (enumLiteral_2= 'singleTable' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2288:2: (enumLiteral_0= 'joined' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2288:2: (enumLiteral_0= 'joined' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2288:4: enumLiteral_0= 'joined'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleInheritanceType5041); 

                            current = grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2294:6: (enumLiteral_1= 'tablePerClass' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2294:6: (enumLiteral_1= 'tablePerClass' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2294:8: enumLiteral_1= 'tablePerClass'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleInheritanceType5058); 

                            current = grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2300:6: (enumLiteral_2= 'singleTable' )
                    {
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2300:6: (enumLiteral_2= 'singleTable' )
                    // ../migdb.dsl.ops/src-gen/migdb/dsl/ops/parser/antlr/internal/InternalOps.g:2300:8: enumLiteral_2= 'singleTable'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleInheritanceType5075); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\26\uffff";
    static final String DFA3_eofS =
        "\14\uffff\1\23\11\uffff";
    static final String DFA3_minS =
        "\1\4\1\13\3\uffff\1\4\1\uffff\1\14\4\uffff\1\4\11\uffff";
    static final String DFA3_maxS =
        "\1\43\1\37\3\uffff\1\4\1\uffff\1\56\4\uffff\1\44\11\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\7\1\20\1\21\1\uffff\1\12\1\uffff\1\5\1\4\1\10\1\6\1"+
        "\uffff\1\2\1\3\1\1\1\13\1\16\1\11\1\15\1\14\1\17";
    static final String DFA3_specialS =
        "\26\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\17\uffff\1\2\15\uffff\1\3\1\4",
            "\1\7\2\uffff\1\13\1\uffff\1\11\2\10\1\13\1\uffff\1\12\10\uffff"+
            "\1\5\1\6",
            "",
            "",
            "",
            "\1\14",
            "",
            "\1\17\1\15\2\16\34\uffff\3\16",
            "",
            "",
            "",
            "",
            "\1\23\13\uffff\1\22\3\uffff\1\23\1\uffff\2\21\2\25\1\20\1"+
            "\23\4\uffff\2\24\3\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "190:1: (this_AddPrimitiveClass_0= ruleAddPrimitiveClass | this_AddEmbeddedClass_1= ruleAddEmbeddedClass | this_AddStandardClass_2= ruleAddStandardClass | this_RenameEntity_3= ruleRenameEntity | this_SetParent_4= ruleSetParent | this_SetAbstract_5= ruleSetAbstract | this_RemoveEntity_6= ruleRemoveEntity | this_AddProperty_7= ruleAddProperty | this_RenameProperty_8= ruleRenameProperty | this_RemoveProperty_9= ruleRemoveProperty | this_SetType_10= ruleSetType | this_SetOpposite_11= ruleSetOpposite | this_SetBounds_12= ruleSetBounds | this_SetOrdered_13= ruleSetOrdered | this_SetUnique_14= ruleSetUnique | this_CopyProperty_15= ruleCopyProperty | this_MoveProperty_16= ruleMoveProperty )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModelRoot_in_entryRuleModelRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperations_in_ruleModelRoot131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperations_in_entryRuleOperations165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperations175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelOperation_in_ruleOperations220 = new BitSet(new long[]{0x0000001C00100012L});
        public static final BitSet FOLLOW_ruleModelOperation_in_entryRuleModelOperation256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelOperation266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicOperation_in_ruleModelOperation313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposableOperation_in_ruleModelOperation340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicOperation_in_entryRuleAtomicOperation375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicOperation385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddPrimitiveClass_in_ruleAtomicOperation432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddEmbeddedClass_in_ruleAtomicOperation459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddStandardClass_in_ruleAtomicOperation486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameEntity_in_ruleAtomicOperation513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetParent_in_ruleAtomicOperation540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetAbstract_in_ruleAtomicOperation567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveEntity_in_ruleAtomicOperation594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddProperty_in_ruleAtomicOperation621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameProperty_in_ruleAtomicOperation648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveProperty_in_ruleAtomicOperation675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetType_in_ruleAtomicOperation702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOpposite_in_ruleAtomicOperation729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetBounds_in_ruleAtomicOperation756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOrdered_in_ruleAtomicOperation783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetUnique_in_ruleAtomicOperation810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopyProperty_in_ruleAtomicOperation837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveProperty_in_ruleAtomicOperation864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposableOperation_in_entryRuleDecomposableOperation899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecomposableOperation909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractClass_in_ruleDecomposableOperation956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractParent_in_ruleDecomposableOperation983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddPrimitiveClass_in_entryRuleAddPrimitiveClass1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddPrimitiveClass1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddPrimitiveClass1070 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAddPrimitiveClass1087 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAddPrimitiveClass1099 = new BitSet(new long[]{0x00000E0000000000L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_ruleAddPrimitiveClass1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddEmbeddedClass_in_entryRuleAddEmbeddedClass1156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddEmbeddedClass1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddEmbeddedClass1208 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAddEmbeddedClass1225 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAddEmbeddedClass1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddStandardClass_in_entryRuleAddStandardClass1273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddStandardClass1283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddStandardClass1325 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAddStandardClass1342 = new BitSet(new long[]{0x000070000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAddStandardClass1405 = new BitSet(new long[]{0x000070000000C000L});
        public static final BitSet FOLLOW_ruleInheritanceType_in_ruleAddStandardClass1493 = new BitSet(new long[]{0x000070000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAddStandardClass1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameEntity_in_entryRuleRenameEntity1588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameEntity1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameEntity1640 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRenameEntity1657 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameEntity1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetParent_in_entryRuleSetParent1715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetParent1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetParent1767 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleSetParent1786 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetParent1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSetParent1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetAbstract_in_entryRuleSetAbstract1864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetAbstract1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetAbstract1916 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleSetAbstract1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSetAbstract1971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveEntity_in_entryRuleRemoveEntity2008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRemoveEntity2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleRemoveEntity2055 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRemoveEntity2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty2113 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty2165 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAddProperty2182 = new BitSet(new long[]{0x0000000003C00010L});
        public static final BitSet FOLLOW_22_in_ruleAddProperty2240 = new BitSet(new long[]{0x0000000003C00010L});
        public static final BitSet FOLLOW_23_in_ruleAddProperty2264 = new BitSet(new long[]{0x0000000003C00010L});
        public static final BitSet FOLLOW_24_in_ruleAddProperty2345 = new BitSet(new long[]{0x0000000003C00010L});
        public static final BitSet FOLLOW_25_in_ruleAddProperty2369 = new BitSet(new long[]{0x0000000003C00010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty2440 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAddProperty2457 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty2474 = new BitSet(new long[]{0x0000000008000802L});
        public static final BitSet FOLLOW_27_in_ruleAddProperty2492 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAddProperty2510 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAddProperty2539 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAddProperty2556 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAddProperty2573 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAddProperty2593 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAddProperty2608 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameProperty_in_entryRuleRenameProperty2668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameProperty2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameProperty2720 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRenameProperty2737 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameProperty2754 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRenameProperty2771 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRenameProperty2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveProperty_in_entryRuleRemoveProperty2829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRemoveProperty2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRemoveProperty2881 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRemoveProperty2898 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRemoveProperty2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetType_in_entryRuleSetType2956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetType2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetType3008 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetType3025 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetType3042 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleSetType3059 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetType3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOpposite_in_entryRuleSetOpposite3117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetOpposite3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOpposite3169 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetOpposite3186 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOpposite3203 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleSetOpposite3227 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_33_in_ruleSetOpposite3258 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOpposite3276 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetOpposite3293 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOpposite3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetBounds_in_entryRuleSetBounds3351 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetBounds3361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetBounds3403 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetBounds3420 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetBounds3437 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleSetBounds3455 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSetBounds3473 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSetBounds3502 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSetBounds3519 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSetBounds3536 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSetBounds3556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOrdered_in_entryRuleSetOrdered3594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetOrdered3604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOrdered3646 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetOrdered3663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetOrdered3680 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleSetOrdered3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSetOrdered3735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetUnique_in_entryRuleSetUnique3772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetUnique3782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetUnique3824 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSetUnique3841 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSetUnique3858 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_25_in_ruleSetUnique3882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleSetUnique3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopyProperty_in_entryRuleCopyProperty3950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopyProperty3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleCopyProperty3997 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_ruleMergeType_in_ruleCopyProperty4018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCopyProperty4035 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCopyProperty4052 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCopyProperty4069 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCopyProperty4086 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCopyProperty4103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveProperty_in_entryRuleMoveProperty4144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveProperty4154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleMoveProperty4191 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_ruleMergeType_in_ruleMoveProperty4212 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveProperty4229 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMoveProperty4246 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveProperty4263 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMoveProperty4280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMoveProperty4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractClass_in_entryRuleExtractClass4338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractClass4348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleExtractClass4385 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractClass4402 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleExtractClass4419 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleExtractClass4431 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractClass4448 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_37_in_ruleExtractClass4466 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractClass4483 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_29_in_ruleExtractClass4502 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtractClass4514 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractClass4531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractParent_in_entryRuleExtractParent4572 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractParent4582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleExtractParent4619 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleExtractParent4631 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractParent4648 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_37_in_ruleExtractParent4666 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractParent4683 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_29_in_ruleExtractParent4702 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleExtractParent4714 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleExtractParent4726 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractParent4743 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_37_in_ruleExtractParent4761 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractParent4778 = new BitSet(new long[]{0x0000002020000000L});
        public static final BitSet FOLLOW_29_in_ruleExtractParent4797 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtractParent4809 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtractParent4826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMergeType4883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMergeType4900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleMergeType4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rulePrimitiveType4962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePrimitiveType4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePrimitiveType4996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleInheritanceType5041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleInheritanceType5058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleInheritanceType5075 = new BitSet(new long[]{0x0000000000000002L});
    }


}