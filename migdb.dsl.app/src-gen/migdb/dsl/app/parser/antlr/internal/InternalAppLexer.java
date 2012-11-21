package migdb.dsl.app.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppLexer extends Lexer {
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
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalAppLexer() {;} 
    public InternalAppLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAppLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:11:7: ( 'primitive' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:11:9: 'primitive'
            {
            match("primitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:12:7: ( ':' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:13:7: ( 'embedded' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:13:9: 'embedded'
            {
            match("embedded"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:14:7: ( '{' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:15:7: ( 'id' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:15:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:16:7: ( '}' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:17:7: ( 'abstract' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:17:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:18:7: ( 'class' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:18:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:19:7: ( 'extends' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:19:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:20:7: ( 'by' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:20:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:21:7: ( 'EmbeddedProperty' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:21:9: 'EmbeddedProperty'
            {
            match("EmbeddedProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:22:7: ( 'mandatory' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:22:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:23:7: ( 'PrimitiveProperty' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:23:9: 'PrimitiveProperty'
            {
            match("PrimitiveProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:24:7: ( 'ordered' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:24:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:25:7: ( 'unique' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:25:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:26:7: ( '[' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:26:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:27:7: ( '..' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:27:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:28:7: ( ']' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:29:7: ( '=' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:30:7: ( 'AssociationProperty' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:30:9: 'AssociationProperty'
            {
            match("AssociationProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:31:7: ( 'oposite' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:31:9: 'oposite'
            {
            match("oposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:32:7: ( 'NestedProperty' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:32:9: 'NestedProperty'
            {
            match("NestedProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:33:7: ( 'boolean' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:33:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:34:7: ( 'char' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:34:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:35:7: ( 'int' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:35:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:36:7: ( 'joined' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:36:9: 'joined'
            {
            match("joined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:37:7: ( 'tablePerClass' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:37:9: 'tablePerClass'
            {
            match("tablePerClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:38:7: ( 'singleTable' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:38:9: 'singleTable'
            {
            match("singleTable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1342:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1342:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1342:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1344:10: ( ( '0' .. '9' )+ )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1344:12: ( '0' .. '9' )+
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1344:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1344:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1346:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1348:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1348:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1348:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1348:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:41: ( '\\r' )? '\\n'
                    {
                    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1350:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1352:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1352:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1352:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1354:16: ( . )
            // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1354:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=35;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:178: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:186: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:195: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:207: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:223: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:239: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // ../migdb.dsl.app/src-gen/migdb/dsl/app/parser/antlr/internal/InternalApp.g:1:247: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\40\1\uffff\1\40\1\uffff\1\40\1\uffff\10\40\1\uffff\1"+
        "\36\2\uffff\5\40\2\uffff\3\36\2\uffff\1\40\2\uffff\2\40\1\uffff"+
        "\1\104\1\40\1\uffff\3\40\1\111\7\40\4\uffff\5\40\5\uffff\3\40\1"+
        "\uffff\1\131\3\40\1\uffff\17\40\1\uffff\2\40\1\156\20\40\1\177\1"+
        "\uffff\20\40\1\uffff\6\40\1\u0096\2\40\1\u0099\4\40\1\u009e\1\40"+
        "\1\u00a0\3\40\1\u00a4\1\u00a5\1\uffff\2\40\1\uffff\3\40\1\u00ab"+
        "\1\uffff\1\u00ac\1\uffff\3\40\2\uffff\4\40\1\u00b4\2\uffff\1\40"+
        "\1\u00b6\5\40\1\uffff\1\40\1\uffff\12\40\1\u00c7\5\40\1\uffff\4"+
        "\40\1\u00d1\3\40\1\u00d5\1\uffff\3\40\1\uffff\1\u00d9\2\40\1\uffff"+
        "\1\u00dc\1\40\1\uffff\1\40\1\u00df\1\uffff";
    static final String DFA11_eofS =
        "\u00e0\uffff";
    static final String DFA11_minS =
        "\1\0\1\162\1\uffff\1\155\1\uffff\1\144\1\uffff\1\142\1\150\1\157"+
        "\1\155\1\141\1\162\1\160\1\156\1\uffff\1\56\2\uffff\1\163\1\145"+
        "\1\157\1\141\1\151\2\uffff\2\0\1\52\2\uffff\1\151\2\uffff\1\142"+
        "\1\164\1\uffff\1\60\1\164\1\uffff\1\163\2\141\1\60\1\157\1\142\1"+
        "\156\1\151\1\144\1\157\1\151\4\uffff\2\163\1\151\1\142\1\156\5\uffff"+
        "\1\155\2\145\1\uffff\1\60\1\164\1\163\1\162\1\uffff\1\154\1\145"+
        "\1\144\1\155\1\145\1\163\1\161\1\157\1\164\1\156\1\154\1\147\1\151"+
        "\1\144\1\156\1\uffff\1\162\1\163\1\60\1\145\1\144\1\141\1\151\1"+
        "\162\1\151\1\165\1\143\3\145\1\154\1\164\2\144\1\141\1\60\1\uffff"+
        "\1\141\1\144\2\164\1\145\1\164\1\145\1\151\2\144\1\120\1\145\1\151"+
        "\1\145\1\163\1\143\1\uffff\1\156\1\145\1\157\1\151\1\144\1\145\1"+
        "\60\1\141\1\120\1\60\1\145\1\124\1\166\1\144\1\60\1\164\1\60\1\144"+
        "\1\162\1\166\2\60\1\uffff\1\164\1\162\1\uffff\1\162\1\141\1\145"+
        "\1\60\1\uffff\1\60\1\uffff\1\120\1\171\1\145\2\uffff\1\151\1\157"+
        "\1\103\1\142\1\60\2\uffff\1\162\1\60\1\120\1\157\1\160\2\154\1\uffff"+
        "\1\157\1\uffff\1\162\1\156\1\145\1\141\1\145\1\160\1\157\1\120\1"+
        "\162\1\163\1\60\1\145\1\160\1\162\1\164\1\163\1\uffff\1\162\1\145"+
        "\1\157\1\171\1\60\1\164\1\162\1\160\1\60\1\uffff\1\171\1\164\1\145"+
        "\1\uffff\1\60\1\171\1\162\1\uffff\1\60\1\164\1\uffff\1\171\1\60"+
        "\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\162\1\uffff\1\170\1\uffff\1\156\1\uffff\1\142\1\154"+
        "\1\171\1\155\1\141\2\162\1\156\1\uffff\1\56\2\uffff\1\163\1\145"+
        "\1\157\1\141\1\151\2\uffff\2\uffff\1\57\2\uffff\1\151\2\uffff\1"+
        "\142\1\164\1\uffff\1\172\1\164\1\uffff\1\163\2\141\1\172\1\157\1"+
        "\142\1\156\1\151\1\144\1\157\1\151\4\uffff\2\163\1\151\1\142\1\156"+
        "\5\uffff\1\155\2\145\1\uffff\1\172\1\164\1\163\1\162\1\uffff\1\154"+
        "\1\145\1\144\1\155\1\145\1\163\1\161\1\157\1\164\1\156\1\154\1\147"+
        "\1\151\1\144\1\156\1\uffff\1\162\1\163\1\172\1\145\1\144\1\141\1"+
        "\151\1\162\1\151\1\165\1\143\3\145\1\154\1\164\2\144\1\141\1\172"+
        "\1\uffff\1\141\1\144\2\164\1\145\1\164\1\145\1\151\2\144\1\120\1"+
        "\145\1\151\1\145\1\163\1\143\1\uffff\1\156\1\145\1\157\1\151\1\144"+
        "\1\145\1\172\1\141\1\120\1\172\1\145\1\124\1\166\1\144\1\172\1\164"+
        "\1\172\1\144\1\162\1\166\2\172\1\uffff\1\164\1\162\1\uffff\1\162"+
        "\1\141\1\145\1\172\1\uffff\1\172\1\uffff\1\120\1\171\1\145\2\uffff"+
        "\1\151\1\157\1\103\1\142\1\172\2\uffff\1\162\1\172\1\120\1\157\1"+
        "\160\2\154\1\uffff\1\157\1\uffff\1\162\1\156\1\145\1\141\1\145\1"+
        "\160\1\157\1\120\1\162\1\163\1\172\1\145\1\160\1\162\1\164\1\163"+
        "\1\uffff\1\162\1\145\1\157\1\171\1\172\1\164\1\162\1\160\1\172\1"+
        "\uffff\1\171\1\164\1\145\1\uffff\1\172\1\171\1\162\1\uffff\1\172"+
        "\1\164\1\uffff\1\171\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\6\10\uffff\1\20\1\uffff\1\22"+
        "\1\23\5\uffff\1\35\1\36\3\uffff\1\42\1\43\1\uffff\1\35\1\2\2\uffff"+
        "\1\4\2\uffff\1\6\13\uffff\1\20\1\21\1\22\1\23\5\uffff\1\36\1\37"+
        "\1\40\1\41\1\42\3\uffff\1\5\4\uffff\1\12\17\uffff\1\31\24\uffff"+
        "\1\30\20\uffff\1\10\26\uffff\1\17\2\uffff\1\32\4\uffff\1\11\1\uffff"+
        "\1\27\3\uffff\1\16\1\25\5\uffff\1\3\1\7\7\uffff\1\1\1\uffff\1\14"+
        "\20\uffff\1\34\11\uffff\1\33\3\uffff\1\26\3\uffff\1\13\2\uffff\1"+
        "\15\2\uffff\1\24";
    static final String DFA11_specialS =
        "\1\0\31\uffff\1\1\1\2\u00c4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\4\36\1\33\6\36\1"+
            "\20\1\34\12\31\1\2\2\36\1\22\3\36\1\23\3\30\1\12\10\30\1\24"+
            "\1\30\1\14\12\30\1\17\1\36\1\21\1\36\1\30\1\36\1\7\1\11\1\10"+
            "\1\30\1\3\3\30\1\5\1\25\2\30\1\13\1\30\1\15\1\1\2\30\1\27\1"+
            "\26\1\16\5\30\1\4\1\36\1\6\uff82\36",
            "\1\37",
            "",
            "\1\42\12\uffff\1\43",
            "",
            "\1\45\11\uffff\1\46",
            "",
            "\1\50",
            "\1\52\3\uffff\1\51",
            "\1\54\11\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\61\1\uffff\1\60",
            "\1\62",
            "",
            "\1\64",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0097",
            "\1\u0098",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009f",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u00b5",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00da",
            "\1\u00db",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    static class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='p') ) {s = 1;}

                        else if ( (LA11_0==':') ) {s = 2;}

                        else if ( (LA11_0=='e') ) {s = 3;}

                        else if ( (LA11_0=='{') ) {s = 4;}

                        else if ( (LA11_0=='i') ) {s = 5;}

                        else if ( (LA11_0=='}') ) {s = 6;}

                        else if ( (LA11_0=='a') ) {s = 7;}

                        else if ( (LA11_0=='c') ) {s = 8;}

                        else if ( (LA11_0=='b') ) {s = 9;}

                        else if ( (LA11_0=='E') ) {s = 10;}

                        else if ( (LA11_0=='m') ) {s = 11;}

                        else if ( (LA11_0=='P') ) {s = 12;}

                        else if ( (LA11_0=='o') ) {s = 13;}

                        else if ( (LA11_0=='u') ) {s = 14;}

                        else if ( (LA11_0=='[') ) {s = 15;}

                        else if ( (LA11_0=='.') ) {s = 16;}

                        else if ( (LA11_0==']') ) {s = 17;}

                        else if ( (LA11_0=='=') ) {s = 18;}

                        else if ( (LA11_0=='A') ) {s = 19;}

                        else if ( (LA11_0=='N') ) {s = 20;}

                        else if ( (LA11_0=='j') ) {s = 21;}

                        else if ( (LA11_0=='t') ) {s = 22;}

                        else if ( (LA11_0=='s') ) {s = 23;}

                        else if ( ((LA11_0>='B' && LA11_0<='D')||(LA11_0>='F' && LA11_0<='M')||LA11_0=='O'||(LA11_0>='Q' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='d'||(LA11_0>='f' && LA11_0<='h')||(LA11_0>='k' && LA11_0<='l')||LA11_0=='n'||(LA11_0>='q' && LA11_0<='r')||(LA11_0>='v' && LA11_0<='z')) ) {s = 24;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 25;}

                        else if ( (LA11_0=='\"') ) {s = 26;}

                        else if ( (LA11_0=='\'') ) {s = 27;}

                        else if ( (LA11_0=='/') ) {s = 28;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 29;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='-')||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='>' && LA11_0<='@')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_26 = input.LA(1);

                        s = -1;
                        if ( ((LA11_26>='\u0000' && LA11_26<='\uFFFF')) ) {s = 61;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_27 = input.LA(1);

                        s = -1;
                        if ( ((LA11_27>='\u0000' && LA11_27<='\uFFFF')) ) {s = 61;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}