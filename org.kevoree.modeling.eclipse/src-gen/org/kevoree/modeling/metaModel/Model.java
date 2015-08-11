/**
 */
package org.kevoree.modeling.metaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kevoree.modeling.metaModel.Model#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.kevoree.modeling.metaModel.Model#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.kevoree.modeling.metaModel.MetaModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' attribute list.
   * @see org.kevoree.modeling.metaModel.MetaModelPackage#getModel_Annotations()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnnotations();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.kevoree.modeling.metaModel.decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.kevoree.modeling.metaModel.MetaModelPackage#getModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<decl> getDeclarations();

} // Model
