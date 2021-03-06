/*
 * generated by Xtext
 */
package org.kevoree.modeling.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.kevoree.modeling.ui.internal.MetaModelActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MetaModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MetaModelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MetaModelActivator.getInstance().getInjector(MetaModelActivator.ORG_KEVOREE_MODELING_METAMODEL);
	}
	
}
