/*
 * generated by Xtext
 */
package org.kevoree.modeling.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.eclipse.xtext.Keyword
import org.kevoree.modeling.services.MetaModelGrammarAccess

// import com.google.inject.Inject;
// import org.kevoree.modeling.services.MetaModelGrammarAccess
/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class MetaModelFormatter extends AbstractDeclarativeFormatter {

//	@Inject extension MetaModelGrammarAccess
	override protected void configureFormatting(FormattingConfig c) {
		var mmf = getGrammarAccess() as MetaModelGrammarAccess;
		
		c.setLinewrap(0, 1, 2).before(mmf.SL_COMMENTRule);
		c.setLinewrap(0, 1, 2).before(mmf.ML_COMMENTRule);
		c.setLinewrap(0, 1, 1).after(mmf.ML_COMMENTRule);

		for (Keyword comma : mmf.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}
		for (Keyword comma : mmf.findKeywords(":")) {
			c.setNoSpace().before(comma);
		}

		c.setNoLinewrap().before(mmf.attributeDeclarationRule);
		c.setLinewrap(1,1,1).before(mmf.referenceDeclarationRule);
		c.setLinewrap(1,1,1).before(mmf.dependencyDeclarationRule);
		c.setLinewrap(1,1,1).before(mmf.annotationDeclrAccess.withKeyword_0);
		c.setLinewrap(1,1,1).before(mmf.dependencyDeclarationAccess.dependencyKeyword_0);
		c.setLinewrap(1,1,1).before(mmf.classDeclrAccess.classKeyword_0);
		c.setLinewrap(1,1,1).before(mmf.enumDeclrAccess.enumKeyword_0);
		c.setLinewrap(1,1,1).before(mmf.annotationDeclrAccess.withKeyword_0);

		c.setIndentationIncrement().after(mmf.classDeclrAccess.leftCurlyBracketKeyword_3);
		c.setIndentationIncrement().after(mmf.enumDeclrAccess.leftCurlyBracketKeyword_2);
		c.setIndentationDecrement().before(mmf.classDeclrAccess.rightCurlyBracketKeyword_6);
		c.setIndentationDecrement().before(mmf.enumDeclrAccess.rightCurlyBracketKeyword_5);

		c.setLinewrap().after(mmf.classDeclrAccess.leftCurlyBracketKeyword_3);
		c.setLinewrap().after(mmf.classDeclrAccess.rightCurlyBracketKeyword_6);
		// c.setLinewrap().before(mmf.classDeclrAccess.leftCurlyBracketKeyword_3);
		c.setLinewrap().before(mmf.classDeclrAccess.rightCurlyBracketKeyword_6);

		c.setLinewrap().after(mmf.enumDeclrAccess.leftCurlyBracketKeyword_2);
		c.setLinewrap().after(mmf.enumDeclrAccess.rightCurlyBracketKeyword_5);
		// c.setLinewrap().before(mmf.enumDeclrAccess.leftCurlyBracketKeyword_2);
		c.setLinewrap().before(mmf.enumDeclrAccess.rightCurlyBracketKeyword_5);

	}

}
