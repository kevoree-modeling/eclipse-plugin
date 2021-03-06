/**
 * generated by Xtext
 */
package org.kevoree.modeling.formatting;

import java.util.List;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.kevoree.modeling.services.MetaModelGrammarAccess;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class MetaModelFormatter extends AbstractDeclarativeFormatter {
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    IGrammarAccess _grammarAccess = this.getGrammarAccess();
    MetaModelGrammarAccess mmf = ((MetaModelGrammarAccess) _grammarAccess);
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = mmf.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = mmf.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = mmf.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    List<Keyword> _findKeywords = mmf.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
      _setNoSpace.before(comma);
    }
    List<Keyword> _findKeywords_1 = mmf.findKeywords(":");
    for (final Keyword comma_1 : _findKeywords_1) {
      FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
      _setNoSpace_1.before(comma_1);
    }
    FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
    ParserRule _attributeDeclarationRule = mmf.getAttributeDeclarationRule();
    _setNoLinewrap.before(_attributeDeclarationRule);
    FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(1, 1, 1);
    ParserRule _referenceDeclarationRule = mmf.getReferenceDeclarationRule();
    _setLinewrap_3.before(_referenceDeclarationRule);
    FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(1, 1, 1);
    ParserRule _dependencyDeclarationRule = mmf.getDependencyDeclarationRule();
    _setLinewrap_4.before(_dependencyDeclarationRule);
    FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(1, 1, 1);
    MetaModelGrammarAccess.AnnotationDeclrElements _annotationDeclrAccess = mmf.getAnnotationDeclrAccess();
    Keyword _withKeyword_0 = _annotationDeclrAccess.getWithKeyword_0();
    _setLinewrap_5.before(_withKeyword_0);
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(1, 1, 1);
    MetaModelGrammarAccess.DependencyDeclarationElements _dependencyDeclarationAccess = mmf.getDependencyDeclarationAccess();
    Keyword _dependencyKeyword_0 = _dependencyDeclarationAccess.getDependencyKeyword_0();
    _setLinewrap_6.before(_dependencyKeyword_0);
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(1, 1, 1);
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess = mmf.getClassDeclrAccess();
    Keyword _classKeyword_0 = _classDeclrAccess.getClassKeyword_0();
    _setLinewrap_7.before(_classKeyword_0);
    FormattingConfig.LinewrapLocator _setLinewrap_8 = c.setLinewrap(1, 1, 1);
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess = mmf.getEnumDeclrAccess();
    Keyword _enumKeyword_0 = _enumDeclrAccess.getEnumKeyword_0();
    _setLinewrap_8.before(_enumKeyword_0);
    FormattingConfig.LinewrapLocator _setLinewrap_9 = c.setLinewrap(1, 1, 1);
    MetaModelGrammarAccess.AnnotationDeclrElements _annotationDeclrAccess_1 = mmf.getAnnotationDeclrAccess();
    Keyword _withKeyword_0_1 = _annotationDeclrAccess_1.getWithKeyword_0();
    _setLinewrap_9.before(_withKeyword_0_1);
    FormattingConfig.IndentationLocatorStart _setIndentationIncrement = c.setIndentationIncrement();
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess_1 = mmf.getClassDeclrAccess();
    Keyword _leftCurlyBracketKeyword_3 = _classDeclrAccess_1.getLeftCurlyBracketKeyword_3();
    _setIndentationIncrement.after(_leftCurlyBracketKeyword_3);
    FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess_1 = mmf.getEnumDeclrAccess();
    Keyword _leftCurlyBracketKeyword_2 = _enumDeclrAccess_1.getLeftCurlyBracketKeyword_2();
    _setIndentationIncrement_1.after(_leftCurlyBracketKeyword_2);
    FormattingConfig.IndentationLocatorEnd _setIndentationDecrement = c.setIndentationDecrement();
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess_2 = mmf.getClassDeclrAccess();
    Keyword _rightCurlyBracketKeyword_6 = _classDeclrAccess_2.getRightCurlyBracketKeyword_6();
    _setIndentationDecrement.before(_rightCurlyBracketKeyword_6);
    FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_1 = c.setIndentationDecrement();
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess_2 = mmf.getEnumDeclrAccess();
    Keyword _rightCurlyBracketKeyword_5 = _enumDeclrAccess_2.getRightCurlyBracketKeyword_5();
    _setIndentationDecrement_1.before(_rightCurlyBracketKeyword_5);
    FormattingConfig.LinewrapLocator _setLinewrap_10 = c.setLinewrap();
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess_3 = mmf.getClassDeclrAccess();
    Keyword _leftCurlyBracketKeyword_3_1 = _classDeclrAccess_3.getLeftCurlyBracketKeyword_3();
    _setLinewrap_10.after(_leftCurlyBracketKeyword_3_1);
    FormattingConfig.LinewrapLocator _setLinewrap_11 = c.setLinewrap();
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess_4 = mmf.getClassDeclrAccess();
    Keyword _rightCurlyBracketKeyword_6_1 = _classDeclrAccess_4.getRightCurlyBracketKeyword_6();
    _setLinewrap_11.after(_rightCurlyBracketKeyword_6_1);
    FormattingConfig.LinewrapLocator _setLinewrap_12 = c.setLinewrap();
    MetaModelGrammarAccess.ClassDeclrElements _classDeclrAccess_5 = mmf.getClassDeclrAccess();
    Keyword _rightCurlyBracketKeyword_6_2 = _classDeclrAccess_5.getRightCurlyBracketKeyword_6();
    _setLinewrap_12.before(_rightCurlyBracketKeyword_6_2);
    FormattingConfig.LinewrapLocator _setLinewrap_13 = c.setLinewrap();
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess_3 = mmf.getEnumDeclrAccess();
    Keyword _leftCurlyBracketKeyword_2_1 = _enumDeclrAccess_3.getLeftCurlyBracketKeyword_2();
    _setLinewrap_13.after(_leftCurlyBracketKeyword_2_1);
    FormattingConfig.LinewrapLocator _setLinewrap_14 = c.setLinewrap();
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess_4 = mmf.getEnumDeclrAccess();
    Keyword _rightCurlyBracketKeyword_5_1 = _enumDeclrAccess_4.getRightCurlyBracketKeyword_5();
    _setLinewrap_14.after(_rightCurlyBracketKeyword_5_1);
    FormattingConfig.LinewrapLocator _setLinewrap_15 = c.setLinewrap();
    MetaModelGrammarAccess.EnumDeclrElements _enumDeclrAccess_5 = mmf.getEnumDeclrAccess();
    Keyword _rightCurlyBracketKeyword_5_2 = _enumDeclrAccess_5.getRightCurlyBracketKeyword_5();
    _setLinewrap_15.before(_rightCurlyBracketKeyword_5_2);
  }
}
