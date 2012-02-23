/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;

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
 * @see mm.app.operations.OperationsFactory
 * @model kind="package"
 * @generated
 */
public interface OperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operations";

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
	OperationsPackage eINSTANCE = mm.app.operations.impl.OperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.app.operations.impl.ModelOperationImpl <em>Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.ModelOperationImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getModelOperation()
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
	 * The meta object id for the '{@link mm.app.operations.impl.AddPrimitiveClassImpl <em>Add Primitive Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.AddPrimitiveClassImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getAddPrimitiveClass()
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
	 * The meta object id for the '{@link mm.app.operations.impl.AddEmbeddedClassImpl <em>Add Embedded Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.AddEmbeddedClassImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getAddEmbeddedClass()
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
	 * The meta object id for the '{@link mm.app.operations.impl.AddClassImpl <em>Add Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.AddClassImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getAddClass()
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
	 * The meta object id for the '{@link mm.app.operations.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.RenameEntityImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getRenameEntity()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetParentImpl <em>Set Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetParentImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetParent()
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
	 * The number of structural features of the '<em>Set Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARENT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.app.operations.impl.SetAbstractImpl <em>Set Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetAbstractImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetAbstract()
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
	 * The meta object id for the '{@link mm.app.operations.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.RemoveEntityImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getRemoveEntity()
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
	 * The meta object id for the '{@link mm.app.operations.impl.AddPropertyImpl <em>Add Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.AddPropertyImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getAddProperty()
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
	 * The meta object id for the '{@link mm.app.operations.impl.RenamePropertyImpl <em>Rename Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.RenamePropertyImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getRenameProperty()
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
	 * The meta object id for the '{@link mm.app.operations.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.RemovePropertyImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getRemoveProperty()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetTypeImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetType()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetOppositeImpl <em>Set Opposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetOppositeImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetOpposite()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetBoundriesImpl <em>Set Boundries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetBoundriesImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetBoundries()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetOrderedImpl <em>Set Ordered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetOrderedImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetOrdered()
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
	 * The meta object id for the '{@link mm.app.operations.impl.SetUniqueImpl <em>Set Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.SetUniqueImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getSetUnique()
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
	 * The meta object id for the '{@link mm.app.operations.impl.CopyPropertyImpl <em>Copy Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.CopyPropertyImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getCopyProperty()
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
	 * The meta object id for the '{@link mm.app.operations.impl.MovePropertyImpl <em>Move Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.MovePropertyImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getMoveProperty()
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
	 * The meta object id for the '{@link mm.app.operations.impl.ExtractClassImpl <em>Extract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.impl.ExtractClassImpl
	 * @see mm.app.operations.impl.OperationsPackageImpl#getExtractClass()
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
	 * The meta object id for the '{@link mm.app.operations.MergeType <em>Merge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.app.operations.MergeType
	 * @see mm.app.operations.impl.OperationsPackageImpl#getMergeType()
	 * @generated
	 */
	int MERGE_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link mm.app.operations.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Operation</em>'.
	 * @see mm.app.operations.ModelOperation
	 * @generated
	 */
	EClass getModelOperation();

	/**
	 * Returns the meta object for the container reference '{@link mm.app.operations.ModelOperation#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Root</em>'.
	 * @see mm.app.operations.ModelOperation#getModelRoot()
	 * @see #getModelOperation()
	 * @generated
	 */
	EReference getModelOperation_ModelRoot();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.AddPrimitiveClass <em>Add Primitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primitive Class</em>'.
	 * @see mm.app.operations.AddPrimitiveClass
	 * @generated
	 */
	EClass getAddPrimitiveClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddPrimitiveClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.AddPrimitiveClass#getName()
	 * @see #getAddPrimitiveClass()
	 * @generated
	 */
	EAttribute getAddPrimitiveClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddPrimitiveClass#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see mm.app.operations.AddPrimitiveClass#getPrimitiveType()
	 * @see #getAddPrimitiveClass()
	 * @generated
	 */
	EAttribute getAddPrimitiveClass_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.AddEmbeddedClass <em>Add Embedded Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Embedded Class</em>'.
	 * @see mm.app.operations.AddEmbeddedClass
	 * @generated
	 */
	EClass getAddEmbeddedClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddEmbeddedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.AddEmbeddedClass#getName()
	 * @see #getAddEmbeddedClass()
	 * @generated
	 */
	EAttribute getAddEmbeddedClass_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.AddClass <em>Add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Class</em>'.
	 * @see mm.app.operations.AddClass
	 * @generated
	 */
	EClass getAddClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.AddClass#getName()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm.app.operations.AddClass#isIsAbstract()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddClass#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see mm.app.operations.AddClass#getTableName()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_TableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddClass#getInheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance Type</em>'.
	 * @see mm.app.operations.AddClass#getInheritanceType()
	 * @see #getAddClass()
	 * @generated
	 */
	EAttribute getAddClass_InheritanceType();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Entity</em>'.
	 * @see mm.app.operations.RenameEntity
	 * @generated
	 */
	EClass getRenameEntity();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RenameEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.RenameEntity#getName()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EAttribute getRenameEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RenameEntity#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.app.operations.RenameEntity#getNewName()
	 * @see #getRenameEntity()
	 * @generated
	 */
	EAttribute getRenameEntity_NewName();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetParent <em>Set Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Parent</em>'.
	 * @see mm.app.operations.SetParent
	 * @generated
	 */
	EClass getSetParent();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetParent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetParent#getName()
	 * @see #getSetParent()
	 * @generated
	 */
	EAttribute getSetParent_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetParent#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see mm.app.operations.SetParent#getParentName()
	 * @see #getSetParent()
	 * @generated
	 */
	EAttribute getSetParent_ParentName();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetAbstract <em>Set Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Abstract</em>'.
	 * @see mm.app.operations.SetAbstract
	 * @generated
	 */
	EClass getSetAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetAbstract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetAbstract#getName()
	 * @see #getSetAbstract()
	 * @generated
	 */
	EAttribute getSetAbstract_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetAbstract#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm.app.operations.SetAbstract#isIsAbstract()
	 * @see #getSetAbstract()
	 * @generated
	 */
	EAttribute getSetAbstract_IsAbstract();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Entity</em>'.
	 * @see mm.app.operations.RemoveEntity
	 * @generated
	 */
	EClass getRemoveEntity();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RemoveEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.RemoveEntity#getName()
	 * @see #getRemoveEntity()
	 * @generated
	 */
	EAttribute getRemoveEntity_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.AddProperty <em>Add Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Property</em>'.
	 * @see mm.app.operations.AddProperty
	 * @generated
	 */
	EClass getAddProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.AddProperty#getOwningClassName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.AddProperty#getName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.operations.AddProperty#getType()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.app.operations.AddProperty#getDefaultValue()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mm.app.operations.AddProperty#getLowerBound()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mm.app.operations.AddProperty#getUpperBound()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see mm.app.operations.AddProperty#isIsOrdered()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see mm.app.operations.AddProperty#isIsUnique()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see mm.app.operations.AddProperty#getColumnName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getColumnNamePattern <em>Column Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name Pattern</em>'.
	 * @see mm.app.operations.AddProperty#getColumnNamePattern()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_ColumnNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.AddProperty#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see mm.app.operations.AddProperty#getSequenceName()
	 * @see #getAddProperty()
	 * @generated
	 */
	EAttribute getAddProperty_SequenceName();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.RenameProperty <em>Rename Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Property</em>'.
	 * @see mm.app.operations.RenameProperty
	 * @generated
	 */
	EClass getRenameProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RenameProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.RenameProperty#getOwningClassName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RenameProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.RenameProperty#getName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RenameProperty#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.app.operations.RenameProperty#getNewName()
	 * @see #getRenameProperty()
	 * @generated
	 */
	EAttribute getRenameProperty_NewName();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.RemoveProperty <em>Remove Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Property</em>'.
	 * @see mm.app.operations.RemoveProperty
	 * @generated
	 */
	EClass getRemoveProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RemoveProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.RemoveProperty#getOwningClassName()
	 * @see #getRemoveProperty()
	 * @generated
	 */
	EAttribute getRemoveProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.RemoveProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.RemoveProperty#getName()
	 * @see #getRemoveProperty()
	 * @generated
	 */
	EAttribute getRemoveProperty_Name();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see mm.app.operations.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetType#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.SetType#getOwningClassName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetType#getName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.operations.SetType#getType()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetOpposite <em>Set Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Opposite</em>'.
	 * @see mm.app.operations.SetOpposite
	 * @generated
	 */
	EClass getSetOpposite();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOpposite#getFirstClassName <em>First Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Class Name</em>'.
	 * @see mm.app.operations.SetOpposite#getFirstClassName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_FirstClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOpposite#getFirstPropertyName <em>First Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Property Name</em>'.
	 * @see mm.app.operations.SetOpposite#getFirstPropertyName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_FirstPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOpposite#getSecondClassName <em>Second Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Class Name</em>'.
	 * @see mm.app.operations.SetOpposite#getSecondClassName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_SecondClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOpposite#getSecondPropertyName <em>Second Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Property Name</em>'.
	 * @see mm.app.operations.SetOpposite#getSecondPropertyName()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_SecondPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOpposite#isIsOpposite <em>Is Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Opposite</em>'.
	 * @see mm.app.operations.SetOpposite#isIsOpposite()
	 * @see #getSetOpposite()
	 * @generated
	 */
	EAttribute getSetOpposite_IsOpposite();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetBoundries <em>Set Boundries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Boundries</em>'.
	 * @see mm.app.operations.SetBoundries
	 * @generated
	 */
	EClass getSetBoundries();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetBoundries#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.SetBoundries#getOwningClassName()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetBoundries#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetBoundries#getName()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetBoundries#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mm.app.operations.SetBoundries#getLowerBound()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetBoundries#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mm.app.operations.SetBoundries#getUpperBound()
	 * @see #getSetBoundries()
	 * @generated
	 */
	EAttribute getSetBoundries_UpperBound();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetOrdered <em>Set Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Ordered</em>'.
	 * @see mm.app.operations.SetOrdered
	 * @generated
	 */
	EClass getSetOrdered();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOrdered#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.SetOrdered#getOwningClassName()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOrdered#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetOrdered#getName()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetOrdered#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see mm.app.operations.SetOrdered#isIsOrdered()
	 * @see #getSetOrdered()
	 * @generated
	 */
	EAttribute getSetOrdered_IsOrdered();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.SetUnique <em>Set Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Unique</em>'.
	 * @see mm.app.operations.SetUnique
	 * @generated
	 */
	EClass getSetUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetUnique#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.SetUnique#getOwningClassName()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetUnique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.SetUnique#getName()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.SetUnique#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see mm.app.operations.SetUnique#isIsUnique()
	 * @see #getSetUnique()
	 * @generated
	 */
	EAttribute getSetUnique_IsUnique();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.CopyProperty <em>Copy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Property</em>'.
	 * @see mm.app.operations.CopyProperty
	 * @generated
	 */
	EClass getCopyProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.CopyProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.CopyProperty#getOwningClassName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.CopyProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.CopyProperty#getName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.CopyProperty#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see mm.app.operations.CopyProperty#getTargetClassName()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.CopyProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.operations.CopyProperty#getType()
	 * @see #getCopyProperty()
	 * @generated
	 */
	EAttribute getCopyProperty_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.MoveProperty <em>Move Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Property</em>'.
	 * @see mm.app.operations.MoveProperty
	 * @generated
	 */
	EClass getMoveProperty();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.MoveProperty#getOwningClassName <em>Owning Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Class Name</em>'.
	 * @see mm.app.operations.MoveProperty#getOwningClassName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_OwningClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.MoveProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.app.operations.MoveProperty#getName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.MoveProperty#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see mm.app.operations.MoveProperty#getTargetClassName()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_TargetClassName();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.MoveProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.app.operations.MoveProperty#getType()
	 * @see #getMoveProperty()
	 * @generated
	 */
	EAttribute getMoveProperty_Type();

	/**
	 * Returns the meta object for class '{@link mm.app.operations.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Class</em>'.
	 * @see mm.app.operations.ExtractClass
	 * @generated
	 */
	EClass getExtractClass();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.ExtractClass#getSourceClassName <em>Source Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Class Name</em>'.
	 * @see mm.app.operations.ExtractClass#getSourceClassName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_SourceClassName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.app.operations.ExtractClass#getExtractPropertiesNames <em>Extract Properties Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extract Properties Names</em>'.
	 * @see mm.app.operations.ExtractClass#getExtractPropertiesNames()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_ExtractPropertiesNames();

	/**
	 * Returns the meta object for the attribute '{@link mm.app.operations.ExtractClass#getExtractClassName <em>Extract Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extract Class Name</em>'.
	 * @see mm.app.operations.ExtractClass#getExtractClassName()
	 * @see #getExtractClass()
	 * @generated
	 */
	EAttribute getExtractClass_ExtractClassName();

	/**
	 * Returns the meta object for enum '{@link mm.app.operations.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Type</em>'.
	 * @see mm.app.operations.MergeType
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
	OperationsFactory getOperationsFactory();

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
		 * The meta object literal for the '{@link mm.app.operations.impl.ModelOperationImpl <em>Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.ModelOperationImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getModelOperation()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.AddPrimitiveClassImpl <em>Add Primitive Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.AddPrimitiveClassImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getAddPrimitiveClass()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.AddEmbeddedClassImpl <em>Add Embedded Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.AddEmbeddedClassImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getAddEmbeddedClass()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.AddClassImpl <em>Add Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.AddClassImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getAddClass()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.RenameEntityImpl <em>Rename Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.RenameEntityImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getRenameEntity()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetParentImpl <em>Set Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetParentImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetParent()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetAbstractImpl <em>Set Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetAbstractImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetAbstract()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.RemoveEntityImpl <em>Remove Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.RemoveEntityImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getRemoveEntity()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.AddPropertyImpl <em>Add Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.AddPropertyImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getAddProperty()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.RenamePropertyImpl <em>Rename Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.RenamePropertyImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getRenameProperty()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.RemovePropertyImpl <em>Remove Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.RemovePropertyImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getRemoveProperty()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetTypeImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetType()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetOppositeImpl <em>Set Opposite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetOppositeImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetOpposite()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetBoundriesImpl <em>Set Boundries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetBoundriesImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetBoundries()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetOrderedImpl <em>Set Ordered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetOrderedImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetOrdered()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.SetUniqueImpl <em>Set Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.SetUniqueImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getSetUnique()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.CopyPropertyImpl <em>Copy Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.CopyPropertyImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getCopyProperty()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.MovePropertyImpl <em>Move Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.MovePropertyImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getMoveProperty()
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
		 * The meta object literal for the '{@link mm.app.operations.impl.ExtractClassImpl <em>Extract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.impl.ExtractClassImpl
		 * @see mm.app.operations.impl.OperationsPackageImpl#getExtractClass()
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
		 * The meta object literal for the '{@link mm.app.operations.MergeType <em>Merge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.app.operations.MergeType
		 * @see mm.app.operations.impl.OperationsPackageImpl#getMergeType()
		 * @generated
		 */
		EEnum MERGE_TYPE = eINSTANCE.getMergeType();

	}

} //OperationsPackage
