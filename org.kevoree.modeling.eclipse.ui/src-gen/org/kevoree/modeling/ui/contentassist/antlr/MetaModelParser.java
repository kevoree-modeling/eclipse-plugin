/*
 * generated by Xtext
 */
package org.kevoree.modeling.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.kevoree.modeling.services.MetaModelGrammarAccess;

public class MetaModelParser extends AbstractContentAssistParser {
	
	@Inject
	private MetaModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.kevoree.modeling.ui.contentassist.antlr.internal.InternalMetaModelParser createParser() {
		org.kevoree.modeling.ui.contentassist.antlr.internal.InternalMetaModelParser result = new org.kevoree.modeling.ui.contentassist.antlr.internal.InternalMetaModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclAccess().getAlternatives(), "rule__Decl__Alternatives");
					put(grammarAccess.getClassElemDeclrAccess().getAlternatives(), "rule__ClassElemDeclr__Alternatives");
					put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
					put(grammarAccess.getReferenceDeclarationAccess().getAlternatives_0(), "rule__ReferenceDeclaration__Alternatives_0");
					put(grammarAccess.getAnnotationDeclrAccess().getAlternatives_2(), "rule__AnnotationDeclr__Alternatives_2");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTypeNameAccess().getGroup(), "rule__TypeName__Group__0");
					put(grammarAccess.getTypeNameAccess().getGroup_1(), "rule__TypeName__Group_1__0");
					put(grammarAccess.getEnumDeclrAccess().getGroup(), "rule__EnumDeclr__Group__0");
					put(grammarAccess.getEnumDeclrAccess().getGroup_4(), "rule__EnumDeclr__Group_4__0");
					put(grammarAccess.getClassDeclrAccess().getGroup(), "rule__ClassDeclr__Group__0");
					put(grammarAccess.getClassParentDeclrAccess().getGroup(), "rule__ClassParentDeclr__Group__0");
					put(grammarAccess.getClassParentDeclrAccess().getGroup_2(), "rule__ClassParentDeclr__Group_2__0");
					put(grammarAccess.getAttributeDeclarationAccess().getGroup(), "rule__AttributeDeclaration__Group__0");
					put(grammarAccess.getReferenceDeclarationAccess().getGroup(), "rule__ReferenceDeclaration__Group__0");
					put(grammarAccess.getDependencyDeclarationAccess().getGroup(), "rule__DependencyDeclaration__Group__0");
					put(grammarAccess.getInputDeclarationAccess().getGroup(), "rule__InputDeclaration__Group__0");
					put(grammarAccess.getOutputDeclarationAccess().getGroup(), "rule__OutputDeclaration__Group__0");
					put(grammarAccess.getAnnotationDeclrAccess().getGroup(), "rule__AnnotationDeclr__Group__0");
					put(grammarAccess.getModelAccess().getAnnotationsAssignment_0(), "rule__Model__AnnotationsAssignment_0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment_1(), "rule__Model__DeclarationsAssignment_1");
					put(grammarAccess.getClassDeclrAccess().getAnnotationsAssignment_4(), "rule__ClassDeclr__AnnotationsAssignment_4");
					put(grammarAccess.getClassDeclrAccess().getDeclarationsAssignment_5(), "rule__ClassDeclr__DeclarationsAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.kevoree.modeling.ui.contentassist.antlr.internal.InternalMetaModelParser typedParser = (org.kevoree.modeling.ui.contentassist.antlr.internal.InternalMetaModelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MetaModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MetaModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
