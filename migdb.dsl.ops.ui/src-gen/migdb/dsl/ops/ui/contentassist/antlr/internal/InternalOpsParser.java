package migdb.dsl.ops.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import migdb.dsl.ops.services.OpsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!<'", "'!abstract'", "'!ordered'", "'!unique'", "'!<->'", "'strict'", "'force'", "'tolerant'", "'boolean'", "'char'", "'int'", "'joined'", "'tablePerClass'", "'singleTable'", "'='", "'primitive'", "'embedded'", "'class'", "'->'", "'<'", "'!'", "'+='", "':'", "'['", "']'", "'..'", "'.'", "'-='", "'copy'", "'move'", "'extract'", "','", "'abstract'", "'ordered'", "'unique'", "'<->'"
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
    public String getGrammarFileName() { return "../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g"; }


     
     	private OpsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OpsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModelRoot"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:60:1: entryRuleModelRoot : ruleModelRoot EOF ;
    public final void entryRuleModelRoot() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:61:1: ( ruleModelRoot EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:62:1: ruleModelRoot EOF
            {
             before(grammarAccess.getModelRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelRoot_in_entryRuleModelRoot61);
            ruleModelRoot();

            state._fsp--;

             after(grammarAccess.getModelRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelRoot"


    // $ANTLR start "ruleModelRoot"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:69:1: ruleModelRoot : ( ruleOperations ) ;
    public final void ruleModelRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:73:2: ( ( ruleOperations ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:74:1: ( ruleOperations )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:74:1: ( ruleOperations )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:75:1: ruleOperations
            {
             before(grammarAccess.getModelRootAccess().getOperationsParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperations_in_ruleModelRoot94);
            ruleOperations();

            state._fsp--;

             after(grammarAccess.getModelRootAccess().getOperationsParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelRoot"


    // $ANTLR start "entryRuleOperations"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:88:1: entryRuleOperations : ruleOperations EOF ;
    public final void entryRuleOperations() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:89:1: ( ruleOperations EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:90:1: ruleOperations EOF
            {
             before(grammarAccess.getOperationsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperations_in_entryRuleOperations120);
            ruleOperations();

            state._fsp--;

             after(grammarAccess.getOperationsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperations127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:97:1: ruleOperations : ( ( rule__Operations__OperationsAssignment )* ) ;
    public final void ruleOperations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:101:2: ( ( ( rule__Operations__OperationsAssignment )* ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:102:1: ( ( rule__Operations__OperationsAssignment )* )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:102:1: ( ( rule__Operations__OperationsAssignment )* )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:103:1: ( rule__Operations__OperationsAssignment )*
            {
             before(grammarAccess.getOperationsAccess().getOperationsAssignment()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:104:1: ( rule__Operations__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==31||(LA1_0>=39 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:104:2: rule__Operations__OperationsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operations__OperationsAssignment_in_ruleOperations153);
            	    rule__Operations__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOperationsAccess().getOperationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleModelOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:116:1: entryRuleModelOperation : ruleModelOperation EOF ;
    public final void entryRuleModelOperation() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:117:1: ( ruleModelOperation EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:118:1: ruleModelOperation EOF
            {
             before(grammarAccess.getModelOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelOperation_in_entryRuleModelOperation181);
            ruleModelOperation();

            state._fsp--;

             after(grammarAccess.getModelOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelOperation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelOperation"


    // $ANTLR start "ruleModelOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:125:1: ruleModelOperation : ( ( rule__ModelOperation__Alternatives ) ) ;
    public final void ruleModelOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:129:2: ( ( ( rule__ModelOperation__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:130:1: ( ( rule__ModelOperation__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:130:1: ( ( rule__ModelOperation__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:131:1: ( rule__ModelOperation__Alternatives )
            {
             before(grammarAccess.getModelOperationAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:132:1: ( rule__ModelOperation__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:132:2: rule__ModelOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelOperation__Alternatives_in_ruleModelOperation214);
            rule__ModelOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelOperation"


    // $ANTLR start "entryRuleAtomicOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:144:1: entryRuleAtomicOperation : ruleAtomicOperation EOF ;
    public final void entryRuleAtomicOperation() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:145:1: ( ruleAtomicOperation EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:146:1: ruleAtomicOperation EOF
            {
             before(grammarAccess.getAtomicOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicOperation_in_entryRuleAtomicOperation241);
            ruleAtomicOperation();

            state._fsp--;

             after(grammarAccess.getAtomicOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicOperation248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicOperation"


    // $ANTLR start "ruleAtomicOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:153:1: ruleAtomicOperation : ( ( rule__AtomicOperation__Alternatives ) ) ;
    public final void ruleAtomicOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:157:2: ( ( ( rule__AtomicOperation__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:158:1: ( ( rule__AtomicOperation__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:158:1: ( ( rule__AtomicOperation__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:159:1: ( rule__AtomicOperation__Alternatives )
            {
             before(grammarAccess.getAtomicOperationAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:160:1: ( rule__AtomicOperation__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:160:2: rule__AtomicOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicOperation__Alternatives_in_ruleAtomicOperation274);
            rule__AtomicOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicOperation"


    // $ANTLR start "entryRuleDecomposableOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:172:1: entryRuleDecomposableOperation : ruleDecomposableOperation EOF ;
    public final void entryRuleDecomposableOperation() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:173:1: ( ruleDecomposableOperation EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:174:1: ruleDecomposableOperation EOF
            {
             before(grammarAccess.getDecomposableOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposableOperation_in_entryRuleDecomposableOperation301);
            ruleDecomposableOperation();

            state._fsp--;

             after(grammarAccess.getDecomposableOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecomposableOperation308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecomposableOperation"


    // $ANTLR start "ruleDecomposableOperation"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:181:1: ruleDecomposableOperation : ( ( rule__DecomposableOperation__Alternatives ) ) ;
    public final void ruleDecomposableOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:185:2: ( ( ( rule__DecomposableOperation__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:186:1: ( ( rule__DecomposableOperation__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:186:1: ( ( rule__DecomposableOperation__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:187:1: ( rule__DecomposableOperation__Alternatives )
            {
             before(grammarAccess.getDecomposableOperationAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:188:1: ( rule__DecomposableOperation__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:188:2: rule__DecomposableOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DecomposableOperation__Alternatives_in_ruleDecomposableOperation334);
            rule__DecomposableOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDecomposableOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecomposableOperation"


    // $ANTLR start "entryRuleAddPrimitiveClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:200:1: entryRuleAddPrimitiveClass : ruleAddPrimitiveClass EOF ;
    public final void entryRuleAddPrimitiveClass() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:201:1: ( ruleAddPrimitiveClass EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:202:1: ruleAddPrimitiveClass EOF
            {
             before(grammarAccess.getAddPrimitiveClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddPrimitiveClass_in_entryRuleAddPrimitiveClass361);
            ruleAddPrimitiveClass();

            state._fsp--;

             after(grammarAccess.getAddPrimitiveClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddPrimitiveClass368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddPrimitiveClass"


    // $ANTLR start "ruleAddPrimitiveClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:209:1: ruleAddPrimitiveClass : ( ( rule__AddPrimitiveClass__Group__0 ) ) ;
    public final void ruleAddPrimitiveClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:213:2: ( ( ( rule__AddPrimitiveClass__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:214:1: ( ( rule__AddPrimitiveClass__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:214:1: ( ( rule__AddPrimitiveClass__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:215:1: ( rule__AddPrimitiveClass__Group__0 )
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:216:1: ( rule__AddPrimitiveClass__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:216:2: rule__AddPrimitiveClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__0_in_ruleAddPrimitiveClass394);
            rule__AddPrimitiveClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPrimitiveClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddPrimitiveClass"


    // $ANTLR start "entryRuleAddEmbeddedClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:228:1: entryRuleAddEmbeddedClass : ruleAddEmbeddedClass EOF ;
    public final void entryRuleAddEmbeddedClass() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:229:1: ( ruleAddEmbeddedClass EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:230:1: ruleAddEmbeddedClass EOF
            {
             before(grammarAccess.getAddEmbeddedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddEmbeddedClass_in_entryRuleAddEmbeddedClass421);
            ruleAddEmbeddedClass();

            state._fsp--;

             after(grammarAccess.getAddEmbeddedClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddEmbeddedClass428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddEmbeddedClass"


    // $ANTLR start "ruleAddEmbeddedClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:237:1: ruleAddEmbeddedClass : ( ( rule__AddEmbeddedClass__Group__0 ) ) ;
    public final void ruleAddEmbeddedClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:241:2: ( ( ( rule__AddEmbeddedClass__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:242:1: ( ( rule__AddEmbeddedClass__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:242:1: ( ( rule__AddEmbeddedClass__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:243:1: ( rule__AddEmbeddedClass__Group__0 )
            {
             before(grammarAccess.getAddEmbeddedClassAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:244:1: ( rule__AddEmbeddedClass__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:244:2: rule__AddEmbeddedClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__0_in_ruleAddEmbeddedClass454);
            rule__AddEmbeddedClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddEmbeddedClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddEmbeddedClass"


    // $ANTLR start "entryRuleAddStandardClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:256:1: entryRuleAddStandardClass : ruleAddStandardClass EOF ;
    public final void entryRuleAddStandardClass() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:257:1: ( ruleAddStandardClass EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:258:1: ruleAddStandardClass EOF
            {
             before(grammarAccess.getAddStandardClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddStandardClass_in_entryRuleAddStandardClass481);
            ruleAddStandardClass();

            state._fsp--;

             after(grammarAccess.getAddStandardClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddStandardClass488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddStandardClass"


    // $ANTLR start "ruleAddStandardClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:265:1: ruleAddStandardClass : ( ( rule__AddStandardClass__Group__0 ) ) ;
    public final void ruleAddStandardClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:269:2: ( ( ( rule__AddStandardClass__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:270:1: ( ( rule__AddStandardClass__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:270:1: ( ( rule__AddStandardClass__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:271:1: ( rule__AddStandardClass__Group__0 )
            {
             before(grammarAccess.getAddStandardClassAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:272:1: ( rule__AddStandardClass__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:272:2: rule__AddStandardClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__0_in_ruleAddStandardClass514);
            rule__AddStandardClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddStandardClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddStandardClass"


    // $ANTLR start "entryRuleRenameEntity"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:284:1: entryRuleRenameEntity : ruleRenameEntity EOF ;
    public final void entryRuleRenameEntity() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:285:1: ( ruleRenameEntity EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:286:1: ruleRenameEntity EOF
            {
             before(grammarAccess.getRenameEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameEntity_in_entryRuleRenameEntity541);
            ruleRenameEntity();

            state._fsp--;

             after(grammarAccess.getRenameEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameEntity548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameEntity"


    // $ANTLR start "ruleRenameEntity"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:293:1: ruleRenameEntity : ( ( rule__RenameEntity__Group__0 ) ) ;
    public final void ruleRenameEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:297:2: ( ( ( rule__RenameEntity__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:298:1: ( ( rule__RenameEntity__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:298:1: ( ( rule__RenameEntity__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:299:1: ( rule__RenameEntity__Group__0 )
            {
             before(grammarAccess.getRenameEntityAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:300:1: ( rule__RenameEntity__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:300:2: rule__RenameEntity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__0_in_ruleRenameEntity574);
            rule__RenameEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameEntity"


    // $ANTLR start "entryRuleSetParent"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:312:1: entryRuleSetParent : ruleSetParent EOF ;
    public final void entryRuleSetParent() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:313:1: ( ruleSetParent EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:314:1: ruleSetParent EOF
            {
             before(grammarAccess.getSetParentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetParent_in_entryRuleSetParent601);
            ruleSetParent();

            state._fsp--;

             after(grammarAccess.getSetParentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetParent608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetParent"


    // $ANTLR start "ruleSetParent"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:321:1: ruleSetParent : ( ( rule__SetParent__Group__0 ) ) ;
    public final void ruleSetParent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:325:2: ( ( ( rule__SetParent__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:326:1: ( ( rule__SetParent__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:326:1: ( ( rule__SetParent__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:327:1: ( rule__SetParent__Group__0 )
            {
             before(grammarAccess.getSetParentAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:328:1: ( rule__SetParent__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:328:2: rule__SetParent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group__0_in_ruleSetParent634);
            rule__SetParent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetParentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetParent"


    // $ANTLR start "entryRuleSetAbstract"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:340:1: entryRuleSetAbstract : ruleSetAbstract EOF ;
    public final void entryRuleSetAbstract() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:341:1: ( ruleSetAbstract EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:342:1: ruleSetAbstract EOF
            {
             before(grammarAccess.getSetAbstractRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetAbstract_in_entryRuleSetAbstract661);
            ruleSetAbstract();

            state._fsp--;

             after(grammarAccess.getSetAbstractRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetAbstract668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetAbstract"


    // $ANTLR start "ruleSetAbstract"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:349:1: ruleSetAbstract : ( ( rule__SetAbstract__Group__0 ) ) ;
    public final void ruleSetAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:353:2: ( ( ( rule__SetAbstract__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:354:1: ( ( rule__SetAbstract__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:354:1: ( ( rule__SetAbstract__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:355:1: ( rule__SetAbstract__Group__0 )
            {
             before(grammarAccess.getSetAbstractAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:356:1: ( rule__SetAbstract__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:356:2: rule__SetAbstract__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__Group__0_in_ruleSetAbstract694);
            rule__SetAbstract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAbstractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetAbstract"


    // $ANTLR start "entryRuleRemoveEntity"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:368:1: entryRuleRemoveEntity : ruleRemoveEntity EOF ;
    public final void entryRuleRemoveEntity() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:369:1: ( ruleRemoveEntity EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:370:1: ruleRemoveEntity EOF
            {
             before(grammarAccess.getRemoveEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRemoveEntity_in_entryRuleRemoveEntity721);
            ruleRemoveEntity();

            state._fsp--;

             after(grammarAccess.getRemoveEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRemoveEntity728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveEntity"


    // $ANTLR start "ruleRemoveEntity"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:377:1: ruleRemoveEntity : ( ( rule__RemoveEntity__Group__0 ) ) ;
    public final void ruleRemoveEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:381:2: ( ( ( rule__RemoveEntity__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:382:1: ( ( rule__RemoveEntity__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:382:1: ( ( rule__RemoveEntity__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:383:1: ( rule__RemoveEntity__Group__0 )
            {
             before(grammarAccess.getRemoveEntityAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:384:1: ( rule__RemoveEntity__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:384:2: rule__RemoveEntity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveEntity__Group__0_in_ruleRemoveEntity754);
            rule__RemoveEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveEntity"


    // $ANTLR start "entryRuleAddProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:396:1: entryRuleAddProperty : ruleAddProperty EOF ;
    public final void entryRuleAddProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:397:1: ( ruleAddProperty EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:398:1: ruleAddProperty EOF
            {
             before(grammarAccess.getAddPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddProperty_in_entryRuleAddProperty781);
            ruleAddProperty();

            state._fsp--;

             after(grammarAccess.getAddPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddProperty788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:405:1: ruleAddProperty : ( ( rule__AddProperty__Group__0 ) ) ;
    public final void ruleAddProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:409:2: ( ( ( rule__AddProperty__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:410:1: ( ( rule__AddProperty__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:410:1: ( ( rule__AddProperty__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:411:1: ( rule__AddProperty__Group__0 )
            {
             before(grammarAccess.getAddPropertyAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:412:1: ( rule__AddProperty__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:412:2: rule__AddProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty814);
            rule__AddProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleRenameProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:424:1: entryRuleRenameProperty : ruleRenameProperty EOF ;
    public final void entryRuleRenameProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:425:1: ( ruleRenameProperty EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:426:1: ruleRenameProperty EOF
            {
             before(grammarAccess.getRenamePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRenameProperty_in_entryRuleRenameProperty841);
            ruleRenameProperty();

            state._fsp--;

             after(grammarAccess.getRenamePropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRenameProperty848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameProperty"


    // $ANTLR start "ruleRenameProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:433:1: ruleRenameProperty : ( ( rule__RenameProperty__Group__0 ) ) ;
    public final void ruleRenameProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:437:2: ( ( ( rule__RenameProperty__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:438:1: ( ( rule__RenameProperty__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:438:1: ( ( rule__RenameProperty__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:439:1: ( rule__RenameProperty__Group__0 )
            {
             before(grammarAccess.getRenamePropertyAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:440:1: ( rule__RenameProperty__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:440:2: rule__RenameProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__0_in_ruleRenameProperty874);
            rule__RenameProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenamePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameProperty"


    // $ANTLR start "entryRuleRemoveProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:452:1: entryRuleRemoveProperty : ruleRemoveProperty EOF ;
    public final void entryRuleRemoveProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:453:1: ( ruleRemoveProperty EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:454:1: ruleRemoveProperty EOF
            {
             before(grammarAccess.getRemovePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRemoveProperty_in_entryRuleRemoveProperty901);
            ruleRemoveProperty();

            state._fsp--;

             after(grammarAccess.getRemovePropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRemoveProperty908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveProperty"


    // $ANTLR start "ruleRemoveProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:461:1: ruleRemoveProperty : ( ( rule__RemoveProperty__Group__0 ) ) ;
    public final void ruleRemoveProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:465:2: ( ( ( rule__RemoveProperty__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:466:1: ( ( rule__RemoveProperty__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:466:1: ( ( rule__RemoveProperty__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:467:1: ( rule__RemoveProperty__Group__0 )
            {
             before(grammarAccess.getRemovePropertyAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:468:1: ( rule__RemoveProperty__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:468:2: rule__RemoveProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__0_in_ruleRemoveProperty934);
            rule__RemoveProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemovePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveProperty"


    // $ANTLR start "entryRuleSetType"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:480:1: entryRuleSetType : ruleSetType EOF ;
    public final void entryRuleSetType() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:481:1: ( ruleSetType EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:482:1: ruleSetType EOF
            {
             before(grammarAccess.getSetTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetType_in_entryRuleSetType961);
            ruleSetType();

            state._fsp--;

             after(grammarAccess.getSetTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetType968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetType"


    // $ANTLR start "ruleSetType"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:489:1: ruleSetType : ( ( rule__SetType__Group__0 ) ) ;
    public final void ruleSetType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:493:2: ( ( ( rule__SetType__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:494:1: ( ( rule__SetType__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:494:1: ( ( rule__SetType__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:495:1: ( rule__SetType__Group__0 )
            {
             before(grammarAccess.getSetTypeAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:496:1: ( rule__SetType__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:496:2: rule__SetType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__0_in_ruleSetType994);
            rule__SetType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetType"


    // $ANTLR start "entryRuleSetOpposite"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:508:1: entryRuleSetOpposite : ruleSetOpposite EOF ;
    public final void entryRuleSetOpposite() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:509:1: ( ruleSetOpposite EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:510:1: ruleSetOpposite EOF
            {
             before(grammarAccess.getSetOppositeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetOpposite_in_entryRuleSetOpposite1021);
            ruleSetOpposite();

            state._fsp--;

             after(grammarAccess.getSetOppositeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetOpposite1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetOpposite"


    // $ANTLR start "ruleSetOpposite"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:517:1: ruleSetOpposite : ( ( rule__SetOpposite__Group__0 ) ) ;
    public final void ruleSetOpposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:521:2: ( ( ( rule__SetOpposite__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:522:1: ( ( rule__SetOpposite__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:522:1: ( ( rule__SetOpposite__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:523:1: ( rule__SetOpposite__Group__0 )
            {
             before(grammarAccess.getSetOppositeAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:524:1: ( rule__SetOpposite__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:524:2: rule__SetOpposite__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__0_in_ruleSetOpposite1054);
            rule__SetOpposite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetOpposite"


    // $ANTLR start "entryRuleSetBounds"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:536:1: entryRuleSetBounds : ruleSetBounds EOF ;
    public final void entryRuleSetBounds() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:537:1: ( ruleSetBounds EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:538:1: ruleSetBounds EOF
            {
             before(grammarAccess.getSetBoundsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetBounds_in_entryRuleSetBounds1081);
            ruleSetBounds();

            state._fsp--;

             after(grammarAccess.getSetBoundsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetBounds1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetBounds"


    // $ANTLR start "ruleSetBounds"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:545:1: ruleSetBounds : ( ( rule__SetBounds__Group__0 ) ) ;
    public final void ruleSetBounds() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:549:2: ( ( ( rule__SetBounds__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:550:1: ( ( rule__SetBounds__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:550:1: ( ( rule__SetBounds__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:551:1: ( rule__SetBounds__Group__0 )
            {
             before(grammarAccess.getSetBoundsAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:552:1: ( rule__SetBounds__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:552:2: rule__SetBounds__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__0_in_ruleSetBounds1114);
            rule__SetBounds__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetBoundsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetBounds"


    // $ANTLR start "entryRuleSetOrdered"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:564:1: entryRuleSetOrdered : ruleSetOrdered EOF ;
    public final void entryRuleSetOrdered() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:565:1: ( ruleSetOrdered EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:566:1: ruleSetOrdered EOF
            {
             before(grammarAccess.getSetOrderedRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetOrdered_in_entryRuleSetOrdered1141);
            ruleSetOrdered();

            state._fsp--;

             after(grammarAccess.getSetOrderedRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetOrdered1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetOrdered"


    // $ANTLR start "ruleSetOrdered"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:573:1: ruleSetOrdered : ( ( rule__SetOrdered__Group__0 ) ) ;
    public final void ruleSetOrdered() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:577:2: ( ( ( rule__SetOrdered__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:578:1: ( ( rule__SetOrdered__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:578:1: ( ( rule__SetOrdered__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:579:1: ( rule__SetOrdered__Group__0 )
            {
             before(grammarAccess.getSetOrderedAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:580:1: ( rule__SetOrdered__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:580:2: rule__SetOrdered__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__0_in_ruleSetOrdered1174);
            rule__SetOrdered__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetOrderedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetOrdered"


    // $ANTLR start "entryRuleSetUnique"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:592:1: entryRuleSetUnique : ruleSetUnique EOF ;
    public final void entryRuleSetUnique() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:593:1: ( ruleSetUnique EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:594:1: ruleSetUnique EOF
            {
             before(grammarAccess.getSetUniqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetUnique_in_entryRuleSetUnique1201);
            ruleSetUnique();

            state._fsp--;

             after(grammarAccess.getSetUniqueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetUnique1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetUnique"


    // $ANTLR start "ruleSetUnique"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:601:1: ruleSetUnique : ( ( rule__SetUnique__Group__0 ) ) ;
    public final void ruleSetUnique() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:605:2: ( ( ( rule__SetUnique__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:606:1: ( ( rule__SetUnique__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:606:1: ( ( rule__SetUnique__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:607:1: ( rule__SetUnique__Group__0 )
            {
             before(grammarAccess.getSetUniqueAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:608:1: ( rule__SetUnique__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:608:2: rule__SetUnique__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__0_in_ruleSetUnique1234);
            rule__SetUnique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetUniqueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetUnique"


    // $ANTLR start "entryRuleCopyProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:620:1: entryRuleCopyProperty : ruleCopyProperty EOF ;
    public final void entryRuleCopyProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:621:1: ( ruleCopyProperty EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:622:1: ruleCopyProperty EOF
            {
             before(grammarAccess.getCopyPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCopyProperty_in_entryRuleCopyProperty1261);
            ruleCopyProperty();

            state._fsp--;

             after(grammarAccess.getCopyPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCopyProperty1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCopyProperty"


    // $ANTLR start "ruleCopyProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:629:1: ruleCopyProperty : ( ( rule__CopyProperty__Group__0 ) ) ;
    public final void ruleCopyProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:633:2: ( ( ( rule__CopyProperty__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:634:1: ( ( rule__CopyProperty__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:634:1: ( ( rule__CopyProperty__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:635:1: ( rule__CopyProperty__Group__0 )
            {
             before(grammarAccess.getCopyPropertyAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:636:1: ( rule__CopyProperty__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:636:2: rule__CopyProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__0_in_ruleCopyProperty1294);
            rule__CopyProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopyProperty"


    // $ANTLR start "entryRuleMoveProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:648:1: entryRuleMoveProperty : ruleMoveProperty EOF ;
    public final void entryRuleMoveProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:649:1: ( ruleMoveProperty EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:650:1: ruleMoveProperty EOF
            {
             before(grammarAccess.getMovePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMoveProperty_in_entryRuleMoveProperty1321);
            ruleMoveProperty();

            state._fsp--;

             after(grammarAccess.getMovePropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMoveProperty1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveProperty"


    // $ANTLR start "ruleMoveProperty"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:657:1: ruleMoveProperty : ( ( rule__MoveProperty__Group__0 ) ) ;
    public final void ruleMoveProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:661:2: ( ( ( rule__MoveProperty__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:662:1: ( ( rule__MoveProperty__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:662:1: ( ( rule__MoveProperty__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:663:1: ( rule__MoveProperty__Group__0 )
            {
             before(grammarAccess.getMovePropertyAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:664:1: ( rule__MoveProperty__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:664:2: rule__MoveProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__0_in_ruleMoveProperty1354);
            rule__MoveProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveProperty"


    // $ANTLR start "entryRuleExtractClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:676:1: entryRuleExtractClass : ruleExtractClass EOF ;
    public final void entryRuleExtractClass() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:677:1: ( ruleExtractClass EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:678:1: ruleExtractClass EOF
            {
             before(grammarAccess.getExtractClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractClass_in_entryRuleExtractClass1381);
            ruleExtractClass();

            state._fsp--;

             after(grammarAccess.getExtractClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractClass1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtractClass"


    // $ANTLR start "ruleExtractClass"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:685:1: ruleExtractClass : ( ( rule__ExtractClass__Group__0 ) ) ;
    public final void ruleExtractClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:689:2: ( ( ( rule__ExtractClass__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:690:1: ( ( rule__ExtractClass__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:690:1: ( ( rule__ExtractClass__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:691:1: ( rule__ExtractClass__Group__0 )
            {
             before(grammarAccess.getExtractClassAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:692:1: ( rule__ExtractClass__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:692:2: rule__ExtractClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__0_in_ruleExtractClass1414);
            rule__ExtractClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtractClass"


    // $ANTLR start "entryRuleExtractParent"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:704:1: entryRuleExtractParent : ruleExtractParent EOF ;
    public final void entryRuleExtractParent() throws RecognitionException {
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:705:1: ( ruleExtractParent EOF )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:706:1: ruleExtractParent EOF
            {
             before(grammarAccess.getExtractParentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtractParent_in_entryRuleExtractParent1441);
            ruleExtractParent();

            state._fsp--;

             after(grammarAccess.getExtractParentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtractParent1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtractParent"


    // $ANTLR start "ruleExtractParent"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:713:1: ruleExtractParent : ( ( rule__ExtractParent__Group__0 ) ) ;
    public final void ruleExtractParent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:717:2: ( ( ( rule__ExtractParent__Group__0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:718:1: ( ( rule__ExtractParent__Group__0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:718:1: ( ( rule__ExtractParent__Group__0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:719:1: ( rule__ExtractParent__Group__0 )
            {
             before(grammarAccess.getExtractParentAccess().getGroup()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:720:1: ( rule__ExtractParent__Group__0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:720:2: rule__ExtractParent__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__0_in_ruleExtractParent1474);
            rule__ExtractParent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtractParent"


    // $ANTLR start "ruleMergeType"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:735:1: ruleMergeType : ( ( rule__MergeType__Alternatives ) ) ;
    public final void ruleMergeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:739:1: ( ( ( rule__MergeType__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:740:1: ( ( rule__MergeType__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:740:1: ( ( rule__MergeType__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:741:1: ( rule__MergeType__Alternatives )
            {
             before(grammarAccess.getMergeTypeAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:742:1: ( rule__MergeType__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:742:2: rule__MergeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MergeType__Alternatives_in_ruleMergeType1513);
            rule__MergeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMergeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMergeType"


    // $ANTLR start "rulePrimitiveType"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:754:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:758:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:759:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:759:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:760:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:761:1: ( rule__PrimitiveType__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:761:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1549);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "ruleInheritanceType"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:773:1: ruleInheritanceType : ( ( rule__InheritanceType__Alternatives ) ) ;
    public final void ruleInheritanceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:777:1: ( ( ( rule__InheritanceType__Alternatives ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:778:1: ( ( rule__InheritanceType__Alternatives ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:778:1: ( ( rule__InheritanceType__Alternatives ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:779:1: ( rule__InheritanceType__Alternatives )
            {
             before(grammarAccess.getInheritanceTypeAccess().getAlternatives()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:780:1: ( rule__InheritanceType__Alternatives )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:780:2: rule__InheritanceType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__InheritanceType__Alternatives_in_ruleInheritanceType1585);
            rule__InheritanceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInheritanceType"


    // $ANTLR start "rule__ModelOperation__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:791:1: rule__ModelOperation__Alternatives : ( ( ruleAtomicOperation ) | ( ruleDecomposableOperation ) );
    public final void rule__ModelOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:795:1: ( ( ruleAtomicOperation ) | ( ruleDecomposableOperation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==31||(LA2_0>=39 && LA2_0<=40)) ) {
                alt2=1;
            }
            else if ( (LA2_0==41) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:796:1: ( ruleAtomicOperation )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:796:1: ( ruleAtomicOperation )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:797:1: ruleAtomicOperation
                    {
                     before(grammarAccess.getModelOperationAccess().getAtomicOperationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicOperation_in_rule__ModelOperation__Alternatives1620);
                    ruleAtomicOperation();

                    state._fsp--;

                     after(grammarAccess.getModelOperationAccess().getAtomicOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:802:6: ( ruleDecomposableOperation )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:802:6: ( ruleDecomposableOperation )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:803:1: ruleDecomposableOperation
                    {
                     before(grammarAccess.getModelOperationAccess().getDecomposableOperationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDecomposableOperation_in_rule__ModelOperation__Alternatives1637);
                    ruleDecomposableOperation();

                    state._fsp--;

                     after(grammarAccess.getModelOperationAccess().getDecomposableOperationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelOperation__Alternatives"


    // $ANTLR start "rule__AtomicOperation__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:813:1: rule__AtomicOperation__Alternatives : ( ( ruleAddPrimitiveClass ) | ( ruleAddEmbeddedClass ) | ( ruleAddStandardClass ) | ( ruleRenameEntity ) | ( ruleSetParent ) | ( ruleSetAbstract ) | ( ruleRemoveEntity ) | ( ruleAddProperty ) | ( ruleRenameProperty ) | ( ruleRemoveProperty ) | ( ruleSetType ) | ( ruleSetOpposite ) | ( ruleSetBounds ) | ( ruleSetOrdered ) | ( ruleSetUnique ) | ( ruleCopyProperty ) | ( ruleMoveProperty ) );
    public final void rule__AtomicOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:817:1: ( ( ruleAddPrimitiveClass ) | ( ruleAddEmbeddedClass ) | ( ruleAddStandardClass ) | ( ruleRenameEntity ) | ( ruleSetParent ) | ( ruleSetAbstract ) | ( ruleRemoveEntity ) | ( ruleAddProperty ) | ( ruleRenameProperty ) | ( ruleRemoveProperty ) | ( ruleSetType ) | ( ruleSetOpposite ) | ( ruleSetBounds ) | ( ruleSetOrdered ) | ( ruleSetUnique ) | ( ruleCopyProperty ) | ( ruleMoveProperty ) )
            int alt3=17;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:818:1: ( ruleAddPrimitiveClass )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:818:1: ( ruleAddPrimitiveClass )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:819:1: ruleAddPrimitiveClass
                    {
                     before(grammarAccess.getAtomicOperationAccess().getAddPrimitiveClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAddPrimitiveClass_in_rule__AtomicOperation__Alternatives1669);
                    ruleAddPrimitiveClass();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getAddPrimitiveClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:824:6: ( ruleAddEmbeddedClass )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:824:6: ( ruleAddEmbeddedClass )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:825:1: ruleAddEmbeddedClass
                    {
                     before(grammarAccess.getAtomicOperationAccess().getAddEmbeddedClassParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAddEmbeddedClass_in_rule__AtomicOperation__Alternatives1686);
                    ruleAddEmbeddedClass();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getAddEmbeddedClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:830:6: ( ruleAddStandardClass )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:830:6: ( ruleAddStandardClass )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:831:1: ruleAddStandardClass
                    {
                     before(grammarAccess.getAtomicOperationAccess().getAddStandardClassParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAddStandardClass_in_rule__AtomicOperation__Alternatives1703);
                    ruleAddStandardClass();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getAddStandardClassParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:836:6: ( ruleRenameEntity )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:836:6: ( ruleRenameEntity )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:837:1: ruleRenameEntity
                    {
                     before(grammarAccess.getAtomicOperationAccess().getRenameEntityParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRenameEntity_in_rule__AtomicOperation__Alternatives1720);
                    ruleRenameEntity();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getRenameEntityParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:842:6: ( ruleSetParent )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:842:6: ( ruleSetParent )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:843:1: ruleSetParent
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetParentParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetParent_in_rule__AtomicOperation__Alternatives1737);
                    ruleSetParent();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetParentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:848:6: ( ruleSetAbstract )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:848:6: ( ruleSetAbstract )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:849:1: ruleSetAbstract
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetAbstractParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetAbstract_in_rule__AtomicOperation__Alternatives1754);
                    ruleSetAbstract();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetAbstractParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:854:6: ( ruleRemoveEntity )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:854:6: ( ruleRemoveEntity )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:855:1: ruleRemoveEntity
                    {
                     before(grammarAccess.getAtomicOperationAccess().getRemoveEntityParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRemoveEntity_in_rule__AtomicOperation__Alternatives1771);
                    ruleRemoveEntity();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getRemoveEntityParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:860:6: ( ruleAddProperty )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:860:6: ( ruleAddProperty )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:861:1: ruleAddProperty
                    {
                     before(grammarAccess.getAtomicOperationAccess().getAddPropertyParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAddProperty_in_rule__AtomicOperation__Alternatives1788);
                    ruleAddProperty();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getAddPropertyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:866:6: ( ruleRenameProperty )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:866:6: ( ruleRenameProperty )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:867:1: ruleRenameProperty
                    {
                     before(grammarAccess.getAtomicOperationAccess().getRenamePropertyParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRenameProperty_in_rule__AtomicOperation__Alternatives1805);
                    ruleRenameProperty();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getRenamePropertyParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:872:6: ( ruleRemoveProperty )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:872:6: ( ruleRemoveProperty )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:873:1: ruleRemoveProperty
                    {
                     before(grammarAccess.getAtomicOperationAccess().getRemovePropertyParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRemoveProperty_in_rule__AtomicOperation__Alternatives1822);
                    ruleRemoveProperty();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getRemovePropertyParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:878:6: ( ruleSetType )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:878:6: ( ruleSetType )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:879:1: ruleSetType
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetTypeParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetType_in_rule__AtomicOperation__Alternatives1839);
                    ruleSetType();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:884:6: ( ruleSetOpposite )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:884:6: ( ruleSetOpposite )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:885:1: ruleSetOpposite
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetOppositeParserRuleCall_11()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetOpposite_in_rule__AtomicOperation__Alternatives1856);
                    ruleSetOpposite();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetOppositeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:890:6: ( ruleSetBounds )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:890:6: ( ruleSetBounds )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:891:1: ruleSetBounds
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetBoundsParserRuleCall_12()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetBounds_in_rule__AtomicOperation__Alternatives1873);
                    ruleSetBounds();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetBoundsParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:896:6: ( ruleSetOrdered )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:896:6: ( ruleSetOrdered )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:897:1: ruleSetOrdered
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetOrderedParserRuleCall_13()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetOrdered_in_rule__AtomicOperation__Alternatives1890);
                    ruleSetOrdered();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetOrderedParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:902:6: ( ruleSetUnique )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:902:6: ( ruleSetUnique )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:903:1: ruleSetUnique
                    {
                     before(grammarAccess.getAtomicOperationAccess().getSetUniqueParserRuleCall_14()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSetUnique_in_rule__AtomicOperation__Alternatives1907);
                    ruleSetUnique();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getSetUniqueParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:908:6: ( ruleCopyProperty )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:908:6: ( ruleCopyProperty )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:909:1: ruleCopyProperty
                    {
                     before(grammarAccess.getAtomicOperationAccess().getCopyPropertyParserRuleCall_15()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCopyProperty_in_rule__AtomicOperation__Alternatives1924);
                    ruleCopyProperty();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getCopyPropertyParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:914:6: ( ruleMoveProperty )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:914:6: ( ruleMoveProperty )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:915:1: ruleMoveProperty
                    {
                     before(grammarAccess.getAtomicOperationAccess().getMovePropertyParserRuleCall_16()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMoveProperty_in_rule__AtomicOperation__Alternatives1941);
                    ruleMoveProperty();

                    state._fsp--;

                     after(grammarAccess.getAtomicOperationAccess().getMovePropertyParserRuleCall_16()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicOperation__Alternatives"


    // $ANTLR start "rule__DecomposableOperation__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:925:1: rule__DecomposableOperation__Alternatives : ( ( ruleExtractClass ) | ( ruleExtractParent ) );
    public final void rule__DecomposableOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:929:1: ( ( ruleExtractClass ) | ( ruleExtractParent ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else if ( (LA4_1==34) ) {
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
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:930:1: ( ruleExtractClass )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:930:1: ( ruleExtractClass )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:931:1: ruleExtractClass
                    {
                     before(grammarAccess.getDecomposableOperationAccess().getExtractClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtractClass_in_rule__DecomposableOperation__Alternatives1973);
                    ruleExtractClass();

                    state._fsp--;

                     after(grammarAccess.getDecomposableOperationAccess().getExtractClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:936:6: ( ruleExtractParent )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:936:6: ( ruleExtractParent )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:937:1: ruleExtractParent
                    {
                     before(grammarAccess.getDecomposableOperationAccess().getExtractParentParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtractParent_in_rule__DecomposableOperation__Alternatives1990);
                    ruleExtractParent();

                    state._fsp--;

                     after(grammarAccess.getDecomposableOperationAccess().getExtractParentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecomposableOperation__Alternatives"


    // $ANTLR start "rule__SetParent__Alternatives_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:947:1: rule__SetParent__Alternatives_1 : ( ( ( rule__SetParent__Group_1_0__0 ) ) | ( '!<' ) );
    public final void rule__SetParent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:951:1: ( ( ( rule__SetParent__Group_1_0__0 ) ) | ( '!<' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:952:1: ( ( rule__SetParent__Group_1_0__0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:952:1: ( ( rule__SetParent__Group_1_0__0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:953:1: ( rule__SetParent__Group_1_0__0 )
                    {
                     before(grammarAccess.getSetParentAccess().getGroup_1_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:954:1: ( rule__SetParent__Group_1_0__0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:954:2: rule__SetParent__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group_1_0__0_in_rule__SetParent__Alternatives_12022);
                    rule__SetParent__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetParentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:958:6: ( '!<' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:958:6: ( '!<' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:959:1: '!<'
                    {
                     before(grammarAccess.getSetParentAccess().getExclamationMarkLessThanSignKeyword_1_1()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__SetParent__Alternatives_12041); 
                     after(grammarAccess.getSetParentAccess().getExclamationMarkLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Alternatives_1"


    // $ANTLR start "rule__SetAbstract__Alternatives_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:971:1: rule__SetAbstract__Alternatives_1 : ( ( ( rule__SetAbstract__IsAbstractAssignment_1_0 ) ) | ( '!abstract' ) );
    public final void rule__SetAbstract__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:975:1: ( ( ( rule__SetAbstract__IsAbstractAssignment_1_0 ) ) | ( '!abstract' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:976:1: ( ( rule__SetAbstract__IsAbstractAssignment_1_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:976:1: ( ( rule__SetAbstract__IsAbstractAssignment_1_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:977:1: ( rule__SetAbstract__IsAbstractAssignment_1_0 )
                    {
                     before(grammarAccess.getSetAbstractAccess().getIsAbstractAssignment_1_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:978:1: ( rule__SetAbstract__IsAbstractAssignment_1_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:978:2: rule__SetAbstract__IsAbstractAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__IsAbstractAssignment_1_0_in_rule__SetAbstract__Alternatives_12075);
                    rule__SetAbstract__IsAbstractAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAbstractAccess().getIsAbstractAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:982:6: ( '!abstract' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:982:6: ( '!abstract' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:983:1: '!abstract'
                    {
                     before(grammarAccess.getSetAbstractAccess().getAbstractKeyword_1_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__SetAbstract__Alternatives_12094); 
                     after(grammarAccess.getSetAbstractAccess().getAbstractKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__Alternatives_1"


    // $ANTLR start "rule__AddProperty__Alternatives_2_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:995:1: rule__AddProperty__Alternatives_2_0 : ( ( '!ordered' ) | ( ( rule__AddProperty__IsOrderedAssignment_2_0_1 ) ) );
    public final void rule__AddProperty__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:999:1: ( ( '!ordered' ) | ( ( rule__AddProperty__IsOrderedAssignment_2_0_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1000:1: ( '!ordered' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1000:1: ( '!ordered' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1001:1: '!ordered'
                    {
                     before(grammarAccess.getAddPropertyAccess().getOrderedKeyword_2_0_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__AddProperty__Alternatives_2_02129); 
                     after(grammarAccess.getAddPropertyAccess().getOrderedKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1008:6: ( ( rule__AddProperty__IsOrderedAssignment_2_0_1 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1008:6: ( ( rule__AddProperty__IsOrderedAssignment_2_0_1 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1009:1: ( rule__AddProperty__IsOrderedAssignment_2_0_1 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getIsOrderedAssignment_2_0_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1010:1: ( rule__AddProperty__IsOrderedAssignment_2_0_1 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1010:2: rule__AddProperty__IsOrderedAssignment_2_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__IsOrderedAssignment_2_0_1_in_rule__AddProperty__Alternatives_2_02148);
                    rule__AddProperty__IsOrderedAssignment_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getIsOrderedAssignment_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Alternatives_2_0"


    // $ANTLR start "rule__AddProperty__Alternatives_2_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1019:1: rule__AddProperty__Alternatives_2_1 : ( ( '!unique' ) | ( ( rule__AddProperty__IsUniqueAssignment_2_1_1 ) ) );
    public final void rule__AddProperty__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1023:1: ( ( '!unique' ) | ( ( rule__AddProperty__IsUniqueAssignment_2_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==45) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1024:1: ( '!unique' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1024:1: ( '!unique' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1025:1: '!unique'
                    {
                     before(grammarAccess.getAddPropertyAccess().getUniqueKeyword_2_1_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__AddProperty__Alternatives_2_12182); 
                     after(grammarAccess.getAddPropertyAccess().getUniqueKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1032:6: ( ( rule__AddProperty__IsUniqueAssignment_2_1_1 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1032:6: ( ( rule__AddProperty__IsUniqueAssignment_2_1_1 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1033:1: ( rule__AddProperty__IsUniqueAssignment_2_1_1 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getIsUniqueAssignment_2_1_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1034:1: ( rule__AddProperty__IsUniqueAssignment_2_1_1 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1034:2: rule__AddProperty__IsUniqueAssignment_2_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__IsUniqueAssignment_2_1_1_in_rule__AddProperty__Alternatives_2_12201);
                    rule__AddProperty__IsUniqueAssignment_2_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getIsUniqueAssignment_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Alternatives_2_1"


    // $ANTLR start "rule__AddProperty__Alternatives_6_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1043:1: rule__AddProperty__Alternatives_6_1 : ( ( ( rule__AddProperty__UpperBoundAssignment_6_1_0 ) ) | ( ( rule__AddProperty__Group_6_1_1__0 ) ) );
    public final void rule__AddProperty__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1047:1: ( ( ( rule__AddProperty__UpperBoundAssignment_6_1_0 ) ) | ( ( rule__AddProperty__Group_6_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==35) ) {
                    alt9=1;
                }
                else if ( (LA9_1==36) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1048:1: ( ( rule__AddProperty__UpperBoundAssignment_6_1_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1048:1: ( ( rule__AddProperty__UpperBoundAssignment_6_1_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1049:1: ( rule__AddProperty__UpperBoundAssignment_6_1_0 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getUpperBoundAssignment_6_1_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1050:1: ( rule__AddProperty__UpperBoundAssignment_6_1_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1050:2: rule__AddProperty__UpperBoundAssignment_6_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UpperBoundAssignment_6_1_0_in_rule__AddProperty__Alternatives_6_12234);
                    rule__AddProperty__UpperBoundAssignment_6_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getUpperBoundAssignment_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1054:6: ( ( rule__AddProperty__Group_6_1_1__0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1054:6: ( ( rule__AddProperty__Group_6_1_1__0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1055:1: ( rule__AddProperty__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getGroup_6_1_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1056:1: ( rule__AddProperty__Group_6_1_1__0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1056:2: rule__AddProperty__Group_6_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__0_in_rule__AddProperty__Alternatives_6_12252);
                    rule__AddProperty__Group_6_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getGroup_6_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Alternatives_6_1"


    // $ANTLR start "rule__SetOpposite__Alternatives_3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1065:1: rule__SetOpposite__Alternatives_3 : ( ( ( rule__SetOpposite__IsOppositeAssignment_3_0 ) ) | ( '!<->' ) );
    public final void rule__SetOpposite__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1069:1: ( ( ( rule__SetOpposite__IsOppositeAssignment_3_0 ) ) | ( '!<->' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1070:1: ( ( rule__SetOpposite__IsOppositeAssignment_3_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1070:1: ( ( rule__SetOpposite__IsOppositeAssignment_3_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1071:1: ( rule__SetOpposite__IsOppositeAssignment_3_0 )
                    {
                     before(grammarAccess.getSetOppositeAccess().getIsOppositeAssignment_3_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1072:1: ( rule__SetOpposite__IsOppositeAssignment_3_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1072:2: rule__SetOpposite__IsOppositeAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__IsOppositeAssignment_3_0_in_rule__SetOpposite__Alternatives_32285);
                    rule__SetOpposite__IsOppositeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetOppositeAccess().getIsOppositeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1076:6: ( '!<->' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1076:6: ( '!<->' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1077:1: '!<->'
                    {
                     before(grammarAccess.getSetOppositeAccess().getExclamationMarkLessThanSignHyphenMinusGreaterThanSignKeyword_3_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__SetOpposite__Alternatives_32304); 
                     after(grammarAccess.getSetOppositeAccess().getExclamationMarkLessThanSignHyphenMinusGreaterThanSignKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Alternatives_3"


    // $ANTLR start "rule__SetBounds__Alternatives_3_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1089:1: rule__SetBounds__Alternatives_3_1 : ( ( ( rule__SetBounds__UpperBoundAssignment_3_1_0 ) ) | ( ( rule__SetBounds__Group_3_1_1__0 ) ) );
    public final void rule__SetBounds__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1093:1: ( ( ( rule__SetBounds__UpperBoundAssignment_3_1_0 ) ) | ( ( rule__SetBounds__Group_3_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==35) ) {
                    alt11=1;
                }
                else if ( (LA11_1==36) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1094:1: ( ( rule__SetBounds__UpperBoundAssignment_3_1_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1094:1: ( ( rule__SetBounds__UpperBoundAssignment_3_1_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1095:1: ( rule__SetBounds__UpperBoundAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSetBoundsAccess().getUpperBoundAssignment_3_1_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1096:1: ( rule__SetBounds__UpperBoundAssignment_3_1_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1096:2: rule__SetBounds__UpperBoundAssignment_3_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetBounds__UpperBoundAssignment_3_1_0_in_rule__SetBounds__Alternatives_3_12338);
                    rule__SetBounds__UpperBoundAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetBoundsAccess().getUpperBoundAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1100:6: ( ( rule__SetBounds__Group_3_1_1__0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1100:6: ( ( rule__SetBounds__Group_3_1_1__0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1101:1: ( rule__SetBounds__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSetBoundsAccess().getGroup_3_1_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1102:1: ( rule__SetBounds__Group_3_1_1__0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1102:2: rule__SetBounds__Group_3_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__0_in_rule__SetBounds__Alternatives_3_12356);
                    rule__SetBounds__Group_3_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetBoundsAccess().getGroup_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Alternatives_3_1"


    // $ANTLR start "rule__SetOrdered__Alternatives_3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1111:1: rule__SetOrdered__Alternatives_3 : ( ( ( rule__SetOrdered__IsOrderedAssignment_3_0 ) ) | ( '!ordered' ) );
    public final void rule__SetOrdered__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1115:1: ( ( ( rule__SetOrdered__IsOrderedAssignment_3_0 ) ) | ( '!ordered' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1116:1: ( ( rule__SetOrdered__IsOrderedAssignment_3_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1116:1: ( ( rule__SetOrdered__IsOrderedAssignment_3_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1117:1: ( rule__SetOrdered__IsOrderedAssignment_3_0 )
                    {
                     before(grammarAccess.getSetOrderedAccess().getIsOrderedAssignment_3_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1118:1: ( rule__SetOrdered__IsOrderedAssignment_3_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1118:2: rule__SetOrdered__IsOrderedAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__IsOrderedAssignment_3_0_in_rule__SetOrdered__Alternatives_32389);
                    rule__SetOrdered__IsOrderedAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetOrderedAccess().getIsOrderedAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1122:6: ( '!ordered' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1122:6: ( '!ordered' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1123:1: '!ordered'
                    {
                     before(grammarAccess.getSetOrderedAccess().getOrderedKeyword_3_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__SetOrdered__Alternatives_32408); 
                     after(grammarAccess.getSetOrderedAccess().getOrderedKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Alternatives_3"


    // $ANTLR start "rule__SetUnique__Alternatives_3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1135:1: rule__SetUnique__Alternatives_3 : ( ( ( rule__SetUnique__IsUniqueAssignment_3_0 ) ) | ( '!unique' ) );
    public final void rule__SetUnique__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1139:1: ( ( ( rule__SetUnique__IsUniqueAssignment_3_0 ) ) | ( '!unique' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1140:1: ( ( rule__SetUnique__IsUniqueAssignment_3_0 ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1140:1: ( ( rule__SetUnique__IsUniqueAssignment_3_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1141:1: ( rule__SetUnique__IsUniqueAssignment_3_0 )
                    {
                     before(grammarAccess.getSetUniqueAccess().getIsUniqueAssignment_3_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1142:1: ( rule__SetUnique__IsUniqueAssignment_3_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1142:2: rule__SetUnique__IsUniqueAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetUnique__IsUniqueAssignment_3_0_in_rule__SetUnique__Alternatives_32442);
                    rule__SetUnique__IsUniqueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetUniqueAccess().getIsUniqueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1146:6: ( '!unique' )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1146:6: ( '!unique' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1147:1: '!unique'
                    {
                     before(grammarAccess.getSetUniqueAccess().getUniqueKeyword_3_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__SetUnique__Alternatives_32461); 
                     after(grammarAccess.getSetUniqueAccess().getUniqueKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Alternatives_3"


    // $ANTLR start "rule__MergeType__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1160:1: rule__MergeType__Alternatives : ( ( ( 'strict' ) ) | ( ( 'force' ) ) | ( ( 'tolerant' ) ) );
    public final void rule__MergeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1164:1: ( ( ( 'strict' ) ) | ( ( 'force' ) ) | ( ( 'tolerant' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case 18:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1165:1: ( ( 'strict' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1165:1: ( ( 'strict' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1166:1: ( 'strict' )
                    {
                     before(grammarAccess.getMergeTypeAccess().getStrictEnumLiteralDeclaration_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1167:1: ( 'strict' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1167:3: 'strict'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MergeType__Alternatives2497); 

                    }

                     after(grammarAccess.getMergeTypeAccess().getStrictEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1172:6: ( ( 'force' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1172:6: ( ( 'force' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1173:1: ( 'force' )
                    {
                     before(grammarAccess.getMergeTypeAccess().getForceEnumLiteralDeclaration_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1174:1: ( 'force' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1174:3: 'force'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MergeType__Alternatives2518); 

                    }

                     after(grammarAccess.getMergeTypeAccess().getForceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1179:6: ( ( 'tolerant' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1179:6: ( ( 'tolerant' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1180:1: ( 'tolerant' )
                    {
                     before(grammarAccess.getMergeTypeAccess().getTolerantEnumLiteralDeclaration_2()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1181:1: ( 'tolerant' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1181:3: 'tolerant'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MergeType__Alternatives2539); 

                    }

                     after(grammarAccess.getMergeTypeAccess().getTolerantEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MergeType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1191:1: rule__PrimitiveType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1195:1: ( ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1196:1: ( ( 'boolean' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1196:1: ( ( 'boolean' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1197:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1198:1: ( 'boolean' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1198:3: 'boolean'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__PrimitiveType__Alternatives2575); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1203:6: ( ( 'char' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1203:6: ( ( 'char' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1204:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1205:1: ( 'char' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1205:3: 'char'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__PrimitiveType__Alternatives2596); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1210:6: ( ( 'int' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1210:6: ( ( 'int' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1211:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1212:1: ( 'int' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1212:3: 'int'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__PrimitiveType__Alternatives2617); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__InheritanceType__Alternatives"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1222:1: rule__InheritanceType__Alternatives : ( ( ( 'joined' ) ) | ( ( 'tablePerClass' ) ) | ( ( 'singleTable' ) ) );
    public final void rule__InheritanceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1226:1: ( ( ( 'joined' ) ) | ( ( 'tablePerClass' ) ) | ( ( 'singleTable' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1227:1: ( ( 'joined' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1227:1: ( ( 'joined' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1228:1: ( 'joined' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1229:1: ( 'joined' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1229:3: 'joined'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__InheritanceType__Alternatives2653); 

                    }

                     after(grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1234:6: ( ( 'tablePerClass' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1234:6: ( ( 'tablePerClass' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1235:1: ( 'tablePerClass' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1236:1: ( 'tablePerClass' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1236:3: 'tablePerClass'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__InheritanceType__Alternatives2674); 

                    }

                     after(grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1241:6: ( ( 'singleTable' ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1241:6: ( ( 'singleTable' ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1242:1: ( 'singleTable' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1243:1: ( 'singleTable' )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1243:3: 'singleTable'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__InheritanceType__Alternatives2695); 

                    }

                     after(grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InheritanceType__Alternatives"


    // $ANTLR start "rule__AddPrimitiveClass__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1255:1: rule__AddPrimitiveClass__Group__0 : rule__AddPrimitiveClass__Group__0__Impl rule__AddPrimitiveClass__Group__1 ;
    public final void rule__AddPrimitiveClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1259:1: ( rule__AddPrimitiveClass__Group__0__Impl rule__AddPrimitiveClass__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1260:2: rule__AddPrimitiveClass__Group__0__Impl rule__AddPrimitiveClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__0__Impl_in_rule__AddPrimitiveClass__Group__02728);
            rule__AddPrimitiveClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__1_in_rule__AddPrimitiveClass__Group__02731);
            rule__AddPrimitiveClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__0"


    // $ANTLR start "rule__AddPrimitiveClass__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1267:1: rule__AddPrimitiveClass__Group__0__Impl : ( ( rule__AddPrimitiveClass__NameAssignment_0 ) ) ;
    public final void rule__AddPrimitiveClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1271:1: ( ( ( rule__AddPrimitiveClass__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1272:1: ( ( rule__AddPrimitiveClass__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1272:1: ( ( rule__AddPrimitiveClass__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1273:1: ( rule__AddPrimitiveClass__NameAssignment_0 )
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1274:1: ( rule__AddPrimitiveClass__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1274:2: rule__AddPrimitiveClass__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__NameAssignment_0_in_rule__AddPrimitiveClass__Group__0__Impl2758);
            rule__AddPrimitiveClass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddPrimitiveClassAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__0__Impl"


    // $ANTLR start "rule__AddPrimitiveClass__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1284:1: rule__AddPrimitiveClass__Group__1 : rule__AddPrimitiveClass__Group__1__Impl rule__AddPrimitiveClass__Group__2 ;
    public final void rule__AddPrimitiveClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1288:1: ( rule__AddPrimitiveClass__Group__1__Impl rule__AddPrimitiveClass__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1289:2: rule__AddPrimitiveClass__Group__1__Impl rule__AddPrimitiveClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__1__Impl_in_rule__AddPrimitiveClass__Group__12788);
            rule__AddPrimitiveClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__2_in_rule__AddPrimitiveClass__Group__12791);
            rule__AddPrimitiveClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__1"


    // $ANTLR start "rule__AddPrimitiveClass__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1296:1: rule__AddPrimitiveClass__Group__1__Impl : ( '=' ) ;
    public final void rule__AddPrimitiveClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1300:1: ( ( '=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1301:1: ( '=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1301:1: ( '=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1302:1: '='
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getEqualsSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AddPrimitiveClass__Group__1__Impl2819); 
             after(grammarAccess.getAddPrimitiveClassAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__1__Impl"


    // $ANTLR start "rule__AddPrimitiveClass__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1315:1: rule__AddPrimitiveClass__Group__2 : rule__AddPrimitiveClass__Group__2__Impl rule__AddPrimitiveClass__Group__3 ;
    public final void rule__AddPrimitiveClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1319:1: ( rule__AddPrimitiveClass__Group__2__Impl rule__AddPrimitiveClass__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1320:2: rule__AddPrimitiveClass__Group__2__Impl rule__AddPrimitiveClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__2__Impl_in_rule__AddPrimitiveClass__Group__22850);
            rule__AddPrimitiveClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__3_in_rule__AddPrimitiveClass__Group__22853);
            rule__AddPrimitiveClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__2"


    // $ANTLR start "rule__AddPrimitiveClass__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1327:1: rule__AddPrimitiveClass__Group__2__Impl : ( 'primitive' ) ;
    public final void rule__AddPrimitiveClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1331:1: ( ( 'primitive' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1332:1: ( 'primitive' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1332:1: ( 'primitive' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1333:1: 'primitive'
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AddPrimitiveClass__Group__2__Impl2881); 
             after(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__2__Impl"


    // $ANTLR start "rule__AddPrimitiveClass__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1346:1: rule__AddPrimitiveClass__Group__3 : rule__AddPrimitiveClass__Group__3__Impl ;
    public final void rule__AddPrimitiveClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1350:1: ( rule__AddPrimitiveClass__Group__3__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1351:2: rule__AddPrimitiveClass__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__Group__3__Impl_in_rule__AddPrimitiveClass__Group__32912);
            rule__AddPrimitiveClass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__3"


    // $ANTLR start "rule__AddPrimitiveClass__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1357:1: rule__AddPrimitiveClass__Group__3__Impl : ( ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 ) ) ;
    public final void rule__AddPrimitiveClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1361:1: ( ( ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1362:1: ( ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1362:1: ( ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1363:1: ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 )
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveTypeAssignment_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1364:1: ( rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1364:2: rule__AddPrimitiveClass__PrimitiveTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddPrimitiveClass__PrimitiveTypeAssignment_3_in_rule__AddPrimitiveClass__Group__3__Impl2939);
            rule__AddPrimitiveClass__PrimitiveTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__Group__3__Impl"


    // $ANTLR start "rule__AddEmbeddedClass__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1382:1: rule__AddEmbeddedClass__Group__0 : rule__AddEmbeddedClass__Group__0__Impl rule__AddEmbeddedClass__Group__1 ;
    public final void rule__AddEmbeddedClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1386:1: ( rule__AddEmbeddedClass__Group__0__Impl rule__AddEmbeddedClass__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1387:2: rule__AddEmbeddedClass__Group__0__Impl rule__AddEmbeddedClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__0__Impl_in_rule__AddEmbeddedClass__Group__02977);
            rule__AddEmbeddedClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__1_in_rule__AddEmbeddedClass__Group__02980);
            rule__AddEmbeddedClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__0"


    // $ANTLR start "rule__AddEmbeddedClass__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1394:1: rule__AddEmbeddedClass__Group__0__Impl : ( ( rule__AddEmbeddedClass__NameAssignment_0 ) ) ;
    public final void rule__AddEmbeddedClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1398:1: ( ( ( rule__AddEmbeddedClass__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1399:1: ( ( rule__AddEmbeddedClass__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1399:1: ( ( rule__AddEmbeddedClass__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1400:1: ( rule__AddEmbeddedClass__NameAssignment_0 )
            {
             before(grammarAccess.getAddEmbeddedClassAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1401:1: ( rule__AddEmbeddedClass__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1401:2: rule__AddEmbeddedClass__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__NameAssignment_0_in_rule__AddEmbeddedClass__Group__0__Impl3007);
            rule__AddEmbeddedClass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddEmbeddedClassAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__0__Impl"


    // $ANTLR start "rule__AddEmbeddedClass__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1411:1: rule__AddEmbeddedClass__Group__1 : rule__AddEmbeddedClass__Group__1__Impl rule__AddEmbeddedClass__Group__2 ;
    public final void rule__AddEmbeddedClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1415:1: ( rule__AddEmbeddedClass__Group__1__Impl rule__AddEmbeddedClass__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1416:2: rule__AddEmbeddedClass__Group__1__Impl rule__AddEmbeddedClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__1__Impl_in_rule__AddEmbeddedClass__Group__13037);
            rule__AddEmbeddedClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__2_in_rule__AddEmbeddedClass__Group__13040);
            rule__AddEmbeddedClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__1"


    // $ANTLR start "rule__AddEmbeddedClass__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1423:1: rule__AddEmbeddedClass__Group__1__Impl : ( '=' ) ;
    public final void rule__AddEmbeddedClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1427:1: ( ( '=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1428:1: ( '=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1428:1: ( '=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1429:1: '='
            {
             before(grammarAccess.getAddEmbeddedClassAccess().getEqualsSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AddEmbeddedClass__Group__1__Impl3068); 
             after(grammarAccess.getAddEmbeddedClassAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__1__Impl"


    // $ANTLR start "rule__AddEmbeddedClass__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1442:1: rule__AddEmbeddedClass__Group__2 : rule__AddEmbeddedClass__Group__2__Impl ;
    public final void rule__AddEmbeddedClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1446:1: ( rule__AddEmbeddedClass__Group__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1447:2: rule__AddEmbeddedClass__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddEmbeddedClass__Group__2__Impl_in_rule__AddEmbeddedClass__Group__23099);
            rule__AddEmbeddedClass__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__2"


    // $ANTLR start "rule__AddEmbeddedClass__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1453:1: rule__AddEmbeddedClass__Group__2__Impl : ( 'embedded' ) ;
    public final void rule__AddEmbeddedClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1457:1: ( ( 'embedded' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1458:1: ( 'embedded' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1458:1: ( 'embedded' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1459:1: 'embedded'
            {
             before(grammarAccess.getAddEmbeddedClassAccess().getEmbeddedKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AddEmbeddedClass__Group__2__Impl3127); 
             after(grammarAccess.getAddEmbeddedClassAccess().getEmbeddedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__Group__2__Impl"


    // $ANTLR start "rule__AddStandardClass__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1478:1: rule__AddStandardClass__Group__0 : rule__AddStandardClass__Group__0__Impl rule__AddStandardClass__Group__1 ;
    public final void rule__AddStandardClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1482:1: ( rule__AddStandardClass__Group__0__Impl rule__AddStandardClass__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1483:2: rule__AddStandardClass__Group__0__Impl rule__AddStandardClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__0__Impl_in_rule__AddStandardClass__Group__03164);
            rule__AddStandardClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__1_in_rule__AddStandardClass__Group__03167);
            rule__AddStandardClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__0"


    // $ANTLR start "rule__AddStandardClass__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1490:1: rule__AddStandardClass__Group__0__Impl : ( ( rule__AddStandardClass__NameAssignment_0 ) ) ;
    public final void rule__AddStandardClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1494:1: ( ( ( rule__AddStandardClass__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1495:1: ( ( rule__AddStandardClass__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1495:1: ( ( rule__AddStandardClass__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1496:1: ( rule__AddStandardClass__NameAssignment_0 )
            {
             before(grammarAccess.getAddStandardClassAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1497:1: ( rule__AddStandardClass__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1497:2: rule__AddStandardClass__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__NameAssignment_0_in_rule__AddStandardClass__Group__0__Impl3194);
            rule__AddStandardClass__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddStandardClassAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__0__Impl"


    // $ANTLR start "rule__AddStandardClass__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1507:1: rule__AddStandardClass__Group__1 : rule__AddStandardClass__Group__1__Impl rule__AddStandardClass__Group__2 ;
    public final void rule__AddStandardClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1511:1: ( rule__AddStandardClass__Group__1__Impl rule__AddStandardClass__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1512:2: rule__AddStandardClass__Group__1__Impl rule__AddStandardClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__1__Impl_in_rule__AddStandardClass__Group__13224);
            rule__AddStandardClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__2_in_rule__AddStandardClass__Group__13227);
            rule__AddStandardClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__1"


    // $ANTLR start "rule__AddStandardClass__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1519:1: rule__AddStandardClass__Group__1__Impl : ( '=' ) ;
    public final void rule__AddStandardClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1523:1: ( ( '=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1524:1: ( '=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1524:1: ( '=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1525:1: '='
            {
             before(grammarAccess.getAddStandardClassAccess().getEqualsSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AddStandardClass__Group__1__Impl3255); 
             after(grammarAccess.getAddStandardClassAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__1__Impl"


    // $ANTLR start "rule__AddStandardClass__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1538:1: rule__AddStandardClass__Group__2 : rule__AddStandardClass__Group__2__Impl rule__AddStandardClass__Group__3 ;
    public final void rule__AddStandardClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1542:1: ( rule__AddStandardClass__Group__2__Impl rule__AddStandardClass__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1543:2: rule__AddStandardClass__Group__2__Impl rule__AddStandardClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__2__Impl_in_rule__AddStandardClass__Group__23286);
            rule__AddStandardClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__3_in_rule__AddStandardClass__Group__23289);
            rule__AddStandardClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__2"


    // $ANTLR start "rule__AddStandardClass__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1550:1: rule__AddStandardClass__Group__2__Impl : ( ( rule__AddStandardClass__UnorderedGroup_2 )? ) ;
    public final void rule__AddStandardClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1554:1: ( ( ( rule__AddStandardClass__UnorderedGroup_2 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1555:1: ( ( rule__AddStandardClass__UnorderedGroup_2 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1555:1: ( ( rule__AddStandardClass__UnorderedGroup_2 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1556:1: ( rule__AddStandardClass__UnorderedGroup_2 )?
            {
             before(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1557:1: ( rule__AddStandardClass__UnorderedGroup_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 >=22 && LA17_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1557:2: rule__AddStandardClass__UnorderedGroup_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__UnorderedGroup_2_in_rule__AddStandardClass__Group__2__Impl3316);
                    rule__AddStandardClass__UnorderedGroup_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__2__Impl"


    // $ANTLR start "rule__AddStandardClass__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1567:1: rule__AddStandardClass__Group__3 : rule__AddStandardClass__Group__3__Impl ;
    public final void rule__AddStandardClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1571:1: ( rule__AddStandardClass__Group__3__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1572:2: rule__AddStandardClass__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__Group__3__Impl_in_rule__AddStandardClass__Group__33347);
            rule__AddStandardClass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__3"


    // $ANTLR start "rule__AddStandardClass__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1578:1: rule__AddStandardClass__Group__3__Impl : ( 'class' ) ;
    public final void rule__AddStandardClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1582:1: ( ( 'class' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1583:1: ( 'class' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1583:1: ( 'class' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1584:1: 'class'
            {
             before(grammarAccess.getAddStandardClassAccess().getClassKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AddStandardClass__Group__3__Impl3375); 
             after(grammarAccess.getAddStandardClassAccess().getClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__Group__3__Impl"


    // $ANTLR start "rule__RenameEntity__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1605:1: rule__RenameEntity__Group__0 : rule__RenameEntity__Group__0__Impl rule__RenameEntity__Group__1 ;
    public final void rule__RenameEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1609:1: ( rule__RenameEntity__Group__0__Impl rule__RenameEntity__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1610:2: rule__RenameEntity__Group__0__Impl rule__RenameEntity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__0__Impl_in_rule__RenameEntity__Group__03414);
            rule__RenameEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__1_in_rule__RenameEntity__Group__03417);
            rule__RenameEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__0"


    // $ANTLR start "rule__RenameEntity__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1617:1: rule__RenameEntity__Group__0__Impl : ( ( rule__RenameEntity__NameAssignment_0 ) ) ;
    public final void rule__RenameEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1621:1: ( ( ( rule__RenameEntity__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1622:1: ( ( rule__RenameEntity__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1622:1: ( ( rule__RenameEntity__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1623:1: ( rule__RenameEntity__NameAssignment_0 )
            {
             before(grammarAccess.getRenameEntityAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1624:1: ( rule__RenameEntity__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1624:2: rule__RenameEntity__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__NameAssignment_0_in_rule__RenameEntity__Group__0__Impl3444);
            rule__RenameEntity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenameEntityAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__0__Impl"


    // $ANTLR start "rule__RenameEntity__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1634:1: rule__RenameEntity__Group__1 : rule__RenameEntity__Group__1__Impl rule__RenameEntity__Group__2 ;
    public final void rule__RenameEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1638:1: ( rule__RenameEntity__Group__1__Impl rule__RenameEntity__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1639:2: rule__RenameEntity__Group__1__Impl rule__RenameEntity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__1__Impl_in_rule__RenameEntity__Group__13474);
            rule__RenameEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__2_in_rule__RenameEntity__Group__13477);
            rule__RenameEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__1"


    // $ANTLR start "rule__RenameEntity__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1646:1: rule__RenameEntity__Group__1__Impl : ( '->' ) ;
    public final void rule__RenameEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1650:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1651:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1651:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1652:1: '->'
            {
             before(grammarAccess.getRenameEntityAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RenameEntity__Group__1__Impl3505); 
             after(grammarAccess.getRenameEntityAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__1__Impl"


    // $ANTLR start "rule__RenameEntity__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1665:1: rule__RenameEntity__Group__2 : rule__RenameEntity__Group__2__Impl ;
    public final void rule__RenameEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1669:1: ( rule__RenameEntity__Group__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1670:2: rule__RenameEntity__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__Group__2__Impl_in_rule__RenameEntity__Group__23536);
            rule__RenameEntity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__2"


    // $ANTLR start "rule__RenameEntity__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1676:1: rule__RenameEntity__Group__2__Impl : ( ( rule__RenameEntity__NewNameAssignment_2 ) ) ;
    public final void rule__RenameEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1680:1: ( ( ( rule__RenameEntity__NewNameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1681:1: ( ( rule__RenameEntity__NewNameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1681:1: ( ( rule__RenameEntity__NewNameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1682:1: ( rule__RenameEntity__NewNameAssignment_2 )
            {
             before(grammarAccess.getRenameEntityAccess().getNewNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1683:1: ( rule__RenameEntity__NewNameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1683:2: rule__RenameEntity__NewNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameEntity__NewNameAssignment_2_in_rule__RenameEntity__Group__2__Impl3563);
            rule__RenameEntity__NewNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameEntityAccess().getNewNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__Group__2__Impl"


    // $ANTLR start "rule__SetParent__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1699:1: rule__SetParent__Group__0 : rule__SetParent__Group__0__Impl rule__SetParent__Group__1 ;
    public final void rule__SetParent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1703:1: ( rule__SetParent__Group__0__Impl rule__SetParent__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1704:2: rule__SetParent__Group__0__Impl rule__SetParent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group__0__Impl_in_rule__SetParent__Group__03599);
            rule__SetParent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group__1_in_rule__SetParent__Group__03602);
            rule__SetParent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group__0"


    // $ANTLR start "rule__SetParent__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1711:1: rule__SetParent__Group__0__Impl : ( ( rule__SetParent__NameAssignment_0 ) ) ;
    public final void rule__SetParent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1715:1: ( ( ( rule__SetParent__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1716:1: ( ( rule__SetParent__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1716:1: ( ( rule__SetParent__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1717:1: ( rule__SetParent__NameAssignment_0 )
            {
             before(grammarAccess.getSetParentAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1718:1: ( rule__SetParent__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1718:2: rule__SetParent__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__NameAssignment_0_in_rule__SetParent__Group__0__Impl3629);
            rule__SetParent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetParentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group__0__Impl"


    // $ANTLR start "rule__SetParent__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1728:1: rule__SetParent__Group__1 : rule__SetParent__Group__1__Impl ;
    public final void rule__SetParent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1732:1: ( rule__SetParent__Group__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1733:2: rule__SetParent__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group__1__Impl_in_rule__SetParent__Group__13659);
            rule__SetParent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group__1"


    // $ANTLR start "rule__SetParent__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1739:1: rule__SetParent__Group__1__Impl : ( ( rule__SetParent__Alternatives_1 ) ) ;
    public final void rule__SetParent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1743:1: ( ( ( rule__SetParent__Alternatives_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1744:1: ( ( rule__SetParent__Alternatives_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1744:1: ( ( rule__SetParent__Alternatives_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1745:1: ( rule__SetParent__Alternatives_1 )
            {
             before(grammarAccess.getSetParentAccess().getAlternatives_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1746:1: ( rule__SetParent__Alternatives_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1746:2: rule__SetParent__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Alternatives_1_in_rule__SetParent__Group__1__Impl3686);
            rule__SetParent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSetParentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group__1__Impl"


    // $ANTLR start "rule__SetParent__Group_1_0__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1760:1: rule__SetParent__Group_1_0__0 : rule__SetParent__Group_1_0__0__Impl rule__SetParent__Group_1_0__1 ;
    public final void rule__SetParent__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1764:1: ( rule__SetParent__Group_1_0__0__Impl rule__SetParent__Group_1_0__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1765:2: rule__SetParent__Group_1_0__0__Impl rule__SetParent__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group_1_0__0__Impl_in_rule__SetParent__Group_1_0__03720);
            rule__SetParent__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group_1_0__1_in_rule__SetParent__Group_1_0__03723);
            rule__SetParent__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group_1_0__0"


    // $ANTLR start "rule__SetParent__Group_1_0__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1772:1: rule__SetParent__Group_1_0__0__Impl : ( '<' ) ;
    public final void rule__SetParent__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1776:1: ( ( '<' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1777:1: ( '<' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1777:1: ( '<' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1778:1: '<'
            {
             before(grammarAccess.getSetParentAccess().getLessThanSignKeyword_1_0_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SetParent__Group_1_0__0__Impl3751); 
             after(grammarAccess.getSetParentAccess().getLessThanSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group_1_0__0__Impl"


    // $ANTLR start "rule__SetParent__Group_1_0__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1791:1: rule__SetParent__Group_1_0__1 : rule__SetParent__Group_1_0__1__Impl ;
    public final void rule__SetParent__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1795:1: ( rule__SetParent__Group_1_0__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1796:2: rule__SetParent__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__Group_1_0__1__Impl_in_rule__SetParent__Group_1_0__13782);
            rule__SetParent__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group_1_0__1"


    // $ANTLR start "rule__SetParent__Group_1_0__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1802:1: rule__SetParent__Group_1_0__1__Impl : ( ( rule__SetParent__ParentNameAssignment_1_0_1 ) ) ;
    public final void rule__SetParent__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1806:1: ( ( ( rule__SetParent__ParentNameAssignment_1_0_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1807:1: ( ( rule__SetParent__ParentNameAssignment_1_0_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1807:1: ( ( rule__SetParent__ParentNameAssignment_1_0_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1808:1: ( rule__SetParent__ParentNameAssignment_1_0_1 )
            {
             before(grammarAccess.getSetParentAccess().getParentNameAssignment_1_0_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1809:1: ( rule__SetParent__ParentNameAssignment_1_0_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1809:2: rule__SetParent__ParentNameAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetParent__ParentNameAssignment_1_0_1_in_rule__SetParent__Group_1_0__1__Impl3809);
            rule__SetParent__ParentNameAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetParentAccess().getParentNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__Group_1_0__1__Impl"


    // $ANTLR start "rule__SetAbstract__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1823:1: rule__SetAbstract__Group__0 : rule__SetAbstract__Group__0__Impl rule__SetAbstract__Group__1 ;
    public final void rule__SetAbstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1827:1: ( rule__SetAbstract__Group__0__Impl rule__SetAbstract__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1828:2: rule__SetAbstract__Group__0__Impl rule__SetAbstract__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__Group__0__Impl_in_rule__SetAbstract__Group__03843);
            rule__SetAbstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__Group__1_in_rule__SetAbstract__Group__03846);
            rule__SetAbstract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__Group__0"


    // $ANTLR start "rule__SetAbstract__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1835:1: rule__SetAbstract__Group__0__Impl : ( ( rule__SetAbstract__NameAssignment_0 ) ) ;
    public final void rule__SetAbstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1839:1: ( ( ( rule__SetAbstract__NameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1840:1: ( ( rule__SetAbstract__NameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1840:1: ( ( rule__SetAbstract__NameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1841:1: ( rule__SetAbstract__NameAssignment_0 )
            {
             before(grammarAccess.getSetAbstractAccess().getNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1842:1: ( rule__SetAbstract__NameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1842:2: rule__SetAbstract__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__NameAssignment_0_in_rule__SetAbstract__Group__0__Impl3873);
            rule__SetAbstract__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetAbstractAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__Group__0__Impl"


    // $ANTLR start "rule__SetAbstract__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1852:1: rule__SetAbstract__Group__1 : rule__SetAbstract__Group__1__Impl ;
    public final void rule__SetAbstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1856:1: ( rule__SetAbstract__Group__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1857:2: rule__SetAbstract__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__Group__1__Impl_in_rule__SetAbstract__Group__13903);
            rule__SetAbstract__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__Group__1"


    // $ANTLR start "rule__SetAbstract__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1863:1: rule__SetAbstract__Group__1__Impl : ( ( rule__SetAbstract__Alternatives_1 ) ) ;
    public final void rule__SetAbstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1867:1: ( ( ( rule__SetAbstract__Alternatives_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1868:1: ( ( rule__SetAbstract__Alternatives_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1868:1: ( ( rule__SetAbstract__Alternatives_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1869:1: ( rule__SetAbstract__Alternatives_1 )
            {
             before(grammarAccess.getSetAbstractAccess().getAlternatives_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1870:1: ( rule__SetAbstract__Alternatives_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1870:2: rule__SetAbstract__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetAbstract__Alternatives_1_in_rule__SetAbstract__Group__1__Impl3930);
            rule__SetAbstract__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAbstractAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__Group__1__Impl"


    // $ANTLR start "rule__RemoveEntity__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1884:1: rule__RemoveEntity__Group__0 : rule__RemoveEntity__Group__0__Impl rule__RemoveEntity__Group__1 ;
    public final void rule__RemoveEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1888:1: ( rule__RemoveEntity__Group__0__Impl rule__RemoveEntity__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1889:2: rule__RemoveEntity__Group__0__Impl rule__RemoveEntity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveEntity__Group__0__Impl_in_rule__RemoveEntity__Group__03964);
            rule__RemoveEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RemoveEntity__Group__1_in_rule__RemoveEntity__Group__03967);
            rule__RemoveEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEntity__Group__0"


    // $ANTLR start "rule__RemoveEntity__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1896:1: rule__RemoveEntity__Group__0__Impl : ( '!' ) ;
    public final void rule__RemoveEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1900:1: ( ( '!' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1901:1: ( '!' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1901:1: ( '!' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1902:1: '!'
            {
             before(grammarAccess.getRemoveEntityAccess().getExclamationMarkKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RemoveEntity__Group__0__Impl3995); 
             after(grammarAccess.getRemoveEntityAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEntity__Group__0__Impl"


    // $ANTLR start "rule__RemoveEntity__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1915:1: rule__RemoveEntity__Group__1 : rule__RemoveEntity__Group__1__Impl ;
    public final void rule__RemoveEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1919:1: ( rule__RemoveEntity__Group__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1920:2: rule__RemoveEntity__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveEntity__Group__1__Impl_in_rule__RemoveEntity__Group__14026);
            rule__RemoveEntity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEntity__Group__1"


    // $ANTLR start "rule__RemoveEntity__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1926:1: rule__RemoveEntity__Group__1__Impl : ( ( rule__RemoveEntity__NameAssignment_1 ) ) ;
    public final void rule__RemoveEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1930:1: ( ( ( rule__RemoveEntity__NameAssignment_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1931:1: ( ( rule__RemoveEntity__NameAssignment_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1931:1: ( ( rule__RemoveEntity__NameAssignment_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1932:1: ( rule__RemoveEntity__NameAssignment_1 )
            {
             before(grammarAccess.getRemoveEntityAccess().getNameAssignment_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1933:1: ( rule__RemoveEntity__NameAssignment_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1933:2: rule__RemoveEntity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveEntity__NameAssignment_1_in_rule__RemoveEntity__Group__1__Impl4053);
            rule__RemoveEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEntity__Group__1__Impl"


    // $ANTLR start "rule__AddProperty__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1947:1: rule__AddProperty__Group__0 : rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 ;
    public final void rule__AddProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1951:1: ( rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1952:2: rule__AddProperty__Group__0__Impl rule__AddProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04087);
            rule__AddProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04090);
            rule__AddProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__0"


    // $ANTLR start "rule__AddProperty__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1959:1: rule__AddProperty__Group__0__Impl : ( ( rule__AddProperty__OwningClassNameAssignment_0 ) ) ;
    public final void rule__AddProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1963:1: ( ( ( rule__AddProperty__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1964:1: ( ( rule__AddProperty__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1964:1: ( ( rule__AddProperty__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1965:1: ( rule__AddProperty__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getAddPropertyAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1966:1: ( rule__AddProperty__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1966:2: rule__AddProperty__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__OwningClassNameAssignment_0_in_rule__AddProperty__Group__0__Impl4117);
            rule__AddProperty__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__0__Impl"


    // $ANTLR start "rule__AddProperty__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1976:1: rule__AddProperty__Group__1 : rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 ;
    public final void rule__AddProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1980:1: ( rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1981:2: rule__AddProperty__Group__1__Impl rule__AddProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14147);
            rule__AddProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14150);
            rule__AddProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__1"


    // $ANTLR start "rule__AddProperty__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1988:1: rule__AddProperty__Group__1__Impl : ( '+=' ) ;
    public final void rule__AddProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1992:1: ( ( '+=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1993:1: ( '+=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1993:1: ( '+=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:1994:1: '+='
            {
             before(grammarAccess.getAddPropertyAccess().getPlusSignEqualsSignKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AddProperty__Group__1__Impl4178); 
             after(grammarAccess.getAddPropertyAccess().getPlusSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__1__Impl"


    // $ANTLR start "rule__AddProperty__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2007:1: rule__AddProperty__Group__2 : rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 ;
    public final void rule__AddProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2011:1: ( rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2012:2: rule__AddProperty__Group__2__Impl rule__AddProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24209);
            rule__AddProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24212);
            rule__AddProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__2"


    // $ANTLR start "rule__AddProperty__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2019:1: rule__AddProperty__Group__2__Impl : ( ( rule__AddProperty__UnorderedGroup_2 ) ) ;
    public final void rule__AddProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2023:1: ( ( ( rule__AddProperty__UnorderedGroup_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2024:1: ( ( rule__AddProperty__UnorderedGroup_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2024:1: ( ( rule__AddProperty__UnorderedGroup_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2025:1: ( rule__AddProperty__UnorderedGroup_2 )
            {
             before(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2026:1: ( rule__AddProperty__UnorderedGroup_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2026:2: rule__AddProperty__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UnorderedGroup_2_in_rule__AddProperty__Group__2__Impl4239);
            rule__AddProperty__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__2__Impl"


    // $ANTLR start "rule__AddProperty__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2036:1: rule__AddProperty__Group__3 : rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 ;
    public final void rule__AddProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2040:1: ( rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2041:2: rule__AddProperty__Group__3__Impl rule__AddProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34269);
            rule__AddProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34272);
            rule__AddProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__3"


    // $ANTLR start "rule__AddProperty__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2048:1: rule__AddProperty__Group__3__Impl : ( ( rule__AddProperty__NameAssignment_3 ) ) ;
    public final void rule__AddProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2052:1: ( ( ( rule__AddProperty__NameAssignment_3 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2053:1: ( ( rule__AddProperty__NameAssignment_3 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2053:1: ( ( rule__AddProperty__NameAssignment_3 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2054:1: ( rule__AddProperty__NameAssignment_3 )
            {
             before(grammarAccess.getAddPropertyAccess().getNameAssignment_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2055:1: ( rule__AddProperty__NameAssignment_3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2055:2: rule__AddProperty__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__NameAssignment_3_in_rule__AddProperty__Group__3__Impl4299);
            rule__AddProperty__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__3__Impl"


    // $ANTLR start "rule__AddProperty__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2065:1: rule__AddProperty__Group__4 : rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 ;
    public final void rule__AddProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2069:1: ( rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2070:2: rule__AddProperty__Group__4__Impl rule__AddProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44329);
            rule__AddProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44332);
            rule__AddProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__4"


    // $ANTLR start "rule__AddProperty__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2077:1: rule__AddProperty__Group__4__Impl : ( ':' ) ;
    public final void rule__AddProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2081:1: ( ( ':' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2082:1: ( ':' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2082:1: ( ':' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2083:1: ':'
            {
             before(grammarAccess.getAddPropertyAccess().getColonKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AddProperty__Group__4__Impl4360); 
             after(grammarAccess.getAddPropertyAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__4__Impl"


    // $ANTLR start "rule__AddProperty__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2096:1: rule__AddProperty__Group__5 : rule__AddProperty__Group__5__Impl rule__AddProperty__Group__6 ;
    public final void rule__AddProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2100:1: ( rule__AddProperty__Group__5__Impl rule__AddProperty__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2101:2: rule__AddProperty__Group__5__Impl rule__AddProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54391);
            rule__AddProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__6_in_rule__AddProperty__Group__54394);
            rule__AddProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__5"


    // $ANTLR start "rule__AddProperty__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2108:1: rule__AddProperty__Group__5__Impl : ( ( rule__AddProperty__TypeAssignment_5 ) ) ;
    public final void rule__AddProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2112:1: ( ( ( rule__AddProperty__TypeAssignment_5 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2113:1: ( ( rule__AddProperty__TypeAssignment_5 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2113:1: ( ( rule__AddProperty__TypeAssignment_5 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2114:1: ( rule__AddProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getAddPropertyAccess().getTypeAssignment_5()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2115:1: ( rule__AddProperty__TypeAssignment_5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2115:2: rule__AddProperty__TypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__TypeAssignment_5_in_rule__AddProperty__Group__5__Impl4421);
            rule__AddProperty__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__5__Impl"


    // $ANTLR start "rule__AddProperty__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2125:1: rule__AddProperty__Group__6 : rule__AddProperty__Group__6__Impl rule__AddProperty__Group__7 ;
    public final void rule__AddProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2129:1: ( rule__AddProperty__Group__6__Impl rule__AddProperty__Group__7 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2130:2: rule__AddProperty__Group__6__Impl rule__AddProperty__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__6__Impl_in_rule__AddProperty__Group__64451);
            rule__AddProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__7_in_rule__AddProperty__Group__64454);
            rule__AddProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__6"


    // $ANTLR start "rule__AddProperty__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2137:1: rule__AddProperty__Group__6__Impl : ( ( rule__AddProperty__Group_6__0 )? ) ;
    public final void rule__AddProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2141:1: ( ( ( rule__AddProperty__Group_6__0 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2142:1: ( ( rule__AddProperty__Group_6__0 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2142:1: ( ( rule__AddProperty__Group_6__0 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2143:1: ( rule__AddProperty__Group_6__0 )?
            {
             before(grammarAccess.getAddPropertyAccess().getGroup_6()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2144:1: ( rule__AddProperty__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2144:2: rule__AddProperty__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__0_in_rule__AddProperty__Group__6__Impl4481);
                    rule__AddProperty__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__6__Impl"


    // $ANTLR start "rule__AddProperty__Group__7"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2154:1: rule__AddProperty__Group__7 : rule__AddProperty__Group__7__Impl ;
    public final void rule__AddProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2158:1: ( rule__AddProperty__Group__7__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2159:2: rule__AddProperty__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group__7__Impl_in_rule__AddProperty__Group__74512);
            rule__AddProperty__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__7"


    // $ANTLR start "rule__AddProperty__Group__7__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2165:1: rule__AddProperty__Group__7__Impl : ( ( rule__AddProperty__Group_7__0 )? ) ;
    public final void rule__AddProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2169:1: ( ( ( rule__AddProperty__Group_7__0 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2170:1: ( ( rule__AddProperty__Group_7__0 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2170:1: ( ( rule__AddProperty__Group_7__0 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2171:1: ( rule__AddProperty__Group_7__0 )?
            {
             before(grammarAccess.getAddPropertyAccess().getGroup_7()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2172:1: ( rule__AddProperty__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2172:2: rule__AddProperty__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_7__0_in_rule__AddProperty__Group__7__Impl4539);
                    rule__AddProperty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group__7__Impl"


    // $ANTLR start "rule__AddProperty__Group_6__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2198:1: rule__AddProperty__Group_6__0 : rule__AddProperty__Group_6__0__Impl rule__AddProperty__Group_6__1 ;
    public final void rule__AddProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2202:1: ( rule__AddProperty__Group_6__0__Impl rule__AddProperty__Group_6__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2203:2: rule__AddProperty__Group_6__0__Impl rule__AddProperty__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__0__Impl_in_rule__AddProperty__Group_6__04586);
            rule__AddProperty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__1_in_rule__AddProperty__Group_6__04589);
            rule__AddProperty__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__0"


    // $ANTLR start "rule__AddProperty__Group_6__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2210:1: rule__AddProperty__Group_6__0__Impl : ( '[' ) ;
    public final void rule__AddProperty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2214:1: ( ( '[' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2215:1: ( '[' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2215:1: ( '[' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2216:1: '['
            {
             before(grammarAccess.getAddPropertyAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AddProperty__Group_6__0__Impl4617); 
             after(grammarAccess.getAddPropertyAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__0__Impl"


    // $ANTLR start "rule__AddProperty__Group_6__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2229:1: rule__AddProperty__Group_6__1 : rule__AddProperty__Group_6__1__Impl rule__AddProperty__Group_6__2 ;
    public final void rule__AddProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2233:1: ( rule__AddProperty__Group_6__1__Impl rule__AddProperty__Group_6__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2234:2: rule__AddProperty__Group_6__1__Impl rule__AddProperty__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__1__Impl_in_rule__AddProperty__Group_6__14648);
            rule__AddProperty__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__2_in_rule__AddProperty__Group_6__14651);
            rule__AddProperty__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__1"


    // $ANTLR start "rule__AddProperty__Group_6__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2241:1: rule__AddProperty__Group_6__1__Impl : ( ( rule__AddProperty__Alternatives_6_1 ) ) ;
    public final void rule__AddProperty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2245:1: ( ( ( rule__AddProperty__Alternatives_6_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2246:1: ( ( rule__AddProperty__Alternatives_6_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2246:1: ( ( rule__AddProperty__Alternatives_6_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2247:1: ( rule__AddProperty__Alternatives_6_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getAlternatives_6_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2248:1: ( rule__AddProperty__Alternatives_6_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2248:2: rule__AddProperty__Alternatives_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Alternatives_6_1_in_rule__AddProperty__Group_6__1__Impl4678);
            rule__AddProperty__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__1__Impl"


    // $ANTLR start "rule__AddProperty__Group_6__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2258:1: rule__AddProperty__Group_6__2 : rule__AddProperty__Group_6__2__Impl ;
    public final void rule__AddProperty__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2262:1: ( rule__AddProperty__Group_6__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2263:2: rule__AddProperty__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6__2__Impl_in_rule__AddProperty__Group_6__24708);
            rule__AddProperty__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__2"


    // $ANTLR start "rule__AddProperty__Group_6__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2269:1: rule__AddProperty__Group_6__2__Impl : ( ']' ) ;
    public final void rule__AddProperty__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2273:1: ( ( ']' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2274:1: ( ']' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2274:1: ( ']' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2275:1: ']'
            {
             before(grammarAccess.getAddPropertyAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AddProperty__Group_6__2__Impl4736); 
             after(grammarAccess.getAddPropertyAccess().getRightSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6__2__Impl"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2294:1: rule__AddProperty__Group_6_1_1__0 : rule__AddProperty__Group_6_1_1__0__Impl rule__AddProperty__Group_6_1_1__1 ;
    public final void rule__AddProperty__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2298:1: ( rule__AddProperty__Group_6_1_1__0__Impl rule__AddProperty__Group_6_1_1__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2299:2: rule__AddProperty__Group_6_1_1__0__Impl rule__AddProperty__Group_6_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__0__Impl_in_rule__AddProperty__Group_6_1_1__04773);
            rule__AddProperty__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__1_in_rule__AddProperty__Group_6_1_1__04776);
            rule__AddProperty__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__0"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2306:1: rule__AddProperty__Group_6_1_1__0__Impl : ( ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 ) ) ;
    public final void rule__AddProperty__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2310:1: ( ( ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2311:1: ( ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2311:1: ( ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2312:1: ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 )
            {
             before(grammarAccess.getAddPropertyAccess().getLowerBoundAssignment_6_1_1_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2313:1: ( rule__AddProperty__LowerBoundAssignment_6_1_1_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2313:2: rule__AddProperty__LowerBoundAssignment_6_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__LowerBoundAssignment_6_1_1_0_in_rule__AddProperty__Group_6_1_1__0__Impl4803);
            rule__AddProperty__LowerBoundAssignment_6_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getLowerBoundAssignment_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2323:1: rule__AddProperty__Group_6_1_1__1 : rule__AddProperty__Group_6_1_1__1__Impl rule__AddProperty__Group_6_1_1__2 ;
    public final void rule__AddProperty__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2327:1: ( rule__AddProperty__Group_6_1_1__1__Impl rule__AddProperty__Group_6_1_1__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2328:2: rule__AddProperty__Group_6_1_1__1__Impl rule__AddProperty__Group_6_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__1__Impl_in_rule__AddProperty__Group_6_1_1__14833);
            rule__AddProperty__Group_6_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__2_in_rule__AddProperty__Group_6_1_1__14836);
            rule__AddProperty__Group_6_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__1"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2335:1: rule__AddProperty__Group_6_1_1__1__Impl : ( '..' ) ;
    public final void rule__AddProperty__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2339:1: ( ( '..' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2340:1: ( '..' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2340:1: ( '..' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2341:1: '..'
            {
             before(grammarAccess.getAddPropertyAccess().getFullStopFullStopKeyword_6_1_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AddProperty__Group_6_1_1__1__Impl4864); 
             after(grammarAccess.getAddPropertyAccess().getFullStopFullStopKeyword_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2354:1: rule__AddProperty__Group_6_1_1__2 : rule__AddProperty__Group_6_1_1__2__Impl ;
    public final void rule__AddProperty__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2358:1: ( rule__AddProperty__Group_6_1_1__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2359:2: rule__AddProperty__Group_6_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_6_1_1__2__Impl_in_rule__AddProperty__Group_6_1_1__24895);
            rule__AddProperty__Group_6_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__2"


    // $ANTLR start "rule__AddProperty__Group_6_1_1__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2365:1: rule__AddProperty__Group_6_1_1__2__Impl : ( ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )? ) ;
    public final void rule__AddProperty__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2369:1: ( ( ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2370:1: ( ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2370:1: ( ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2371:1: ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )?
            {
             before(grammarAccess.getAddPropertyAccess().getUpperBoundAssignment_6_1_1_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2372:1: ( rule__AddProperty__UpperBoundAssignment_6_1_1_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2372:2: rule__AddProperty__UpperBoundAssignment_6_1_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UpperBoundAssignment_6_1_1_2_in_rule__AddProperty__Group_6_1_1__2__Impl4922);
                    rule__AddProperty__UpperBoundAssignment_6_1_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddPropertyAccess().getUpperBoundAssignment_6_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_6_1_1__2__Impl"


    // $ANTLR start "rule__AddProperty__Group_7__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2388:1: rule__AddProperty__Group_7__0 : rule__AddProperty__Group_7__0__Impl rule__AddProperty__Group_7__1 ;
    public final void rule__AddProperty__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2392:1: ( rule__AddProperty__Group_7__0__Impl rule__AddProperty__Group_7__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2393:2: rule__AddProperty__Group_7__0__Impl rule__AddProperty__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_7__0__Impl_in_rule__AddProperty__Group_7__04959);
            rule__AddProperty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_7__1_in_rule__AddProperty__Group_7__04962);
            rule__AddProperty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_7__0"


    // $ANTLR start "rule__AddProperty__Group_7__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2400:1: rule__AddProperty__Group_7__0__Impl : ( '=' ) ;
    public final void rule__AddProperty__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2404:1: ( ( '=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2405:1: ( '=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2405:1: ( '=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2406:1: '='
            {
             before(grammarAccess.getAddPropertyAccess().getEqualsSignKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AddProperty__Group_7__0__Impl4990); 
             after(grammarAccess.getAddPropertyAccess().getEqualsSignKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_7__0__Impl"


    // $ANTLR start "rule__AddProperty__Group_7__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2419:1: rule__AddProperty__Group_7__1 : rule__AddProperty__Group_7__1__Impl ;
    public final void rule__AddProperty__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2423:1: ( rule__AddProperty__Group_7__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2424:2: rule__AddProperty__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Group_7__1__Impl_in_rule__AddProperty__Group_7__15021);
            rule__AddProperty__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_7__1"


    // $ANTLR start "rule__AddProperty__Group_7__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2430:1: rule__AddProperty__Group_7__1__Impl : ( ( rule__AddProperty__DefaultValueAssignment_7_1 ) ) ;
    public final void rule__AddProperty__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2434:1: ( ( ( rule__AddProperty__DefaultValueAssignment_7_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2435:1: ( ( rule__AddProperty__DefaultValueAssignment_7_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2435:1: ( ( rule__AddProperty__DefaultValueAssignment_7_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2436:1: ( rule__AddProperty__DefaultValueAssignment_7_1 )
            {
             before(grammarAccess.getAddPropertyAccess().getDefaultValueAssignment_7_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2437:1: ( rule__AddProperty__DefaultValueAssignment_7_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2437:2: rule__AddProperty__DefaultValueAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__DefaultValueAssignment_7_1_in_rule__AddProperty__Group_7__1__Impl5048);
            rule__AddProperty__DefaultValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAddPropertyAccess().getDefaultValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__Group_7__1__Impl"


    // $ANTLR start "rule__RenameProperty__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2451:1: rule__RenameProperty__Group__0 : rule__RenameProperty__Group__0__Impl rule__RenameProperty__Group__1 ;
    public final void rule__RenameProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2455:1: ( rule__RenameProperty__Group__0__Impl rule__RenameProperty__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2456:2: rule__RenameProperty__Group__0__Impl rule__RenameProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__0__Impl_in_rule__RenameProperty__Group__05082);
            rule__RenameProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__1_in_rule__RenameProperty__Group__05085);
            rule__RenameProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__0"


    // $ANTLR start "rule__RenameProperty__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2463:1: rule__RenameProperty__Group__0__Impl : ( ( rule__RenameProperty__OwningClassNameAssignment_0 ) ) ;
    public final void rule__RenameProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2467:1: ( ( ( rule__RenameProperty__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2468:1: ( ( rule__RenameProperty__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2468:1: ( ( rule__RenameProperty__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2469:1: ( rule__RenameProperty__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getRenamePropertyAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2470:1: ( rule__RenameProperty__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2470:2: rule__RenameProperty__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__OwningClassNameAssignment_0_in_rule__RenameProperty__Group__0__Impl5112);
            rule__RenameProperty__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRenamePropertyAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__0__Impl"


    // $ANTLR start "rule__RenameProperty__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2480:1: rule__RenameProperty__Group__1 : rule__RenameProperty__Group__1__Impl rule__RenameProperty__Group__2 ;
    public final void rule__RenameProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2484:1: ( rule__RenameProperty__Group__1__Impl rule__RenameProperty__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2485:2: rule__RenameProperty__Group__1__Impl rule__RenameProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__1__Impl_in_rule__RenameProperty__Group__15142);
            rule__RenameProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__2_in_rule__RenameProperty__Group__15145);
            rule__RenameProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__1"


    // $ANTLR start "rule__RenameProperty__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2492:1: rule__RenameProperty__Group__1__Impl : ( '.' ) ;
    public final void rule__RenameProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2496:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2497:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2497:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2498:1: '.'
            {
             before(grammarAccess.getRenamePropertyAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__RenameProperty__Group__1__Impl5173); 
             after(grammarAccess.getRenamePropertyAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__1__Impl"


    // $ANTLR start "rule__RenameProperty__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2511:1: rule__RenameProperty__Group__2 : rule__RenameProperty__Group__2__Impl rule__RenameProperty__Group__3 ;
    public final void rule__RenameProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2515:1: ( rule__RenameProperty__Group__2__Impl rule__RenameProperty__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2516:2: rule__RenameProperty__Group__2__Impl rule__RenameProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__2__Impl_in_rule__RenameProperty__Group__25204);
            rule__RenameProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__3_in_rule__RenameProperty__Group__25207);
            rule__RenameProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__2"


    // $ANTLR start "rule__RenameProperty__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2523:1: rule__RenameProperty__Group__2__Impl : ( ( rule__RenameProperty__NameAssignment_2 ) ) ;
    public final void rule__RenameProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2527:1: ( ( ( rule__RenameProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2528:1: ( ( rule__RenameProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2528:1: ( ( rule__RenameProperty__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2529:1: ( rule__RenameProperty__NameAssignment_2 )
            {
             before(grammarAccess.getRenamePropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2530:1: ( rule__RenameProperty__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2530:2: rule__RenameProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__NameAssignment_2_in_rule__RenameProperty__Group__2__Impl5234);
            rule__RenameProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenamePropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__2__Impl"


    // $ANTLR start "rule__RenameProperty__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2540:1: rule__RenameProperty__Group__3 : rule__RenameProperty__Group__3__Impl rule__RenameProperty__Group__4 ;
    public final void rule__RenameProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2544:1: ( rule__RenameProperty__Group__3__Impl rule__RenameProperty__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2545:2: rule__RenameProperty__Group__3__Impl rule__RenameProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__3__Impl_in_rule__RenameProperty__Group__35264);
            rule__RenameProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__4_in_rule__RenameProperty__Group__35267);
            rule__RenameProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__3"


    // $ANTLR start "rule__RenameProperty__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2552:1: rule__RenameProperty__Group__3__Impl : ( '->' ) ;
    public final void rule__RenameProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2556:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2557:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2557:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2558:1: '->'
            {
             before(grammarAccess.getRenamePropertyAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RenameProperty__Group__3__Impl5295); 
             after(grammarAccess.getRenamePropertyAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__3__Impl"


    // $ANTLR start "rule__RenameProperty__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2571:1: rule__RenameProperty__Group__4 : rule__RenameProperty__Group__4__Impl ;
    public final void rule__RenameProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2575:1: ( rule__RenameProperty__Group__4__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2576:2: rule__RenameProperty__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__Group__4__Impl_in_rule__RenameProperty__Group__45326);
            rule__RenameProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__4"


    // $ANTLR start "rule__RenameProperty__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2582:1: rule__RenameProperty__Group__4__Impl : ( ( rule__RenameProperty__NewNameAssignment_4 ) ) ;
    public final void rule__RenameProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2586:1: ( ( ( rule__RenameProperty__NewNameAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2587:1: ( ( rule__RenameProperty__NewNameAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2587:1: ( ( rule__RenameProperty__NewNameAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2588:1: ( rule__RenameProperty__NewNameAssignment_4 )
            {
             before(grammarAccess.getRenamePropertyAccess().getNewNameAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2589:1: ( rule__RenameProperty__NewNameAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2589:2: rule__RenameProperty__NewNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RenameProperty__NewNameAssignment_4_in_rule__RenameProperty__Group__4__Impl5353);
            rule__RenameProperty__NewNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRenamePropertyAccess().getNewNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__Group__4__Impl"


    // $ANTLR start "rule__RemoveProperty__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2609:1: rule__RemoveProperty__Group__0 : rule__RemoveProperty__Group__0__Impl rule__RemoveProperty__Group__1 ;
    public final void rule__RemoveProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2613:1: ( rule__RemoveProperty__Group__0__Impl rule__RemoveProperty__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2614:2: rule__RemoveProperty__Group__0__Impl rule__RemoveProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__0__Impl_in_rule__RemoveProperty__Group__05393);
            rule__RemoveProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__1_in_rule__RemoveProperty__Group__05396);
            rule__RemoveProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__0"


    // $ANTLR start "rule__RemoveProperty__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2621:1: rule__RemoveProperty__Group__0__Impl : ( ( rule__RemoveProperty__OwningClassNameAssignment_0 ) ) ;
    public final void rule__RemoveProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2625:1: ( ( ( rule__RemoveProperty__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2626:1: ( ( rule__RemoveProperty__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2626:1: ( ( rule__RemoveProperty__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2627:1: ( rule__RemoveProperty__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getRemovePropertyAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2628:1: ( rule__RemoveProperty__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2628:2: rule__RemoveProperty__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__OwningClassNameAssignment_0_in_rule__RemoveProperty__Group__0__Impl5423);
            rule__RemoveProperty__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRemovePropertyAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__0__Impl"


    // $ANTLR start "rule__RemoveProperty__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2638:1: rule__RemoveProperty__Group__1 : rule__RemoveProperty__Group__1__Impl rule__RemoveProperty__Group__2 ;
    public final void rule__RemoveProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2642:1: ( rule__RemoveProperty__Group__1__Impl rule__RemoveProperty__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2643:2: rule__RemoveProperty__Group__1__Impl rule__RemoveProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__1__Impl_in_rule__RemoveProperty__Group__15453);
            rule__RemoveProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__2_in_rule__RemoveProperty__Group__15456);
            rule__RemoveProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__1"


    // $ANTLR start "rule__RemoveProperty__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2650:1: rule__RemoveProperty__Group__1__Impl : ( '-=' ) ;
    public final void rule__RemoveProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2654:1: ( ( '-=' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2655:1: ( '-=' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2655:1: ( '-=' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2656:1: '-='
            {
             before(grammarAccess.getRemovePropertyAccess().getHyphenMinusEqualsSignKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__RemoveProperty__Group__1__Impl5484); 
             after(grammarAccess.getRemovePropertyAccess().getHyphenMinusEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__1__Impl"


    // $ANTLR start "rule__RemoveProperty__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2669:1: rule__RemoveProperty__Group__2 : rule__RemoveProperty__Group__2__Impl ;
    public final void rule__RemoveProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2673:1: ( rule__RemoveProperty__Group__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2674:2: rule__RemoveProperty__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__Group__2__Impl_in_rule__RemoveProperty__Group__25515);
            rule__RemoveProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__2"


    // $ANTLR start "rule__RemoveProperty__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2680:1: rule__RemoveProperty__Group__2__Impl : ( ( rule__RemoveProperty__NameAssignment_2 ) ) ;
    public final void rule__RemoveProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2684:1: ( ( ( rule__RemoveProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2685:1: ( ( rule__RemoveProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2685:1: ( ( rule__RemoveProperty__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2686:1: ( rule__RemoveProperty__NameAssignment_2 )
            {
             before(grammarAccess.getRemovePropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2687:1: ( rule__RemoveProperty__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2687:2: rule__RemoveProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RemoveProperty__NameAssignment_2_in_rule__RemoveProperty__Group__2__Impl5542);
            rule__RemoveProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemovePropertyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__Group__2__Impl"


    // $ANTLR start "rule__SetType__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2703:1: rule__SetType__Group__0 : rule__SetType__Group__0__Impl rule__SetType__Group__1 ;
    public final void rule__SetType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2707:1: ( rule__SetType__Group__0__Impl rule__SetType__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2708:2: rule__SetType__Group__0__Impl rule__SetType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__0__Impl_in_rule__SetType__Group__05578);
            rule__SetType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__1_in_rule__SetType__Group__05581);
            rule__SetType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__0"


    // $ANTLR start "rule__SetType__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2715:1: rule__SetType__Group__0__Impl : ( ( rule__SetType__OwningClassNameAssignment_0 ) ) ;
    public final void rule__SetType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2719:1: ( ( ( rule__SetType__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2720:1: ( ( rule__SetType__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2720:1: ( ( rule__SetType__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2721:1: ( rule__SetType__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getSetTypeAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2722:1: ( rule__SetType__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2722:2: rule__SetType__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__OwningClassNameAssignment_0_in_rule__SetType__Group__0__Impl5608);
            rule__SetType__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetTypeAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__0__Impl"


    // $ANTLR start "rule__SetType__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2732:1: rule__SetType__Group__1 : rule__SetType__Group__1__Impl rule__SetType__Group__2 ;
    public final void rule__SetType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2736:1: ( rule__SetType__Group__1__Impl rule__SetType__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2737:2: rule__SetType__Group__1__Impl rule__SetType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__1__Impl_in_rule__SetType__Group__15638);
            rule__SetType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__2_in_rule__SetType__Group__15641);
            rule__SetType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__1"


    // $ANTLR start "rule__SetType__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2744:1: rule__SetType__Group__1__Impl : ( '.' ) ;
    public final void rule__SetType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2748:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2749:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2749:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2750:1: '.'
            {
             before(grammarAccess.getSetTypeAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetType__Group__1__Impl5669); 
             after(grammarAccess.getSetTypeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__1__Impl"


    // $ANTLR start "rule__SetType__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2763:1: rule__SetType__Group__2 : rule__SetType__Group__2__Impl rule__SetType__Group__3 ;
    public final void rule__SetType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2767:1: ( rule__SetType__Group__2__Impl rule__SetType__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2768:2: rule__SetType__Group__2__Impl rule__SetType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__2__Impl_in_rule__SetType__Group__25700);
            rule__SetType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__3_in_rule__SetType__Group__25703);
            rule__SetType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__2"


    // $ANTLR start "rule__SetType__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2775:1: rule__SetType__Group__2__Impl : ( ( rule__SetType__NameAssignment_2 ) ) ;
    public final void rule__SetType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2779:1: ( ( ( rule__SetType__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2780:1: ( ( rule__SetType__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2780:1: ( ( rule__SetType__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2781:1: ( rule__SetType__NameAssignment_2 )
            {
             before(grammarAccess.getSetTypeAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2782:1: ( rule__SetType__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2782:2: rule__SetType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__NameAssignment_2_in_rule__SetType__Group__2__Impl5730);
            rule__SetType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__2__Impl"


    // $ANTLR start "rule__SetType__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2792:1: rule__SetType__Group__3 : rule__SetType__Group__3__Impl rule__SetType__Group__4 ;
    public final void rule__SetType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2796:1: ( rule__SetType__Group__3__Impl rule__SetType__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2797:2: rule__SetType__Group__3__Impl rule__SetType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__3__Impl_in_rule__SetType__Group__35760);
            rule__SetType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__4_in_rule__SetType__Group__35763);
            rule__SetType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__3"


    // $ANTLR start "rule__SetType__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2804:1: rule__SetType__Group__3__Impl : ( ':' ) ;
    public final void rule__SetType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2808:1: ( ( ':' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2809:1: ( ':' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2809:1: ( ':' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2810:1: ':'
            {
             before(grammarAccess.getSetTypeAccess().getColonKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SetType__Group__3__Impl5791); 
             after(grammarAccess.getSetTypeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__3__Impl"


    // $ANTLR start "rule__SetType__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2823:1: rule__SetType__Group__4 : rule__SetType__Group__4__Impl ;
    public final void rule__SetType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2827:1: ( rule__SetType__Group__4__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2828:2: rule__SetType__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__Group__4__Impl_in_rule__SetType__Group__45822);
            rule__SetType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__4"


    // $ANTLR start "rule__SetType__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2834:1: rule__SetType__Group__4__Impl : ( ( rule__SetType__TypeAssignment_4 ) ) ;
    public final void rule__SetType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2838:1: ( ( ( rule__SetType__TypeAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2839:1: ( ( rule__SetType__TypeAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2839:1: ( ( rule__SetType__TypeAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2840:1: ( rule__SetType__TypeAssignment_4 )
            {
             before(grammarAccess.getSetTypeAccess().getTypeAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2841:1: ( rule__SetType__TypeAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2841:2: rule__SetType__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetType__TypeAssignment_4_in_rule__SetType__Group__4__Impl5849);
            rule__SetType__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetTypeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__Group__4__Impl"


    // $ANTLR start "rule__SetOpposite__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2861:1: rule__SetOpposite__Group__0 : rule__SetOpposite__Group__0__Impl rule__SetOpposite__Group__1 ;
    public final void rule__SetOpposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2865:1: ( rule__SetOpposite__Group__0__Impl rule__SetOpposite__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2866:2: rule__SetOpposite__Group__0__Impl rule__SetOpposite__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__0__Impl_in_rule__SetOpposite__Group__05889);
            rule__SetOpposite__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__1_in_rule__SetOpposite__Group__05892);
            rule__SetOpposite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__0"


    // $ANTLR start "rule__SetOpposite__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2873:1: rule__SetOpposite__Group__0__Impl : ( ( rule__SetOpposite__FirstClassNameAssignment_0 ) ) ;
    public final void rule__SetOpposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2877:1: ( ( ( rule__SetOpposite__FirstClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2878:1: ( ( rule__SetOpposite__FirstClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2878:1: ( ( rule__SetOpposite__FirstClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2879:1: ( rule__SetOpposite__FirstClassNameAssignment_0 )
            {
             before(grammarAccess.getSetOppositeAccess().getFirstClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2880:1: ( rule__SetOpposite__FirstClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2880:2: rule__SetOpposite__FirstClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__FirstClassNameAssignment_0_in_rule__SetOpposite__Group__0__Impl5919);
            rule__SetOpposite__FirstClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getFirstClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__0__Impl"


    // $ANTLR start "rule__SetOpposite__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2890:1: rule__SetOpposite__Group__1 : rule__SetOpposite__Group__1__Impl rule__SetOpposite__Group__2 ;
    public final void rule__SetOpposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2894:1: ( rule__SetOpposite__Group__1__Impl rule__SetOpposite__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2895:2: rule__SetOpposite__Group__1__Impl rule__SetOpposite__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__1__Impl_in_rule__SetOpposite__Group__15949);
            rule__SetOpposite__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__2_in_rule__SetOpposite__Group__15952);
            rule__SetOpposite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__1"


    // $ANTLR start "rule__SetOpposite__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2902:1: rule__SetOpposite__Group__1__Impl : ( '.' ) ;
    public final void rule__SetOpposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2906:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2907:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2907:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2908:1: '.'
            {
             before(grammarAccess.getSetOppositeAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetOpposite__Group__1__Impl5980); 
             after(grammarAccess.getSetOppositeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__1__Impl"


    // $ANTLR start "rule__SetOpposite__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2921:1: rule__SetOpposite__Group__2 : rule__SetOpposite__Group__2__Impl rule__SetOpposite__Group__3 ;
    public final void rule__SetOpposite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2925:1: ( rule__SetOpposite__Group__2__Impl rule__SetOpposite__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2926:2: rule__SetOpposite__Group__2__Impl rule__SetOpposite__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__2__Impl_in_rule__SetOpposite__Group__26011);
            rule__SetOpposite__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__3_in_rule__SetOpposite__Group__26014);
            rule__SetOpposite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__2"


    // $ANTLR start "rule__SetOpposite__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2933:1: rule__SetOpposite__Group__2__Impl : ( ( rule__SetOpposite__FirstPropertyNameAssignment_2 ) ) ;
    public final void rule__SetOpposite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2937:1: ( ( ( rule__SetOpposite__FirstPropertyNameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2938:1: ( ( rule__SetOpposite__FirstPropertyNameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2938:1: ( ( rule__SetOpposite__FirstPropertyNameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2939:1: ( rule__SetOpposite__FirstPropertyNameAssignment_2 )
            {
             before(grammarAccess.getSetOppositeAccess().getFirstPropertyNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2940:1: ( rule__SetOpposite__FirstPropertyNameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2940:2: rule__SetOpposite__FirstPropertyNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__FirstPropertyNameAssignment_2_in_rule__SetOpposite__Group__2__Impl6041);
            rule__SetOpposite__FirstPropertyNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getFirstPropertyNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__2__Impl"


    // $ANTLR start "rule__SetOpposite__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2950:1: rule__SetOpposite__Group__3 : rule__SetOpposite__Group__3__Impl rule__SetOpposite__Group__4 ;
    public final void rule__SetOpposite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2954:1: ( rule__SetOpposite__Group__3__Impl rule__SetOpposite__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2955:2: rule__SetOpposite__Group__3__Impl rule__SetOpposite__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__3__Impl_in_rule__SetOpposite__Group__36071);
            rule__SetOpposite__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__4_in_rule__SetOpposite__Group__36074);
            rule__SetOpposite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__3"


    // $ANTLR start "rule__SetOpposite__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2962:1: rule__SetOpposite__Group__3__Impl : ( ( rule__SetOpposite__Alternatives_3 ) ) ;
    public final void rule__SetOpposite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2966:1: ( ( ( rule__SetOpposite__Alternatives_3 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2967:1: ( ( rule__SetOpposite__Alternatives_3 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2967:1: ( ( rule__SetOpposite__Alternatives_3 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2968:1: ( rule__SetOpposite__Alternatives_3 )
            {
             before(grammarAccess.getSetOppositeAccess().getAlternatives_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2969:1: ( rule__SetOpposite__Alternatives_3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2969:2: rule__SetOpposite__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Alternatives_3_in_rule__SetOpposite__Group__3__Impl6101);
            rule__SetOpposite__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__3__Impl"


    // $ANTLR start "rule__SetOpposite__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2979:1: rule__SetOpposite__Group__4 : rule__SetOpposite__Group__4__Impl rule__SetOpposite__Group__5 ;
    public final void rule__SetOpposite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2983:1: ( rule__SetOpposite__Group__4__Impl rule__SetOpposite__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2984:2: rule__SetOpposite__Group__4__Impl rule__SetOpposite__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__4__Impl_in_rule__SetOpposite__Group__46131);
            rule__SetOpposite__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__5_in_rule__SetOpposite__Group__46134);
            rule__SetOpposite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__4"


    // $ANTLR start "rule__SetOpposite__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2991:1: rule__SetOpposite__Group__4__Impl : ( ( rule__SetOpposite__SecondClassNameAssignment_4 ) ) ;
    public final void rule__SetOpposite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2995:1: ( ( ( rule__SetOpposite__SecondClassNameAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2996:1: ( ( rule__SetOpposite__SecondClassNameAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2996:1: ( ( rule__SetOpposite__SecondClassNameAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2997:1: ( rule__SetOpposite__SecondClassNameAssignment_4 )
            {
             before(grammarAccess.getSetOppositeAccess().getSecondClassNameAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2998:1: ( rule__SetOpposite__SecondClassNameAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:2998:2: rule__SetOpposite__SecondClassNameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__SecondClassNameAssignment_4_in_rule__SetOpposite__Group__4__Impl6161);
            rule__SetOpposite__SecondClassNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getSecondClassNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__4__Impl"


    // $ANTLR start "rule__SetOpposite__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3008:1: rule__SetOpposite__Group__5 : rule__SetOpposite__Group__5__Impl rule__SetOpposite__Group__6 ;
    public final void rule__SetOpposite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3012:1: ( rule__SetOpposite__Group__5__Impl rule__SetOpposite__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3013:2: rule__SetOpposite__Group__5__Impl rule__SetOpposite__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__5__Impl_in_rule__SetOpposite__Group__56191);
            rule__SetOpposite__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__6_in_rule__SetOpposite__Group__56194);
            rule__SetOpposite__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__5"


    // $ANTLR start "rule__SetOpposite__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3020:1: rule__SetOpposite__Group__5__Impl : ( '.' ) ;
    public final void rule__SetOpposite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3024:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3025:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3025:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3026:1: '.'
            {
             before(grammarAccess.getSetOppositeAccess().getFullStopKeyword_5()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetOpposite__Group__5__Impl6222); 
             after(grammarAccess.getSetOppositeAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__5__Impl"


    // $ANTLR start "rule__SetOpposite__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3039:1: rule__SetOpposite__Group__6 : rule__SetOpposite__Group__6__Impl ;
    public final void rule__SetOpposite__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3043:1: ( rule__SetOpposite__Group__6__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3044:2: rule__SetOpposite__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__Group__6__Impl_in_rule__SetOpposite__Group__66253);
            rule__SetOpposite__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__6"


    // $ANTLR start "rule__SetOpposite__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3050:1: rule__SetOpposite__Group__6__Impl : ( ( rule__SetOpposite__SecondPropertyNameAssignment_6 ) ) ;
    public final void rule__SetOpposite__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3054:1: ( ( ( rule__SetOpposite__SecondPropertyNameAssignment_6 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3055:1: ( ( rule__SetOpposite__SecondPropertyNameAssignment_6 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3055:1: ( ( rule__SetOpposite__SecondPropertyNameAssignment_6 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3056:1: ( rule__SetOpposite__SecondPropertyNameAssignment_6 )
            {
             before(grammarAccess.getSetOppositeAccess().getSecondPropertyNameAssignment_6()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3057:1: ( rule__SetOpposite__SecondPropertyNameAssignment_6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3057:2: rule__SetOpposite__SecondPropertyNameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOpposite__SecondPropertyNameAssignment_6_in_rule__SetOpposite__Group__6__Impl6280);
            rule__SetOpposite__SecondPropertyNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSetOppositeAccess().getSecondPropertyNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__Group__6__Impl"


    // $ANTLR start "rule__SetBounds__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3081:1: rule__SetBounds__Group__0 : rule__SetBounds__Group__0__Impl rule__SetBounds__Group__1 ;
    public final void rule__SetBounds__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3085:1: ( rule__SetBounds__Group__0__Impl rule__SetBounds__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3086:2: rule__SetBounds__Group__0__Impl rule__SetBounds__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__0__Impl_in_rule__SetBounds__Group__06324);
            rule__SetBounds__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__1_in_rule__SetBounds__Group__06327);
            rule__SetBounds__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__0"


    // $ANTLR start "rule__SetBounds__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3093:1: rule__SetBounds__Group__0__Impl : ( ( rule__SetBounds__OwningClassNameAssignment_0 ) ) ;
    public final void rule__SetBounds__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3097:1: ( ( ( rule__SetBounds__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3098:1: ( ( rule__SetBounds__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3098:1: ( ( rule__SetBounds__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3099:1: ( rule__SetBounds__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getSetBoundsAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3100:1: ( rule__SetBounds__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3100:2: rule__SetBounds__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__OwningClassNameAssignment_0_in_rule__SetBounds__Group__0__Impl6354);
            rule__SetBounds__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetBoundsAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__0__Impl"


    // $ANTLR start "rule__SetBounds__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3110:1: rule__SetBounds__Group__1 : rule__SetBounds__Group__1__Impl rule__SetBounds__Group__2 ;
    public final void rule__SetBounds__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3114:1: ( rule__SetBounds__Group__1__Impl rule__SetBounds__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3115:2: rule__SetBounds__Group__1__Impl rule__SetBounds__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__1__Impl_in_rule__SetBounds__Group__16384);
            rule__SetBounds__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__2_in_rule__SetBounds__Group__16387);
            rule__SetBounds__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__1"


    // $ANTLR start "rule__SetBounds__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3122:1: rule__SetBounds__Group__1__Impl : ( '.' ) ;
    public final void rule__SetBounds__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3126:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3127:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3127:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3128:1: '.'
            {
             before(grammarAccess.getSetBoundsAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetBounds__Group__1__Impl6415); 
             after(grammarAccess.getSetBoundsAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__1__Impl"


    // $ANTLR start "rule__SetBounds__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3141:1: rule__SetBounds__Group__2 : rule__SetBounds__Group__2__Impl rule__SetBounds__Group__3 ;
    public final void rule__SetBounds__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3145:1: ( rule__SetBounds__Group__2__Impl rule__SetBounds__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3146:2: rule__SetBounds__Group__2__Impl rule__SetBounds__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__2__Impl_in_rule__SetBounds__Group__26446);
            rule__SetBounds__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__3_in_rule__SetBounds__Group__26449);
            rule__SetBounds__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__2"


    // $ANTLR start "rule__SetBounds__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3153:1: rule__SetBounds__Group__2__Impl : ( ( rule__SetBounds__NameAssignment_2 ) ) ;
    public final void rule__SetBounds__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3157:1: ( ( ( rule__SetBounds__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3158:1: ( ( rule__SetBounds__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3158:1: ( ( rule__SetBounds__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3159:1: ( rule__SetBounds__NameAssignment_2 )
            {
             before(grammarAccess.getSetBoundsAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3160:1: ( rule__SetBounds__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3160:2: rule__SetBounds__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__NameAssignment_2_in_rule__SetBounds__Group__2__Impl6476);
            rule__SetBounds__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetBoundsAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__2__Impl"


    // $ANTLR start "rule__SetBounds__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3170:1: rule__SetBounds__Group__3 : rule__SetBounds__Group__3__Impl ;
    public final void rule__SetBounds__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3174:1: ( rule__SetBounds__Group__3__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3175:2: rule__SetBounds__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group__3__Impl_in_rule__SetBounds__Group__36506);
            rule__SetBounds__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__3"


    // $ANTLR start "rule__SetBounds__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3181:1: rule__SetBounds__Group__3__Impl : ( ( rule__SetBounds__Group_3__0 )? ) ;
    public final void rule__SetBounds__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3185:1: ( ( ( rule__SetBounds__Group_3__0 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3186:1: ( ( rule__SetBounds__Group_3__0 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3186:1: ( ( rule__SetBounds__Group_3__0 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3187:1: ( rule__SetBounds__Group_3__0 )?
            {
             before(grammarAccess.getSetBoundsAccess().getGroup_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3188:1: ( rule__SetBounds__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3188:2: rule__SetBounds__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__0_in_rule__SetBounds__Group__3__Impl6533);
                    rule__SetBounds__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetBoundsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group__3__Impl"


    // $ANTLR start "rule__SetBounds__Group_3__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3206:1: rule__SetBounds__Group_3__0 : rule__SetBounds__Group_3__0__Impl rule__SetBounds__Group_3__1 ;
    public final void rule__SetBounds__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3210:1: ( rule__SetBounds__Group_3__0__Impl rule__SetBounds__Group_3__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3211:2: rule__SetBounds__Group_3__0__Impl rule__SetBounds__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__0__Impl_in_rule__SetBounds__Group_3__06572);
            rule__SetBounds__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__1_in_rule__SetBounds__Group_3__06575);
            rule__SetBounds__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__0"


    // $ANTLR start "rule__SetBounds__Group_3__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3218:1: rule__SetBounds__Group_3__0__Impl : ( '[' ) ;
    public final void rule__SetBounds__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3222:1: ( ( '[' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3223:1: ( '[' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3223:1: ( '[' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3224:1: '['
            {
             before(grammarAccess.getSetBoundsAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SetBounds__Group_3__0__Impl6603); 
             after(grammarAccess.getSetBoundsAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__0__Impl"


    // $ANTLR start "rule__SetBounds__Group_3__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3237:1: rule__SetBounds__Group_3__1 : rule__SetBounds__Group_3__1__Impl rule__SetBounds__Group_3__2 ;
    public final void rule__SetBounds__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3241:1: ( rule__SetBounds__Group_3__1__Impl rule__SetBounds__Group_3__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3242:2: rule__SetBounds__Group_3__1__Impl rule__SetBounds__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__1__Impl_in_rule__SetBounds__Group_3__16634);
            rule__SetBounds__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__2_in_rule__SetBounds__Group_3__16637);
            rule__SetBounds__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__1"


    // $ANTLR start "rule__SetBounds__Group_3__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3249:1: rule__SetBounds__Group_3__1__Impl : ( ( rule__SetBounds__Alternatives_3_1 ) ) ;
    public final void rule__SetBounds__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3253:1: ( ( ( rule__SetBounds__Alternatives_3_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3254:1: ( ( rule__SetBounds__Alternatives_3_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3254:1: ( ( rule__SetBounds__Alternatives_3_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3255:1: ( rule__SetBounds__Alternatives_3_1 )
            {
             before(grammarAccess.getSetBoundsAccess().getAlternatives_3_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3256:1: ( rule__SetBounds__Alternatives_3_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3256:2: rule__SetBounds__Alternatives_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Alternatives_3_1_in_rule__SetBounds__Group_3__1__Impl6664);
            rule__SetBounds__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetBoundsAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__1__Impl"


    // $ANTLR start "rule__SetBounds__Group_3__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3266:1: rule__SetBounds__Group_3__2 : rule__SetBounds__Group_3__2__Impl ;
    public final void rule__SetBounds__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3270:1: ( rule__SetBounds__Group_3__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3271:2: rule__SetBounds__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3__2__Impl_in_rule__SetBounds__Group_3__26694);
            rule__SetBounds__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__2"


    // $ANTLR start "rule__SetBounds__Group_3__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3277:1: rule__SetBounds__Group_3__2__Impl : ( ']' ) ;
    public final void rule__SetBounds__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3281:1: ( ( ']' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3282:1: ( ']' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3282:1: ( ']' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3283:1: ']'
            {
             before(grammarAccess.getSetBoundsAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SetBounds__Group_3__2__Impl6722); 
             after(grammarAccess.getSetBoundsAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3__2__Impl"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3302:1: rule__SetBounds__Group_3_1_1__0 : rule__SetBounds__Group_3_1_1__0__Impl rule__SetBounds__Group_3_1_1__1 ;
    public final void rule__SetBounds__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3306:1: ( rule__SetBounds__Group_3_1_1__0__Impl rule__SetBounds__Group_3_1_1__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3307:2: rule__SetBounds__Group_3_1_1__0__Impl rule__SetBounds__Group_3_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__0__Impl_in_rule__SetBounds__Group_3_1_1__06759);
            rule__SetBounds__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__1_in_rule__SetBounds__Group_3_1_1__06762);
            rule__SetBounds__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__0"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3314:1: rule__SetBounds__Group_3_1_1__0__Impl : ( ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 ) ) ;
    public final void rule__SetBounds__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3318:1: ( ( ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3319:1: ( ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3319:1: ( ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3320:1: ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSetBoundsAccess().getLowerBoundAssignment_3_1_1_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3321:1: ( rule__SetBounds__LowerBoundAssignment_3_1_1_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3321:2: rule__SetBounds__LowerBoundAssignment_3_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__LowerBoundAssignment_3_1_1_0_in_rule__SetBounds__Group_3_1_1__0__Impl6789);
            rule__SetBounds__LowerBoundAssignment_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSetBoundsAccess().getLowerBoundAssignment_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3331:1: rule__SetBounds__Group_3_1_1__1 : rule__SetBounds__Group_3_1_1__1__Impl rule__SetBounds__Group_3_1_1__2 ;
    public final void rule__SetBounds__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3335:1: ( rule__SetBounds__Group_3_1_1__1__Impl rule__SetBounds__Group_3_1_1__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3336:2: rule__SetBounds__Group_3_1_1__1__Impl rule__SetBounds__Group_3_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__1__Impl_in_rule__SetBounds__Group_3_1_1__16819);
            rule__SetBounds__Group_3_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__2_in_rule__SetBounds__Group_3_1_1__16822);
            rule__SetBounds__Group_3_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__1"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3343:1: rule__SetBounds__Group_3_1_1__1__Impl : ( '..' ) ;
    public final void rule__SetBounds__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3347:1: ( ( '..' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3348:1: ( '..' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3348:1: ( '..' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3349:1: '..'
            {
             before(grammarAccess.getSetBoundsAccess().getFullStopFullStopKeyword_3_1_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SetBounds__Group_3_1_1__1__Impl6850); 
             after(grammarAccess.getSetBoundsAccess().getFullStopFullStopKeyword_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3362:1: rule__SetBounds__Group_3_1_1__2 : rule__SetBounds__Group_3_1_1__2__Impl ;
    public final void rule__SetBounds__Group_3_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3366:1: ( rule__SetBounds__Group_3_1_1__2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3367:2: rule__SetBounds__Group_3_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetBounds__Group_3_1_1__2__Impl_in_rule__SetBounds__Group_3_1_1__26881);
            rule__SetBounds__Group_3_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__2"


    // $ANTLR start "rule__SetBounds__Group_3_1_1__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3373:1: rule__SetBounds__Group_3_1_1__2__Impl : ( ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )? ) ;
    public final void rule__SetBounds__Group_3_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3377:1: ( ( ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )? ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3378:1: ( ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )? )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3378:1: ( ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3379:1: ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )?
            {
             before(grammarAccess.getSetBoundsAccess().getUpperBoundAssignment_3_1_1_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3380:1: ( rule__SetBounds__UpperBoundAssignment_3_1_1_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3380:2: rule__SetBounds__UpperBoundAssignment_3_1_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SetBounds__UpperBoundAssignment_3_1_1_2_in_rule__SetBounds__Group_3_1_1__2__Impl6908);
                    rule__SetBounds__UpperBoundAssignment_3_1_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetBoundsAccess().getUpperBoundAssignment_3_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__Group_3_1_1__2__Impl"


    // $ANTLR start "rule__SetOrdered__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3396:1: rule__SetOrdered__Group__0 : rule__SetOrdered__Group__0__Impl rule__SetOrdered__Group__1 ;
    public final void rule__SetOrdered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3400:1: ( rule__SetOrdered__Group__0__Impl rule__SetOrdered__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3401:2: rule__SetOrdered__Group__0__Impl rule__SetOrdered__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__0__Impl_in_rule__SetOrdered__Group__06945);
            rule__SetOrdered__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__1_in_rule__SetOrdered__Group__06948);
            rule__SetOrdered__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__0"


    // $ANTLR start "rule__SetOrdered__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3408:1: rule__SetOrdered__Group__0__Impl : ( ( rule__SetOrdered__OwningClassNameAssignment_0 ) ) ;
    public final void rule__SetOrdered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3412:1: ( ( ( rule__SetOrdered__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3413:1: ( ( rule__SetOrdered__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3413:1: ( ( rule__SetOrdered__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3414:1: ( rule__SetOrdered__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getSetOrderedAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3415:1: ( rule__SetOrdered__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3415:2: rule__SetOrdered__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__OwningClassNameAssignment_0_in_rule__SetOrdered__Group__0__Impl6975);
            rule__SetOrdered__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetOrderedAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__0__Impl"


    // $ANTLR start "rule__SetOrdered__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3425:1: rule__SetOrdered__Group__1 : rule__SetOrdered__Group__1__Impl rule__SetOrdered__Group__2 ;
    public final void rule__SetOrdered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3429:1: ( rule__SetOrdered__Group__1__Impl rule__SetOrdered__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3430:2: rule__SetOrdered__Group__1__Impl rule__SetOrdered__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__1__Impl_in_rule__SetOrdered__Group__17005);
            rule__SetOrdered__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__2_in_rule__SetOrdered__Group__17008);
            rule__SetOrdered__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__1"


    // $ANTLR start "rule__SetOrdered__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3437:1: rule__SetOrdered__Group__1__Impl : ( '.' ) ;
    public final void rule__SetOrdered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3441:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3442:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3442:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3443:1: '.'
            {
             before(grammarAccess.getSetOrderedAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetOrdered__Group__1__Impl7036); 
             after(grammarAccess.getSetOrderedAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__1__Impl"


    // $ANTLR start "rule__SetOrdered__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3456:1: rule__SetOrdered__Group__2 : rule__SetOrdered__Group__2__Impl rule__SetOrdered__Group__3 ;
    public final void rule__SetOrdered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3460:1: ( rule__SetOrdered__Group__2__Impl rule__SetOrdered__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3461:2: rule__SetOrdered__Group__2__Impl rule__SetOrdered__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__2__Impl_in_rule__SetOrdered__Group__27067);
            rule__SetOrdered__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__3_in_rule__SetOrdered__Group__27070);
            rule__SetOrdered__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__2"


    // $ANTLR start "rule__SetOrdered__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3468:1: rule__SetOrdered__Group__2__Impl : ( ( rule__SetOrdered__NameAssignment_2 ) ) ;
    public final void rule__SetOrdered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3472:1: ( ( ( rule__SetOrdered__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3473:1: ( ( rule__SetOrdered__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3473:1: ( ( rule__SetOrdered__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3474:1: ( rule__SetOrdered__NameAssignment_2 )
            {
             before(grammarAccess.getSetOrderedAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3475:1: ( rule__SetOrdered__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3475:2: rule__SetOrdered__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__NameAssignment_2_in_rule__SetOrdered__Group__2__Impl7097);
            rule__SetOrdered__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetOrderedAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__2__Impl"


    // $ANTLR start "rule__SetOrdered__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3485:1: rule__SetOrdered__Group__3 : rule__SetOrdered__Group__3__Impl ;
    public final void rule__SetOrdered__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3489:1: ( rule__SetOrdered__Group__3__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3490:2: rule__SetOrdered__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Group__3__Impl_in_rule__SetOrdered__Group__37127);
            rule__SetOrdered__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__3"


    // $ANTLR start "rule__SetOrdered__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3496:1: rule__SetOrdered__Group__3__Impl : ( ( rule__SetOrdered__Alternatives_3 ) ) ;
    public final void rule__SetOrdered__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3500:1: ( ( ( rule__SetOrdered__Alternatives_3 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3501:1: ( ( rule__SetOrdered__Alternatives_3 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3501:1: ( ( rule__SetOrdered__Alternatives_3 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3502:1: ( rule__SetOrdered__Alternatives_3 )
            {
             before(grammarAccess.getSetOrderedAccess().getAlternatives_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3503:1: ( rule__SetOrdered__Alternatives_3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3503:2: rule__SetOrdered__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetOrdered__Alternatives_3_in_rule__SetOrdered__Group__3__Impl7154);
            rule__SetOrdered__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSetOrderedAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__Group__3__Impl"


    // $ANTLR start "rule__SetUnique__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3521:1: rule__SetUnique__Group__0 : rule__SetUnique__Group__0__Impl rule__SetUnique__Group__1 ;
    public final void rule__SetUnique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3525:1: ( rule__SetUnique__Group__0__Impl rule__SetUnique__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3526:2: rule__SetUnique__Group__0__Impl rule__SetUnique__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__0__Impl_in_rule__SetUnique__Group__07192);
            rule__SetUnique__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__1_in_rule__SetUnique__Group__07195);
            rule__SetUnique__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__0"


    // $ANTLR start "rule__SetUnique__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3533:1: rule__SetUnique__Group__0__Impl : ( ( rule__SetUnique__OwningClassNameAssignment_0 ) ) ;
    public final void rule__SetUnique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3537:1: ( ( ( rule__SetUnique__OwningClassNameAssignment_0 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3538:1: ( ( rule__SetUnique__OwningClassNameAssignment_0 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3538:1: ( ( rule__SetUnique__OwningClassNameAssignment_0 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3539:1: ( rule__SetUnique__OwningClassNameAssignment_0 )
            {
             before(grammarAccess.getSetUniqueAccess().getOwningClassNameAssignment_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3540:1: ( rule__SetUnique__OwningClassNameAssignment_0 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3540:2: rule__SetUnique__OwningClassNameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__OwningClassNameAssignment_0_in_rule__SetUnique__Group__0__Impl7222);
            rule__SetUnique__OwningClassNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetUniqueAccess().getOwningClassNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__0__Impl"


    // $ANTLR start "rule__SetUnique__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3550:1: rule__SetUnique__Group__1 : rule__SetUnique__Group__1__Impl rule__SetUnique__Group__2 ;
    public final void rule__SetUnique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3554:1: ( rule__SetUnique__Group__1__Impl rule__SetUnique__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3555:2: rule__SetUnique__Group__1__Impl rule__SetUnique__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__1__Impl_in_rule__SetUnique__Group__17252);
            rule__SetUnique__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__2_in_rule__SetUnique__Group__17255);
            rule__SetUnique__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__1"


    // $ANTLR start "rule__SetUnique__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3562:1: rule__SetUnique__Group__1__Impl : ( '.' ) ;
    public final void rule__SetUnique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3566:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3567:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3567:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3568:1: '.'
            {
             before(grammarAccess.getSetUniqueAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SetUnique__Group__1__Impl7283); 
             after(grammarAccess.getSetUniqueAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__1__Impl"


    // $ANTLR start "rule__SetUnique__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3581:1: rule__SetUnique__Group__2 : rule__SetUnique__Group__2__Impl rule__SetUnique__Group__3 ;
    public final void rule__SetUnique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3585:1: ( rule__SetUnique__Group__2__Impl rule__SetUnique__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3586:2: rule__SetUnique__Group__2__Impl rule__SetUnique__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__2__Impl_in_rule__SetUnique__Group__27314);
            rule__SetUnique__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__3_in_rule__SetUnique__Group__27317);
            rule__SetUnique__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__2"


    // $ANTLR start "rule__SetUnique__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3593:1: rule__SetUnique__Group__2__Impl : ( ( rule__SetUnique__NameAssignment_2 ) ) ;
    public final void rule__SetUnique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3597:1: ( ( ( rule__SetUnique__NameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3598:1: ( ( rule__SetUnique__NameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3598:1: ( ( rule__SetUnique__NameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3599:1: ( rule__SetUnique__NameAssignment_2 )
            {
             before(grammarAccess.getSetUniqueAccess().getNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3600:1: ( rule__SetUnique__NameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3600:2: rule__SetUnique__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__NameAssignment_2_in_rule__SetUnique__Group__2__Impl7344);
            rule__SetUnique__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetUniqueAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__2__Impl"


    // $ANTLR start "rule__SetUnique__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3610:1: rule__SetUnique__Group__3 : rule__SetUnique__Group__3__Impl ;
    public final void rule__SetUnique__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3614:1: ( rule__SetUnique__Group__3__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3615:2: rule__SetUnique__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Group__3__Impl_in_rule__SetUnique__Group__37374);
            rule__SetUnique__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__3"


    // $ANTLR start "rule__SetUnique__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3621:1: rule__SetUnique__Group__3__Impl : ( ( rule__SetUnique__Alternatives_3 ) ) ;
    public final void rule__SetUnique__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3625:1: ( ( ( rule__SetUnique__Alternatives_3 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3626:1: ( ( rule__SetUnique__Alternatives_3 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3626:1: ( ( rule__SetUnique__Alternatives_3 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3627:1: ( rule__SetUnique__Alternatives_3 )
            {
             before(grammarAccess.getSetUniqueAccess().getAlternatives_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3628:1: ( rule__SetUnique__Alternatives_3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3628:2: rule__SetUnique__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SetUnique__Alternatives_3_in_rule__SetUnique__Group__3__Impl7401);
            rule__SetUnique__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSetUniqueAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__Group__3__Impl"


    // $ANTLR start "rule__CopyProperty__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3646:1: rule__CopyProperty__Group__0 : rule__CopyProperty__Group__0__Impl rule__CopyProperty__Group__1 ;
    public final void rule__CopyProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3650:1: ( rule__CopyProperty__Group__0__Impl rule__CopyProperty__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3651:2: rule__CopyProperty__Group__0__Impl rule__CopyProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__0__Impl_in_rule__CopyProperty__Group__07439);
            rule__CopyProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__1_in_rule__CopyProperty__Group__07442);
            rule__CopyProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__0"


    // $ANTLR start "rule__CopyProperty__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3658:1: rule__CopyProperty__Group__0__Impl : ( 'copy' ) ;
    public final void rule__CopyProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3662:1: ( ( 'copy' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3663:1: ( 'copy' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3663:1: ( 'copy' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3664:1: 'copy'
            {
             before(grammarAccess.getCopyPropertyAccess().getCopyKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__CopyProperty__Group__0__Impl7470); 
             after(grammarAccess.getCopyPropertyAccess().getCopyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__0__Impl"


    // $ANTLR start "rule__CopyProperty__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3677:1: rule__CopyProperty__Group__1 : rule__CopyProperty__Group__1__Impl rule__CopyProperty__Group__2 ;
    public final void rule__CopyProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3681:1: ( rule__CopyProperty__Group__1__Impl rule__CopyProperty__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3682:2: rule__CopyProperty__Group__1__Impl rule__CopyProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__1__Impl_in_rule__CopyProperty__Group__17501);
            rule__CopyProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__2_in_rule__CopyProperty__Group__17504);
            rule__CopyProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__1"


    // $ANTLR start "rule__CopyProperty__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3689:1: rule__CopyProperty__Group__1__Impl : ( ( rule__CopyProperty__TypeAssignment_1 ) ) ;
    public final void rule__CopyProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3693:1: ( ( ( rule__CopyProperty__TypeAssignment_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3694:1: ( ( rule__CopyProperty__TypeAssignment_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3694:1: ( ( rule__CopyProperty__TypeAssignment_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3695:1: ( rule__CopyProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getCopyPropertyAccess().getTypeAssignment_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3696:1: ( rule__CopyProperty__TypeAssignment_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3696:2: rule__CopyProperty__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__TypeAssignment_1_in_rule__CopyProperty__Group__1__Impl7531);
            rule__CopyProperty__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__1__Impl"


    // $ANTLR start "rule__CopyProperty__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3706:1: rule__CopyProperty__Group__2 : rule__CopyProperty__Group__2__Impl rule__CopyProperty__Group__3 ;
    public final void rule__CopyProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3710:1: ( rule__CopyProperty__Group__2__Impl rule__CopyProperty__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3711:2: rule__CopyProperty__Group__2__Impl rule__CopyProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__2__Impl_in_rule__CopyProperty__Group__27561);
            rule__CopyProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__3_in_rule__CopyProperty__Group__27564);
            rule__CopyProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__2"


    // $ANTLR start "rule__CopyProperty__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3718:1: rule__CopyProperty__Group__2__Impl : ( ( rule__CopyProperty__OwningClassNameAssignment_2 ) ) ;
    public final void rule__CopyProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3722:1: ( ( ( rule__CopyProperty__OwningClassNameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3723:1: ( ( rule__CopyProperty__OwningClassNameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3723:1: ( ( rule__CopyProperty__OwningClassNameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3724:1: ( rule__CopyProperty__OwningClassNameAssignment_2 )
            {
             before(grammarAccess.getCopyPropertyAccess().getOwningClassNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3725:1: ( rule__CopyProperty__OwningClassNameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3725:2: rule__CopyProperty__OwningClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__OwningClassNameAssignment_2_in_rule__CopyProperty__Group__2__Impl7591);
            rule__CopyProperty__OwningClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCopyPropertyAccess().getOwningClassNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__2__Impl"


    // $ANTLR start "rule__CopyProperty__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3735:1: rule__CopyProperty__Group__3 : rule__CopyProperty__Group__3__Impl rule__CopyProperty__Group__4 ;
    public final void rule__CopyProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3739:1: ( rule__CopyProperty__Group__3__Impl rule__CopyProperty__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3740:2: rule__CopyProperty__Group__3__Impl rule__CopyProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__3__Impl_in_rule__CopyProperty__Group__37621);
            rule__CopyProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__4_in_rule__CopyProperty__Group__37624);
            rule__CopyProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__3"


    // $ANTLR start "rule__CopyProperty__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3747:1: rule__CopyProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__CopyProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3751:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3752:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3752:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3753:1: '.'
            {
             before(grammarAccess.getCopyPropertyAccess().getFullStopKeyword_3()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__CopyProperty__Group__3__Impl7652); 
             after(grammarAccess.getCopyPropertyAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__3__Impl"


    // $ANTLR start "rule__CopyProperty__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3766:1: rule__CopyProperty__Group__4 : rule__CopyProperty__Group__4__Impl rule__CopyProperty__Group__5 ;
    public final void rule__CopyProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3770:1: ( rule__CopyProperty__Group__4__Impl rule__CopyProperty__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3771:2: rule__CopyProperty__Group__4__Impl rule__CopyProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__4__Impl_in_rule__CopyProperty__Group__47683);
            rule__CopyProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__5_in_rule__CopyProperty__Group__47686);
            rule__CopyProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__4"


    // $ANTLR start "rule__CopyProperty__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3778:1: rule__CopyProperty__Group__4__Impl : ( ( rule__CopyProperty__NameAssignment_4 ) ) ;
    public final void rule__CopyProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3782:1: ( ( ( rule__CopyProperty__NameAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3783:1: ( ( rule__CopyProperty__NameAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3783:1: ( ( rule__CopyProperty__NameAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3784:1: ( rule__CopyProperty__NameAssignment_4 )
            {
             before(grammarAccess.getCopyPropertyAccess().getNameAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3785:1: ( rule__CopyProperty__NameAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3785:2: rule__CopyProperty__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__NameAssignment_4_in_rule__CopyProperty__Group__4__Impl7713);
            rule__CopyProperty__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCopyPropertyAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__4__Impl"


    // $ANTLR start "rule__CopyProperty__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3795:1: rule__CopyProperty__Group__5 : rule__CopyProperty__Group__5__Impl rule__CopyProperty__Group__6 ;
    public final void rule__CopyProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3799:1: ( rule__CopyProperty__Group__5__Impl rule__CopyProperty__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3800:2: rule__CopyProperty__Group__5__Impl rule__CopyProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__5__Impl_in_rule__CopyProperty__Group__57743);
            rule__CopyProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__6_in_rule__CopyProperty__Group__57746);
            rule__CopyProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__5"


    // $ANTLR start "rule__CopyProperty__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3807:1: rule__CopyProperty__Group__5__Impl : ( '->' ) ;
    public final void rule__CopyProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3811:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3812:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3812:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3813:1: '->'
            {
             before(grammarAccess.getCopyPropertyAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CopyProperty__Group__5__Impl7774); 
             after(grammarAccess.getCopyPropertyAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__5__Impl"


    // $ANTLR start "rule__CopyProperty__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3826:1: rule__CopyProperty__Group__6 : rule__CopyProperty__Group__6__Impl ;
    public final void rule__CopyProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3830:1: ( rule__CopyProperty__Group__6__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3831:2: rule__CopyProperty__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__Group__6__Impl_in_rule__CopyProperty__Group__67805);
            rule__CopyProperty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__6"


    // $ANTLR start "rule__CopyProperty__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3837:1: rule__CopyProperty__Group__6__Impl : ( ( rule__CopyProperty__TargetClassNameAssignment_6 ) ) ;
    public final void rule__CopyProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3841:1: ( ( ( rule__CopyProperty__TargetClassNameAssignment_6 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3842:1: ( ( rule__CopyProperty__TargetClassNameAssignment_6 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3842:1: ( ( rule__CopyProperty__TargetClassNameAssignment_6 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3843:1: ( rule__CopyProperty__TargetClassNameAssignment_6 )
            {
             before(grammarAccess.getCopyPropertyAccess().getTargetClassNameAssignment_6()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3844:1: ( rule__CopyProperty__TargetClassNameAssignment_6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3844:2: rule__CopyProperty__TargetClassNameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CopyProperty__TargetClassNameAssignment_6_in_rule__CopyProperty__Group__6__Impl7832);
            rule__CopyProperty__TargetClassNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCopyPropertyAccess().getTargetClassNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__Group__6__Impl"


    // $ANTLR start "rule__MoveProperty__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3868:1: rule__MoveProperty__Group__0 : rule__MoveProperty__Group__0__Impl rule__MoveProperty__Group__1 ;
    public final void rule__MoveProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3872:1: ( rule__MoveProperty__Group__0__Impl rule__MoveProperty__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3873:2: rule__MoveProperty__Group__0__Impl rule__MoveProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__0__Impl_in_rule__MoveProperty__Group__07876);
            rule__MoveProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__1_in_rule__MoveProperty__Group__07879);
            rule__MoveProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__0"


    // $ANTLR start "rule__MoveProperty__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3880:1: rule__MoveProperty__Group__0__Impl : ( 'move' ) ;
    public final void rule__MoveProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3884:1: ( ( 'move' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3885:1: ( 'move' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3885:1: ( 'move' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3886:1: 'move'
            {
             before(grammarAccess.getMovePropertyAccess().getMoveKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MoveProperty__Group__0__Impl7907); 
             after(grammarAccess.getMovePropertyAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__0__Impl"


    // $ANTLR start "rule__MoveProperty__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3899:1: rule__MoveProperty__Group__1 : rule__MoveProperty__Group__1__Impl rule__MoveProperty__Group__2 ;
    public final void rule__MoveProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3903:1: ( rule__MoveProperty__Group__1__Impl rule__MoveProperty__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3904:2: rule__MoveProperty__Group__1__Impl rule__MoveProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__1__Impl_in_rule__MoveProperty__Group__17938);
            rule__MoveProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__2_in_rule__MoveProperty__Group__17941);
            rule__MoveProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__1"


    // $ANTLR start "rule__MoveProperty__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3911:1: rule__MoveProperty__Group__1__Impl : ( ( rule__MoveProperty__TypeAssignment_1 ) ) ;
    public final void rule__MoveProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3915:1: ( ( ( rule__MoveProperty__TypeAssignment_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3916:1: ( ( rule__MoveProperty__TypeAssignment_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3916:1: ( ( rule__MoveProperty__TypeAssignment_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3917:1: ( rule__MoveProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getMovePropertyAccess().getTypeAssignment_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3918:1: ( rule__MoveProperty__TypeAssignment_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3918:2: rule__MoveProperty__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__TypeAssignment_1_in_rule__MoveProperty__Group__1__Impl7968);
            rule__MoveProperty__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovePropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__1__Impl"


    // $ANTLR start "rule__MoveProperty__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3928:1: rule__MoveProperty__Group__2 : rule__MoveProperty__Group__2__Impl rule__MoveProperty__Group__3 ;
    public final void rule__MoveProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3932:1: ( rule__MoveProperty__Group__2__Impl rule__MoveProperty__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3933:2: rule__MoveProperty__Group__2__Impl rule__MoveProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__2__Impl_in_rule__MoveProperty__Group__27998);
            rule__MoveProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__3_in_rule__MoveProperty__Group__28001);
            rule__MoveProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__2"


    // $ANTLR start "rule__MoveProperty__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3940:1: rule__MoveProperty__Group__2__Impl : ( ( rule__MoveProperty__OwningClassNameAssignment_2 ) ) ;
    public final void rule__MoveProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3944:1: ( ( ( rule__MoveProperty__OwningClassNameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3945:1: ( ( rule__MoveProperty__OwningClassNameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3945:1: ( ( rule__MoveProperty__OwningClassNameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3946:1: ( rule__MoveProperty__OwningClassNameAssignment_2 )
            {
             before(grammarAccess.getMovePropertyAccess().getOwningClassNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3947:1: ( rule__MoveProperty__OwningClassNameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3947:2: rule__MoveProperty__OwningClassNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__OwningClassNameAssignment_2_in_rule__MoveProperty__Group__2__Impl8028);
            rule__MoveProperty__OwningClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMovePropertyAccess().getOwningClassNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__2__Impl"


    // $ANTLR start "rule__MoveProperty__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3957:1: rule__MoveProperty__Group__3 : rule__MoveProperty__Group__3__Impl rule__MoveProperty__Group__4 ;
    public final void rule__MoveProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3961:1: ( rule__MoveProperty__Group__3__Impl rule__MoveProperty__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3962:2: rule__MoveProperty__Group__3__Impl rule__MoveProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__3__Impl_in_rule__MoveProperty__Group__38058);
            rule__MoveProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__4_in_rule__MoveProperty__Group__38061);
            rule__MoveProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__3"


    // $ANTLR start "rule__MoveProperty__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3969:1: rule__MoveProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__MoveProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3973:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3974:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3974:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3975:1: '.'
            {
             before(grammarAccess.getMovePropertyAccess().getFullStopKeyword_3()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MoveProperty__Group__3__Impl8089); 
             after(grammarAccess.getMovePropertyAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__3__Impl"


    // $ANTLR start "rule__MoveProperty__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3988:1: rule__MoveProperty__Group__4 : rule__MoveProperty__Group__4__Impl rule__MoveProperty__Group__5 ;
    public final void rule__MoveProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3992:1: ( rule__MoveProperty__Group__4__Impl rule__MoveProperty__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:3993:2: rule__MoveProperty__Group__4__Impl rule__MoveProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__4__Impl_in_rule__MoveProperty__Group__48120);
            rule__MoveProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__5_in_rule__MoveProperty__Group__48123);
            rule__MoveProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__4"


    // $ANTLR start "rule__MoveProperty__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4000:1: rule__MoveProperty__Group__4__Impl : ( ( rule__MoveProperty__NameAssignment_4 ) ) ;
    public final void rule__MoveProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4004:1: ( ( ( rule__MoveProperty__NameAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4005:1: ( ( rule__MoveProperty__NameAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4005:1: ( ( rule__MoveProperty__NameAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4006:1: ( rule__MoveProperty__NameAssignment_4 )
            {
             before(grammarAccess.getMovePropertyAccess().getNameAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4007:1: ( rule__MoveProperty__NameAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4007:2: rule__MoveProperty__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__NameAssignment_4_in_rule__MoveProperty__Group__4__Impl8150);
            rule__MoveProperty__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMovePropertyAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__4__Impl"


    // $ANTLR start "rule__MoveProperty__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4017:1: rule__MoveProperty__Group__5 : rule__MoveProperty__Group__5__Impl rule__MoveProperty__Group__6 ;
    public final void rule__MoveProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4021:1: ( rule__MoveProperty__Group__5__Impl rule__MoveProperty__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4022:2: rule__MoveProperty__Group__5__Impl rule__MoveProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__5__Impl_in_rule__MoveProperty__Group__58180);
            rule__MoveProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__6_in_rule__MoveProperty__Group__58183);
            rule__MoveProperty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__5"


    // $ANTLR start "rule__MoveProperty__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4029:1: rule__MoveProperty__Group__5__Impl : ( '->' ) ;
    public final void rule__MoveProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4033:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4034:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4034:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4035:1: '->'
            {
             before(grammarAccess.getMovePropertyAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MoveProperty__Group__5__Impl8211); 
             after(grammarAccess.getMovePropertyAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__5__Impl"


    // $ANTLR start "rule__MoveProperty__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4048:1: rule__MoveProperty__Group__6 : rule__MoveProperty__Group__6__Impl ;
    public final void rule__MoveProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4052:1: ( rule__MoveProperty__Group__6__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4053:2: rule__MoveProperty__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__Group__6__Impl_in_rule__MoveProperty__Group__68242);
            rule__MoveProperty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__6"


    // $ANTLR start "rule__MoveProperty__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4059:1: rule__MoveProperty__Group__6__Impl : ( ( rule__MoveProperty__TargetClassNameAssignment_6 ) ) ;
    public final void rule__MoveProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4063:1: ( ( ( rule__MoveProperty__TargetClassNameAssignment_6 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4064:1: ( ( rule__MoveProperty__TargetClassNameAssignment_6 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4064:1: ( ( rule__MoveProperty__TargetClassNameAssignment_6 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4065:1: ( rule__MoveProperty__TargetClassNameAssignment_6 )
            {
             before(grammarAccess.getMovePropertyAccess().getTargetClassNameAssignment_6()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4066:1: ( rule__MoveProperty__TargetClassNameAssignment_6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4066:2: rule__MoveProperty__TargetClassNameAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MoveProperty__TargetClassNameAssignment_6_in_rule__MoveProperty__Group__6__Impl8269);
            rule__MoveProperty__TargetClassNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMovePropertyAccess().getTargetClassNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__Group__6__Impl"


    // $ANTLR start "rule__ExtractClass__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4090:1: rule__ExtractClass__Group__0 : rule__ExtractClass__Group__0__Impl rule__ExtractClass__Group__1 ;
    public final void rule__ExtractClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4094:1: ( rule__ExtractClass__Group__0__Impl rule__ExtractClass__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4095:2: rule__ExtractClass__Group__0__Impl rule__ExtractClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__0__Impl_in_rule__ExtractClass__Group__08313);
            rule__ExtractClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__1_in_rule__ExtractClass__Group__08316);
            rule__ExtractClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__0"


    // $ANTLR start "rule__ExtractClass__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4102:1: rule__ExtractClass__Group__0__Impl : ( 'extract' ) ;
    public final void rule__ExtractClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4106:1: ( ( 'extract' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4107:1: ( 'extract' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4107:1: ( 'extract' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4108:1: 'extract'
            {
             before(grammarAccess.getExtractClassAccess().getExtractKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ExtractClass__Group__0__Impl8344); 
             after(grammarAccess.getExtractClassAccess().getExtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__0__Impl"


    // $ANTLR start "rule__ExtractClass__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4121:1: rule__ExtractClass__Group__1 : rule__ExtractClass__Group__1__Impl rule__ExtractClass__Group__2 ;
    public final void rule__ExtractClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4125:1: ( rule__ExtractClass__Group__1__Impl rule__ExtractClass__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4126:2: rule__ExtractClass__Group__1__Impl rule__ExtractClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__1__Impl_in_rule__ExtractClass__Group__18375);
            rule__ExtractClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__2_in_rule__ExtractClass__Group__18378);
            rule__ExtractClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__1"


    // $ANTLR start "rule__ExtractClass__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4133:1: rule__ExtractClass__Group__1__Impl : ( ( rule__ExtractClass__SourceClassNameAssignment_1 ) ) ;
    public final void rule__ExtractClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4137:1: ( ( ( rule__ExtractClass__SourceClassNameAssignment_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4138:1: ( ( rule__ExtractClass__SourceClassNameAssignment_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4138:1: ( ( rule__ExtractClass__SourceClassNameAssignment_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4139:1: ( rule__ExtractClass__SourceClassNameAssignment_1 )
            {
             before(grammarAccess.getExtractClassAccess().getSourceClassNameAssignment_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4140:1: ( rule__ExtractClass__SourceClassNameAssignment_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4140:2: rule__ExtractClass__SourceClassNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__SourceClassNameAssignment_1_in_rule__ExtractClass__Group__1__Impl8405);
            rule__ExtractClass__SourceClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractClassAccess().getSourceClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__1__Impl"


    // $ANTLR start "rule__ExtractClass__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4150:1: rule__ExtractClass__Group__2 : rule__ExtractClass__Group__2__Impl rule__ExtractClass__Group__3 ;
    public final void rule__ExtractClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4154:1: ( rule__ExtractClass__Group__2__Impl rule__ExtractClass__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4155:2: rule__ExtractClass__Group__2__Impl rule__ExtractClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__2__Impl_in_rule__ExtractClass__Group__28435);
            rule__ExtractClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__3_in_rule__ExtractClass__Group__28438);
            rule__ExtractClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__2"


    // $ANTLR start "rule__ExtractClass__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4162:1: rule__ExtractClass__Group__2__Impl : ( '.' ) ;
    public final void rule__ExtractClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4166:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4167:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4167:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4168:1: '.'
            {
             before(grammarAccess.getExtractClassAccess().getFullStopKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ExtractClass__Group__2__Impl8466); 
             after(grammarAccess.getExtractClassAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__2__Impl"


    // $ANTLR start "rule__ExtractClass__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4181:1: rule__ExtractClass__Group__3 : rule__ExtractClass__Group__3__Impl rule__ExtractClass__Group__4 ;
    public final void rule__ExtractClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4185:1: ( rule__ExtractClass__Group__3__Impl rule__ExtractClass__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4186:2: rule__ExtractClass__Group__3__Impl rule__ExtractClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__3__Impl_in_rule__ExtractClass__Group__38497);
            rule__ExtractClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__4_in_rule__ExtractClass__Group__38500);
            rule__ExtractClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__3"


    // $ANTLR start "rule__ExtractClass__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4193:1: rule__ExtractClass__Group__3__Impl : ( '[' ) ;
    public final void rule__ExtractClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4197:1: ( ( '[' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4198:1: ( '[' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4198:1: ( '[' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4199:1: '['
            {
             before(grammarAccess.getExtractClassAccess().getLeftSquareBracketKeyword_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ExtractClass__Group__3__Impl8528); 
             after(grammarAccess.getExtractClassAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__3__Impl"


    // $ANTLR start "rule__ExtractClass__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4212:1: rule__ExtractClass__Group__4 : rule__ExtractClass__Group__4__Impl rule__ExtractClass__Group__5 ;
    public final void rule__ExtractClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4216:1: ( rule__ExtractClass__Group__4__Impl rule__ExtractClass__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4217:2: rule__ExtractClass__Group__4__Impl rule__ExtractClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__4__Impl_in_rule__ExtractClass__Group__48559);
            rule__ExtractClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__5_in_rule__ExtractClass__Group__48562);
            rule__ExtractClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__4"


    // $ANTLR start "rule__ExtractClass__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4224:1: rule__ExtractClass__Group__4__Impl : ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 ) ) ;
    public final void rule__ExtractClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4228:1: ( ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4229:1: ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4229:1: ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4230:1: ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 )
            {
             before(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesAssignment_4()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4231:1: ( rule__ExtractClass__ExtractPropertiesNamesAssignment_4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4231:2: rule__ExtractClass__ExtractPropertiesNamesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__ExtractPropertiesNamesAssignment_4_in_rule__ExtractClass__Group__4__Impl8589);
            rule__ExtractClass__ExtractPropertiesNamesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__4__Impl"


    // $ANTLR start "rule__ExtractClass__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4241:1: rule__ExtractClass__Group__5 : rule__ExtractClass__Group__5__Impl rule__ExtractClass__Group__6 ;
    public final void rule__ExtractClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4245:1: ( rule__ExtractClass__Group__5__Impl rule__ExtractClass__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4246:2: rule__ExtractClass__Group__5__Impl rule__ExtractClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__5__Impl_in_rule__ExtractClass__Group__58619);
            rule__ExtractClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__6_in_rule__ExtractClass__Group__58622);
            rule__ExtractClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__5"


    // $ANTLR start "rule__ExtractClass__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4253:1: rule__ExtractClass__Group__5__Impl : ( ( rule__ExtractClass__Group_5__0 )* ) ;
    public final void rule__ExtractClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4257:1: ( ( ( rule__ExtractClass__Group_5__0 )* ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4258:1: ( ( rule__ExtractClass__Group_5__0 )* )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4258:1: ( ( rule__ExtractClass__Group_5__0 )* )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4259:1: ( rule__ExtractClass__Group_5__0 )*
            {
             before(grammarAccess.getExtractClassAccess().getGroup_5()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4260:1: ( rule__ExtractClass__Group_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4260:2: rule__ExtractClass__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group_5__0_in_rule__ExtractClass__Group__5__Impl8649);
            	    rule__ExtractClass__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExtractClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__5__Impl"


    // $ANTLR start "rule__ExtractClass__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4270:1: rule__ExtractClass__Group__6 : rule__ExtractClass__Group__6__Impl rule__ExtractClass__Group__7 ;
    public final void rule__ExtractClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4274:1: ( rule__ExtractClass__Group__6__Impl rule__ExtractClass__Group__7 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4275:2: rule__ExtractClass__Group__6__Impl rule__ExtractClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__6__Impl_in_rule__ExtractClass__Group__68680);
            rule__ExtractClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__7_in_rule__ExtractClass__Group__68683);
            rule__ExtractClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__6"


    // $ANTLR start "rule__ExtractClass__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4282:1: rule__ExtractClass__Group__6__Impl : ( ']' ) ;
    public final void rule__ExtractClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4286:1: ( ( ']' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4287:1: ( ']' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4287:1: ( ']' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4288:1: ']'
            {
             before(grammarAccess.getExtractClassAccess().getRightSquareBracketKeyword_6()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExtractClass__Group__6__Impl8711); 
             after(grammarAccess.getExtractClassAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__6__Impl"


    // $ANTLR start "rule__ExtractClass__Group__7"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4301:1: rule__ExtractClass__Group__7 : rule__ExtractClass__Group__7__Impl rule__ExtractClass__Group__8 ;
    public final void rule__ExtractClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4305:1: ( rule__ExtractClass__Group__7__Impl rule__ExtractClass__Group__8 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4306:2: rule__ExtractClass__Group__7__Impl rule__ExtractClass__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__7__Impl_in_rule__ExtractClass__Group__78742);
            rule__ExtractClass__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__8_in_rule__ExtractClass__Group__78745);
            rule__ExtractClass__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__7"


    // $ANTLR start "rule__ExtractClass__Group__7__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4313:1: rule__ExtractClass__Group__7__Impl : ( '->' ) ;
    public final void rule__ExtractClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4317:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4318:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4318:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4319:1: '->'
            {
             before(grammarAccess.getExtractClassAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ExtractClass__Group__7__Impl8773); 
             after(grammarAccess.getExtractClassAccess().getHyphenMinusGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__7__Impl"


    // $ANTLR start "rule__ExtractClass__Group__8"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4332:1: rule__ExtractClass__Group__8 : rule__ExtractClass__Group__8__Impl ;
    public final void rule__ExtractClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4336:1: ( rule__ExtractClass__Group__8__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4337:2: rule__ExtractClass__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group__8__Impl_in_rule__ExtractClass__Group__88804);
            rule__ExtractClass__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__8"


    // $ANTLR start "rule__ExtractClass__Group__8__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4343:1: rule__ExtractClass__Group__8__Impl : ( ( rule__ExtractClass__ExtractClassNameAssignment_8 ) ) ;
    public final void rule__ExtractClass__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4347:1: ( ( ( rule__ExtractClass__ExtractClassNameAssignment_8 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4348:1: ( ( rule__ExtractClass__ExtractClassNameAssignment_8 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4348:1: ( ( rule__ExtractClass__ExtractClassNameAssignment_8 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4349:1: ( rule__ExtractClass__ExtractClassNameAssignment_8 )
            {
             before(grammarAccess.getExtractClassAccess().getExtractClassNameAssignment_8()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4350:1: ( rule__ExtractClass__ExtractClassNameAssignment_8 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4350:2: rule__ExtractClass__ExtractClassNameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__ExtractClassNameAssignment_8_in_rule__ExtractClass__Group__8__Impl8831);
            rule__ExtractClass__ExtractClassNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getExtractClassAccess().getExtractClassNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group__8__Impl"


    // $ANTLR start "rule__ExtractClass__Group_5__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4378:1: rule__ExtractClass__Group_5__0 : rule__ExtractClass__Group_5__0__Impl rule__ExtractClass__Group_5__1 ;
    public final void rule__ExtractClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4382:1: ( rule__ExtractClass__Group_5__0__Impl rule__ExtractClass__Group_5__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4383:2: rule__ExtractClass__Group_5__0__Impl rule__ExtractClass__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group_5__0__Impl_in_rule__ExtractClass__Group_5__08879);
            rule__ExtractClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group_5__1_in_rule__ExtractClass__Group_5__08882);
            rule__ExtractClass__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group_5__0"


    // $ANTLR start "rule__ExtractClass__Group_5__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4390:1: rule__ExtractClass__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ExtractClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4394:1: ( ( ',' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4395:1: ( ',' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4395:1: ( ',' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4396:1: ','
            {
             before(grammarAccess.getExtractClassAccess().getCommaKeyword_5_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ExtractClass__Group_5__0__Impl8910); 
             after(grammarAccess.getExtractClassAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group_5__0__Impl"


    // $ANTLR start "rule__ExtractClass__Group_5__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4409:1: rule__ExtractClass__Group_5__1 : rule__ExtractClass__Group_5__1__Impl ;
    public final void rule__ExtractClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4413:1: ( rule__ExtractClass__Group_5__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4414:2: rule__ExtractClass__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__Group_5__1__Impl_in_rule__ExtractClass__Group_5__18941);
            rule__ExtractClass__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group_5__1"


    // $ANTLR start "rule__ExtractClass__Group_5__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4420:1: rule__ExtractClass__Group_5__1__Impl : ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 ) ) ;
    public final void rule__ExtractClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4424:1: ( ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4425:1: ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4425:1: ( ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4426:1: ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 )
            {
             before(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesAssignment_5_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4427:1: ( rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4427:2: rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1_in_rule__ExtractClass__Group_5__1__Impl8968);
            rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__Group_5__1__Impl"


    // $ANTLR start "rule__ExtractParent__Group__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4441:1: rule__ExtractParent__Group__0 : rule__ExtractParent__Group__0__Impl rule__ExtractParent__Group__1 ;
    public final void rule__ExtractParent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4445:1: ( rule__ExtractParent__Group__0__Impl rule__ExtractParent__Group__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4446:2: rule__ExtractParent__Group__0__Impl rule__ExtractParent__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__0__Impl_in_rule__ExtractParent__Group__09002);
            rule__ExtractParent__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__1_in_rule__ExtractParent__Group__09005);
            rule__ExtractParent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__0"


    // $ANTLR start "rule__ExtractParent__Group__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4453:1: rule__ExtractParent__Group__0__Impl : ( 'extract' ) ;
    public final void rule__ExtractParent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4457:1: ( ( 'extract' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4458:1: ( 'extract' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4458:1: ( 'extract' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4459:1: 'extract'
            {
             before(grammarAccess.getExtractParentAccess().getExtractKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ExtractParent__Group__0__Impl9033); 
             after(grammarAccess.getExtractParentAccess().getExtractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__0__Impl"


    // $ANTLR start "rule__ExtractParent__Group__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4472:1: rule__ExtractParent__Group__1 : rule__ExtractParent__Group__1__Impl rule__ExtractParent__Group__2 ;
    public final void rule__ExtractParent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4476:1: ( rule__ExtractParent__Group__1__Impl rule__ExtractParent__Group__2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4477:2: rule__ExtractParent__Group__1__Impl rule__ExtractParent__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__1__Impl_in_rule__ExtractParent__Group__19064);
            rule__ExtractParent__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__2_in_rule__ExtractParent__Group__19067);
            rule__ExtractParent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__1"


    // $ANTLR start "rule__ExtractParent__Group__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4484:1: rule__ExtractParent__Group__1__Impl : ( '[' ) ;
    public final void rule__ExtractParent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4488:1: ( ( '[' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4489:1: ( '[' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4489:1: ( '[' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4490:1: '['
            {
             before(grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ExtractParent__Group__1__Impl9095); 
             after(grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__1__Impl"


    // $ANTLR start "rule__ExtractParent__Group__2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4503:1: rule__ExtractParent__Group__2 : rule__ExtractParent__Group__2__Impl rule__ExtractParent__Group__3 ;
    public final void rule__ExtractParent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4507:1: ( rule__ExtractParent__Group__2__Impl rule__ExtractParent__Group__3 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4508:2: rule__ExtractParent__Group__2__Impl rule__ExtractParent__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__2__Impl_in_rule__ExtractParent__Group__29126);
            rule__ExtractParent__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__3_in_rule__ExtractParent__Group__29129);
            rule__ExtractParent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__2"


    // $ANTLR start "rule__ExtractParent__Group__2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4515:1: rule__ExtractParent__Group__2__Impl : ( ( rule__ExtractParent__SourceClassesNameAssignment_2 ) ) ;
    public final void rule__ExtractParent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4519:1: ( ( ( rule__ExtractParent__SourceClassesNameAssignment_2 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4520:1: ( ( rule__ExtractParent__SourceClassesNameAssignment_2 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4520:1: ( ( rule__ExtractParent__SourceClassesNameAssignment_2 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4521:1: ( rule__ExtractParent__SourceClassesNameAssignment_2 )
            {
             before(grammarAccess.getExtractParentAccess().getSourceClassesNameAssignment_2()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4522:1: ( rule__ExtractParent__SourceClassesNameAssignment_2 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4522:2: rule__ExtractParent__SourceClassesNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__SourceClassesNameAssignment_2_in_rule__ExtractParent__Group__2__Impl9156);
            rule__ExtractParent__SourceClassesNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getSourceClassesNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__2__Impl"


    // $ANTLR start "rule__ExtractParent__Group__3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4532:1: rule__ExtractParent__Group__3 : rule__ExtractParent__Group__3__Impl rule__ExtractParent__Group__4 ;
    public final void rule__ExtractParent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4536:1: ( rule__ExtractParent__Group__3__Impl rule__ExtractParent__Group__4 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4537:2: rule__ExtractParent__Group__3__Impl rule__ExtractParent__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__3__Impl_in_rule__ExtractParent__Group__39186);
            rule__ExtractParent__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__4_in_rule__ExtractParent__Group__39189);
            rule__ExtractParent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__3"


    // $ANTLR start "rule__ExtractParent__Group__3__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4544:1: rule__ExtractParent__Group__3__Impl : ( ( rule__ExtractParent__Group_3__0 )* ) ;
    public final void rule__ExtractParent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4548:1: ( ( ( rule__ExtractParent__Group_3__0 )* ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4549:1: ( ( rule__ExtractParent__Group_3__0 )* )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4549:1: ( ( rule__ExtractParent__Group_3__0 )* )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4550:1: ( rule__ExtractParent__Group_3__0 )*
            {
             before(grammarAccess.getExtractParentAccess().getGroup_3()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4551:1: ( rule__ExtractParent__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4551:2: rule__ExtractParent__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_3__0_in_rule__ExtractParent__Group__3__Impl9216);
            	    rule__ExtractParent__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getExtractParentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__3__Impl"


    // $ANTLR start "rule__ExtractParent__Group__4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4561:1: rule__ExtractParent__Group__4 : rule__ExtractParent__Group__4__Impl rule__ExtractParent__Group__5 ;
    public final void rule__ExtractParent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4565:1: ( rule__ExtractParent__Group__4__Impl rule__ExtractParent__Group__5 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4566:2: rule__ExtractParent__Group__4__Impl rule__ExtractParent__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__4__Impl_in_rule__ExtractParent__Group__49247);
            rule__ExtractParent__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__5_in_rule__ExtractParent__Group__49250);
            rule__ExtractParent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__4"


    // $ANTLR start "rule__ExtractParent__Group__4__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4573:1: rule__ExtractParent__Group__4__Impl : ( ']' ) ;
    public final void rule__ExtractParent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4577:1: ( ( ']' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4578:1: ( ']' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4578:1: ( ']' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4579:1: ']'
            {
             before(grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExtractParent__Group__4__Impl9278); 
             after(grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__4__Impl"


    // $ANTLR start "rule__ExtractParent__Group__5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4592:1: rule__ExtractParent__Group__5 : rule__ExtractParent__Group__5__Impl rule__ExtractParent__Group__6 ;
    public final void rule__ExtractParent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4596:1: ( rule__ExtractParent__Group__5__Impl rule__ExtractParent__Group__6 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4597:2: rule__ExtractParent__Group__5__Impl rule__ExtractParent__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__5__Impl_in_rule__ExtractParent__Group__59309);
            rule__ExtractParent__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__6_in_rule__ExtractParent__Group__59312);
            rule__ExtractParent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__5"


    // $ANTLR start "rule__ExtractParent__Group__5__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4604:1: rule__ExtractParent__Group__5__Impl : ( '.' ) ;
    public final void rule__ExtractParent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4608:1: ( ( '.' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4609:1: ( '.' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4609:1: ( '.' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4610:1: '.'
            {
             before(grammarAccess.getExtractParentAccess().getFullStopKeyword_5()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ExtractParent__Group__5__Impl9340); 
             after(grammarAccess.getExtractParentAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__5__Impl"


    // $ANTLR start "rule__ExtractParent__Group__6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4623:1: rule__ExtractParent__Group__6 : rule__ExtractParent__Group__6__Impl rule__ExtractParent__Group__7 ;
    public final void rule__ExtractParent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4627:1: ( rule__ExtractParent__Group__6__Impl rule__ExtractParent__Group__7 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4628:2: rule__ExtractParent__Group__6__Impl rule__ExtractParent__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__6__Impl_in_rule__ExtractParent__Group__69371);
            rule__ExtractParent__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__7_in_rule__ExtractParent__Group__69374);
            rule__ExtractParent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__6"


    // $ANTLR start "rule__ExtractParent__Group__6__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4635:1: rule__ExtractParent__Group__6__Impl : ( '[' ) ;
    public final void rule__ExtractParent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4639:1: ( ( '[' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4640:1: ( '[' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4640:1: ( '[' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4641:1: '['
            {
             before(grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ExtractParent__Group__6__Impl9402); 
             after(grammarAccess.getExtractParentAccess().getLeftSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__6__Impl"


    // $ANTLR start "rule__ExtractParent__Group__7"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4654:1: rule__ExtractParent__Group__7 : rule__ExtractParent__Group__7__Impl rule__ExtractParent__Group__8 ;
    public final void rule__ExtractParent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4658:1: ( rule__ExtractParent__Group__7__Impl rule__ExtractParent__Group__8 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4659:2: rule__ExtractParent__Group__7__Impl rule__ExtractParent__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__7__Impl_in_rule__ExtractParent__Group__79433);
            rule__ExtractParent__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__8_in_rule__ExtractParent__Group__79436);
            rule__ExtractParent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__7"


    // $ANTLR start "rule__ExtractParent__Group__7__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4666:1: rule__ExtractParent__Group__7__Impl : ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 ) ) ;
    public final void rule__ExtractParent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4670:1: ( ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4671:1: ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4671:1: ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4672:1: ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 )
            {
             before(grammarAccess.getExtractParentAccess().getExtractPropertiesNameAssignment_7()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4673:1: ( rule__ExtractParent__ExtractPropertiesNameAssignment_7 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4673:2: rule__ExtractParent__ExtractPropertiesNameAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__ExtractPropertiesNameAssignment_7_in_rule__ExtractParent__Group__7__Impl9463);
            rule__ExtractParent__ExtractPropertiesNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getExtractPropertiesNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__7__Impl"


    // $ANTLR start "rule__ExtractParent__Group__8"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4683:1: rule__ExtractParent__Group__8 : rule__ExtractParent__Group__8__Impl rule__ExtractParent__Group__9 ;
    public final void rule__ExtractParent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4687:1: ( rule__ExtractParent__Group__8__Impl rule__ExtractParent__Group__9 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4688:2: rule__ExtractParent__Group__8__Impl rule__ExtractParent__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__8__Impl_in_rule__ExtractParent__Group__89493);
            rule__ExtractParent__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__9_in_rule__ExtractParent__Group__89496);
            rule__ExtractParent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__8"


    // $ANTLR start "rule__ExtractParent__Group__8__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4695:1: rule__ExtractParent__Group__8__Impl : ( ( rule__ExtractParent__Group_8__0 )* ) ;
    public final void rule__ExtractParent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4699:1: ( ( ( rule__ExtractParent__Group_8__0 )* ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4700:1: ( ( rule__ExtractParent__Group_8__0 )* )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4700:1: ( ( rule__ExtractParent__Group_8__0 )* )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4701:1: ( rule__ExtractParent__Group_8__0 )*
            {
             before(grammarAccess.getExtractParentAccess().getGroup_8()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4702:1: ( rule__ExtractParent__Group_8__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4702:2: rule__ExtractParent__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_8__0_in_rule__ExtractParent__Group__8__Impl9523);
            	    rule__ExtractParent__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getExtractParentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__8__Impl"


    // $ANTLR start "rule__ExtractParent__Group__9"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4712:1: rule__ExtractParent__Group__9 : rule__ExtractParent__Group__9__Impl rule__ExtractParent__Group__10 ;
    public final void rule__ExtractParent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4716:1: ( rule__ExtractParent__Group__9__Impl rule__ExtractParent__Group__10 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4717:2: rule__ExtractParent__Group__9__Impl rule__ExtractParent__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__9__Impl_in_rule__ExtractParent__Group__99554);
            rule__ExtractParent__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__10_in_rule__ExtractParent__Group__99557);
            rule__ExtractParent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__9"


    // $ANTLR start "rule__ExtractParent__Group__9__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4724:1: rule__ExtractParent__Group__9__Impl : ( ']' ) ;
    public final void rule__ExtractParent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4728:1: ( ( ']' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4729:1: ( ']' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4729:1: ( ']' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4730:1: ']'
            {
             before(grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_9()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ExtractParent__Group__9__Impl9585); 
             after(grammarAccess.getExtractParentAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__9__Impl"


    // $ANTLR start "rule__ExtractParent__Group__10"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4743:1: rule__ExtractParent__Group__10 : rule__ExtractParent__Group__10__Impl rule__ExtractParent__Group__11 ;
    public final void rule__ExtractParent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4747:1: ( rule__ExtractParent__Group__10__Impl rule__ExtractParent__Group__11 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4748:2: rule__ExtractParent__Group__10__Impl rule__ExtractParent__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__10__Impl_in_rule__ExtractParent__Group__109616);
            rule__ExtractParent__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__11_in_rule__ExtractParent__Group__109619);
            rule__ExtractParent__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__10"


    // $ANTLR start "rule__ExtractParent__Group__10__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4755:1: rule__ExtractParent__Group__10__Impl : ( '->' ) ;
    public final void rule__ExtractParent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4759:1: ( ( '->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4760:1: ( '->' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4760:1: ( '->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4761:1: '->'
            {
             before(grammarAccess.getExtractParentAccess().getHyphenMinusGreaterThanSignKeyword_10()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ExtractParent__Group__10__Impl9647); 
             after(grammarAccess.getExtractParentAccess().getHyphenMinusGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__10__Impl"


    // $ANTLR start "rule__ExtractParent__Group__11"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4774:1: rule__ExtractParent__Group__11 : rule__ExtractParent__Group__11__Impl ;
    public final void rule__ExtractParent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4778:1: ( rule__ExtractParent__Group__11__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4779:2: rule__ExtractParent__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group__11__Impl_in_rule__ExtractParent__Group__119678);
            rule__ExtractParent__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__11"


    // $ANTLR start "rule__ExtractParent__Group__11__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4785:1: rule__ExtractParent__Group__11__Impl : ( ( rule__ExtractParent__ExtractParentNameAssignment_11 ) ) ;
    public final void rule__ExtractParent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4789:1: ( ( ( rule__ExtractParent__ExtractParentNameAssignment_11 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4790:1: ( ( rule__ExtractParent__ExtractParentNameAssignment_11 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4790:1: ( ( rule__ExtractParent__ExtractParentNameAssignment_11 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4791:1: ( rule__ExtractParent__ExtractParentNameAssignment_11 )
            {
             before(grammarAccess.getExtractParentAccess().getExtractParentNameAssignment_11()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4792:1: ( rule__ExtractParent__ExtractParentNameAssignment_11 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4792:2: rule__ExtractParent__ExtractParentNameAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__ExtractParentNameAssignment_11_in_rule__ExtractParent__Group__11__Impl9705);
            rule__ExtractParent__ExtractParentNameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getExtractParentNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group__11__Impl"


    // $ANTLR start "rule__ExtractParent__Group_3__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4826:1: rule__ExtractParent__Group_3__0 : rule__ExtractParent__Group_3__0__Impl rule__ExtractParent__Group_3__1 ;
    public final void rule__ExtractParent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4830:1: ( rule__ExtractParent__Group_3__0__Impl rule__ExtractParent__Group_3__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4831:2: rule__ExtractParent__Group_3__0__Impl rule__ExtractParent__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_3__0__Impl_in_rule__ExtractParent__Group_3__09759);
            rule__ExtractParent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_3__1_in_rule__ExtractParent__Group_3__09762);
            rule__ExtractParent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_3__0"


    // $ANTLR start "rule__ExtractParent__Group_3__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4838:1: rule__ExtractParent__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ExtractParent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4842:1: ( ( ',' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4843:1: ( ',' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4843:1: ( ',' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4844:1: ','
            {
             before(grammarAccess.getExtractParentAccess().getCommaKeyword_3_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ExtractParent__Group_3__0__Impl9790); 
             after(grammarAccess.getExtractParentAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_3__0__Impl"


    // $ANTLR start "rule__ExtractParent__Group_3__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4857:1: rule__ExtractParent__Group_3__1 : rule__ExtractParent__Group_3__1__Impl ;
    public final void rule__ExtractParent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4861:1: ( rule__ExtractParent__Group_3__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4862:2: rule__ExtractParent__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_3__1__Impl_in_rule__ExtractParent__Group_3__19821);
            rule__ExtractParent__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_3__1"


    // $ANTLR start "rule__ExtractParent__Group_3__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4868:1: rule__ExtractParent__Group_3__1__Impl : ( ( rule__ExtractParent__SourceClassesNameAssignment_3_1 ) ) ;
    public final void rule__ExtractParent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4872:1: ( ( ( rule__ExtractParent__SourceClassesNameAssignment_3_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4873:1: ( ( rule__ExtractParent__SourceClassesNameAssignment_3_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4873:1: ( ( rule__ExtractParent__SourceClassesNameAssignment_3_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4874:1: ( rule__ExtractParent__SourceClassesNameAssignment_3_1 )
            {
             before(grammarAccess.getExtractParentAccess().getSourceClassesNameAssignment_3_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4875:1: ( rule__ExtractParent__SourceClassesNameAssignment_3_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4875:2: rule__ExtractParent__SourceClassesNameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__SourceClassesNameAssignment_3_1_in_rule__ExtractParent__Group_3__1__Impl9848);
            rule__ExtractParent__SourceClassesNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getSourceClassesNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_3__1__Impl"


    // $ANTLR start "rule__ExtractParent__Group_8__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4889:1: rule__ExtractParent__Group_8__0 : rule__ExtractParent__Group_8__0__Impl rule__ExtractParent__Group_8__1 ;
    public final void rule__ExtractParent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4893:1: ( rule__ExtractParent__Group_8__0__Impl rule__ExtractParent__Group_8__1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4894:2: rule__ExtractParent__Group_8__0__Impl rule__ExtractParent__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_8__0__Impl_in_rule__ExtractParent__Group_8__09882);
            rule__ExtractParent__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_8__1_in_rule__ExtractParent__Group_8__09885);
            rule__ExtractParent__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_8__0"


    // $ANTLR start "rule__ExtractParent__Group_8__0__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4901:1: rule__ExtractParent__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ExtractParent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4905:1: ( ( ',' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4906:1: ( ',' )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4906:1: ( ',' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4907:1: ','
            {
             before(grammarAccess.getExtractParentAccess().getCommaKeyword_8_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ExtractParent__Group_8__0__Impl9913); 
             after(grammarAccess.getExtractParentAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_8__0__Impl"


    // $ANTLR start "rule__ExtractParent__Group_8__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4920:1: rule__ExtractParent__Group_8__1 : rule__ExtractParent__Group_8__1__Impl ;
    public final void rule__ExtractParent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4924:1: ( rule__ExtractParent__Group_8__1__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4925:2: rule__ExtractParent__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__Group_8__1__Impl_in_rule__ExtractParent__Group_8__19944);
            rule__ExtractParent__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_8__1"


    // $ANTLR start "rule__ExtractParent__Group_8__1__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4931:1: rule__ExtractParent__Group_8__1__Impl : ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 ) ) ;
    public final void rule__ExtractParent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4935:1: ( ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4936:1: ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4936:1: ( ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4937:1: ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 )
            {
             before(grammarAccess.getExtractParentAccess().getExtractPropertiesNameAssignment_8_1()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4938:1: ( rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4938:2: rule__ExtractParent__ExtractPropertiesNameAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtractParent__ExtractPropertiesNameAssignment_8_1_in_rule__ExtractParent__Group_8__1__Impl9971);
            rule__ExtractParent__ExtractPropertiesNameAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExtractParentAccess().getExtractPropertiesNameAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__Group_8__1__Impl"


    // $ANTLR start "rule__AddStandardClass__UnorderedGroup_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4953:1: rule__AddStandardClass__UnorderedGroup_2 : rule__AddStandardClass__UnorderedGroup_2__0 {...}?;
    public final void rule__AddStandardClass__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4958:1: ( rule__AddStandardClass__UnorderedGroup_2__0 {...}?)
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4959:2: rule__AddStandardClass__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__UnorderedGroup_2__0_in_rule__AddStandardClass__UnorderedGroup_210006);
            rule__AddStandardClass__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__AddStandardClass__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__UnorderedGroup_2"


    // $ANTLR start "rule__AddStandardClass__UnorderedGroup_2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4970:1: rule__AddStandardClass__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) ) ) ;
    public final void rule__AddStandardClass__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4975:1: ( ( ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4976:3: ( ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4976:3: ( ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 >=22 && LA26_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4978:4: ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4978:4: ({...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4979:5: {...}? => ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AddStandardClass__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4979:113: ( ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4980:6: ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4986:6: ( ( rule__AddStandardClass__IsAbstractAssignment_2_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4988:7: ( rule__AddStandardClass__IsAbstractAssignment_2_0 )
                    {
                     before(grammarAccess.getAddStandardClassAccess().getIsAbstractAssignment_2_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4989:7: ( rule__AddStandardClass__IsAbstractAssignment_2_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4989:8: rule__AddStandardClass__IsAbstractAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__IsAbstractAssignment_2_0_in_rule__AddStandardClass__UnorderedGroup_2__Impl10095);
                    rule__AddStandardClass__IsAbstractAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddStandardClassAccess().getIsAbstractAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4995:4: ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4995:4: ({...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4996:5: {...}? => ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AddStandardClass__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4996:113: ( ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:4997:6: ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5003:6: ( ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5005:7: ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getAddStandardClassAccess().getInheritanceTypeAssignment_2_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5006:7: ( rule__AddStandardClass__InheritanceTypeAssignment_2_1 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5006:8: rule__AddStandardClass__InheritanceTypeAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__InheritanceTypeAssignment_2_1_in_rule__AddStandardClass__UnorderedGroup_2__Impl10186);
                    rule__AddStandardClass__InheritanceTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddStandardClassAccess().getInheritanceTypeAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__AddStandardClass__UnorderedGroup_2__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5021:1: rule__AddStandardClass__UnorderedGroup_2__0 : rule__AddStandardClass__UnorderedGroup_2__Impl ( rule__AddStandardClass__UnorderedGroup_2__1 )? ;
    public final void rule__AddStandardClass__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5025:1: ( rule__AddStandardClass__UnorderedGroup_2__Impl ( rule__AddStandardClass__UnorderedGroup_2__1 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5026:2: rule__AddStandardClass__UnorderedGroup_2__Impl ( rule__AddStandardClass__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__UnorderedGroup_2__Impl_in_rule__AddStandardClass__UnorderedGroup_2__010245);
            rule__AddStandardClass__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5027:2: ( rule__AddStandardClass__UnorderedGroup_2__1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 >=22 && LA27_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAddStandardClassAccess().getUnorderedGroup_2(), 1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5027:2: rule__AddStandardClass__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__UnorderedGroup_2__1_in_rule__AddStandardClass__UnorderedGroup_2__010248);
                    rule__AddStandardClass__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__UnorderedGroup_2__0"


    // $ANTLR start "rule__AddStandardClass__UnorderedGroup_2__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5034:1: rule__AddStandardClass__UnorderedGroup_2__1 : rule__AddStandardClass__UnorderedGroup_2__Impl ;
    public final void rule__AddStandardClass__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5038:1: ( rule__AddStandardClass__UnorderedGroup_2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5039:2: rule__AddStandardClass__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddStandardClass__UnorderedGroup_2__Impl_in_rule__AddStandardClass__UnorderedGroup_2__110273);
            rule__AddStandardClass__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__UnorderedGroup_2__1"


    // $ANTLR start "rule__AddProperty__UnorderedGroup_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5050:1: rule__AddProperty__UnorderedGroup_2 : ( rule__AddProperty__UnorderedGroup_2__0 )? ;
    public final void rule__AddProperty__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5055:1: ( ( rule__AddProperty__UnorderedGroup_2__0 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5056:2: ( rule__AddProperty__UnorderedGroup_2__0 )?
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5056:2: ( rule__AddProperty__UnorderedGroup_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13||LA28_0==44) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
                alt28=1;
            }
            else if ( (LA28_0==14||LA28_0==45) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5056:2: rule__AddProperty__UnorderedGroup_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UnorderedGroup_2__0_in_rule__AddProperty__UnorderedGroup_210301);
                    rule__AddProperty__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UnorderedGroup_2"


    // $ANTLR start "rule__AddProperty__UnorderedGroup_2__Impl"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5066:1: rule__AddProperty__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) ) ) ;
    public final void rule__AddProperty__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5071:1: ( ( ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5072:3: ( ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5072:3: ( ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) ) | ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13||LA29_0==44) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
                alt29=1;
            }
            else if ( (LA29_0==14||LA29_0==45) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5074:4: ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5074:4: ({...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5075:5: {...}? => ( ( ( rule__AddProperty__Alternatives_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AddProperty__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5075:108: ( ( ( rule__AddProperty__Alternatives_2_0 ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5076:6: ( ( rule__AddProperty__Alternatives_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5082:6: ( ( rule__AddProperty__Alternatives_2_0 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5084:7: ( rule__AddProperty__Alternatives_2_0 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getAlternatives_2_0()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5085:7: ( rule__AddProperty__Alternatives_2_0 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5085:8: rule__AddProperty__Alternatives_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Alternatives_2_0_in_rule__AddProperty__UnorderedGroup_2__Impl10388);
                    rule__AddProperty__Alternatives_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getAlternatives_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5091:4: ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) )
                    {
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5091:4: ({...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5092:5: {...}? => ( ( ( rule__AddProperty__Alternatives_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AddProperty__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5092:108: ( ( ( rule__AddProperty__Alternatives_2_1 ) ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5093:6: ( ( rule__AddProperty__Alternatives_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5099:6: ( ( rule__AddProperty__Alternatives_2_1 ) )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5101:7: ( rule__AddProperty__Alternatives_2_1 )
                    {
                     before(grammarAccess.getAddPropertyAccess().getAlternatives_2_1()); 
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5102:7: ( rule__AddProperty__Alternatives_2_1 )
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5102:8: rule__AddProperty__Alternatives_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__Alternatives_2_1_in_rule__AddProperty__UnorderedGroup_2__Impl10479);
                    rule__AddProperty__Alternatives_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddPropertyAccess().getAlternatives_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__AddProperty__UnorderedGroup_2__0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5117:1: rule__AddProperty__UnorderedGroup_2__0 : rule__AddProperty__UnorderedGroup_2__Impl ( rule__AddProperty__UnorderedGroup_2__1 )? ;
    public final void rule__AddProperty__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5121:1: ( rule__AddProperty__UnorderedGroup_2__Impl ( rule__AddProperty__UnorderedGroup_2__1 )? )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5122:2: rule__AddProperty__UnorderedGroup_2__Impl ( rule__AddProperty__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UnorderedGroup_2__Impl_in_rule__AddProperty__UnorderedGroup_2__010538);
            rule__AddProperty__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5123:2: ( rule__AddProperty__UnorderedGroup_2__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13||LA30_0==44) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 0) ) {
                alt30=1;
            }
            else if ( (LA30_0==14||LA30_0==45) && getUnorderedGroupHelper().canSelect(grammarAccess.getAddPropertyAccess().getUnorderedGroup_2(), 1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5123:2: rule__AddProperty__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UnorderedGroup_2__1_in_rule__AddProperty__UnorderedGroup_2__010541);
                    rule__AddProperty__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UnorderedGroup_2__0"


    // $ANTLR start "rule__AddProperty__UnorderedGroup_2__1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5130:1: rule__AddProperty__UnorderedGroup_2__1 : rule__AddProperty__UnorderedGroup_2__Impl ;
    public final void rule__AddProperty__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5134:1: ( rule__AddProperty__UnorderedGroup_2__Impl )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5135:2: rule__AddProperty__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddProperty__UnorderedGroup_2__Impl_in_rule__AddProperty__UnorderedGroup_2__110566);
            rule__AddProperty__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UnorderedGroup_2__1"


    // $ANTLR start "rule__Operations__OperationsAssignment"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5146:1: rule__Operations__OperationsAssignment : ( ruleModelOperation ) ;
    public final void rule__Operations__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5150:1: ( ( ruleModelOperation ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5151:1: ( ruleModelOperation )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5151:1: ( ruleModelOperation )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5152:1: ruleModelOperation
            {
             before(grammarAccess.getOperationsAccess().getOperationsModelOperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelOperation_in_rule__Operations__OperationsAssignment10598);
            ruleModelOperation();

            state._fsp--;

             after(grammarAccess.getOperationsAccess().getOperationsModelOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operations__OperationsAssignment"


    // $ANTLR start "rule__AddPrimitiveClass__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5161:1: rule__AddPrimitiveClass__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AddPrimitiveClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5165:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5166:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5166:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5167:1: RULE_ID
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddPrimitiveClass__NameAssignment_010629); 
             after(grammarAccess.getAddPrimitiveClassAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__NameAssignment_0"


    // $ANTLR start "rule__AddPrimitiveClass__PrimitiveTypeAssignment_3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5176:1: rule__AddPrimitiveClass__PrimitiveTypeAssignment_3 : ( rulePrimitiveType ) ;
    public final void rule__AddPrimitiveClass__PrimitiveTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5180:1: ( ( rulePrimitiveType ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5181:1: ( rulePrimitiveType )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5181:1: ( rulePrimitiveType )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5182:1: rulePrimitiveType
            {
             before(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_rule__AddPrimitiveClass__PrimitiveTypeAssignment_310660);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getAddPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddPrimitiveClass__PrimitiveTypeAssignment_3"


    // $ANTLR start "rule__AddEmbeddedClass__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5191:1: rule__AddEmbeddedClass__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AddEmbeddedClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5195:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5196:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5196:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5197:1: RULE_ID
            {
             before(grammarAccess.getAddEmbeddedClassAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddEmbeddedClass__NameAssignment_010691); 
             after(grammarAccess.getAddEmbeddedClassAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEmbeddedClass__NameAssignment_0"


    // $ANTLR start "rule__AddStandardClass__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5206:1: rule__AddStandardClass__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AddStandardClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5210:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5211:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5211:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5212:1: RULE_ID
            {
             before(grammarAccess.getAddStandardClassAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddStandardClass__NameAssignment_010722); 
             after(grammarAccess.getAddStandardClassAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__NameAssignment_0"


    // $ANTLR start "rule__AddStandardClass__IsAbstractAssignment_2_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5221:1: rule__AddStandardClass__IsAbstractAssignment_2_0 : ( ( 'abstract' ) ) ;
    public final void rule__AddStandardClass__IsAbstractAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5225:1: ( ( ( 'abstract' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5226:1: ( ( 'abstract' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5226:1: ( ( 'abstract' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5227:1: ( 'abstract' )
            {
             before(grammarAccess.getAddStandardClassAccess().getIsAbstractAbstractKeyword_2_0_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5228:1: ( 'abstract' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5229:1: 'abstract'
            {
             before(grammarAccess.getAddStandardClassAccess().getIsAbstractAbstractKeyword_2_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__AddStandardClass__IsAbstractAssignment_2_010758); 
             after(grammarAccess.getAddStandardClassAccess().getIsAbstractAbstractKeyword_2_0_0()); 

            }

             after(grammarAccess.getAddStandardClassAccess().getIsAbstractAbstractKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__IsAbstractAssignment_2_0"


    // $ANTLR start "rule__AddStandardClass__InheritanceTypeAssignment_2_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5244:1: rule__AddStandardClass__InheritanceTypeAssignment_2_1 : ( ruleInheritanceType ) ;
    public final void rule__AddStandardClass__InheritanceTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5248:1: ( ( ruleInheritanceType ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5249:1: ( ruleInheritanceType )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5249:1: ( ruleInheritanceType )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5250:1: ruleInheritanceType
            {
             before(grammarAccess.getAddStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInheritanceType_in_rule__AddStandardClass__InheritanceTypeAssignment_2_110797);
            ruleInheritanceType();

            state._fsp--;

             after(grammarAccess.getAddStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddStandardClass__InheritanceTypeAssignment_2_1"


    // $ANTLR start "rule__RenameEntity__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5259:1: rule__RenameEntity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RenameEntity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5263:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5264:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5264:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5265:1: RULE_ID
            {
             before(grammarAccess.getRenameEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameEntity__NameAssignment_010828); 
             after(grammarAccess.getRenameEntityAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__NameAssignment_0"


    // $ANTLR start "rule__RenameEntity__NewNameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5274:1: rule__RenameEntity__NewNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RenameEntity__NewNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5278:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5279:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5279:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5280:1: RULE_ID
            {
             before(grammarAccess.getRenameEntityAccess().getNewNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameEntity__NewNameAssignment_210859); 
             after(grammarAccess.getRenameEntityAccess().getNewNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEntity__NewNameAssignment_2"


    // $ANTLR start "rule__SetParent__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5289:1: rule__SetParent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetParent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5293:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5294:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5294:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5295:1: RULE_ID
            {
             before(grammarAccess.getSetParentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetParent__NameAssignment_010890); 
             after(grammarAccess.getSetParentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__NameAssignment_0"


    // $ANTLR start "rule__SetParent__ParentNameAssignment_1_0_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5304:1: rule__SetParent__ParentNameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__SetParent__ParentNameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5308:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5309:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5309:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5310:1: RULE_ID
            {
             before(grammarAccess.getSetParentAccess().getParentNameIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetParent__ParentNameAssignment_1_0_110921); 
             after(grammarAccess.getSetParentAccess().getParentNameIDTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetParent__ParentNameAssignment_1_0_1"


    // $ANTLR start "rule__SetAbstract__NameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5319:1: rule__SetAbstract__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetAbstract__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5323:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5324:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5324:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5325:1: RULE_ID
            {
             before(grammarAccess.getSetAbstractAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetAbstract__NameAssignment_010952); 
             after(grammarAccess.getSetAbstractAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__NameAssignment_0"


    // $ANTLR start "rule__SetAbstract__IsAbstractAssignment_1_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5334:1: rule__SetAbstract__IsAbstractAssignment_1_0 : ( ( 'abstract' ) ) ;
    public final void rule__SetAbstract__IsAbstractAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5338:1: ( ( ( 'abstract' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5339:1: ( ( 'abstract' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5339:1: ( ( 'abstract' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5340:1: ( 'abstract' )
            {
             before(grammarAccess.getSetAbstractAccess().getIsAbstractAbstractKeyword_1_0_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5341:1: ( 'abstract' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5342:1: 'abstract'
            {
             before(grammarAccess.getSetAbstractAccess().getIsAbstractAbstractKeyword_1_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__SetAbstract__IsAbstractAssignment_1_010988); 
             after(grammarAccess.getSetAbstractAccess().getIsAbstractAbstractKeyword_1_0_0()); 

            }

             after(grammarAccess.getSetAbstractAccess().getIsAbstractAbstractKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAbstract__IsAbstractAssignment_1_0"


    // $ANTLR start "rule__RemoveEntity__NameAssignment_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5357:1: rule__RemoveEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RemoveEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5361:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5362:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5362:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5363:1: RULE_ID
            {
             before(grammarAccess.getRemoveEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RemoveEntity__NameAssignment_111027); 
             after(grammarAccess.getRemoveEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEntity__NameAssignment_1"


    // $ANTLR start "rule__AddProperty__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5372:1: rule__AddProperty__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AddProperty__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5376:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5377:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5377:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5378:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddProperty__OwningClassNameAssignment_011058); 
             after(grammarAccess.getAddPropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__OwningClassNameAssignment_0"


    // $ANTLR start "rule__AddProperty__IsOrderedAssignment_2_0_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5387:1: rule__AddProperty__IsOrderedAssignment_2_0_1 : ( ( 'ordered' ) ) ;
    public final void rule__AddProperty__IsOrderedAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5391:1: ( ( ( 'ordered' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5392:1: ( ( 'ordered' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5392:1: ( ( 'ordered' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5393:1: ( 'ordered' )
            {
             before(grammarAccess.getAddPropertyAccess().getIsOrderedOrderedKeyword_2_0_1_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5394:1: ( 'ordered' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5395:1: 'ordered'
            {
             before(grammarAccess.getAddPropertyAccess().getIsOrderedOrderedKeyword_2_0_1_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__AddProperty__IsOrderedAssignment_2_0_111094); 
             after(grammarAccess.getAddPropertyAccess().getIsOrderedOrderedKeyword_2_0_1_0()); 

            }

             after(grammarAccess.getAddPropertyAccess().getIsOrderedOrderedKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__IsOrderedAssignment_2_0_1"


    // $ANTLR start "rule__AddProperty__IsUniqueAssignment_2_1_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5410:1: rule__AddProperty__IsUniqueAssignment_2_1_1 : ( ( 'unique' ) ) ;
    public final void rule__AddProperty__IsUniqueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5414:1: ( ( ( 'unique' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5415:1: ( ( 'unique' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5415:1: ( ( 'unique' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5416:1: ( 'unique' )
            {
             before(grammarAccess.getAddPropertyAccess().getIsUniqueUniqueKeyword_2_1_1_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5417:1: ( 'unique' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5418:1: 'unique'
            {
             before(grammarAccess.getAddPropertyAccess().getIsUniqueUniqueKeyword_2_1_1_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__AddProperty__IsUniqueAssignment_2_1_111138); 
             after(grammarAccess.getAddPropertyAccess().getIsUniqueUniqueKeyword_2_1_1_0()); 

            }

             after(grammarAccess.getAddPropertyAccess().getIsUniqueUniqueKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__IsUniqueAssignment_2_1_1"


    // $ANTLR start "rule__AddProperty__NameAssignment_3"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5433:1: rule__AddProperty__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AddProperty__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5437:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5438:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5438:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5439:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddProperty__NameAssignment_311177); 
             after(grammarAccess.getAddPropertyAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__NameAssignment_3"


    // $ANTLR start "rule__AddProperty__TypeAssignment_5"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5448:1: rule__AddProperty__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__AddProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5452:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5453:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5453:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5454:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_511208); 
             after(grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__TypeAssignment_5"


    // $ANTLR start "rule__AddProperty__UpperBoundAssignment_6_1_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5463:1: rule__AddProperty__UpperBoundAssignment_6_1_0 : ( RULE_INT ) ;
    public final void rule__AddProperty__UpperBoundAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5467:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5468:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5468:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5469:1: RULE_INT
            {
             before(grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AddProperty__UpperBoundAssignment_6_1_011239); 
             after(grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UpperBoundAssignment_6_1_0"


    // $ANTLR start "rule__AddProperty__LowerBoundAssignment_6_1_1_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5478:1: rule__AddProperty__LowerBoundAssignment_6_1_1_0 : ( RULE_INT ) ;
    public final void rule__AddProperty__LowerBoundAssignment_6_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5482:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5483:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5483:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5484:1: RULE_INT
            {
             before(grammarAccess.getAddPropertyAccess().getLowerBoundINTTerminalRuleCall_6_1_1_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AddProperty__LowerBoundAssignment_6_1_1_011270); 
             after(grammarAccess.getAddPropertyAccess().getLowerBoundINTTerminalRuleCall_6_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__LowerBoundAssignment_6_1_1_0"


    // $ANTLR start "rule__AddProperty__UpperBoundAssignment_6_1_1_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5493:1: rule__AddProperty__UpperBoundAssignment_6_1_1_2 : ( RULE_INT ) ;
    public final void rule__AddProperty__UpperBoundAssignment_6_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5497:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5498:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5498:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5499:1: RULE_INT
            {
             before(grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_1_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AddProperty__UpperBoundAssignment_6_1_1_211301); 
             after(grammarAccess.getAddPropertyAccess().getUpperBoundINTTerminalRuleCall_6_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__UpperBoundAssignment_6_1_1_2"


    // $ANTLR start "rule__AddProperty__DefaultValueAssignment_7_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5508:1: rule__AddProperty__DefaultValueAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__AddProperty__DefaultValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5512:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5513:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5513:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5514:1: RULE_ID
            {
             before(grammarAccess.getAddPropertyAccess().getDefaultValueIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AddProperty__DefaultValueAssignment_7_111332); 
             after(grammarAccess.getAddPropertyAccess().getDefaultValueIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddProperty__DefaultValueAssignment_7_1"


    // $ANTLR start "rule__RenameProperty__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5523:1: rule__RenameProperty__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RenameProperty__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5527:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5528:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5528:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5529:1: RULE_ID
            {
             before(grammarAccess.getRenamePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameProperty__OwningClassNameAssignment_011363); 
             after(grammarAccess.getRenamePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__OwningClassNameAssignment_0"


    // $ANTLR start "rule__RenameProperty__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5538:1: rule__RenameProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RenameProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5542:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5543:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5543:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5544:1: RULE_ID
            {
             before(grammarAccess.getRenamePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameProperty__NameAssignment_211394); 
             after(grammarAccess.getRenamePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__NameAssignment_2"


    // $ANTLR start "rule__RenameProperty__NewNameAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5553:1: rule__RenameProperty__NewNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RenameProperty__NewNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5557:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5558:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5558:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5559:1: RULE_ID
            {
             before(grammarAccess.getRenamePropertyAccess().getNewNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RenameProperty__NewNameAssignment_411425); 
             after(grammarAccess.getRenamePropertyAccess().getNewNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameProperty__NewNameAssignment_4"


    // $ANTLR start "rule__RemoveProperty__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5568:1: rule__RemoveProperty__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RemoveProperty__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5572:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5573:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5573:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5574:1: RULE_ID
            {
             before(grammarAccess.getRemovePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RemoveProperty__OwningClassNameAssignment_011456); 
             after(grammarAccess.getRemovePropertyAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__OwningClassNameAssignment_0"


    // $ANTLR start "rule__RemoveProperty__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5583:1: rule__RemoveProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RemoveProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5587:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5588:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5588:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5589:1: RULE_ID
            {
             before(grammarAccess.getRemovePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__RemoveProperty__NameAssignment_211487); 
             after(grammarAccess.getRemovePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveProperty__NameAssignment_2"


    // $ANTLR start "rule__SetType__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5598:1: rule__SetType__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetType__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5602:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5603:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5603:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5604:1: RULE_ID
            {
             before(grammarAccess.getSetTypeAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetType__OwningClassNameAssignment_011518); 
             after(grammarAccess.getSetTypeAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__OwningClassNameAssignment_0"


    // $ANTLR start "rule__SetType__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5613:1: rule__SetType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SetType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5617:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5618:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5618:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5619:1: RULE_ID
            {
             before(grammarAccess.getSetTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetType__NameAssignment_211549); 
             after(grammarAccess.getSetTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__NameAssignment_2"


    // $ANTLR start "rule__SetType__TypeAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5628:1: rule__SetType__TypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__SetType__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5632:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5633:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5633:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5634:1: RULE_ID
            {
             before(grammarAccess.getSetTypeAccess().getTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetType__TypeAssignment_411580); 
             after(grammarAccess.getSetTypeAccess().getTypeIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetType__TypeAssignment_4"


    // $ANTLR start "rule__SetOpposite__FirstClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5643:1: rule__SetOpposite__FirstClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetOpposite__FirstClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5647:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5648:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5648:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5649:1: RULE_ID
            {
             before(grammarAccess.getSetOppositeAccess().getFirstClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOpposite__FirstClassNameAssignment_011611); 
             after(grammarAccess.getSetOppositeAccess().getFirstClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__FirstClassNameAssignment_0"


    // $ANTLR start "rule__SetOpposite__FirstPropertyNameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5658:1: rule__SetOpposite__FirstPropertyNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SetOpposite__FirstPropertyNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5662:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5663:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5663:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5664:1: RULE_ID
            {
             before(grammarAccess.getSetOppositeAccess().getFirstPropertyNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOpposite__FirstPropertyNameAssignment_211642); 
             after(grammarAccess.getSetOppositeAccess().getFirstPropertyNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__FirstPropertyNameAssignment_2"


    // $ANTLR start "rule__SetOpposite__IsOppositeAssignment_3_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5673:1: rule__SetOpposite__IsOppositeAssignment_3_0 : ( ( '<->' ) ) ;
    public final void rule__SetOpposite__IsOppositeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5677:1: ( ( ( '<->' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5678:1: ( ( '<->' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5678:1: ( ( '<->' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5679:1: ( '<->' )
            {
             before(grammarAccess.getSetOppositeAccess().getIsOppositeLessThanSignHyphenMinusGreaterThanSignKeyword_3_0_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5680:1: ( '<->' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5681:1: '<->'
            {
             before(grammarAccess.getSetOppositeAccess().getIsOppositeLessThanSignHyphenMinusGreaterThanSignKeyword_3_0_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SetOpposite__IsOppositeAssignment_3_011678); 
             after(grammarAccess.getSetOppositeAccess().getIsOppositeLessThanSignHyphenMinusGreaterThanSignKeyword_3_0_0()); 

            }

             after(grammarAccess.getSetOppositeAccess().getIsOppositeLessThanSignHyphenMinusGreaterThanSignKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__IsOppositeAssignment_3_0"


    // $ANTLR start "rule__SetOpposite__SecondClassNameAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5696:1: rule__SetOpposite__SecondClassNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__SetOpposite__SecondClassNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5700:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5701:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5701:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5702:1: RULE_ID
            {
             before(grammarAccess.getSetOppositeAccess().getSecondClassNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOpposite__SecondClassNameAssignment_411717); 
             after(grammarAccess.getSetOppositeAccess().getSecondClassNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__SecondClassNameAssignment_4"


    // $ANTLR start "rule__SetOpposite__SecondPropertyNameAssignment_6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5711:1: rule__SetOpposite__SecondPropertyNameAssignment_6 : ( RULE_ID ) ;
    public final void rule__SetOpposite__SecondPropertyNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5715:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5716:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5716:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5717:1: RULE_ID
            {
             before(grammarAccess.getSetOppositeAccess().getSecondPropertyNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOpposite__SecondPropertyNameAssignment_611748); 
             after(grammarAccess.getSetOppositeAccess().getSecondPropertyNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOpposite__SecondPropertyNameAssignment_6"


    // $ANTLR start "rule__SetBounds__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5726:1: rule__SetBounds__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetBounds__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5730:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5731:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5731:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5732:1: RULE_ID
            {
             before(grammarAccess.getSetBoundsAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetBounds__OwningClassNameAssignment_011779); 
             after(grammarAccess.getSetBoundsAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__OwningClassNameAssignment_0"


    // $ANTLR start "rule__SetBounds__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5741:1: rule__SetBounds__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SetBounds__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5745:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5746:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5746:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5747:1: RULE_ID
            {
             before(grammarAccess.getSetBoundsAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetBounds__NameAssignment_211810); 
             after(grammarAccess.getSetBoundsAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__NameAssignment_2"


    // $ANTLR start "rule__SetBounds__UpperBoundAssignment_3_1_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5756:1: rule__SetBounds__UpperBoundAssignment_3_1_0 : ( RULE_INT ) ;
    public final void rule__SetBounds__UpperBoundAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5760:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5761:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5761:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5762:1: RULE_INT
            {
             before(grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__SetBounds__UpperBoundAssignment_3_1_011841); 
             after(grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__UpperBoundAssignment_3_1_0"


    // $ANTLR start "rule__SetBounds__LowerBoundAssignment_3_1_1_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5771:1: rule__SetBounds__LowerBoundAssignment_3_1_1_0 : ( RULE_INT ) ;
    public final void rule__SetBounds__LowerBoundAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5775:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5776:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5776:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5777:1: RULE_INT
            {
             before(grammarAccess.getSetBoundsAccess().getLowerBoundINTTerminalRuleCall_3_1_1_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__SetBounds__LowerBoundAssignment_3_1_1_011872); 
             after(grammarAccess.getSetBoundsAccess().getLowerBoundINTTerminalRuleCall_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__LowerBoundAssignment_3_1_1_0"


    // $ANTLR start "rule__SetBounds__UpperBoundAssignment_3_1_1_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5786:1: rule__SetBounds__UpperBoundAssignment_3_1_1_2 : ( RULE_INT ) ;
    public final void rule__SetBounds__UpperBoundAssignment_3_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5790:1: ( ( RULE_INT ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5791:1: ( RULE_INT )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5791:1: ( RULE_INT )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5792:1: RULE_INT
            {
             before(grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_1_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__SetBounds__UpperBoundAssignment_3_1_1_211903); 
             after(grammarAccess.getSetBoundsAccess().getUpperBoundINTTerminalRuleCall_3_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetBounds__UpperBoundAssignment_3_1_1_2"


    // $ANTLR start "rule__SetOrdered__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5801:1: rule__SetOrdered__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetOrdered__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5805:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5806:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5806:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5807:1: RULE_ID
            {
             before(grammarAccess.getSetOrderedAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOrdered__OwningClassNameAssignment_011934); 
             after(grammarAccess.getSetOrderedAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__OwningClassNameAssignment_0"


    // $ANTLR start "rule__SetOrdered__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5816:1: rule__SetOrdered__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SetOrdered__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5820:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5821:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5821:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5822:1: RULE_ID
            {
             before(grammarAccess.getSetOrderedAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetOrdered__NameAssignment_211965); 
             after(grammarAccess.getSetOrderedAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__NameAssignment_2"


    // $ANTLR start "rule__SetOrdered__IsOrderedAssignment_3_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5831:1: rule__SetOrdered__IsOrderedAssignment_3_0 : ( ( 'ordered' ) ) ;
    public final void rule__SetOrdered__IsOrderedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5835:1: ( ( ( 'ordered' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5836:1: ( ( 'ordered' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5836:1: ( ( 'ordered' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5837:1: ( 'ordered' )
            {
             before(grammarAccess.getSetOrderedAccess().getIsOrderedOrderedKeyword_3_0_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5838:1: ( 'ordered' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5839:1: 'ordered'
            {
             before(grammarAccess.getSetOrderedAccess().getIsOrderedOrderedKeyword_3_0_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__SetOrdered__IsOrderedAssignment_3_012001); 
             after(grammarAccess.getSetOrderedAccess().getIsOrderedOrderedKeyword_3_0_0()); 

            }

             after(grammarAccess.getSetOrderedAccess().getIsOrderedOrderedKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetOrdered__IsOrderedAssignment_3_0"


    // $ANTLR start "rule__SetUnique__OwningClassNameAssignment_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5854:1: rule__SetUnique__OwningClassNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SetUnique__OwningClassNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5858:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5859:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5859:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5860:1: RULE_ID
            {
             before(grammarAccess.getSetUniqueAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetUnique__OwningClassNameAssignment_012040); 
             after(grammarAccess.getSetUniqueAccess().getOwningClassNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__OwningClassNameAssignment_0"


    // $ANTLR start "rule__SetUnique__NameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5869:1: rule__SetUnique__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SetUnique__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5873:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5874:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5874:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5875:1: RULE_ID
            {
             before(grammarAccess.getSetUniqueAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SetUnique__NameAssignment_212071); 
             after(grammarAccess.getSetUniqueAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__NameAssignment_2"


    // $ANTLR start "rule__SetUnique__IsUniqueAssignment_3_0"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5884:1: rule__SetUnique__IsUniqueAssignment_3_0 : ( ( 'unique' ) ) ;
    public final void rule__SetUnique__IsUniqueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5888:1: ( ( ( 'unique' ) ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5889:1: ( ( 'unique' ) )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5889:1: ( ( 'unique' ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5890:1: ( 'unique' )
            {
             before(grammarAccess.getSetUniqueAccess().getIsUniqueUniqueKeyword_3_0_0()); 
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5891:1: ( 'unique' )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5892:1: 'unique'
            {
             before(grammarAccess.getSetUniqueAccess().getIsUniqueUniqueKeyword_3_0_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__SetUnique__IsUniqueAssignment_3_012107); 
             after(grammarAccess.getSetUniqueAccess().getIsUniqueUniqueKeyword_3_0_0()); 

            }

             after(grammarAccess.getSetUniqueAccess().getIsUniqueUniqueKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetUnique__IsUniqueAssignment_3_0"


    // $ANTLR start "rule__CopyProperty__TypeAssignment_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5907:1: rule__CopyProperty__TypeAssignment_1 : ( ruleMergeType ) ;
    public final void rule__CopyProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5911:1: ( ( ruleMergeType ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5912:1: ( ruleMergeType )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5912:1: ( ruleMergeType )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5913:1: ruleMergeType
            {
             before(grammarAccess.getCopyPropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergeType_in_rule__CopyProperty__TypeAssignment_112146);
            ruleMergeType();

            state._fsp--;

             after(grammarAccess.getCopyPropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__TypeAssignment_1"


    // $ANTLR start "rule__CopyProperty__OwningClassNameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5922:1: rule__CopyProperty__OwningClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CopyProperty__OwningClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5926:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5927:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5927:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5928:1: RULE_ID
            {
             before(grammarAccess.getCopyPropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CopyProperty__OwningClassNameAssignment_212177); 
             after(grammarAccess.getCopyPropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__OwningClassNameAssignment_2"


    // $ANTLR start "rule__CopyProperty__NameAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5937:1: rule__CopyProperty__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__CopyProperty__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5941:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5942:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5942:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5943:1: RULE_ID
            {
             before(grammarAccess.getCopyPropertyAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CopyProperty__NameAssignment_412208); 
             after(grammarAccess.getCopyPropertyAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__NameAssignment_4"


    // $ANTLR start "rule__CopyProperty__TargetClassNameAssignment_6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5952:1: rule__CopyProperty__TargetClassNameAssignment_6 : ( RULE_ID ) ;
    public final void rule__CopyProperty__TargetClassNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5956:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5957:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5957:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5958:1: RULE_ID
            {
             before(grammarAccess.getCopyPropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CopyProperty__TargetClassNameAssignment_612239); 
             after(grammarAccess.getCopyPropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CopyProperty__TargetClassNameAssignment_6"


    // $ANTLR start "rule__MoveProperty__TypeAssignment_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5967:1: rule__MoveProperty__TypeAssignment_1 : ( ruleMergeType ) ;
    public final void rule__MoveProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5971:1: ( ( ruleMergeType ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5972:1: ( ruleMergeType )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5972:1: ( ruleMergeType )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5973:1: ruleMergeType
            {
             before(grammarAccess.getMovePropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMergeType_in_rule__MoveProperty__TypeAssignment_112270);
            ruleMergeType();

            state._fsp--;

             after(grammarAccess.getMovePropertyAccess().getTypeMergeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__TypeAssignment_1"


    // $ANTLR start "rule__MoveProperty__OwningClassNameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5982:1: rule__MoveProperty__OwningClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MoveProperty__OwningClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5986:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5987:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5987:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5988:1: RULE_ID
            {
             before(grammarAccess.getMovePropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveProperty__OwningClassNameAssignment_212301); 
             after(grammarAccess.getMovePropertyAccess().getOwningClassNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__OwningClassNameAssignment_2"


    // $ANTLR start "rule__MoveProperty__NameAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:5997:1: rule__MoveProperty__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MoveProperty__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6001:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6002:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6002:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6003:1: RULE_ID
            {
             before(grammarAccess.getMovePropertyAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveProperty__NameAssignment_412332); 
             after(grammarAccess.getMovePropertyAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__NameAssignment_4"


    // $ANTLR start "rule__MoveProperty__TargetClassNameAssignment_6"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6012:1: rule__MoveProperty__TargetClassNameAssignment_6 : ( RULE_ID ) ;
    public final void rule__MoveProperty__TargetClassNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6016:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6017:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6017:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6018:1: RULE_ID
            {
             before(grammarAccess.getMovePropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MoveProperty__TargetClassNameAssignment_612363); 
             after(grammarAccess.getMovePropertyAccess().getTargetClassNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveProperty__TargetClassNameAssignment_6"


    // $ANTLR start "rule__ExtractClass__SourceClassNameAssignment_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6027:1: rule__ExtractClass__SourceClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExtractClass__SourceClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6031:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6032:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6032:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6033:1: RULE_ID
            {
             before(grammarAccess.getExtractClassAccess().getSourceClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractClass__SourceClassNameAssignment_112394); 
             after(grammarAccess.getExtractClassAccess().getSourceClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__SourceClassNameAssignment_1"


    // $ANTLR start "rule__ExtractClass__ExtractPropertiesNamesAssignment_4"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6042:1: rule__ExtractClass__ExtractPropertiesNamesAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExtractClass__ExtractPropertiesNamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6046:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6047:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6047:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6048:1: RULE_ID
            {
             before(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractPropertiesNamesAssignment_412425); 
             after(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__ExtractPropertiesNamesAssignment_4"


    // $ANTLR start "rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6057:1: rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6061:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6062:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6062:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6063:1: RULE_ID
            {
             before(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractPropertiesNamesAssignment_5_112456); 
             after(grammarAccess.getExtractClassAccess().getExtractPropertiesNamesIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1"


    // $ANTLR start "rule__ExtractClass__ExtractClassNameAssignment_8"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6072:1: rule__ExtractClass__ExtractClassNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__ExtractClass__ExtractClassNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6076:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6077:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6077:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6078:1: RULE_ID
            {
             before(grammarAccess.getExtractClassAccess().getExtractClassNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractClassNameAssignment_812487); 
             after(grammarAccess.getExtractClassAccess().getExtractClassNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractClass__ExtractClassNameAssignment_8"


    // $ANTLR start "rule__ExtractParent__SourceClassesNameAssignment_2"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6087:1: rule__ExtractParent__SourceClassesNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExtractParent__SourceClassesNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6091:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6092:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6092:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6093:1: RULE_ID
            {
             before(grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractParent__SourceClassesNameAssignment_212518); 
             after(grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__SourceClassesNameAssignment_2"


    // $ANTLR start "rule__ExtractParent__SourceClassesNameAssignment_3_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6102:1: rule__ExtractParent__SourceClassesNameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__ExtractParent__SourceClassesNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6106:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6107:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6107:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6108:1: RULE_ID
            {
             before(grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractParent__SourceClassesNameAssignment_3_112549); 
             after(grammarAccess.getExtractParentAccess().getSourceClassesNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__SourceClassesNameAssignment_3_1"


    // $ANTLR start "rule__ExtractParent__ExtractPropertiesNameAssignment_7"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6117:1: rule__ExtractParent__ExtractPropertiesNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__ExtractParent__ExtractPropertiesNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6121:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6122:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6122:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6123:1: RULE_ID
            {
             before(grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractPropertiesNameAssignment_712580); 
             after(grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__ExtractPropertiesNameAssignment_7"


    // $ANTLR start "rule__ExtractParent__ExtractPropertiesNameAssignment_8_1"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6132:1: rule__ExtractParent__ExtractPropertiesNameAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__ExtractParent__ExtractPropertiesNameAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6136:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6137:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6137:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6138:1: RULE_ID
            {
             before(grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractPropertiesNameAssignment_8_112611); 
             after(grammarAccess.getExtractParentAccess().getExtractPropertiesNameIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__ExtractPropertiesNameAssignment_8_1"


    // $ANTLR start "rule__ExtractParent__ExtractParentNameAssignment_11"
    // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6147:1: rule__ExtractParent__ExtractParentNameAssignment_11 : ( RULE_ID ) ;
    public final void rule__ExtractParent__ExtractParentNameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6151:1: ( ( RULE_ID ) )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6152:1: ( RULE_ID )
            {
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6152:1: ( RULE_ID )
            // ../migdb.dsl.ops.ui/src-gen/migdb/dsl/ops/ui/contentassist/antlr/internal/InternalOps.g:6153:1: RULE_ID
            {
             before(grammarAccess.getExtractParentAccess().getExtractParentNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractParentNameAssignment_1112642); 
             after(grammarAccess.getExtractParentAccess().getExtractParentNameIDTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtractParent__ExtractParentNameAssignment_11"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\26\uffff";
    static final String DFA3_eofS =
        "\14\uffff\1\24\11\uffff";
    static final String DFA3_minS =
        "\1\4\1\13\6\uffff\1\4\1\uffff\1\26\1\uffff\1\4\11\uffff";
    static final String DFA3_maxS =
        "\1\50\1\53\6\uffff\1\4\1\uffff\1\53\1\uffff\1\56\11\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\7\1\20\1\21\1\10\1\12\1\6\1\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\1\1\3\1\2\1\13\1\14\1\16\1\11\1\15\1\17";
    static final String DFA3_specialS =
        "\26\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\32\uffff\1\2\7\uffff\1\3\1\4",
            "\1\13\1\7\14\uffff\1\12\3\uffff\1\11\1\13\1\uffff\1\5\4\uffff"+
            "\1\10\1\6\4\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "\3\16\1\uffff\1\15\1\17\1\16\16\uffff\1\16",
            "",
            "\1\24\10\uffff\1\22\1\25\1\21\15\uffff\1\23\1\uffff\1\24\1"+
            "\uffff\1\20\1\24\4\uffff\3\24\2\uffff\1\22\1\25\1\21",
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
            return "813:1: rule__AtomicOperation__Alternatives : ( ( ruleAddPrimitiveClass ) | ( ruleAddEmbeddedClass ) | ( ruleAddStandardClass ) | ( ruleRenameEntity ) | ( ruleSetParent ) | ( ruleSetAbstract ) | ( ruleRemoveEntity ) | ( ruleAddProperty ) | ( ruleRenameProperty ) | ( ruleRemoveProperty ) | ( ruleSetType ) | ( ruleSetOpposite ) | ( ruleSetBounds ) | ( ruleSetOrdered ) | ( ruleSetUnique ) | ( ruleCopyProperty ) | ( ruleMoveProperty ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModelRoot_in_entryRuleModelRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperations_in_ruleModelRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperations_in_entryRuleOperations120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperations127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operations__OperationsAssignment_in_ruleOperations153 = new BitSet(new long[]{0x0000038080000012L});
        public static final BitSet FOLLOW_ruleModelOperation_in_entryRuleModelOperation181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelOperation188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelOperation__Alternatives_in_ruleModelOperation214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicOperation_in_entryRuleAtomicOperation241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicOperation248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicOperation__Alternatives_in_ruleAtomicOperation274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposableOperation_in_entryRuleDecomposableOperation301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecomposableOperation308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DecomposableOperation__Alternatives_in_ruleDecomposableOperation334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddPrimitiveClass_in_entryRuleAddPrimitiveClass361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddPrimitiveClass368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__0_in_ruleAddPrimitiveClass394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddEmbeddedClass_in_entryRuleAddEmbeddedClass421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddEmbeddedClass428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__0_in_ruleAddEmbeddedClass454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddStandardClass_in_entryRuleAddStandardClass481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddStandardClass488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__0_in_ruleAddStandardClass514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameEntity_in_entryRuleRenameEntity541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameEntity548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__0_in_ruleRenameEntity574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetParent_in_entryRuleSetParent601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetParent608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group__0_in_ruleSetParent634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetAbstract_in_entryRuleSetAbstract661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetAbstract668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__Group__0_in_ruleSetAbstract694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveEntity_in_entryRuleRemoveEntity721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRemoveEntity728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveEntity__Group__0_in_ruleRemoveEntity754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__0_in_ruleAddProperty814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameProperty_in_entryRuleRenameProperty841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRenameProperty848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__0_in_ruleRenameProperty874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveProperty_in_entryRuleRemoveProperty901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRemoveProperty908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__0_in_ruleRemoveProperty934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetType_in_entryRuleSetType961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetType968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__0_in_ruleSetType994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOpposite_in_entryRuleSetOpposite1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetOpposite1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__0_in_ruleSetOpposite1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetBounds_in_entryRuleSetBounds1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetBounds1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__0_in_ruleSetBounds1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOrdered_in_entryRuleSetOrdered1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetOrdered1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__0_in_ruleSetOrdered1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetUnique_in_entryRuleSetUnique1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetUnique1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__0_in_ruleSetUnique1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopyProperty_in_entryRuleCopyProperty1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCopyProperty1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__0_in_ruleCopyProperty1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveProperty_in_entryRuleMoveProperty1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMoveProperty1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__0_in_ruleMoveProperty1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractClass_in_entryRuleExtractClass1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractClass1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__0_in_ruleExtractClass1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractParent_in_entryRuleExtractParent1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtractParent1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__0_in_ruleExtractParent1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MergeType__Alternatives_in_ruleMergeType1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InheritanceType__Alternatives_in_ruleInheritanceType1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicOperation_in_rule__ModelOperation__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposableOperation_in_rule__ModelOperation__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddPrimitiveClass_in_rule__AtomicOperation__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddEmbeddedClass_in_rule__AtomicOperation__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddStandardClass_in_rule__AtomicOperation__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameEntity_in_rule__AtomicOperation__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetParent_in_rule__AtomicOperation__Alternatives1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetAbstract_in_rule__AtomicOperation__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveEntity_in_rule__AtomicOperation__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddProperty_in_rule__AtomicOperation__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRenameProperty_in_rule__AtomicOperation__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRemoveProperty_in_rule__AtomicOperation__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetType_in_rule__AtomicOperation__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOpposite_in_rule__AtomicOperation__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetBounds_in_rule__AtomicOperation__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetOrdered_in_rule__AtomicOperation__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetUnique_in_rule__AtomicOperation__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCopyProperty_in_rule__AtomicOperation__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMoveProperty_in_rule__AtomicOperation__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractClass_in_rule__DecomposableOperation__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtractParent_in_rule__DecomposableOperation__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group_1_0__0_in_rule__SetParent__Alternatives_12022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__SetParent__Alternatives_12041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__IsAbstractAssignment_1_0_in_rule__SetAbstract__Alternatives_12075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SetAbstract__Alternatives_12094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AddProperty__Alternatives_2_02129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__IsOrderedAssignment_2_0_1_in_rule__AddProperty__Alternatives_2_02148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AddProperty__Alternatives_2_12182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__IsUniqueAssignment_2_1_1_in_rule__AddProperty__Alternatives_2_12201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UpperBoundAssignment_6_1_0_in_rule__AddProperty__Alternatives_6_12234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__0_in_rule__AddProperty__Alternatives_6_12252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__IsOppositeAssignment_3_0_in_rule__SetOpposite__Alternatives_32285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SetOpposite__Alternatives_32304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__UpperBoundAssignment_3_1_0_in_rule__SetBounds__Alternatives_3_12338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__0_in_rule__SetBounds__Alternatives_3_12356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__IsOrderedAssignment_3_0_in_rule__SetOrdered__Alternatives_32389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SetOrdered__Alternatives_32408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__IsUniqueAssignment_3_0_in_rule__SetUnique__Alternatives_32442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SetUnique__Alternatives_32461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MergeType__Alternatives2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MergeType__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MergeType__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PrimitiveType__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PrimitiveType__Alternatives2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PrimitiveType__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InheritanceType__Alternatives2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InheritanceType__Alternatives2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__InheritanceType__Alternatives2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__0__Impl_in_rule__AddPrimitiveClass__Group__02728 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__1_in_rule__AddPrimitiveClass__Group__02731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__NameAssignment_0_in_rule__AddPrimitiveClass__Group__0__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__1__Impl_in_rule__AddPrimitiveClass__Group__12788 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__2_in_rule__AddPrimitiveClass__Group__12791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AddPrimitiveClass__Group__1__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__2__Impl_in_rule__AddPrimitiveClass__Group__22850 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__3_in_rule__AddPrimitiveClass__Group__22853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AddPrimitiveClass__Group__2__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__Group__3__Impl_in_rule__AddPrimitiveClass__Group__32912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddPrimitiveClass__PrimitiveTypeAssignment_3_in_rule__AddPrimitiveClass__Group__3__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__0__Impl_in_rule__AddEmbeddedClass__Group__02977 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__1_in_rule__AddEmbeddedClass__Group__02980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__NameAssignment_0_in_rule__AddEmbeddedClass__Group__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__1__Impl_in_rule__AddEmbeddedClass__Group__13037 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__2_in_rule__AddEmbeddedClass__Group__13040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AddEmbeddedClass__Group__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddEmbeddedClass__Group__2__Impl_in_rule__AddEmbeddedClass__Group__23099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AddEmbeddedClass__Group__2__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__0__Impl_in_rule__AddStandardClass__Group__03164 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__1_in_rule__AddStandardClass__Group__03167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__NameAssignment_0_in_rule__AddStandardClass__Group__0__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__1__Impl_in_rule__AddStandardClass__Group__13224 = new BitSet(new long[]{0x0000080011C00000L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__2_in_rule__AddStandardClass__Group__13227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AddStandardClass__Group__1__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__2__Impl_in_rule__AddStandardClass__Group__23286 = new BitSet(new long[]{0x0000080011C00000L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__3_in_rule__AddStandardClass__Group__23289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__UnorderedGroup_2_in_rule__AddStandardClass__Group__2__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__Group__3__Impl_in_rule__AddStandardClass__Group__33347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AddStandardClass__Group__3__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__0__Impl_in_rule__RenameEntity__Group__03414 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__1_in_rule__RenameEntity__Group__03417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__NameAssignment_0_in_rule__RenameEntity__Group__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__1__Impl_in_rule__RenameEntity__Group__13474 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__2_in_rule__RenameEntity__Group__13477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RenameEntity__Group__1__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__Group__2__Impl_in_rule__RenameEntity__Group__23536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameEntity__NewNameAssignment_2_in_rule__RenameEntity__Group__2__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group__0__Impl_in_rule__SetParent__Group__03599 = new BitSet(new long[]{0x0000000040000800L});
        public static final BitSet FOLLOW_rule__SetParent__Group__1_in_rule__SetParent__Group__03602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__NameAssignment_0_in_rule__SetParent__Group__0__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group__1__Impl_in_rule__SetParent__Group__13659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Alternatives_1_in_rule__SetParent__Group__1__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group_1_0__0__Impl_in_rule__SetParent__Group_1_0__03720 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetParent__Group_1_0__1_in_rule__SetParent__Group_1_0__03723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SetParent__Group_1_0__0__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__Group_1_0__1__Impl_in_rule__SetParent__Group_1_0__13782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetParent__ParentNameAssignment_1_0_1_in_rule__SetParent__Group_1_0__1__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__Group__0__Impl_in_rule__SetAbstract__Group__03843 = new BitSet(new long[]{0x0000080000001000L});
        public static final BitSet FOLLOW_rule__SetAbstract__Group__1_in_rule__SetAbstract__Group__03846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__NameAssignment_0_in_rule__SetAbstract__Group__0__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__Group__1__Impl_in_rule__SetAbstract__Group__13903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetAbstract__Alternatives_1_in_rule__SetAbstract__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveEntity__Group__0__Impl_in_rule__RemoveEntity__Group__03964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RemoveEntity__Group__1_in_rule__RemoveEntity__Group__03967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RemoveEntity__Group__0__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveEntity__Group__1__Impl_in_rule__RemoveEntity__Group__14026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveEntity__NameAssignment_1_in_rule__RemoveEntity__Group__1__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__0__Impl_in_rule__AddProperty__Group__04087 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__1_in_rule__AddProperty__Group__04090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__OwningClassNameAssignment_0_in_rule__AddProperty__Group__0__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__1__Impl_in_rule__AddProperty__Group__14147 = new BitSet(new long[]{0x0000300000006000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__2_in_rule__AddProperty__Group__14150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AddProperty__Group__1__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__2__Impl_in_rule__AddProperty__Group__24209 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__3_in_rule__AddProperty__Group__24212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UnorderedGroup_2_in_rule__AddProperty__Group__2__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__3__Impl_in_rule__AddProperty__Group__34269 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__4_in_rule__AddProperty__Group__34272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__NameAssignment_3_in_rule__AddProperty__Group__3__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__4__Impl_in_rule__AddProperty__Group__44329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__5_in_rule__AddProperty__Group__44332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AddProperty__Group__4__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__5__Impl_in_rule__AddProperty__Group__54391 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__6_in_rule__AddProperty__Group__54394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__TypeAssignment_5_in_rule__AddProperty__Group__5__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__6__Impl_in_rule__AddProperty__Group__64451 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__7_in_rule__AddProperty__Group__64454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__0_in_rule__AddProperty__Group__6__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group__7__Impl_in_rule__AddProperty__Group__74512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_7__0_in_rule__AddProperty__Group__7__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__0__Impl_in_rule__AddProperty__Group_6__04586 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__1_in_rule__AddProperty__Group_6__04589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AddProperty__Group_6__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__1__Impl_in_rule__AddProperty__Group_6__14648 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__2_in_rule__AddProperty__Group_6__14651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Alternatives_6_1_in_rule__AddProperty__Group_6__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6__2__Impl_in_rule__AddProperty__Group_6__24708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AddProperty__Group_6__2__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__0__Impl_in_rule__AddProperty__Group_6_1_1__04773 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__1_in_rule__AddProperty__Group_6_1_1__04776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__LowerBoundAssignment_6_1_1_0_in_rule__AddProperty__Group_6_1_1__0__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__1__Impl_in_rule__AddProperty__Group_6_1_1__14833 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__2_in_rule__AddProperty__Group_6_1_1__14836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AddProperty__Group_6_1_1__1__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_6_1_1__2__Impl_in_rule__AddProperty__Group_6_1_1__24895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UpperBoundAssignment_6_1_1_2_in_rule__AddProperty__Group_6_1_1__2__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_7__0__Impl_in_rule__AddProperty__Group_7__04959 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_7__1_in_rule__AddProperty__Group_7__04962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AddProperty__Group_7__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Group_7__1__Impl_in_rule__AddProperty__Group_7__15021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__DefaultValueAssignment_7_1_in_rule__AddProperty__Group_7__1__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__0__Impl_in_rule__RenameProperty__Group__05082 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__1_in_rule__RenameProperty__Group__05085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__OwningClassNameAssignment_0_in_rule__RenameProperty__Group__0__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__1__Impl_in_rule__RenameProperty__Group__15142 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__2_in_rule__RenameProperty__Group__15145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__RenameProperty__Group__1__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__2__Impl_in_rule__RenameProperty__Group__25204 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__3_in_rule__RenameProperty__Group__25207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__NameAssignment_2_in_rule__RenameProperty__Group__2__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__3__Impl_in_rule__RenameProperty__Group__35264 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__4_in_rule__RenameProperty__Group__35267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RenameProperty__Group__3__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__Group__4__Impl_in_rule__RenameProperty__Group__45326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RenameProperty__NewNameAssignment_4_in_rule__RenameProperty__Group__4__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__0__Impl_in_rule__RemoveProperty__Group__05393 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__1_in_rule__RemoveProperty__Group__05396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__OwningClassNameAssignment_0_in_rule__RemoveProperty__Group__0__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__1__Impl_in_rule__RemoveProperty__Group__15453 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__2_in_rule__RemoveProperty__Group__15456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__RemoveProperty__Group__1__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__Group__2__Impl_in_rule__RemoveProperty__Group__25515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RemoveProperty__NameAssignment_2_in_rule__RemoveProperty__Group__2__Impl5542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__0__Impl_in_rule__SetType__Group__05578 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetType__Group__1_in_rule__SetType__Group__05581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__OwningClassNameAssignment_0_in_rule__SetType__Group__0__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__1__Impl_in_rule__SetType__Group__15638 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetType__Group__2_in_rule__SetType__Group__15641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetType__Group__1__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__2__Impl_in_rule__SetType__Group__25700 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__SetType__Group__3_in_rule__SetType__Group__25703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__NameAssignment_2_in_rule__SetType__Group__2__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__3__Impl_in_rule__SetType__Group__35760 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetType__Group__4_in_rule__SetType__Group__35763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SetType__Group__3__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__Group__4__Impl_in_rule__SetType__Group__45822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetType__TypeAssignment_4_in_rule__SetType__Group__4__Impl5849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__0__Impl_in_rule__SetOpposite__Group__05889 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__1_in_rule__SetOpposite__Group__05892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__FirstClassNameAssignment_0_in_rule__SetOpposite__Group__0__Impl5919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__1__Impl_in_rule__SetOpposite__Group__15949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__2_in_rule__SetOpposite__Group__15952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetOpposite__Group__1__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__2__Impl_in_rule__SetOpposite__Group__26011 = new BitSet(new long[]{0x0000400000008000L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__3_in_rule__SetOpposite__Group__26014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__FirstPropertyNameAssignment_2_in_rule__SetOpposite__Group__2__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__3__Impl_in_rule__SetOpposite__Group__36071 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__4_in_rule__SetOpposite__Group__36074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Alternatives_3_in_rule__SetOpposite__Group__3__Impl6101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__4__Impl_in_rule__SetOpposite__Group__46131 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__5_in_rule__SetOpposite__Group__46134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__SecondClassNameAssignment_4_in_rule__SetOpposite__Group__4__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__5__Impl_in_rule__SetOpposite__Group__56191 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__6_in_rule__SetOpposite__Group__56194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetOpposite__Group__5__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__Group__6__Impl_in_rule__SetOpposite__Group__66253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOpposite__SecondPropertyNameAssignment_6_in_rule__SetOpposite__Group__6__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__0__Impl_in_rule__SetBounds__Group__06324 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__1_in_rule__SetBounds__Group__06327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__OwningClassNameAssignment_0_in_rule__SetBounds__Group__0__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__1__Impl_in_rule__SetBounds__Group__16384 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__2_in_rule__SetBounds__Group__16387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetBounds__Group__1__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__2__Impl_in_rule__SetBounds__Group__26446 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__3_in_rule__SetBounds__Group__26449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__NameAssignment_2_in_rule__SetBounds__Group__2__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group__3__Impl_in_rule__SetBounds__Group__36506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__0_in_rule__SetBounds__Group__3__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__0__Impl_in_rule__SetBounds__Group_3__06572 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__1_in_rule__SetBounds__Group_3__06575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SetBounds__Group_3__0__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__1__Impl_in_rule__SetBounds__Group_3__16634 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__2_in_rule__SetBounds__Group_3__16637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Alternatives_3_1_in_rule__SetBounds__Group_3__1__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3__2__Impl_in_rule__SetBounds__Group_3__26694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SetBounds__Group_3__2__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__0__Impl_in_rule__SetBounds__Group_3_1_1__06759 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__1_in_rule__SetBounds__Group_3_1_1__06762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__LowerBoundAssignment_3_1_1_0_in_rule__SetBounds__Group_3_1_1__0__Impl6789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__1__Impl_in_rule__SetBounds__Group_3_1_1__16819 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__2_in_rule__SetBounds__Group_3_1_1__16822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SetBounds__Group_3_1_1__1__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__Group_3_1_1__2__Impl_in_rule__SetBounds__Group_3_1_1__26881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetBounds__UpperBoundAssignment_3_1_1_2_in_rule__SetBounds__Group_3_1_1__2__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__0__Impl_in_rule__SetOrdered__Group__06945 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__1_in_rule__SetOrdered__Group__06948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__OwningClassNameAssignment_0_in_rule__SetOrdered__Group__0__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__1__Impl_in_rule__SetOrdered__Group__17005 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__2_in_rule__SetOrdered__Group__17008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetOrdered__Group__1__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__2__Impl_in_rule__SetOrdered__Group__27067 = new BitSet(new long[]{0x0000100000002000L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__3_in_rule__SetOrdered__Group__27070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__NameAssignment_2_in_rule__SetOrdered__Group__2__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Group__3__Impl_in_rule__SetOrdered__Group__37127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetOrdered__Alternatives_3_in_rule__SetOrdered__Group__3__Impl7154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__0__Impl_in_rule__SetUnique__Group__07192 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__1_in_rule__SetUnique__Group__07195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__OwningClassNameAssignment_0_in_rule__SetUnique__Group__0__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__1__Impl_in_rule__SetUnique__Group__17252 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__2_in_rule__SetUnique__Group__17255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SetUnique__Group__1__Impl7283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__2__Impl_in_rule__SetUnique__Group__27314 = new BitSet(new long[]{0x0000200000004000L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__3_in_rule__SetUnique__Group__27317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__NameAssignment_2_in_rule__SetUnique__Group__2__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Group__3__Impl_in_rule__SetUnique__Group__37374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SetUnique__Alternatives_3_in_rule__SetUnique__Group__3__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__0__Impl_in_rule__CopyProperty__Group__07439 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__1_in_rule__CopyProperty__Group__07442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__CopyProperty__Group__0__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__1__Impl_in_rule__CopyProperty__Group__17501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__2_in_rule__CopyProperty__Group__17504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__TypeAssignment_1_in_rule__CopyProperty__Group__1__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__2__Impl_in_rule__CopyProperty__Group__27561 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__3_in_rule__CopyProperty__Group__27564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__OwningClassNameAssignment_2_in_rule__CopyProperty__Group__2__Impl7591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__3__Impl_in_rule__CopyProperty__Group__37621 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__4_in_rule__CopyProperty__Group__37624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__CopyProperty__Group__3__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__4__Impl_in_rule__CopyProperty__Group__47683 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__5_in_rule__CopyProperty__Group__47686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__NameAssignment_4_in_rule__CopyProperty__Group__4__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__5__Impl_in_rule__CopyProperty__Group__57743 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__6_in_rule__CopyProperty__Group__57746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CopyProperty__Group__5__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__Group__6__Impl_in_rule__CopyProperty__Group__67805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CopyProperty__TargetClassNameAssignment_6_in_rule__CopyProperty__Group__6__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__0__Impl_in_rule__MoveProperty__Group__07876 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__1_in_rule__MoveProperty__Group__07879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MoveProperty__Group__0__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__1__Impl_in_rule__MoveProperty__Group__17938 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__2_in_rule__MoveProperty__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__TypeAssignment_1_in_rule__MoveProperty__Group__1__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__2__Impl_in_rule__MoveProperty__Group__27998 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__3_in_rule__MoveProperty__Group__28001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__OwningClassNameAssignment_2_in_rule__MoveProperty__Group__2__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__3__Impl_in_rule__MoveProperty__Group__38058 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__4_in_rule__MoveProperty__Group__38061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MoveProperty__Group__3__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__4__Impl_in_rule__MoveProperty__Group__48120 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__5_in_rule__MoveProperty__Group__48123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__NameAssignment_4_in_rule__MoveProperty__Group__4__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__5__Impl_in_rule__MoveProperty__Group__58180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__6_in_rule__MoveProperty__Group__58183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MoveProperty__Group__5__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__Group__6__Impl_in_rule__MoveProperty__Group__68242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MoveProperty__TargetClassNameAssignment_6_in_rule__MoveProperty__Group__6__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__0__Impl_in_rule__ExtractClass__Group__08313 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__1_in_rule__ExtractClass__Group__08316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ExtractClass__Group__0__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__1__Impl_in_rule__ExtractClass__Group__18375 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__2_in_rule__ExtractClass__Group__18378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__SourceClassNameAssignment_1_in_rule__ExtractClass__Group__1__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__2__Impl_in_rule__ExtractClass__Group__28435 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__3_in_rule__ExtractClass__Group__28438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ExtractClass__Group__2__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__3__Impl_in_rule__ExtractClass__Group__38497 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__4_in_rule__ExtractClass__Group__38500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ExtractClass__Group__3__Impl8528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__4__Impl_in_rule__ExtractClass__Group__48559 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__5_in_rule__ExtractClass__Group__48562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__ExtractPropertiesNamesAssignment_4_in_rule__ExtractClass__Group__4__Impl8589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__5__Impl_in_rule__ExtractClass__Group__58619 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__6_in_rule__ExtractClass__Group__58622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group_5__0_in_rule__ExtractClass__Group__5__Impl8649 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__6__Impl_in_rule__ExtractClass__Group__68680 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__7_in_rule__ExtractClass__Group__68683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExtractClass__Group__6__Impl8711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__7__Impl_in_rule__ExtractClass__Group__78742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__8_in_rule__ExtractClass__Group__78745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ExtractClass__Group__7__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group__8__Impl_in_rule__ExtractClass__Group__88804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__ExtractClassNameAssignment_8_in_rule__ExtractClass__Group__8__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group_5__0__Impl_in_rule__ExtractClass__Group_5__08879 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group_5__1_in_rule__ExtractClass__Group_5__08882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ExtractClass__Group_5__0__Impl8910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__Group_5__1__Impl_in_rule__ExtractClass__Group_5__18941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractClass__ExtractPropertiesNamesAssignment_5_1_in_rule__ExtractClass__Group_5__1__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__0__Impl_in_rule__ExtractParent__Group__09002 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__1_in_rule__ExtractParent__Group__09005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ExtractParent__Group__0__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__1__Impl_in_rule__ExtractParent__Group__19064 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__2_in_rule__ExtractParent__Group__19067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ExtractParent__Group__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__2__Impl_in_rule__ExtractParent__Group__29126 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__3_in_rule__ExtractParent__Group__29129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__SourceClassesNameAssignment_2_in_rule__ExtractParent__Group__2__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__3__Impl_in_rule__ExtractParent__Group__39186 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__4_in_rule__ExtractParent__Group__39189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_3__0_in_rule__ExtractParent__Group__3__Impl9216 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__4__Impl_in_rule__ExtractParent__Group__49247 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__5_in_rule__ExtractParent__Group__49250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExtractParent__Group__4__Impl9278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__5__Impl_in_rule__ExtractParent__Group__59309 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__6_in_rule__ExtractParent__Group__59312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ExtractParent__Group__5__Impl9340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__6__Impl_in_rule__ExtractParent__Group__69371 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__7_in_rule__ExtractParent__Group__69374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ExtractParent__Group__6__Impl9402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__7__Impl_in_rule__ExtractParent__Group__79433 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__8_in_rule__ExtractParent__Group__79436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__ExtractPropertiesNameAssignment_7_in_rule__ExtractParent__Group__7__Impl9463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__8__Impl_in_rule__ExtractParent__Group__89493 = new BitSet(new long[]{0x0000040800000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__9_in_rule__ExtractParent__Group__89496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_8__0_in_rule__ExtractParent__Group__8__Impl9523 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__9__Impl_in_rule__ExtractParent__Group__99554 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__10_in_rule__ExtractParent__Group__99557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ExtractParent__Group__9__Impl9585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__10__Impl_in_rule__ExtractParent__Group__109616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__11_in_rule__ExtractParent__Group__109619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ExtractParent__Group__10__Impl9647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group__11__Impl_in_rule__ExtractParent__Group__119678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__ExtractParentNameAssignment_11_in_rule__ExtractParent__Group__11__Impl9705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_3__0__Impl_in_rule__ExtractParent__Group_3__09759 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_3__1_in_rule__ExtractParent__Group_3__09762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ExtractParent__Group_3__0__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_3__1__Impl_in_rule__ExtractParent__Group_3__19821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__SourceClassesNameAssignment_3_1_in_rule__ExtractParent__Group_3__1__Impl9848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_8__0__Impl_in_rule__ExtractParent__Group_8__09882 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_8__1_in_rule__ExtractParent__Group_8__09885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ExtractParent__Group_8__0__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__Group_8__1__Impl_in_rule__ExtractParent__Group_8__19944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtractParent__ExtractPropertiesNameAssignment_8_1_in_rule__ExtractParent__Group_8__1__Impl9971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__UnorderedGroup_2__0_in_rule__AddStandardClass__UnorderedGroup_210006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__IsAbstractAssignment_2_0_in_rule__AddStandardClass__UnorderedGroup_2__Impl10095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__InheritanceTypeAssignment_2_1_in_rule__AddStandardClass__UnorderedGroup_2__Impl10186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__UnorderedGroup_2__Impl_in_rule__AddStandardClass__UnorderedGroup_2__010245 = new BitSet(new long[]{0x0000080001C00002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__UnorderedGroup_2__1_in_rule__AddStandardClass__UnorderedGroup_2__010248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddStandardClass__UnorderedGroup_2__Impl_in_rule__AddStandardClass__UnorderedGroup_2__110273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UnorderedGroup_2__0_in_rule__AddProperty__UnorderedGroup_210301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Alternatives_2_0_in_rule__AddProperty__UnorderedGroup_2__Impl10388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__Alternatives_2_1_in_rule__AddProperty__UnorderedGroup_2__Impl10479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UnorderedGroup_2__Impl_in_rule__AddProperty__UnorderedGroup_2__010538 = new BitSet(new long[]{0x0000300000006002L});
        public static final BitSet FOLLOW_rule__AddProperty__UnorderedGroup_2__1_in_rule__AddProperty__UnorderedGroup_2__010541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddProperty__UnorderedGroup_2__Impl_in_rule__AddProperty__UnorderedGroup_2__110566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelOperation_in_rule__Operations__OperationsAssignment10598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddPrimitiveClass__NameAssignment_010629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_rule__AddPrimitiveClass__PrimitiveTypeAssignment_310660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddEmbeddedClass__NameAssignment_010691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddStandardClass__NameAssignment_010722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__AddStandardClass__IsAbstractAssignment_2_010758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInheritanceType_in_rule__AddStandardClass__InheritanceTypeAssignment_2_110797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameEntity__NameAssignment_010828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameEntity__NewNameAssignment_210859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetParent__NameAssignment_010890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetParent__ParentNameAssignment_1_0_110921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetAbstract__NameAssignment_010952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__SetAbstract__IsAbstractAssignment_1_010988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RemoveEntity__NameAssignment_111027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__OwningClassNameAssignment_011058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__AddProperty__IsOrderedAssignment_2_0_111094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__AddProperty__IsUniqueAssignment_2_1_111138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__NameAssignment_311177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__TypeAssignment_511208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AddProperty__UpperBoundAssignment_6_1_011239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AddProperty__LowerBoundAssignment_6_1_1_011270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AddProperty__UpperBoundAssignment_6_1_1_211301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AddProperty__DefaultValueAssignment_7_111332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameProperty__OwningClassNameAssignment_011363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameProperty__NameAssignment_211394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RenameProperty__NewNameAssignment_411425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RemoveProperty__OwningClassNameAssignment_011456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__RemoveProperty__NameAssignment_211487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetType__OwningClassNameAssignment_011518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetType__NameAssignment_211549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetType__TypeAssignment_411580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOpposite__FirstClassNameAssignment_011611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOpposite__FirstPropertyNameAssignment_211642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SetOpposite__IsOppositeAssignment_3_011678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOpposite__SecondClassNameAssignment_411717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOpposite__SecondPropertyNameAssignment_611748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetBounds__OwningClassNameAssignment_011779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetBounds__NameAssignment_211810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__SetBounds__UpperBoundAssignment_3_1_011841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__SetBounds__LowerBoundAssignment_3_1_1_011872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__SetBounds__UpperBoundAssignment_3_1_1_211903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOrdered__OwningClassNameAssignment_011934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetOrdered__NameAssignment_211965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__SetOrdered__IsOrderedAssignment_3_012001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetUnique__OwningClassNameAssignment_012040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SetUnique__NameAssignment_212071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__SetUnique__IsUniqueAssignment_3_012107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergeType_in_rule__CopyProperty__TypeAssignment_112146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CopyProperty__OwningClassNameAssignment_212177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CopyProperty__NameAssignment_412208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CopyProperty__TargetClassNameAssignment_612239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMergeType_in_rule__MoveProperty__TypeAssignment_112270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveProperty__OwningClassNameAssignment_212301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveProperty__NameAssignment_412332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MoveProperty__TargetClassNameAssignment_612363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractClass__SourceClassNameAssignment_112394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractPropertiesNamesAssignment_412425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractPropertiesNamesAssignment_5_112456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractClass__ExtractClassNameAssignment_812487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractParent__SourceClassesNameAssignment_212518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractParent__SourceClassesNameAssignment_3_112549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractPropertiesNameAssignment_712580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractPropertiesNameAssignment_8_112611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtractParent__ExtractParentNameAssignment_1112642 = new BitSet(new long[]{0x0000000000000002L});
    }


}