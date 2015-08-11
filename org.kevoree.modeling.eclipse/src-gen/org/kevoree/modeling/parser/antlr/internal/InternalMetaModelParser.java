package org.kevoree.modeling.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kevoree.modeling.services.MetaModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'enum'", "'{'", "','", "'}'", "'class'", "'extends'", "'att'", "':'", "'String'", "'Double'", "'Long'", "'Continuous'", "'Int'", "'Bool'", "'ref'", "'ref*'", "'dependency'", "'input'", "'output'", "'with'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMetaModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetaModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetaModelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g"; }



     	private MetaModelGrammarAccess grammarAccess;
     	
        public InternalMetaModelParser(TokenStream input, MetaModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MetaModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleannotationDeclr ) )* ( (lv_declarations_1_0= ruledecl ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_annotations_0_0 = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:79:28: ( ( ( (lv_annotations_0_0= ruleannotationDeclr ) )* ( (lv_declarations_1_0= ruledecl ) )* ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:80:1: ( ( (lv_annotations_0_0= ruleannotationDeclr ) )* ( (lv_declarations_1_0= ruledecl ) )* )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:80:1: ( ( (lv_annotations_0_0= ruleannotationDeclr ) )* ( (lv_declarations_1_0= ruledecl ) )* )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:80:2: ( (lv_annotations_0_0= ruleannotationDeclr ) )* ( (lv_declarations_1_0= ruledecl ) )*
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:80:2: ( (lv_annotations_0_0= ruleannotationDeclr ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:81:1: (lv_annotations_0_0= ruleannotationDeclr )
            	    {
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:81:1: (lv_annotations_0_0= ruleannotationDeclr )
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:82:3: lv_annotations_0_0= ruleannotationDeclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsAnnotationDeclrParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_ruleModel131);
            	    lv_annotations_0_0=ruleannotationDeclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"annotationDeclr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:98:3: ( (lv_declarations_1_0= ruledecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:99:1: (lv_declarations_1_0= ruledecl )
            	    {
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:99:1: (lv_declarations_1_0= ruledecl )
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:100:3: lv_declarations_1_0= ruledecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleModel153);
            	    lv_declarations_1_0=ruledecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_1_0, 
            	            		"decl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuletypeName"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:124:1: entryRuletypeName returns [String current=null] : iv_ruletypeName= ruletypeName EOF ;
    public final String entryRuletypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletypeName = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:125:2: (iv_ruletypeName= ruletypeName EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:126:2: iv_ruletypeName= ruletypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruletypeName_in_entryRuletypeName191);
            iv_ruletypeName=ruletypeName();

            state._fsp--;

             current =iv_ruletypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeName202); 

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
    // $ANTLR end "entryRuletypeName"


    // $ANTLR start "ruletypeName"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:133:1: ruletypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruletypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:136:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:137:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:137:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:137:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletypeName242); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:144:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:145:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruletypeName261); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTypeNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletypeName276); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruletypeName"


    // $ANTLR start "entryRuledecl"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:165:1: entryRuledecl returns [EObject current=null] : iv_ruledecl= ruledecl EOF ;
    public final EObject entryRuledecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledecl = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:166:2: (iv_ruledecl= ruledecl EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:167:2: iv_ruledecl= ruledecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl323);
            iv_ruledecl=ruledecl();

            state._fsp--;

             current =iv_ruledecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl333); 

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
    // $ANTLR end "entryRuledecl"


    // $ANTLR start "ruledecl"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:174:1: ruledecl returns [EObject current=null] : ( ruleenumDeclr | this_classDeclr_1= ruleclassDeclr ) ;
    public final EObject ruledecl() throws RecognitionException {
        EObject current = null;

        EObject this_classDeclr_1 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:177:28: ( ( ruleenumDeclr | this_classDeclr_1= ruleclassDeclr ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:178:1: ( ruleenumDeclr | this_classDeclr_1= ruleclassDeclr )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:178:1: ( ruleenumDeclr | this_classDeclr_1= ruleclassDeclr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:179:5: ruleenumDeclr
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getEnumDeclrParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleenumDeclr_in_ruledecl374);
                    ruleenumDeclr();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:188:5: this_classDeclr_1= ruleclassDeclr
                    {
                     
                            newCompositeNode(grammarAccess.getDeclAccess().getClassDeclrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleclassDeclr_in_ruledecl401);
                    this_classDeclr_1=ruleclassDeclr();

                    state._fsp--;

                     
                            current = this_classDeclr_1; 
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
    // $ANTLR end "ruledecl"


    // $ANTLR start "entryRuleenumDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:204:1: entryRuleenumDeclr returns [String current=null] : iv_ruleenumDeclr= ruleenumDeclr EOF ;
    public final String entryRuleenumDeclr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleenumDeclr = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:205:2: (iv_ruleenumDeclr= ruleenumDeclr EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:206:2: iv_ruleenumDeclr= ruleenumDeclr EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclrRule()); 
            pushFollow(FOLLOW_ruleenumDeclr_in_entryRuleenumDeclr437);
            iv_ruleenumDeclr=ruleenumDeclr();

            state._fsp--;

             current =iv_ruleenumDeclr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumDeclr448); 

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
    // $ANTLR end "entryRuleenumDeclr"


    // $ANTLR start "ruleenumDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:213:1: ruleenumDeclr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' this_typeName_1= ruletypeName kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleenumDeclr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_typeName_1 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:216:28: ( (kw= 'enum' this_typeName_1= ruletypeName kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:217:1: (kw= 'enum' this_typeName_1= ruletypeName kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:217:1: (kw= 'enum' this_typeName_1= ruletypeName kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:218:2: kw= 'enum' this_typeName_1= ruletypeName kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleenumDeclr486); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumDeclrAccess().getEnumKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEnumDeclrAccess().getTypeNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletypeName_in_ruleenumDeclr508);
            this_typeName_1=ruletypeName();

            state._fsp--;


            		current.merge(this_typeName_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleenumDeclr526); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumDeclrAccess().getLeftCurlyBracketKeyword_2()); 
                
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleenumDeclr541); 

            		current.merge(this_ID_3);
                
             
                newLeafNode(this_ID_3, grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_3()); 
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:247:1: (kw= ',' this_ID_5= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:248:2: kw= ',' this_ID_5= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleenumDeclr560); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEnumDeclrAccess().getCommaKeyword_4_0()); 
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleenumDeclr575); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            kw=(Token)match(input,15,FOLLOW_15_in_ruleenumDeclr595); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumDeclrAccess().getRightCurlyBracketKeyword_5()); 
                

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
    // $ANTLR end "ruleenumDeclr"


    // $ANTLR start "entryRuleclassDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:274:1: entryRuleclassDeclr returns [EObject current=null] : iv_ruleclassDeclr= ruleclassDeclr EOF ;
    public final EObject entryRuleclassDeclr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclassDeclr = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:275:2: (iv_ruleclassDeclr= ruleclassDeclr EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:276:2: iv_ruleclassDeclr= ruleclassDeclr EOF
            {
             newCompositeNode(grammarAccess.getClassDeclrRule()); 
            pushFollow(FOLLOW_ruleclassDeclr_in_entryRuleclassDeclr635);
            iv_ruleclassDeclr=ruleclassDeclr();

            state._fsp--;

             current =iv_ruleclassDeclr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassDeclr645); 

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
    // $ANTLR end "entryRuleclassDeclr"


    // $ANTLR start "ruleclassDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:283:1: ruleclassDeclr returns [EObject current=null] : (otherlv_0= 'class' ruletypeName ( ruleclassParentDeclr )? otherlv_3= '{' ( (lv_annotations_4_0= ruleannotationDeclr ) )* ( (lv_declarations_5_0= ruleclassElemDeclr ) )* otherlv_6= '}' ) ;
    public final EObject ruleclassDeclr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_annotations_4_0 = null;

        AntlrDatatypeRuleToken lv_declarations_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:286:28: ( (otherlv_0= 'class' ruletypeName ( ruleclassParentDeclr )? otherlv_3= '{' ( (lv_annotations_4_0= ruleannotationDeclr ) )* ( (lv_declarations_5_0= ruleclassElemDeclr ) )* otherlv_6= '}' ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:287:1: (otherlv_0= 'class' ruletypeName ( ruleclassParentDeclr )? otherlv_3= '{' ( (lv_annotations_4_0= ruleannotationDeclr ) )* ( (lv_declarations_5_0= ruleclassElemDeclr ) )* otherlv_6= '}' )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:287:1: (otherlv_0= 'class' ruletypeName ( ruleclassParentDeclr )? otherlv_3= '{' ( (lv_annotations_4_0= ruleannotationDeclr ) )* ( (lv_declarations_5_0= ruleclassElemDeclr ) )* otherlv_6= '}' )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:287:3: otherlv_0= 'class' ruletypeName ( ruleclassParentDeclr )? otherlv_3= '{' ( (lv_annotations_4_0= ruleannotationDeclr ) )* ( (lv_declarations_5_0= ruleclassElemDeclr ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleclassDeclr682); 

                	newLeafNode(otherlv_0, grammarAccess.getClassDeclrAccess().getClassKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getClassDeclrAccess().getTypeNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletypeName_in_ruleclassDeclr698);
            ruletypeName();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:299:1: ( ruleclassParentDeclr )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:300:5: ruleclassParentDeclr
                    {
                     
                            newCompositeNode(grammarAccess.getClassDeclrAccess().getClassParentDeclrParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleclassParentDeclr_in_ruleclassDeclr714);
                    ruleclassParentDeclr();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleclassDeclr727); 

                	newLeafNode(otherlv_3, grammarAccess.getClassDeclrAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:311:1: ( (lv_annotations_4_0= ruleannotationDeclr ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:312:1: (lv_annotations_4_0= ruleannotationDeclr )
            	    {
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:312:1: (lv_annotations_4_0= ruleannotationDeclr )
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:313:3: lv_annotations_4_0= ruleannotationDeclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDeclrAccess().getAnnotationsAnnotationDeclrParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_ruleclassDeclr748);
            	    lv_annotations_4_0=ruleannotationDeclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDeclrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_4_0, 
            	            		"annotationDeclr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:329:3: ( (lv_declarations_5_0= ruleclassElemDeclr ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||(LA8_0>=26 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:330:1: (lv_declarations_5_0= ruleclassElemDeclr )
            	    {
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:330:1: (lv_declarations_5_0= ruleclassElemDeclr )
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:331:3: lv_declarations_5_0= ruleclassElemDeclr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassDeclrAccess().getDeclarationsClassElemDeclrParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleclassElemDeclr_in_ruleclassDeclr770);
            	    lv_declarations_5_0=ruleclassElemDeclr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassDeclrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_5_0, 
            	            		"classElemDeclr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleclassDeclr783); 

                	newLeafNode(otherlv_6, grammarAccess.getClassDeclrAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleclassDeclr"


    // $ANTLR start "entryRuleclassElemDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:359:1: entryRuleclassElemDeclr returns [String current=null] : iv_ruleclassElemDeclr= ruleclassElemDeclr EOF ;
    public final String entryRuleclassElemDeclr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassElemDeclr = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:360:2: (iv_ruleclassElemDeclr= ruleclassElemDeclr EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:361:2: iv_ruleclassElemDeclr= ruleclassElemDeclr EOF
            {
             newCompositeNode(grammarAccess.getClassElemDeclrRule()); 
            pushFollow(FOLLOW_ruleclassElemDeclr_in_entryRuleclassElemDeclr820);
            iv_ruleclassElemDeclr=ruleclassElemDeclr();

            state._fsp--;

             current =iv_ruleclassElemDeclr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassElemDeclr831); 

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
    // $ANTLR end "entryRuleclassElemDeclr"


    // $ANTLR start "ruleclassElemDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:368:1: ruleclassElemDeclr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_attributeDeclaration_0= ruleattributeDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_dependencyDeclaration_2= ruledependencyDeclaration | this_inputDeclaration_3= ruleinputDeclaration | this_outputDeclaration_4= ruleoutputDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleclassElemDeclr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_attributeDeclaration_0 = null;

        AntlrDatatypeRuleToken this_referenceDeclaration_1 = null;

        AntlrDatatypeRuleToken this_dependencyDeclaration_2 = null;

        AntlrDatatypeRuleToken this_inputDeclaration_3 = null;

        AntlrDatatypeRuleToken this_outputDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:371:28: ( (this_attributeDeclaration_0= ruleattributeDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_dependencyDeclaration_2= ruledependencyDeclaration | this_inputDeclaration_3= ruleinputDeclaration | this_outputDeclaration_4= ruleoutputDeclaration ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:372:1: (this_attributeDeclaration_0= ruleattributeDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_dependencyDeclaration_2= ruledependencyDeclaration | this_inputDeclaration_3= ruleinputDeclaration | this_outputDeclaration_4= ruleoutputDeclaration )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:372:1: (this_attributeDeclaration_0= ruleattributeDeclaration | this_referenceDeclaration_1= rulereferenceDeclaration | this_dependencyDeclaration_2= ruledependencyDeclaration | this_inputDeclaration_3= ruleinputDeclaration | this_outputDeclaration_4= ruleoutputDeclaration )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 26:
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:373:5: this_attributeDeclaration_0= ruleattributeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getClassElemDeclrAccess().getAttributeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleattributeDeclaration_in_ruleclassElemDeclr878);
                    this_attributeDeclaration_0=ruleattributeDeclaration();

                    state._fsp--;


                    		current.merge(this_attributeDeclaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:385:5: this_referenceDeclaration_1= rulereferenceDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getClassElemDeclrAccess().getReferenceDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulereferenceDeclaration_in_ruleclassElemDeclr911);
                    this_referenceDeclaration_1=rulereferenceDeclaration();

                    state._fsp--;


                    		current.merge(this_referenceDeclaration_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:397:5: this_dependencyDeclaration_2= ruledependencyDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getClassElemDeclrAccess().getDependencyDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruledependencyDeclaration_in_ruleclassElemDeclr944);
                    this_dependencyDeclaration_2=ruledependencyDeclaration();

                    state._fsp--;


                    		current.merge(this_dependencyDeclaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:409:5: this_inputDeclaration_3= ruleinputDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getClassElemDeclrAccess().getInputDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleinputDeclaration_in_ruleclassElemDeclr977);
                    this_inputDeclaration_3=ruleinputDeclaration();

                    state._fsp--;


                    		current.merge(this_inputDeclaration_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:421:5: this_outputDeclaration_4= ruleoutputDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getClassElemDeclrAccess().getOutputDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleoutputDeclaration_in_ruleclassElemDeclr1010);
                    this_outputDeclaration_4=ruleoutputDeclaration();

                    state._fsp--;


                    		current.merge(this_outputDeclaration_4);
                        
                     
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
    // $ANTLR end "ruleclassElemDeclr"


    // $ANTLR start "entryRuleclassParentDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:439:1: entryRuleclassParentDeclr returns [String current=null] : iv_ruleclassParentDeclr= ruleclassParentDeclr EOF ;
    public final String entryRuleclassParentDeclr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassParentDeclr = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:440:2: (iv_ruleclassParentDeclr= ruleclassParentDeclr EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:441:2: iv_ruleclassParentDeclr= ruleclassParentDeclr EOF
            {
             newCompositeNode(grammarAccess.getClassParentDeclrRule()); 
            pushFollow(FOLLOW_ruleclassParentDeclr_in_entryRuleclassParentDeclr1056);
            iv_ruleclassParentDeclr=ruleclassParentDeclr();

            state._fsp--;

             current =iv_ruleclassParentDeclr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassParentDeclr1067); 

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
    // $ANTLR end "entryRuleclassParentDeclr"


    // $ANTLR start "ruleclassParentDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:448:1: ruleclassParentDeclr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extends' this_typeName_1= ruletypeName (kw= ',' this_typeName_3= ruletypeName )* ) ;
    public final AntlrDatatypeRuleToken ruleclassParentDeclr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeName_1 = null;

        AntlrDatatypeRuleToken this_typeName_3 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:451:28: ( (kw= 'extends' this_typeName_1= ruletypeName (kw= ',' this_typeName_3= ruletypeName )* ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:452:1: (kw= 'extends' this_typeName_1= ruletypeName (kw= ',' this_typeName_3= ruletypeName )* )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:452:1: (kw= 'extends' this_typeName_1= ruletypeName (kw= ',' this_typeName_3= ruletypeName )* )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:453:2: kw= 'extends' this_typeName_1= ruletypeName (kw= ',' this_typeName_3= ruletypeName )*
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleclassParentDeclr1105); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassParentDeclrAccess().getExtendsKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruletypeName_in_ruleclassParentDeclr1127);
            this_typeName_1=ruletypeName();

            state._fsp--;


            		current.merge(this_typeName_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:469:1: (kw= ',' this_typeName_3= ruletypeName )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:470:2: kw= ',' this_typeName_3= ruletypeName
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleclassParentDeclr1146); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getClassParentDeclrAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruletypeName_in_ruleclassParentDeclr1168);
            	    this_typeName_3=ruletypeName();

            	    state._fsp--;


            	    		current.merge(this_typeName_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleclassParentDeclr"


    // $ANTLR start "entryRuleattributeDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:494:1: entryRuleattributeDeclaration returns [String current=null] : iv_ruleattributeDeclaration= ruleattributeDeclaration EOF ;
    public final String entryRuleattributeDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleattributeDeclaration = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:495:2: (iv_ruleattributeDeclaration= ruleattributeDeclaration EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:496:2: iv_ruleattributeDeclaration= ruleattributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_ruleattributeDeclaration_in_entryRuleattributeDeclaration1216);
            iv_ruleattributeDeclaration=ruleattributeDeclaration();

            state._fsp--;

             current =iv_ruleattributeDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleattributeDeclaration1227); 

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
    // $ANTLR end "entryRuleattributeDeclaration"


    // $ANTLR start "ruleattributeDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:503:1: ruleattributeDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'att' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType (this_annotationDeclr_4= ruleannotationDeclr )* ) ;
    public final AntlrDatatypeRuleToken ruleattributeDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_attributeType_3 = null;

        AntlrDatatypeRuleToken this_annotationDeclr_4 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:506:28: ( (kw= 'att' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType (this_annotationDeclr_4= ruleannotationDeclr )* ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:507:1: (kw= 'att' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType (this_annotationDeclr_4= ruleannotationDeclr )* )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:507:1: (kw= 'att' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType (this_annotationDeclr_4= ruleannotationDeclr )* )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:508:2: kw= 'att' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType (this_annotationDeclr_4= ruleannotationDeclr )*
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleattributeDeclaration1265); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeDeclarationAccess().getAttKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleattributeDeclaration1280); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getAttributeDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleattributeDeclaration1298); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeDeclarationAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getAttributeTypeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleattributeType_in_ruleattributeDeclaration1320);
            this_attributeType_3=ruleattributeType();

            state._fsp--;


            		current.merge(this_attributeType_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:537:1: (this_annotationDeclr_4= ruleannotationDeclr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:538:5: this_annotationDeclr_4= ruleannotationDeclr
            	    {
            	     
            	            newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_ruleattributeDeclaration1348);
            	    this_annotationDeclr_4=ruleannotationDeclr();

            	    state._fsp--;


            	    		current.merge(this_annotationDeclr_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleattributeDeclaration"


    // $ANTLR start "entryRuleattributeType"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:556:1: entryRuleattributeType returns [String current=null] : iv_ruleattributeType= ruleattributeType EOF ;
    public final String entryRuleattributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleattributeType = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:557:2: (iv_ruleattributeType= ruleattributeType EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:558:2: iv_ruleattributeType= ruleattributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleattributeType_in_entryRuleattributeType1396);
            iv_ruleattributeType=ruleattributeType();

            state._fsp--;

             current =iv_ruleattributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleattributeType1407); 

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
    // $ANTLR end "entryRuleattributeType"


    // $ANTLR start "ruleattributeType"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:565:1: ruleattributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Double' | kw= 'Long' | kw= 'Continuous' | kw= 'Int' | kw= 'Bool' | this_typeName_6= ruletypeName ) ;
    public final AntlrDatatypeRuleToken ruleattributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_typeName_6 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:568:28: ( (kw= 'String' | kw= 'Double' | kw= 'Long' | kw= 'Continuous' | kw= 'Int' | kw= 'Bool' | this_typeName_6= ruletypeName ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:569:1: (kw= 'String' | kw= 'Double' | kw= 'Long' | kw= 'Continuous' | kw= 'Int' | kw= 'Bool' | this_typeName_6= ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:569:1: (kw= 'String' | kw= 'Double' | kw= 'Long' | kw= 'Continuous' | kw= 'Int' | kw= 'Bool' | this_typeName_6= ruletypeName )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            case 25:
                {
                alt12=6;
                }
                break;
            case RULE_ID:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:570:2: kw= 'String'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleattributeType1445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:577:2: kw= 'Double'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleattributeType1464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDoubleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:584:2: kw= 'Long'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleattributeType1483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getLongKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:591:2: kw= 'Continuous'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleattributeType1502); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getContinuousKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:598:2: kw= 'Int'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleattributeType1521); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:605:2: kw= 'Bool'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleattributeType1540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getBoolKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:612:5: this_typeName_6= ruletypeName
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeNameParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruletypeName_in_ruleattributeType1568);
                    this_typeName_6=ruletypeName();

                    state._fsp--;


                    		current.merge(this_typeName_6);
                        
                     
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
    // $ANTLR end "ruleattributeType"


    // $ANTLR start "entryRulereferenceDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:630:1: entryRulereferenceDeclaration returns [String current=null] : iv_rulereferenceDeclaration= rulereferenceDeclaration EOF ;
    public final String entryRulereferenceDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereferenceDeclaration = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:631:2: (iv_rulereferenceDeclaration= rulereferenceDeclaration EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:632:2: iv_rulereferenceDeclaration= rulereferenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReferenceDeclarationRule()); 
            pushFollow(FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration1614);
            iv_rulereferenceDeclaration=rulereferenceDeclaration();

            state._fsp--;

             current =iv_rulereferenceDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereferenceDeclaration1625); 

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
    // $ANTLR end "entryRulereferenceDeclaration"


    // $ANTLR start "rulereferenceDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:639:1: rulereferenceDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ref' | kw= 'ref*' ) this_ID_2= RULE_ID kw= ':' this_typeName_4= ruletypeName (this_annotationDeclr_5= ruleannotationDeclr )* ) ;
    public final AntlrDatatypeRuleToken rulereferenceDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_typeName_4 = null;

        AntlrDatatypeRuleToken this_annotationDeclr_5 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:642:28: ( ( (kw= 'ref' | kw= 'ref*' ) this_ID_2= RULE_ID kw= ':' this_typeName_4= ruletypeName (this_annotationDeclr_5= ruleannotationDeclr )* ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:643:1: ( (kw= 'ref' | kw= 'ref*' ) this_ID_2= RULE_ID kw= ':' this_typeName_4= ruletypeName (this_annotationDeclr_5= ruleannotationDeclr )* )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:643:1: ( (kw= 'ref' | kw= 'ref*' ) this_ID_2= RULE_ID kw= ':' this_typeName_4= ruletypeName (this_annotationDeclr_5= ruleannotationDeclr )* )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:643:2: (kw= 'ref' | kw= 'ref*' ) this_ID_2= RULE_ID kw= ':' this_typeName_4= ruletypeName (this_annotationDeclr_5= ruleannotationDeclr )*
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:643:2: (kw= 'ref' | kw= 'ref*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:644:2: kw= 'ref'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulereferenceDeclaration1664); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:651:2: kw= 'ref*'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulereferenceDeclaration1683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulereferenceDeclaration1699); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getReferenceDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_rulereferenceDeclaration1717); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReferenceDeclarationAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getTypeNameParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruletypeName_in_rulereferenceDeclaration1739);
            this_typeName_4=ruletypeName();

            state._fsp--;


            		current.merge(this_typeName_4);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:680:1: (this_annotationDeclr_5= ruleannotationDeclr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:681:5: this_annotationDeclr_5= ruleannotationDeclr
            	    {
            	     
            	            newCompositeNode(grammarAccess.getReferenceDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_rulereferenceDeclaration1767);
            	    this_annotationDeclr_5=ruleannotationDeclr();

            	    state._fsp--;


            	    		current.merge(this_annotationDeclr_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "rulereferenceDeclaration"


    // $ANTLR start "entryRuledependencyDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:699:1: entryRuledependencyDeclaration returns [String current=null] : iv_ruledependencyDeclaration= ruledependencyDeclaration EOF ;
    public final String entryRuledependencyDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledependencyDeclaration = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:700:2: (iv_ruledependencyDeclaration= ruledependencyDeclaration EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:701:2: iv_ruledependencyDeclaration= ruledependencyDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDependencyDeclarationRule()); 
            pushFollow(FOLLOW_ruledependencyDeclaration_in_entryRuledependencyDeclaration1815);
            iv_ruledependencyDeclaration=ruledependencyDeclaration();

            state._fsp--;

             current =iv_ruledependencyDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledependencyDeclaration1826); 

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
    // $ANTLR end "entryRuledependencyDeclaration"


    // $ANTLR start "ruledependencyDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:708:1: ruledependencyDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'dependency' this_ID_1= RULE_ID kw= ':' this_typeName_3= ruletypeName ) ;
    public final AntlrDatatypeRuleToken ruledependencyDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_typeName_3 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:711:28: ( (kw= 'dependency' this_ID_1= RULE_ID kw= ':' this_typeName_3= ruletypeName ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:712:1: (kw= 'dependency' this_ID_1= RULE_ID kw= ':' this_typeName_3= ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:712:1: (kw= 'dependency' this_ID_1= RULE_ID kw= ':' this_typeName_3= ruletypeName )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:713:2: kw= 'dependency' this_ID_1= RULE_ID kw= ':' this_typeName_3= ruletypeName
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruledependencyDeclaration1864); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDependencyDeclarationAccess().getDependencyKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledependencyDeclaration1879); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getDependencyDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruledependencyDeclaration1897); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDependencyDeclarationAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getDependencyDeclarationAccess().getTypeNameParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruletypeName_in_ruledependencyDeclaration1919);
            this_typeName_3=ruletypeName();

            state._fsp--;


            		current.merge(this_typeName_3);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruledependencyDeclaration"


    // $ANTLR start "entryRuleinputDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:750:1: entryRuleinputDeclaration returns [String current=null] : iv_ruleinputDeclaration= ruleinputDeclaration EOF ;
    public final String entryRuleinputDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinputDeclaration = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:751:2: (iv_ruleinputDeclaration= ruleinputDeclaration EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:752:2: iv_ruleinputDeclaration= ruleinputDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInputDeclarationRule()); 
            pushFollow(FOLLOW_ruleinputDeclaration_in_entryRuleinputDeclaration1965);
            iv_ruleinputDeclaration=ruleinputDeclaration();

            state._fsp--;

             current =iv_ruleinputDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputDeclaration1976); 

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
    // $ANTLR end "entryRuleinputDeclaration"


    // $ANTLR start "ruleinputDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:759:1: ruleinputDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'input' this_ID_1= RULE_ID this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleinputDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:762:28: ( (kw= 'input' this_ID_1= RULE_ID this_STRING_2= RULE_STRING ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:763:1: (kw= 'input' this_ID_1= RULE_ID this_STRING_2= RULE_STRING )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:763:1: (kw= 'input' this_ID_1= RULE_ID this_STRING_2= RULE_STRING )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:764:2: kw= 'input' this_ID_1= RULE_ID this_STRING_2= RULE_STRING
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleinputDeclaration2014); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInputDeclarationAccess().getInputKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleinputDeclaration2029); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getInputDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleinputDeclaration2049); 

            		current.merge(this_STRING_2);
                
             
                newLeafNode(this_STRING_2, grammarAccess.getInputDeclarationAccess().getSTRINGTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleinputDeclaration"


    // $ANTLR start "entryRuleoutputDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:791:1: entryRuleoutputDeclaration returns [String current=null] : iv_ruleoutputDeclaration= ruleoutputDeclaration EOF ;
    public final String entryRuleoutputDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoutputDeclaration = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:792:2: (iv_ruleoutputDeclaration= ruleoutputDeclaration EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:793:2: iv_ruleoutputDeclaration= ruleoutputDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOutputDeclarationRule()); 
            pushFollow(FOLLOW_ruleoutputDeclaration_in_entryRuleoutputDeclaration2095);
            iv_ruleoutputDeclaration=ruleoutputDeclaration();

            state._fsp--;

             current =iv_ruleoutputDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutputDeclaration2106); 

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
    // $ANTLR end "entryRuleoutputDeclaration"


    // $ANTLR start "ruleoutputDeclaration"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:800:1: ruleoutputDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'output' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType ) ;
    public final AntlrDatatypeRuleToken ruleoutputDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_attributeType_3 = null;


         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:803:28: ( (kw= 'output' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:804:1: (kw= 'output' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:804:1: (kw= 'output' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:805:2: kw= 'output' this_ID_1= RULE_ID kw= ':' this_attributeType_3= ruleattributeType
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleoutputDeclaration2144); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutputDeclarationAccess().getOutputKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleoutputDeclaration2159); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getOutputDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleoutputDeclaration2177); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOutputDeclarationAccess().getColonKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getOutputDeclarationAccess().getAttributeTypeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleattributeType_in_ruleoutputDeclaration2199);
            this_attributeType_3=ruleattributeType();

            state._fsp--;


            		current.merge(this_attributeType_3);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleoutputDeclaration"


    // $ANTLR start "entryRuleannotationDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:842:1: entryRuleannotationDeclr returns [String current=null] : iv_ruleannotationDeclr= ruleannotationDeclr EOF ;
    public final String entryRuleannotationDeclr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleannotationDeclr = null;


        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:843:2: (iv_ruleannotationDeclr= ruleannotationDeclr EOF )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:844:2: iv_ruleannotationDeclr= ruleannotationDeclr EOF
            {
             newCompositeNode(grammarAccess.getAnnotationDeclrRule()); 
            pushFollow(FOLLOW_ruleannotationDeclr_in_entryRuleannotationDeclr2245);
            iv_ruleannotationDeclr=ruleannotationDeclr();

            state._fsp--;

             current =iv_ruleannotationDeclr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationDeclr2256); 

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
    // $ANTLR end "entryRuleannotationDeclr"


    // $ANTLR start "ruleannotationDeclr"
    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:851:1: ruleannotationDeclr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'with' this_ID_1= RULE_ID (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )? ) ;
    public final AntlrDatatypeRuleToken ruleannotationDeclr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:854:28: ( (kw= 'with' this_ID_1= RULE_ID (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )? ) )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:855:1: (kw= 'with' this_ID_1= RULE_ID (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )? )
            {
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:855:1: (kw= 'with' this_ID_1= RULE_ID (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )? )
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:856:2: kw= 'with' this_ID_1= RULE_ID (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )?
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleannotationDeclr2294); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnnotationDeclrAccess().getWithKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleannotationDeclr2309); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getAnnotationDeclrAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:868:1: (this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:868:6: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleannotationDeclr2330); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getAnnotationDeclrAccess().getINTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse/src-gen/org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.g:876:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleannotationDeclr2356); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getAnnotationDeclrAccess().getSTRINGTerminalRuleCall_2_1()); 
                        

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
    // $ANTLR end "ruleannotationDeclr"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_ruleModel131 = new BitSet(new long[]{0x0000000080011002L});
    public static final BitSet FOLLOW_ruledecl_in_ruleModel153 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_ruletypeName_in_entryRuletypeName191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeName202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletypeName242 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruletypeName261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletypeName276 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumDeclr_in_ruledecl374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassDeclr_in_ruledecl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumDeclr_in_entryRuleenumDeclr437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumDeclr448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleenumDeclr486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_ruleenumDeclr508 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleenumDeclr526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleenumDeclr541 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleenumDeclr560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleenumDeclr575 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleenumDeclr595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassDeclr_in_entryRuleclassDeclr635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassDeclr645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleclassDeclr682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_ruleclassDeclr698 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleclassParentDeclr_in_ruleclassDeclr714 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleclassDeclr727 = new BitSet(new long[]{0x00000000FC059000L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_ruleclassDeclr748 = new BitSet(new long[]{0x00000000FC059000L});
    public static final BitSet FOLLOW_ruleclassElemDeclr_in_ruleclassDeclr770 = new BitSet(new long[]{0x000000007C048000L});
    public static final BitSet FOLLOW_15_in_ruleclassDeclr783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassElemDeclr_in_entryRuleclassElemDeclr820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassElemDeclr831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeDeclaration_in_ruleclassElemDeclr878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_ruleclassElemDeclr911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledependencyDeclaration_in_ruleclassElemDeclr944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputDeclaration_in_ruleclassElemDeclr977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputDeclaration_in_ruleclassElemDeclr1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassParentDeclr_in_entryRuleclassParentDeclr1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassParentDeclr1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleclassParentDeclr1105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_ruleclassParentDeclr1127 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleclassParentDeclr1146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_ruleclassParentDeclr1168 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleattributeDeclaration_in_entryRuleattributeDeclaration1216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattributeDeclaration1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleattributeDeclaration1265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleattributeDeclaration1280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleattributeDeclaration1298 = new BitSet(new long[]{0x0000000003F00010L});
    public static final BitSet FOLLOW_ruleattributeType_in_ruleattributeDeclaration1320 = new BitSet(new long[]{0x0000000080011000L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_ruleattributeDeclaration1348 = new BitSet(new long[]{0x0000000080011002L});
    public static final BitSet FOLLOW_ruleattributeType_in_entryRuleattributeType1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattributeType1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleattributeType1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleattributeType1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleattributeType1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleattributeType1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleattributeType1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleattributeType1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_ruleattributeType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereferenceDeclaration1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulereferenceDeclaration1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27_in_rulereferenceDeclaration1683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulereferenceDeclaration1699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulereferenceDeclaration1717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_rulereferenceDeclaration1739 = new BitSet(new long[]{0x0000000080011000L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_rulereferenceDeclaration1767 = new BitSet(new long[]{0x0000000080011002L});
    public static final BitSet FOLLOW_ruledependencyDeclaration_in_entryRuledependencyDeclaration1815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledependencyDeclaration1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruledependencyDeclaration1864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledependencyDeclaration1879 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruledependencyDeclaration1897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruletypeName_in_ruledependencyDeclaration1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputDeclaration_in_entryRuleinputDeclaration1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputDeclaration1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleinputDeclaration2014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleinputDeclaration2029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleinputDeclaration2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputDeclaration_in_entryRuleoutputDeclaration2095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutputDeclaration2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleoutputDeclaration2144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleoutputDeclaration2159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleoutputDeclaration2177 = new BitSet(new long[]{0x0000000003F00010L});
    public static final BitSet FOLLOW_ruleattributeType_in_ruleoutputDeclaration2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_entryRuleannotationDeclr2245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationDeclr2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleannotationDeclr2294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleannotationDeclr2309 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleannotationDeclr2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleannotationDeclr2356 = new BitSet(new long[]{0x0000000000000002L});

}