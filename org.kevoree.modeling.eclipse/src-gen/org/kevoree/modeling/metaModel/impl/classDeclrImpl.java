/**
 */
package org.kevoree.modeling.metaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.kevoree.modeling.metaModel.MetaModelPackage;
import org.kevoree.modeling.metaModel.classDeclr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>class Declr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.kevoree.modeling.metaModel.impl.classDeclrImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.kevoree.modeling.metaModel.impl.classDeclrImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class classDeclrImpl extends declImpl implements classDeclr
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<String> annotations;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<String> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected classDeclrImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MetaModelPackage.Literals.CLASS_DECLR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EDataTypeEList<String>(String.class, this, MetaModelPackage.CLASS_DECLR__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EDataTypeEList<String>(String.class, this, MetaModelPackage.CLASS_DECLR__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MetaModelPackage.CLASS_DECLR__ANNOTATIONS:
        return getAnnotations();
      case MetaModelPackage.CLASS_DECLR__DECLARATIONS:
        return getDeclarations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MetaModelPackage.CLASS_DECLR__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends String>)newValue);
        return;
      case MetaModelPackage.CLASS_DECLR__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MetaModelPackage.CLASS_DECLR__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case MetaModelPackage.CLASS_DECLR__DECLARATIONS:
        getDeclarations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MetaModelPackage.CLASS_DECLR__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case MetaModelPackage.CLASS_DECLR__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (annotations: ");
    result.append(annotations);
    result.append(", declarations: ");
    result.append(declarations);
    result.append(')');
    return result.toString();
  }

} //classDeclrImpl
