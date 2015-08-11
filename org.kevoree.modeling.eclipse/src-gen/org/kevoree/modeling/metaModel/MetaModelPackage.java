/**
 */
package org.kevoree.modeling.metaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kevoree.modeling.metaModel.MetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "metaModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.kevoree.org/modeling/MetaModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "metaModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MetaModelPackage eINSTANCE = org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kevoree.modeling.metaModel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kevoree.modeling.metaModel.impl.ModelImpl
   * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.kevoree.modeling.metaModel.impl.declImpl <em>decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kevoree.modeling.metaModel.impl.declImpl
   * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getdecl()
   * @generated
   */
  int DECL = 1;

  /**
   * The number of structural features of the '<em>decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.kevoree.modeling.metaModel.impl.classDeclrImpl <em>class Declr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kevoree.modeling.metaModel.impl.classDeclrImpl
   * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getclassDeclr()
   * @generated
   */
  int CLASS_DECLR = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLR__ANNOTATIONS = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLR__DECLARATIONS = DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>class Declr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLR_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.kevoree.modeling.metaModel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.kevoree.modeling.metaModel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link org.kevoree.modeling.metaModel.Model#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Annotations</em>'.
   * @see org.kevoree.modeling.metaModel.Model#getAnnotations()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Annotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.kevoree.modeling.metaModel.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.kevoree.modeling.metaModel.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link org.kevoree.modeling.metaModel.decl <em>decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>decl</em>'.
   * @see org.kevoree.modeling.metaModel.decl
   * @generated
   */
  EClass getdecl();

  /**
   * Returns the meta object for class '{@link org.kevoree.modeling.metaModel.classDeclr <em>class Declr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Declr</em>'.
   * @see org.kevoree.modeling.metaModel.classDeclr
   * @generated
   */
  EClass getclassDeclr();

  /**
   * Returns the meta object for the attribute list '{@link org.kevoree.modeling.metaModel.classDeclr#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Annotations</em>'.
   * @see org.kevoree.modeling.metaModel.classDeclr#getAnnotations()
   * @see #getclassDeclr()
   * @generated
   */
  EAttribute getclassDeclr_Annotations();

  /**
   * Returns the meta object for the attribute list '{@link org.kevoree.modeling.metaModel.classDeclr#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Declarations</em>'.
   * @see org.kevoree.modeling.metaModel.classDeclr#getDeclarations()
   * @see #getclassDeclr()
   * @generated
   */
  EAttribute getclassDeclr_Declarations();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MetaModelFactory getMetaModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.kevoree.modeling.metaModel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kevoree.modeling.metaModel.impl.ModelImpl
     * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__ANNOTATIONS = eINSTANCE.getModel_Annotations();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link org.kevoree.modeling.metaModel.impl.declImpl <em>decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kevoree.modeling.metaModel.impl.declImpl
     * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getdecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getdecl();

    /**
     * The meta object literal for the '{@link org.kevoree.modeling.metaModel.impl.classDeclrImpl <em>class Declr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kevoree.modeling.metaModel.impl.classDeclrImpl
     * @see org.kevoree.modeling.metaModel.impl.MetaModelPackageImpl#getclassDeclr()
     * @generated
     */
    EClass CLASS_DECLR = eINSTANCE.getclassDeclr();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLR__ANNOTATIONS = eINSTANCE.getclassDeclr_Annotations();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLR__DECLARATIONS = eINSTANCE.getclassDeclr_Declarations();

  }

} //MetaModelPackage
