/*
 * generated by Xtext
 */
package org.kevoree.modeling.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMetaModelValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.kevoree.modeling.metaModel.MetaModelPackage.eINSTANCE);
		return result;
	}
}