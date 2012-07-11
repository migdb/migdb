/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see mm.rdb.ops.OpsFactory
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
	String eNS_URI = "http://www.collectionspro.eu/jam/mm/rdb-ops";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdb-ops";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpsPackage eINSTANCE = mm.rdb.ops.impl.OpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.ModelOperationImpl <em>Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.ModelOperationImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getModelOperation()
	 * @generated
	 */
	int MODEL_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddSchemaImpl <em>Add Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddSchemaImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddSchema()
	 * @generated
	 */
	int ADD_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCHEMA__NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SCHEMA_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddSequenceImpl <em>Add Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddSequenceImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddSequence()
	 * @generated
	 */
	int ADD_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE__START_VALUE = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddIndexImpl <em>Add Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddIndexImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddIndex()
	 * @generated
	 */
	int ADD_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX__COLUMNS_NAMES = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INDEX_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddTableImpl <em>Add Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddTableImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddTable()
	 * @generated
	 */
	int ADD_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TABLE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RenameTableImpl <em>Rename Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RenameTableImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRenameTable()
	 * @generated
	 */
	int RENAME_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE__NEW_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rename Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TABLE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveTableImpl <em>Remove Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveTableImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveTable()
	 * @generated
	 */
	int REMOVE_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddColumnImpl <em>Add Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddColumnImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddColumn()
	 * @generated
	 */
	int ADD_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__TYPE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__DEFAULT_VALUE = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RenameColumnImpl <em>Rename Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RenameColumnImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRenameColumn()
	 * @generated
	 */
	int RENAME_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN__NEW_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rename Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_COLUMN_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.CopyInstancesImpl <em>Copy Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.CopyInstancesImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getCopyInstances()
	 * @generated
	 */
	int COPY_INSTANCES = 9;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__SOURCE_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__TARGET_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__TARGET_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES__TYPE = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Copy Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_INSTANCES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveColumnImpl <em>Remove Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveColumnImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveColumn()
	 * @generated
	 */
	int REMOVE_COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddUniqueImpl <em>Add Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddUniqueImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddUnique()
	 * @generated
	 */
	int ADD_UNIQUE = 11;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddPrimaryKeyImpl <em>Add Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddPrimaryKeyImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddPrimaryKey()
	 * @generated
	 */
	int ADD_PRIMARY_KEY = 12;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddForeignKeyImpl <em>Add Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddForeignKeyImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddForeignKey()
	 * @generated
	 */
	int ADD_FOREIGN_KEY = 13;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__TARGET_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveConstraintImpl <em>Remove Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveConstraintImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveConstraint()
	 * @generated
	 */
	int REMOVE_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CONSTRAINT__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CONSTRAINT__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CONSTRAINT__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CONSTRAINT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddNotNullImpl <em>Add Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddNotNullImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddNotNull()
	 * @generated
	 */
	int ADD_NOT_NULL = 15;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL__NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveIndexImpl <em>Remove Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveIndexImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveIndex()
	 * @generated
	 */
	int REMOVE_INDEX = 16;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INDEX__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INDEX__NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_INDEX_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.SetColumnTypeImpl <em>Set Column Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.SetColumnTypeImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getSetColumnType()
	 * @generated
	 */
	int SET_COLUMN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE__NEW_TYPE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Old Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE__OLD_TYPE = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Set Column Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_TYPE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.SetColumnDefaultValueImpl <em>Set Column Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.SetColumnDefaultValueImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getSetColumnDefaultValue()
	 * @generated
	 */
	int SET_COLUMN_DEFAULT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>New Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Column Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_COLUMN_DEFAULT_VALUE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveDefaultValueImpl <em>Remove Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveDefaultValueImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveDefaultValue()
	 * @generated
	 */
	int REMOVE_DEFAULT_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEFAULT_VALUE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEFAULT_VALUE__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEFAULT_VALUE__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DEFAULT_VALUE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.RemoveSequenceImpl <em>Remove Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.RemoveSequenceImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveSequence()
	 * @generated
	 */
	int REMOVE_SEQUENCE = 20;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SEQUENCE__SEQUENCE_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SEQUENCE__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SEQUENCE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.HasNoOwnInstancesImpl <em>Has No Own Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.HasNoOwnInstancesImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getHasNoOwnInstances()
	 * @generated
	 */
	int HAS_NO_OWN_INSTANCES = 21;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_OWN_INSTANCES__TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descendants Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Has No Own Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_OWN_INSTANCES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.HasNoInstancesImpl <em>Has No Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.HasNoInstancesImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getHasNoInstances()
	 * @generated
	 */
	int HAS_NO_INSTANCES = 22;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_INSTANCES__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_INSTANCES__TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has No Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NO_INSTANCES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.AddInstancesImpl <em>Add Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.AddInstancesImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddInstances()
	 * @generated
	 */
	int ADD_INSTANCES = 23;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCES__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCES__SOURCE_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Table Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCES__TARGET_TABLE_NAMES = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_INSTANCES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.InsertInstancesImpl <em>Insert Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.InsertInstancesImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getInsertInstances()
	 * @generated
	 */
	int INSERT_INSTANCES = 24;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES__SOURCE_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES__TARGET_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Columns Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES__SOURCE_COLUMNS_NAMES = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Columns Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES__TARGET_COLUMNS_NAMES = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Insert Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_INSTANCES_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.impl.GenerateSequenceNumbersImpl <em>Generate Sequence Numbers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.impl.GenerateSequenceNumbersImpl
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getGenerateSequenceNumbers()
	 * @generated
	 */
	int GENERATE_SEQUENCE_NUMBERS = 25;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_SEQUENCE_NUMBERS__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_SEQUENCE_NUMBERS__TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_SEQUENCE_NUMBERS__COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_SEQUENCE_NUMBERS__SEQUENCE_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generate Sequence Numbers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_SEQUENCE_NUMBERS_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.ops.MergeType <em>Merge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.ops.MergeType
	 * @see mm.rdb.ops.impl.OpsPackageImpl#getMergeType()
	 * @generated
	 */
	int MERGE_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Operation</em>'.
	 * @see mm.rdb.ops.ModelOperation
	 * @generated
	 */
	EClass getModelOperation();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddSchema <em>Add Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Schema</em>'.
	 * @see mm.rdb.ops.AddSchema
	 * @generated
	 */
	EClass getAddSchema();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddSchema#getName()
	 * @see #getAddSchema()
	 * @generated
	 */
	EAttribute getAddSchema_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddSequence <em>Add Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Sequence</em>'.
	 * @see mm.rdb.ops.AddSequence
	 * @generated
	 */
	EClass getAddSequence();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddSequence#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddSequence#getOwningSchemaName()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddSequence#getName()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddSequence#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see mm.rdb.ops.AddSequence#getStartValue()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_StartValue();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Index</em>'.
	 * @see mm.rdb.ops.AddIndex
	 * @generated
	 */
	EClass getAddIndex();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddIndex#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddIndex#getOwningSchemaName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddIndex#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddIndex#getOwningTableName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddIndex#getName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_Name();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.ops.AddIndex#getColumnsNames <em>Columns Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns Names</em>'.
	 * @see mm.rdb.ops.AddIndex#getColumnsNames()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_ColumnsNames();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddTable <em>Add Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Table</em>'.
	 * @see mm.rdb.ops.AddTable
	 * @generated
	 */
	EClass getAddTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddTable#getOwningSchemaName()
	 * @see #getAddTable()
	 * @generated
	 */
	EAttribute getAddTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddTable#getName()
	 * @see #getAddTable()
	 * @generated
	 */
	EAttribute getAddTable_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Table</em>'.
	 * @see mm.rdb.ops.RenameTable
	 * @generated
	 */
	EClass getRenameTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RenameTable#getOwningSchemaName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RenameTable#getName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameTable#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.rdb.ops.RenameTable#getNewName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_NewName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveTable <em>Remove Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Table</em>'.
	 * @see mm.rdb.ops.RemoveTable
	 * @generated
	 */
	EClass getRemoveTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveTable#getOwningSchemaName()
	 * @see #getRemoveTable()
	 * @generated
	 */
	EAttribute getRemoveTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RemoveTable#getName()
	 * @see #getRemoveTable()
	 * @generated
	 */
	EAttribute getRemoveTable_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Column</em>'.
	 * @see mm.rdb.ops.AddColumn
	 * @generated
	 */
	EClass getAddColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddColumn#getOwningSchemaName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddColumn#getOwningTableName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddColumn#getName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.rdb.ops.AddColumn#getType()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddColumn#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.rdb.ops.AddColumn#getDefaultValue()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_DefaultValue();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Column</em>'.
	 * @see mm.rdb.ops.RenameColumn
	 * @generated
	 */
	EClass getRenameColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RenameColumn#getOwningSchemaName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.RenameColumn#getOwningTableName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RenameColumn#getName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RenameColumn#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.rdb.ops.RenameColumn#getNewName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_NewName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.CopyInstances <em>Copy Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Instances</em>'.
	 * @see mm.rdb.ops.CopyInstances
	 * @generated
	 */
	EClass getCopyInstances();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.CopyInstances#getOwningSchemaName()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.CopyInstances#getOwningTableName()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getSourceColumnName <em>Source Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Column Name</em>'.
	 * @see mm.rdb.ops.CopyInstances#getSourceColumnName()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_SourceColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getTargetTableName <em>Target Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Table Name</em>'.
	 * @see mm.rdb.ops.CopyInstances#getTargetTableName()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_TargetTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getTargetColumnName <em>Target Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Column Name</em>'.
	 * @see mm.rdb.ops.CopyInstances#getTargetColumnName()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_TargetColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.CopyInstances#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.rdb.ops.CopyInstances#getType()
	 * @see #getCopyInstances()
	 * @generated
	 */
	EAttribute getCopyInstances_Type();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveColumn <em>Remove Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Column</em>'.
	 * @see mm.rdb.ops.RemoveColumn
	 * @generated
	 */
	EClass getRemoveColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveColumn#getOwningSchemaName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.RemoveColumn#getOwningTableName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RemoveColumn#getName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddUnique <em>Add Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Unique</em>'.
	 * @see mm.rdb.ops.AddUnique
	 * @generated
	 */
	EClass getAddUnique();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddUnique#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddUnique#getOwningSchemaName()
	 * @see #getAddUnique()
	 * @generated
	 */
	EAttribute getAddUnique_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddUnique#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddUnique#getOwningTableName()
	 * @see #getAddUnique()
	 * @generated
	 */
	EAttribute getAddUnique_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddUnique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddUnique#getName()
	 * @see #getAddUnique()
	 * @generated
	 */
	EAttribute getAddUnique_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddUnique#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.AddUnique#getOwningColumnName()
	 * @see #getAddUnique()
	 * @generated
	 */
	EAttribute getAddUnique_OwningColumnName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primary Key</em>'.
	 * @see mm.rdb.ops.AddPrimaryKey
	 * @generated
	 */
	EClass getAddPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddPrimaryKey#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddPrimaryKey#getOwningSchemaName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddPrimaryKey#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddPrimaryKey#getOwningTableName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddPrimaryKey#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.AddPrimaryKey#getOwningColumnName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddPrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddPrimaryKey#getName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddForeignKey <em>Add Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Foreign Key</em>'.
	 * @see mm.rdb.ops.AddForeignKey
	 * @generated
	 */
	EClass getAddForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddForeignKey#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddForeignKey#getOwningSchemaName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddForeignKey#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddForeignKey#getOwningTableName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddForeignKey#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.AddForeignKey#getOwningColumnName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddForeignKey#getName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddForeignKey#getTargetTableName <em>Target Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Table Name</em>'.
	 * @see mm.rdb.ops.AddForeignKey#getTargetTableName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_TargetTableName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveConstraint <em>Remove Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Constraint</em>'.
	 * @see mm.rdb.ops.RemoveConstraint
	 * @generated
	 */
	EClass getRemoveConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveConstraint#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveConstraint#getOwningSchemaName()
	 * @see #getRemoveConstraint()
	 * @generated
	 */
	EAttribute getRemoveConstraint_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveConstraint#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.RemoveConstraint#getOwningTableName()
	 * @see #getRemoveConstraint()
	 * @generated
	 */
	EAttribute getRemoveConstraint_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RemoveConstraint#getName()
	 * @see #getRemoveConstraint()
	 * @generated
	 */
	EAttribute getRemoveConstraint_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddNotNull <em>Add Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Not Null</em>'.
	 * @see mm.rdb.ops.AddNotNull
	 * @generated
	 */
	EClass getAddNotNull();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddNotNull#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddNotNull#getOwningSchemaName()
	 * @see #getAddNotNull()
	 * @generated
	 */
	EAttribute getAddNotNull_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddNotNull#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.AddNotNull#getOwningTableName()
	 * @see #getAddNotNull()
	 * @generated
	 */
	EAttribute getAddNotNull_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddNotNull#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.AddNotNull#getOwningColumnName()
	 * @see #getAddNotNull()
	 * @generated
	 */
	EAttribute getAddNotNull_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddNotNull#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.AddNotNull#getName()
	 * @see #getAddNotNull()
	 * @generated
	 */
	EAttribute getAddNotNull_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveIndex <em>Remove Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Index</em>'.
	 * @see mm.rdb.ops.RemoveIndex
	 * @generated
	 */
	EClass getRemoveIndex();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveIndex#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveIndex#getOwningSchemaName()
	 * @see #getRemoveIndex()
	 * @generated
	 */
	EAttribute getRemoveIndex_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.ops.RemoveIndex#getName()
	 * @see #getRemoveIndex()
	 * @generated
	 */
	EAttribute getRemoveIndex_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.SetColumnType <em>Set Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Column Type</em>'.
	 * @see mm.rdb.ops.SetColumnType
	 * @generated
	 */
	EClass getSetColumnType();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnType#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.SetColumnType#getOwningSchemaName()
	 * @see #getSetColumnType()
	 * @generated
	 */
	EAttribute getSetColumnType_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnType#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.SetColumnType#getOwningTableName()
	 * @see #getSetColumnType()
	 * @generated
	 */
	EAttribute getSetColumnType_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnType#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.SetColumnType#getOwningColumnName()
	 * @see #getSetColumnType()
	 * @generated
	 */
	EAttribute getSetColumnType_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnType#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Type</em>'.
	 * @see mm.rdb.ops.SetColumnType#getNewType()
	 * @see #getSetColumnType()
	 * @generated
	 */
	EAttribute getSetColumnType_NewType();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnType#getOldType <em>Old Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Type</em>'.
	 * @see mm.rdb.ops.SetColumnType#getOldType()
	 * @see #getSetColumnType()
	 * @generated
	 */
	EAttribute getSetColumnType_OldType();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.SetColumnDefaultValue <em>Set Column Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Column Default Value</em>'.
	 * @see mm.rdb.ops.SetColumnDefaultValue
	 * @generated
	 */
	EClass getSetColumnDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.SetColumnDefaultValue#getOwningSchemaName()
	 * @see #getSetColumnDefaultValue()
	 * @generated
	 */
	EAttribute getSetColumnDefaultValue_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.SetColumnDefaultValue#getOwningTableName()
	 * @see #getSetColumnDefaultValue()
	 * @generated
	 */
	EAttribute getSetColumnDefaultValue_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.SetColumnDefaultValue#getOwningColumnName()
	 * @see #getSetColumnDefaultValue()
	 * @generated
	 */
	EAttribute getSetColumnDefaultValue_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.SetColumnDefaultValue#getNewDefaultValue <em>New Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Default Value</em>'.
	 * @see mm.rdb.ops.SetColumnDefaultValue#getNewDefaultValue()
	 * @see #getSetColumnDefaultValue()
	 * @generated
	 */
	EAttribute getSetColumnDefaultValue_NewDefaultValue();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveDefaultValue <em>Remove Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Default Value</em>'.
	 * @see mm.rdb.ops.RemoveDefaultValue
	 * @generated
	 */
	EClass getRemoveDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveDefaultValue#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveDefaultValue#getOwningSchemaName()
	 * @see #getRemoveDefaultValue()
	 * @generated
	 */
	EAttribute getRemoveDefaultValue_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveDefaultValue#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.ops.RemoveDefaultValue#getOwningTableName()
	 * @see #getRemoveDefaultValue()
	 * @generated
	 */
	EAttribute getRemoveDefaultValue_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveDefaultValue#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.ops.RemoveDefaultValue#getOwningColumnName()
	 * @see #getRemoveDefaultValue()
	 * @generated
	 */
	EAttribute getRemoveDefaultValue_OwningColumnName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.RemoveSequence <em>Remove Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Sequence</em>'.
	 * @see mm.rdb.ops.RemoveSequence
	 * @generated
	 */
	EClass getRemoveSequence();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveSequence#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see mm.rdb.ops.RemoveSequence#getSequenceName()
	 * @see #getRemoveSequence()
	 * @generated
	 */
	EAttribute getRemoveSequence_SequenceName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.RemoveSequence#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.RemoveSequence#getOwningSchemaName()
	 * @see #getRemoveSequence()
	 * @generated
	 */
	EAttribute getRemoveSequence_OwningSchemaName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.HasNoOwnInstances <em>Has No Own Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has No Own Instances</em>'.
	 * @see mm.rdb.ops.HasNoOwnInstances
	 * @generated
	 */
	EClass getHasNoOwnInstances();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.HasNoOwnInstances#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.HasNoOwnInstances#getOwningSchemaName()
	 * @see #getHasNoOwnInstances()
	 * @generated
	 */
	EAttribute getHasNoOwnInstances_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.HasNoOwnInstances#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see mm.rdb.ops.HasNoOwnInstances#getTableName()
	 * @see #getHasNoOwnInstances()
	 * @generated
	 */
	EAttribute getHasNoOwnInstances_TableName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.ops.HasNoOwnInstances#getDescendantsNames <em>Descendants Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Descendants Names</em>'.
	 * @see mm.rdb.ops.HasNoOwnInstances#getDescendantsNames()
	 * @see #getHasNoOwnInstances()
	 * @generated
	 */
	EAttribute getHasNoOwnInstances_DescendantsNames();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.HasNoInstances <em>Has No Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has No Instances</em>'.
	 * @see mm.rdb.ops.HasNoInstances
	 * @generated
	 */
	EClass getHasNoInstances();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.HasNoInstances#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.HasNoInstances#getOwningSchemaName()
	 * @see #getHasNoInstances()
	 * @generated
	 */
	EAttribute getHasNoInstances_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.HasNoInstances#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see mm.rdb.ops.HasNoInstances#getTableName()
	 * @see #getHasNoInstances()
	 * @generated
	 */
	EAttribute getHasNoInstances_TableName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.AddInstances <em>Add Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Instances</em>'.
	 * @see mm.rdb.ops.AddInstances
	 * @generated
	 */
	EClass getAddInstances();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddInstances#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.AddInstances#getOwningSchemaName()
	 * @see #getAddInstances()
	 * @generated
	 */
	EAttribute getAddInstances_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.AddInstances#getSourceTableName <em>Source Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Table Name</em>'.
	 * @see mm.rdb.ops.AddInstances#getSourceTableName()
	 * @see #getAddInstances()
	 * @generated
	 */
	EAttribute getAddInstances_SourceTableName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.ops.AddInstances#getTargetTableNames <em>Target Table Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Table Names</em>'.
	 * @see mm.rdb.ops.AddInstances#getTargetTableNames()
	 * @see #getAddInstances()
	 * @generated
	 */
	EAttribute getAddInstances_TargetTableNames();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.InsertInstances <em>Insert Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Instances</em>'.
	 * @see mm.rdb.ops.InsertInstances
	 * @generated
	 */
	EClass getInsertInstances();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.InsertInstances#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.InsertInstances#getOwningSchemaName()
	 * @see #getInsertInstances()
	 * @generated
	 */
	EAttribute getInsertInstances_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.InsertInstances#getSourceTableName <em>Source Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Table Name</em>'.
	 * @see mm.rdb.ops.InsertInstances#getSourceTableName()
	 * @see #getInsertInstances()
	 * @generated
	 */
	EAttribute getInsertInstances_SourceTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.InsertInstances#getTargetTableName <em>Target Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Table Name</em>'.
	 * @see mm.rdb.ops.InsertInstances#getTargetTableName()
	 * @see #getInsertInstances()
	 * @generated
	 */
	EAttribute getInsertInstances_TargetTableName();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.ops.InsertInstances#getSourceColumnsNames <em>Source Columns Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source Columns Names</em>'.
	 * @see mm.rdb.ops.InsertInstances#getSourceColumnsNames()
	 * @see #getInsertInstances()
	 * @generated
	 */
	EAttribute getInsertInstances_SourceColumnsNames();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.ops.InsertInstances#getTargetColumnsNames <em>Target Columns Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Columns Names</em>'.
	 * @see mm.rdb.ops.InsertInstances#getTargetColumnsNames()
	 * @see #getInsertInstances()
	 * @generated
	 */
	EAttribute getInsertInstances_TargetColumnsNames();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ops.GenerateSequenceNumbers <em>Generate Sequence Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generate Sequence Numbers</em>'.
	 * @see mm.rdb.ops.GenerateSequenceNumbers
	 * @generated
	 */
	EClass getGenerateSequenceNumbers();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.GenerateSequenceNumbers#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.ops.GenerateSequenceNumbers#getOwningSchemaName()
	 * @see #getGenerateSequenceNumbers()
	 * @generated
	 */
	EAttribute getGenerateSequenceNumbers_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.GenerateSequenceNumbers#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see mm.rdb.ops.GenerateSequenceNumbers#getTableName()
	 * @see #getGenerateSequenceNumbers()
	 * @generated
	 */
	EAttribute getGenerateSequenceNumbers_TableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.GenerateSequenceNumbers#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see mm.rdb.ops.GenerateSequenceNumbers#getColumnName()
	 * @see #getGenerateSequenceNumbers()
	 * @generated
	 */
	EAttribute getGenerateSequenceNumbers_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ops.GenerateSequenceNumbers#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see mm.rdb.ops.GenerateSequenceNumbers#getSequenceName()
	 * @see #getGenerateSequenceNumbers()
	 * @generated
	 */
	EAttribute getGenerateSequenceNumbers_SequenceName();

	/**
	 * Returns the meta object for enum '{@link mm.rdb.ops.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Type</em>'.
	 * @see mm.rdb.ops.MergeType
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
		 * The meta object literal for the '{@link mm.rdb.ops.impl.ModelOperationImpl <em>Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.ModelOperationImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getModelOperation()
		 * @generated
		 */
		EClass MODEL_OPERATION = eINSTANCE.getModelOperation();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddSchemaImpl <em>Add Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddSchemaImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddSchema()
		 * @generated
		 */
		EClass ADD_SCHEMA = eINSTANCE.getAddSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SCHEMA__NAME = eINSTANCE.getAddSchema_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddSequenceImpl <em>Add Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddSequenceImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddSequence()
		 * @generated
		 */
		EClass ADD_SEQUENCE = eINSTANCE.getAddSequence();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SEQUENCE__OWNING_SCHEMA_NAME = eINSTANCE.getAddSequence_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SEQUENCE__NAME = eINSTANCE.getAddSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SEQUENCE__START_VALUE = eINSTANCE.getAddSequence_StartValue();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddIndexImpl <em>Add Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddIndexImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddIndex()
		 * @generated
		 */
		EClass ADD_INDEX = eINSTANCE.getAddIndex();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INDEX__OWNING_SCHEMA_NAME = eINSTANCE.getAddIndex_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INDEX__OWNING_TABLE_NAME = eINSTANCE.getAddIndex_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INDEX__NAME = eINSTANCE.getAddIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Columns Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INDEX__COLUMNS_NAMES = eINSTANCE.getAddIndex_ColumnsNames();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddTableImpl <em>Add Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddTableImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddTable()
		 * @generated
		 */
		EClass ADD_TABLE = eINSTANCE.getAddTable();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TABLE__OWNING_SCHEMA_NAME = eINSTANCE.getAddTable_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TABLE__NAME = eINSTANCE.getAddTable_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RenameTableImpl <em>Rename Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RenameTableImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRenameTable()
		 * @generated
		 */
		EClass RENAME_TABLE = eINSTANCE.getRenameTable();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_TABLE__OWNING_SCHEMA_NAME = eINSTANCE.getRenameTable_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_TABLE__NAME = eINSTANCE.getRenameTable_Name();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_TABLE__NEW_NAME = eINSTANCE.getRenameTable_NewName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveTableImpl <em>Remove Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveTableImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveTable()
		 * @generated
		 */
		EClass REMOVE_TABLE = eINSTANCE.getRemoveTable();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveTable_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE__NAME = eINSTANCE.getRemoveTable_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddColumnImpl <em>Add Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddColumnImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddColumn()
		 * @generated
		 */
		EClass ADD_COLUMN = eINSTANCE.getAddColumn();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COLUMN__OWNING_SCHEMA_NAME = eINSTANCE.getAddColumn_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COLUMN__OWNING_TABLE_NAME = eINSTANCE.getAddColumn_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COLUMN__NAME = eINSTANCE.getAddColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COLUMN__TYPE = eINSTANCE.getAddColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_COLUMN__DEFAULT_VALUE = eINSTANCE.getAddColumn_DefaultValue();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RenameColumnImpl <em>Rename Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RenameColumnImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRenameColumn()
		 * @generated
		 */
		EClass RENAME_COLUMN = eINSTANCE.getRenameColumn();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_COLUMN__OWNING_SCHEMA_NAME = eINSTANCE.getRenameColumn_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_COLUMN__OWNING_TABLE_NAME = eINSTANCE.getRenameColumn_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_COLUMN__NAME = eINSTANCE.getRenameColumn_Name();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_COLUMN__NEW_NAME = eINSTANCE.getRenameColumn_NewName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.CopyInstancesImpl <em>Copy Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.CopyInstancesImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getCopyInstances()
		 * @generated
		 */
		EClass COPY_INSTANCES = eINSTANCE.getCopyInstances();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__OWNING_SCHEMA_NAME = eINSTANCE.getCopyInstances_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__OWNING_TABLE_NAME = eINSTANCE.getCopyInstances_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Source Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__SOURCE_COLUMN_NAME = eINSTANCE.getCopyInstances_SourceColumnName();

		/**
		 * The meta object literal for the '<em><b>Target Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__TARGET_TABLE_NAME = eINSTANCE.getCopyInstances_TargetTableName();

		/**
		 * The meta object literal for the '<em><b>Target Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__TARGET_COLUMN_NAME = eINSTANCE.getCopyInstances_TargetColumnName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_INSTANCES__TYPE = eINSTANCE.getCopyInstances_Type();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveColumnImpl <em>Remove Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveColumnImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveColumn()
		 * @generated
		 */
		EClass REMOVE_COLUMN = eINSTANCE.getRemoveColumn();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveColumn_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN__OWNING_TABLE_NAME = eINSTANCE.getRemoveColumn_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN__NAME = eINSTANCE.getRemoveColumn_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddUniqueImpl <em>Add Unique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddUniqueImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddUnique()
		 * @generated
		 */
		EClass ADD_UNIQUE = eINSTANCE.getAddUnique();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE__OWNING_SCHEMA_NAME = eINSTANCE.getAddUnique_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE__OWNING_TABLE_NAME = eINSTANCE.getAddUnique_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE__NAME = eINSTANCE.getAddUnique_Name();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE__OWNING_COLUMN_NAME = eINSTANCE.getAddUnique_OwningColumnName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddPrimaryKeyImpl <em>Add Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddPrimaryKeyImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddPrimaryKey()
		 * @generated
		 */
		EClass ADD_PRIMARY_KEY = eINSTANCE.getAddPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__OWNING_SCHEMA_NAME = eINSTANCE.getAddPrimaryKey_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__OWNING_TABLE_NAME = eINSTANCE.getAddPrimaryKey_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__OWNING_COLUMN_NAME = eINSTANCE.getAddPrimaryKey_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__NAME = eINSTANCE.getAddPrimaryKey_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddForeignKeyImpl <em>Add Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddForeignKeyImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddForeignKey()
		 * @generated
		 */
		EClass ADD_FOREIGN_KEY = eINSTANCE.getAddForeignKey();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME = eINSTANCE.getAddForeignKey_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__OWNING_TABLE_NAME = eINSTANCE.getAddForeignKey_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__OWNING_COLUMN_NAME = eINSTANCE.getAddForeignKey_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__NAME = eINSTANCE.getAddForeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>Target Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__TARGET_TABLE_NAME = eINSTANCE.getAddForeignKey_TargetTableName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveConstraintImpl <em>Remove Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveConstraintImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveConstraint()
		 * @generated
		 */
		EClass REMOVE_CONSTRAINT = eINSTANCE.getRemoveConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_CONSTRAINT__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveConstraint_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_CONSTRAINT__OWNING_TABLE_NAME = eINSTANCE.getRemoveConstraint_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_CONSTRAINT__NAME = eINSTANCE.getRemoveConstraint_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddNotNullImpl <em>Add Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddNotNullImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddNotNull()
		 * @generated
		 */
		EClass ADD_NOT_NULL = eINSTANCE.getAddNotNull();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL__OWNING_SCHEMA_NAME = eINSTANCE.getAddNotNull_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL__OWNING_TABLE_NAME = eINSTANCE.getAddNotNull_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL__OWNING_COLUMN_NAME = eINSTANCE.getAddNotNull_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL__NAME = eINSTANCE.getAddNotNull_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveIndexImpl <em>Remove Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveIndexImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveIndex()
		 * @generated
		 */
		EClass REMOVE_INDEX = eINSTANCE.getRemoveIndex();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_INDEX__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveIndex_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_INDEX__NAME = eINSTANCE.getRemoveIndex_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.SetColumnTypeImpl <em>Set Column Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.SetColumnTypeImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getSetColumnType()
		 * @generated
		 */
		EClass SET_COLUMN_TYPE = eINSTANCE.getSetColumnType();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_TYPE__OWNING_SCHEMA_NAME = eINSTANCE.getSetColumnType_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_TYPE__OWNING_TABLE_NAME = eINSTANCE.getSetColumnType_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_TYPE__OWNING_COLUMN_NAME = eINSTANCE.getSetColumnType_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_TYPE__NEW_TYPE = eINSTANCE.getSetColumnType_NewType();

		/**
		 * The meta object literal for the '<em><b>Old Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_TYPE__OLD_TYPE = eINSTANCE.getSetColumnType_OldType();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.SetColumnDefaultValueImpl <em>Set Column Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.SetColumnDefaultValueImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getSetColumnDefaultValue()
		 * @generated
		 */
		EClass SET_COLUMN_DEFAULT_VALUE = eINSTANCE.getSetColumnDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME = eINSTANCE.getSetColumnDefaultValue_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME = eINSTANCE.getSetColumnDefaultValue_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME = eINSTANCE.getSetColumnDefaultValue_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>New Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE = eINSTANCE.getSetColumnDefaultValue_NewDefaultValue();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveDefaultValueImpl <em>Remove Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveDefaultValueImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveDefaultValue()
		 * @generated
		 */
		EClass REMOVE_DEFAULT_VALUE = eINSTANCE.getRemoveDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_DEFAULT_VALUE__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveDefaultValue_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_DEFAULT_VALUE__OWNING_TABLE_NAME = eINSTANCE.getRemoveDefaultValue_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_DEFAULT_VALUE__OWNING_COLUMN_NAME = eINSTANCE.getRemoveDefaultValue_OwningColumnName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.RemoveSequenceImpl <em>Remove Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.RemoveSequenceImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getRemoveSequence()
		 * @generated
		 */
		EClass REMOVE_SEQUENCE = eINSTANCE.getRemoveSequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_SEQUENCE__SEQUENCE_NAME = eINSTANCE.getRemoveSequence_SequenceName();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_SEQUENCE__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveSequence_OwningSchemaName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.HasNoOwnInstancesImpl <em>Has No Own Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.HasNoOwnInstancesImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getHasNoOwnInstances()
		 * @generated
		 */
		EClass HAS_NO_OWN_INSTANCES = eINSTANCE.getHasNoOwnInstances();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME = eINSTANCE.getHasNoOwnInstances_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_NO_OWN_INSTANCES__TABLE_NAME = eINSTANCE.getHasNoOwnInstances_TableName();

		/**
		 * The meta object literal for the '<em><b>Descendants Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES = eINSTANCE.getHasNoOwnInstances_DescendantsNames();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.HasNoInstancesImpl <em>Has No Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.HasNoInstancesImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getHasNoInstances()
		 * @generated
		 */
		EClass HAS_NO_INSTANCES = eINSTANCE.getHasNoInstances();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_NO_INSTANCES__OWNING_SCHEMA_NAME = eINSTANCE.getHasNoInstances_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_NO_INSTANCES__TABLE_NAME = eINSTANCE.getHasNoInstances_TableName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.AddInstancesImpl <em>Add Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.AddInstancesImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getAddInstances()
		 * @generated
		 */
		EClass ADD_INSTANCES = eINSTANCE.getAddInstances();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INSTANCES__OWNING_SCHEMA_NAME = eINSTANCE.getAddInstances_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Source Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INSTANCES__SOURCE_TABLE_NAME = eINSTANCE.getAddInstances_SourceTableName();

		/**
		 * The meta object literal for the '<em><b>Target Table Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_INSTANCES__TARGET_TABLE_NAMES = eINSTANCE.getAddInstances_TargetTableNames();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.InsertInstancesImpl <em>Insert Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.InsertInstancesImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getInsertInstances()
		 * @generated
		 */
		EClass INSERT_INSTANCES = eINSTANCE.getInsertInstances();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_INSTANCES__OWNING_SCHEMA_NAME = eINSTANCE.getInsertInstances_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Source Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_INSTANCES__SOURCE_TABLE_NAME = eINSTANCE.getInsertInstances_SourceTableName();

		/**
		 * The meta object literal for the '<em><b>Target Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_INSTANCES__TARGET_TABLE_NAME = eINSTANCE.getInsertInstances_TargetTableName();

		/**
		 * The meta object literal for the '<em><b>Source Columns Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_INSTANCES__SOURCE_COLUMNS_NAMES = eINSTANCE.getInsertInstances_SourceColumnsNames();

		/**
		 * The meta object literal for the '<em><b>Target Columns Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_INSTANCES__TARGET_COLUMNS_NAMES = eINSTANCE.getInsertInstances_TargetColumnsNames();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.impl.GenerateSequenceNumbersImpl <em>Generate Sequence Numbers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.impl.GenerateSequenceNumbersImpl
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getGenerateSequenceNumbers()
		 * @generated
		 */
		EClass GENERATE_SEQUENCE_NUMBERS = eINSTANCE.getGenerateSequenceNumbers();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_SEQUENCE_NUMBERS__OWNING_SCHEMA_NAME = eINSTANCE.getGenerateSequenceNumbers_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_SEQUENCE_NUMBERS__TABLE_NAME = eINSTANCE.getGenerateSequenceNumbers_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_SEQUENCE_NUMBERS__COLUMN_NAME = eINSTANCE.getGenerateSequenceNumbers_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_SEQUENCE_NUMBERS__SEQUENCE_NAME = eINSTANCE.getGenerateSequenceNumbers_SequenceName();

		/**
		 * The meta object literal for the '{@link mm.rdb.ops.MergeType <em>Merge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.ops.MergeType
		 * @see mm.rdb.ops.impl.OpsPackageImpl#getMergeType()
		 * @generated
		 */
		EEnum MERGE_TYPE = eINSTANCE.getMergeType();

	}

} //OpsPackage
