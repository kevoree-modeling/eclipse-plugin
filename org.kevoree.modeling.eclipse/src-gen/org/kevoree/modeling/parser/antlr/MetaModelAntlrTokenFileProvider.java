/*
 * generated by Xtext
 */
package org.kevoree.modeling.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MetaModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/kevoree/modeling/parser/antlr/internal/InternalMetaModel.tokens");
	}
}
