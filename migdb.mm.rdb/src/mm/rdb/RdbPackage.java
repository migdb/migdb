/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

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
 * @see mm.rdb.RdbFactory
 * @model kind="package"
 * @generated
 */
public interface RdbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.collectionspro.eu/jam/mm/rdb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbPackage eINSTANCE = mm.rdb.impl.RdbPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.rdb.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ModelRootImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getModelRoot()
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
	 * The meta object id for the '{@link mm.rdb.impl.ModelGenerationImpl <em>Model Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ModelGenerationImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getModelGeneration()
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
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION__SCHEMAS = 2;

	/**
	 * The number of structural features of the '<em>Model Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_GENERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.SchemaImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Owning Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SEQUENCES = 3;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INDEXES = 4;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.SequenceImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Owning Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CACHE_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.IndexImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 4;

	/**
	 * The feature id for the '<em><b>Owning Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__OWNING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMNS = 2;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.TableImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 5;

	/**
	 * The feature id for the '<em><b>Owning Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OWNING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ColumnImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWNING_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ConstraintImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.TableConstraintImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getTableConstraint()
	 * @generated
	 */
	int TABLE_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__OWNING_TABLE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.UniqueIndexImpl <em>Unique Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.UniqueIndexImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getUniqueIndex()
	 * @generated
	 */
	int UNIQUE_INDEX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_INDEX__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_INDEX__OWNING_TABLE = TABLE_CONSTRAINT__OWNING_TABLE;

	/**
	 * The feature id for the '<em><b>Underlying Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_INDEX__UNDERLYING_INDEX = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_INDEX_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.PrimaryKeyImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = UNIQUE_INDEX__NAME;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__OWNING_TABLE = UNIQUE_INDEX__OWNING_TABLE;

	/**
	 * The feature id for the '<em><b>Underlying Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__UNDERLYING_INDEX = UNIQUE_INDEX__UNDERLYING_INDEX;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = UNIQUE_INDEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ForeignKeyImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OWNING_TABLE = TABLE_CONSTRAINT__OWNING_TABLE;

	/**
	 * The feature id for the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TARGET_TABLE = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constrained Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CONSTRAINED_COLUMN = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.ColumnConstraintImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getColumnConstraint()
	 * @generated
	 */
	int COLUMN_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__OWNING_COLUMN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mm.rdb.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.impl.NotNullConstraintImpl
	 * @see mm.rdb.impl.RdbPackageImpl#getNotNullConstraint()
	 * @generated
	 */
	int NOT_NULL_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Owning Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_CONSTRAINT__OWNING_COLUMN = COLUMN_CONSTRAINT__OWNING_COLUMN;

	/**
	 * The number of structural features of the '<em>Not Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm.rdb.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.PrimitiveType
	 * @see mm.rdb.impl.RdbPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link mm.rdb.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see mm.rdb.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.ModelRoot#getModelGenerations <em>Model Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Generations</em>'.
	 * @see mm.rdb.ModelRoot#getModelGenerations()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ModelGenerations();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.ModelRoot#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see mm.rdb.ModelRoot#getOperations()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Operations();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ModelGeneration <em>Model Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Generation</em>'.
	 * @see mm.rdb.ModelGeneration
	 * @generated
	 */
	EClass getModelGeneration();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.ModelGeneration#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Root</em>'.
	 * @see mm.rdb.ModelGeneration#getModelRoot()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EReference getModelGeneration_ModelRoot();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.ModelGeneration#isIsMissing <em>Is Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Missing</em>'.
	 * @see mm.rdb.ModelGeneration#isIsMissing()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EAttribute getModelGeneration_IsMissing();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.ModelGeneration#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see mm.rdb.ModelGeneration#getSchemas()
	 * @see #getModelGeneration()
	 * @generated
	 */
	EReference getModelGeneration_Schemas();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see mm.rdb.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.Schema#getOwningModel <em>Owning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Model</em>'.
	 * @see mm.rdb.Schema#getOwningModel()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_OwningModel();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see mm.rdb.Schema#getTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Schema#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see mm.rdb.Schema#getSequences()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Sequences();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Schema#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see mm.rdb.Schema#getIndexes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Indexes();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see mm.rdb.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.Sequence#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Schema</em>'.
	 * @see mm.rdb.Sequence#getOwningSchema()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_OwningSchema();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Sequence#getCacheSize <em>Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Size</em>'.
	 * @see mm.rdb.Sequence#getCacheSize()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_CacheSize();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see mm.rdb.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.Index#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Schema</em>'.
	 * @see mm.rdb.Index#getOwningSchema()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_OwningSchema();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for the reference list '{@link mm.rdb.Index#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see mm.rdb.Index#getColumns()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Columns();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see mm.rdb.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.Table#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Schema</em>'.
	 * @see mm.rdb.Table#getOwningSchema()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_OwningSchema();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the reference '{@link mm.rdb.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see mm.rdb.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see mm.rdb.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Table#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see mm.rdb.Table#getConstraints()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraints();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see mm.rdb.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.Column#getOwningTable <em>Owning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Table</em>'.
	 * @see mm.rdb.Column#getOwningTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_OwningTable();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mm.rdb.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Column#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see mm.rdb.Column#getDefaultValue()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.Column#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see mm.rdb.Column#getConstraints()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Constraints();

	/**
	 * Returns the meta object for class '{@link mm.rdb.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see mm.rdb.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm.rdb.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm.rdb.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link mm.rdb.TableConstraint <em>Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Constraint</em>'.
	 * @see mm.rdb.TableConstraint
	 * @generated
	 */
	EClass getTableConstraint();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.TableConstraint#getOwningTable <em>Owning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Table</em>'.
	 * @see mm.rdb.TableConstraint#getOwningTable()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EReference getTableConstraint_OwningTable();

	/**
	 * Returns the meta object for class '{@link mm.rdb.UniqueIndex <em>Unique Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Index</em>'.
	 * @see mm.rdb.UniqueIndex
	 * @generated
	 */
	EClass getUniqueIndex();

	/**
	 * Returns the meta object for the reference '{@link mm.rdb.UniqueIndex#getUnderlyingIndex <em>Underlying Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Underlying Index</em>'.
	 * @see mm.rdb.UniqueIndex#getUnderlyingIndex()
	 * @see #getUniqueIndex()
	 * @generated
	 */
	EReference getUniqueIndex_UnderlyingIndex();

	/**
	 * Returns the meta object for class '{@link mm.rdb.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see mm.rdb.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see mm.rdb.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link mm.rdb.ForeignKey#getTargetTable <em>Target Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Table</em>'.
	 * @see mm.rdb.ForeignKey#getTargetTable()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_TargetTable();

	/**
	 * Returns the meta object for the reference '{@link mm.rdb.ForeignKey#getConstrainedColumn <em>Constrained Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrained Column</em>'.
	 * @see mm.rdb.ForeignKey#getConstrainedColumn()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_ConstrainedColumn();

	/**
	 * Returns the meta object for class '{@link mm.rdb.ColumnConstraint <em>Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Constraint</em>'.
	 * @see mm.rdb.ColumnConstraint
	 * @generated
	 */
	EClass getColumnConstraint();

	/**
	 * Returns the meta object for the container reference '{@link mm.rdb.ColumnConstraint#getOwningColumn <em>Owning Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Column</em>'.
	 * @see mm.rdb.ColumnConstraint#getOwningColumn()
	 * @see #getColumnConstraint()
	 * @generated
	 */
	EReference getColumnConstraint_OwningColumn();

	/**
	 * Returns the meta object for class '{@link mm.rdb.NotNullConstraint <em>Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null Constraint</em>'.
	 * @see mm.rdb.NotNullConstraint
	 * @generated
	 */
	EClass getNotNullConstraint();

	/**
	 * Returns the meta object for enum '{@link mm.rdb.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see mm.rdb.PrimitiveType
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
	RdbFactory getRdbFactory();

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
		 * The meta object literal for the '{@link mm.rdb.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ModelRootImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getModelRoot()
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
		 * The meta object literal for the '{@link mm.rdb.impl.ModelGenerationImpl <em>Model Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ModelGenerationImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getModelGeneration()
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
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_GENERATION__SCHEMAS = eINSTANCE.getModelGeneration_Schemas();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.SchemaImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Owning Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__OWNING_MODEL = eINSTANCE.getSchema_OwningModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SEQUENCES = eINSTANCE.getSchema_Sequences();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__INDEXES = eINSTANCE.getSchema_Indexes();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.SequenceImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Owning Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__OWNING_SCHEMA = eINSTANCE.getSequence_OwningSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__CACHE_SIZE = eINSTANCE.getSequence_CacheSize();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.IndexImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Owning Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__OWNING_SCHEMA = eINSTANCE.getIndex_OwningSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__COLUMNS = eINSTANCE.getIndex_Columns();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.TableImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Owning Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__OWNING_SCHEMA = eINSTANCE.getTable_OwningSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINTS = eINSTANCE.getTable_Constraints();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ColumnImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Owning Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__OWNING_TABLE = eINSTANCE.getColumn_OwningTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DEFAULT_VALUE = eINSTANCE.getColumn_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CONSTRAINTS = eINSTANCE.getColumn_Constraints();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ConstraintImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.TableConstraintImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getTableConstraint()
		 * @generated
		 */
		EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONSTRAINT__OWNING_TABLE = eINSTANCE.getTableConstraint_OwningTable();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.UniqueIndexImpl <em>Unique Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.UniqueIndexImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getUniqueIndex()
		 * @generated
		 */
		EClass UNIQUE_INDEX = eINSTANCE.getUniqueIndex();

		/**
		 * The meta object literal for the '<em><b>Underlying Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_INDEX__UNDERLYING_INDEX = eINSTANCE.getUniqueIndex_UnderlyingIndex();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.PrimaryKeyImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ForeignKeyImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Target Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__TARGET_TABLE = eINSTANCE.getForeignKey_TargetTable();

		/**
		 * The meta object literal for the '<em><b>Constrained Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__CONSTRAINED_COLUMN = eINSTANCE.getForeignKey_ConstrainedColumn();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.ColumnConstraintImpl <em>Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.ColumnConstraintImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getColumnConstraint()
		 * @generated
		 */
		EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

		/**
		 * The meta object literal for the '<em><b>Owning Column</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_CONSTRAINT__OWNING_COLUMN = eINSTANCE.getColumnConstraint_OwningColumn();

		/**
		 * The meta object literal for the '{@link mm.rdb.impl.NotNullConstraintImpl <em>Not Null Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.impl.NotNullConstraintImpl
		 * @see mm.rdb.impl.RdbPackageImpl#getNotNullConstraint()
		 * @generated
		 */
		EClass NOT_NULL_CONSTRAINT = eINSTANCE.getNotNullConstraint();

		/**
		 * The meta object literal for the '{@link mm.rdb.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.PrimitiveType
		 * @see mm.rdb.impl.RdbPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //RdbPackage
