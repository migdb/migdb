/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops;

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
 * @see mm.app.ops.OpsFactory
 * @model kind="package"
 * @generated
 */
public interface OpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ops";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.collectionspro.eu/jam/mm/app-ops";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app-ops";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpsPackage eINSTANCE = mm.app.ops.impl.OpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.ModelOperationImpl <em>Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.ModelOperationImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getModelOperation()
	 * @generated
	 */
	int MODEL_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION__MODEL_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.AddPrimitiveClassImpl <em>Add Primitive Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.AddPrimitiveClassImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getAddPrimitiveClass()
	 * @generated
	 */
	int ADD_PRIMITIVE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_CLASS__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_CLASS__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_CLASS__PRIMITIVE_TYPE = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Primitive Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_CLASS_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.AddEmbeddedClassImpl <em>Add Embedded Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.AddEmbeddedClassImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getAddEmbeddedClass()
	 * @generated
	 */
	int ADD_EMBEDDED_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EMBEDDED_CLASS__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EMBEDDED_CLASS__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Embedded Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EMBEDDED_CLASS_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.AddClassImpl <em>Add Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.AddClassImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getAddClass()
	 * @generated
	 */
	int ADD_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__IS_ABSTRACT = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inheritance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__INHERITANCE_TYPE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.RenameEntityImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getRenameEntity()
	 * @generated
	 */
	int RENAME_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY__NEW_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_ENTITY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetParentImpl <em>Set Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetParentImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetParent()
	 * @generated
	 */
	int SET_PARENT = 5;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT__PARENT_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT__PROPERTIES = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetAbstractImpl <em>Set Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetAbstractImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetAbstract()
	 * @generated
	 */
	int SET_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ABSTRACT__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ABSTRACT__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ABSTRACT__IS_ABSTRACT = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ABSTRACT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.RemoveEntityImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getRemoveEntity()
	 * @generated
	 */
	int REMOVE_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.AddPropertyImpl <em>Add Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.AddPropertyImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getAddProperty()
	 * @generated
	 */
	int ADD_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__TYPE = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__DEFAULT_VALUE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__LOWER_BOUND = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__UPPER_BOUND = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__IS_ORDERED = MODEL_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__IS_UNIQUE = MODEL_OPERATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Column Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__COLUMN_NAME_PATTERN = MODEL_OPERATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY__SEQUENCE_NAME = MODEL_OPERATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Add Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PROPERTY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.RenamePropertyImpl <em>Rename Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.RenamePropertyImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getRenameProperty()
	 * @generated
	 */
	int RENAME_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PROPERTY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PROPERTY__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PROPERTY__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PROPERTY__NEW_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rename Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_PROPERTY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.RemovePropertyImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getRemoveProperty()
	 * @generated
	 */
	int REMOVE_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PROPERTY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetTypeImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TYPE = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetOppositeImpl <em>Set Opposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetOppositeImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetOpposite()
	 * @generated
	 */
	int SET_OPPOSITE = 12;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>First Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__FIRST_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__FIRST_PROPERTY_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__SECOND_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__SECOND_PROPERTY_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE__IS_OPPOSITE = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Set Opposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPPOSITE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetBoundriesImpl <em>Set Boundries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetBoundriesImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetBoundries()
	 * @generated
	 */
	int SET_BOUNDRIES = 13;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES__LOWER_BOUND = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES__UPPER_BOUND = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Boundries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BOUNDRIES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetOrderedImpl <em>Set Ordered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetOrderedImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetOrdered()
	 * @generated
	 */
	int SET_ORDERED = 14;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ORDERED__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ORDERED__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ORDERED__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ORDERED__IS_ORDERED = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Ordered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ORDERED_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.SetUniqueImpl <em>Set Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.SetUniqueImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getSetUnique()
	 * @generated
	 */
	int SET_UNIQUE = 15;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_UNIQUE__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_UNIQUE__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_UNIQUE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_UNIQUE__IS_UNIQUE = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_UNIQUE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.CopyPropertyImpl <em>Copy Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.CopyPropertyImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getCopyProperty()
	 * @generated
	 */
	int COPY_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY__TARGET_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY__TYPE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Copy Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_PROPERTY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.MovePropertyImpl <em>Move Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.MovePropertyImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getMoveProperty()
	 * @generated
	 */
	int MOVE_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY__OWNING_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY__TARGET_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY__TYPE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Move Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_PROPERTY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.ExtractClassImpl <em>Extract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.ExtractClassImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getExtractClass()
	 * @generated
	 */
	int EXTRACT_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__SOURCE_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extract Properties Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extract Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS__EXTRACT_CLASS_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_CLASS_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.impl.ExtractParentImpl <em>Extract Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.impl.ExtractParentImpl
	 * @see mm.app.ops.impl.OpsPackageImpl#getExtractParent()
	 * @generated
	 */
	int EXTRACT_PARENT = 19;

	/**
	 * The feature id for the '<em><b>Model Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_PARENT__MODEL_ROOT = MODEL_OPERATION__MODEL_ROOT;

	/**
	 * The feature id for the '<em><b>Source Classes Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_PARENT__SOURCE_CLASSES_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extract Properties Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extract Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_PARENT__EXTRACT_PARENT_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extract Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_PARENT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.app.ops.MergeType <em>Merge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.ops.MergeType
	 * @see mm.app.ops.impl.OpsPackageImpl#getMergeType()
	 * @generated
	 */
	int MERGE_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link mm.app.ops.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Operation</em>'.
	 * @see mm.app.ops.ModelOperation
	 * @generated
	 */
	EClass getModelOperation();

	/**
	 * Returns the meta object for the container reference '{@link mm.app.ops.ModelOperation#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Root</em>'.
	 * @see mm.app.ops.ModelOperation#getModelRoot()
	 * @see #getModelOperation()
	 * @generated
	 */
	EReference getModelOperation_ModelRoot();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.AddPrimitiveClass <em>Add Primitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primitive Class</em>'.
	 * @see mm.app.ops.AddPrimitiveClass
	 * @generated
	 */
	EClass getAddPrimitiveClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddPrimitiveClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.AddPrimitiveClass#getName()
	 * @see #getAddPrimitiveClass()
	 * @generated
	 */
	EAttribute getAddPrimitiveClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddPrimitiveClass#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see mm.app.ops.AddPrimitiveClass#getPrimitiveType()
	 * @see #getAddPrimitiveClass()
	 * @generated
	 */
	EAttribute getAddPrimitiveClass_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.AddEmbeddedClass <em>Add Embedded Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Embedded Class</em>'.
	 * @see mm.app.ops.AddEmbeddedClass
	 * @generated
	 */
	EClass getAddEmbeddedClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddEmbeddedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.AddEmbeddedClass#getName()
	 * @see #getAddEmbeddedClass()
	 * @generated
	 */
	EAttribute getAddEmbeddedClass_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.AddClass <em>Add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Class</em>'.
	 * @see mm.app.ops.AddClass
	 * @generated
	 */
	EClass getAddClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.AddClass#getName()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm.app.ops.AddClass#isIsAbstract()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddClass#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see mm.app.ops.AddClass#getTableName()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_TableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddClass#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance Type</em>'.
	 * @see mm.app.ops.AddClass#getInheritanceType()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_InheritanceType();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Entity</em>'.
	 * @see mm.app.ops.RenameEntity
	 * @generated
	 */
	EClass getRenameEntity();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RenameEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.RenameEntity#getName()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EAttribute getRenameEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RenameEntity#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.app.ops.RenameEntity#getNewName()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EAttribute getRenameEntity_NewName();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetParent <em>Set Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Parent</em>'.
	 * @see mm.app.ops.SetParent
	 * @generated
	 */
	EClass getSetParent();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetParent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetParent#getName()
	 * @see #getSetParent()
	 * @generated
	 */
	EAttribute getSetParent_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetParent#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see mm.app.ops.SetParent#getParentName()
	 * @see #getSetParent()
	 * @generated
	 */
	EAttribute getSetParent_ParentName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.app.ops.SetParent#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties</em>'.
	 * @see mm.app.ops.SetParent#getProperties()
	 * @see #getSetParent()
	 * @generated
	 */
	EAttribute getSetParent_Properties();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetAbstract <em>Set Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Abstract</em>'.
	 * @see mm.app.ops.SetAbstract
	 * @generated
	 */
	EClass getSetAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetAbstract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetAbstract#getName()
	 * @see #getSetAbstract()
	 * @generated
	 */
	EAttribute getSetAbstract_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetAbstract#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm.app.ops.SetAbstract#isIsAbstract()
	 * @see #getSetAbstract()
	 * @generated
	 */
	EAttribute getSetAbstract_IsAbstract();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Entity</em>'.
	 * @see mm.app.ops.RemoveEntity
	 * @generated
	 */
	EClass getRemoveEntity();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RemoveEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.RemoveEntity#getName()
	 * @see #getRemoveEntity()
	 * @generated
	 */
	EAttribute getRemoveEntity_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.AddProperty <em>Add Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Property</em>'.
	 * @see mm.app.ops.AddProperty
	 * @generated
	 */
	EClass getAddProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.AddProperty#getOwningClassName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.AddProperty#getName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.ops.AddProperty#getType()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.app.ops.AddProperty#getDefaultValue()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mm.app.ops.AddProperty#getLowerBound()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mm.app.ops.AddProperty#getUpperBound()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see mm.app.ops.AddProperty#isIsOrdered()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see mm.app.ops.AddProperty#isIsUnique()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see mm.app.ops.AddProperty#getColumnName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getColumnNamePattern <em>Column Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name Pattern</em>'.
	 * @see mm.app.ops.AddProperty#getColumnNamePattern()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_ColumnNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.AddProperty#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see mm.app.ops.AddProperty#getSequenceName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_SequenceName();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.RenameProperty <em>Rename Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Property</em>'.
	 * @see mm.app.ops.RenameProperty
	 * @generated
	 */
	EClass getRenameProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RenameProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.RenameProperty#getOwningClassName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RenameProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.RenameProperty#getName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RenameProperty#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.app.ops.RenameProperty#getNewName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_NewName();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.RemoveProperty <em>Remove Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Property</em>'.
	 * @see mm.app.ops.RemoveProperty
	 * @generated
	 */
	EClass getRemoveProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RemoveProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.RemoveProperty#getOwningClassName()
	 * @see #getRemoveProperty()
	 * @generated
	 */
	EAttribute getRemoveProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.RemoveProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.RemoveProperty#getName()
	 * @see #getRemoveProperty()
	 * @generated
	 */
	EAttribute getRemoveProperty_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see mm.app.ops.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetType#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.SetType#getOwningClassName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetType#getName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.ops.SetType#getType()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetOpposite <em>Set Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Opposite</em>'.
	 * @see mm.app.ops.SetOpposite
	 * @generated
	 */
	EClass getSetOpposite();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOpposite#getFirstClassName <em>First Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Class Name</em>'.
	 * @see mm.app.ops.SetOpposite#getFirstClassName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_FirstClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOpposite#getFirstPropertyName <em>First Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Property Name</em>'.
	 * @see mm.app.ops.SetOpposite#getFirstPropertyName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_FirstPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOpposite#getSecondClassName <em>Second Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Class Name</em>'.
	 * @see mm.app.ops.SetOpposite#getSecondClassName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_SecondClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOpposite#getSecondPropertyName <em>Second Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Property Name</em>'.
	 * @see mm.app.ops.SetOpposite#getSecondPropertyName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_SecondPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOpposite#isIsOpposite <em>Is Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Opposite</em>'.
	 * @see mm.app.ops.SetOpposite#isIsOpposite()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_IsOpposite();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetBoundries <em>Set Boundries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Boundries</em>'.
	 * @see mm.app.ops.SetBoundries
	 * @generated
	 */
	EClass getSetBoundries();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetBoundries#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.SetBoundries#getOwningClassName()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetBoundries#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetBoundries#getName()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetBoundries#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mm.app.ops.SetBoundries#getLowerBound()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetBoundries#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mm.app.ops.SetBoundries#getUpperBound()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_UpperBound();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetOrdered <em>Set Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Ordered</em>'.
	 * @see mm.app.ops.SetOrdered
	 * @generated
	 */
	EClass getSetOrdered();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOrdered#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.SetOrdered#getOwningClassName()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOrdered#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetOrdered#getName()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetOrdered#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see mm.app.ops.SetOrdered#isIsOrdered()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_IsOrdered();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.SetUnique <em>Set Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Unique</em>'.
	 * @see mm.app.ops.SetUnique
	 * @generated
	 */
	EClass getSetUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetUnique#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.SetUnique#getOwningClassName()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetUnique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.SetUnique#getName()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.SetUnique#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see mm.app.ops.SetUnique#isIsUnique()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_IsUnique();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.CopyProperty <em>Copy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Property</em>'.
	 * @see mm.app.ops.CopyProperty
	 * @generated
	 */
	EClass getCopyProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.CopyProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.CopyProperty#getOwningClassName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.CopyProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.CopyProperty#getName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.CopyProperty#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see mm.app.ops.CopyProperty#getTargetClassName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.CopyProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.ops.CopyProperty#getType()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.MoveProperty <em>Move Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Property</em>'.
	 * @see mm.app.ops.MoveProperty
	 * @generated
	 */
	EClass getMoveProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.MoveProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.ops.MoveProperty#getOwningClassName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.MoveProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.ops.MoveProperty#getName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.MoveProperty#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see mm.app.ops.MoveProperty#getTargetClassName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.MoveProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.ops.MoveProperty#getType()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Class</em>'.
	 * @see mm.app.ops.ExtractClass
	 * @generated
	 */
	EClass getExtractClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.ExtractClass#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see mm.app.ops.ExtractClass#getSourceClassName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_SourceClassName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.app.ops.ExtractClass#getExtractPropertiesNames <em>Extract Properties Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extract Properties Names</em>'.
	 * @see mm.app.ops.ExtractClass#getExtractPropertiesNames()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_ExtractPropertiesNames();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.ExtractClass#getExtractClassName <em>Extract Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extract Class Name</em>'.
	 * @see mm.app.ops.ExtractClass#getExtractClassName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_ExtractClassName();

	/**
	 * Returns the meta object for class '{@link mm.app.ops.ExtractParent <em>Extract Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Parent</em>'.
	 * @see mm.app.ops.ExtractParent
	 * @generated
	 */
	EClass getExtractParent();

	/**
	 * Returns the meta object for the attribute list '{@link mm.app.ops.ExtractParent#getSourceClassesName <em>Source Classes Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source Classes Name</em>'.
	 * @see mm.app.ops.ExtractParent#getSourceClassesName()
	 * @see #getExtractParent()
	 * @generated
	 */
	EAttribute getExtractParent_SourceClassesName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.app.ops.ExtractParent#getExtractPropertiesName <em>Extract Properties Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extract Properties Name</em>'.
	 * @see mm.app.ops.ExtractParent#getExtractPropertiesName()
	 * @see #getExtractParent()
	 * @generated
	 */
	EAttribute getExtractParent_ExtractPropertiesName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.ops.ExtractParent#getExtractParentName <em>Extract Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extract Parent Name</em>'.
	 * @see mm.app.ops.ExtractParent#getExtractParentName()
	 * @see #getExtractParent()
	 * @generated
	 */
	EAttribute getExtractParent_ExtractParentName();

	/**
	 * Returns the meta object for enum '{@link mm.app.ops.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Type</em>'.
	 * @see mm.app.ops.MergeType
	 * @generated
	 */
	EEnum getMergeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpsFactory getOpsFactory();

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
		 * The meta object literal for the '{@link mm.app.ops.impl.ModelOperationImpl <em>Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.ModelOperationImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getModelOperation()
		 * @generated
		 */
		EClass MODEL_OPERATION = eINSTANCE.getModelOperation();

		/**
		 * The meta object literal for the '<em><b>Model Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OPERATION__MODEL_ROOT = eINSTANCE.getModelOperation_ModelRoot();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.AddPrimitiveClassImpl <em>Add Primitive Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.AddPrimitiveClassImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getAddPrimitiveClass()
		 * @generated
		 */
		EClass ADD_PRIMITIVE_CLASS = eINSTANCE.getAddPrimitiveClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_CLASS__NAME = eINSTANCE.getAddPrimitiveClass_Name();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_CLASS__PRIMITIVE_TYPE = eINSTANCE.getAddPrimitiveClass_PrimitiveType();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.AddEmbeddedClassImpl <em>Add Embedded Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.AddEmbeddedClassImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getAddEmbeddedClass()
		 * @generated
		 */
		EClass ADD_EMBEDDED_CLASS = eINSTANCE.getAddEmbeddedClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_EMBEDDED_CLASS__NAME = eINSTANCE.getAddEmbeddedClass_Name();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.AddClassImpl <em>Add Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.AddClassImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getAddClass()
		 * @generated
		 */
		EClass ADD_CLASS = eINSTANCE.getAddClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CLASS__NAME = eINSTANCE.getAddClass_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CLASS__IS_ABSTRACT = eINSTANCE.getAddClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CLASS__TABLE_NAME = eINSTANCE.getAddClass_TableName();

		/**
		 * The meta object literal for the '<em><b>Inheritance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CLASS__INHERITANCE_TYPE = eINSTANCE.getAddClass_InheritanceType();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.RenameEntityImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getRenameEntity()
		 * @generated
		 */
		EClass RENAME_ENTITY = eINSTANCE.getRenameEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ENTITY__NAME = eINSTANCE.getRenameEntity_Name();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_ENTITY__NEW_NAME = eINSTANCE.getRenameEntity_NewName();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetParentImpl <em>Set Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetParentImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetParent()
		 * @generated
		 */
		EClass SET_PARENT = eINSTANCE.getSetParent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARENT__NAME = eINSTANCE.getSetParent_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARENT__PARENT_NAME = eINSTANCE.getSetParent_ParentName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARENT__PROPERTIES = eINSTANCE.getSetParent_Properties();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetAbstractImpl <em>Set Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetAbstractImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetAbstract()
		 * @generated
		 */
		EClass SET_ABSTRACT = eINSTANCE.getSetAbstract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ABSTRACT__NAME = eINSTANCE.getSetAbstract_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ABSTRACT__IS_ABSTRACT = eINSTANCE.getSetAbstract_IsAbstract();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.RemoveEntityImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getRemoveEntity()
		 * @generated
		 */
		EClass REMOVE_ENTITY = eINSTANCE.getRemoveEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_ENTITY__NAME = eINSTANCE.getRemoveEntity_Name();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.AddPropertyImpl <em>Add Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.AddPropertyImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getAddProperty()
		 * @generated
		 */
		EClass ADD_PROPERTY = eINSTANCE.getAddProperty();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__OWNING_CLASS_NAME = eINSTANCE.getAddProperty_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__NAME = eINSTANCE.getAddProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__TYPE = eINSTANCE.getAddProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__DEFAULT_VALUE = eINSTANCE.getAddProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__LOWER_BOUND = eINSTANCE.getAddProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__UPPER_BOUND = eINSTANCE.getAddProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__IS_ORDERED = eINSTANCE.getAddProperty_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__IS_UNIQUE = eINSTANCE.getAddProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__COLUMN_NAME = eINSTANCE.getAddProperty_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Column Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__COLUMN_NAME_PATTERN = eINSTANCE.getAddProperty_ColumnNamePattern();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PROPERTY__SEQUENCE_NAME = eINSTANCE.getAddProperty_SequenceName();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.RenamePropertyImpl <em>Rename Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.RenamePropertyImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getRenameProperty()
		 * @generated
		 */
		EClass RENAME_PROPERTY = eINSTANCE.getRenameProperty();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_PROPERTY__OWNING_CLASS_NAME = eINSTANCE.getRenameProperty_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_PROPERTY__NAME = eINSTANCE.getRenameProperty_Name();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_PROPERTY__NEW_NAME = eINSTANCE.getRenameProperty_NewName();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.RemovePropertyImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getRemoveProperty()
		 * @generated
		 */
		EClass REMOVE_PROPERTY = eINSTANCE.getRemoveProperty();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_PROPERTY__OWNING_CLASS_NAME = eINSTANCE.getRemoveProperty_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_PROPERTY__NAME = eINSTANCE.getRemoveProperty_Name();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetTypeImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__OWNING_CLASS_NAME = eINSTANCE.getSetType_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__NAME = eINSTANCE.getSetType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__TYPE = eINSTANCE.getSetType_Type();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetOppositeImpl <em>Set Opposite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetOppositeImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetOpposite()
		 * @generated
		 */
		EClass SET_OPPOSITE = eINSTANCE.getSetOpposite();

		/**
		 * The meta object literal for the '<em><b>First Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPPOSITE__FIRST_CLASS_NAME = eINSTANCE.getSetOpposite_FirstClassName();

		/**
		 * The meta object literal for the '<em><b>First Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPPOSITE__FIRST_PROPERTY_NAME = eINSTANCE.getSetOpposite_FirstPropertyName();

		/**
		 * The meta object literal for the '<em><b>Second Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPPOSITE__SECOND_CLASS_NAME = eINSTANCE.getSetOpposite_SecondClassName();

		/**
		 * The meta object literal for the '<em><b>Second Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPPOSITE__SECOND_PROPERTY_NAME = eINSTANCE.getSetOpposite_SecondPropertyName();

		/**
		 * The meta object literal for the '<em><b>Is Opposite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPPOSITE__IS_OPPOSITE = eINSTANCE.getSetOpposite_IsOpposite();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetBoundriesImpl <em>Set Boundries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetBoundriesImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetBoundries()
		 * @generated
		 */
		EClass SET_BOUNDRIES = eINSTANCE.getSetBoundries();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BOUNDRIES__OWNING_CLASS_NAME = eINSTANCE.getSetBoundries_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BOUNDRIES__NAME = eINSTANCE.getSetBoundries_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BOUNDRIES__LOWER_BOUND = eINSTANCE.getSetBoundries_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BOUNDRIES__UPPER_BOUND = eINSTANCE.getSetBoundries_UpperBound();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetOrderedImpl <em>Set Ordered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetOrderedImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetOrdered()
		 * @generated
		 */
		EClass SET_ORDERED = eINSTANCE.getSetOrdered();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ORDERED__OWNING_CLASS_NAME = eINSTANCE.getSetOrdered_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ORDERED__NAME = eINSTANCE.getSetOrdered_Name();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ORDERED__IS_ORDERED = eINSTANCE.getSetOrdered_IsOrdered();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.SetUniqueImpl <em>Set Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.SetUniqueImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getSetUnique()
		 * @generated
		 */
		EClass SET_UNIQUE = eINSTANCE.getSetUnique();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_UNIQUE__OWNING_CLASS_NAME = eINSTANCE.getSetUnique_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_UNIQUE__NAME = eINSTANCE.getSetUnique_Name();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_UNIQUE__IS_UNIQUE = eINSTANCE.getSetUnique_IsUnique();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.CopyPropertyImpl <em>Copy Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.CopyPropertyImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getCopyProperty()
		 * @generated
		 */
		EClass COPY_PROPERTY = eINSTANCE.getCopyProperty();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_PROPERTY__OWNING_CLASS_NAME = eINSTANCE.getCopyProperty_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_PROPERTY__NAME = eINSTANCE.getCopyProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_PROPERTY__TARGET_CLASS_NAME = eINSTANCE.getCopyProperty_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_PROPERTY__TYPE = eINSTANCE.getCopyProperty_Type();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.MovePropertyImpl <em>Move Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.MovePropertyImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getMoveProperty()
		 * @generated
		 */
		EClass MOVE_PROPERTY = eINSTANCE.getMoveProperty();

		/**
		 * The meta object literal for the '<em><b>Owning Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PROPERTY__OWNING_CLASS_NAME = eINSTANCE.getMoveProperty_OwningClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PROPERTY__NAME = eINSTANCE.getMoveProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PROPERTY__TARGET_CLASS_NAME = eINSTANCE.getMoveProperty_TargetClassName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_PROPERTY__TYPE = eINSTANCE.getMoveProperty_Type();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.ExtractClassImpl <em>Extract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.ExtractClassImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getExtractClass()
		 * @generated
		 */
		EClass EXTRACT_CLASS = eINSTANCE.getExtractClass();

		/**
		 * The meta object literal for the '<em><b>Source Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__SOURCE_CLASS_NAME = eINSTANCE.getExtractClass_SourceClassName();

		/**
		 * The meta object literal for the '<em><b>Extract Properties Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES = eINSTANCE.getExtractClass_ExtractPropertiesNames();

		/**
		 * The meta object literal for the '<em><b>Extract Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_CLASS__EXTRACT_CLASS_NAME = eINSTANCE.getExtractClass_ExtractClassName();

		/**
		 * The meta object literal for the '{@link mm.app.ops.impl.ExtractParentImpl <em>Extract Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.impl.ExtractParentImpl
		 * @see mm.app.ops.impl.OpsPackageImpl#getExtractParent()
		 * @generated
		 */
		EClass EXTRACT_PARENT = eINSTANCE.getExtractParent();

		/**
		 * The meta object literal for the '<em><b>Source Classes Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_PARENT__SOURCE_CLASSES_NAME = eINSTANCE.getExtractParent_SourceClassesName();

		/**
		 * The meta object literal for the '<em><b>Extract Properties Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME = eINSTANCE.getExtractParent_ExtractPropertiesName();

		/**
		 * The meta object literal for the '<em><b>Extract Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_PARENT__EXTRACT_PARENT_NAME = eINSTANCE.getExtractParent_ExtractParentName();

		/**
		 * The meta object literal for the '{@link mm.app.ops.MergeType <em>Merge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.ops.MergeType
		 * @see mm.app.ops.impl.OpsPackageImpl#getMergeType()
		 * @generated
		 */
		EEnum MERGE_TYPE = eINSTANCE.getMergeType();

	}

} //OpsPackage
