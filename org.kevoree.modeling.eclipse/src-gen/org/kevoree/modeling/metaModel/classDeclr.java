/**
 */
package org.kevoree.modeling.metaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Declr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.kevoree.modeling.metaModel.classDeclr#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.kevoree.modeling.metaModel.classDeclr#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.kevoree.modeling.metaModel.MetaModelPackage#getclassDeclr()
 * @model
 * @generated
 */
public interface classDeclr extends decl
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
   * @see org.kevoree.modeling.metaModel.MetaModelPackage#getclassDeclr_Annotations()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnnotations();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' attribute list.
   * @see org.kevoree.modeling.metaModel.MetaModelPackage#getclassDeclr_Declarations()
   * @model unique="false"
   * @generated
   */
  EList<String> getDeclarations();

} // classDeclr
