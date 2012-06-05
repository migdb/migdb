/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mm.app.AppFactory
 * @model kind="package"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.collectionspro.eu/jam/mm/app";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = mm.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.app.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.ModelRootImpl
	 * @see mm.app.impl.AppPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Model Generations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__MODEL_GENERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OPERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mm.app.impl.ModelGenerationImpl <em>Model Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.ModelGenerationImpl
	 * @see mm.app.impl.AppPackageImpl#getModelGeneration()
	 * @generated
	 */
	int MODEL_GENERATION = 1;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION__MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION__IS_MISSING = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION__ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Model Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm.app.impl.ModelEntityImpl <em>Model Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.ModelEntityImpl
	 * @see mm.app.impl.AppPackageImpl#getModelEntity()
	 * @generated
	 */
	int MODEL_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Owning Generation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__OWNING_GENERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mm.app.impl.GeneralClassImpl <em>General Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.GeneralClassImpl
	 * @see mm.app.impl.AppPackageImpl#getGeneralClass()
	 * @generated
	 */
	int GENERAL_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Owning Generation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS__OWNING_GENERATION = MODEL_ENTITY__OWNING_GENERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS__NAME = MODEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS__PROPERTIES = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.app.impl.PrimitiveClassImpl <em>Primitive Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.PrimitiveClassImpl
	 * @see mm.app.impl.AppPackageImpl#getPrimitiveClass()
	 * @generated
	 */
	int PRIMITIVE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Owning Generation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CLASS__OWNING_GENERATION = MODEL_ENTITY__OWNING_GENERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CLASS__NAME = MODEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CLASS__PRIMITIVE_TYPE = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CLASS_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.app.impl.EmbeddedClassImpl <em>Embedded Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.EmbeddedClassImpl
	 * @see mm.app.impl.AppPackageImpl#getEmbeddedClass()
	 * @generated
	 */
	int EMBEDDED_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Owning Generation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_CLASS__OWNING_GENERATION = GENERAL_CLASS__OWNING_GENERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_CLASS__NAME = GENERAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_CLASS__PROPERTIES = GENERAL_CLASS__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Embedded Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_CLASS_FEATURE_COUNT = GENERAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm.app.impl.StandardClassImpl <em>Standard Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.StandardClassImpl
	 * @see mm.app.impl.AppPackageImpl#getStandardClass()
	 * @generated
	 */
	int STANDARD_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Owning Generation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__OWNING_GENERATION = GENERAL_CLASS__OWNING_GENERATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__NAME = GENERAL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__PROPERTIES = GENERAL_CLASS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__PARENT = GENERAL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__IS_ABSTRACT = GENERAL_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS__INHERITANCE_TYPE = GENERAL_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Standard Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CLASS_FEATURE_COUNT = GENERAL_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.impl.PropertyImpl
	 * @see mm.app.impl.AppPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Owning General Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_GENERAL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Opposite Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = 5;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = 6;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = 7;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ID = 9;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SEQUENCE_NAME = 10;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link mm.app.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.InheritanceType
	 * @see mm.app.impl.AppPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 8;

	/**
	 * The meta object id for the '{@link mm.app.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.PrimitiveType
	 * @see mm.app.impl.AppPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link mm.app.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see mm.app.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.app.ModelRoot#getModelGenerations <em>Model Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Generations</em>'.
	 * @see mm.app.ModelRoot#getModelGenerations()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ModelGenerations();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.app.ModelRoot#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see mm.app.ModelRoot#getOperations()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Operations();

	/**
	 * Returns the meta object for class '{@link mm.app.ModelGeneration <em>Model Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Generation</em>'.
	 * @see mm.app.ModelGeneration
	 * @generated
	 */
	EClass getModelGeneration();

	/**
	 * Returns the meta object for the container reference '{@link mm.app.ModelGeneration#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Root</em>'.
	 * @see mm.app.ModelGeneration#getModelRoot()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EReference getModelGeneration_ModelRoot();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ModelGeneration#isIsMissing <em>Is Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing</em>'.
	 * @see mm.app.ModelGeneration#isIsMissing()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EAttribute getModelGeneration_IsMissing();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.app.ModelGeneration#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see mm.app.ModelGeneration#getEntities()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EReference getModelGeneration_Entities();

	/**
	 * Returns the meta object for class '{@link mm.app.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Entity</em>'.
	 * @see mm.app.ModelEntity
	 * @generated
	 */
	EClass getModelEntity();

	/**
	 * Returns the meta object for the container reference '{@link mm.app.ModelEntity#getOwningGeneration <em>Owning Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Generation</em>'.
	 * @see mm.app.ModelEntity#getOwningGeneration()
	 * @see #getModelEntity()
	 * @generated
	 */
	EReference getModelEntity_OwningGeneration();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ModelEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ModelEntity#getName()
	 * @see #getModelEntity()
	 * @generated
	 */
	EAttribute getModelEntity_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.GeneralClass <em>General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Class</em>'.
	 * @see mm.app.GeneralClass
	 * @generated
	 */
	EClass getGeneralClass();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.app.GeneralClass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see mm.app.GeneralClass#getProperties()
	 * @see #getGeneralClass()
	 * @generated
	 */
	EReference getGeneralClass_Properties();

	/**
	 * Returns the meta object for class '{@link mm.app.PrimitiveClass <em>Primitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Class</em>'.
	 * @see mm.app.PrimitiveClass
	 * @generated
	 */
	EClass getPrimitiveClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.PrimitiveClass#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see mm.app.PrimitiveClass#getPrimitiveType()
	 * @see #getPrimitiveClass()
	 * @generated
	 */
	EAttribute getPrimitiveClass_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link mm.app.EmbeddedClass <em>Embedded Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Class</em>'.
	 * @see mm.app.EmbeddedClass
	 * @generated
	 */
	EClass getEmbeddedClass();

	/**
	 * Returns the meta object for class '{@link mm.app.StandardClass <em>Standard Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Class</em>'.
	 * @see mm.app.StandardClass
	 * @generated
	 */
	EClass getStandardClass();

	/**
	 * Returns the meta object for the reference '{@link mm.app.StandardClass#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see mm.app.StandardClass#getParent()
	 * @see #getStandardClass()
	 * @generated
	 */
	EReference getStandardClass_Parent();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.StandardClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm.app.StandardClass#isIsAbstract()
	 * @see #getStandardClass()
	 * @generated
	 */
	EAttribute getStandardClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.StandardClass#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance Type</em>'.
	 * @see mm.app.StandardClass#getInheritanceType()
	 * @see #getStandardClass()
	 * @generated
	 */
	EAttribute getStandardClass_InheritanceType();

	/**
	 * Returns the meta object for class '{@link mm.app.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see mm.app.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the container reference '{@link mm.app.Property#getOwningGeneralClass <em>Owning General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning General Class</em>'.
	 * @see mm.app.Property#getOwningGeneralClass()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningGeneralClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link mm.app.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mm.app.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.app.Property#getDefaultValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link mm.app.Property#getOppositeProperty <em>Opposite Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite Property</em>'.
	 * @see mm.app.Property#getOppositeProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OppositeProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mm.app.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mm.app.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see mm.app.Property#isIsOrdered()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see mm.app.Property#isIsUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#isIsID <em>Is ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ID</em>'.
	 * @see mm.app.Property#isIsID()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsID();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.Property#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see mm.app.Property#getSequenceName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_SequenceName();

	/**
	 * Returns the meta object for enum '{@link mm.app.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see mm.app.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link mm.app.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see mm.app.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm.app.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.ModelRootImpl
		 * @see mm.app.impl.AppPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Model Generations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__MODEL_GENERATIONS = eINSTANCE.getModelRoot_ModelGenerations();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__OPERATIONS = eINSTANCE.getModelRoot_Operations();

		/**
		 * The meta object literal for the '{@link mm.app.impl.ModelGenerationImpl <em>Model Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.ModelGenerationImpl
		 * @see mm.app.impl.AppPackageImpl#getModelGeneration()
		 * @generated
		 */
		EClass MODEL_GENERATION = eINSTANCE.getModelGeneration();

		/**
		 * The meta object literal for the '<em><b>Model Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_GENERATION__MODEL_ROOT = eINSTANCE.getModelGeneration_ModelRoot();

		/**
		 * The meta object literal for the '<em><b>Is Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_GENERATION__IS_MISSING = eINSTANCE.getModelGeneration_IsMissing();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_GENERATION__ENTITIES = eINSTANCE.getModelGeneration_Entities();

		/**
		 * The meta object literal for the '{@link mm.app.impl.ModelEntityImpl <em>Model Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.ModelEntityImpl
		 * @see mm.app.impl.AppPackageImpl#getModelEntity()
		 * @generated
		 */
		EClass MODEL_ENTITY = eINSTANCE.getModelEntity();

		/**
		 * The meta object literal for the '<em><b>Owning Generation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ENTITY__OWNING_GENERATION = eINSTANCE.getModelEntity_OwningGeneration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ENTITY__NAME = eINSTANCE.getModelEntity_Name();

		/**
		 * The meta object literal for the '{@link mm.app.impl.GeneralClassImpl <em>General Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.GeneralClassImpl
		 * @see mm.app.impl.AppPackageImpl#getGeneralClass()
		 * @generated
		 */
		EClass GENERAL_CLASS = eINSTANCE.getGeneralClass();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_CLASS__PROPERTIES = eINSTANCE.getGeneralClass_Properties();

		/**
		 * The meta object literal for the '{@link mm.app.impl.PrimitiveClassImpl <em>Primitive Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.PrimitiveClassImpl
		 * @see mm.app.impl.AppPackageImpl#getPrimitiveClass()
		 * @generated
		 */
		EClass PRIMITIVE_CLASS = eINSTANCE.getPrimitiveClass();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_CLASS__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveClass_PrimitiveType();

		/**
		 * The meta object literal for the '{@link mm.app.impl.EmbeddedClassImpl <em>Embedded Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.EmbeddedClassImpl
		 * @see mm.app.impl.AppPackageImpl#getEmbeddedClass()
		 * @generated
		 */
		EClass EMBEDDED_CLASS = eINSTANCE.getEmbeddedClass();

		/**
		 * The meta object literal for the '{@link mm.app.impl.StandardClassImpl <em>Standard Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.StandardClassImpl
		 * @see mm.app.impl.AppPackageImpl#getStandardClass()
		 * @generated
		 */
		EClass STANDARD_CLASS = eINSTANCE.getStandardClass();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_CLASS__PARENT = eINSTANCE.getStandardClass_Parent();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_CLASS__IS_ABSTRACT = eINSTANCE.getStandardClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Inheritance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_CLASS__INHERITANCE_TYPE = eINSTANCE.getStandardClass_InheritanceType();

		/**
		 * The meta object literal for the '{@link mm.app.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.impl.PropertyImpl
		 * @see mm.app.impl.AppPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Owning General Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_GENERAL_CLASS = eINSTANCE.getProperty_OwningGeneralClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT_VALUE = eINSTANCE.getProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Opposite Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPPOSITE_PROPERTY = eINSTANCE.getProperty_OppositeProperty();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ORDERED = eINSTANCE.getProperty_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_UNIQUE = eINSTANCE.getProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ID = eINSTANCE.getProperty_IsID();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__SEQUENCE_NAME = eINSTANCE.getProperty_SequenceName();

		/**
		 * The meta object literal for the '{@link mm.app.InheritanceType <em>Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.InheritanceType
		 * @see mm.app.impl.AppPackageImpl#getInheritanceType()
		 * @generated
		 */
		EEnum INHERITANCE_TYPE = eINSTANCE.getInheritanceType();

		/**
		 * The meta object literal for the '{@link mm.app.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.PrimitiveType
		 * @see mm.app.impl.AppPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //AppPackage
