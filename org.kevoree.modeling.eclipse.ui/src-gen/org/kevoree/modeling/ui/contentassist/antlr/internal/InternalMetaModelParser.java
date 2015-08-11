package org.kevoree.modeling.ui.contentassist.antlr.internal; 

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
import org.kevoree.modeling.services.MetaModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetaModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Double'", "'Long'", "'Continuous'", "'Int'", "'Bool'", "'ref'", "'ref*'", "'.'", "'enum'", "'{'", "'}'", "','", "'class'", "'extends'", "'att'", "':'", "'dependency'", "'input'", "'output'", "'with'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g"; }


     
     	private MetaModelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MetaModelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:61:1: ( ruleModel EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:76:1: ( rule__Model__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuletypeName"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:88:1: entryRuletypeName : ruletypeName EOF ;
    public final void entryRuletypeName() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:89:1: ( ruletypeName EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:90:1: ruletypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruletypeName_in_entryRuletypeName121);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletypeName128); 

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
    // $ANTLR end "entryRuletypeName"


    // $ANTLR start "ruletypeName"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:97:1: ruletypeName : ( ( rule__TypeName__Group__0 ) ) ;
    public final void ruletypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:101:2: ( ( ( rule__TypeName__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:102:1: ( ( rule__TypeName__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:102:1: ( ( rule__TypeName__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:103:1: ( rule__TypeName__Group__0 )
            {
             before(grammarAccess.getTypeNameAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:104:1: ( rule__TypeName__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:104:2: rule__TypeName__Group__0
            {
            pushFollow(FOLLOW_rule__TypeName__Group__0_in_ruletypeName154);
            rule__TypeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletypeName"


    // $ANTLR start "entryRuledecl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:116:1: entryRuledecl : ruledecl EOF ;
    public final void entryRuledecl() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:117:1: ( ruledecl EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:118:1: ruledecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl181);
            ruledecl();

            state._fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl188); 

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
    // $ANTLR end "entryRuledecl"


    // $ANTLR start "ruledecl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:125:1: ruledecl : ( ( rule__Decl__Alternatives ) ) ;
    public final void ruledecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:129:2: ( ( ( rule__Decl__Alternatives ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:130:1: ( ( rule__Decl__Alternatives ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:130:1: ( ( rule__Decl__Alternatives ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:131:1: ( rule__Decl__Alternatives )
            {
             before(grammarAccess.getDeclAccess().getAlternatives()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:132:1: ( rule__Decl__Alternatives )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:132:2: rule__Decl__Alternatives
            {
            pushFollow(FOLLOW_rule__Decl__Alternatives_in_ruledecl214);
            rule__Decl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledecl"


    // $ANTLR start "entryRuleenumDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:144:1: entryRuleenumDeclr : ruleenumDeclr EOF ;
    public final void entryRuleenumDeclr() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:145:1: ( ruleenumDeclr EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:146:1: ruleenumDeclr EOF
            {
             before(grammarAccess.getEnumDeclrRule()); 
            pushFollow(FOLLOW_ruleenumDeclr_in_entryRuleenumDeclr241);
            ruleenumDeclr();

            state._fsp--;

             after(grammarAccess.getEnumDeclrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumDeclr248); 

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
    // $ANTLR end "entryRuleenumDeclr"


    // $ANTLR start "ruleenumDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:153:1: ruleenumDeclr : ( ( rule__EnumDeclr__Group__0 ) ) ;
    public final void ruleenumDeclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:157:2: ( ( ( rule__EnumDeclr__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:158:1: ( ( rule__EnumDeclr__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:158:1: ( ( rule__EnumDeclr__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:159:1: ( rule__EnumDeclr__Group__0 )
            {
             before(grammarAccess.getEnumDeclrAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:160:1: ( rule__EnumDeclr__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:160:2: rule__EnumDeclr__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__0_in_ruleenumDeclr274);
            rule__EnumDeclr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleenumDeclr"


    // $ANTLR start "entryRuleclassDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:172:1: entryRuleclassDeclr : ruleclassDeclr EOF ;
    public final void entryRuleclassDeclr() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:173:1: ( ruleclassDeclr EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:174:1: ruleclassDeclr EOF
            {
             before(grammarAccess.getClassDeclrRule()); 
            pushFollow(FOLLOW_ruleclassDeclr_in_entryRuleclassDeclr301);
            ruleclassDeclr();

            state._fsp--;

             after(grammarAccess.getClassDeclrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassDeclr308); 

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
    // $ANTLR end "entryRuleclassDeclr"


    // $ANTLR start "ruleclassDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:181:1: ruleclassDeclr : ( ( rule__ClassDeclr__Group__0 ) ) ;
    public final void ruleclassDeclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:185:2: ( ( ( rule__ClassDeclr__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:186:1: ( ( rule__ClassDeclr__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:186:1: ( ( rule__ClassDeclr__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:187:1: ( rule__ClassDeclr__Group__0 )
            {
             before(grammarAccess.getClassDeclrAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:188:1: ( rule__ClassDeclr__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:188:2: rule__ClassDeclr__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__0_in_ruleclassDeclr334);
            rule__ClassDeclr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleclassDeclr"


    // $ANTLR start "entryRuleclassElemDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:200:1: entryRuleclassElemDeclr : ruleclassElemDeclr EOF ;
    public final void entryRuleclassElemDeclr() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:201:1: ( ruleclassElemDeclr EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:202:1: ruleclassElemDeclr EOF
            {
             before(grammarAccess.getClassElemDeclrRule()); 
            pushFollow(FOLLOW_ruleclassElemDeclr_in_entryRuleclassElemDeclr361);
            ruleclassElemDeclr();

            state._fsp--;

             after(grammarAccess.getClassElemDeclrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassElemDeclr368); 

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
    // $ANTLR end "entryRuleclassElemDeclr"


    // $ANTLR start "ruleclassElemDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:209:1: ruleclassElemDeclr : ( ( rule__ClassElemDeclr__Alternatives ) ) ;
    public final void ruleclassElemDeclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:213:2: ( ( ( rule__ClassElemDeclr__Alternatives ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:214:1: ( ( rule__ClassElemDeclr__Alternatives ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:214:1: ( ( rule__ClassElemDeclr__Alternatives ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:215:1: ( rule__ClassElemDeclr__Alternatives )
            {
             before(grammarAccess.getClassElemDeclrAccess().getAlternatives()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:216:1: ( rule__ClassElemDeclr__Alternatives )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:216:2: rule__ClassElemDeclr__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassElemDeclr__Alternatives_in_ruleclassElemDeclr394);
            rule__ClassElemDeclr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassElemDeclrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleclassElemDeclr"


    // $ANTLR start "entryRuleclassParentDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:228:1: entryRuleclassParentDeclr : ruleclassParentDeclr EOF ;
    public final void entryRuleclassParentDeclr() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:229:1: ( ruleclassParentDeclr EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:230:1: ruleclassParentDeclr EOF
            {
             before(grammarAccess.getClassParentDeclrRule()); 
            pushFollow(FOLLOW_ruleclassParentDeclr_in_entryRuleclassParentDeclr421);
            ruleclassParentDeclr();

            state._fsp--;

             after(grammarAccess.getClassParentDeclrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassParentDeclr428); 

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
    // $ANTLR end "entryRuleclassParentDeclr"


    // $ANTLR start "ruleclassParentDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:237:1: ruleclassParentDeclr : ( ( rule__ClassParentDeclr__Group__0 ) ) ;
    public final void ruleclassParentDeclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:241:2: ( ( ( rule__ClassParentDeclr__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:242:1: ( ( rule__ClassParentDeclr__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:242:1: ( ( rule__ClassParentDeclr__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:243:1: ( rule__ClassParentDeclr__Group__0 )
            {
             before(grammarAccess.getClassParentDeclrAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:244:1: ( rule__ClassParentDeclr__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:244:2: rule__ClassParentDeclr__Group__0
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__0_in_ruleclassParentDeclr454);
            rule__ClassParentDeclr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassParentDeclrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleclassParentDeclr"


    // $ANTLR start "entryRuleattributeDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:256:1: entryRuleattributeDeclaration : ruleattributeDeclaration EOF ;
    public final void entryRuleattributeDeclaration() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:257:1: ( ruleattributeDeclaration EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:258:1: ruleattributeDeclaration EOF
            {
             before(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_ruleattributeDeclaration_in_entryRuleattributeDeclaration481);
            ruleattributeDeclaration();

            state._fsp--;

             after(grammarAccess.getAttributeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleattributeDeclaration488); 

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
    // $ANTLR end "entryRuleattributeDeclaration"


    // $ANTLR start "ruleattributeDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:265:1: ruleattributeDeclaration : ( ( rule__AttributeDeclaration__Group__0 ) ) ;
    public final void ruleattributeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:269:2: ( ( ( rule__AttributeDeclaration__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:270:1: ( ( rule__AttributeDeclaration__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:270:1: ( ( rule__AttributeDeclaration__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:271:1: ( rule__AttributeDeclaration__Group__0 )
            {
             before(grammarAccess.getAttributeDeclarationAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:272:1: ( rule__AttributeDeclaration__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:272:2: rule__AttributeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__0_in_ruleattributeDeclaration514);
            rule__AttributeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleattributeDeclaration"


    // $ANTLR start "entryRuleattributeType"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:284:1: entryRuleattributeType : ruleattributeType EOF ;
    public final void entryRuleattributeType() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:285:1: ( ruleattributeType EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:286:1: ruleattributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleattributeType_in_entryRuleattributeType541);
            ruleattributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleattributeType548); 

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
    // $ANTLR end "entryRuleattributeType"


    // $ANTLR start "ruleattributeType"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:293:1: ruleattributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleattributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:297:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:298:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:298:1: ( ( rule__AttributeType__Alternatives ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:299:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:300:1: ( rule__AttributeType__Alternatives )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:300:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleattributeType574);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleattributeType"


    // $ANTLR start "entryRulereferenceDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:312:1: entryRulereferenceDeclaration : rulereferenceDeclaration EOF ;
    public final void entryRulereferenceDeclaration() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:313:1: ( rulereferenceDeclaration EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:314:1: rulereferenceDeclaration EOF
            {
             before(grammarAccess.getReferenceDeclarationRule()); 
            pushFollow(FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration601);
            rulereferenceDeclaration();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereferenceDeclaration608); 

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
    // $ANTLR end "entryRulereferenceDeclaration"


    // $ANTLR start "rulereferenceDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:321:1: rulereferenceDeclaration : ( ( rule__ReferenceDeclaration__Group__0 ) ) ;
    public final void rulereferenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:325:2: ( ( ( rule__ReferenceDeclaration__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:326:1: ( ( rule__ReferenceDeclaration__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:326:1: ( ( rule__ReferenceDeclaration__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:327:1: ( rule__ReferenceDeclaration__Group__0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:328:1: ( rule__ReferenceDeclaration__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:328:2: rule__ReferenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__0_in_rulereferenceDeclaration634);
            rule__ReferenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereferenceDeclaration"


    // $ANTLR start "entryRuledependencyDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:340:1: entryRuledependencyDeclaration : ruledependencyDeclaration EOF ;
    public final void entryRuledependencyDeclaration() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:341:1: ( ruledependencyDeclaration EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:342:1: ruledependencyDeclaration EOF
            {
             before(grammarAccess.getDependencyDeclarationRule()); 
            pushFollow(FOLLOW_ruledependencyDeclaration_in_entryRuledependencyDeclaration661);
            ruledependencyDeclaration();

            state._fsp--;

             after(grammarAccess.getDependencyDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledependencyDeclaration668); 

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
    // $ANTLR end "entryRuledependencyDeclaration"


    // $ANTLR start "ruledependencyDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:349:1: ruledependencyDeclaration : ( ( rule__DependencyDeclaration__Group__0 ) ) ;
    public final void ruledependencyDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:353:2: ( ( ( rule__DependencyDeclaration__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:354:1: ( ( rule__DependencyDeclaration__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:354:1: ( ( rule__DependencyDeclaration__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:355:1: ( rule__DependencyDeclaration__Group__0 )
            {
             before(grammarAccess.getDependencyDeclarationAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:356:1: ( rule__DependencyDeclaration__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:356:2: rule__DependencyDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__0_in_ruledependencyDeclaration694);
            rule__DependencyDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledependencyDeclaration"


    // $ANTLR start "entryRuleinputDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:368:1: entryRuleinputDeclaration : ruleinputDeclaration EOF ;
    public final void entryRuleinputDeclaration() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:369:1: ( ruleinputDeclaration EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:370:1: ruleinputDeclaration EOF
            {
             before(grammarAccess.getInputDeclarationRule()); 
            pushFollow(FOLLOW_ruleinputDeclaration_in_entryRuleinputDeclaration721);
            ruleinputDeclaration();

            state._fsp--;

             after(grammarAccess.getInputDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinputDeclaration728); 

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
    // $ANTLR end "entryRuleinputDeclaration"


    // $ANTLR start "ruleinputDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:377:1: ruleinputDeclaration : ( ( rule__InputDeclaration__Group__0 ) ) ;
    public final void ruleinputDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:381:2: ( ( ( rule__InputDeclaration__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:382:1: ( ( rule__InputDeclaration__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:382:1: ( ( rule__InputDeclaration__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:383:1: ( rule__InputDeclaration__Group__0 )
            {
             before(grammarAccess.getInputDeclarationAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:384:1: ( rule__InputDeclaration__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:384:2: rule__InputDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__InputDeclaration__Group__0_in_ruleinputDeclaration754);
            rule__InputDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleinputDeclaration"


    // $ANTLR start "entryRuleoutputDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:396:1: entryRuleoutputDeclaration : ruleoutputDeclaration EOF ;
    public final void entryRuleoutputDeclaration() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:397:1: ( ruleoutputDeclaration EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:398:1: ruleoutputDeclaration EOF
            {
             before(grammarAccess.getOutputDeclarationRule()); 
            pushFollow(FOLLOW_ruleoutputDeclaration_in_entryRuleoutputDeclaration781);
            ruleoutputDeclaration();

            state._fsp--;

             after(grammarAccess.getOutputDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoutputDeclaration788); 

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
    // $ANTLR end "entryRuleoutputDeclaration"


    // $ANTLR start "ruleoutputDeclaration"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:405:1: ruleoutputDeclaration : ( ( rule__OutputDeclaration__Group__0 ) ) ;
    public final void ruleoutputDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:409:2: ( ( ( rule__OutputDeclaration__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:410:1: ( ( rule__OutputDeclaration__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:410:1: ( ( rule__OutputDeclaration__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:411:1: ( rule__OutputDeclaration__Group__0 )
            {
             before(grammarAccess.getOutputDeclarationAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:412:1: ( rule__OutputDeclaration__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:412:2: rule__OutputDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__OutputDeclaration__Group__0_in_ruleoutputDeclaration814);
            rule__OutputDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoutputDeclaration"


    // $ANTLR start "entryRuleannotationDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:424:1: entryRuleannotationDeclr : ruleannotationDeclr EOF ;
    public final void entryRuleannotationDeclr() throws RecognitionException {
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:425:1: ( ruleannotationDeclr EOF )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:426:1: ruleannotationDeclr EOF
            {
             before(grammarAccess.getAnnotationDeclrRule()); 
            pushFollow(FOLLOW_ruleannotationDeclr_in_entryRuleannotationDeclr841);
            ruleannotationDeclr();

            state._fsp--;

             after(grammarAccess.getAnnotationDeclrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleannotationDeclr848); 

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
    // $ANTLR end "entryRuleannotationDeclr"


    // $ANTLR start "ruleannotationDeclr"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:433:1: ruleannotationDeclr : ( ( rule__AnnotationDeclr__Group__0 ) ) ;
    public final void ruleannotationDeclr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:437:2: ( ( ( rule__AnnotationDeclr__Group__0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:438:1: ( ( rule__AnnotationDeclr__Group__0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:438:1: ( ( rule__AnnotationDeclr__Group__0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:439:1: ( rule__AnnotationDeclr__Group__0 )
            {
             before(grammarAccess.getAnnotationDeclrAccess().getGroup()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:440:1: ( rule__AnnotationDeclr__Group__0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:440:2: rule__AnnotationDeclr__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__0_in_ruleannotationDeclr874);
            rule__AnnotationDeclr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationDeclrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleannotationDeclr"


    // $ANTLR start "rule__Decl__Alternatives"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:452:1: rule__Decl__Alternatives : ( ( ruleenumDeclr ) | ( ruleclassDeclr ) );
    public final void rule__Decl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:456:1: ( ( ruleenumDeclr ) | ( ruleclassDeclr ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:457:1: ( ruleenumDeclr )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:457:1: ( ruleenumDeclr )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:458:1: ruleenumDeclr
                    {
                     before(grammarAccess.getDeclAccess().getEnumDeclrParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleenumDeclr_in_rule__Decl__Alternatives910);
                    ruleenumDeclr();

                    state._fsp--;

                     after(grammarAccess.getDeclAccess().getEnumDeclrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:463:6: ( ruleclassDeclr )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:463:6: ( ruleclassDeclr )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:464:1: ruleclassDeclr
                    {
                     before(grammarAccess.getDeclAccess().getClassDeclrParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleclassDeclr_in_rule__Decl__Alternatives927);
                    ruleclassDeclr();

                    state._fsp--;

                     after(grammarAccess.getDeclAccess().getClassDeclrParserRuleCall_1()); 

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
    // $ANTLR end "rule__Decl__Alternatives"


    // $ANTLR start "rule__ClassElemDeclr__Alternatives"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:474:1: rule__ClassElemDeclr__Alternatives : ( ( ruleattributeDeclaration ) | ( rulereferenceDeclaration ) | ( ruledependencyDeclaration ) | ( ruleinputDeclaration ) | ( ruleoutputDeclaration ) );
    public final void rule__ClassElemDeclr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:478:1: ( ( ruleattributeDeclaration ) | ( rulereferenceDeclaration ) | ( ruledependencyDeclaration ) | ( ruleinputDeclaration ) | ( ruleoutputDeclaration ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:479:1: ( ruleattributeDeclaration )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:479:1: ( ruleattributeDeclaration )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:480:1: ruleattributeDeclaration
                    {
                     before(grammarAccess.getClassElemDeclrAccess().getAttributeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleattributeDeclaration_in_rule__ClassElemDeclr__Alternatives959);
                    ruleattributeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getClassElemDeclrAccess().getAttributeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:485:6: ( rulereferenceDeclaration )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:485:6: ( rulereferenceDeclaration )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:486:1: rulereferenceDeclaration
                    {
                     before(grammarAccess.getClassElemDeclrAccess().getReferenceDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulereferenceDeclaration_in_rule__ClassElemDeclr__Alternatives976);
                    rulereferenceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getClassElemDeclrAccess().getReferenceDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:491:6: ( ruledependencyDeclaration )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:491:6: ( ruledependencyDeclaration )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:492:1: ruledependencyDeclaration
                    {
                     before(grammarAccess.getClassElemDeclrAccess().getDependencyDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruledependencyDeclaration_in_rule__ClassElemDeclr__Alternatives993);
                    ruledependencyDeclaration();

                    state._fsp--;

                     after(grammarAccess.getClassElemDeclrAccess().getDependencyDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:497:6: ( ruleinputDeclaration )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:497:6: ( ruleinputDeclaration )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:498:1: ruleinputDeclaration
                    {
                     before(grammarAccess.getClassElemDeclrAccess().getInputDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleinputDeclaration_in_rule__ClassElemDeclr__Alternatives1010);
                    ruleinputDeclaration();

                    state._fsp--;

                     after(grammarAccess.getClassElemDeclrAccess().getInputDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:503:6: ( ruleoutputDeclaration )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:503:6: ( ruleoutputDeclaration )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:504:1: ruleoutputDeclaration
                    {
                     before(grammarAccess.getClassElemDeclrAccess().getOutputDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleoutputDeclaration_in_rule__ClassElemDeclr__Alternatives1027);
                    ruleoutputDeclaration();

                    state._fsp--;

                     after(grammarAccess.getClassElemDeclrAccess().getOutputDeclarationParserRuleCall_4()); 

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
    // $ANTLR end "rule__ClassElemDeclr__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:514:1: rule__AttributeType__Alternatives : ( ( 'String' ) | ( 'Double' ) | ( 'Long' ) | ( 'Continuous' ) | ( 'Int' ) | ( 'Bool' ) | ( ruletypeName ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:518:1: ( ( 'String' ) | ( 'Double' ) | ( 'Long' ) | ( 'Continuous' ) | ( 'Int' ) | ( 'Bool' ) | ( ruletypeName ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case RULE_ID:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:519:1: ( 'String' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:519:1: ( 'String' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:520:1: 'String'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__AttributeType__Alternatives1060); 
                     after(grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:527:6: ( 'Double' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:527:6: ( 'Double' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:528:1: 'Double'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__AttributeType__Alternatives1080); 
                     after(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:535:6: ( 'Long' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:535:6: ( 'Long' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:536:1: 'Long'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getLongKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__AttributeType__Alternatives1100); 
                     after(grammarAccess.getAttributeTypeAccess().getLongKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:543:6: ( 'Continuous' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:543:6: ( 'Continuous' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:544:1: 'Continuous'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getContinuousKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__AttributeType__Alternatives1120); 
                     after(grammarAccess.getAttributeTypeAccess().getContinuousKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:551:6: ( 'Int' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:551:6: ( 'Int' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:552:1: 'Int'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__AttributeType__Alternatives1140); 
                     after(grammarAccess.getAttributeTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:559:6: ( 'Bool' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:559:6: ( 'Bool' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:560:1: 'Bool'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBoolKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__AttributeType__Alternatives1160); 
                     after(grammarAccess.getAttributeTypeAccess().getBoolKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:567:6: ( ruletypeName )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:567:6: ( ruletypeName )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:568:1: ruletypeName
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTypeNameParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruletypeName_in_rule__AttributeType__Alternatives1179);
                    ruletypeName();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getTypeNameParserRuleCall_6()); 

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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__ReferenceDeclaration__Alternatives_0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:578:1: rule__ReferenceDeclaration__Alternatives_0 : ( ( 'ref' ) | ( 'ref*' ) );
    public final void rule__ReferenceDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:582:1: ( ( 'ref' ) | ( 'ref*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:583:1: ( 'ref' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:583:1: ( 'ref' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:584:1: 'ref'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__ReferenceDeclaration__Alternatives_01212); 
                     after(grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:591:6: ( 'ref*' )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:591:6: ( 'ref*' )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:592:1: 'ref*'
                    {
                     before(grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__ReferenceDeclaration__Alternatives_01232); 
                     after(grammarAccess.getReferenceDeclarationAccess().getRefKeyword_0_1()); 

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
    // $ANTLR end "rule__ReferenceDeclaration__Alternatives_0"


    // $ANTLR start "rule__AnnotationDeclr__Alternatives_2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:604:1: rule__AnnotationDeclr__Alternatives_2 : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__AnnotationDeclr__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:608:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:609:1: ( RULE_INT )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:609:1: ( RULE_INT )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:610:1: RULE_INT
                    {
                     before(grammarAccess.getAnnotationDeclrAccess().getINTTerminalRuleCall_2_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AnnotationDeclr__Alternatives_21266); 
                     after(grammarAccess.getAnnotationDeclrAccess().getINTTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:615:6: ( RULE_STRING )
                    {
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:615:6: ( RULE_STRING )
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:616:1: RULE_STRING
                    {
                     before(grammarAccess.getAnnotationDeclrAccess().getSTRINGTerminalRuleCall_2_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AnnotationDeclr__Alternatives_21283); 
                     after(grammarAccess.getAnnotationDeclrAccess().getSTRINGTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__AnnotationDeclr__Alternatives_2"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:628:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:632:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:633:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01313);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01316);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:640:1: rule__Model__Group__0__Impl : ( ( rule__Model__AnnotationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:644:1: ( ( ( rule__Model__AnnotationsAssignment_0 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:645:1: ( ( rule__Model__AnnotationsAssignment_0 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:645:1: ( ( rule__Model__AnnotationsAssignment_0 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:646:1: ( rule__Model__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getAnnotationsAssignment_0()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:647:1: ( rule__Model__AnnotationsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:647:2: rule__Model__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__AnnotationsAssignment_0_in_rule__Model__Group__0__Impl1343);
            	    rule__Model__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:657:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:661:1: ( rule__Model__Group__1__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:662:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11374);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:668:1: rule__Model__Group__1__Impl : ( ( rule__Model__DeclarationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:672:1: ( ( ( rule__Model__DeclarationsAssignment_1 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:673:1: ( ( rule__Model__DeclarationsAssignment_1 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:673:1: ( ( rule__Model__DeclarationsAssignment_1 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:674:1: ( rule__Model__DeclarationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_1()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:675:1: ( rule__Model__DeclarationsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:675:2: rule__Model__DeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_1_in_rule__Model__Group__1__Impl1401);
            	    rule__Model__DeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__TypeName__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:689:1: rule__TypeName__Group__0 : rule__TypeName__Group__0__Impl rule__TypeName__Group__1 ;
    public final void rule__TypeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:693:1: ( rule__TypeName__Group__0__Impl rule__TypeName__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:694:2: rule__TypeName__Group__0__Impl rule__TypeName__Group__1
            {
            pushFollow(FOLLOW_rule__TypeName__Group__0__Impl_in_rule__TypeName__Group__01436);
            rule__TypeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeName__Group__1_in_rule__TypeName__Group__01439);
            rule__TypeName__Group__1();

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
    // $ANTLR end "rule__TypeName__Group__0"


    // $ANTLR start "rule__TypeName__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:701:1: rule__TypeName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__TypeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:705:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:706:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:706:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:707:1: RULE_ID
            {
             before(grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeName__Group__0__Impl1466); 
             after(grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__0__Impl"


    // $ANTLR start "rule__TypeName__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:718:1: rule__TypeName__Group__1 : rule__TypeName__Group__1__Impl ;
    public final void rule__TypeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:722:1: ( rule__TypeName__Group__1__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:723:2: rule__TypeName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeName__Group__1__Impl_in_rule__TypeName__Group__11495);
            rule__TypeName__Group__1__Impl();

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
    // $ANTLR end "rule__TypeName__Group__1"


    // $ANTLR start "rule__TypeName__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:729:1: rule__TypeName__Group__1__Impl : ( ( rule__TypeName__Group_1__0 )* ) ;
    public final void rule__TypeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:733:1: ( ( ( rule__TypeName__Group_1__0 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:734:1: ( ( rule__TypeName__Group_1__0 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:734:1: ( ( rule__TypeName__Group_1__0 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:735:1: ( rule__TypeName__Group_1__0 )*
            {
             before(grammarAccess.getTypeNameAccess().getGroup_1()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:736:1: ( rule__TypeName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:736:2: rule__TypeName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TypeName__Group_1__0_in_rule__TypeName__Group__1__Impl1522);
            	    rule__TypeName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTypeNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group__1__Impl"


    // $ANTLR start "rule__TypeName__Group_1__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:750:1: rule__TypeName__Group_1__0 : rule__TypeName__Group_1__0__Impl rule__TypeName__Group_1__1 ;
    public final void rule__TypeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:754:1: ( rule__TypeName__Group_1__0__Impl rule__TypeName__Group_1__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:755:2: rule__TypeName__Group_1__0__Impl rule__TypeName__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeName__Group_1__0__Impl_in_rule__TypeName__Group_1__01557);
            rule__TypeName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeName__Group_1__1_in_rule__TypeName__Group_1__01560);
            rule__TypeName__Group_1__1();

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
    // $ANTLR end "rule__TypeName__Group_1__0"


    // $ANTLR start "rule__TypeName__Group_1__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:762:1: rule__TypeName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__TypeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:766:1: ( ( '.' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:767:1: ( '.' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:767:1: ( '.' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:768:1: '.'
            {
             before(grammarAccess.getTypeNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__TypeName__Group_1__0__Impl1588); 
             after(grammarAccess.getTypeNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_1__0__Impl"


    // $ANTLR start "rule__TypeName__Group_1__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:781:1: rule__TypeName__Group_1__1 : rule__TypeName__Group_1__1__Impl ;
    public final void rule__TypeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:785:1: ( rule__TypeName__Group_1__1__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:786:2: rule__TypeName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeName__Group_1__1__Impl_in_rule__TypeName__Group_1__11619);
            rule__TypeName__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeName__Group_1__1"


    // $ANTLR start "rule__TypeName__Group_1__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:792:1: rule__TypeName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__TypeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:796:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:797:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:797:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:798:1: RULE_ID
            {
             before(grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeName__Group_1__1__Impl1646); 
             after(grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Group_1__1__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:813:1: rule__EnumDeclr__Group__0 : rule__EnumDeclr__Group__0__Impl rule__EnumDeclr__Group__1 ;
    public final void rule__EnumDeclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:817:1: ( rule__EnumDeclr__Group__0__Impl rule__EnumDeclr__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:818:2: rule__EnumDeclr__Group__0__Impl rule__EnumDeclr__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__0__Impl_in_rule__EnumDeclr__Group__01679);
            rule__EnumDeclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group__1_in_rule__EnumDeclr__Group__01682);
            rule__EnumDeclr__Group__1();

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
    // $ANTLR end "rule__EnumDeclr__Group__0"


    // $ANTLR start "rule__EnumDeclr__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:825:1: rule__EnumDeclr__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumDeclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:829:1: ( ( 'enum' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:830:1: ( 'enum' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:830:1: ( 'enum' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:831:1: 'enum'
            {
             before(grammarAccess.getEnumDeclrAccess().getEnumKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumDeclr__Group__0__Impl1710); 
             after(grammarAccess.getEnumDeclrAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:844:1: rule__EnumDeclr__Group__1 : rule__EnumDeclr__Group__1__Impl rule__EnumDeclr__Group__2 ;
    public final void rule__EnumDeclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:848:1: ( rule__EnumDeclr__Group__1__Impl rule__EnumDeclr__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:849:2: rule__EnumDeclr__Group__1__Impl rule__EnumDeclr__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__1__Impl_in_rule__EnumDeclr__Group__11741);
            rule__EnumDeclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group__2_in_rule__EnumDeclr__Group__11744);
            rule__EnumDeclr__Group__2();

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
    // $ANTLR end "rule__EnumDeclr__Group__1"


    // $ANTLR start "rule__EnumDeclr__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:856:1: rule__EnumDeclr__Group__1__Impl : ( ruletypeName ) ;
    public final void rule__EnumDeclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:860:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:861:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:861:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:862:1: ruletypeName
            {
             before(grammarAccess.getEnumDeclrAccess().getTypeNameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__EnumDeclr__Group__1__Impl1771);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getEnumDeclrAccess().getTypeNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:873:1: rule__EnumDeclr__Group__2 : rule__EnumDeclr__Group__2__Impl rule__EnumDeclr__Group__3 ;
    public final void rule__EnumDeclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:877:1: ( rule__EnumDeclr__Group__2__Impl rule__EnumDeclr__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:878:2: rule__EnumDeclr__Group__2__Impl rule__EnumDeclr__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__2__Impl_in_rule__EnumDeclr__Group__21800);
            rule__EnumDeclr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group__3_in_rule__EnumDeclr__Group__21803);
            rule__EnumDeclr__Group__3();

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
    // $ANTLR end "rule__EnumDeclr__Group__2"


    // $ANTLR start "rule__EnumDeclr__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:885:1: rule__EnumDeclr__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:889:1: ( ( '{' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:890:1: ( '{' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:890:1: ( '{' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:891:1: '{'
            {
             before(grammarAccess.getEnumDeclrAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__EnumDeclr__Group__2__Impl1831); 
             after(grammarAccess.getEnumDeclrAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:904:1: rule__EnumDeclr__Group__3 : rule__EnumDeclr__Group__3__Impl rule__EnumDeclr__Group__4 ;
    public final void rule__EnumDeclr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:908:1: ( rule__EnumDeclr__Group__3__Impl rule__EnumDeclr__Group__4 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:909:2: rule__EnumDeclr__Group__3__Impl rule__EnumDeclr__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__3__Impl_in_rule__EnumDeclr__Group__31862);
            rule__EnumDeclr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group__4_in_rule__EnumDeclr__Group__31865);
            rule__EnumDeclr__Group__4();

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
    // $ANTLR end "rule__EnumDeclr__Group__3"


    // $ANTLR start "rule__EnumDeclr__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:916:1: rule__EnumDeclr__Group__3__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:920:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:921:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:921:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:922:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclr__Group__3__Impl1892); 
             after(grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__4"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:933:1: rule__EnumDeclr__Group__4 : rule__EnumDeclr__Group__4__Impl rule__EnumDeclr__Group__5 ;
    public final void rule__EnumDeclr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:937:1: ( rule__EnumDeclr__Group__4__Impl rule__EnumDeclr__Group__5 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:938:2: rule__EnumDeclr__Group__4__Impl rule__EnumDeclr__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__4__Impl_in_rule__EnumDeclr__Group__41921);
            rule__EnumDeclr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group__5_in_rule__EnumDeclr__Group__41924);
            rule__EnumDeclr__Group__5();

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
    // $ANTLR end "rule__EnumDeclr__Group__4"


    // $ANTLR start "rule__EnumDeclr__Group__4__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:945:1: rule__EnumDeclr__Group__4__Impl : ( ( rule__EnumDeclr__Group_4__0 )* ) ;
    public final void rule__EnumDeclr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:949:1: ( ( ( rule__EnumDeclr__Group_4__0 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:950:1: ( ( rule__EnumDeclr__Group_4__0 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:950:1: ( ( rule__EnumDeclr__Group_4__0 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:951:1: ( rule__EnumDeclr__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclrAccess().getGroup_4()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:952:1: ( rule__EnumDeclr__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:952:2: rule__EnumDeclr__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclr__Group_4__0_in_rule__EnumDeclr__Group__4__Impl1951);
            	    rule__EnumDeclr__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumDeclrAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclr__Group__5"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:962:1: rule__EnumDeclr__Group__5 : rule__EnumDeclr__Group__5__Impl ;
    public final void rule__EnumDeclr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:966:1: ( rule__EnumDeclr__Group__5__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:967:2: rule__EnumDeclr__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group__5__Impl_in_rule__EnumDeclr__Group__51982);
            rule__EnumDeclr__Group__5__Impl();

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
    // $ANTLR end "rule__EnumDeclr__Group__5"


    // $ANTLR start "rule__EnumDeclr__Group__5__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:973:1: rule__EnumDeclr__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:977:1: ( ( '}' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:978:1: ( '}' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:978:1: ( '}' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:979:1: '}'
            {
             before(grammarAccess.getEnumDeclrAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__EnumDeclr__Group__5__Impl2010); 
             after(grammarAccess.getEnumDeclrAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclr__Group_4__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1004:1: rule__EnumDeclr__Group_4__0 : rule__EnumDeclr__Group_4__0__Impl rule__EnumDeclr__Group_4__1 ;
    public final void rule__EnumDeclr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1008:1: ( rule__EnumDeclr__Group_4__0__Impl rule__EnumDeclr__Group_4__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1009:2: rule__EnumDeclr__Group_4__0__Impl rule__EnumDeclr__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group_4__0__Impl_in_rule__EnumDeclr__Group_4__02053);
            rule__EnumDeclr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclr__Group_4__1_in_rule__EnumDeclr__Group_4__02056);
            rule__EnumDeclr__Group_4__1();

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
    // $ANTLR end "rule__EnumDeclr__Group_4__0"


    // $ANTLR start "rule__EnumDeclr__Group_4__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1016:1: rule__EnumDeclr__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1020:1: ( ( ',' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1021:1: ( ',' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1021:1: ( ',' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1022:1: ','
            {
             before(grammarAccess.getEnumDeclrAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumDeclr__Group_4__0__Impl2084); 
             after(grammarAccess.getEnumDeclrAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclr__Group_4__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1035:1: rule__EnumDeclr__Group_4__1 : rule__EnumDeclr__Group_4__1__Impl ;
    public final void rule__EnumDeclr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1039:1: ( rule__EnumDeclr__Group_4__1__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1040:2: rule__EnumDeclr__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclr__Group_4__1__Impl_in_rule__EnumDeclr__Group_4__12115);
            rule__EnumDeclr__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumDeclr__Group_4__1"


    // $ANTLR start "rule__EnumDeclr__Group_4__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1046:1: rule__EnumDeclr__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1050:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1051:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1051:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1052:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclr__Group_4__1__Impl2142); 
             after(grammarAccess.getEnumDeclrAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumDeclr__Group_4__1__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1067:1: rule__ClassDeclr__Group__0 : rule__ClassDeclr__Group__0__Impl rule__ClassDeclr__Group__1 ;
    public final void rule__ClassDeclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1071:1: ( rule__ClassDeclr__Group__0__Impl rule__ClassDeclr__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1072:2: rule__ClassDeclr__Group__0__Impl rule__ClassDeclr__Group__1
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__0__Impl_in_rule__ClassDeclr__Group__02175);
            rule__ClassDeclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__1_in_rule__ClassDeclr__Group__02178);
            rule__ClassDeclr__Group__1();

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
    // $ANTLR end "rule__ClassDeclr__Group__0"


    // $ANTLR start "rule__ClassDeclr__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1079:1: rule__ClassDeclr__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDeclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1083:1: ( ( 'class' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1084:1: ( 'class' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1084:1: ( 'class' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1085:1: 'class'
            {
             before(grammarAccess.getClassDeclrAccess().getClassKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ClassDeclr__Group__0__Impl2206); 
             after(grammarAccess.getClassDeclrAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1098:1: rule__ClassDeclr__Group__1 : rule__ClassDeclr__Group__1__Impl rule__ClassDeclr__Group__2 ;
    public final void rule__ClassDeclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1102:1: ( rule__ClassDeclr__Group__1__Impl rule__ClassDeclr__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1103:2: rule__ClassDeclr__Group__1__Impl rule__ClassDeclr__Group__2
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__1__Impl_in_rule__ClassDeclr__Group__12237);
            rule__ClassDeclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__2_in_rule__ClassDeclr__Group__12240);
            rule__ClassDeclr__Group__2();

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
    // $ANTLR end "rule__ClassDeclr__Group__1"


    // $ANTLR start "rule__ClassDeclr__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1110:1: rule__ClassDeclr__Group__1__Impl : ( ruletypeName ) ;
    public final void rule__ClassDeclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1114:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1115:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1115:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1116:1: ruletypeName
            {
             before(grammarAccess.getClassDeclrAccess().getTypeNameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__ClassDeclr__Group__1__Impl2267);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getClassDeclrAccess().getTypeNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1127:1: rule__ClassDeclr__Group__2 : rule__ClassDeclr__Group__2__Impl rule__ClassDeclr__Group__3 ;
    public final void rule__ClassDeclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1131:1: ( rule__ClassDeclr__Group__2__Impl rule__ClassDeclr__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1132:2: rule__ClassDeclr__Group__2__Impl rule__ClassDeclr__Group__3
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__2__Impl_in_rule__ClassDeclr__Group__22296);
            rule__ClassDeclr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__3_in_rule__ClassDeclr__Group__22299);
            rule__ClassDeclr__Group__3();

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
    // $ANTLR end "rule__ClassDeclr__Group__2"


    // $ANTLR start "rule__ClassDeclr__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1139:1: rule__ClassDeclr__Group__2__Impl : ( ( ruleclassParentDeclr )? ) ;
    public final void rule__ClassDeclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1143:1: ( ( ( ruleclassParentDeclr )? ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1144:1: ( ( ruleclassParentDeclr )? )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1144:1: ( ( ruleclassParentDeclr )? )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1145:1: ( ruleclassParentDeclr )?
            {
             before(grammarAccess.getClassDeclrAccess().getClassParentDeclrParserRuleCall_2()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1146:1: ( ruleclassParentDeclr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1146:3: ruleclassParentDeclr
                    {
                    pushFollow(FOLLOW_ruleclassParentDeclr_in_rule__ClassDeclr__Group__2__Impl2327);
                    ruleclassParentDeclr();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclrAccess().getClassParentDeclrParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1156:1: rule__ClassDeclr__Group__3 : rule__ClassDeclr__Group__3__Impl rule__ClassDeclr__Group__4 ;
    public final void rule__ClassDeclr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1160:1: ( rule__ClassDeclr__Group__3__Impl rule__ClassDeclr__Group__4 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1161:2: rule__ClassDeclr__Group__3__Impl rule__ClassDeclr__Group__4
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__3__Impl_in_rule__ClassDeclr__Group__32358);
            rule__ClassDeclr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__4_in_rule__ClassDeclr__Group__32361);
            rule__ClassDeclr__Group__4();

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
    // $ANTLR end "rule__ClassDeclr__Group__3"


    // $ANTLR start "rule__ClassDeclr__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1168:1: rule__ClassDeclr__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassDeclr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1172:1: ( ( '{' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1173:1: ( '{' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1173:1: ( '{' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1174:1: '{'
            {
             before(grammarAccess.getClassDeclrAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ClassDeclr__Group__3__Impl2389); 
             after(grammarAccess.getClassDeclrAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__4"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1187:1: rule__ClassDeclr__Group__4 : rule__ClassDeclr__Group__4__Impl rule__ClassDeclr__Group__5 ;
    public final void rule__ClassDeclr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1191:1: ( rule__ClassDeclr__Group__4__Impl rule__ClassDeclr__Group__5 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1192:2: rule__ClassDeclr__Group__4__Impl rule__ClassDeclr__Group__5
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__4__Impl_in_rule__ClassDeclr__Group__42420);
            rule__ClassDeclr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__5_in_rule__ClassDeclr__Group__42423);
            rule__ClassDeclr__Group__5();

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
    // $ANTLR end "rule__ClassDeclr__Group__4"


    // $ANTLR start "rule__ClassDeclr__Group__4__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1199:1: rule__ClassDeclr__Group__4__Impl : ( ( rule__ClassDeclr__AnnotationsAssignment_4 )* ) ;
    public final void rule__ClassDeclr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1203:1: ( ( ( rule__ClassDeclr__AnnotationsAssignment_4 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1204:1: ( ( rule__ClassDeclr__AnnotationsAssignment_4 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1204:1: ( ( rule__ClassDeclr__AnnotationsAssignment_4 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1205:1: ( rule__ClassDeclr__AnnotationsAssignment_4 )*
            {
             before(grammarAccess.getClassDeclrAccess().getAnnotationsAssignment_4()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1206:1: ( rule__ClassDeclr__AnnotationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1206:2: rule__ClassDeclr__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ClassDeclr__AnnotationsAssignment_4_in_rule__ClassDeclr__Group__4__Impl2450);
            	    rule__ClassDeclr__AnnotationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassDeclrAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__4__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__5"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1216:1: rule__ClassDeclr__Group__5 : rule__ClassDeclr__Group__5__Impl rule__ClassDeclr__Group__6 ;
    public final void rule__ClassDeclr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1220:1: ( rule__ClassDeclr__Group__5__Impl rule__ClassDeclr__Group__6 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1221:2: rule__ClassDeclr__Group__5__Impl rule__ClassDeclr__Group__6
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__5__Impl_in_rule__ClassDeclr__Group__52481);
            rule__ClassDeclr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassDeclr__Group__6_in_rule__ClassDeclr__Group__52484);
            rule__ClassDeclr__Group__6();

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
    // $ANTLR end "rule__ClassDeclr__Group__5"


    // $ANTLR start "rule__ClassDeclr__Group__5__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1228:1: rule__ClassDeclr__Group__5__Impl : ( ( rule__ClassDeclr__DeclarationsAssignment_5 )* ) ;
    public final void rule__ClassDeclr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1232:1: ( ( ( rule__ClassDeclr__DeclarationsAssignment_5 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1233:1: ( ( rule__ClassDeclr__DeclarationsAssignment_5 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1233:1: ( ( rule__ClassDeclr__DeclarationsAssignment_5 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1234:1: ( rule__ClassDeclr__DeclarationsAssignment_5 )*
            {
             before(grammarAccess.getClassDeclrAccess().getDeclarationsAssignment_5()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1235:1: ( rule__ClassDeclr__DeclarationsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=17 && LA12_0<=18)||LA12_0==26||(LA12_0>=28 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1235:2: rule__ClassDeclr__DeclarationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ClassDeclr__DeclarationsAssignment_5_in_rule__ClassDeclr__Group__5__Impl2511);
            	    rule__ClassDeclr__DeclarationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassDeclrAccess().getDeclarationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclr__Group__6"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1245:1: rule__ClassDeclr__Group__6 : rule__ClassDeclr__Group__6__Impl ;
    public final void rule__ClassDeclr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1249:1: ( rule__ClassDeclr__Group__6__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1250:2: rule__ClassDeclr__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ClassDeclr__Group__6__Impl_in_rule__ClassDeclr__Group__62542);
            rule__ClassDeclr__Group__6__Impl();

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
    // $ANTLR end "rule__ClassDeclr__Group__6"


    // $ANTLR start "rule__ClassDeclr__Group__6__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1256:1: rule__ClassDeclr__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDeclr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1260:1: ( ( '}' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1261:1: ( '}' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1261:1: ( '}' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1262:1: '}'
            {
             before(grammarAccess.getClassDeclrAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__ClassDeclr__Group__6__Impl2570); 
             after(grammarAccess.getClassDeclrAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__Group__6__Impl"


    // $ANTLR start "rule__ClassParentDeclr__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1289:1: rule__ClassParentDeclr__Group__0 : rule__ClassParentDeclr__Group__0__Impl rule__ClassParentDeclr__Group__1 ;
    public final void rule__ClassParentDeclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1293:1: ( rule__ClassParentDeclr__Group__0__Impl rule__ClassParentDeclr__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1294:2: rule__ClassParentDeclr__Group__0__Impl rule__ClassParentDeclr__Group__1
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__0__Impl_in_rule__ClassParentDeclr__Group__02615);
            rule__ClassParentDeclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__1_in_rule__ClassParentDeclr__Group__02618);
            rule__ClassParentDeclr__Group__1();

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
    // $ANTLR end "rule__ClassParentDeclr__Group__0"


    // $ANTLR start "rule__ClassParentDeclr__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1301:1: rule__ClassParentDeclr__Group__0__Impl : ( 'extends' ) ;
    public final void rule__ClassParentDeclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1305:1: ( ( 'extends' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1306:1: ( 'extends' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1306:1: ( 'extends' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1307:1: 'extends'
            {
             before(grammarAccess.getClassParentDeclrAccess().getExtendsKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassParentDeclr__Group__0__Impl2646); 
             after(grammarAccess.getClassParentDeclrAccess().getExtendsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassParentDeclr__Group__0__Impl"


    // $ANTLR start "rule__ClassParentDeclr__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1320:1: rule__ClassParentDeclr__Group__1 : rule__ClassParentDeclr__Group__1__Impl rule__ClassParentDeclr__Group__2 ;
    public final void rule__ClassParentDeclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1324:1: ( rule__ClassParentDeclr__Group__1__Impl rule__ClassParentDeclr__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1325:2: rule__ClassParentDeclr__Group__1__Impl rule__ClassParentDeclr__Group__2
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__1__Impl_in_rule__ClassParentDeclr__Group__12677);
            rule__ClassParentDeclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__2_in_rule__ClassParentDeclr__Group__12680);
            rule__ClassParentDeclr__Group__2();

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
    // $ANTLR end "rule__ClassParentDeclr__Group__1"


    // $ANTLR start "rule__ClassParentDeclr__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1332:1: rule__ClassParentDeclr__Group__1__Impl : ( ruletypeName ) ;
    public final void rule__ClassParentDeclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1336:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1337:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1337:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1338:1: ruletypeName
            {
             before(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_1()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__ClassParentDeclr__Group__1__Impl2707);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassParentDeclr__Group__1__Impl"


    // $ANTLR start "rule__ClassParentDeclr__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1349:1: rule__ClassParentDeclr__Group__2 : rule__ClassParentDeclr__Group__2__Impl ;
    public final void rule__ClassParentDeclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1353:1: ( rule__ClassParentDeclr__Group__2__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1354:2: rule__ClassParentDeclr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group__2__Impl_in_rule__ClassParentDeclr__Group__22736);
            rule__ClassParentDeclr__Group__2__Impl();

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
    // $ANTLR end "rule__ClassParentDeclr__Group__2"


    // $ANTLR start "rule__ClassParentDeclr__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1360:1: rule__ClassParentDeclr__Group__2__Impl : ( ( rule__ClassParentDeclr__Group_2__0 )* ) ;
    public final void rule__ClassParentDeclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1364:1: ( ( ( rule__ClassParentDeclr__Group_2__0 )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1365:1: ( ( rule__ClassParentDeclr__Group_2__0 )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1365:1: ( ( rule__ClassParentDeclr__Group_2__0 )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1366:1: ( rule__ClassParentDeclr__Group_2__0 )*
            {
             before(grammarAccess.getClassParentDeclrAccess().getGroup_2()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1367:1: ( rule__ClassParentDeclr__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1367:2: rule__ClassParentDeclr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ClassParentDeclr__Group_2__0_in_rule__ClassParentDeclr__Group__2__Impl2763);
            	    rule__ClassParentDeclr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassParentDeclrAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassParentDeclr__Group__2__Impl"


    // $ANTLR start "rule__ClassParentDeclr__Group_2__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1383:1: rule__ClassParentDeclr__Group_2__0 : rule__ClassParentDeclr__Group_2__0__Impl rule__ClassParentDeclr__Group_2__1 ;
    public final void rule__ClassParentDeclr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1387:1: ( rule__ClassParentDeclr__Group_2__0__Impl rule__ClassParentDeclr__Group_2__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1388:2: rule__ClassParentDeclr__Group_2__0__Impl rule__ClassParentDeclr__Group_2__1
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group_2__0__Impl_in_rule__ClassParentDeclr__Group_2__02800);
            rule__ClassParentDeclr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassParentDeclr__Group_2__1_in_rule__ClassParentDeclr__Group_2__02803);
            rule__ClassParentDeclr__Group_2__1();

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
    // $ANTLR end "rule__ClassParentDeclr__Group_2__0"


    // $ANTLR start "rule__ClassParentDeclr__Group_2__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1395:1: rule__ClassParentDeclr__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ClassParentDeclr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1399:1: ( ( ',' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1400:1: ( ',' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1400:1: ( ',' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1401:1: ','
            {
             before(grammarAccess.getClassParentDeclrAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassParentDeclr__Group_2__0__Impl2831); 
             after(grammarAccess.getClassParentDeclrAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassParentDeclr__Group_2__0__Impl"


    // $ANTLR start "rule__ClassParentDeclr__Group_2__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1414:1: rule__ClassParentDeclr__Group_2__1 : rule__ClassParentDeclr__Group_2__1__Impl ;
    public final void rule__ClassParentDeclr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1418:1: ( rule__ClassParentDeclr__Group_2__1__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1419:2: rule__ClassParentDeclr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassParentDeclr__Group_2__1__Impl_in_rule__ClassParentDeclr__Group_2__12862);
            rule__ClassParentDeclr__Group_2__1__Impl();

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
    // $ANTLR end "rule__ClassParentDeclr__Group_2__1"


    // $ANTLR start "rule__ClassParentDeclr__Group_2__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1425:1: rule__ClassParentDeclr__Group_2__1__Impl : ( ruletypeName ) ;
    public final void rule__ClassParentDeclr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1429:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1430:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1430:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1431:1: ruletypeName
            {
             before(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__ClassParentDeclr__Group_2__1__Impl2889);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getClassParentDeclrAccess().getTypeNameParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassParentDeclr__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1446:1: rule__AttributeDeclaration__Group__0 : rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1 ;
    public final void rule__AttributeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1450:1: ( rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1451:2: rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__0__Impl_in_rule__AttributeDeclaration__Group__02922);
            rule__AttributeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__1_in_rule__AttributeDeclaration__Group__02925);
            rule__AttributeDeclaration__Group__1();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__0"


    // $ANTLR start "rule__AttributeDeclaration__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1458:1: rule__AttributeDeclaration__Group__0__Impl : ( 'att' ) ;
    public final void rule__AttributeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1462:1: ( ( 'att' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1463:1: ( 'att' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1463:1: ( 'att' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1464:1: 'att'
            {
             before(grammarAccess.getAttributeDeclarationAccess().getAttKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__AttributeDeclaration__Group__0__Impl2953); 
             after(grammarAccess.getAttributeDeclarationAccess().getAttKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1477:1: rule__AttributeDeclaration__Group__1 : rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2 ;
    public final void rule__AttributeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1481:1: ( rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1482:2: rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__1__Impl_in_rule__AttributeDeclaration__Group__12984);
            rule__AttributeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__2_in_rule__AttributeDeclaration__Group__12987);
            rule__AttributeDeclaration__Group__2();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__1"


    // $ANTLR start "rule__AttributeDeclaration__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1489:1: rule__AttributeDeclaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AttributeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1493:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1494:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1494:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1495:1: RULE_ID
            {
             before(grammarAccess.getAttributeDeclarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeDeclaration__Group__1__Impl3014); 
             after(grammarAccess.getAttributeDeclarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1506:1: rule__AttributeDeclaration__Group__2 : rule__AttributeDeclaration__Group__2__Impl rule__AttributeDeclaration__Group__3 ;
    public final void rule__AttributeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1510:1: ( rule__AttributeDeclaration__Group__2__Impl rule__AttributeDeclaration__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1511:2: rule__AttributeDeclaration__Group__2__Impl rule__AttributeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__2__Impl_in_rule__AttributeDeclaration__Group__23043);
            rule__AttributeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__3_in_rule__AttributeDeclaration__Group__23046);
            rule__AttributeDeclaration__Group__3();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__2"


    // $ANTLR start "rule__AttributeDeclaration__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1518:1: rule__AttributeDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1522:1: ( ( ':' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1523:1: ( ':' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1523:1: ( ':' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1524:1: ':'
            {
             before(grammarAccess.getAttributeDeclarationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__AttributeDeclaration__Group__2__Impl3074); 
             after(grammarAccess.getAttributeDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1537:1: rule__AttributeDeclaration__Group__3 : rule__AttributeDeclaration__Group__3__Impl rule__AttributeDeclaration__Group__4 ;
    public final void rule__AttributeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1541:1: ( rule__AttributeDeclaration__Group__3__Impl rule__AttributeDeclaration__Group__4 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1542:2: rule__AttributeDeclaration__Group__3__Impl rule__AttributeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__3__Impl_in_rule__AttributeDeclaration__Group__33105);
            rule__AttributeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__4_in_rule__AttributeDeclaration__Group__33108);
            rule__AttributeDeclaration__Group__4();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__3"


    // $ANTLR start "rule__AttributeDeclaration__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1549:1: rule__AttributeDeclaration__Group__3__Impl : ( ruleattributeType ) ;
    public final void rule__AttributeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1553:1: ( ( ruleattributeType ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1554:1: ( ruleattributeType )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1554:1: ( ruleattributeType )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1555:1: ruleattributeType
            {
             before(grammarAccess.getAttributeDeclarationAccess().getAttributeTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleattributeType_in_rule__AttributeDeclaration__Group__3__Impl3135);
            ruleattributeType();

            state._fsp--;

             after(grammarAccess.getAttributeDeclarationAccess().getAttributeTypeParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__4"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1566:1: rule__AttributeDeclaration__Group__4 : rule__AttributeDeclaration__Group__4__Impl ;
    public final void rule__AttributeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1570:1: ( rule__AttributeDeclaration__Group__4__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1571:2: rule__AttributeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeDeclaration__Group__4__Impl_in_rule__AttributeDeclaration__Group__43164);
            rule__AttributeDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__4"


    // $ANTLR start "rule__AttributeDeclaration__Group__4__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1577:1: rule__AttributeDeclaration__Group__4__Impl : ( ( ruleannotationDeclr )* ) ;
    public final void rule__AttributeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1581:1: ( ( ( ruleannotationDeclr )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1582:1: ( ( ruleannotationDeclr )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1582:1: ( ( ruleannotationDeclr )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1583:1: ( ruleannotationDeclr )*
            {
             before(grammarAccess.getAttributeDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1584:1: ( ruleannotationDeclr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1584:3: ruleannotationDeclr
            	    {
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_rule__AttributeDeclaration__Group__4__Impl3192);
            	    ruleannotationDeclr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAttributeDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1604:1: rule__ReferenceDeclaration__Group__0 : rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 ;
    public final void rule__ReferenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1608:1: ( rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1609:2: rule__ReferenceDeclaration__Group__0__Impl rule__ReferenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__0__Impl_in_rule__ReferenceDeclaration__Group__03233);
            rule__ReferenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__1_in_rule__ReferenceDeclaration__Group__03236);
            rule__ReferenceDeclaration__Group__1();

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
    // $ANTLR end "rule__ReferenceDeclaration__Group__0"


    // $ANTLR start "rule__ReferenceDeclaration__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1616:1: rule__ReferenceDeclaration__Group__0__Impl : ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) ;
    public final void rule__ReferenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1620:1: ( ( ( rule__ReferenceDeclaration__Alternatives_0 ) ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1621:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1621:1: ( ( rule__ReferenceDeclaration__Alternatives_0 ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1622:1: ( rule__ReferenceDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1623:1: ( rule__ReferenceDeclaration__Alternatives_0 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1623:2: rule__ReferenceDeclaration__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Alternatives_0_in_rule__ReferenceDeclaration__Group__0__Impl3263);
            rule__ReferenceDeclaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1633:1: rule__ReferenceDeclaration__Group__1 : rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 ;
    public final void rule__ReferenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1637:1: ( rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1638:2: rule__ReferenceDeclaration__Group__1__Impl rule__ReferenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__1__Impl_in_rule__ReferenceDeclaration__Group__13293);
            rule__ReferenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__2_in_rule__ReferenceDeclaration__Group__13296);
            rule__ReferenceDeclaration__Group__2();

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
    // $ANTLR end "rule__ReferenceDeclaration__Group__1"


    // $ANTLR start "rule__ReferenceDeclaration__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1645:1: rule__ReferenceDeclaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__ReferenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1649:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1650:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1650:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1651:1: RULE_ID
            {
             before(grammarAccess.getReferenceDeclarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceDeclaration__Group__1__Impl3323); 
             after(grammarAccess.getReferenceDeclarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1662:1: rule__ReferenceDeclaration__Group__2 : rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 ;
    public final void rule__ReferenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1666:1: ( rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1667:2: rule__ReferenceDeclaration__Group__2__Impl rule__ReferenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__2__Impl_in_rule__ReferenceDeclaration__Group__23352);
            rule__ReferenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__3_in_rule__ReferenceDeclaration__Group__23355);
            rule__ReferenceDeclaration__Group__3();

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
    // $ANTLR end "rule__ReferenceDeclaration__Group__2"


    // $ANTLR start "rule__ReferenceDeclaration__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1674:1: rule__ReferenceDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__ReferenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1678:1: ( ( ':' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1679:1: ( ':' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1679:1: ( ':' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1680:1: ':'
            {
             before(grammarAccess.getReferenceDeclarationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ReferenceDeclaration__Group__2__Impl3383); 
             after(grammarAccess.getReferenceDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1693:1: rule__ReferenceDeclaration__Group__3 : rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 ;
    public final void rule__ReferenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1697:1: ( rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1698:2: rule__ReferenceDeclaration__Group__3__Impl rule__ReferenceDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__3__Impl_in_rule__ReferenceDeclaration__Group__33414);
            rule__ReferenceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__4_in_rule__ReferenceDeclaration__Group__33417);
            rule__ReferenceDeclaration__Group__4();

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
    // $ANTLR end "rule__ReferenceDeclaration__Group__3"


    // $ANTLR start "rule__ReferenceDeclaration__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1705:1: rule__ReferenceDeclaration__Group__3__Impl : ( ruletypeName ) ;
    public final void rule__ReferenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1709:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1710:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1710:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1711:1: ruletypeName
            {
             before(grammarAccess.getReferenceDeclarationAccess().getTypeNameParserRuleCall_3()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__ReferenceDeclaration__Group__3__Impl3444);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getReferenceDeclarationAccess().getTypeNameParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ReferenceDeclaration__Group__4"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1722:1: rule__ReferenceDeclaration__Group__4 : rule__ReferenceDeclaration__Group__4__Impl ;
    public final void rule__ReferenceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1726:1: ( rule__ReferenceDeclaration__Group__4__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1727:2: rule__ReferenceDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceDeclaration__Group__4__Impl_in_rule__ReferenceDeclaration__Group__43473);
            rule__ReferenceDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__ReferenceDeclaration__Group__4"


    // $ANTLR start "rule__ReferenceDeclaration__Group__4__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1733:1: rule__ReferenceDeclaration__Group__4__Impl : ( ( ruleannotationDeclr )* ) ;
    public final void rule__ReferenceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1737:1: ( ( ( ruleannotationDeclr )* ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1738:1: ( ( ruleannotationDeclr )* )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1738:1: ( ( ruleannotationDeclr )* )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1739:1: ( ruleannotationDeclr )*
            {
             before(grammarAccess.getReferenceDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1740:1: ( ruleannotationDeclr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1740:3: ruleannotationDeclr
            	    {
            	    pushFollow(FOLLOW_ruleannotationDeclr_in_rule__ReferenceDeclaration__Group__4__Impl3501);
            	    ruleannotationDeclr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getReferenceDeclarationAccess().getAnnotationDeclrParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__DependencyDeclaration__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1760:1: rule__DependencyDeclaration__Group__0 : rule__DependencyDeclaration__Group__0__Impl rule__DependencyDeclaration__Group__1 ;
    public final void rule__DependencyDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1764:1: ( rule__DependencyDeclaration__Group__0__Impl rule__DependencyDeclaration__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1765:2: rule__DependencyDeclaration__Group__0__Impl rule__DependencyDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__0__Impl_in_rule__DependencyDeclaration__Group__03542);
            rule__DependencyDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__1_in_rule__DependencyDeclaration__Group__03545);
            rule__DependencyDeclaration__Group__1();

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
    // $ANTLR end "rule__DependencyDeclaration__Group__0"


    // $ANTLR start "rule__DependencyDeclaration__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1772:1: rule__DependencyDeclaration__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1776:1: ( ( 'dependency' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1777:1: ( 'dependency' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1777:1: ( 'dependency' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1778:1: 'dependency'
            {
             before(grammarAccess.getDependencyDeclarationAccess().getDependencyKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__DependencyDeclaration__Group__0__Impl3573); 
             after(grammarAccess.getDependencyDeclarationAccess().getDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DependencyDeclaration__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1791:1: rule__DependencyDeclaration__Group__1 : rule__DependencyDeclaration__Group__1__Impl rule__DependencyDeclaration__Group__2 ;
    public final void rule__DependencyDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1795:1: ( rule__DependencyDeclaration__Group__1__Impl rule__DependencyDeclaration__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1796:2: rule__DependencyDeclaration__Group__1__Impl rule__DependencyDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__1__Impl_in_rule__DependencyDeclaration__Group__13604);
            rule__DependencyDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__2_in_rule__DependencyDeclaration__Group__13607);
            rule__DependencyDeclaration__Group__2();

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
    // $ANTLR end "rule__DependencyDeclaration__Group__1"


    // $ANTLR start "rule__DependencyDeclaration__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1803:1: rule__DependencyDeclaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__DependencyDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1807:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1808:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1808:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1809:1: RULE_ID
            {
             before(grammarAccess.getDependencyDeclarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DependencyDeclaration__Group__1__Impl3634); 
             after(grammarAccess.getDependencyDeclarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DependencyDeclaration__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1820:1: rule__DependencyDeclaration__Group__2 : rule__DependencyDeclaration__Group__2__Impl rule__DependencyDeclaration__Group__3 ;
    public final void rule__DependencyDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1824:1: ( rule__DependencyDeclaration__Group__2__Impl rule__DependencyDeclaration__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1825:2: rule__DependencyDeclaration__Group__2__Impl rule__DependencyDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__2__Impl_in_rule__DependencyDeclaration__Group__23663);
            rule__DependencyDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__3_in_rule__DependencyDeclaration__Group__23666);
            rule__DependencyDeclaration__Group__3();

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
    // $ANTLR end "rule__DependencyDeclaration__Group__2"


    // $ANTLR start "rule__DependencyDeclaration__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1832:1: rule__DependencyDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__DependencyDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1836:1: ( ( ':' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1837:1: ( ':' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1837:1: ( ':' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1838:1: ':'
            {
             before(grammarAccess.getDependencyDeclarationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__DependencyDeclaration__Group__2__Impl3694); 
             after(grammarAccess.getDependencyDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DependencyDeclaration__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1851:1: rule__DependencyDeclaration__Group__3 : rule__DependencyDeclaration__Group__3__Impl ;
    public final void rule__DependencyDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1855:1: ( rule__DependencyDeclaration__Group__3__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1856:2: rule__DependencyDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DependencyDeclaration__Group__3__Impl_in_rule__DependencyDeclaration__Group__33725);
            rule__DependencyDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__DependencyDeclaration__Group__3"


    // $ANTLR start "rule__DependencyDeclaration__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1862:1: rule__DependencyDeclaration__Group__3__Impl : ( ruletypeName ) ;
    public final void rule__DependencyDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1866:1: ( ( ruletypeName ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1867:1: ( ruletypeName )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1867:1: ( ruletypeName )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1868:1: ruletypeName
            {
             before(grammarAccess.getDependencyDeclarationAccess().getTypeNameParserRuleCall_3()); 
            pushFollow(FOLLOW_ruletypeName_in_rule__DependencyDeclaration__Group__3__Impl3752);
            ruletypeName();

            state._fsp--;

             after(grammarAccess.getDependencyDeclarationAccess().getTypeNameParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyDeclaration__Group__3__Impl"


    // $ANTLR start "rule__InputDeclaration__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1887:1: rule__InputDeclaration__Group__0 : rule__InputDeclaration__Group__0__Impl rule__InputDeclaration__Group__1 ;
    public final void rule__InputDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1891:1: ( rule__InputDeclaration__Group__0__Impl rule__InputDeclaration__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1892:2: rule__InputDeclaration__Group__0__Impl rule__InputDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__InputDeclaration__Group__0__Impl_in_rule__InputDeclaration__Group__03789);
            rule__InputDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDeclaration__Group__1_in_rule__InputDeclaration__Group__03792);
            rule__InputDeclaration__Group__1();

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
    // $ANTLR end "rule__InputDeclaration__Group__0"


    // $ANTLR start "rule__InputDeclaration__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1899:1: rule__InputDeclaration__Group__0__Impl : ( 'input' ) ;
    public final void rule__InputDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1903:1: ( ( 'input' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1904:1: ( 'input' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1904:1: ( 'input' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1905:1: 'input'
            {
             before(grammarAccess.getInputDeclarationAccess().getInputKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__InputDeclaration__Group__0__Impl3820); 
             after(grammarAccess.getInputDeclarationAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDeclaration__Group__0__Impl"


    // $ANTLR start "rule__InputDeclaration__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1918:1: rule__InputDeclaration__Group__1 : rule__InputDeclaration__Group__1__Impl rule__InputDeclaration__Group__2 ;
    public final void rule__InputDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1922:1: ( rule__InputDeclaration__Group__1__Impl rule__InputDeclaration__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1923:2: rule__InputDeclaration__Group__1__Impl rule__InputDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__InputDeclaration__Group__1__Impl_in_rule__InputDeclaration__Group__13851);
            rule__InputDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputDeclaration__Group__2_in_rule__InputDeclaration__Group__13854);
            rule__InputDeclaration__Group__2();

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
    // $ANTLR end "rule__InputDeclaration__Group__1"


    // $ANTLR start "rule__InputDeclaration__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1930:1: rule__InputDeclaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__InputDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1934:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1935:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1935:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1936:1: RULE_ID
            {
             before(grammarAccess.getInputDeclarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InputDeclaration__Group__1__Impl3881); 
             after(grammarAccess.getInputDeclarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InputDeclaration__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1947:1: rule__InputDeclaration__Group__2 : rule__InputDeclaration__Group__2__Impl ;
    public final void rule__InputDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1951:1: ( rule__InputDeclaration__Group__2__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1952:2: rule__InputDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InputDeclaration__Group__2__Impl_in_rule__InputDeclaration__Group__23910);
            rule__InputDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__InputDeclaration__Group__2"


    // $ANTLR start "rule__InputDeclaration__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1958:1: rule__InputDeclaration__Group__2__Impl : ( RULE_STRING ) ;
    public final void rule__InputDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1962:1: ( ( RULE_STRING ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1963:1: ( RULE_STRING )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1963:1: ( RULE_STRING )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1964:1: RULE_STRING
            {
             before(grammarAccess.getInputDeclarationAccess().getSTRINGTerminalRuleCall_2()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputDeclaration__Group__2__Impl3937); 
             after(grammarAccess.getInputDeclarationAccess().getSTRINGTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDeclaration__Group__2__Impl"


    // $ANTLR start "rule__OutputDeclaration__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1981:1: rule__OutputDeclaration__Group__0 : rule__OutputDeclaration__Group__0__Impl rule__OutputDeclaration__Group__1 ;
    public final void rule__OutputDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1985:1: ( rule__OutputDeclaration__Group__0__Impl rule__OutputDeclaration__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1986:2: rule__OutputDeclaration__Group__0__Impl rule__OutputDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__OutputDeclaration__Group__0__Impl_in_rule__OutputDeclaration__Group__03972);
            rule__OutputDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDeclaration__Group__1_in_rule__OutputDeclaration__Group__03975);
            rule__OutputDeclaration__Group__1();

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
    // $ANTLR end "rule__OutputDeclaration__Group__0"


    // $ANTLR start "rule__OutputDeclaration__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1993:1: rule__OutputDeclaration__Group__0__Impl : ( 'output' ) ;
    public final void rule__OutputDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1997:1: ( ( 'output' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1998:1: ( 'output' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1998:1: ( 'output' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:1999:1: 'output'
            {
             before(grammarAccess.getOutputDeclarationAccess().getOutputKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__OutputDeclaration__Group__0__Impl4003); 
             after(grammarAccess.getOutputDeclarationAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDeclaration__Group__0__Impl"


    // $ANTLR start "rule__OutputDeclaration__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2012:1: rule__OutputDeclaration__Group__1 : rule__OutputDeclaration__Group__1__Impl rule__OutputDeclaration__Group__2 ;
    public final void rule__OutputDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2016:1: ( rule__OutputDeclaration__Group__1__Impl rule__OutputDeclaration__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2017:2: rule__OutputDeclaration__Group__1__Impl rule__OutputDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__OutputDeclaration__Group__1__Impl_in_rule__OutputDeclaration__Group__14034);
            rule__OutputDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDeclaration__Group__2_in_rule__OutputDeclaration__Group__14037);
            rule__OutputDeclaration__Group__2();

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
    // $ANTLR end "rule__OutputDeclaration__Group__1"


    // $ANTLR start "rule__OutputDeclaration__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2024:1: rule__OutputDeclaration__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__OutputDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2028:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2029:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2029:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2030:1: RULE_ID
            {
             before(grammarAccess.getOutputDeclarationAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OutputDeclaration__Group__1__Impl4064); 
             after(grammarAccess.getOutputDeclarationAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDeclaration__Group__1__Impl"


    // $ANTLR start "rule__OutputDeclaration__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2041:1: rule__OutputDeclaration__Group__2 : rule__OutputDeclaration__Group__2__Impl rule__OutputDeclaration__Group__3 ;
    public final void rule__OutputDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2045:1: ( rule__OutputDeclaration__Group__2__Impl rule__OutputDeclaration__Group__3 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2046:2: rule__OutputDeclaration__Group__2__Impl rule__OutputDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__OutputDeclaration__Group__2__Impl_in_rule__OutputDeclaration__Group__24093);
            rule__OutputDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutputDeclaration__Group__3_in_rule__OutputDeclaration__Group__24096);
            rule__OutputDeclaration__Group__3();

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
    // $ANTLR end "rule__OutputDeclaration__Group__2"


    // $ANTLR start "rule__OutputDeclaration__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2053:1: rule__OutputDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__OutputDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2057:1: ( ( ':' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2058:1: ( ':' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2058:1: ( ':' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2059:1: ':'
            {
             before(grammarAccess.getOutputDeclarationAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__OutputDeclaration__Group__2__Impl4124); 
             after(grammarAccess.getOutputDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDeclaration__Group__2__Impl"


    // $ANTLR start "rule__OutputDeclaration__Group__3"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2072:1: rule__OutputDeclaration__Group__3 : rule__OutputDeclaration__Group__3__Impl ;
    public final void rule__OutputDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2076:1: ( rule__OutputDeclaration__Group__3__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2077:2: rule__OutputDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OutputDeclaration__Group__3__Impl_in_rule__OutputDeclaration__Group__34155);
            rule__OutputDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__OutputDeclaration__Group__3"


    // $ANTLR start "rule__OutputDeclaration__Group__3__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2083:1: rule__OutputDeclaration__Group__3__Impl : ( ruleattributeType ) ;
    public final void rule__OutputDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2087:1: ( ( ruleattributeType ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2088:1: ( ruleattributeType )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2088:1: ( ruleattributeType )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2089:1: ruleattributeType
            {
             before(grammarAccess.getOutputDeclarationAccess().getAttributeTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleattributeType_in_rule__OutputDeclaration__Group__3__Impl4182);
            ruleattributeType();

            state._fsp--;

             after(grammarAccess.getOutputDeclarationAccess().getAttributeTypeParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDeclaration__Group__3__Impl"


    // $ANTLR start "rule__AnnotationDeclr__Group__0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2108:1: rule__AnnotationDeclr__Group__0 : rule__AnnotationDeclr__Group__0__Impl rule__AnnotationDeclr__Group__1 ;
    public final void rule__AnnotationDeclr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2112:1: ( rule__AnnotationDeclr__Group__0__Impl rule__AnnotationDeclr__Group__1 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2113:2: rule__AnnotationDeclr__Group__0__Impl rule__AnnotationDeclr__Group__1
            {
            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__0__Impl_in_rule__AnnotationDeclr__Group__04219);
            rule__AnnotationDeclr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__1_in_rule__AnnotationDeclr__Group__04222);
            rule__AnnotationDeclr__Group__1();

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
    // $ANTLR end "rule__AnnotationDeclr__Group__0"


    // $ANTLR start "rule__AnnotationDeclr__Group__0__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2120:1: rule__AnnotationDeclr__Group__0__Impl : ( 'with' ) ;
    public final void rule__AnnotationDeclr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2124:1: ( ( 'with' ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2125:1: ( 'with' )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2125:1: ( 'with' )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2126:1: 'with'
            {
             before(grammarAccess.getAnnotationDeclrAccess().getWithKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__AnnotationDeclr__Group__0__Impl4250); 
             after(grammarAccess.getAnnotationDeclrAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDeclr__Group__0__Impl"


    // $ANTLR start "rule__AnnotationDeclr__Group__1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2139:1: rule__AnnotationDeclr__Group__1 : rule__AnnotationDeclr__Group__1__Impl rule__AnnotationDeclr__Group__2 ;
    public final void rule__AnnotationDeclr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2143:1: ( rule__AnnotationDeclr__Group__1__Impl rule__AnnotationDeclr__Group__2 )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2144:2: rule__AnnotationDeclr__Group__1__Impl rule__AnnotationDeclr__Group__2
            {
            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__1__Impl_in_rule__AnnotationDeclr__Group__14281);
            rule__AnnotationDeclr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__2_in_rule__AnnotationDeclr__Group__14284);
            rule__AnnotationDeclr__Group__2();

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
    // $ANTLR end "rule__AnnotationDeclr__Group__1"


    // $ANTLR start "rule__AnnotationDeclr__Group__1__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2151:1: rule__AnnotationDeclr__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AnnotationDeclr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2155:1: ( ( RULE_ID ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2156:1: ( RULE_ID )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2156:1: ( RULE_ID )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2157:1: RULE_ID
            {
             before(grammarAccess.getAnnotationDeclrAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationDeclr__Group__1__Impl4311); 
             after(grammarAccess.getAnnotationDeclrAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDeclr__Group__1__Impl"


    // $ANTLR start "rule__AnnotationDeclr__Group__2"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2168:1: rule__AnnotationDeclr__Group__2 : rule__AnnotationDeclr__Group__2__Impl ;
    public final void rule__AnnotationDeclr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2172:1: ( rule__AnnotationDeclr__Group__2__Impl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2173:2: rule__AnnotationDeclr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnnotationDeclr__Group__2__Impl_in_rule__AnnotationDeclr__Group__24340);
            rule__AnnotationDeclr__Group__2__Impl();

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
    // $ANTLR end "rule__AnnotationDeclr__Group__2"


    // $ANTLR start "rule__AnnotationDeclr__Group__2__Impl"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2179:1: rule__AnnotationDeclr__Group__2__Impl : ( ( rule__AnnotationDeclr__Alternatives_2 )? ) ;
    public final void rule__AnnotationDeclr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2183:1: ( ( ( rule__AnnotationDeclr__Alternatives_2 )? ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2184:1: ( ( rule__AnnotationDeclr__Alternatives_2 )? )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2184:1: ( ( rule__AnnotationDeclr__Alternatives_2 )? )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2185:1: ( rule__AnnotationDeclr__Alternatives_2 )?
            {
             before(grammarAccess.getAnnotationDeclrAccess().getAlternatives_2()); 
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2186:1: ( rule__AnnotationDeclr__Alternatives_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2186:2: rule__AnnotationDeclr__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__AnnotationDeclr__Alternatives_2_in_rule__AnnotationDeclr__Group__2__Impl4367);
                    rule__AnnotationDeclr__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationDeclrAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDeclr__Group__2__Impl"


    // $ANTLR start "rule__Model__AnnotationsAssignment_0"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2203:1: rule__Model__AnnotationsAssignment_0 : ( ruleannotationDeclr ) ;
    public final void rule__Model__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2207:1: ( ( ruleannotationDeclr ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2208:1: ( ruleannotationDeclr )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2208:1: ( ruleannotationDeclr )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2209:1: ruleannotationDeclr
            {
             before(grammarAccess.getModelAccess().getAnnotationsAnnotationDeclrParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleannotationDeclr_in_rule__Model__AnnotationsAssignment_04409);
            ruleannotationDeclr();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAnnotationsAnnotationDeclrParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AnnotationsAssignment_0"


    // $ANTLR start "rule__Model__DeclarationsAssignment_1"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2218:1: rule__Model__DeclarationsAssignment_1 : ( ruledecl ) ;
    public final void rule__Model__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2222:1: ( ( ruledecl ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2223:1: ( ruledecl )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2223:1: ( ruledecl )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2224:1: ruledecl
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Model__DeclarationsAssignment_14440);
            ruledecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment_1"


    // $ANTLR start "rule__ClassDeclr__AnnotationsAssignment_4"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2233:1: rule__ClassDeclr__AnnotationsAssignment_4 : ( ruleannotationDeclr ) ;
    public final void rule__ClassDeclr__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2237:1: ( ( ruleannotationDeclr ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2238:1: ( ruleannotationDeclr )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2238:1: ( ruleannotationDeclr )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2239:1: ruleannotationDeclr
            {
             before(grammarAccess.getClassDeclrAccess().getAnnotationsAnnotationDeclrParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleannotationDeclr_in_rule__ClassDeclr__AnnotationsAssignment_44471);
            ruleannotationDeclr();

            state._fsp--;

             after(grammarAccess.getClassDeclrAccess().getAnnotationsAnnotationDeclrParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__AnnotationsAssignment_4"


    // $ANTLR start "rule__ClassDeclr__DeclarationsAssignment_5"
    // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2248:1: rule__ClassDeclr__DeclarationsAssignment_5 : ( ruleclassElemDeclr ) ;
    public final void rule__ClassDeclr__DeclarationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2252:1: ( ( ruleclassElemDeclr ) )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2253:1: ( ruleclassElemDeclr )
            {
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2253:1: ( ruleclassElemDeclr )
            // ../org.kevoree.modeling.eclipse.ui/src-gen/org/kevoree/modeling/ui/contentassist/antlr/internal/InternalMetaModel.g:2254:1: ruleclassElemDeclr
            {
             before(grammarAccess.getClassDeclrAccess().getDeclarationsClassElemDeclrParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleclassElemDeclr_in_rule__ClassDeclr__DeclarationsAssignment_54502);
            ruleclassElemDeclr();

            state._fsp--;

             after(grammarAccess.getClassDeclrAccess().getDeclarationsClassElemDeclrParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclr__DeclarationsAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_entryRuletypeName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletypeName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Group__0_in_ruletypeName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Alternatives_in_ruledecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumDeclr_in_entryRuleenumDeclr241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumDeclr248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__0_in_ruleenumDeclr274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassDeclr_in_entryRuleclassDeclr301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassDeclr308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__0_in_ruleclassDeclr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassElemDeclr_in_entryRuleclassElemDeclr361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassElemDeclr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassElemDeclr__Alternatives_in_ruleclassElemDeclr394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassParentDeclr_in_entryRuleclassParentDeclr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassParentDeclr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__0_in_ruleclassParentDeclr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeDeclaration_in_entryRuleattributeDeclaration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattributeDeclaration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__0_in_ruleattributeDeclaration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeType_in_entryRuleattributeType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleattributeType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleattributeType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_entryRulereferenceDeclaration601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereferenceDeclaration608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__0_in_rulereferenceDeclaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledependencyDeclaration_in_entryRuledependencyDeclaration661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledependencyDeclaration668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__0_in_ruledependencyDeclaration694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputDeclaration_in_entryRuleinputDeclaration721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinputDeclaration728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__0_in_ruleinputDeclaration754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputDeclaration_in_entryRuleoutputDeclaration781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoutputDeclaration788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__0_in_ruleoutputDeclaration814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_entryRuleannotationDeclr841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleannotationDeclr848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__0_in_ruleannotationDeclr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumDeclr_in_rule__Decl__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassDeclr_in_rule__Decl__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeDeclaration_in_rule__ClassElemDeclr__Alternatives959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereferenceDeclaration_in_rule__ClassElemDeclr__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledependencyDeclaration_in_rule__ClassElemDeclr__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinputDeclaration_in_rule__ClassElemDeclr__Alternatives1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoutputDeclaration_in_rule__ClassElemDeclr__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeType__Alternatives1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeType__Alternatives1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeType__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AttributeType__Alternatives1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AttributeType__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttributeType__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__AttributeType__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ReferenceDeclaration__Alternatives_01212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReferenceDeclaration__Alternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AnnotationDeclr__Alternatives_21266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AnnotationDeclr__Alternatives_21283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01313 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AnnotationsAssignment_0_in_rule__Model__Group__0__Impl1343 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_1_in_rule__Model__Group__1__Impl1401 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_rule__TypeName__Group__0__Impl_in_rule__TypeName__Group__01436 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TypeName__Group__1_in_rule__TypeName__Group__01439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeName__Group__0__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Group__1__Impl_in_rule__TypeName__Group__11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Group_1__0_in_rule__TypeName__Group__1__Impl1522 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__TypeName__Group_1__0__Impl_in_rule__TypeName__Group_1__01557 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeName__Group_1__1_in_rule__TypeName__Group_1__01560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeName__Group_1__0__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Group_1__1__Impl_in_rule__TypeName__Group_1__11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeName__Group_1__1__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__0__Impl_in_rule__EnumDeclr__Group__01679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__1_in_rule__EnumDeclr__Group__01682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumDeclr__Group__0__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__1__Impl_in_rule__EnumDeclr__Group__11741 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__2_in_rule__EnumDeclr__Group__11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__EnumDeclr__Group__1__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__2__Impl_in_rule__EnumDeclr__Group__21800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__3_in_rule__EnumDeclr__Group__21803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumDeclr__Group__2__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__3__Impl_in_rule__EnumDeclr__Group__31862 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__4_in_rule__EnumDeclr__Group__31865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclr__Group__3__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__4__Impl_in_rule__EnumDeclr__Group__41921 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__5_in_rule__EnumDeclr__Group__41924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group_4__0_in_rule__EnumDeclr__Group__4__Impl1951 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group__5__Impl_in_rule__EnumDeclr__Group__51982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumDeclr__Group__5__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group_4__0__Impl_in_rule__EnumDeclr__Group_4__02053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group_4__1_in_rule__EnumDeclr__Group_4__02056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumDeclr__Group_4__0__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclr__Group_4__1__Impl_in_rule__EnumDeclr__Group_4__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclr__Group_4__1__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__0__Impl_in_rule__ClassDeclr__Group__02175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__1_in_rule__ClassDeclr__Group__02178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassDeclr__Group__0__Impl2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__1__Impl_in_rule__ClassDeclr__Group__12237 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__2_in_rule__ClassDeclr__Group__12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__ClassDeclr__Group__1__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__2__Impl_in_rule__ClassDeclr__Group__22296 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__3_in_rule__ClassDeclr__Group__22299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassParentDeclr_in_rule__ClassDeclr__Group__2__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__3__Impl_in_rule__ClassDeclr__Group__32358 = new BitSet(new long[]{0x00000000F4460000L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__4_in_rule__ClassDeclr__Group__32361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClassDeclr__Group__3__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__4__Impl_in_rule__ClassDeclr__Group__42420 = new BitSet(new long[]{0x00000000F4460000L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__5_in_rule__ClassDeclr__Group__42423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__AnnotationsAssignment_4_in_rule__ClassDeclr__Group__4__Impl2450 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__5__Impl_in_rule__ClassDeclr__Group__52481 = new BitSet(new long[]{0x00000000F4460000L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__6_in_rule__ClassDeclr__Group__52484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__DeclarationsAssignment_5_in_rule__ClassDeclr__Group__5__Impl2511 = new BitSet(new long[]{0x0000000074060002L});
    public static final BitSet FOLLOW_rule__ClassDeclr__Group__6__Impl_in_rule__ClassDeclr__Group__62542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassDeclr__Group__6__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__0__Impl_in_rule__ClassParentDeclr__Group__02615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__1_in_rule__ClassParentDeclr__Group__02618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassParentDeclr__Group__0__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__1__Impl_in_rule__ClassParentDeclr__Group__12677 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__2_in_rule__ClassParentDeclr__Group__12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__ClassParentDeclr__Group__1__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group__2__Impl_in_rule__ClassParentDeclr__Group__22736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group_2__0_in_rule__ClassParentDeclr__Group__2__Impl2763 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group_2__0__Impl_in_rule__ClassParentDeclr__Group_2__02800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group_2__1_in_rule__ClassParentDeclr__Group_2__02803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassParentDeclr__Group_2__0__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassParentDeclr__Group_2__1__Impl_in_rule__ClassParentDeclr__Group_2__12862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__ClassParentDeclr__Group_2__1__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__0__Impl_in_rule__AttributeDeclaration__Group__02922 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__1_in_rule__AttributeDeclaration__Group__02925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AttributeDeclaration__Group__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__1__Impl_in_rule__AttributeDeclaration__Group__12984 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__2_in_rule__AttributeDeclaration__Group__12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeDeclaration__Group__1__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__2__Impl_in_rule__AttributeDeclaration__Group__23043 = new BitSet(new long[]{0x000000000001F840L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__3_in_rule__AttributeDeclaration__Group__23046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttributeDeclaration__Group__2__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__3__Impl_in_rule__AttributeDeclaration__Group__33105 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__4_in_rule__AttributeDeclaration__Group__33108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeType_in_rule__AttributeDeclaration__Group__3__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeDeclaration__Group__4__Impl_in_rule__AttributeDeclaration__Group__43164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_rule__AttributeDeclaration__Group__4__Impl3192 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__0__Impl_in_rule__ReferenceDeclaration__Group__03233 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__1_in_rule__ReferenceDeclaration__Group__03236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Alternatives_0_in_rule__ReferenceDeclaration__Group__0__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__1__Impl_in_rule__ReferenceDeclaration__Group__13293 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__2_in_rule__ReferenceDeclaration__Group__13296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceDeclaration__Group__1__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__2__Impl_in_rule__ReferenceDeclaration__Group__23352 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__3_in_rule__ReferenceDeclaration__Group__23355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ReferenceDeclaration__Group__2__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__3__Impl_in_rule__ReferenceDeclaration__Group__33414 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__4_in_rule__ReferenceDeclaration__Group__33417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__ReferenceDeclaration__Group__3__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceDeclaration__Group__4__Impl_in_rule__ReferenceDeclaration__Group__43473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_rule__ReferenceDeclaration__Group__4__Impl3501 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__0__Impl_in_rule__DependencyDeclaration__Group__03542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__1_in_rule__DependencyDeclaration__Group__03545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DependencyDeclaration__Group__0__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__1__Impl_in_rule__DependencyDeclaration__Group__13604 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__2_in_rule__DependencyDeclaration__Group__13607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DependencyDeclaration__Group__1__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__2__Impl_in_rule__DependencyDeclaration__Group__23663 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__3_in_rule__DependencyDeclaration__Group__23666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DependencyDeclaration__Group__2__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyDeclaration__Group__3__Impl_in_rule__DependencyDeclaration__Group__33725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletypeName_in_rule__DependencyDeclaration__Group__3__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__0__Impl_in_rule__InputDeclaration__Group__03789 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__1_in_rule__InputDeclaration__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InputDeclaration__Group__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__1__Impl_in_rule__InputDeclaration__Group__13851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__2_in_rule__InputDeclaration__Group__13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InputDeclaration__Group__1__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDeclaration__Group__2__Impl_in_rule__InputDeclaration__Group__23910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputDeclaration__Group__2__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__0__Impl_in_rule__OutputDeclaration__Group__03972 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__1_in_rule__OutputDeclaration__Group__03975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OutputDeclaration__Group__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__1__Impl_in_rule__OutputDeclaration__Group__14034 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__2_in_rule__OutputDeclaration__Group__14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OutputDeclaration__Group__1__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__2__Impl_in_rule__OutputDeclaration__Group__24093 = new BitSet(new long[]{0x000000000001F840L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__3_in_rule__OutputDeclaration__Group__24096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OutputDeclaration__Group__2__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputDeclaration__Group__3__Impl_in_rule__OutputDeclaration__Group__34155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleattributeType_in_rule__OutputDeclaration__Group__3__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__0__Impl_in_rule__AnnotationDeclr__Group__04219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__1_in_rule__AnnotationDeclr__Group__04222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AnnotationDeclr__Group__0__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__1__Impl_in_rule__AnnotationDeclr__Group__14281 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__2_in_rule__AnnotationDeclr__Group__14284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationDeclr__Group__1__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Group__2__Impl_in_rule__AnnotationDeclr__Group__24340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationDeclr__Alternatives_2_in_rule__AnnotationDeclr__Group__2__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_rule__Model__AnnotationsAssignment_04409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Model__DeclarationsAssignment_14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleannotationDeclr_in_rule__ClassDeclr__AnnotationsAssignment_44471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassElemDeclr_in_rule__ClassDeclr__DeclarationsAssignment_54502 = new BitSet(new long[]{0x0000000000000002L});

}