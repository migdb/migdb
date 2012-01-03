/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations;

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
 * @see mm.rdb.operations.OperationsFactory
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
	OperationsPackage eINSTANCE = mm.rdb.operations.impl.OperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.ModelOperationImpl <em>Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.ModelOperationImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getModelOperation()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddSchemaImpl <em>Add Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddSchemaImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddSchema()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddSequenceImpl <em>Add Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddSequenceImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddSequence()
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
	 * The feature id for the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE__CACHE_SIZE = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SEQUENCE_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddIndexImpl <em>Add Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddIndexImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddIndex()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddTableImpl <em>Add Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddTableImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddTable()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.RenameTableImpl <em>Rename Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RenameTableImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRenameTable()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.RemoveTableImpl <em>Remove Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RemoveTableImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveTable()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddColumnImpl <em>Add Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddColumnImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddColumn()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.RenameColumnImpl <em>Rename Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RenameColumnImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRenameColumn()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.RemoveColumnImpl <em>Remove Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RemoveColumnImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveColumn()
	 * @generated
	 */
	int REMOVE_COLUMN = 9;

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
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddUniqueIndexImpl <em>Add Unique Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddUniqueIndexImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddUniqueIndex()
	 * @generated
	 */
	int ADD_UNIQUE_INDEX = 10;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_INDEX__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_INDEX__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Underlying Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Unique Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_UNIQUE_INDEX_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddPrimaryKeyImpl <em>Add Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddPrimaryKeyImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddPrimaryKey()
	 * @generated
	 */
	int ADD_PRIMARY_KEY = 11;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Underlying Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__UNDERLYING_INDEX_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY__COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMARY_KEY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddForeignKeyImpl <em>Add Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddForeignKeyImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddForeignKey()
	 * @generated
	 */
	int ADD_FOREIGN_KEY = 12;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__TARGET_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constrained Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FOREIGN_KEY_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.AddNotNullConstraintImpl <em>Add Not Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.AddNotNullConstraintImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddNotNullConstraint()
	 * @generated
	 */
	int ADD_NOT_NULL_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT__NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Not Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_NOT_NULL_CONSTRAINT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.RemoveTableConstraintImpl <em>Remove Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RemoveTableConstraintImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveTableConstraint()
	 * @generated
	 */
	int REMOVE_TABLE_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CONSTRAINT__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CONSTRAINT__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CONSTRAINT__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TABLE_CONSTRAINT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.RemoveColumnConstraintImpl <em>Remove Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RemoveColumnConstraintImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveColumnConstraint()
	 * @generated
	 */
	int REMOVE_COLUMN_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_CONSTRAINT__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_CONSTRAINT__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_CONSTRAINT__OWNING_COLUMN_NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_CONSTRAINT__NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Remove Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COLUMN_CONSTRAINT_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.impl.RemoveIndexImpl <em>Remove Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.RemoveIndexImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveIndex()
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
	 * The meta object id for the '{@link mm.rdb.operations.impl.MoveColumnImpl <em>Move Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.impl.MoveColumnImpl
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getMoveColumn()
	 * @generated
	 */
	int MOVE_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN__OWNING_SCHEMA_NAME = MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN__OWNING_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN__NAME = MODEL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN__TARGET_TABLE_NAME = MODEL_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN__TYPE = MODEL_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Move Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_COLUMN_FEATURE_COUNT = MODEL_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link mm.rdb.operations.MergeType <em>Merge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.operations.MergeType
	 * @see mm.rdb.operations.impl.OperationsPackageImpl#getMergeType()
	 * @generated
	 */
	int MERGE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Operation</em>'.
	 * @see mm.rdb.operations.ModelOperation
	 * @generated
	 */
	EClass getModelOperation();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddSchema <em>Add Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Schema</em>'.
	 * @see mm.rdb.operations.AddSchema
	 * @generated
	 */
	EClass getAddSchema();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddSchema#getName()
	 * @see #getAddSchema()
	 * @generated
	 */
	EAttribute getAddSchema_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddSequence <em>Add Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Sequence</em>'.
	 * @see mm.rdb.operations.AddSequence
	 * @generated
	 */
	EClass getAddSequence();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddSequence#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddSequence#getOwningSchemaName()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddSequence#getName()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddSequence#getCacheSize <em>Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Size</em>'.
	 * @see mm.rdb.operations.AddSequence#getCacheSize()
	 * @see #getAddSequence()
	 * @generated
	 */
	EAttribute getAddSequence_CacheSize();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Index</em>'.
	 * @see mm.rdb.operations.AddIndex
	 * @generated
	 */
	EClass getAddIndex();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddIndex#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddIndex#getOwningSchemaName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddIndex#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddIndex#getOwningTableName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddIndex#getName()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_Name();

	/**
	 * Returns the meta object for the attribute list '{@link mm.rdb.operations.AddIndex#getColumnsNames <em>Columns Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Columns Names</em>'.
	 * @see mm.rdb.operations.AddIndex#getColumnsNames()
	 * @see #getAddIndex()
	 * @generated
	 */
	EAttribute getAddIndex_ColumnsNames();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddTable <em>Add Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Table</em>'.
	 * @see mm.rdb.operations.AddTable
	 * @generated
	 */
	EClass getAddTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddTable#getOwningSchemaName()
	 * @see #getAddTable()
	 * @generated
	 */
	EAttribute getAddTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddTable#getName()
	 * @see #getAddTable()
	 * @generated
	 */
	EAttribute getAddTable_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Table</em>'.
	 * @see mm.rdb.operations.RenameTable
	 * @generated
	 */
	EClass getRenameTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RenameTable#getOwningSchemaName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RenameTable#getName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameTable#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.rdb.operations.RenameTable#getNewName()
	 * @see #getRenameTable()
	 * @generated
	 */
	EAttribute getRenameTable_NewName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RemoveTable <em>Remove Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Table</em>'.
	 * @see mm.rdb.operations.RemoveTable
	 * @generated
	 */
	EClass getRemoveTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveTable#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RemoveTable#getOwningSchemaName()
	 * @see #getRemoveTable()
	 * @generated
	 */
	EAttribute getRemoveTable_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RemoveTable#getName()
	 * @see #getRemoveTable()
	 * @generated
	 */
	EAttribute getRemoveTable_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Column</em>'.
	 * @see mm.rdb.operations.AddColumn
	 * @generated
	 */
	EClass getAddColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddColumn#getOwningSchemaName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddColumn#getOwningTableName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddColumn#getName()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.rdb.operations.AddColumn#getType()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddColumn#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.rdb.operations.AddColumn#getDefaultValue()
	 * @see #getAddColumn()
	 * @generated
	 */
	EAttribute getAddColumn_DefaultValue();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Column</em>'.
	 * @see mm.rdb.operations.RenameColumn
	 * @generated
	 */
	EClass getRenameColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RenameColumn#getOwningSchemaName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.RenameColumn#getOwningTableName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RenameColumn#getName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RenameColumn#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see mm.rdb.operations.RenameColumn#getNewName()
	 * @see #getRenameColumn()
	 * @generated
	 */
	EAttribute getRenameColumn_NewName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RemoveColumn <em>Remove Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Column</em>'.
	 * @see mm.rdb.operations.RemoveColumn
	 * @generated
	 */
	EClass getRemoveColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RemoveColumn#getOwningSchemaName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.RemoveColumn#getOwningTableName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RemoveColumn#getName()
	 * @see #getRemoveColumn()
	 * @generated
	 */
	EAttribute getRemoveColumn_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddUniqueIndex <em>Add Unique Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Unique Index</em>'.
	 * @see mm.rdb.operations.AddUniqueIndex
	 * @generated
	 */
	EClass getAddUniqueIndex();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddUniqueIndex#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddUniqueIndex#getOwningSchemaName()
	 * @see #getAddUniqueIndex()
	 * @generated
	 */
	EAttribute getAddUniqueIndex_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddUniqueIndex#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddUniqueIndex#getOwningTableName()
	 * @see #getAddUniqueIndex()
	 * @generated
	 */
	EAttribute getAddUniqueIndex_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddUniqueIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddUniqueIndex#getName()
	 * @see #getAddUniqueIndex()
	 * @generated
	 */
	EAttribute getAddUniqueIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddUniqueIndex#getUnderlyingIndexName <em>Underlying Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlying Index Name</em>'.
	 * @see mm.rdb.operations.AddUniqueIndex#getUnderlyingIndexName()
	 * @see #getAddUniqueIndex()
	 * @generated
	 */
	EAttribute getAddUniqueIndex_UnderlyingIndexName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primary Key</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey
	 * @generated
	 */
	EClass getAddPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddPrimaryKey#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey#getOwningSchemaName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddPrimaryKey#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey#getOwningTableName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddPrimaryKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey#getName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddPrimaryKey#getUnderlyingIndexName <em>Underlying Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlying Index Name</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey#getUnderlyingIndexName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_UnderlyingIndexName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddPrimaryKey#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see mm.rdb.operations.AddPrimaryKey#getColumnName()
	 * @see #getAddPrimaryKey()
	 * @generated
	 */
	EAttribute getAddPrimaryKey_ColumnName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddForeignKey <em>Add Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Foreign Key</em>'.
	 * @see mm.rdb.operations.AddForeignKey
	 * @generated
	 */
	EClass getAddForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddForeignKey#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddForeignKey#getOwningSchemaName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddForeignKey#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddForeignKey#getOwningTableName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddForeignKey#getName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddForeignKey#getTargetTableName <em>Target Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Table Name</em>'.
	 * @see mm.rdb.operations.AddForeignKey#getTargetTableName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_TargetTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddForeignKey#getConstrainedColumnName <em>Constrained Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained Column Name</em>'.
	 * @see mm.rdb.operations.AddForeignKey#getConstrainedColumnName()
	 * @see #getAddForeignKey()
	 * @generated
	 */
	EAttribute getAddForeignKey_ConstrainedColumnName();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.AddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Not Null Constraint</em>'.
	 * @see mm.rdb.operations.AddNotNullConstraint
	 * @generated
	 */
	EClass getAddNotNullConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddNotNullConstraint#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.AddNotNullConstraint#getOwningSchemaName()
	 * @see #getAddNotNullConstraint()
	 * @generated
	 */
	EAttribute getAddNotNullConstraint_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddNotNullConstraint#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.AddNotNullConstraint#getOwningTableName()
	 * @see #getAddNotNullConstraint()
	 * @generated
	 */
	EAttribute getAddNotNullConstraint_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddNotNullConstraint#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.operations.AddNotNullConstraint#getOwningColumnName()
	 * @see #getAddNotNullConstraint()
	 * @generated
	 */
	EAttribute getAddNotNullConstraint_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.AddNotNullConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.AddNotNullConstraint#getName()
	 * @see #getAddNotNullConstraint()
	 * @generated
	 */
	EAttribute getAddNotNullConstraint_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RemoveTableConstraint <em>Remove Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Table Constraint</em>'.
	 * @see mm.rdb.operations.RemoveTableConstraint
	 * @generated
	 */
	EClass getRemoveTableConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveTableConstraint#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RemoveTableConstraint#getOwningSchemaName()
	 * @see #getRemoveTableConstraint()
	 * @generated
	 */
	EAttribute getRemoveTableConstraint_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveTableConstraint#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.RemoveTableConstraint#getOwningTableName()
	 * @see #getRemoveTableConstraint()
	 * @generated
	 */
	EAttribute getRemoveTableConstraint_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveTableConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RemoveTableConstraint#getName()
	 * @see #getRemoveTableConstraint()
	 * @generated
	 */
	EAttribute getRemoveTableConstraint_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RemoveColumnConstraint <em>Remove Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Column Constraint</em>'.
	 * @see mm.rdb.operations.RemoveColumnConstraint
	 * @generated
	 */
	EClass getRemoveColumnConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumnConstraint#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RemoveColumnConstraint#getOwningSchemaName()
	 * @see #getRemoveColumnConstraint()
	 * @generated
	 */
	EAttribute getRemoveColumnConstraint_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumnConstraint#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.RemoveColumnConstraint#getOwningTableName()
	 * @see #getRemoveColumnConstraint()
	 * @generated
	 */
	EAttribute getRemoveColumnConstraint_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumnConstraint#getOwningColumnName <em>Owning Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Column Name</em>'.
	 * @see mm.rdb.operations.RemoveColumnConstraint#getOwningColumnName()
	 * @see #getRemoveColumnConstraint()
	 * @generated
	 */
	EAttribute getRemoveColumnConstraint_OwningColumnName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveColumnConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RemoveColumnConstraint#getName()
	 * @see #getRemoveColumnConstraint()
	 * @generated
	 */
	EAttribute getRemoveColumnConstraint_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.RemoveIndex <em>Remove Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Index</em>'.
	 * @see mm.rdb.operations.RemoveIndex
	 * @generated
	 */
	EClass getRemoveIndex();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveIndex#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.RemoveIndex#getOwningSchemaName()
	 * @see #getRemoveIndex()
	 * @generated
	 */
	EAttribute getRemoveIndex_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.RemoveIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.RemoveIndex#getName()
	 * @see #getRemoveIndex()
	 * @generated
	 */
	EAttribute getRemoveIndex_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.operations.MoveColumn <em>Move Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Column</em>'.
	 * @see mm.rdb.operations.MoveColumn
	 * @generated
	 */
	EClass getMoveColumn();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.MoveColumn#getOwningSchemaName <em>Owning Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Schema Name</em>'.
	 * @see mm.rdb.operations.MoveColumn#getOwningSchemaName()
	 * @see #getMoveColumn()
	 * @generated
	 */
	EAttribute getMoveColumn_OwningSchemaName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.MoveColumn#getOwningTableName <em>Owning Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owning Table Name</em>'.
	 * @see mm.rdb.operations.MoveColumn#getOwningTableName()
	 * @see #getMoveColumn()
	 * @generated
	 */
	EAttribute getMoveColumn_OwningTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.MoveColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.operations.MoveColumn#getName()
	 * @see #getMoveColumn()
	 * @generated
	 */
	EAttribute getMoveColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.MoveColumn#getTargetTableName <em>Target Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Table Name</em>'.
	 * @see mm.rdb.operations.MoveColumn#getTargetTableName()
	 * @see #getMoveColumn()
	 * @generated
	 */
	EAttribute getMoveColumn_TargetTableName();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.operations.MoveColumn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.rdb.operations.MoveColumn#getType()
	 * @see #getMoveColumn()
	 * @generated
	 */
	EAttribute getMoveColumn_Type();

	/**
	 * Returns the meta object for enum '{@link mm.rdb.operations.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Type</em>'.
	 * @see mm.rdb.operations.MergeType
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.ModelOperationImpl <em>Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.ModelOperationImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getModelOperation()
		 * @generated
		 */
		EClass MODEL_OPERATION = eINSTANCE.getModelOperation();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddSchemaImpl <em>Add Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddSchemaImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddSchema()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddSequenceImpl <em>Add Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddSequenceImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddSequence()
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
		 * The meta object literal for the '<em><b>Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SEQUENCE__CACHE_SIZE = eINSTANCE.getAddSequence_CacheSize();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddIndexImpl <em>Add Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddIndexImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddIndex()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddTableImpl <em>Add Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddTableImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddTable()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RenameTableImpl <em>Rename Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RenameTableImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRenameTable()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RemoveTableImpl <em>Remove Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RemoveTableImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveTable()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddColumnImpl <em>Add Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddColumnImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddColumn()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RenameColumnImpl <em>Rename Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RenameColumnImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRenameColumn()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RemoveColumnImpl <em>Remove Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RemoveColumnImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveColumn()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddUniqueIndexImpl <em>Add Unique Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddUniqueIndexImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddUniqueIndex()
		 * @generated
		 */
		EClass ADD_UNIQUE_INDEX = eINSTANCE.getAddUniqueIndex();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME = eINSTANCE.getAddUniqueIndex_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE_INDEX__OWNING_TABLE_NAME = eINSTANCE.getAddUniqueIndex_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE_INDEX__NAME = eINSTANCE.getAddUniqueIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Underlying Index Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME = eINSTANCE.getAddUniqueIndex_UnderlyingIndexName();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddPrimaryKeyImpl <em>Add Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddPrimaryKeyImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddPrimaryKey()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__NAME = eINSTANCE.getAddPrimaryKey_Name();

		/**
		 * The meta object literal for the '<em><b>Underlying Index Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__UNDERLYING_INDEX_NAME = eINSTANCE.getAddPrimaryKey_UnderlyingIndexName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMARY_KEY__COLUMN_NAME = eINSTANCE.getAddPrimaryKey_ColumnName();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddForeignKeyImpl <em>Add Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddForeignKeyImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddForeignKey()
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
		 * The meta object literal for the '<em><b>Constrained Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME = eINSTANCE.getAddForeignKey_ConstrainedColumnName();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.AddNotNullConstraintImpl <em>Add Not Null Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.AddNotNullConstraintImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getAddNotNullConstraint()
		 * @generated
		 */
		EClass ADD_NOT_NULL_CONSTRAINT = eINSTANCE.getAddNotNullConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL_CONSTRAINT__OWNING_SCHEMA_NAME = eINSTANCE.getAddNotNullConstraint_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL_CONSTRAINT__OWNING_TABLE_NAME = eINSTANCE.getAddNotNullConstraint_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL_CONSTRAINT__OWNING_COLUMN_NAME = eINSTANCE.getAddNotNullConstraint_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_NOT_NULL_CONSTRAINT__NAME = eINSTANCE.getAddNotNullConstraint_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RemoveTableConstraintImpl <em>Remove Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RemoveTableConstraintImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveTableConstraint()
		 * @generated
		 */
		EClass REMOVE_TABLE_CONSTRAINT = eINSTANCE.getRemoveTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE_CONSTRAINT__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveTableConstraint_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE_CONSTRAINT__OWNING_TABLE_NAME = eINSTANCE.getRemoveTableConstraint_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TABLE_CONSTRAINT__NAME = eINSTANCE.getRemoveTableConstraint_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RemoveColumnConstraintImpl <em>Remove Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RemoveColumnConstraintImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveColumnConstraint()
		 * @generated
		 */
		EClass REMOVE_COLUMN_CONSTRAINT = eINSTANCE.getRemoveColumnConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN_CONSTRAINT__OWNING_SCHEMA_NAME = eINSTANCE.getRemoveColumnConstraint_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN_CONSTRAINT__OWNING_TABLE_NAME = eINSTANCE.getRemoveColumnConstraint_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Owning Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN_CONSTRAINT__OWNING_COLUMN_NAME = eINSTANCE.getRemoveColumnConstraint_OwningColumnName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COLUMN_CONSTRAINT__NAME = eINSTANCE.getRemoveColumnConstraint_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.impl.RemoveIndexImpl <em>Remove Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.RemoveIndexImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getRemoveIndex()
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
		 * The meta object literal for the '{@link mm.rdb.operations.impl.MoveColumnImpl <em>Move Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.impl.MoveColumnImpl
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getMoveColumn()
		 * @generated
		 */
		EClass MOVE_COLUMN = eINSTANCE.getMoveColumn();

		/**
		 * The meta object literal for the '<em><b>Owning Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_COLUMN__OWNING_SCHEMA_NAME = eINSTANCE.getMoveColumn_OwningSchemaName();

		/**
		 * The meta object literal for the '<em><b>Owning Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_COLUMN__OWNING_TABLE_NAME = eINSTANCE.getMoveColumn_OwningTableName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_COLUMN__NAME = eINSTANCE.getMoveColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Target Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_COLUMN__TARGET_TABLE_NAME = eINSTANCE.getMoveColumn_TargetTableName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_COLUMN__TYPE = eINSTANCE.getMoveColumn_Type();

		/**
		 * The meta object literal for the '{@link mm.rdb.operations.MergeType <em>Merge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.operations.MergeType
		 * @see mm.rdb.operations.impl.OperationsPackageImpl#getMergeType()
		 * @generated
		 */
		EEnum MERGE_TYPE = eINSTANCE.getMergeType();

	}

} //OperationsPackage
