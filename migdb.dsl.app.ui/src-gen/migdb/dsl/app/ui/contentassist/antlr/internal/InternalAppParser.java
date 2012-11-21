package migdb.dsl.app.ui.contentassist.antlr.internal; 

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
import migdb.dsl.app.services.AppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'char'", "'int'", "'joined'", "'tablePerClass'", "'singleTable'", "'primitive'", "':'", "'embedded'", "'{'", "'id'", "'}'", "'class'", "'extends'", "'by'", "'EmbeddedProperty'", "'PrimitiveProperty'", "'['", "']'", "'..'", "'='", "'AssociationProperty'", "'oposite'", "'NestedProperty'", "'abstract'", "'mandatory'", "'ordered'", "'unique'"
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
    public String getGrammarFileName() { return "../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g"; }


     
     	private AppGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AppGrammarAccess grammarAccess) {
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
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:60:1: entryRuleModelRoot : ruleModelRoot EOF ;
    public final void entryRuleModelRoot() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:61:1: ( ruleModelRoot EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:62:1: ruleModelRoot EOF
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
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:69:1: ruleModelRoot : ( ruleStructure ) ;
    public final void ruleModelRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:73:2: ( ( ruleStructure ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:74:1: ( ruleStructure )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:74:1: ( ruleStructure )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:75:1: ruleStructure
            {
             before(grammarAccess.getModelRootAccess().getStructureParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_ruleModelRoot94);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getModelRootAccess().getStructureParserRuleCall()); 

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


    // $ANTLR start "entryRuleStructure"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:88:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:89:1: ( ruleStructure EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:90:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructure_in_entryRuleStructure120);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructure127); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:97:1: ruleStructure : ( ( rule__Structure__EntitiesAssignment )* ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:101:2: ( ( ( rule__Structure__EntitiesAssignment )* ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:102:1: ( ( rule__Structure__EntitiesAssignment )* )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:102:1: ( ( rule__Structure__EntitiesAssignment )* )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:103:1: ( rule__Structure__EntitiesAssignment )*
            {
             before(grammarAccess.getStructureAccess().getEntitiesAssignment()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:104:1: ( rule__Structure__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==19||LA1_0==23||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:104:2: rule__Structure__EntitiesAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Structure__EntitiesAssignment_in_ruleStructure153);
            	    rule__Structure__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getEntitiesAssignment()); 

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleModelEntity"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:116:1: entryRuleModelEntity : ruleModelEntity EOF ;
    public final void entryRuleModelEntity() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:117:1: ( ruleModelEntity EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:118:1: ruleModelEntity EOF
            {
             before(grammarAccess.getModelEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelEntity_in_entryRuleModelEntity181);
            ruleModelEntity();

            state._fsp--;

             after(grammarAccess.getModelEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModelEntity188); 

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
    // $ANTLR end "entryRuleModelEntity"


    // $ANTLR start "ruleModelEntity"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:125:1: ruleModelEntity : ( ( rule__ModelEntity__Alternatives ) ) ;
    public final void ruleModelEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:129:2: ( ( ( rule__ModelEntity__Alternatives ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:130:1: ( ( rule__ModelEntity__Alternatives ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:130:1: ( ( rule__ModelEntity__Alternatives ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:131:1: ( rule__ModelEntity__Alternatives )
            {
             before(grammarAccess.getModelEntityAccess().getAlternatives()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:132:1: ( rule__ModelEntity__Alternatives )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:132:2: rule__ModelEntity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModelEntity__Alternatives_in_ruleModelEntity214);
            rule__ModelEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelEntityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModelEntity"


    // $ANTLR start "entryRuleGeneralClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:144:1: entryRuleGeneralClass : ruleGeneralClass EOF ;
    public final void entryRuleGeneralClass() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:145:1: ( ruleGeneralClass EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:146:1: ruleGeneralClass EOF
            {
             before(grammarAccess.getGeneralClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralClass_in_entryRuleGeneralClass241);
            ruleGeneralClass();

            state._fsp--;

             after(grammarAccess.getGeneralClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralClass248); 

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
    // $ANTLR end "entryRuleGeneralClass"


    // $ANTLR start "ruleGeneralClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:153:1: ruleGeneralClass : ( ( rule__GeneralClass__Alternatives ) ) ;
    public final void ruleGeneralClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:157:2: ( ( ( rule__GeneralClass__Alternatives ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:158:1: ( ( rule__GeneralClass__Alternatives ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:158:1: ( ( rule__GeneralClass__Alternatives ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:159:1: ( rule__GeneralClass__Alternatives )
            {
             before(grammarAccess.getGeneralClassAccess().getAlternatives()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:160:1: ( rule__GeneralClass__Alternatives )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:160:2: rule__GeneralClass__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GeneralClass__Alternatives_in_ruleGeneralClass274);
            rule__GeneralClass__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeneralClassAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGeneralClass"


    // $ANTLR start "entryRulePrimitiveClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:172:1: entryRulePrimitiveClass : rulePrimitiveClass EOF ;
    public final void entryRulePrimitiveClass() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:173:1: ( rulePrimitiveClass EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:174:1: rulePrimitiveClass EOF
            {
             before(grammarAccess.getPrimitiveClassRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveClass_in_entryRulePrimitiveClass301);
            rulePrimitiveClass();

            state._fsp--;

             after(grammarAccess.getPrimitiveClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveClass308); 

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
    // $ANTLR end "entryRulePrimitiveClass"


    // $ANTLR start "rulePrimitiveClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:181:1: rulePrimitiveClass : ( ( rule__PrimitiveClass__Group__0 ) ) ;
    public final void rulePrimitiveClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:185:2: ( ( ( rule__PrimitiveClass__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:186:1: ( ( rule__PrimitiveClass__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:186:1: ( ( rule__PrimitiveClass__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:187:1: ( rule__PrimitiveClass__Group__0 )
            {
             before(grammarAccess.getPrimitiveClassAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:188:1: ( rule__PrimitiveClass__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:188:2: rule__PrimitiveClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__0_in_rulePrimitiveClass334);
            rule__PrimitiveClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveClassAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveClass"


    // $ANTLR start "entryRuleEmbeddedClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:200:1: entryRuleEmbeddedClass : ruleEmbeddedClass EOF ;
    public final void entryRuleEmbeddedClass() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:201:1: ( ruleEmbeddedClass EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:202:1: ruleEmbeddedClass EOF
            {
             before(grammarAccess.getEmbeddedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmbeddedClass_in_entryRuleEmbeddedClass361);
            ruleEmbeddedClass();

            state._fsp--;

             after(grammarAccess.getEmbeddedClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmbeddedClass368); 

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
    // $ANTLR end "entryRuleEmbeddedClass"


    // $ANTLR start "ruleEmbeddedClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:209:1: ruleEmbeddedClass : ( ( rule__EmbeddedClass__Group__0 ) ) ;
    public final void ruleEmbeddedClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:213:2: ( ( ( rule__EmbeddedClass__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:214:1: ( ( rule__EmbeddedClass__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:214:1: ( ( rule__EmbeddedClass__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:215:1: ( rule__EmbeddedClass__Group__0 )
            {
             before(grammarAccess.getEmbeddedClassAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:216:1: ( rule__EmbeddedClass__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:216:2: rule__EmbeddedClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__0_in_ruleEmbeddedClass394);
            rule__EmbeddedClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedClassAccess().getGroup()); 

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
    // $ANTLR end "ruleEmbeddedClass"


    // $ANTLR start "entryRuleStandardClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:228:1: entryRuleStandardClass : ruleStandardClass EOF ;
    public final void entryRuleStandardClass() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:229:1: ( ruleStandardClass EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:230:1: ruleStandardClass EOF
            {
             before(grammarAccess.getStandardClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStandardClass_in_entryRuleStandardClass421);
            ruleStandardClass();

            state._fsp--;

             after(grammarAccess.getStandardClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStandardClass428); 

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
    // $ANTLR end "entryRuleStandardClass"


    // $ANTLR start "ruleStandardClass"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:237:1: ruleStandardClass : ( ( rule__StandardClass__Group__0 ) ) ;
    public final void ruleStandardClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:241:2: ( ( ( rule__StandardClass__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:242:1: ( ( rule__StandardClass__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:242:1: ( ( rule__StandardClass__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:243:1: ( rule__StandardClass__Group__0 )
            {
             before(grammarAccess.getStandardClassAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:244:1: ( rule__StandardClass__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:244:2: rule__StandardClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__0_in_ruleStandardClass454);
            rule__StandardClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getGroup()); 

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
    // $ANTLR end "ruleStandardClass"


    // $ANTLR start "entryRuleMultipliableProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:258:1: entryRuleMultipliableProperty : ruleMultipliableProperty EOF ;
    public final void entryRuleMultipliableProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:259:1: ( ruleMultipliableProperty EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:260:1: ruleMultipliableProperty EOF
            {
             before(grammarAccess.getMultipliablePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_entryRuleMultipliableProperty483);
            ruleMultipliableProperty();

            state._fsp--;

             after(grammarAccess.getMultipliablePropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipliableProperty490); 

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
    // $ANTLR end "entryRuleMultipliableProperty"


    // $ANTLR start "ruleMultipliableProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:267:1: ruleMultipliableProperty : ( ( rule__MultipliableProperty__Alternatives ) ) ;
    public final void ruleMultipliableProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:271:2: ( ( ( rule__MultipliableProperty__Alternatives ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:272:1: ( ( rule__MultipliableProperty__Alternatives ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:272:1: ( ( rule__MultipliableProperty__Alternatives ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:273:1: ( rule__MultipliableProperty__Alternatives )
            {
             before(grammarAccess.getMultipliablePropertyAccess().getAlternatives()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:274:1: ( rule__MultipliableProperty__Alternatives )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:274:2: rule__MultipliableProperty__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipliableProperty__Alternatives_in_ruleMultipliableProperty516);
            rule__MultipliableProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipliablePropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultipliableProperty"


    // $ANTLR start "entryRuleEmbeddedProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:286:1: entryRuleEmbeddedProperty : ruleEmbeddedProperty EOF ;
    public final void entryRuleEmbeddedProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:287:1: ( ruleEmbeddedProperty EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:288:1: ruleEmbeddedProperty EOF
            {
             before(grammarAccess.getEmbeddedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEmbeddedProperty_in_entryRuleEmbeddedProperty543);
            ruleEmbeddedProperty();

            state._fsp--;

             after(grammarAccess.getEmbeddedPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmbeddedProperty550); 

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
    // $ANTLR end "entryRuleEmbeddedProperty"


    // $ANTLR start "ruleEmbeddedProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:295:1: ruleEmbeddedProperty : ( ( rule__EmbeddedProperty__Group__0 ) ) ;
    public final void ruleEmbeddedProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:299:2: ( ( ( rule__EmbeddedProperty__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:300:1: ( ( rule__EmbeddedProperty__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:300:1: ( ( rule__EmbeddedProperty__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:301:1: ( rule__EmbeddedProperty__Group__0 )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:302:1: ( rule__EmbeddedProperty__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:302:2: rule__EmbeddedProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__0_in_ruleEmbeddedProperty576);
            rule__EmbeddedProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleEmbeddedProperty"


    // $ANTLR start "entryRulePrimitiveProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:314:1: entryRulePrimitiveProperty : rulePrimitiveProperty EOF ;
    public final void entryRulePrimitiveProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:315:1: ( rulePrimitiveProperty EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:316:1: rulePrimitiveProperty EOF
            {
             before(grammarAccess.getPrimitivePropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveProperty_in_entryRulePrimitiveProperty603);
            rulePrimitiveProperty();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveProperty610); 

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
    // $ANTLR end "entryRulePrimitiveProperty"


    // $ANTLR start "rulePrimitiveProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:323:1: rulePrimitiveProperty : ( ( rule__PrimitiveProperty__Group__0 ) ) ;
    public final void rulePrimitiveProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:327:2: ( ( ( rule__PrimitiveProperty__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:328:1: ( ( rule__PrimitiveProperty__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:328:1: ( ( rule__PrimitiveProperty__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:329:1: ( rule__PrimitiveProperty__Group__0 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:330:1: ( rule__PrimitiveProperty__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:330:2: rule__PrimitiveProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__0_in_rulePrimitiveProperty636);
            rule__PrimitiveProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveProperty"


    // $ANTLR start "entryRuleAssociationProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:342:1: entryRuleAssociationProperty : ruleAssociationProperty EOF ;
    public final void entryRuleAssociationProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:343:1: ( ruleAssociationProperty EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:344:1: ruleAssociationProperty EOF
            {
             before(grammarAccess.getAssociationPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociationProperty_in_entryRuleAssociationProperty663);
            ruleAssociationProperty();

            state._fsp--;

             after(grammarAccess.getAssociationPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociationProperty670); 

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
    // $ANTLR end "entryRuleAssociationProperty"


    // $ANTLR start "ruleAssociationProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:351:1: ruleAssociationProperty : ( ( rule__AssociationProperty__Group__0 ) ) ;
    public final void ruleAssociationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:355:2: ( ( ( rule__AssociationProperty__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:356:1: ( ( rule__AssociationProperty__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:356:1: ( ( rule__AssociationProperty__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:357:1: ( rule__AssociationProperty__Group__0 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:358:1: ( rule__AssociationProperty__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:358:2: rule__AssociationProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__0_in_ruleAssociationProperty696);
            rule__AssociationProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociationProperty"


    // $ANTLR start "entryRuleNestedProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:370:1: entryRuleNestedProperty : ruleNestedProperty EOF ;
    public final void entryRuleNestedProperty() throws RecognitionException {
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:371:1: ( ruleNestedProperty EOF )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:372:1: ruleNestedProperty EOF
            {
             before(grammarAccess.getNestedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNestedProperty_in_entryRuleNestedProperty723);
            ruleNestedProperty();

            state._fsp--;

             after(grammarAccess.getNestedPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedProperty730); 

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
    // $ANTLR end "entryRuleNestedProperty"


    // $ANTLR start "ruleNestedProperty"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:379:1: ruleNestedProperty : ( ( rule__NestedProperty__Group__0 ) ) ;
    public final void ruleNestedProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:383:2: ( ( ( rule__NestedProperty__Group__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:384:1: ( ( rule__NestedProperty__Group__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:384:1: ( ( rule__NestedProperty__Group__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:385:1: ( rule__NestedProperty__Group__0 )
            {
             before(grammarAccess.getNestedPropertyAccess().getGroup()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:386:1: ( rule__NestedProperty__Group__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:386:2: rule__NestedProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__0_in_ruleNestedProperty756);
            rule__NestedProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleNestedProperty"


    // $ANTLR start "rulePrimitiveType"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:401:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:405:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:406:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:406:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:407:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:408:1: ( rule__PrimitiveType__Alternatives )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:408:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType795);
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
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:420:1: ruleInheritanceType : ( ( rule__InheritanceType__Alternatives ) ) ;
    public final void ruleInheritanceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:424:1: ( ( ( rule__InheritanceType__Alternatives ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:425:1: ( ( rule__InheritanceType__Alternatives ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:425:1: ( ( rule__InheritanceType__Alternatives ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:426:1: ( rule__InheritanceType__Alternatives )
            {
             before(grammarAccess.getInheritanceTypeAccess().getAlternatives()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:427:1: ( rule__InheritanceType__Alternatives )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:427:2: rule__InheritanceType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__InheritanceType__Alternatives_in_ruleInheritanceType831);
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


    // $ANTLR start "rule__ModelEntity__Alternatives"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:438:1: rule__ModelEntity__Alternatives : ( ( ruleGeneralClass ) | ( rulePrimitiveClass ) );
    public final void rule__ModelEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:442:1: ( ( ruleGeneralClass ) | ( rulePrimitiveClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19||LA2_0==23||LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:443:1: ( ruleGeneralClass )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:443:1: ( ruleGeneralClass )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:444:1: ruleGeneralClass
                    {
                     before(grammarAccess.getModelEntityAccess().getGeneralClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralClass_in_rule__ModelEntity__Alternatives866);
                    ruleGeneralClass();

                    state._fsp--;

                     after(grammarAccess.getModelEntityAccess().getGeneralClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:449:6: ( rulePrimitiveClass )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:449:6: ( rulePrimitiveClass )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:450:1: rulePrimitiveClass
                    {
                     before(grammarAccess.getModelEntityAccess().getPrimitiveClassParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveClass_in_rule__ModelEntity__Alternatives883);
                    rulePrimitiveClass();

                    state._fsp--;

                     after(grammarAccess.getModelEntityAccess().getPrimitiveClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelEntity__Alternatives"


    // $ANTLR start "rule__GeneralClass__Alternatives"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:460:1: rule__GeneralClass__Alternatives : ( ( ruleEmbeddedClass ) | ( ruleStandardClass ) );
    public final void rule__GeneralClass__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:464:1: ( ( ruleEmbeddedClass ) | ( ruleStandardClass ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==23||LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:465:1: ( ruleEmbeddedClass )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:465:1: ( ruleEmbeddedClass )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:466:1: ruleEmbeddedClass
                    {
                     before(grammarAccess.getGeneralClassAccess().getEmbeddedClassParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEmbeddedClass_in_rule__GeneralClass__Alternatives915);
                    ruleEmbeddedClass();

                    state._fsp--;

                     after(grammarAccess.getGeneralClassAccess().getEmbeddedClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:471:6: ( ruleStandardClass )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:471:6: ( ruleStandardClass )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:472:1: ruleStandardClass
                    {
                     before(grammarAccess.getGeneralClassAccess().getStandardClassParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStandardClass_in_rule__GeneralClass__Alternatives932);
                    ruleStandardClass();

                    state._fsp--;

                     after(grammarAccess.getGeneralClassAccess().getStandardClassParserRuleCall_1()); 

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
    // $ANTLR end "rule__GeneralClass__Alternatives"


    // $ANTLR start "rule__MultipliableProperty__Alternatives"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:483:1: rule__MultipliableProperty__Alternatives : ( ( ruleAssociationProperty ) | ( rulePrimitiveProperty ) | ( ruleNestedProperty ) );
    public final void rule__MultipliableProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:487:1: ( ( ruleAssociationProperty ) | ( rulePrimitiveProperty ) | ( ruleNestedProperty ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:488:1: ( ruleAssociationProperty )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:488:1: ( ruleAssociationProperty )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:489:1: ruleAssociationProperty
                    {
                     before(grammarAccess.getMultipliablePropertyAccess().getAssociationPropertyParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAssociationProperty_in_rule__MultipliableProperty__Alternatives965);
                    ruleAssociationProperty();

                    state._fsp--;

                     after(grammarAccess.getMultipliablePropertyAccess().getAssociationPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:494:6: ( rulePrimitiveProperty )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:494:6: ( rulePrimitiveProperty )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:495:1: rulePrimitiveProperty
                    {
                     before(grammarAccess.getMultipliablePropertyAccess().getPrimitivePropertyParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveProperty_in_rule__MultipliableProperty__Alternatives982);
                    rulePrimitiveProperty();

                    state._fsp--;

                     after(grammarAccess.getMultipliablePropertyAccess().getPrimitivePropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:500:6: ( ruleNestedProperty )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:500:6: ( ruleNestedProperty )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:501:1: ruleNestedProperty
                    {
                     before(grammarAccess.getMultipliablePropertyAccess().getNestedPropertyParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNestedProperty_in_rule__MultipliableProperty__Alternatives999);
                    ruleNestedProperty();

                    state._fsp--;

                     after(grammarAccess.getMultipliablePropertyAccess().getNestedPropertyParserRuleCall_2()); 

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
    // $ANTLR end "rule__MultipliableProperty__Alternatives"


    // $ANTLR start "rule__PrimitiveProperty__Alternatives_3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:511:1: rule__PrimitiveProperty__Alternatives_3 : ( ( ( rule__PrimitiveProperty__Group_3_0__0 ) ) | ( ( rule__PrimitiveProperty__Group_3_1__0 ) ) );
    public final void rule__PrimitiveProperty__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:515:1: ( ( ( rule__PrimitiveProperty__Group_3_0__0 ) ) | ( ( rule__PrimitiveProperty__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:516:1: ( ( rule__PrimitiveProperty__Group_3_0__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:516:1: ( ( rule__PrimitiveProperty__Group_3_0__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:517:1: ( rule__PrimitiveProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertyAccess().getGroup_3_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:518:1: ( rule__PrimitiveProperty__Group_3_0__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:518:2: rule__PrimitiveProperty__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_0__0_in_rule__PrimitiveProperty__Alternatives_31031);
                    rule__PrimitiveProperty__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertyAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:522:6: ( ( rule__PrimitiveProperty__Group_3_1__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:522:6: ( ( rule__PrimitiveProperty__Group_3_1__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:523:1: ( rule__PrimitiveProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertyAccess().getGroup_3_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:524:1: ( rule__PrimitiveProperty__Group_3_1__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:524:2: rule__PrimitiveProperty__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1__0_in_rule__PrimitiveProperty__Alternatives_31049);
                    rule__PrimitiveProperty__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertyAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Alternatives_3"


    // $ANTLR start "rule__AssociationProperty__Alternatives_3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:533:1: rule__AssociationProperty__Alternatives_3 : ( ( ( rule__AssociationProperty__Group_3_0__0 ) ) | ( ( rule__AssociationProperty__Group_3_1__0 ) ) );
    public final void rule__AssociationProperty__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:537:1: ( ( ( rule__AssociationProperty__Group_3_0__0 ) ) | ( ( rule__AssociationProperty__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:538:1: ( ( rule__AssociationProperty__Group_3_0__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:538:1: ( ( rule__AssociationProperty__Group_3_0__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:539:1: ( rule__AssociationProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getAssociationPropertyAccess().getGroup_3_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:540:1: ( rule__AssociationProperty__Group_3_0__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:540:2: rule__AssociationProperty__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_0__0_in_rule__AssociationProperty__Alternatives_31082);
                    rule__AssociationProperty__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationPropertyAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:544:6: ( ( rule__AssociationProperty__Group_3_1__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:544:6: ( ( rule__AssociationProperty__Group_3_1__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:545:1: ( rule__AssociationProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getAssociationPropertyAccess().getGroup_3_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:546:1: ( rule__AssociationProperty__Group_3_1__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:546:2: rule__AssociationProperty__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1__0_in_rule__AssociationProperty__Alternatives_31100);
                    rule__AssociationProperty__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationPropertyAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Alternatives_3"


    // $ANTLR start "rule__NestedProperty__Alternatives_3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:555:1: rule__NestedProperty__Alternatives_3 : ( ( ( rule__NestedProperty__Group_3_0__0 ) ) | ( ( rule__NestedProperty__Group_3_1__0 ) ) );
    public final void rule__NestedProperty__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:559:1: ( ( ( rule__NestedProperty__Group_3_0__0 ) ) | ( ( rule__NestedProperty__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:560:1: ( ( rule__NestedProperty__Group_3_0__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:560:1: ( ( rule__NestedProperty__Group_3_0__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:561:1: ( rule__NestedProperty__Group_3_0__0 )
                    {
                     before(grammarAccess.getNestedPropertyAccess().getGroup_3_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:562:1: ( rule__NestedProperty__Group_3_0__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:562:2: rule__NestedProperty__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_0__0_in_rule__NestedProperty__Alternatives_31133);
                    rule__NestedProperty__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedPropertyAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:566:6: ( ( rule__NestedProperty__Group_3_1__0 ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:566:6: ( ( rule__NestedProperty__Group_3_1__0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:567:1: ( rule__NestedProperty__Group_3_1__0 )
                    {
                     before(grammarAccess.getNestedPropertyAccess().getGroup_3_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:568:1: ( rule__NestedProperty__Group_3_1__0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:568:2: rule__NestedProperty__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1__0_in_rule__NestedProperty__Alternatives_31151);
                    rule__NestedProperty__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedPropertyAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__NestedProperty__Alternatives_3"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:578:1: rule__PrimitiveType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:582:1: ( ( ( 'boolean' ) ) | ( ( 'char' ) ) | ( ( 'int' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:583:1: ( ( 'boolean' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:583:1: ( ( 'boolean' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:584:1: ( 'boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:585:1: ( 'boolean' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:585:3: 'boolean'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__PrimitiveType__Alternatives1186); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:590:6: ( ( 'char' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:590:6: ( ( 'char' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:591:1: ( 'char' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:592:1: ( 'char' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:592:3: 'char'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__PrimitiveType__Alternatives1207); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:597:6: ( ( 'int' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:597:6: ( ( 'int' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:598:1: ( 'int' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:599:1: ( 'int' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:599:3: 'int'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__PrimitiveType__Alternatives1228); 

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
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:609:1: rule__InheritanceType__Alternatives : ( ( ( 'joined' ) ) | ( ( 'tablePerClass' ) ) | ( ( 'singleTable' ) ) );
    public final void rule__InheritanceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:613:1: ( ( ( 'joined' ) ) | ( ( 'tablePerClass' ) ) | ( ( 'singleTable' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:614:1: ( ( 'joined' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:614:1: ( ( 'joined' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:615:1: ( 'joined' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:616:1: ( 'joined' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:616:3: 'joined'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__InheritanceType__Alternatives1264); 

                    }

                     after(grammarAccess.getInheritanceTypeAccess().getJoinedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:621:6: ( ( 'tablePerClass' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:621:6: ( ( 'tablePerClass' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:622:1: ( 'tablePerClass' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:623:1: ( 'tablePerClass' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:623:3: 'tablePerClass'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__InheritanceType__Alternatives1285); 

                    }

                     after(grammarAccess.getInheritanceTypeAccess().getTablePerClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:628:6: ( ( 'singleTable' ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:628:6: ( ( 'singleTable' ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:629:1: ( 'singleTable' )
                    {
                     before(grammarAccess.getInheritanceTypeAccess().getSingleTableEnumLiteralDeclaration_2()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:630:1: ( 'singleTable' )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:630:3: 'singleTable'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__InheritanceType__Alternatives1306); 

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


    // $ANTLR start "rule__PrimitiveClass__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:642:1: rule__PrimitiveClass__Group__0 : rule__PrimitiveClass__Group__0__Impl rule__PrimitiveClass__Group__1 ;
    public final void rule__PrimitiveClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:646:1: ( rule__PrimitiveClass__Group__0__Impl rule__PrimitiveClass__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:647:2: rule__PrimitiveClass__Group__0__Impl rule__PrimitiveClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__0__Impl_in_rule__PrimitiveClass__Group__01339);
            rule__PrimitiveClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__1_in_rule__PrimitiveClass__Group__01342);
            rule__PrimitiveClass__Group__1();

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
    // $ANTLR end "rule__PrimitiveClass__Group__0"


    // $ANTLR start "rule__PrimitiveClass__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:654:1: rule__PrimitiveClass__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__PrimitiveClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:658:1: ( ( 'primitive' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:659:1: ( 'primitive' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:659:1: ( 'primitive' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:660:1: 'primitive'
            {
             before(grammarAccess.getPrimitiveClassAccess().getPrimitiveKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__PrimitiveClass__Group__0__Impl1370); 
             after(grammarAccess.getPrimitiveClassAccess().getPrimitiveKeyword_0()); 

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
    // $ANTLR end "rule__PrimitiveClass__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveClass__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:673:1: rule__PrimitiveClass__Group__1 : rule__PrimitiveClass__Group__1__Impl rule__PrimitiveClass__Group__2 ;
    public final void rule__PrimitiveClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:677:1: ( rule__PrimitiveClass__Group__1__Impl rule__PrimitiveClass__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:678:2: rule__PrimitiveClass__Group__1__Impl rule__PrimitiveClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__1__Impl_in_rule__PrimitiveClass__Group__11401);
            rule__PrimitiveClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__2_in_rule__PrimitiveClass__Group__11404);
            rule__PrimitiveClass__Group__2();

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
    // $ANTLR end "rule__PrimitiveClass__Group__1"


    // $ANTLR start "rule__PrimitiveClass__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:685:1: rule__PrimitiveClass__Group__1__Impl : ( ( rule__PrimitiveClass__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:689:1: ( ( ( rule__PrimitiveClass__NameAssignment_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:690:1: ( ( rule__PrimitiveClass__NameAssignment_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:690:1: ( ( rule__PrimitiveClass__NameAssignment_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:691:1: ( rule__PrimitiveClass__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveClassAccess().getNameAssignment_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:692:1: ( rule__PrimitiveClass__NameAssignment_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:692:2: rule__PrimitiveClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__NameAssignment_1_in_rule__PrimitiveClass__Group__1__Impl1431);
            rule__PrimitiveClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PrimitiveClass__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveClass__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:702:1: rule__PrimitiveClass__Group__2 : rule__PrimitiveClass__Group__2__Impl rule__PrimitiveClass__Group__3 ;
    public final void rule__PrimitiveClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:706:1: ( rule__PrimitiveClass__Group__2__Impl rule__PrimitiveClass__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:707:2: rule__PrimitiveClass__Group__2__Impl rule__PrimitiveClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__2__Impl_in_rule__PrimitiveClass__Group__21461);
            rule__PrimitiveClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__3_in_rule__PrimitiveClass__Group__21464);
            rule__PrimitiveClass__Group__3();

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
    // $ANTLR end "rule__PrimitiveClass__Group__2"


    // $ANTLR start "rule__PrimitiveClass__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:714:1: rule__PrimitiveClass__Group__2__Impl : ( ':' ) ;
    public final void rule__PrimitiveClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:718:1: ( ( ':' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:719:1: ( ':' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:719:1: ( ':' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:720:1: ':'
            {
             before(grammarAccess.getPrimitiveClassAccess().getColonKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PrimitiveClass__Group__2__Impl1492); 
             after(grammarAccess.getPrimitiveClassAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__PrimitiveClass__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveClass__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:733:1: rule__PrimitiveClass__Group__3 : rule__PrimitiveClass__Group__3__Impl ;
    public final void rule__PrimitiveClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:737:1: ( rule__PrimitiveClass__Group__3__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:738:2: rule__PrimitiveClass__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__Group__3__Impl_in_rule__PrimitiveClass__Group__31523);
            rule__PrimitiveClass__Group__3__Impl();

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
    // $ANTLR end "rule__PrimitiveClass__Group__3"


    // $ANTLR start "rule__PrimitiveClass__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:744:1: rule__PrimitiveClass__Group__3__Impl : ( ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 ) ) ;
    public final void rule__PrimitiveClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:748:1: ( ( ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:749:1: ( ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:749:1: ( ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:750:1: ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 )
            {
             before(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypeAssignment_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:751:1: ( rule__PrimitiveClass__PrimitiveTypeAssignment_3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:751:2: rule__PrimitiveClass__PrimitiveTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveClass__PrimitiveTypeAssignment_3_in_rule__PrimitiveClass__Group__3__Impl1550);
            rule__PrimitiveClass__PrimitiveTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypeAssignment_3()); 

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
    // $ANTLR end "rule__PrimitiveClass__Group__3__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:769:1: rule__EmbeddedClass__Group__0 : rule__EmbeddedClass__Group__0__Impl rule__EmbeddedClass__Group__1 ;
    public final void rule__EmbeddedClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:773:1: ( rule__EmbeddedClass__Group__0__Impl rule__EmbeddedClass__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:774:2: rule__EmbeddedClass__Group__0__Impl rule__EmbeddedClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__0__Impl_in_rule__EmbeddedClass__Group__01588);
            rule__EmbeddedClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__1_in_rule__EmbeddedClass__Group__01591);
            rule__EmbeddedClass__Group__1();

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
    // $ANTLR end "rule__EmbeddedClass__Group__0"


    // $ANTLR start "rule__EmbeddedClass__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:781:1: rule__EmbeddedClass__Group__0__Impl : ( 'embedded' ) ;
    public final void rule__EmbeddedClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:785:1: ( ( 'embedded' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:786:1: ( 'embedded' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:786:1: ( 'embedded' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:787:1: 'embedded'
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__EmbeddedClass__Group__0__Impl1619); 
             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedKeyword_0()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__0__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:800:1: rule__EmbeddedClass__Group__1 : rule__EmbeddedClass__Group__1__Impl rule__EmbeddedClass__Group__2 ;
    public final void rule__EmbeddedClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:804:1: ( rule__EmbeddedClass__Group__1__Impl rule__EmbeddedClass__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:805:2: rule__EmbeddedClass__Group__1__Impl rule__EmbeddedClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__1__Impl_in_rule__EmbeddedClass__Group__11650);
            rule__EmbeddedClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__2_in_rule__EmbeddedClass__Group__11653);
            rule__EmbeddedClass__Group__2();

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
    // $ANTLR end "rule__EmbeddedClass__Group__1"


    // $ANTLR start "rule__EmbeddedClass__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:812:1: rule__EmbeddedClass__Group__1__Impl : ( ( rule__EmbeddedClass__NameAssignment_1 ) ) ;
    public final void rule__EmbeddedClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:816:1: ( ( ( rule__EmbeddedClass__NameAssignment_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:817:1: ( ( rule__EmbeddedClass__NameAssignment_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:817:1: ( ( rule__EmbeddedClass__NameAssignment_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:818:1: ( rule__EmbeddedClass__NameAssignment_1 )
            {
             before(grammarAccess.getEmbeddedClassAccess().getNameAssignment_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:819:1: ( rule__EmbeddedClass__NameAssignment_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:819:2: rule__EmbeddedClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__NameAssignment_1_in_rule__EmbeddedClass__Group__1__Impl1680);
            rule__EmbeddedClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__1__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:829:1: rule__EmbeddedClass__Group__2 : rule__EmbeddedClass__Group__2__Impl rule__EmbeddedClass__Group__3 ;
    public final void rule__EmbeddedClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:833:1: ( rule__EmbeddedClass__Group__2__Impl rule__EmbeddedClass__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:834:2: rule__EmbeddedClass__Group__2__Impl rule__EmbeddedClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__2__Impl_in_rule__EmbeddedClass__Group__21710);
            rule__EmbeddedClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__3_in_rule__EmbeddedClass__Group__21713);
            rule__EmbeddedClass__Group__3();

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
    // $ANTLR end "rule__EmbeddedClass__Group__2"


    // $ANTLR start "rule__EmbeddedClass__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:841:1: rule__EmbeddedClass__Group__2__Impl : ( '{' ) ;
    public final void rule__EmbeddedClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:845:1: ( ( '{' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:846:1: ( '{' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:846:1: ( '{' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:847:1: '{'
            {
             before(grammarAccess.getEmbeddedClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EmbeddedClass__Group__2__Impl1741); 
             after(grammarAccess.getEmbeddedClassAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__2__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:860:1: rule__EmbeddedClass__Group__3 : rule__EmbeddedClass__Group__3__Impl rule__EmbeddedClass__Group__4 ;
    public final void rule__EmbeddedClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:864:1: ( rule__EmbeddedClass__Group__3__Impl rule__EmbeddedClass__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:865:2: rule__EmbeddedClass__Group__3__Impl rule__EmbeddedClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__3__Impl_in_rule__EmbeddedClass__Group__31772);
            rule__EmbeddedClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__4_in_rule__EmbeddedClass__Group__31775);
            rule__EmbeddedClass__Group__4();

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
    // $ANTLR end "rule__EmbeddedClass__Group__3"


    // $ANTLR start "rule__EmbeddedClass__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:872:1: rule__EmbeddedClass__Group__3__Impl : ( 'id' ) ;
    public final void rule__EmbeddedClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:876:1: ( ( 'id' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:877:1: ( 'id' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:877:1: ( 'id' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:878:1: 'id'
            {
             before(grammarAccess.getEmbeddedClassAccess().getIdKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EmbeddedClass__Group__3__Impl1803); 
             after(grammarAccess.getEmbeddedClassAccess().getIdKeyword_3()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__3__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:891:1: rule__EmbeddedClass__Group__4 : rule__EmbeddedClass__Group__4__Impl rule__EmbeddedClass__Group__5 ;
    public final void rule__EmbeddedClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:895:1: ( rule__EmbeddedClass__Group__4__Impl rule__EmbeddedClass__Group__5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:896:2: rule__EmbeddedClass__Group__4__Impl rule__EmbeddedClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__4__Impl_in_rule__EmbeddedClass__Group__41834);
            rule__EmbeddedClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__5_in_rule__EmbeddedClass__Group__41837);
            rule__EmbeddedClass__Group__5();

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
    // $ANTLR end "rule__EmbeddedClass__Group__4"


    // $ANTLR start "rule__EmbeddedClass__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:903:1: rule__EmbeddedClass__Group__4__Impl : ( ( rule__EmbeddedClass__IdPropertyAssignment_4 ) ) ;
    public final void rule__EmbeddedClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:907:1: ( ( ( rule__EmbeddedClass__IdPropertyAssignment_4 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:908:1: ( ( rule__EmbeddedClass__IdPropertyAssignment_4 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:908:1: ( ( rule__EmbeddedClass__IdPropertyAssignment_4 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:909:1: ( rule__EmbeddedClass__IdPropertyAssignment_4 )
            {
             before(grammarAccess.getEmbeddedClassAccess().getIdPropertyAssignment_4()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:910:1: ( rule__EmbeddedClass__IdPropertyAssignment_4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:910:2: rule__EmbeddedClass__IdPropertyAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__IdPropertyAssignment_4_in_rule__EmbeddedClass__Group__4__Impl1864);
            rule__EmbeddedClass__IdPropertyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedClassAccess().getIdPropertyAssignment_4()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__4__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:920:1: rule__EmbeddedClass__Group__5 : rule__EmbeddedClass__Group__5__Impl rule__EmbeddedClass__Group__6 ;
    public final void rule__EmbeddedClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:924:1: ( rule__EmbeddedClass__Group__5__Impl rule__EmbeddedClass__Group__6 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:925:2: rule__EmbeddedClass__Group__5__Impl rule__EmbeddedClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__5__Impl_in_rule__EmbeddedClass__Group__51894);
            rule__EmbeddedClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__6_in_rule__EmbeddedClass__Group__51897);
            rule__EmbeddedClass__Group__6();

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
    // $ANTLR end "rule__EmbeddedClass__Group__5"


    // $ANTLR start "rule__EmbeddedClass__Group__5__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:932:1: rule__EmbeddedClass__Group__5__Impl : ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 ) ) ;
    public final void rule__EmbeddedClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:936:1: ( ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:937:1: ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:937:1: ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:938:1: ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 )
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesAssignment_5()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:939:1: ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:939:2: rule__EmbeddedClass__EmbeddedPropertiesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__EmbeddedPropertiesAssignment_5_in_rule__EmbeddedClass__Group__5__Impl1924);
            rule__EmbeddedClass__EmbeddedPropertiesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesAssignment_5()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__5__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:949:1: rule__EmbeddedClass__Group__6 : rule__EmbeddedClass__Group__6__Impl rule__EmbeddedClass__Group__7 ;
    public final void rule__EmbeddedClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:953:1: ( rule__EmbeddedClass__Group__6__Impl rule__EmbeddedClass__Group__7 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:954:2: rule__EmbeddedClass__Group__6__Impl rule__EmbeddedClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__6__Impl_in_rule__EmbeddedClass__Group__61954);
            rule__EmbeddedClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__7_in_rule__EmbeddedClass__Group__61957);
            rule__EmbeddedClass__Group__7();

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
    // $ANTLR end "rule__EmbeddedClass__Group__6"


    // $ANTLR start "rule__EmbeddedClass__Group__6__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:961:1: rule__EmbeddedClass__Group__6__Impl : ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )* ) ;
    public final void rule__EmbeddedClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:965:1: ( ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )* ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:966:1: ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )* )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:966:1: ( ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )* )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:967:1: ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )*
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesAssignment_6()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:968:1: ( rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:968:2: rule__EmbeddedClass__EmbeddedPropertiesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__EmbeddedPropertiesAssignment_6_in_rule__EmbeddedClass__Group__6__Impl1984);
            	    rule__EmbeddedClass__EmbeddedPropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesAssignment_6()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__6__Impl"


    // $ANTLR start "rule__EmbeddedClass__Group__7"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:978:1: rule__EmbeddedClass__Group__7 : rule__EmbeddedClass__Group__7__Impl ;
    public final void rule__EmbeddedClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:982:1: ( rule__EmbeddedClass__Group__7__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:983:2: rule__EmbeddedClass__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedClass__Group__7__Impl_in_rule__EmbeddedClass__Group__72015);
            rule__EmbeddedClass__Group__7__Impl();

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
    // $ANTLR end "rule__EmbeddedClass__Group__7"


    // $ANTLR start "rule__EmbeddedClass__Group__7__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:989:1: rule__EmbeddedClass__Group__7__Impl : ( '}' ) ;
    public final void rule__EmbeddedClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:993:1: ( ( '}' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:994:1: ( '}' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:994:1: ( '}' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:995:1: '}'
            {
             before(grammarAccess.getEmbeddedClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__EmbeddedClass__Group__7__Impl2043); 
             after(grammarAccess.getEmbeddedClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__EmbeddedClass__Group__7__Impl"


    // $ANTLR start "rule__StandardClass__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1024:1: rule__StandardClass__Group__0 : rule__StandardClass__Group__0__Impl rule__StandardClass__Group__1 ;
    public final void rule__StandardClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1028:1: ( rule__StandardClass__Group__0__Impl rule__StandardClass__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1029:2: rule__StandardClass__Group__0__Impl rule__StandardClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__0__Impl_in_rule__StandardClass__Group__02090);
            rule__StandardClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__1_in_rule__StandardClass__Group__02093);
            rule__StandardClass__Group__1();

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
    // $ANTLR end "rule__StandardClass__Group__0"


    // $ANTLR start "rule__StandardClass__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1036:1: rule__StandardClass__Group__0__Impl : ( ( rule__StandardClass__IsAbstractAssignment_0 )? ) ;
    public final void rule__StandardClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1040:1: ( ( ( rule__StandardClass__IsAbstractAssignment_0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1041:1: ( ( rule__StandardClass__IsAbstractAssignment_0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1041:1: ( ( rule__StandardClass__IsAbstractAssignment_0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1042:1: ( rule__StandardClass__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getStandardClassAccess().getIsAbstractAssignment_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1043:1: ( rule__StandardClass__IsAbstractAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1043:2: rule__StandardClass__IsAbstractAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardClass__IsAbstractAssignment_0_in_rule__StandardClass__Group__0__Impl2120);
                    rule__StandardClass__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardClassAccess().getIsAbstractAssignment_0()); 

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
    // $ANTLR end "rule__StandardClass__Group__0__Impl"


    // $ANTLR start "rule__StandardClass__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1053:1: rule__StandardClass__Group__1 : rule__StandardClass__Group__1__Impl rule__StandardClass__Group__2 ;
    public final void rule__StandardClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1057:1: ( rule__StandardClass__Group__1__Impl rule__StandardClass__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1058:2: rule__StandardClass__Group__1__Impl rule__StandardClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__1__Impl_in_rule__StandardClass__Group__12151);
            rule__StandardClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__2_in_rule__StandardClass__Group__12154);
            rule__StandardClass__Group__2();

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
    // $ANTLR end "rule__StandardClass__Group__1"


    // $ANTLR start "rule__StandardClass__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1065:1: rule__StandardClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__StandardClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1069:1: ( ( 'class' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1070:1: ( 'class' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1070:1: ( 'class' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1071:1: 'class'
            {
             before(grammarAccess.getStandardClassAccess().getClassKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__StandardClass__Group__1__Impl2182); 
             after(grammarAccess.getStandardClassAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__StandardClass__Group__1__Impl"


    // $ANTLR start "rule__StandardClass__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1084:1: rule__StandardClass__Group__2 : rule__StandardClass__Group__2__Impl rule__StandardClass__Group__3 ;
    public final void rule__StandardClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1088:1: ( rule__StandardClass__Group__2__Impl rule__StandardClass__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1089:2: rule__StandardClass__Group__2__Impl rule__StandardClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__2__Impl_in_rule__StandardClass__Group__22213);
            rule__StandardClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__3_in_rule__StandardClass__Group__22216);
            rule__StandardClass__Group__3();

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
    // $ANTLR end "rule__StandardClass__Group__2"


    // $ANTLR start "rule__StandardClass__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1096:1: rule__StandardClass__Group__2__Impl : ( ( rule__StandardClass__NameAssignment_2 ) ) ;
    public final void rule__StandardClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1100:1: ( ( ( rule__StandardClass__NameAssignment_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1101:1: ( ( rule__StandardClass__NameAssignment_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1101:1: ( ( rule__StandardClass__NameAssignment_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1102:1: ( rule__StandardClass__NameAssignment_2 )
            {
             before(grammarAccess.getStandardClassAccess().getNameAssignment_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1103:1: ( rule__StandardClass__NameAssignment_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1103:2: rule__StandardClass__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__NameAssignment_2_in_rule__StandardClass__Group__2__Impl2243);
            rule__StandardClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__StandardClass__Group__2__Impl"


    // $ANTLR start "rule__StandardClass__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1113:1: rule__StandardClass__Group__3 : rule__StandardClass__Group__3__Impl rule__StandardClass__Group__4 ;
    public final void rule__StandardClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1117:1: ( rule__StandardClass__Group__3__Impl rule__StandardClass__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1118:2: rule__StandardClass__Group__3__Impl rule__StandardClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__3__Impl_in_rule__StandardClass__Group__32273);
            rule__StandardClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__4_in_rule__StandardClass__Group__32276);
            rule__StandardClass__Group__4();

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
    // $ANTLR end "rule__StandardClass__Group__3"


    // $ANTLR start "rule__StandardClass__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1125:1: rule__StandardClass__Group__3__Impl : ( ( rule__StandardClass__Group_3__0 )? ) ;
    public final void rule__StandardClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1129:1: ( ( ( rule__StandardClass__Group_3__0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1130:1: ( ( rule__StandardClass__Group_3__0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1130:1: ( ( rule__StandardClass__Group_3__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1131:1: ( rule__StandardClass__Group_3__0 )?
            {
             before(grammarAccess.getStandardClassAccess().getGroup_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1132:1: ( rule__StandardClass__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1132:2: rule__StandardClass__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__0_in_rule__StandardClass__Group__3__Impl2303);
                    rule__StandardClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__StandardClass__Group__3__Impl"


    // $ANTLR start "rule__StandardClass__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1142:1: rule__StandardClass__Group__4 : rule__StandardClass__Group__4__Impl rule__StandardClass__Group__5 ;
    public final void rule__StandardClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1146:1: ( rule__StandardClass__Group__4__Impl rule__StandardClass__Group__5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1147:2: rule__StandardClass__Group__4__Impl rule__StandardClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__4__Impl_in_rule__StandardClass__Group__42334);
            rule__StandardClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__5_in_rule__StandardClass__Group__42337);
            rule__StandardClass__Group__5();

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
    // $ANTLR end "rule__StandardClass__Group__4"


    // $ANTLR start "rule__StandardClass__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1154:1: rule__StandardClass__Group__4__Impl : ( '{' ) ;
    public final void rule__StandardClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1158:1: ( ( '{' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1159:1: ( '{' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1159:1: ( '{' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1160:1: '{'
            {
             before(grammarAccess.getStandardClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__StandardClass__Group__4__Impl2365); 
             after(grammarAccess.getStandardClassAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__StandardClass__Group__4__Impl"


    // $ANTLR start "rule__StandardClass__Group__5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1173:1: rule__StandardClass__Group__5 : rule__StandardClass__Group__5__Impl rule__StandardClass__Group__6 ;
    public final void rule__StandardClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1177:1: ( rule__StandardClass__Group__5__Impl rule__StandardClass__Group__6 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1178:2: rule__StandardClass__Group__5__Impl rule__StandardClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__5__Impl_in_rule__StandardClass__Group__52396);
            rule__StandardClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__6_in_rule__StandardClass__Group__52399);
            rule__StandardClass__Group__6();

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
    // $ANTLR end "rule__StandardClass__Group__5"


    // $ANTLR start "rule__StandardClass__Group__5__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1185:1: rule__StandardClass__Group__5__Impl : ( ( rule__StandardClass__Group_5__0 )? ) ;
    public final void rule__StandardClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1189:1: ( ( ( rule__StandardClass__Group_5__0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1190:1: ( ( rule__StandardClass__Group_5__0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1190:1: ( ( rule__StandardClass__Group_5__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1191:1: ( rule__StandardClass__Group_5__0 )?
            {
             before(grammarAccess.getStandardClassAccess().getGroup_5()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1192:1: ( rule__StandardClass__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1192:2: rule__StandardClass__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_5__0_in_rule__StandardClass__Group__5__Impl2426);
                    rule__StandardClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardClassAccess().getGroup_5()); 

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
    // $ANTLR end "rule__StandardClass__Group__5__Impl"


    // $ANTLR start "rule__StandardClass__Group__6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1202:1: rule__StandardClass__Group__6 : rule__StandardClass__Group__6__Impl rule__StandardClass__Group__7 ;
    public final void rule__StandardClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1206:1: ( rule__StandardClass__Group__6__Impl rule__StandardClass__Group__7 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1207:2: rule__StandardClass__Group__6__Impl rule__StandardClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__6__Impl_in_rule__StandardClass__Group__62457);
            rule__StandardClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__7_in_rule__StandardClass__Group__62460);
            rule__StandardClass__Group__7();

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
    // $ANTLR end "rule__StandardClass__Group__6"


    // $ANTLR start "rule__StandardClass__Group__6__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1214:1: rule__StandardClass__Group__6__Impl : ( ( rule__StandardClass__Group_6__0 )? ) ;
    public final void rule__StandardClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1218:1: ( ( ( rule__StandardClass__Group_6__0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1219:1: ( ( rule__StandardClass__Group_6__0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1219:1: ( ( rule__StandardClass__Group_6__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1220:1: ( rule__StandardClass__Group_6__0 )?
            {
             before(grammarAccess.getStandardClassAccess().getGroup_6()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1221:1: ( rule__StandardClass__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27||LA14_0==32||LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1221:2: rule__StandardClass__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_6__0_in_rule__StandardClass__Group__6__Impl2487);
                    rule__StandardClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardClassAccess().getGroup_6()); 

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
    // $ANTLR end "rule__StandardClass__Group__6__Impl"


    // $ANTLR start "rule__StandardClass__Group__7"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1231:1: rule__StandardClass__Group__7 : rule__StandardClass__Group__7__Impl ;
    public final void rule__StandardClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1235:1: ( rule__StandardClass__Group__7__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1236:2: rule__StandardClass__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group__7__Impl_in_rule__StandardClass__Group__72518);
            rule__StandardClass__Group__7__Impl();

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
    // $ANTLR end "rule__StandardClass__Group__7"


    // $ANTLR start "rule__StandardClass__Group__7__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1242:1: rule__StandardClass__Group__7__Impl : ( '}' ) ;
    public final void rule__StandardClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1246:1: ( ( '}' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1247:1: ( '}' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1247:1: ( '}' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1248:1: '}'
            {
             before(grammarAccess.getStandardClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__StandardClass__Group__7__Impl2546); 
             after(grammarAccess.getStandardClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__StandardClass__Group__7__Impl"


    // $ANTLR start "rule__StandardClass__Group_3__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1277:1: rule__StandardClass__Group_3__0 : rule__StandardClass__Group_3__0__Impl rule__StandardClass__Group_3__1 ;
    public final void rule__StandardClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1281:1: ( rule__StandardClass__Group_3__0__Impl rule__StandardClass__Group_3__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1282:2: rule__StandardClass__Group_3__0__Impl rule__StandardClass__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__0__Impl_in_rule__StandardClass__Group_3__02593);
            rule__StandardClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__1_in_rule__StandardClass__Group_3__02596);
            rule__StandardClass__Group_3__1();

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
    // $ANTLR end "rule__StandardClass__Group_3__0"


    // $ANTLR start "rule__StandardClass__Group_3__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1289:1: rule__StandardClass__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__StandardClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1293:1: ( ( 'extends' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1294:1: ( 'extends' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1294:1: ( 'extends' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1295:1: 'extends'
            {
             before(grammarAccess.getStandardClassAccess().getExtendsKeyword_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__StandardClass__Group_3__0__Impl2624); 
             after(grammarAccess.getStandardClassAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__StandardClass__Group_3__0__Impl"


    // $ANTLR start "rule__StandardClass__Group_3__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1308:1: rule__StandardClass__Group_3__1 : rule__StandardClass__Group_3__1__Impl rule__StandardClass__Group_3__2 ;
    public final void rule__StandardClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1312:1: ( rule__StandardClass__Group_3__1__Impl rule__StandardClass__Group_3__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1313:2: rule__StandardClass__Group_3__1__Impl rule__StandardClass__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__1__Impl_in_rule__StandardClass__Group_3__12655);
            rule__StandardClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__2_in_rule__StandardClass__Group_3__12658);
            rule__StandardClass__Group_3__2();

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
    // $ANTLR end "rule__StandardClass__Group_3__1"


    // $ANTLR start "rule__StandardClass__Group_3__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1320:1: rule__StandardClass__Group_3__1__Impl : ( ( rule__StandardClass__ParentAssignment_3_1 ) ) ;
    public final void rule__StandardClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1324:1: ( ( ( rule__StandardClass__ParentAssignment_3_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1325:1: ( ( rule__StandardClass__ParentAssignment_3_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1325:1: ( ( rule__StandardClass__ParentAssignment_3_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1326:1: ( rule__StandardClass__ParentAssignment_3_1 )
            {
             before(grammarAccess.getStandardClassAccess().getParentAssignment_3_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1327:1: ( rule__StandardClass__ParentAssignment_3_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1327:2: rule__StandardClass__ParentAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__ParentAssignment_3_1_in_rule__StandardClass__Group_3__1__Impl2685);
            rule__StandardClass__ParentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getParentAssignment_3_1()); 

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
    // $ANTLR end "rule__StandardClass__Group_3__1__Impl"


    // $ANTLR start "rule__StandardClass__Group_3__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1337:1: rule__StandardClass__Group_3__2 : rule__StandardClass__Group_3__2__Impl rule__StandardClass__Group_3__3 ;
    public final void rule__StandardClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1341:1: ( rule__StandardClass__Group_3__2__Impl rule__StandardClass__Group_3__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1342:2: rule__StandardClass__Group_3__2__Impl rule__StandardClass__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__2__Impl_in_rule__StandardClass__Group_3__22715);
            rule__StandardClass__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__3_in_rule__StandardClass__Group_3__22718);
            rule__StandardClass__Group_3__3();

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
    // $ANTLR end "rule__StandardClass__Group_3__2"


    // $ANTLR start "rule__StandardClass__Group_3__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1349:1: rule__StandardClass__Group_3__2__Impl : ( 'by' ) ;
    public final void rule__StandardClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1353:1: ( ( 'by' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1354:1: ( 'by' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1354:1: ( 'by' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1355:1: 'by'
            {
             before(grammarAccess.getStandardClassAccess().getByKeyword_3_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__StandardClass__Group_3__2__Impl2746); 
             after(grammarAccess.getStandardClassAccess().getByKeyword_3_2()); 

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
    // $ANTLR end "rule__StandardClass__Group_3__2__Impl"


    // $ANTLR start "rule__StandardClass__Group_3__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1368:1: rule__StandardClass__Group_3__3 : rule__StandardClass__Group_3__3__Impl ;
    public final void rule__StandardClass__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1372:1: ( rule__StandardClass__Group_3__3__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1373:2: rule__StandardClass__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_3__3__Impl_in_rule__StandardClass__Group_3__32777);
            rule__StandardClass__Group_3__3__Impl();

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
    // $ANTLR end "rule__StandardClass__Group_3__3"


    // $ANTLR start "rule__StandardClass__Group_3__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1379:1: rule__StandardClass__Group_3__3__Impl : ( ( rule__StandardClass__InheritanceTypeAssignment_3_3 ) ) ;
    public final void rule__StandardClass__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1383:1: ( ( ( rule__StandardClass__InheritanceTypeAssignment_3_3 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1384:1: ( ( rule__StandardClass__InheritanceTypeAssignment_3_3 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1384:1: ( ( rule__StandardClass__InheritanceTypeAssignment_3_3 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1385:1: ( rule__StandardClass__InheritanceTypeAssignment_3_3 )
            {
             before(grammarAccess.getStandardClassAccess().getInheritanceTypeAssignment_3_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1386:1: ( rule__StandardClass__InheritanceTypeAssignment_3_3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1386:2: rule__StandardClass__InheritanceTypeAssignment_3_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__InheritanceTypeAssignment_3_3_in_rule__StandardClass__Group_3__3__Impl2804);
            rule__StandardClass__InheritanceTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getInheritanceTypeAssignment_3_3()); 

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
    // $ANTLR end "rule__StandardClass__Group_3__3__Impl"


    // $ANTLR start "rule__StandardClass__Group_5__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1404:1: rule__StandardClass__Group_5__0 : rule__StandardClass__Group_5__0__Impl rule__StandardClass__Group_5__1 ;
    public final void rule__StandardClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1408:1: ( rule__StandardClass__Group_5__0__Impl rule__StandardClass__Group_5__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1409:2: rule__StandardClass__Group_5__0__Impl rule__StandardClass__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_5__0__Impl_in_rule__StandardClass__Group_5__02842);
            rule__StandardClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_5__1_in_rule__StandardClass__Group_5__02845);
            rule__StandardClass__Group_5__1();

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
    // $ANTLR end "rule__StandardClass__Group_5__0"


    // $ANTLR start "rule__StandardClass__Group_5__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1416:1: rule__StandardClass__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__StandardClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1420:1: ( ( 'id' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1421:1: ( 'id' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1421:1: ( 'id' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1422:1: 'id'
            {
             before(grammarAccess.getStandardClassAccess().getIdKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__StandardClass__Group_5__0__Impl2873); 
             after(grammarAccess.getStandardClassAccess().getIdKeyword_5_0()); 

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
    // $ANTLR end "rule__StandardClass__Group_5__0__Impl"


    // $ANTLR start "rule__StandardClass__Group_5__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1435:1: rule__StandardClass__Group_5__1 : rule__StandardClass__Group_5__1__Impl ;
    public final void rule__StandardClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1439:1: ( rule__StandardClass__Group_5__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1440:2: rule__StandardClass__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_5__1__Impl_in_rule__StandardClass__Group_5__12904);
            rule__StandardClass__Group_5__1__Impl();

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
    // $ANTLR end "rule__StandardClass__Group_5__1"


    // $ANTLR start "rule__StandardClass__Group_5__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1446:1: rule__StandardClass__Group_5__1__Impl : ( ( rule__StandardClass__IdPropertyAssignment_5_1 ) ) ;
    public final void rule__StandardClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1450:1: ( ( ( rule__StandardClass__IdPropertyAssignment_5_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1451:1: ( ( rule__StandardClass__IdPropertyAssignment_5_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1451:1: ( ( rule__StandardClass__IdPropertyAssignment_5_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1452:1: ( rule__StandardClass__IdPropertyAssignment_5_1 )
            {
             before(grammarAccess.getStandardClassAccess().getIdPropertyAssignment_5_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1453:1: ( rule__StandardClass__IdPropertyAssignment_5_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1453:2: rule__StandardClass__IdPropertyAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__IdPropertyAssignment_5_1_in_rule__StandardClass__Group_5__1__Impl2931);
            rule__StandardClass__IdPropertyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getIdPropertyAssignment_5_1()); 

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
    // $ANTLR end "rule__StandardClass__Group_5__1__Impl"


    // $ANTLR start "rule__StandardClass__Group_6__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1467:1: rule__StandardClass__Group_6__0 : rule__StandardClass__Group_6__0__Impl rule__StandardClass__Group_6__1 ;
    public final void rule__StandardClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1471:1: ( rule__StandardClass__Group_6__0__Impl rule__StandardClass__Group_6__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1472:2: rule__StandardClass__Group_6__0__Impl rule__StandardClass__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_6__0__Impl_in_rule__StandardClass__Group_6__02965);
            rule__StandardClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_6__1_in_rule__StandardClass__Group_6__02968);
            rule__StandardClass__Group_6__1();

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
    // $ANTLR end "rule__StandardClass__Group_6__0"


    // $ANTLR start "rule__StandardClass__Group_6__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1479:1: rule__StandardClass__Group_6__0__Impl : ( ( rule__StandardClass__PropertiesAssignment_6_0 ) ) ;
    public final void rule__StandardClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1483:1: ( ( ( rule__StandardClass__PropertiesAssignment_6_0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1484:1: ( ( rule__StandardClass__PropertiesAssignment_6_0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1484:1: ( ( rule__StandardClass__PropertiesAssignment_6_0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1485:1: ( rule__StandardClass__PropertiesAssignment_6_0 )
            {
             before(grammarAccess.getStandardClassAccess().getPropertiesAssignment_6_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1486:1: ( rule__StandardClass__PropertiesAssignment_6_0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1486:2: rule__StandardClass__PropertiesAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__PropertiesAssignment_6_0_in_rule__StandardClass__Group_6__0__Impl2995);
            rule__StandardClass__PropertiesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getStandardClassAccess().getPropertiesAssignment_6_0()); 

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
    // $ANTLR end "rule__StandardClass__Group_6__0__Impl"


    // $ANTLR start "rule__StandardClass__Group_6__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1496:1: rule__StandardClass__Group_6__1 : rule__StandardClass__Group_6__1__Impl ;
    public final void rule__StandardClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1500:1: ( rule__StandardClass__Group_6__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1501:2: rule__StandardClass__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardClass__Group_6__1__Impl_in_rule__StandardClass__Group_6__13025);
            rule__StandardClass__Group_6__1__Impl();

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
    // $ANTLR end "rule__StandardClass__Group_6__1"


    // $ANTLR start "rule__StandardClass__Group_6__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1507:1: rule__StandardClass__Group_6__1__Impl : ( ( rule__StandardClass__PropertiesAssignment_6_1 )* ) ;
    public final void rule__StandardClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1511:1: ( ( ( rule__StandardClass__PropertiesAssignment_6_1 )* ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1512:1: ( ( rule__StandardClass__PropertiesAssignment_6_1 )* )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1512:1: ( ( rule__StandardClass__PropertiesAssignment_6_1 )* )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1513:1: ( rule__StandardClass__PropertiesAssignment_6_1 )*
            {
             before(grammarAccess.getStandardClassAccess().getPropertiesAssignment_6_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1514:1: ( rule__StandardClass__PropertiesAssignment_6_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27||LA15_0==32||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1514:2: rule__StandardClass__PropertiesAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StandardClass__PropertiesAssignment_6_1_in_rule__StandardClass__Group_6__1__Impl3052);
            	    rule__StandardClass__PropertiesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStandardClassAccess().getPropertiesAssignment_6_1()); 

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
    // $ANTLR end "rule__StandardClass__Group_6__1__Impl"


    // $ANTLR start "rule__EmbeddedProperty__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1528:1: rule__EmbeddedProperty__Group__0 : rule__EmbeddedProperty__Group__0__Impl rule__EmbeddedProperty__Group__1 ;
    public final void rule__EmbeddedProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1532:1: ( rule__EmbeddedProperty__Group__0__Impl rule__EmbeddedProperty__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1533:2: rule__EmbeddedProperty__Group__0__Impl rule__EmbeddedProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__0__Impl_in_rule__EmbeddedProperty__Group__03087);
            rule__EmbeddedProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__1_in_rule__EmbeddedProperty__Group__03090);
            rule__EmbeddedProperty__Group__1();

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
    // $ANTLR end "rule__EmbeddedProperty__Group__0"


    // $ANTLR start "rule__EmbeddedProperty__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1540:1: rule__EmbeddedProperty__Group__0__Impl : ( 'EmbeddedProperty' ) ;
    public final void rule__EmbeddedProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1544:1: ( ( 'EmbeddedProperty' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1545:1: ( 'EmbeddedProperty' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1545:1: ( 'EmbeddedProperty' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1546:1: 'EmbeddedProperty'
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getEmbeddedPropertyKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__EmbeddedProperty__Group__0__Impl3118); 
             after(grammarAccess.getEmbeddedPropertyAccess().getEmbeddedPropertyKeyword_0()); 

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
    // $ANTLR end "rule__EmbeddedProperty__Group__0__Impl"


    // $ANTLR start "rule__EmbeddedProperty__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1559:1: rule__EmbeddedProperty__Group__1 : rule__EmbeddedProperty__Group__1__Impl rule__EmbeddedProperty__Group__2 ;
    public final void rule__EmbeddedProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1563:1: ( rule__EmbeddedProperty__Group__1__Impl rule__EmbeddedProperty__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1564:2: rule__EmbeddedProperty__Group__1__Impl rule__EmbeddedProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__1__Impl_in_rule__EmbeddedProperty__Group__13149);
            rule__EmbeddedProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__2_in_rule__EmbeddedProperty__Group__13152);
            rule__EmbeddedProperty__Group__2();

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
    // $ANTLR end "rule__EmbeddedProperty__Group__1"


    // $ANTLR start "rule__EmbeddedProperty__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1571:1: rule__EmbeddedProperty__Group__1__Impl : ( ( rule__EmbeddedProperty__IsMandatoryAssignment_1 ) ) ;
    public final void rule__EmbeddedProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1575:1: ( ( ( rule__EmbeddedProperty__IsMandatoryAssignment_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1576:1: ( ( rule__EmbeddedProperty__IsMandatoryAssignment_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1576:1: ( ( rule__EmbeddedProperty__IsMandatoryAssignment_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1577:1: ( rule__EmbeddedProperty__IsMandatoryAssignment_1 )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryAssignment_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1578:1: ( rule__EmbeddedProperty__IsMandatoryAssignment_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1578:2: rule__EmbeddedProperty__IsMandatoryAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__IsMandatoryAssignment_1_in_rule__EmbeddedProperty__Group__1__Impl3179);
            rule__EmbeddedProperty__IsMandatoryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__EmbeddedProperty__Group__1__Impl"


    // $ANTLR start "rule__EmbeddedProperty__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1588:1: rule__EmbeddedProperty__Group__2 : rule__EmbeddedProperty__Group__2__Impl rule__EmbeddedProperty__Group__3 ;
    public final void rule__EmbeddedProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1592:1: ( rule__EmbeddedProperty__Group__2__Impl rule__EmbeddedProperty__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1593:2: rule__EmbeddedProperty__Group__2__Impl rule__EmbeddedProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__2__Impl_in_rule__EmbeddedProperty__Group__23209);
            rule__EmbeddedProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__3_in_rule__EmbeddedProperty__Group__23212);
            rule__EmbeddedProperty__Group__3();

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
    // $ANTLR end "rule__EmbeddedProperty__Group__2"


    // $ANTLR start "rule__EmbeddedProperty__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1600:1: rule__EmbeddedProperty__Group__2__Impl : ( ( rule__EmbeddedProperty__NameAssignment_2 ) ) ;
    public final void rule__EmbeddedProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1604:1: ( ( ( rule__EmbeddedProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1605:1: ( ( rule__EmbeddedProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1605:1: ( ( rule__EmbeddedProperty__NameAssignment_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1606:1: ( rule__EmbeddedProperty__NameAssignment_2 )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1607:1: ( rule__EmbeddedProperty__NameAssignment_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1607:2: rule__EmbeddedProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__NameAssignment_2_in_rule__EmbeddedProperty__Group__2__Impl3239);
            rule__EmbeddedProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EmbeddedProperty__Group__2__Impl"


    // $ANTLR start "rule__EmbeddedProperty__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1617:1: rule__EmbeddedProperty__Group__3 : rule__EmbeddedProperty__Group__3__Impl rule__EmbeddedProperty__Group__4 ;
    public final void rule__EmbeddedProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1621:1: ( rule__EmbeddedProperty__Group__3__Impl rule__EmbeddedProperty__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1622:2: rule__EmbeddedProperty__Group__3__Impl rule__EmbeddedProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__3__Impl_in_rule__EmbeddedProperty__Group__33269);
            rule__EmbeddedProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__4_in_rule__EmbeddedProperty__Group__33272);
            rule__EmbeddedProperty__Group__4();

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
    // $ANTLR end "rule__EmbeddedProperty__Group__3"


    // $ANTLR start "rule__EmbeddedProperty__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1629:1: rule__EmbeddedProperty__Group__3__Impl : ( ':' ) ;
    public final void rule__EmbeddedProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1633:1: ( ( ':' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1634:1: ( ':' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1634:1: ( ':' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1635:1: ':'
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getColonKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__EmbeddedProperty__Group__3__Impl3300); 
             after(grammarAccess.getEmbeddedPropertyAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__EmbeddedProperty__Group__3__Impl"


    // $ANTLR start "rule__EmbeddedProperty__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1648:1: rule__EmbeddedProperty__Group__4 : rule__EmbeddedProperty__Group__4__Impl ;
    public final void rule__EmbeddedProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1652:1: ( rule__EmbeddedProperty__Group__4__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1653:2: rule__EmbeddedProperty__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__Group__4__Impl_in_rule__EmbeddedProperty__Group__43331);
            rule__EmbeddedProperty__Group__4__Impl();

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
    // $ANTLR end "rule__EmbeddedProperty__Group__4"


    // $ANTLR start "rule__EmbeddedProperty__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1659:1: rule__EmbeddedProperty__Group__4__Impl : ( ( rule__EmbeddedProperty__TypeAssignment_4 ) ) ;
    public final void rule__EmbeddedProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1663:1: ( ( ( rule__EmbeddedProperty__TypeAssignment_4 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1664:1: ( ( rule__EmbeddedProperty__TypeAssignment_4 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1664:1: ( ( rule__EmbeddedProperty__TypeAssignment_4 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1665:1: ( rule__EmbeddedProperty__TypeAssignment_4 )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getTypeAssignment_4()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1666:1: ( rule__EmbeddedProperty__TypeAssignment_4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1666:2: rule__EmbeddedProperty__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EmbeddedProperty__TypeAssignment_4_in_rule__EmbeddedProperty__Group__4__Impl3358);
            rule__EmbeddedProperty__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmbeddedPropertyAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__EmbeddedProperty__Group__4__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1686:1: rule__PrimitiveProperty__Group__0 : rule__PrimitiveProperty__Group__0__Impl rule__PrimitiveProperty__Group__1 ;
    public final void rule__PrimitiveProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1690:1: ( rule__PrimitiveProperty__Group__0__Impl rule__PrimitiveProperty__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1691:2: rule__PrimitiveProperty__Group__0__Impl rule__PrimitiveProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__0__Impl_in_rule__PrimitiveProperty__Group__03398);
            rule__PrimitiveProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__1_in_rule__PrimitiveProperty__Group__03401);
            rule__PrimitiveProperty__Group__1();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__0"


    // $ANTLR start "rule__PrimitiveProperty__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1698:1: rule__PrimitiveProperty__Group__0__Impl : ( 'PrimitiveProperty' ) ;
    public final void rule__PrimitiveProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1702:1: ( ( 'PrimitiveProperty' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1703:1: ( 'PrimitiveProperty' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1703:1: ( 'PrimitiveProperty' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1704:1: 'PrimitiveProperty'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getPrimitivePropertyKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__PrimitiveProperty__Group__0__Impl3429); 
             after(grammarAccess.getPrimitivePropertyAccess().getPrimitivePropertyKeyword_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1717:1: rule__PrimitiveProperty__Group__1 : rule__PrimitiveProperty__Group__1__Impl rule__PrimitiveProperty__Group__2 ;
    public final void rule__PrimitiveProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1721:1: ( rule__PrimitiveProperty__Group__1__Impl rule__PrimitiveProperty__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1722:2: rule__PrimitiveProperty__Group__1__Impl rule__PrimitiveProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__1__Impl_in_rule__PrimitiveProperty__Group__13460);
            rule__PrimitiveProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__2_in_rule__PrimitiveProperty__Group__13463);
            rule__PrimitiveProperty__Group__2();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__1"


    // $ANTLR start "rule__PrimitiveProperty__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1729:1: rule__PrimitiveProperty__Group__1__Impl : ( ( rule__PrimitiveProperty__UnorderedGroup_1 ) ) ;
    public final void rule__PrimitiveProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1733:1: ( ( ( rule__PrimitiveProperty__UnorderedGroup_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1734:1: ( ( rule__PrimitiveProperty__UnorderedGroup_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1734:1: ( ( rule__PrimitiveProperty__UnorderedGroup_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1735:1: ( rule__PrimitiveProperty__UnorderedGroup_1 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1736:1: ( rule__PrimitiveProperty__UnorderedGroup_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1736:2: rule__PrimitiveProperty__UnorderedGroup_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1_in_rule__PrimitiveProperty__Group__1__Impl3490);
            rule__PrimitiveProperty__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1746:1: rule__PrimitiveProperty__Group__2 : rule__PrimitiveProperty__Group__2__Impl rule__PrimitiveProperty__Group__3 ;
    public final void rule__PrimitiveProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1750:1: ( rule__PrimitiveProperty__Group__2__Impl rule__PrimitiveProperty__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1751:2: rule__PrimitiveProperty__Group__2__Impl rule__PrimitiveProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__2__Impl_in_rule__PrimitiveProperty__Group__23520);
            rule__PrimitiveProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__3_in_rule__PrimitiveProperty__Group__23523);
            rule__PrimitiveProperty__Group__3();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__2"


    // $ANTLR start "rule__PrimitiveProperty__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1758:1: rule__PrimitiveProperty__Group__2__Impl : ( ( rule__PrimitiveProperty__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1762:1: ( ( ( rule__PrimitiveProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1763:1: ( ( rule__PrimitiveProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1763:1: ( ( rule__PrimitiveProperty__NameAssignment_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1764:1: ( rule__PrimitiveProperty__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1765:1: ( rule__PrimitiveProperty__NameAssignment_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1765:2: rule__PrimitiveProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__NameAssignment_2_in_rule__PrimitiveProperty__Group__2__Impl3550);
            rule__PrimitiveProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1775:1: rule__PrimitiveProperty__Group__3 : rule__PrimitiveProperty__Group__3__Impl rule__PrimitiveProperty__Group__4 ;
    public final void rule__PrimitiveProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1779:1: ( rule__PrimitiveProperty__Group__3__Impl rule__PrimitiveProperty__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1780:2: rule__PrimitiveProperty__Group__3__Impl rule__PrimitiveProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__3__Impl_in_rule__PrimitiveProperty__Group__33580);
            rule__PrimitiveProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__4_in_rule__PrimitiveProperty__Group__33583);
            rule__PrimitiveProperty__Group__4();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__3"


    // $ANTLR start "rule__PrimitiveProperty__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1787:1: rule__PrimitiveProperty__Group__3__Impl : ( ( rule__PrimitiveProperty__Alternatives_3 )? ) ;
    public final void rule__PrimitiveProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1791:1: ( ( ( rule__PrimitiveProperty__Alternatives_3 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1792:1: ( ( rule__PrimitiveProperty__Alternatives_3 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1792:1: ( ( rule__PrimitiveProperty__Alternatives_3 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1793:1: ( rule__PrimitiveProperty__Alternatives_3 )?
            {
             before(grammarAccess.getPrimitivePropertyAccess().getAlternatives_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1794:1: ( rule__PrimitiveProperty__Alternatives_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1794:2: rule__PrimitiveProperty__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Alternatives_3_in_rule__PrimitiveProperty__Group__3__Impl3610);
                    rule__PrimitiveProperty__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitivePropertyAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1804:1: rule__PrimitiveProperty__Group__4 : rule__PrimitiveProperty__Group__4__Impl rule__PrimitiveProperty__Group__5 ;
    public final void rule__PrimitiveProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1808:1: ( rule__PrimitiveProperty__Group__4__Impl rule__PrimitiveProperty__Group__5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1809:2: rule__PrimitiveProperty__Group__4__Impl rule__PrimitiveProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__4__Impl_in_rule__PrimitiveProperty__Group__43641);
            rule__PrimitiveProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__5_in_rule__PrimitiveProperty__Group__43644);
            rule__PrimitiveProperty__Group__5();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__4"


    // $ANTLR start "rule__PrimitiveProperty__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1816:1: rule__PrimitiveProperty__Group__4__Impl : ( ':' ) ;
    public final void rule__PrimitiveProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1820:1: ( ( ':' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1821:1: ( ':' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1821:1: ( ':' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1822:1: ':'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getColonKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__PrimitiveProperty__Group__4__Impl3672); 
             after(grammarAccess.getPrimitivePropertyAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__4__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1835:1: rule__PrimitiveProperty__Group__5 : rule__PrimitiveProperty__Group__5__Impl rule__PrimitiveProperty__Group__6 ;
    public final void rule__PrimitiveProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1839:1: ( rule__PrimitiveProperty__Group__5__Impl rule__PrimitiveProperty__Group__6 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1840:2: rule__PrimitiveProperty__Group__5__Impl rule__PrimitiveProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__5__Impl_in_rule__PrimitiveProperty__Group__53703);
            rule__PrimitiveProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__6_in_rule__PrimitiveProperty__Group__53706);
            rule__PrimitiveProperty__Group__6();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__5"


    // $ANTLR start "rule__PrimitiveProperty__Group__5__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1847:1: rule__PrimitiveProperty__Group__5__Impl : ( ( rule__PrimitiveProperty__TypeAssignment_5 ) ) ;
    public final void rule__PrimitiveProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1851:1: ( ( ( rule__PrimitiveProperty__TypeAssignment_5 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1852:1: ( ( rule__PrimitiveProperty__TypeAssignment_5 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1852:1: ( ( rule__PrimitiveProperty__TypeAssignment_5 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1853:1: ( rule__PrimitiveProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getTypeAssignment_5()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1854:1: ( rule__PrimitiveProperty__TypeAssignment_5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1854:2: rule__PrimitiveProperty__TypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__TypeAssignment_5_in_rule__PrimitiveProperty__Group__5__Impl3733);
            rule__PrimitiveProperty__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getTypeAssignment_5()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__5__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group__6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1864:1: rule__PrimitiveProperty__Group__6 : rule__PrimitiveProperty__Group__6__Impl ;
    public final void rule__PrimitiveProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1868:1: ( rule__PrimitiveProperty__Group__6__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1869:2: rule__PrimitiveProperty__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group__6__Impl_in_rule__PrimitiveProperty__Group__63763);
            rule__PrimitiveProperty__Group__6__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__Group__6"


    // $ANTLR start "rule__PrimitiveProperty__Group__6__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1875:1: rule__PrimitiveProperty__Group__6__Impl : ( ( rule__PrimitiveProperty__Group_6__0 )? ) ;
    public final void rule__PrimitiveProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1879:1: ( ( ( rule__PrimitiveProperty__Group_6__0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1880:1: ( ( rule__PrimitiveProperty__Group_6__0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1880:1: ( ( rule__PrimitiveProperty__Group_6__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1881:1: ( rule__PrimitiveProperty__Group_6__0 )?
            {
             before(grammarAccess.getPrimitivePropertyAccess().getGroup_6()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1882:1: ( rule__PrimitiveProperty__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1882:2: rule__PrimitiveProperty__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_6__0_in_rule__PrimitiveProperty__Group__6__Impl3790);
                    rule__PrimitiveProperty__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitivePropertyAccess().getGroup_6()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group__6__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1906:1: rule__PrimitiveProperty__Group_3_0__0 : rule__PrimitiveProperty__Group_3_0__0__Impl rule__PrimitiveProperty__Group_3_0__1 ;
    public final void rule__PrimitiveProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1910:1: ( rule__PrimitiveProperty__Group_3_0__0__Impl rule__PrimitiveProperty__Group_3_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1911:2: rule__PrimitiveProperty__Group_3_0__0__Impl rule__PrimitiveProperty__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_0__0__Impl_in_rule__PrimitiveProperty__Group_3_0__03835);
            rule__PrimitiveProperty__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_0__1_in_rule__PrimitiveProperty__Group_3_0__03838);
            rule__PrimitiveProperty__Group_3_0__1();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_0__0"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1918:1: rule__PrimitiveProperty__Group_3_0__0__Impl : ( '[' ) ;
    public final void rule__PrimitiveProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1922:1: ( ( '[' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1923:1: ( '[' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1923:1: ( '[' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1924:1: '['
            {
             before(grammarAccess.getPrimitivePropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__PrimitiveProperty__Group_3_0__0__Impl3866); 
             after(grammarAccess.getPrimitivePropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_0__0__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1937:1: rule__PrimitiveProperty__Group_3_0__1 : rule__PrimitiveProperty__Group_3_0__1__Impl ;
    public final void rule__PrimitiveProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1941:1: ( rule__PrimitiveProperty__Group_3_0__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1942:2: rule__PrimitiveProperty__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_0__1__Impl_in_rule__PrimitiveProperty__Group_3_0__13897);
            rule__PrimitiveProperty__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_0__1"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1948:1: rule__PrimitiveProperty__Group_3_0__1__Impl : ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 ) ) ;
    public final void rule__PrimitiveProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1952:1: ( ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1953:1: ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1953:1: ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1954:1: ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getUpperBoundAssignment_3_0_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1955:1: ( rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1955:2: rule__PrimitiveProperty__UpperBoundAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UpperBoundAssignment_3_0_1_in_rule__PrimitiveProperty__Group_3_0__1__Impl3924);
            rule__PrimitiveProperty__UpperBoundAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getUpperBoundAssignment_3_0_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_0__1__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1969:1: rule__PrimitiveProperty__Group_3_1__0 : rule__PrimitiveProperty__Group_3_1__0__Impl rule__PrimitiveProperty__Group_3_1__1 ;
    public final void rule__PrimitiveProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1973:1: ( rule__PrimitiveProperty__Group_3_1__0__Impl rule__PrimitiveProperty__Group_3_1__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1974:2: rule__PrimitiveProperty__Group_3_1__0__Impl rule__PrimitiveProperty__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1__0__Impl_in_rule__PrimitiveProperty__Group_3_1__03958);
            rule__PrimitiveProperty__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1__1_in_rule__PrimitiveProperty__Group_3_1__03961);
            rule__PrimitiveProperty__Group_3_1__1();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1__0"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1981:1: rule__PrimitiveProperty__Group_3_1__0__Impl : ( ( rule__PrimitiveProperty__Group_3_1_0__0 ) ) ;
    public final void rule__PrimitiveProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1985:1: ( ( ( rule__PrimitiveProperty__Group_3_1_0__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1986:1: ( ( rule__PrimitiveProperty__Group_3_1_0__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1986:1: ( ( rule__PrimitiveProperty__Group_3_1_0__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1987:1: ( rule__PrimitiveProperty__Group_3_1_0__0 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getGroup_3_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1988:1: ( rule__PrimitiveProperty__Group_3_1_0__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1988:2: rule__PrimitiveProperty__Group_3_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__0_in_rule__PrimitiveProperty__Group_3_1__0__Impl3988);
            rule__PrimitiveProperty__Group_3_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getGroup_3_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1__0__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:1998:1: rule__PrimitiveProperty__Group_3_1__1 : rule__PrimitiveProperty__Group_3_1__1__Impl ;
    public final void rule__PrimitiveProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2002:1: ( rule__PrimitiveProperty__Group_3_1__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2003:2: rule__PrimitiveProperty__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1__1__Impl_in_rule__PrimitiveProperty__Group_3_1__14018);
            rule__PrimitiveProperty__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1__1"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2009:1: rule__PrimitiveProperty__Group_3_1__1__Impl : ( ']' ) ;
    public final void rule__PrimitiveProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2013:1: ( ( ']' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2014:1: ( ']' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2014:1: ( ']' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2015:1: ']'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getRightSquareBracketKeyword_3_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__PrimitiveProperty__Group_3_1__1__Impl4046); 
             after(grammarAccess.getPrimitivePropertyAccess().getRightSquareBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1__1__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2032:1: rule__PrimitiveProperty__Group_3_1_0__0 : rule__PrimitiveProperty__Group_3_1_0__0__Impl rule__PrimitiveProperty__Group_3_1_0__1 ;
    public final void rule__PrimitiveProperty__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2036:1: ( rule__PrimitiveProperty__Group_3_1_0__0__Impl rule__PrimitiveProperty__Group_3_1_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2037:2: rule__PrimitiveProperty__Group_3_1_0__0__Impl rule__PrimitiveProperty__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__0__Impl_in_rule__PrimitiveProperty__Group_3_1_0__04081);
            rule__PrimitiveProperty__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__1_in_rule__PrimitiveProperty__Group_3_1_0__04084);
            rule__PrimitiveProperty__Group_3_1_0__1();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__0"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2044:1: rule__PrimitiveProperty__Group_3_1_0__0__Impl : ( ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 ) ) ;
    public final void rule__PrimitiveProperty__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2048:1: ( ( ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2049:1: ( ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2049:1: ( ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2050:1: ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getLowerBoundAssignment_3_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2051:1: ( rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2051:2: rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0_in_rule__PrimitiveProperty__Group_3_1_0__0__Impl4111);
            rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getLowerBoundAssignment_3_1_0_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2061:1: rule__PrimitiveProperty__Group_3_1_0__1 : rule__PrimitiveProperty__Group_3_1_0__1__Impl rule__PrimitiveProperty__Group_3_1_0__2 ;
    public final void rule__PrimitiveProperty__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2065:1: ( rule__PrimitiveProperty__Group_3_1_0__1__Impl rule__PrimitiveProperty__Group_3_1_0__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2066:2: rule__PrimitiveProperty__Group_3_1_0__1__Impl rule__PrimitiveProperty__Group_3_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__1__Impl_in_rule__PrimitiveProperty__Group_3_1_0__14141);
            rule__PrimitiveProperty__Group_3_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__2_in_rule__PrimitiveProperty__Group_3_1_0__14144);
            rule__PrimitiveProperty__Group_3_1_0__2();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__1"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2073:1: rule__PrimitiveProperty__Group_3_1_0__1__Impl : ( '..' ) ;
    public final void rule__PrimitiveProperty__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2077:1: ( ( '..' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2078:1: ( '..' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2078:1: ( '..' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2079:1: '..'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__PrimitiveProperty__Group_3_1_0__1__Impl4172); 
             after(grammarAccess.getPrimitivePropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2092:1: rule__PrimitiveProperty__Group_3_1_0__2 : rule__PrimitiveProperty__Group_3_1_0__2__Impl ;
    public final void rule__PrimitiveProperty__Group_3_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2096:1: ( rule__PrimitiveProperty__Group_3_1_0__2__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2097:2: rule__PrimitiveProperty__Group_3_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_3_1_0__2__Impl_in_rule__PrimitiveProperty__Group_3_1_0__24203);
            rule__PrimitiveProperty__Group_3_1_0__2__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__2"


    // $ANTLR start "rule__PrimitiveProperty__Group_3_1_0__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2103:1: rule__PrimitiveProperty__Group_3_1_0__2__Impl : ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 ) ) ;
    public final void rule__PrimitiveProperty__Group_3_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2107:1: ( ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2108:1: ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2108:1: ( ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2109:1: ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getUpperBoundAssignment_3_1_0_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2110:1: ( rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2110:2: rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2_in_rule__PrimitiveProperty__Group_3_1_0__2__Impl4230);
            rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getUpperBoundAssignment_3_1_0_2()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_3_1_0__2__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_6__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2126:1: rule__PrimitiveProperty__Group_6__0 : rule__PrimitiveProperty__Group_6__0__Impl rule__PrimitiveProperty__Group_6__1 ;
    public final void rule__PrimitiveProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2130:1: ( rule__PrimitiveProperty__Group_6__0__Impl rule__PrimitiveProperty__Group_6__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2131:2: rule__PrimitiveProperty__Group_6__0__Impl rule__PrimitiveProperty__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_6__0__Impl_in_rule__PrimitiveProperty__Group_6__04266);
            rule__PrimitiveProperty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_6__1_in_rule__PrimitiveProperty__Group_6__04269);
            rule__PrimitiveProperty__Group_6__1();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_6__0"


    // $ANTLR start "rule__PrimitiveProperty__Group_6__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2138:1: rule__PrimitiveProperty__Group_6__0__Impl : ( '=' ) ;
    public final void rule__PrimitiveProperty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2142:1: ( ( '=' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2143:1: ( '=' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2143:1: ( '=' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2144:1: '='
            {
             before(grammarAccess.getPrimitivePropertyAccess().getEqualsSignKeyword_6_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PrimitiveProperty__Group_6__0__Impl4297); 
             after(grammarAccess.getPrimitivePropertyAccess().getEqualsSignKeyword_6_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_6__0__Impl"


    // $ANTLR start "rule__PrimitiveProperty__Group_6__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2157:1: rule__PrimitiveProperty__Group_6__1 : rule__PrimitiveProperty__Group_6__1__Impl ;
    public final void rule__PrimitiveProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2161:1: ( rule__PrimitiveProperty__Group_6__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2162:2: rule__PrimitiveProperty__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__Group_6__1__Impl_in_rule__PrimitiveProperty__Group_6__14328);
            rule__PrimitiveProperty__Group_6__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__Group_6__1"


    // $ANTLR start "rule__PrimitiveProperty__Group_6__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2168:1: rule__PrimitiveProperty__Group_6__1__Impl : ( ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 ) ) ;
    public final void rule__PrimitiveProperty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2172:1: ( ( ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2173:1: ( ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2173:1: ( ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2174:1: ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getDefaultValueAssignment_6_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2175:1: ( rule__PrimitiveProperty__DefaultValueAssignment_6_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2175:2: rule__PrimitiveProperty__DefaultValueAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__DefaultValueAssignment_6_1_in_rule__PrimitiveProperty__Group_6__1__Impl4355);
            rule__PrimitiveProperty__DefaultValueAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertyAccess().getDefaultValueAssignment_6_1()); 

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
    // $ANTLR end "rule__PrimitiveProperty__Group_6__1__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2189:1: rule__AssociationProperty__Group__0 : rule__AssociationProperty__Group__0__Impl rule__AssociationProperty__Group__1 ;
    public final void rule__AssociationProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2193:1: ( rule__AssociationProperty__Group__0__Impl rule__AssociationProperty__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2194:2: rule__AssociationProperty__Group__0__Impl rule__AssociationProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__0__Impl_in_rule__AssociationProperty__Group__04389);
            rule__AssociationProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__1_in_rule__AssociationProperty__Group__04392);
            rule__AssociationProperty__Group__1();

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
    // $ANTLR end "rule__AssociationProperty__Group__0"


    // $ANTLR start "rule__AssociationProperty__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2201:1: rule__AssociationProperty__Group__0__Impl : ( 'AssociationProperty' ) ;
    public final void rule__AssociationProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2205:1: ( ( 'AssociationProperty' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2206:1: ( 'AssociationProperty' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2206:1: ( 'AssociationProperty' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2207:1: 'AssociationProperty'
            {
             before(grammarAccess.getAssociationPropertyAccess().getAssociationPropertyKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AssociationProperty__Group__0__Impl4420); 
             after(grammarAccess.getAssociationPropertyAccess().getAssociationPropertyKeyword_0()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__0__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2220:1: rule__AssociationProperty__Group__1 : rule__AssociationProperty__Group__1__Impl rule__AssociationProperty__Group__2 ;
    public final void rule__AssociationProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2224:1: ( rule__AssociationProperty__Group__1__Impl rule__AssociationProperty__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2225:2: rule__AssociationProperty__Group__1__Impl rule__AssociationProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__1__Impl_in_rule__AssociationProperty__Group__14451);
            rule__AssociationProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__2_in_rule__AssociationProperty__Group__14454);
            rule__AssociationProperty__Group__2();

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
    // $ANTLR end "rule__AssociationProperty__Group__1"


    // $ANTLR start "rule__AssociationProperty__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2232:1: rule__AssociationProperty__Group__1__Impl : ( ( rule__AssociationProperty__UnorderedGroup_1 ) ) ;
    public final void rule__AssociationProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2236:1: ( ( ( rule__AssociationProperty__UnorderedGroup_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2237:1: ( ( rule__AssociationProperty__UnorderedGroup_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2237:1: ( ( rule__AssociationProperty__UnorderedGroup_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2238:1: ( rule__AssociationProperty__UnorderedGroup_1 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2239:1: ( rule__AssociationProperty__UnorderedGroup_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2239:2: rule__AssociationProperty__UnorderedGroup_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UnorderedGroup_1_in_rule__AssociationProperty__Group__1__Impl4481);
            rule__AssociationProperty__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__1__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2249:1: rule__AssociationProperty__Group__2 : rule__AssociationProperty__Group__2__Impl rule__AssociationProperty__Group__3 ;
    public final void rule__AssociationProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2253:1: ( rule__AssociationProperty__Group__2__Impl rule__AssociationProperty__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2254:2: rule__AssociationProperty__Group__2__Impl rule__AssociationProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__2__Impl_in_rule__AssociationProperty__Group__24511);
            rule__AssociationProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__3_in_rule__AssociationProperty__Group__24514);
            rule__AssociationProperty__Group__3();

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
    // $ANTLR end "rule__AssociationProperty__Group__2"


    // $ANTLR start "rule__AssociationProperty__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2261:1: rule__AssociationProperty__Group__2__Impl : ( ( rule__AssociationProperty__NameAssignment_2 ) ) ;
    public final void rule__AssociationProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2265:1: ( ( ( rule__AssociationProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2266:1: ( ( rule__AssociationProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2266:1: ( ( rule__AssociationProperty__NameAssignment_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2267:1: ( rule__AssociationProperty__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2268:1: ( rule__AssociationProperty__NameAssignment_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2268:2: rule__AssociationProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__NameAssignment_2_in_rule__AssociationProperty__Group__2__Impl4541);
            rule__AssociationProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__2__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2278:1: rule__AssociationProperty__Group__3 : rule__AssociationProperty__Group__3__Impl rule__AssociationProperty__Group__4 ;
    public final void rule__AssociationProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2282:1: ( rule__AssociationProperty__Group__3__Impl rule__AssociationProperty__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2283:2: rule__AssociationProperty__Group__3__Impl rule__AssociationProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__3__Impl_in_rule__AssociationProperty__Group__34571);
            rule__AssociationProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__4_in_rule__AssociationProperty__Group__34574);
            rule__AssociationProperty__Group__4();

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
    // $ANTLR end "rule__AssociationProperty__Group__3"


    // $ANTLR start "rule__AssociationProperty__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2290:1: rule__AssociationProperty__Group__3__Impl : ( ( rule__AssociationProperty__Alternatives_3 )? ) ;
    public final void rule__AssociationProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2294:1: ( ( ( rule__AssociationProperty__Alternatives_3 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2295:1: ( ( rule__AssociationProperty__Alternatives_3 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2295:1: ( ( rule__AssociationProperty__Alternatives_3 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2296:1: ( rule__AssociationProperty__Alternatives_3 )?
            {
             before(grammarAccess.getAssociationPropertyAccess().getAlternatives_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2297:1: ( rule__AssociationProperty__Alternatives_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2297:2: rule__AssociationProperty__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Alternatives_3_in_rule__AssociationProperty__Group__3__Impl4601);
                    rule__AssociationProperty__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertyAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__3__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2307:1: rule__AssociationProperty__Group__4 : rule__AssociationProperty__Group__4__Impl rule__AssociationProperty__Group__5 ;
    public final void rule__AssociationProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2311:1: ( rule__AssociationProperty__Group__4__Impl rule__AssociationProperty__Group__5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2312:2: rule__AssociationProperty__Group__4__Impl rule__AssociationProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__4__Impl_in_rule__AssociationProperty__Group__44632);
            rule__AssociationProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__5_in_rule__AssociationProperty__Group__44635);
            rule__AssociationProperty__Group__5();

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
    // $ANTLR end "rule__AssociationProperty__Group__4"


    // $ANTLR start "rule__AssociationProperty__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2319:1: rule__AssociationProperty__Group__4__Impl : ( ( rule__AssociationProperty__Group_4__0 )? ) ;
    public final void rule__AssociationProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2323:1: ( ( ( rule__AssociationProperty__Group_4__0 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2324:1: ( ( rule__AssociationProperty__Group_4__0 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2324:1: ( ( rule__AssociationProperty__Group_4__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2325:1: ( rule__AssociationProperty__Group_4__0 )?
            {
             before(grammarAccess.getAssociationPropertyAccess().getGroup_4()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2326:1: ( rule__AssociationProperty__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2326:2: rule__AssociationProperty__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_4__0_in_rule__AssociationProperty__Group__4__Impl4662);
                    rule__AssociationProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationPropertyAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__4__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2336:1: rule__AssociationProperty__Group__5 : rule__AssociationProperty__Group__5__Impl rule__AssociationProperty__Group__6 ;
    public final void rule__AssociationProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2340:1: ( rule__AssociationProperty__Group__5__Impl rule__AssociationProperty__Group__6 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2341:2: rule__AssociationProperty__Group__5__Impl rule__AssociationProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__5__Impl_in_rule__AssociationProperty__Group__54693);
            rule__AssociationProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__6_in_rule__AssociationProperty__Group__54696);
            rule__AssociationProperty__Group__6();

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
    // $ANTLR end "rule__AssociationProperty__Group__5"


    // $ANTLR start "rule__AssociationProperty__Group__5__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2348:1: rule__AssociationProperty__Group__5__Impl : ( ':' ) ;
    public final void rule__AssociationProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2352:1: ( ( ':' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2353:1: ( ':' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2353:1: ( ':' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2354:1: ':'
            {
             before(grammarAccess.getAssociationPropertyAccess().getColonKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__AssociationProperty__Group__5__Impl4724); 
             after(grammarAccess.getAssociationPropertyAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__5__Impl"


    // $ANTLR start "rule__AssociationProperty__Group__6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2367:1: rule__AssociationProperty__Group__6 : rule__AssociationProperty__Group__6__Impl ;
    public final void rule__AssociationProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2371:1: ( rule__AssociationProperty__Group__6__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2372:2: rule__AssociationProperty__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group__6__Impl_in_rule__AssociationProperty__Group__64755);
            rule__AssociationProperty__Group__6__Impl();

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
    // $ANTLR end "rule__AssociationProperty__Group__6"


    // $ANTLR start "rule__AssociationProperty__Group__6__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2378:1: rule__AssociationProperty__Group__6__Impl : ( ( rule__AssociationProperty__TypeAssignment_6 ) ) ;
    public final void rule__AssociationProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2382:1: ( ( ( rule__AssociationProperty__TypeAssignment_6 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2383:1: ( ( rule__AssociationProperty__TypeAssignment_6 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2383:1: ( ( rule__AssociationProperty__TypeAssignment_6 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2384:1: ( rule__AssociationProperty__TypeAssignment_6 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getTypeAssignment_6()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2385:1: ( rule__AssociationProperty__TypeAssignment_6 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2385:2: rule__AssociationProperty__TypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__TypeAssignment_6_in_rule__AssociationProperty__Group__6__Impl4782);
            rule__AssociationProperty__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__AssociationProperty__Group__6__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2409:1: rule__AssociationProperty__Group_3_0__0 : rule__AssociationProperty__Group_3_0__0__Impl rule__AssociationProperty__Group_3_0__1 ;
    public final void rule__AssociationProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2413:1: ( rule__AssociationProperty__Group_3_0__0__Impl rule__AssociationProperty__Group_3_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2414:2: rule__AssociationProperty__Group_3_0__0__Impl rule__AssociationProperty__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_0__0__Impl_in_rule__AssociationProperty__Group_3_0__04826);
            rule__AssociationProperty__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_0__1_in_rule__AssociationProperty__Group_3_0__04829);
            rule__AssociationProperty__Group_3_0__1();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_0__0"


    // $ANTLR start "rule__AssociationProperty__Group_3_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2421:1: rule__AssociationProperty__Group_3_0__0__Impl : ( '[' ) ;
    public final void rule__AssociationProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2425:1: ( ( '[' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2426:1: ( '[' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2426:1: ( '[' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2427:1: '['
            {
             before(grammarAccess.getAssociationPropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AssociationProperty__Group_3_0__0__Impl4857); 
             after(grammarAccess.getAssociationPropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_0__0__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2440:1: rule__AssociationProperty__Group_3_0__1 : rule__AssociationProperty__Group_3_0__1__Impl ;
    public final void rule__AssociationProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2444:1: ( rule__AssociationProperty__Group_3_0__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2445:2: rule__AssociationProperty__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_0__1__Impl_in_rule__AssociationProperty__Group_3_0__14888);
            rule__AssociationProperty__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_0__1"


    // $ANTLR start "rule__AssociationProperty__Group_3_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2451:1: rule__AssociationProperty__Group_3_0__1__Impl : ( ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 ) ) ;
    public final void rule__AssociationProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2455:1: ( ( ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2456:1: ( ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2456:1: ( ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2457:1: ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getUpperBoundAssignment_3_0_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2458:1: ( rule__AssociationProperty__UpperBoundAssignment_3_0_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2458:2: rule__AssociationProperty__UpperBoundAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UpperBoundAssignment_3_0_1_in_rule__AssociationProperty__Group_3_0__1__Impl4915);
            rule__AssociationProperty__UpperBoundAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getUpperBoundAssignment_3_0_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_0__1__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2472:1: rule__AssociationProperty__Group_3_1__0 : rule__AssociationProperty__Group_3_1__0__Impl rule__AssociationProperty__Group_3_1__1 ;
    public final void rule__AssociationProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2476:1: ( rule__AssociationProperty__Group_3_1__0__Impl rule__AssociationProperty__Group_3_1__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2477:2: rule__AssociationProperty__Group_3_1__0__Impl rule__AssociationProperty__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1__0__Impl_in_rule__AssociationProperty__Group_3_1__04949);
            rule__AssociationProperty__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1__1_in_rule__AssociationProperty__Group_3_1__04952);
            rule__AssociationProperty__Group_3_1__1();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1__0"


    // $ANTLR start "rule__AssociationProperty__Group_3_1__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2484:1: rule__AssociationProperty__Group_3_1__0__Impl : ( ( rule__AssociationProperty__Group_3_1_0__0 ) ) ;
    public final void rule__AssociationProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2488:1: ( ( ( rule__AssociationProperty__Group_3_1_0__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2489:1: ( ( rule__AssociationProperty__Group_3_1_0__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2489:1: ( ( rule__AssociationProperty__Group_3_1_0__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2490:1: ( rule__AssociationProperty__Group_3_1_0__0 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getGroup_3_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2491:1: ( rule__AssociationProperty__Group_3_1_0__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2491:2: rule__AssociationProperty__Group_3_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__0_in_rule__AssociationProperty__Group_3_1__0__Impl4979);
            rule__AssociationProperty__Group_3_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getGroup_3_1_0()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1__0__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2501:1: rule__AssociationProperty__Group_3_1__1 : rule__AssociationProperty__Group_3_1__1__Impl ;
    public final void rule__AssociationProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2505:1: ( rule__AssociationProperty__Group_3_1__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2506:2: rule__AssociationProperty__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1__1__Impl_in_rule__AssociationProperty__Group_3_1__15009);
            rule__AssociationProperty__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1__1"


    // $ANTLR start "rule__AssociationProperty__Group_3_1__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2512:1: rule__AssociationProperty__Group_3_1__1__Impl : ( ']' ) ;
    public final void rule__AssociationProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2516:1: ( ( ']' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2517:1: ( ']' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2517:1: ( ']' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2518:1: ']'
            {
             before(grammarAccess.getAssociationPropertyAccess().getRightSquareBracketKeyword_3_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AssociationProperty__Group_3_1__1__Impl5037); 
             after(grammarAccess.getAssociationPropertyAccess().getRightSquareBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1__1__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2535:1: rule__AssociationProperty__Group_3_1_0__0 : rule__AssociationProperty__Group_3_1_0__0__Impl rule__AssociationProperty__Group_3_1_0__1 ;
    public final void rule__AssociationProperty__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2539:1: ( rule__AssociationProperty__Group_3_1_0__0__Impl rule__AssociationProperty__Group_3_1_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2540:2: rule__AssociationProperty__Group_3_1_0__0__Impl rule__AssociationProperty__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__0__Impl_in_rule__AssociationProperty__Group_3_1_0__05072);
            rule__AssociationProperty__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__1_in_rule__AssociationProperty__Group_3_1_0__05075);
            rule__AssociationProperty__Group_3_1_0__1();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__0"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2547:1: rule__AssociationProperty__Group_3_1_0__0__Impl : ( ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 ) ) ;
    public final void rule__AssociationProperty__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2551:1: ( ( ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2552:1: ( ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2552:1: ( ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2553:1: ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getLowerBoundAssignment_3_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2554:1: ( rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2554:2: rule__AssociationProperty__LowerBoundAssignment_3_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__LowerBoundAssignment_3_1_0_0_in_rule__AssociationProperty__Group_3_1_0__0__Impl5102);
            rule__AssociationProperty__LowerBoundAssignment_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getLowerBoundAssignment_3_1_0_0()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2564:1: rule__AssociationProperty__Group_3_1_0__1 : rule__AssociationProperty__Group_3_1_0__1__Impl rule__AssociationProperty__Group_3_1_0__2 ;
    public final void rule__AssociationProperty__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2568:1: ( rule__AssociationProperty__Group_3_1_0__1__Impl rule__AssociationProperty__Group_3_1_0__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2569:2: rule__AssociationProperty__Group_3_1_0__1__Impl rule__AssociationProperty__Group_3_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__1__Impl_in_rule__AssociationProperty__Group_3_1_0__15132);
            rule__AssociationProperty__Group_3_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__2_in_rule__AssociationProperty__Group_3_1_0__15135);
            rule__AssociationProperty__Group_3_1_0__2();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__1"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2576:1: rule__AssociationProperty__Group_3_1_0__1__Impl : ( '..' ) ;
    public final void rule__AssociationProperty__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2580:1: ( ( '..' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2581:1: ( '..' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2581:1: ( '..' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2582:1: '..'
            {
             before(grammarAccess.getAssociationPropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AssociationProperty__Group_3_1_0__1__Impl5163); 
             after(grammarAccess.getAssociationPropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2595:1: rule__AssociationProperty__Group_3_1_0__2 : rule__AssociationProperty__Group_3_1_0__2__Impl ;
    public final void rule__AssociationProperty__Group_3_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2599:1: ( rule__AssociationProperty__Group_3_1_0__2__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2600:2: rule__AssociationProperty__Group_3_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_3_1_0__2__Impl_in_rule__AssociationProperty__Group_3_1_0__25194);
            rule__AssociationProperty__Group_3_1_0__2__Impl();

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__2"


    // $ANTLR start "rule__AssociationProperty__Group_3_1_0__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2606:1: rule__AssociationProperty__Group_3_1_0__2__Impl : ( ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 ) ) ;
    public final void rule__AssociationProperty__Group_3_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2610:1: ( ( ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2611:1: ( ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2611:1: ( ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2612:1: ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getUpperBoundAssignment_3_1_0_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2613:1: ( rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2613:2: rule__AssociationProperty__UpperBoundAssignment_3_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UpperBoundAssignment_3_1_0_2_in_rule__AssociationProperty__Group_3_1_0__2__Impl5221);
            rule__AssociationProperty__UpperBoundAssignment_3_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getUpperBoundAssignment_3_1_0_2()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_3_1_0__2__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_4__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2629:1: rule__AssociationProperty__Group_4__0 : rule__AssociationProperty__Group_4__0__Impl rule__AssociationProperty__Group_4__1 ;
    public final void rule__AssociationProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2633:1: ( rule__AssociationProperty__Group_4__0__Impl rule__AssociationProperty__Group_4__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2634:2: rule__AssociationProperty__Group_4__0__Impl rule__AssociationProperty__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_4__0__Impl_in_rule__AssociationProperty__Group_4__05257);
            rule__AssociationProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_4__1_in_rule__AssociationProperty__Group_4__05260);
            rule__AssociationProperty__Group_4__1();

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
    // $ANTLR end "rule__AssociationProperty__Group_4__0"


    // $ANTLR start "rule__AssociationProperty__Group_4__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2641:1: rule__AssociationProperty__Group_4__0__Impl : ( 'oposite' ) ;
    public final void rule__AssociationProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2645:1: ( ( 'oposite' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2646:1: ( 'oposite' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2646:1: ( 'oposite' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2647:1: 'oposite'
            {
             before(grammarAccess.getAssociationPropertyAccess().getOpositeKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AssociationProperty__Group_4__0__Impl5288); 
             after(grammarAccess.getAssociationPropertyAccess().getOpositeKeyword_4_0()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_4__0__Impl"


    // $ANTLR start "rule__AssociationProperty__Group_4__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2660:1: rule__AssociationProperty__Group_4__1 : rule__AssociationProperty__Group_4__1__Impl ;
    public final void rule__AssociationProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2664:1: ( rule__AssociationProperty__Group_4__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2665:2: rule__AssociationProperty__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__Group_4__1__Impl_in_rule__AssociationProperty__Group_4__15319);
            rule__AssociationProperty__Group_4__1__Impl();

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
    // $ANTLR end "rule__AssociationProperty__Group_4__1"


    // $ANTLR start "rule__AssociationProperty__Group_4__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2671:1: rule__AssociationProperty__Group_4__1__Impl : ( ( rule__AssociationProperty__OppositePropertyAssignment_4_1 ) ) ;
    public final void rule__AssociationProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2675:1: ( ( ( rule__AssociationProperty__OppositePropertyAssignment_4_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2676:1: ( ( rule__AssociationProperty__OppositePropertyAssignment_4_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2676:1: ( ( rule__AssociationProperty__OppositePropertyAssignment_4_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2677:1: ( rule__AssociationProperty__OppositePropertyAssignment_4_1 )
            {
             before(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssignment_4_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2678:1: ( rule__AssociationProperty__OppositePropertyAssignment_4_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2678:2: rule__AssociationProperty__OppositePropertyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__OppositePropertyAssignment_4_1_in_rule__AssociationProperty__Group_4__1__Impl5346);
            rule__AssociationProperty__OppositePropertyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssignment_4_1()); 

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
    // $ANTLR end "rule__AssociationProperty__Group_4__1__Impl"


    // $ANTLR start "rule__NestedProperty__Group__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2692:1: rule__NestedProperty__Group__0 : rule__NestedProperty__Group__0__Impl rule__NestedProperty__Group__1 ;
    public final void rule__NestedProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2696:1: ( rule__NestedProperty__Group__0__Impl rule__NestedProperty__Group__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2697:2: rule__NestedProperty__Group__0__Impl rule__NestedProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__0__Impl_in_rule__NestedProperty__Group__05380);
            rule__NestedProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__1_in_rule__NestedProperty__Group__05383);
            rule__NestedProperty__Group__1();

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
    // $ANTLR end "rule__NestedProperty__Group__0"


    // $ANTLR start "rule__NestedProperty__Group__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2704:1: rule__NestedProperty__Group__0__Impl : ( 'NestedProperty' ) ;
    public final void rule__NestedProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2708:1: ( ( 'NestedProperty' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2709:1: ( 'NestedProperty' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2709:1: ( 'NestedProperty' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2710:1: 'NestedProperty'
            {
             before(grammarAccess.getNestedPropertyAccess().getNestedPropertyKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__NestedProperty__Group__0__Impl5411); 
             after(grammarAccess.getNestedPropertyAccess().getNestedPropertyKeyword_0()); 

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
    // $ANTLR end "rule__NestedProperty__Group__0__Impl"


    // $ANTLR start "rule__NestedProperty__Group__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2723:1: rule__NestedProperty__Group__1 : rule__NestedProperty__Group__1__Impl rule__NestedProperty__Group__2 ;
    public final void rule__NestedProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2727:1: ( rule__NestedProperty__Group__1__Impl rule__NestedProperty__Group__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2728:2: rule__NestedProperty__Group__1__Impl rule__NestedProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__1__Impl_in_rule__NestedProperty__Group__15442);
            rule__NestedProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__2_in_rule__NestedProperty__Group__15445);
            rule__NestedProperty__Group__2();

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
    // $ANTLR end "rule__NestedProperty__Group__1"


    // $ANTLR start "rule__NestedProperty__Group__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2735:1: rule__NestedProperty__Group__1__Impl : ( ( rule__NestedProperty__UnorderedGroup_1 ) ) ;
    public final void rule__NestedProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2739:1: ( ( ( rule__NestedProperty__UnorderedGroup_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2740:1: ( ( rule__NestedProperty__UnorderedGroup_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2740:1: ( ( rule__NestedProperty__UnorderedGroup_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2741:1: ( rule__NestedProperty__UnorderedGroup_1 )
            {
             before(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2742:1: ( rule__NestedProperty__UnorderedGroup_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2742:2: rule__NestedProperty__UnorderedGroup_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UnorderedGroup_1_in_rule__NestedProperty__Group__1__Impl5472);
            rule__NestedProperty__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__NestedProperty__Group__1__Impl"


    // $ANTLR start "rule__NestedProperty__Group__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2752:1: rule__NestedProperty__Group__2 : rule__NestedProperty__Group__2__Impl rule__NestedProperty__Group__3 ;
    public final void rule__NestedProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2756:1: ( rule__NestedProperty__Group__2__Impl rule__NestedProperty__Group__3 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2757:2: rule__NestedProperty__Group__2__Impl rule__NestedProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__2__Impl_in_rule__NestedProperty__Group__25502);
            rule__NestedProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__3_in_rule__NestedProperty__Group__25505);
            rule__NestedProperty__Group__3();

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
    // $ANTLR end "rule__NestedProperty__Group__2"


    // $ANTLR start "rule__NestedProperty__Group__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2764:1: rule__NestedProperty__Group__2__Impl : ( ( rule__NestedProperty__NameAssignment_2 ) ) ;
    public final void rule__NestedProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2768:1: ( ( ( rule__NestedProperty__NameAssignment_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2769:1: ( ( rule__NestedProperty__NameAssignment_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2769:1: ( ( rule__NestedProperty__NameAssignment_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2770:1: ( rule__NestedProperty__NameAssignment_2 )
            {
             before(grammarAccess.getNestedPropertyAccess().getNameAssignment_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2771:1: ( rule__NestedProperty__NameAssignment_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2771:2: rule__NestedProperty__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__NameAssignment_2_in_rule__NestedProperty__Group__2__Impl5532);
            rule__NestedProperty__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__NestedProperty__Group__2__Impl"


    // $ANTLR start "rule__NestedProperty__Group__3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2781:1: rule__NestedProperty__Group__3 : rule__NestedProperty__Group__3__Impl rule__NestedProperty__Group__4 ;
    public final void rule__NestedProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2785:1: ( rule__NestedProperty__Group__3__Impl rule__NestedProperty__Group__4 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2786:2: rule__NestedProperty__Group__3__Impl rule__NestedProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__3__Impl_in_rule__NestedProperty__Group__35562);
            rule__NestedProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__4_in_rule__NestedProperty__Group__35565);
            rule__NestedProperty__Group__4();

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
    // $ANTLR end "rule__NestedProperty__Group__3"


    // $ANTLR start "rule__NestedProperty__Group__3__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2793:1: rule__NestedProperty__Group__3__Impl : ( ( rule__NestedProperty__Alternatives_3 )? ) ;
    public final void rule__NestedProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2797:1: ( ( ( rule__NestedProperty__Alternatives_3 )? ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2798:1: ( ( rule__NestedProperty__Alternatives_3 )? )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2798:1: ( ( rule__NestedProperty__Alternatives_3 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2799:1: ( rule__NestedProperty__Alternatives_3 )?
            {
             before(grammarAccess.getNestedPropertyAccess().getAlternatives_3()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2800:1: ( rule__NestedProperty__Alternatives_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2800:2: rule__NestedProperty__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Alternatives_3_in_rule__NestedProperty__Group__3__Impl5592);
                    rule__NestedProperty__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNestedPropertyAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__NestedProperty__Group__3__Impl"


    // $ANTLR start "rule__NestedProperty__Group__4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2810:1: rule__NestedProperty__Group__4 : rule__NestedProperty__Group__4__Impl rule__NestedProperty__Group__5 ;
    public final void rule__NestedProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2814:1: ( rule__NestedProperty__Group__4__Impl rule__NestedProperty__Group__5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2815:2: rule__NestedProperty__Group__4__Impl rule__NestedProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__4__Impl_in_rule__NestedProperty__Group__45623);
            rule__NestedProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__5_in_rule__NestedProperty__Group__45626);
            rule__NestedProperty__Group__5();

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
    // $ANTLR end "rule__NestedProperty__Group__4"


    // $ANTLR start "rule__NestedProperty__Group__4__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2822:1: rule__NestedProperty__Group__4__Impl : ( ':' ) ;
    public final void rule__NestedProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2826:1: ( ( ':' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2827:1: ( ':' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2827:1: ( ':' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2828:1: ':'
            {
             before(grammarAccess.getNestedPropertyAccess().getColonKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__NestedProperty__Group__4__Impl5654); 
             after(grammarAccess.getNestedPropertyAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__NestedProperty__Group__4__Impl"


    // $ANTLR start "rule__NestedProperty__Group__5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2841:1: rule__NestedProperty__Group__5 : rule__NestedProperty__Group__5__Impl ;
    public final void rule__NestedProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2845:1: ( rule__NestedProperty__Group__5__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2846:2: rule__NestedProperty__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group__5__Impl_in_rule__NestedProperty__Group__55685);
            rule__NestedProperty__Group__5__Impl();

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
    // $ANTLR end "rule__NestedProperty__Group__5"


    // $ANTLR start "rule__NestedProperty__Group__5__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2852:1: rule__NestedProperty__Group__5__Impl : ( ( rule__NestedProperty__TypeAssignment_5 ) ) ;
    public final void rule__NestedProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2856:1: ( ( ( rule__NestedProperty__TypeAssignment_5 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2857:1: ( ( rule__NestedProperty__TypeAssignment_5 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2857:1: ( ( rule__NestedProperty__TypeAssignment_5 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2858:1: ( rule__NestedProperty__TypeAssignment_5 )
            {
             before(grammarAccess.getNestedPropertyAccess().getTypeAssignment_5()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2859:1: ( rule__NestedProperty__TypeAssignment_5 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2859:2: rule__NestedProperty__TypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__TypeAssignment_5_in_rule__NestedProperty__Group__5__Impl5712);
            rule__NestedProperty__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getTypeAssignment_5()); 

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
    // $ANTLR end "rule__NestedProperty__Group__5__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2881:1: rule__NestedProperty__Group_3_0__0 : rule__NestedProperty__Group_3_0__0__Impl rule__NestedProperty__Group_3_0__1 ;
    public final void rule__NestedProperty__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2885:1: ( rule__NestedProperty__Group_3_0__0__Impl rule__NestedProperty__Group_3_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2886:2: rule__NestedProperty__Group_3_0__0__Impl rule__NestedProperty__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_0__0__Impl_in_rule__NestedProperty__Group_3_0__05754);
            rule__NestedProperty__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_0__1_in_rule__NestedProperty__Group_3_0__05757);
            rule__NestedProperty__Group_3_0__1();

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
    // $ANTLR end "rule__NestedProperty__Group_3_0__0"


    // $ANTLR start "rule__NestedProperty__Group_3_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2893:1: rule__NestedProperty__Group_3_0__0__Impl : ( '[' ) ;
    public final void rule__NestedProperty__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2897:1: ( ( '[' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2898:1: ( '[' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2898:1: ( '[' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2899:1: '['
            {
             before(grammarAccess.getNestedPropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__NestedProperty__Group_3_0__0__Impl5785); 
             after(grammarAccess.getNestedPropertyAccess().getLeftSquareBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_0__0__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2912:1: rule__NestedProperty__Group_3_0__1 : rule__NestedProperty__Group_3_0__1__Impl ;
    public final void rule__NestedProperty__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2916:1: ( rule__NestedProperty__Group_3_0__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2917:2: rule__NestedProperty__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_0__1__Impl_in_rule__NestedProperty__Group_3_0__15816);
            rule__NestedProperty__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__NestedProperty__Group_3_0__1"


    // $ANTLR start "rule__NestedProperty__Group_3_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2923:1: rule__NestedProperty__Group_3_0__1__Impl : ( ( rule__NestedProperty__UpperBoundAssignment_3_0_1 ) ) ;
    public final void rule__NestedProperty__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2927:1: ( ( ( rule__NestedProperty__UpperBoundAssignment_3_0_1 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2928:1: ( ( rule__NestedProperty__UpperBoundAssignment_3_0_1 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2928:1: ( ( rule__NestedProperty__UpperBoundAssignment_3_0_1 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2929:1: ( rule__NestedProperty__UpperBoundAssignment_3_0_1 )
            {
             before(grammarAccess.getNestedPropertyAccess().getUpperBoundAssignment_3_0_1()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2930:1: ( rule__NestedProperty__UpperBoundAssignment_3_0_1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2930:2: rule__NestedProperty__UpperBoundAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UpperBoundAssignment_3_0_1_in_rule__NestedProperty__Group_3_0__1__Impl5843);
            rule__NestedProperty__UpperBoundAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getUpperBoundAssignment_3_0_1()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_0__1__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2944:1: rule__NestedProperty__Group_3_1__0 : rule__NestedProperty__Group_3_1__0__Impl rule__NestedProperty__Group_3_1__1 ;
    public final void rule__NestedProperty__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2948:1: ( rule__NestedProperty__Group_3_1__0__Impl rule__NestedProperty__Group_3_1__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2949:2: rule__NestedProperty__Group_3_1__0__Impl rule__NestedProperty__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1__0__Impl_in_rule__NestedProperty__Group_3_1__05877);
            rule__NestedProperty__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1__1_in_rule__NestedProperty__Group_3_1__05880);
            rule__NestedProperty__Group_3_1__1();

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
    // $ANTLR end "rule__NestedProperty__Group_3_1__0"


    // $ANTLR start "rule__NestedProperty__Group_3_1__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2956:1: rule__NestedProperty__Group_3_1__0__Impl : ( ( rule__NestedProperty__Group_3_1_0__0 ) ) ;
    public final void rule__NestedProperty__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2960:1: ( ( ( rule__NestedProperty__Group_3_1_0__0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2961:1: ( ( rule__NestedProperty__Group_3_1_0__0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2961:1: ( ( rule__NestedProperty__Group_3_1_0__0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2962:1: ( rule__NestedProperty__Group_3_1_0__0 )
            {
             before(grammarAccess.getNestedPropertyAccess().getGroup_3_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2963:1: ( rule__NestedProperty__Group_3_1_0__0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2963:2: rule__NestedProperty__Group_3_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__0_in_rule__NestedProperty__Group_3_1__0__Impl5907);
            rule__NestedProperty__Group_3_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getGroup_3_1_0()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_1__0__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2973:1: rule__NestedProperty__Group_3_1__1 : rule__NestedProperty__Group_3_1__1__Impl ;
    public final void rule__NestedProperty__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2977:1: ( rule__NestedProperty__Group_3_1__1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2978:2: rule__NestedProperty__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1__1__Impl_in_rule__NestedProperty__Group_3_1__15937);
            rule__NestedProperty__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__NestedProperty__Group_3_1__1"


    // $ANTLR start "rule__NestedProperty__Group_3_1__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2984:1: rule__NestedProperty__Group_3_1__1__Impl : ( ']' ) ;
    public final void rule__NestedProperty__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2988:1: ( ( ']' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2989:1: ( ']' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2989:1: ( ']' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:2990:1: ']'
            {
             before(grammarAccess.getNestedPropertyAccess().getRightSquareBracketKeyword_3_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__NestedProperty__Group_3_1__1__Impl5965); 
             after(grammarAccess.getNestedPropertyAccess().getRightSquareBracketKeyword_3_1_1()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_1__1__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3007:1: rule__NestedProperty__Group_3_1_0__0 : rule__NestedProperty__Group_3_1_0__0__Impl rule__NestedProperty__Group_3_1_0__1 ;
    public final void rule__NestedProperty__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3011:1: ( rule__NestedProperty__Group_3_1_0__0__Impl rule__NestedProperty__Group_3_1_0__1 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3012:2: rule__NestedProperty__Group_3_1_0__0__Impl rule__NestedProperty__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__0__Impl_in_rule__NestedProperty__Group_3_1_0__06000);
            rule__NestedProperty__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__1_in_rule__NestedProperty__Group_3_1_0__06003);
            rule__NestedProperty__Group_3_1_0__1();

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__0"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__0__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3019:1: rule__NestedProperty__Group_3_1_0__0__Impl : ( ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 ) ) ;
    public final void rule__NestedProperty__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3023:1: ( ( ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3024:1: ( ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3024:1: ( ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3025:1: ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 )
            {
             before(grammarAccess.getNestedPropertyAccess().getLowerBoundAssignment_3_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3026:1: ( rule__NestedProperty__LowerBoundAssignment_3_1_0_0 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3026:2: rule__NestedProperty__LowerBoundAssignment_3_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__LowerBoundAssignment_3_1_0_0_in_rule__NestedProperty__Group_3_1_0__0__Impl6030);
            rule__NestedProperty__LowerBoundAssignment_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getLowerBoundAssignment_3_1_0_0()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3036:1: rule__NestedProperty__Group_3_1_0__1 : rule__NestedProperty__Group_3_1_0__1__Impl rule__NestedProperty__Group_3_1_0__2 ;
    public final void rule__NestedProperty__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3040:1: ( rule__NestedProperty__Group_3_1_0__1__Impl rule__NestedProperty__Group_3_1_0__2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3041:2: rule__NestedProperty__Group_3_1_0__1__Impl rule__NestedProperty__Group_3_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__1__Impl_in_rule__NestedProperty__Group_3_1_0__16060);
            rule__NestedProperty__Group_3_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__2_in_rule__NestedProperty__Group_3_1_0__16063);
            rule__NestedProperty__Group_3_1_0__2();

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__1"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3048:1: rule__NestedProperty__Group_3_1_0__1__Impl : ( '..' ) ;
    public final void rule__NestedProperty__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3052:1: ( ( '..' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3053:1: ( '..' )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3053:1: ( '..' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3054:1: '..'
            {
             before(grammarAccess.getNestedPropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__NestedProperty__Group_3_1_0__1__Impl6091); 
             after(grammarAccess.getNestedPropertyAccess().getFullStopFullStopKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3067:1: rule__NestedProperty__Group_3_1_0__2 : rule__NestedProperty__Group_3_1_0__2__Impl ;
    public final void rule__NestedProperty__Group_3_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3071:1: ( rule__NestedProperty__Group_3_1_0__2__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3072:2: rule__NestedProperty__Group_3_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__Group_3_1_0__2__Impl_in_rule__NestedProperty__Group_3_1_0__26122);
            rule__NestedProperty__Group_3_1_0__2__Impl();

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__2"


    // $ANTLR start "rule__NestedProperty__Group_3_1_0__2__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3078:1: rule__NestedProperty__Group_3_1_0__2__Impl : ( ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 ) ) ;
    public final void rule__NestedProperty__Group_3_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3082:1: ( ( ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3083:1: ( ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3083:1: ( ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3084:1: ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 )
            {
             before(grammarAccess.getNestedPropertyAccess().getUpperBoundAssignment_3_1_0_2()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3085:1: ( rule__NestedProperty__UpperBoundAssignment_3_1_0_2 )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3085:2: rule__NestedProperty__UpperBoundAssignment_3_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UpperBoundAssignment_3_1_0_2_in_rule__NestedProperty__Group_3_1_0__2__Impl6149);
            rule__NestedProperty__UpperBoundAssignment_3_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNestedPropertyAccess().getUpperBoundAssignment_3_1_0_2()); 

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
    // $ANTLR end "rule__NestedProperty__Group_3_1_0__2__Impl"


    // $ANTLR start "rule__PrimitiveProperty__UnorderedGroup_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3102:1: rule__PrimitiveProperty__UnorderedGroup_1 : ( rule__PrimitiveProperty__UnorderedGroup_1__0 )? ;
    public final void rule__PrimitiveProperty__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3107:1: ( ( rule__PrimitiveProperty__UnorderedGroup_1__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3108:2: ( rule__PrimitiveProperty__UnorderedGroup_1__0 )?
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3108:2: ( rule__PrimitiveProperty__UnorderedGroup_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3108:2: rule__PrimitiveProperty__UnorderedGroup_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__0_in_rule__PrimitiveProperty__UnorderedGroup_16186);
                    rule__PrimitiveProperty__UnorderedGroup_1__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperty__UnorderedGroup_1"


    // $ANTLR start "rule__PrimitiveProperty__UnorderedGroup_1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3118:1: rule__PrimitiveProperty__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) ) ) ;
    public final void rule__PrimitiveProperty__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3123:1: ( ( ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3124:3: ( ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3124:3: ( ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3126:4: ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3126:4: ({...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3127:5: {...}? => ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PrimitiveProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3127:114: ( ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3128:6: ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3134:6: ( ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3136:7: ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 )
                    {
                     before(grammarAccess.getPrimitivePropertyAccess().getIsOrderedAssignment_1_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3137:7: ( rule__PrimitiveProperty__IsOrderedAssignment_1_0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3137:8: rule__PrimitiveProperty__IsOrderedAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__IsOrderedAssignment_1_0_in_rule__PrimitiveProperty__UnorderedGroup_1__Impl6273);
                    rule__PrimitiveProperty__IsOrderedAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertyAccess().getIsOrderedAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3143:4: ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3143:4: ({...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3144:5: {...}? => ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PrimitiveProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3144:114: ( ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3145:6: ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3151:6: ( ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3153:7: ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 )
                    {
                     before(grammarAccess.getPrimitivePropertyAccess().getIsUniqueAssignment_1_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3154:7: ( rule__PrimitiveProperty__IsUniqueAssignment_1_1 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3154:8: rule__PrimitiveProperty__IsUniqueAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__IsUniqueAssignment_1_1_in_rule__PrimitiveProperty__UnorderedGroup_1__Impl6364);
                    rule__PrimitiveProperty__IsUniqueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertyAccess().getIsUniqueAssignment_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperty__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__PrimitiveProperty__UnorderedGroup_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3169:1: rule__PrimitiveProperty__UnorderedGroup_1__0 : rule__PrimitiveProperty__UnorderedGroup_1__Impl ( rule__PrimitiveProperty__UnorderedGroup_1__1 )? ;
    public final void rule__PrimitiveProperty__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3173:1: ( rule__PrimitiveProperty__UnorderedGroup_1__Impl ( rule__PrimitiveProperty__UnorderedGroup_1__1 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3174:2: rule__PrimitiveProperty__UnorderedGroup_1__Impl ( rule__PrimitiveProperty__UnorderedGroup_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__Impl_in_rule__PrimitiveProperty__UnorderedGroup_1__06423);
            rule__PrimitiveProperty__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3175:2: ( rule__PrimitiveProperty__UnorderedGroup_1__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrimitivePropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3175:2: rule__PrimitiveProperty__UnorderedGroup_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__1_in_rule__PrimitiveProperty__UnorderedGroup_1__06426);
                    rule__PrimitiveProperty__UnorderedGroup_1__1();

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
    // $ANTLR end "rule__PrimitiveProperty__UnorderedGroup_1__0"


    // $ANTLR start "rule__PrimitiveProperty__UnorderedGroup_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3182:1: rule__PrimitiveProperty__UnorderedGroup_1__1 : rule__PrimitiveProperty__UnorderedGroup_1__Impl ;
    public final void rule__PrimitiveProperty__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3186:1: ( rule__PrimitiveProperty__UnorderedGroup_1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3187:2: rule__PrimitiveProperty__UnorderedGroup_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__Impl_in_rule__PrimitiveProperty__UnorderedGroup_1__16451);
            rule__PrimitiveProperty__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperty__UnorderedGroup_1__1"


    // $ANTLR start "rule__AssociationProperty__UnorderedGroup_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3198:1: rule__AssociationProperty__UnorderedGroup_1 : ( rule__AssociationProperty__UnorderedGroup_1__0 )? ;
    public final void rule__AssociationProperty__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3203:1: ( ( rule__AssociationProperty__UnorderedGroup_1__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3204:2: ( rule__AssociationProperty__UnorderedGroup_1__0 )?
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3204:2: ( rule__AssociationProperty__UnorderedGroup_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3204:2: rule__AssociationProperty__UnorderedGroup_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UnorderedGroup_1__0_in_rule__AssociationProperty__UnorderedGroup_16479);
                    rule__AssociationProperty__UnorderedGroup_1__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperty__UnorderedGroup_1"


    // $ANTLR start "rule__AssociationProperty__UnorderedGroup_1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3214:1: rule__AssociationProperty__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) ) ) ;
    public final void rule__AssociationProperty__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3219:1: ( ( ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3220:3: ( ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3220:3: ( ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3222:4: ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3222:4: ({...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3223:5: {...}? => ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AssociationProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3223:116: ( ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3224:6: ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3230:6: ( ( rule__AssociationProperty__IsOrderedAssignment_1_0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3232:7: ( rule__AssociationProperty__IsOrderedAssignment_1_0 )
                    {
                     before(grammarAccess.getAssociationPropertyAccess().getIsOrderedAssignment_1_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3233:7: ( rule__AssociationProperty__IsOrderedAssignment_1_0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3233:8: rule__AssociationProperty__IsOrderedAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__IsOrderedAssignment_1_0_in_rule__AssociationProperty__UnorderedGroup_1__Impl6566);
                    rule__AssociationProperty__IsOrderedAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationPropertyAccess().getIsOrderedAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3239:4: ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3239:4: ({...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3240:5: {...}? => ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AssociationProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3240:116: ( ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3241:6: ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3247:6: ( ( rule__AssociationProperty__IsUniqueAssignment_1_1 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3249:7: ( rule__AssociationProperty__IsUniqueAssignment_1_1 )
                    {
                     before(grammarAccess.getAssociationPropertyAccess().getIsUniqueAssignment_1_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3250:7: ( rule__AssociationProperty__IsUniqueAssignment_1_1 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3250:8: rule__AssociationProperty__IsUniqueAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__IsUniqueAssignment_1_1_in_rule__AssociationProperty__UnorderedGroup_1__Impl6657);
                    rule__AssociationProperty__IsUniqueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationPropertyAccess().getIsUniqueAssignment_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationProperty__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__AssociationProperty__UnorderedGroup_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3265:1: rule__AssociationProperty__UnorderedGroup_1__0 : rule__AssociationProperty__UnorderedGroup_1__Impl ( rule__AssociationProperty__UnorderedGroup_1__1 )? ;
    public final void rule__AssociationProperty__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3269:1: ( rule__AssociationProperty__UnorderedGroup_1__Impl ( rule__AssociationProperty__UnorderedGroup_1__1 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3270:2: rule__AssociationProperty__UnorderedGroup_1__Impl ( rule__AssociationProperty__UnorderedGroup_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UnorderedGroup_1__Impl_in_rule__AssociationProperty__UnorderedGroup_1__06716);
            rule__AssociationProperty__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3271:2: ( rule__AssociationProperty__UnorderedGroup_1__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3271:2: rule__AssociationProperty__UnorderedGroup_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UnorderedGroup_1__1_in_rule__AssociationProperty__UnorderedGroup_1__06719);
                    rule__AssociationProperty__UnorderedGroup_1__1();

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
    // $ANTLR end "rule__AssociationProperty__UnorderedGroup_1__0"


    // $ANTLR start "rule__AssociationProperty__UnorderedGroup_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3278:1: rule__AssociationProperty__UnorderedGroup_1__1 : rule__AssociationProperty__UnorderedGroup_1__Impl ;
    public final void rule__AssociationProperty__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3282:1: ( rule__AssociationProperty__UnorderedGroup_1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3283:2: rule__AssociationProperty__UnorderedGroup_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssociationProperty__UnorderedGroup_1__Impl_in_rule__AssociationProperty__UnorderedGroup_1__16744);
            rule__AssociationProperty__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__AssociationProperty__UnorderedGroup_1__1"


    // $ANTLR start "rule__NestedProperty__UnorderedGroup_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3294:1: rule__NestedProperty__UnorderedGroup_1 : ( rule__NestedProperty__UnorderedGroup_1__0 )? ;
    public final void rule__NestedProperty__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3299:1: ( ( rule__NestedProperty__UnorderedGroup_1__0 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3300:2: ( rule__NestedProperty__UnorderedGroup_1__0 )?
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3300:2: ( rule__NestedProperty__UnorderedGroup_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3300:2: rule__NestedProperty__UnorderedGroup_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UnorderedGroup_1__0_in_rule__NestedProperty__UnorderedGroup_16772);
                    rule__NestedProperty__UnorderedGroup_1__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedProperty__UnorderedGroup_1"


    // $ANTLR start "rule__NestedProperty__UnorderedGroup_1__Impl"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3310:1: rule__NestedProperty__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) ) ) ;
    public final void rule__NestedProperty__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3315:1: ( ( ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3316:3: ( ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3316:3: ( ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3318:4: ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3318:4: ({...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3319:5: {...}? => ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NestedProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3319:111: ( ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3320:6: ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3326:6: ( ( rule__NestedProperty__IsOrderedAssignment_1_0 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3328:7: ( rule__NestedProperty__IsOrderedAssignment_1_0 )
                    {
                     before(grammarAccess.getNestedPropertyAccess().getIsOrderedAssignment_1_0()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3329:7: ( rule__NestedProperty__IsOrderedAssignment_1_0 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3329:8: rule__NestedProperty__IsOrderedAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__IsOrderedAssignment_1_0_in_rule__NestedProperty__UnorderedGroup_1__Impl6859);
                    rule__NestedProperty__IsOrderedAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedPropertyAccess().getIsOrderedAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3335:4: ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) )
                    {
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3335:4: ({...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3336:5: {...}? => ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NestedProperty__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3336:111: ( ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3337:6: ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3343:6: ( ( rule__NestedProperty__IsUniqueAssignment_1_1 ) )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3345:7: ( rule__NestedProperty__IsUniqueAssignment_1_1 )
                    {
                     before(grammarAccess.getNestedPropertyAccess().getIsUniqueAssignment_1_1()); 
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3346:7: ( rule__NestedProperty__IsUniqueAssignment_1_1 )
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3346:8: rule__NestedProperty__IsUniqueAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__IsUniqueAssignment_1_1_in_rule__NestedProperty__UnorderedGroup_1__Impl6950);
                    rule__NestedProperty__IsUniqueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNestedPropertyAccess().getIsUniqueAssignment_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedProperty__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__NestedProperty__UnorderedGroup_1__0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3361:1: rule__NestedProperty__UnorderedGroup_1__0 : rule__NestedProperty__UnorderedGroup_1__Impl ( rule__NestedProperty__UnorderedGroup_1__1 )? ;
    public final void rule__NestedProperty__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3365:1: ( rule__NestedProperty__UnorderedGroup_1__Impl ( rule__NestedProperty__UnorderedGroup_1__1 )? )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3366:2: rule__NestedProperty__UnorderedGroup_1__Impl ( rule__NestedProperty__UnorderedGroup_1__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UnorderedGroup_1__Impl_in_rule__NestedProperty__UnorderedGroup_1__07009);
            rule__NestedProperty__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3367:2: ( rule__NestedProperty__UnorderedGroup_1__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getNestedPropertyAccess().getUnorderedGroup_1(), 1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3367:2: rule__NestedProperty__UnorderedGroup_1__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UnorderedGroup_1__1_in_rule__NestedProperty__UnorderedGroup_1__07012);
                    rule__NestedProperty__UnorderedGroup_1__1();

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
    // $ANTLR end "rule__NestedProperty__UnorderedGroup_1__0"


    // $ANTLR start "rule__NestedProperty__UnorderedGroup_1__1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3374:1: rule__NestedProperty__UnorderedGroup_1__1 : rule__NestedProperty__UnorderedGroup_1__Impl ;
    public final void rule__NestedProperty__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3378:1: ( rule__NestedProperty__UnorderedGroup_1__Impl )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3379:2: rule__NestedProperty__UnorderedGroup_1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NestedProperty__UnorderedGroup_1__Impl_in_rule__NestedProperty__UnorderedGroup_1__17037);
            rule__NestedProperty__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__NestedProperty__UnorderedGroup_1__1"


    // $ANTLR start "rule__Structure__EntitiesAssignment"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3390:1: rule__Structure__EntitiesAssignment : ( ruleModelEntity ) ;
    public final void rule__Structure__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3394:1: ( ( ruleModelEntity ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3395:1: ( ruleModelEntity )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3395:1: ( ruleModelEntity )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3396:1: ruleModelEntity
            {
             before(grammarAccess.getStructureAccess().getEntitiesModelEntityParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleModelEntity_in_rule__Structure__EntitiesAssignment7069);
            ruleModelEntity();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getEntitiesModelEntityParserRuleCall_0()); 

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
    // $ANTLR end "rule__Structure__EntitiesAssignment"


    // $ANTLR start "rule__PrimitiveClass__NameAssignment_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3405:1: rule__PrimitiveClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3409:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3410:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3410:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3411:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PrimitiveClass__NameAssignment_17100); 
             after(grammarAccess.getPrimitiveClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimitiveClass__NameAssignment_1"


    // $ANTLR start "rule__PrimitiveClass__PrimitiveTypeAssignment_3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3420:1: rule__PrimitiveClass__PrimitiveTypeAssignment_3 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveClass__PrimitiveTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3424:1: ( ( rulePrimitiveType ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3425:1: ( rulePrimitiveType )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3425:1: ( rulePrimitiveType )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3426:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveType_in_rule__PrimitiveClass__PrimitiveTypeAssignment_37131);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveClassAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__PrimitiveClass__PrimitiveTypeAssignment_3"


    // $ANTLR start "rule__EmbeddedClass__NameAssignment_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3435:1: rule__EmbeddedClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EmbeddedClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3439:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3440:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3440:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3441:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedClass__NameAssignment_17162); 
             after(grammarAccess.getEmbeddedClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EmbeddedClass__NameAssignment_1"


    // $ANTLR start "rule__EmbeddedClass__IdPropertyAssignment_4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3450:1: rule__EmbeddedClass__IdPropertyAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EmbeddedClass__IdPropertyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3454:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3455:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3455:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3456:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyCrossReference_4_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3457:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3458:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedClass__IdPropertyAssignment_47197); 
             after(grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEmbeddedClassAccess().getIdPropertyEmbeddedPropertyCrossReference_4_0()); 

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
    // $ANTLR end "rule__EmbeddedClass__IdPropertyAssignment_4"


    // $ANTLR start "rule__EmbeddedClass__EmbeddedPropertiesAssignment_5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3469:1: rule__EmbeddedClass__EmbeddedPropertiesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__EmbeddedClass__EmbeddedPropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3473:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3474:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3474:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3475:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_5_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3476:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3477:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedClass__EmbeddedPropertiesAssignment_57236); 
             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_5_0()); 

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
    // $ANTLR end "rule__EmbeddedClass__EmbeddedPropertiesAssignment_5"


    // $ANTLR start "rule__EmbeddedClass__EmbeddedPropertiesAssignment_6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3488:1: rule__EmbeddedClass__EmbeddedPropertiesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__EmbeddedClass__EmbeddedPropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3492:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3493:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3493:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3494:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_6_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3495:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3496:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedClass__EmbeddedPropertiesAssignment_67275); 
             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getEmbeddedClassAccess().getEmbeddedPropertiesEmbeddedPropertyCrossReference_6_0()); 

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
    // $ANTLR end "rule__EmbeddedClass__EmbeddedPropertiesAssignment_6"


    // $ANTLR start "rule__StandardClass__IsAbstractAssignment_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3507:1: rule__StandardClass__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__StandardClass__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3511:1: ( ( ( 'abstract' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3512:1: ( ( 'abstract' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3512:1: ( ( 'abstract' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3513:1: ( 'abstract' )
            {
             before(grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3514:1: ( 'abstract' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3515:1: 'abstract'
            {
             before(grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__StandardClass__IsAbstractAssignment_07315); 
             after(grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getStandardClassAccess().getIsAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__StandardClass__IsAbstractAssignment_0"


    // $ANTLR start "rule__StandardClass__NameAssignment_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3530:1: rule__StandardClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StandardClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3534:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3535:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3535:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3536:1: RULE_ID
            {
             before(grammarAccess.getStandardClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__StandardClass__NameAssignment_27354); 
             after(grammarAccess.getStandardClassAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StandardClass__NameAssignment_2"


    // $ANTLR start "rule__StandardClass__ParentAssignment_3_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3545:1: rule__StandardClass__ParentAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__StandardClass__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3549:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3550:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3550:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3551:1: ( RULE_ID )
            {
             before(grammarAccess.getStandardClassAccess().getParentStandardClassCrossReference_3_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3552:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3553:1: RULE_ID
            {
             before(grammarAccess.getStandardClassAccess().getParentStandardClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__StandardClass__ParentAssignment_3_17389); 
             after(grammarAccess.getStandardClassAccess().getParentStandardClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStandardClassAccess().getParentStandardClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__StandardClass__ParentAssignment_3_1"


    // $ANTLR start "rule__StandardClass__InheritanceTypeAssignment_3_3"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3564:1: rule__StandardClass__InheritanceTypeAssignment_3_3 : ( ruleInheritanceType ) ;
    public final void rule__StandardClass__InheritanceTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3568:1: ( ( ruleInheritanceType ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3569:1: ( ruleInheritanceType )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3569:1: ( ruleInheritanceType )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3570:1: ruleInheritanceType
            {
             before(grammarAccess.getStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInheritanceType_in_rule__StandardClass__InheritanceTypeAssignment_3_37424);
            ruleInheritanceType();

            state._fsp--;

             after(grammarAccess.getStandardClassAccess().getInheritanceTypeInheritanceTypeEnumRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__StandardClass__InheritanceTypeAssignment_3_3"


    // $ANTLR start "rule__StandardClass__IdPropertyAssignment_5_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3579:1: rule__StandardClass__IdPropertyAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__StandardClass__IdPropertyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3583:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3584:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3584:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3585:1: ( RULE_ID )
            {
             before(grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyCrossReference_5_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3586:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3587:1: RULE_ID
            {
             before(grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__StandardClass__IdPropertyAssignment_5_17459); 
             after(grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStandardClassAccess().getIdPropertyPrimitivePropertyCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__StandardClass__IdPropertyAssignment_5_1"


    // $ANTLR start "rule__StandardClass__PropertiesAssignment_6_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3598:1: rule__StandardClass__PropertiesAssignment_6_0 : ( ruleMultipliableProperty ) ;
    public final void rule__StandardClass__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3602:1: ( ( ruleMultipliableProperty ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3603:1: ( ruleMultipliableProperty )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3603:1: ( ruleMultipliableProperty )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3604:1: ruleMultipliableProperty
            {
             before(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_rule__StandardClass__PropertiesAssignment_6_07494);
            ruleMultipliableProperty();

            state._fsp--;

             after(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__StandardClass__PropertiesAssignment_6_0"


    // $ANTLR start "rule__StandardClass__PropertiesAssignment_6_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3613:1: rule__StandardClass__PropertiesAssignment_6_1 : ( ruleMultipliableProperty ) ;
    public final void rule__StandardClass__PropertiesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3617:1: ( ( ruleMultipliableProperty ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3618:1: ( ruleMultipliableProperty )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3618:1: ( ruleMultipliableProperty )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3619:1: ruleMultipliableProperty
            {
             before(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipliableProperty_in_rule__StandardClass__PropertiesAssignment_6_17525);
            ruleMultipliableProperty();

            state._fsp--;

             after(grammarAccess.getStandardClassAccess().getPropertiesMultipliablePropertyParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__StandardClass__PropertiesAssignment_6_1"


    // $ANTLR start "rule__EmbeddedProperty__IsMandatoryAssignment_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3628:1: rule__EmbeddedProperty__IsMandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__EmbeddedProperty__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3632:1: ( ( ( 'mandatory' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3633:1: ( ( 'mandatory' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3633:1: ( ( 'mandatory' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3634:1: ( 'mandatory' )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3635:1: ( 'mandatory' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3636:1: 'mandatory'
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__EmbeddedProperty__IsMandatoryAssignment_17561); 
             after(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getEmbeddedPropertyAccess().getIsMandatoryMandatoryKeyword_1_0()); 

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
    // $ANTLR end "rule__EmbeddedProperty__IsMandatoryAssignment_1"


    // $ANTLR start "rule__EmbeddedProperty__NameAssignment_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3651:1: rule__EmbeddedProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EmbeddedProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3655:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3656:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3656:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3657:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedProperty__NameAssignment_27600); 
             after(grammarAccess.getEmbeddedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EmbeddedProperty__NameAssignment_2"


    // $ANTLR start "rule__EmbeddedProperty__TypeAssignment_4"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3666:1: rule__EmbeddedProperty__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EmbeddedProperty__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3670:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3671:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3671:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3672:1: ( RULE_ID )
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassCrossReference_4_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3673:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3674:1: RULE_ID
            {
             before(grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EmbeddedProperty__TypeAssignment_47635); 
             after(grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEmbeddedPropertyAccess().getTypePrimitiveClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__EmbeddedProperty__TypeAssignment_4"


    // $ANTLR start "rule__PrimitiveProperty__IsOrderedAssignment_1_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3685:1: rule__PrimitiveProperty__IsOrderedAssignment_1_0 : ( ( 'ordered' ) ) ;
    public final void rule__PrimitiveProperty__IsOrderedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3689:1: ( ( ( 'ordered' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3690:1: ( ( 'ordered' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3690:1: ( ( 'ordered' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3691:1: ( 'ordered' )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3692:1: ( 'ordered' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3693:1: 'ordered'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__PrimitiveProperty__IsOrderedAssignment_1_07675); 
             after(grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

            }

             after(grammarAccess.getPrimitivePropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__IsOrderedAssignment_1_0"


    // $ANTLR start "rule__PrimitiveProperty__IsUniqueAssignment_1_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3708:1: rule__PrimitiveProperty__IsUniqueAssignment_1_1 : ( ( 'unique' ) ) ;
    public final void rule__PrimitiveProperty__IsUniqueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3712:1: ( ( ( 'unique' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3713:1: ( ( 'unique' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3713:1: ( ( 'unique' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3714:1: ( 'unique' )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3715:1: ( 'unique' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3716:1: 'unique'
            {
             before(grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__PrimitiveProperty__IsUniqueAssignment_1_17719); 
             after(grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

            }

             after(grammarAccess.getPrimitivePropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__IsUniqueAssignment_1_1"


    // $ANTLR start "rule__PrimitiveProperty__NameAssignment_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3731:1: rule__PrimitiveProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3735:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3736:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3736:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3737:1: RULE_ID
            {
             before(grammarAccess.getPrimitivePropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PrimitiveProperty__NameAssignment_27758); 
             after(grammarAccess.getPrimitivePropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__NameAssignment_2"


    // $ANTLR start "rule__PrimitiveProperty__UpperBoundAssignment_3_0_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3746:1: rule__PrimitiveProperty__UpperBoundAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__PrimitiveProperty__UpperBoundAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3750:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3751:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3751:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3752:1: RULE_INT
            {
             before(grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrimitiveProperty__UpperBoundAssignment_3_0_17789); 
             after(grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__UpperBoundAssignment_3_0_1"


    // $ANTLR start "rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3761:1: rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0 : ( RULE_INT ) ;
    public final void rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3765:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3766:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3766:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3767:1: RULE_INT
            {
             before(grammarAccess.getPrimitivePropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_07820); 
             after(grammarAccess.getPrimitivePropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0"


    // $ANTLR start "rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3776:1: rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2 : ( RULE_INT ) ;
    public final void rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3780:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3781:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3781:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3782:1: RULE_INT
            {
             before(grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_27851); 
             after(grammarAccess.getPrimitivePropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2"


    // $ANTLR start "rule__PrimitiveProperty__TypeAssignment_5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3791:1: rule__PrimitiveProperty__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__PrimitiveProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3795:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3796:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3796:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3797:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassCrossReference_5_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3798:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3799:1: RULE_ID
            {
             before(grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PrimitiveProperty__TypeAssignment_57886); 
             after(grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPrimitivePropertyAccess().getTypePrimitiveClassCrossReference_5_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__TypeAssignment_5"


    // $ANTLR start "rule__PrimitiveProperty__DefaultValueAssignment_6_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3810:1: rule__PrimitiveProperty__DefaultValueAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveProperty__DefaultValueAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3814:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3815:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3815:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3816:1: RULE_ID
            {
             before(grammarAccess.getPrimitivePropertyAccess().getDefaultValueIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__PrimitiveProperty__DefaultValueAssignment_6_17921); 
             after(grammarAccess.getPrimitivePropertyAccess().getDefaultValueIDTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperty__DefaultValueAssignment_6_1"


    // $ANTLR start "rule__AssociationProperty__IsOrderedAssignment_1_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3825:1: rule__AssociationProperty__IsOrderedAssignment_1_0 : ( ( 'ordered' ) ) ;
    public final void rule__AssociationProperty__IsOrderedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3829:1: ( ( ( 'ordered' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3830:1: ( ( 'ordered' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3830:1: ( ( 'ordered' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3831:1: ( 'ordered' )
            {
             before(grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3832:1: ( 'ordered' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3833:1: 'ordered'
            {
             before(grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AssociationProperty__IsOrderedAssignment_1_07957); 
             after(grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

            }

             after(grammarAccess.getAssociationPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

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
    // $ANTLR end "rule__AssociationProperty__IsOrderedAssignment_1_0"


    // $ANTLR start "rule__AssociationProperty__IsUniqueAssignment_1_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3848:1: rule__AssociationProperty__IsUniqueAssignment_1_1 : ( ( 'unique' ) ) ;
    public final void rule__AssociationProperty__IsUniqueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3852:1: ( ( ( 'unique' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3853:1: ( ( 'unique' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3853:1: ( ( 'unique' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3854:1: ( 'unique' )
            {
             before(grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3855:1: ( 'unique' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3856:1: 'unique'
            {
             before(grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AssociationProperty__IsUniqueAssignment_1_18001); 
             after(grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

            }

             after(grammarAccess.getAssociationPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AssociationProperty__IsUniqueAssignment_1_1"


    // $ANTLR start "rule__AssociationProperty__NameAssignment_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3871:1: rule__AssociationProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AssociationProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3875:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3876:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3876:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3877:1: RULE_ID
            {
             before(grammarAccess.getAssociationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AssociationProperty__NameAssignment_28040); 
             after(grammarAccess.getAssociationPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssociationProperty__NameAssignment_2"


    // $ANTLR start "rule__AssociationProperty__UpperBoundAssignment_3_0_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3886:1: rule__AssociationProperty__UpperBoundAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__AssociationProperty__UpperBoundAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3890:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3891:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3891:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3892:1: RULE_INT
            {
             before(grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AssociationProperty__UpperBoundAssignment_3_0_18071); 
             after(grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__AssociationProperty__UpperBoundAssignment_3_0_1"


    // $ANTLR start "rule__AssociationProperty__LowerBoundAssignment_3_1_0_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3901:1: rule__AssociationProperty__LowerBoundAssignment_3_1_0_0 : ( RULE_INT ) ;
    public final void rule__AssociationProperty__LowerBoundAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3905:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3906:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3906:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3907:1: RULE_INT
            {
             before(grammarAccess.getAssociationPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AssociationProperty__LowerBoundAssignment_3_1_0_08102); 
             after(grammarAccess.getAssociationPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 

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
    // $ANTLR end "rule__AssociationProperty__LowerBoundAssignment_3_1_0_0"


    // $ANTLR start "rule__AssociationProperty__UpperBoundAssignment_3_1_0_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3916:1: rule__AssociationProperty__UpperBoundAssignment_3_1_0_2 : ( RULE_INT ) ;
    public final void rule__AssociationProperty__UpperBoundAssignment_3_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3920:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3921:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3921:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3922:1: RULE_INT
            {
             before(grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__AssociationProperty__UpperBoundAssignment_3_1_0_28133); 
             after(grammarAccess.getAssociationPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 

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
    // $ANTLR end "rule__AssociationProperty__UpperBoundAssignment_3_1_0_2"


    // $ANTLR start "rule__AssociationProperty__OppositePropertyAssignment_4_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3931:1: rule__AssociationProperty__OppositePropertyAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationProperty__OppositePropertyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3935:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3936:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3936:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3937:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyCrossReference_4_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3938:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3939:1: RULE_ID
            {
             before(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AssociationProperty__OppositePropertyAssignment_4_18168); 
             after(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAssociationPropertyAccess().getOppositePropertyAssociationPropertyCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__AssociationProperty__OppositePropertyAssignment_4_1"


    // $ANTLR start "rule__AssociationProperty__TypeAssignment_6"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3950:1: rule__AssociationProperty__TypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationProperty__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3954:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3955:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3955:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3956:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationPropertyAccess().getTypeStandardClassCrossReference_6_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3957:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3958:1: RULE_ID
            {
             before(grammarAccess.getAssociationPropertyAccess().getTypeStandardClassIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AssociationProperty__TypeAssignment_68207); 
             after(grammarAccess.getAssociationPropertyAccess().getTypeStandardClassIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssociationPropertyAccess().getTypeStandardClassCrossReference_6_0()); 

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
    // $ANTLR end "rule__AssociationProperty__TypeAssignment_6"


    // $ANTLR start "rule__NestedProperty__IsOrderedAssignment_1_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3969:1: rule__NestedProperty__IsOrderedAssignment_1_0 : ( ( 'ordered' ) ) ;
    public final void rule__NestedProperty__IsOrderedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3973:1: ( ( ( 'ordered' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3974:1: ( ( 'ordered' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3974:1: ( ( 'ordered' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3975:1: ( 'ordered' )
            {
             before(grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3976:1: ( 'ordered' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3977:1: 'ordered'
            {
             before(grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__NestedProperty__IsOrderedAssignment_1_08247); 
             after(grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

            }

             after(grammarAccess.getNestedPropertyAccess().getIsOrderedOrderedKeyword_1_0_0()); 

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
    // $ANTLR end "rule__NestedProperty__IsOrderedAssignment_1_0"


    // $ANTLR start "rule__NestedProperty__IsUniqueAssignment_1_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3992:1: rule__NestedProperty__IsUniqueAssignment_1_1 : ( ( 'unique' ) ) ;
    public final void rule__NestedProperty__IsUniqueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3996:1: ( ( ( 'unique' ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3997:1: ( ( 'unique' ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3997:1: ( ( 'unique' ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3998:1: ( 'unique' )
            {
             before(grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:3999:1: ( 'unique' )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4000:1: 'unique'
            {
             before(grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__NestedProperty__IsUniqueAssignment_1_18291); 
             after(grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

            }

             after(grammarAccess.getNestedPropertyAccess().getIsUniqueUniqueKeyword_1_1_0()); 

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
    // $ANTLR end "rule__NestedProperty__IsUniqueAssignment_1_1"


    // $ANTLR start "rule__NestedProperty__NameAssignment_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4015:1: rule__NestedProperty__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NestedProperty__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4019:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4020:1: ( RULE_ID )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4020:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4021:1: RULE_ID
            {
             before(grammarAccess.getNestedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__NestedProperty__NameAssignment_28330); 
             after(grammarAccess.getNestedPropertyAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NestedProperty__NameAssignment_2"


    // $ANTLR start "rule__NestedProperty__UpperBoundAssignment_3_0_1"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4030:1: rule__NestedProperty__UpperBoundAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__NestedProperty__UpperBoundAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4034:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4035:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4035:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4036:1: RULE_INT
            {
             before(grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__NestedProperty__UpperBoundAssignment_3_0_18361); 
             after(grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__NestedProperty__UpperBoundAssignment_3_0_1"


    // $ANTLR start "rule__NestedProperty__LowerBoundAssignment_3_1_0_0"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4045:1: rule__NestedProperty__LowerBoundAssignment_3_1_0_0 : ( RULE_INT ) ;
    public final void rule__NestedProperty__LowerBoundAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4049:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4050:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4050:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4051:1: RULE_INT
            {
             before(grammarAccess.getNestedPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__NestedProperty__LowerBoundAssignment_3_1_0_08392); 
             after(grammarAccess.getNestedPropertyAccess().getLowerBoundINTTerminalRuleCall_3_1_0_0_0()); 

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
    // $ANTLR end "rule__NestedProperty__LowerBoundAssignment_3_1_0_0"


    // $ANTLR start "rule__NestedProperty__UpperBoundAssignment_3_1_0_2"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4060:1: rule__NestedProperty__UpperBoundAssignment_3_1_0_2 : ( RULE_INT ) ;
    public final void rule__NestedProperty__UpperBoundAssignment_3_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4064:1: ( ( RULE_INT ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4065:1: ( RULE_INT )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4065:1: ( RULE_INT )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4066:1: RULE_INT
            {
             before(grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__NestedProperty__UpperBoundAssignment_3_1_0_28423); 
             after(grammarAccess.getNestedPropertyAccess().getUpperBoundINTTerminalRuleCall_3_1_0_2_0()); 

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
    // $ANTLR end "rule__NestedProperty__UpperBoundAssignment_3_1_0_2"


    // $ANTLR start "rule__NestedProperty__TypeAssignment_5"
    // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4075:1: rule__NestedProperty__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__NestedProperty__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4079:1: ( ( ( RULE_ID ) ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4080:1: ( ( RULE_ID ) )
            {
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4080:1: ( ( RULE_ID ) )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4081:1: ( RULE_ID )
            {
             before(grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassCrossReference_5_0()); 
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4082:1: ( RULE_ID )
            // ../migdb.dsl.app.ui/src-gen/migdb/dsl/app/ui/contentassist/antlr/internal/InternalApp.g:4083:1: RULE_ID
            {
             before(grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__NestedProperty__TypeAssignment_58458); 
             after(grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getNestedPropertyAccess().getTypeEmbeddedClassCrossReference_5_0()); 

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
    // $ANTLR end "rule__NestedProperty__TypeAssignment_5"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModelRoot_in_entryRuleModelRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_ruleModelRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructure127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Structure__EntitiesAssignment_in_ruleStructure153 = new BitSet(new long[]{0x00000008008A0002L});
        public static final BitSet FOLLOW_ruleModelEntity_in_entryRuleModelEntity181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModelEntity188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModelEntity__Alternatives_in_ruleModelEntity214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralClass_in_entryRuleGeneralClass241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralClass248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GeneralClass__Alternatives_in_ruleGeneralClass274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveClass_in_entryRulePrimitiveClass301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveClass308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__0_in_rulePrimitiveClass334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedClass_in_entryRuleEmbeddedClass361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedClass368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__0_in_ruleEmbeddedClass394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardClass_in_entryRuleStandardClass421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStandardClass428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__0_in_ruleStandardClass454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_entryRuleMultipliableProperty483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipliableProperty490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipliableProperty__Alternatives_in_ruleMultipliableProperty516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedProperty_in_entryRuleEmbeddedProperty543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmbeddedProperty550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__0_in_ruleEmbeddedProperty576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveProperty_in_entryRulePrimitiveProperty603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveProperty610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__0_in_rulePrimitiveProperty636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationProperty_in_entryRuleAssociationProperty663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociationProperty670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__0_in_ruleAssociationProperty696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedProperty_in_entryRuleNestedProperty723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedProperty730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__0_in_ruleNestedProperty756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InheritanceType__Alternatives_in_ruleInheritanceType831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralClass_in_rule__ModelEntity__Alternatives866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveClass_in_rule__ModelEntity__Alternatives883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmbeddedClass_in_rule__GeneralClass__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardClass_in_rule__GeneralClass__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationProperty_in_rule__MultipliableProperty__Alternatives965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveProperty_in_rule__MultipliableProperty__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedProperty_in_rule__MultipliableProperty__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_0__0_in_rule__PrimitiveProperty__Alternatives_31031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1__0_in_rule__PrimitiveProperty__Alternatives_31049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_0__0_in_rule__AssociationProperty__Alternatives_31082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1__0_in_rule__AssociationProperty__Alternatives_31100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_0__0_in_rule__NestedProperty__Alternatives_31133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1__0_in_rule__NestedProperty__Alternatives_31151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__PrimitiveType__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PrimitiveType__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InheritanceType__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__InheritanceType__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__InheritanceType__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__0__Impl_in_rule__PrimitiveClass__Group__01339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__1_in_rule__PrimitiveClass__Group__01342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__PrimitiveClass__Group__0__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__1__Impl_in_rule__PrimitiveClass__Group__11401 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__2_in_rule__PrimitiveClass__Group__11404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__NameAssignment_1_in_rule__PrimitiveClass__Group__1__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__2__Impl_in_rule__PrimitiveClass__Group__21461 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__3_in_rule__PrimitiveClass__Group__21464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PrimitiveClass__Group__2__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__Group__3__Impl_in_rule__PrimitiveClass__Group__31523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveClass__PrimitiveTypeAssignment_3_in_rule__PrimitiveClass__Group__3__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__0__Impl_in_rule__EmbeddedClass__Group__01588 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__1_in_rule__EmbeddedClass__Group__01591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EmbeddedClass__Group__0__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__1__Impl_in_rule__EmbeddedClass__Group__11650 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__2_in_rule__EmbeddedClass__Group__11653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__NameAssignment_1_in_rule__EmbeddedClass__Group__1__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__2__Impl_in_rule__EmbeddedClass__Group__21710 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__3_in_rule__EmbeddedClass__Group__21713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EmbeddedClass__Group__2__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__3__Impl_in_rule__EmbeddedClass__Group__31772 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__4_in_rule__EmbeddedClass__Group__31775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EmbeddedClass__Group__3__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__4__Impl_in_rule__EmbeddedClass__Group__41834 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__5_in_rule__EmbeddedClass__Group__41837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__IdPropertyAssignment_4_in_rule__EmbeddedClass__Group__4__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__5__Impl_in_rule__EmbeddedClass__Group__51894 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__6_in_rule__EmbeddedClass__Group__51897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__EmbeddedPropertiesAssignment_5_in_rule__EmbeddedClass__Group__5__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__6__Impl_in_rule__EmbeddedClass__Group__61954 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__7_in_rule__EmbeddedClass__Group__61957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__EmbeddedPropertiesAssignment_6_in_rule__EmbeddedClass__Group__6__Impl1984 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__EmbeddedClass__Group__7__Impl_in_rule__EmbeddedClass__Group__72015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EmbeddedClass__Group__7__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__0__Impl_in_rule__StandardClass__Group__02090 = new BitSet(new long[]{0x0000000800880000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__1_in_rule__StandardClass__Group__02093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__IsAbstractAssignment_0_in_rule__StandardClass__Group__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__1__Impl_in_rule__StandardClass__Group__12151 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__2_in_rule__StandardClass__Group__12154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__StandardClass__Group__1__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__2__Impl_in_rule__StandardClass__Group__22213 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__3_in_rule__StandardClass__Group__22216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__NameAssignment_2_in_rule__StandardClass__Group__2__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__3__Impl_in_rule__StandardClass__Group__32273 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__4_in_rule__StandardClass__Group__32276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__0_in_rule__StandardClass__Group__3__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__4__Impl_in_rule__StandardClass__Group__42334 = new BitSet(new long[]{0x0000000508600000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__5_in_rule__StandardClass__Group__42337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__StandardClass__Group__4__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__5__Impl_in_rule__StandardClass__Group__52396 = new BitSet(new long[]{0x0000000508600000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__6_in_rule__StandardClass__Group__52399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_5__0_in_rule__StandardClass__Group__5__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__6__Impl_in_rule__StandardClass__Group__62457 = new BitSet(new long[]{0x0000000508600000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__7_in_rule__StandardClass__Group__62460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_6__0_in_rule__StandardClass__Group__6__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group__7__Impl_in_rule__StandardClass__Group__72518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__StandardClass__Group__7__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__0__Impl_in_rule__StandardClass__Group_3__02593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__1_in_rule__StandardClass__Group_3__02596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__StandardClass__Group_3__0__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__1__Impl_in_rule__StandardClass__Group_3__12655 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__2_in_rule__StandardClass__Group_3__12658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__ParentAssignment_3_1_in_rule__StandardClass__Group_3__1__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__2__Impl_in_rule__StandardClass__Group_3__22715 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__3_in_rule__StandardClass__Group_3__22718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__StandardClass__Group_3__2__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_3__3__Impl_in_rule__StandardClass__Group_3__32777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__InheritanceTypeAssignment_3_3_in_rule__StandardClass__Group_3__3__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_5__0__Impl_in_rule__StandardClass__Group_5__02842 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_5__1_in_rule__StandardClass__Group_5__02845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__StandardClass__Group_5__0__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_5__1__Impl_in_rule__StandardClass__Group_5__12904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__IdPropertyAssignment_5_1_in_rule__StandardClass__Group_5__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_6__0__Impl_in_rule__StandardClass__Group_6__02965 = new BitSet(new long[]{0x0000000508000000L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_6__1_in_rule__StandardClass__Group_6__02968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__PropertiesAssignment_6_0_in_rule__StandardClass__Group_6__0__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__Group_6__1__Impl_in_rule__StandardClass__Group_6__13025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardClass__PropertiesAssignment_6_1_in_rule__StandardClass__Group_6__1__Impl3052 = new BitSet(new long[]{0x0000000508000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__0__Impl_in_rule__EmbeddedProperty__Group__03087 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__1_in_rule__EmbeddedProperty__Group__03090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EmbeddedProperty__Group__0__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__1__Impl_in_rule__EmbeddedProperty__Group__13149 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__2_in_rule__EmbeddedProperty__Group__13152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__IsMandatoryAssignment_1_in_rule__EmbeddedProperty__Group__1__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__2__Impl_in_rule__EmbeddedProperty__Group__23209 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__3_in_rule__EmbeddedProperty__Group__23212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__NameAssignment_2_in_rule__EmbeddedProperty__Group__2__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__3__Impl_in_rule__EmbeddedProperty__Group__33269 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__4_in_rule__EmbeddedProperty__Group__33272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EmbeddedProperty__Group__3__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__Group__4__Impl_in_rule__EmbeddedProperty__Group__43331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EmbeddedProperty__TypeAssignment_4_in_rule__EmbeddedProperty__Group__4__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__0__Impl_in_rule__PrimitiveProperty__Group__03398 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__1_in_rule__PrimitiveProperty__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__PrimitiveProperty__Group__0__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__1__Impl_in_rule__PrimitiveProperty__Group__13460 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__2_in_rule__PrimitiveProperty__Group__13463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1_in_rule__PrimitiveProperty__Group__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__2__Impl_in_rule__PrimitiveProperty__Group__23520 = new BitSet(new long[]{0x0000000010040020L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__3_in_rule__PrimitiveProperty__Group__23523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__NameAssignment_2_in_rule__PrimitiveProperty__Group__2__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__3__Impl_in_rule__PrimitiveProperty__Group__33580 = new BitSet(new long[]{0x0000000010040020L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__4_in_rule__PrimitiveProperty__Group__33583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Alternatives_3_in_rule__PrimitiveProperty__Group__3__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__4__Impl_in_rule__PrimitiveProperty__Group__43641 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__5_in_rule__PrimitiveProperty__Group__43644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__PrimitiveProperty__Group__4__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__5__Impl_in_rule__PrimitiveProperty__Group__53703 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__6_in_rule__PrimitiveProperty__Group__53706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__TypeAssignment_5_in_rule__PrimitiveProperty__Group__5__Impl3733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group__6__Impl_in_rule__PrimitiveProperty__Group__63763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_6__0_in_rule__PrimitiveProperty__Group__6__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_0__0__Impl_in_rule__PrimitiveProperty__Group_3_0__03835 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_0__1_in_rule__PrimitiveProperty__Group_3_0__03838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__PrimitiveProperty__Group_3_0__0__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_0__1__Impl_in_rule__PrimitiveProperty__Group_3_0__13897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UpperBoundAssignment_3_0_1_in_rule__PrimitiveProperty__Group_3_0__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1__0__Impl_in_rule__PrimitiveProperty__Group_3_1__03958 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1__1_in_rule__PrimitiveProperty__Group_3_1__03961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__0_in_rule__PrimitiveProperty__Group_3_1__0__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1__1__Impl_in_rule__PrimitiveProperty__Group_3_1__14018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__PrimitiveProperty__Group_3_1__1__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__0__Impl_in_rule__PrimitiveProperty__Group_3_1_0__04081 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__1_in_rule__PrimitiveProperty__Group_3_1_0__04084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_0_in_rule__PrimitiveProperty__Group_3_1_0__0__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__1__Impl_in_rule__PrimitiveProperty__Group_3_1_0__14141 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__2_in_rule__PrimitiveProperty__Group_3_1_0__14144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__PrimitiveProperty__Group_3_1_0__1__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_3_1_0__2__Impl_in_rule__PrimitiveProperty__Group_3_1_0__24203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_2_in_rule__PrimitiveProperty__Group_3_1_0__2__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_6__0__Impl_in_rule__PrimitiveProperty__Group_6__04266 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_6__1_in_rule__PrimitiveProperty__Group_6__04269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PrimitiveProperty__Group_6__0__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__Group_6__1__Impl_in_rule__PrimitiveProperty__Group_6__14328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__DefaultValueAssignment_6_1_in_rule__PrimitiveProperty__Group_6__1__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__0__Impl_in_rule__AssociationProperty__Group__04389 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__1_in_rule__AssociationProperty__Group__04392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AssociationProperty__Group__0__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__1__Impl_in_rule__AssociationProperty__Group__14451 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__2_in_rule__AssociationProperty__Group__14454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UnorderedGroup_1_in_rule__AssociationProperty__Group__1__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__2__Impl_in_rule__AssociationProperty__Group__24511 = new BitSet(new long[]{0x0000000210040020L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__3_in_rule__AssociationProperty__Group__24514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__NameAssignment_2_in_rule__AssociationProperty__Group__2__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__3__Impl_in_rule__AssociationProperty__Group__34571 = new BitSet(new long[]{0x0000000210040020L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__4_in_rule__AssociationProperty__Group__34574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Alternatives_3_in_rule__AssociationProperty__Group__3__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__4__Impl_in_rule__AssociationProperty__Group__44632 = new BitSet(new long[]{0x0000000210040020L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__5_in_rule__AssociationProperty__Group__44635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_4__0_in_rule__AssociationProperty__Group__4__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__5__Impl_in_rule__AssociationProperty__Group__54693 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__6_in_rule__AssociationProperty__Group__54696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AssociationProperty__Group__5__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group__6__Impl_in_rule__AssociationProperty__Group__64755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__TypeAssignment_6_in_rule__AssociationProperty__Group__6__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_0__0__Impl_in_rule__AssociationProperty__Group_3_0__04826 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_0__1_in_rule__AssociationProperty__Group_3_0__04829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AssociationProperty__Group_3_0__0__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_0__1__Impl_in_rule__AssociationProperty__Group_3_0__14888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UpperBoundAssignment_3_0_1_in_rule__AssociationProperty__Group_3_0__1__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1__0__Impl_in_rule__AssociationProperty__Group_3_1__04949 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1__1_in_rule__AssociationProperty__Group_3_1__04952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__0_in_rule__AssociationProperty__Group_3_1__0__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1__1__Impl_in_rule__AssociationProperty__Group_3_1__15009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AssociationProperty__Group_3_1__1__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__0__Impl_in_rule__AssociationProperty__Group_3_1_0__05072 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__1_in_rule__AssociationProperty__Group_3_1_0__05075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__LowerBoundAssignment_3_1_0_0_in_rule__AssociationProperty__Group_3_1_0__0__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__1__Impl_in_rule__AssociationProperty__Group_3_1_0__15132 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__2_in_rule__AssociationProperty__Group_3_1_0__15135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AssociationProperty__Group_3_1_0__1__Impl5163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_3_1_0__2__Impl_in_rule__AssociationProperty__Group_3_1_0__25194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UpperBoundAssignment_3_1_0_2_in_rule__AssociationProperty__Group_3_1_0__2__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_4__0__Impl_in_rule__AssociationProperty__Group_4__05257 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_4__1_in_rule__AssociationProperty__Group_4__05260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AssociationProperty__Group_4__0__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__Group_4__1__Impl_in_rule__AssociationProperty__Group_4__15319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__OppositePropertyAssignment_4_1_in_rule__AssociationProperty__Group_4__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__0__Impl_in_rule__NestedProperty__Group__05380 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__1_in_rule__NestedProperty__Group__05383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__NestedProperty__Group__0__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__1__Impl_in_rule__NestedProperty__Group__15442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__2_in_rule__NestedProperty__Group__15445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UnorderedGroup_1_in_rule__NestedProperty__Group__1__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__2__Impl_in_rule__NestedProperty__Group__25502 = new BitSet(new long[]{0x0000000010040020L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__3_in_rule__NestedProperty__Group__25505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__NameAssignment_2_in_rule__NestedProperty__Group__2__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__3__Impl_in_rule__NestedProperty__Group__35562 = new BitSet(new long[]{0x0000000010040020L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__4_in_rule__NestedProperty__Group__35565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Alternatives_3_in_rule__NestedProperty__Group__3__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__4__Impl_in_rule__NestedProperty__Group__45623 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__5_in_rule__NestedProperty__Group__45626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__NestedProperty__Group__4__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group__5__Impl_in_rule__NestedProperty__Group__55685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__TypeAssignment_5_in_rule__NestedProperty__Group__5__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_0__0__Impl_in_rule__NestedProperty__Group_3_0__05754 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_0__1_in_rule__NestedProperty__Group_3_0__05757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__NestedProperty__Group_3_0__0__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_0__1__Impl_in_rule__NestedProperty__Group_3_0__15816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UpperBoundAssignment_3_0_1_in_rule__NestedProperty__Group_3_0__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1__0__Impl_in_rule__NestedProperty__Group_3_1__05877 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1__1_in_rule__NestedProperty__Group_3_1__05880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__0_in_rule__NestedProperty__Group_3_1__0__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1__1__Impl_in_rule__NestedProperty__Group_3_1__15937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__NestedProperty__Group_3_1__1__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__0__Impl_in_rule__NestedProperty__Group_3_1_0__06000 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__1_in_rule__NestedProperty__Group_3_1_0__06003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__LowerBoundAssignment_3_1_0_0_in_rule__NestedProperty__Group_3_1_0__0__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__1__Impl_in_rule__NestedProperty__Group_3_1_0__16060 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__2_in_rule__NestedProperty__Group_3_1_0__16063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__NestedProperty__Group_3_1_0__1__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__Group_3_1_0__2__Impl_in_rule__NestedProperty__Group_3_1_0__26122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UpperBoundAssignment_3_1_0_2_in_rule__NestedProperty__Group_3_1_0__2__Impl6149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__0_in_rule__PrimitiveProperty__UnorderedGroup_16186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__IsOrderedAssignment_1_0_in_rule__PrimitiveProperty__UnorderedGroup_1__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__IsUniqueAssignment_1_1_in_rule__PrimitiveProperty__UnorderedGroup_1__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__Impl_in_rule__PrimitiveProperty__UnorderedGroup_1__06423 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__1_in_rule__PrimitiveProperty__UnorderedGroup_1__06426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PrimitiveProperty__UnorderedGroup_1__Impl_in_rule__PrimitiveProperty__UnorderedGroup_1__16451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UnorderedGroup_1__0_in_rule__AssociationProperty__UnorderedGroup_16479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__IsOrderedAssignment_1_0_in_rule__AssociationProperty__UnorderedGroup_1__Impl6566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__IsUniqueAssignment_1_1_in_rule__AssociationProperty__UnorderedGroup_1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UnorderedGroup_1__Impl_in_rule__AssociationProperty__UnorderedGroup_1__06716 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UnorderedGroup_1__1_in_rule__AssociationProperty__UnorderedGroup_1__06719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssociationProperty__UnorderedGroup_1__Impl_in_rule__AssociationProperty__UnorderedGroup_1__16744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UnorderedGroup_1__0_in_rule__NestedProperty__UnorderedGroup_16772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__IsOrderedAssignment_1_0_in_rule__NestedProperty__UnorderedGroup_1__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__IsUniqueAssignment_1_1_in_rule__NestedProperty__UnorderedGroup_1__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UnorderedGroup_1__Impl_in_rule__NestedProperty__UnorderedGroup_1__07009 = new BitSet(new long[]{0x0000006000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UnorderedGroup_1__1_in_rule__NestedProperty__UnorderedGroup_1__07012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NestedProperty__UnorderedGroup_1__Impl_in_rule__NestedProperty__UnorderedGroup_1__17037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModelEntity_in_rule__Structure__EntitiesAssignment7069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveClass__NameAssignment_17100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveClass__PrimitiveTypeAssignment_37131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedClass__NameAssignment_17162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedClass__IdPropertyAssignment_47197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedClass__EmbeddedPropertiesAssignment_57236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedClass__EmbeddedPropertiesAssignment_67275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__StandardClass__IsAbstractAssignment_07315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__StandardClass__NameAssignment_27354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__StandardClass__ParentAssignment_3_17389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInheritanceType_in_rule__StandardClass__InheritanceTypeAssignment_3_37424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__StandardClass__IdPropertyAssignment_5_17459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_rule__StandardClass__PropertiesAssignment_6_07494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipliableProperty_in_rule__StandardClass__PropertiesAssignment_6_17525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EmbeddedProperty__IsMandatoryAssignment_17561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedProperty__NameAssignment_27600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EmbeddedProperty__TypeAssignment_47635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__PrimitiveProperty__IsOrderedAssignment_1_07675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__PrimitiveProperty__IsUniqueAssignment_1_17719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveProperty__NameAssignment_27758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveProperty__UpperBoundAssignment_3_0_17789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveProperty__LowerBoundAssignment_3_1_0_07820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__PrimitiveProperty__UpperBoundAssignment_3_1_0_27851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveProperty__TypeAssignment_57886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveProperty__DefaultValueAssignment_6_17921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AssociationProperty__IsOrderedAssignment_1_07957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AssociationProperty__IsUniqueAssignment_1_18001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationProperty__NameAssignment_28040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AssociationProperty__UpperBoundAssignment_3_0_18071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AssociationProperty__LowerBoundAssignment_3_1_0_08102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__AssociationProperty__UpperBoundAssignment_3_1_0_28133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationProperty__OppositePropertyAssignment_4_18168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationProperty__TypeAssignment_68207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__NestedProperty__IsOrderedAssignment_1_08247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__NestedProperty__IsUniqueAssignment_1_18291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__NestedProperty__NameAssignment_28330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__NestedProperty__UpperBoundAssignment_3_0_18361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__NestedProperty__LowerBoundAssignment_3_1_0_08392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__NestedProperty__UpperBoundAssignment_3_1_0_28423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__NestedProperty__TypeAssignment_58458 = new BitSet(new long[]{0x0000000000000002L});
    }


}