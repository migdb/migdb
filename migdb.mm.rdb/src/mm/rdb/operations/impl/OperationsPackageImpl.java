/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.RdbPackage;

import mm.rdb.dml.DmlPackage;

import mm.rdb.dml.impl.DmlPackageImpl;

import mm.rdb.impl.RdbPackageImpl;

import mm.rdb.operations.AddColumn;
import mm.rdb.operations.AddForeignKey;
import mm.rdb.operations.AddIndex;
import mm.rdb.operations.AddNotNullConstraint;
import mm.rdb.operations.AddPrimaryKey;
import mm.rdb.operations.AddSchema;
import mm.rdb.operations.AddSequence;
import mm.rdb.operations.AddTable;
import mm.rdb.operations.AddUniqueIndex;
import mm.rdb.operations.ModelOperation;
import mm.rdb.operations.OperationsFactory;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationsPackageImpl extends EPackageImpl implements OperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addUniqueIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addPrimaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addForeignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNotNullConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mm.rdb.operations.OperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationsPackageImpl() {
		super(eNS_URI, OperationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationsPackage init() {
		if (isInited) return (OperationsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI);

		// Obtain or create and register package
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RdbPackageImpl theRdbPackage = (RdbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) instanceof RdbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) : RdbPackage.eINSTANCE);
		DmlPackageImpl theDmlPackage = (DmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DmlPackage.eNS_URI) instanceof DmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DmlPackage.eNS_URI) : DmlPackage.eINSTANCE);

		// Create package meta-data objects
		theOperationsPackage.createPackageContents();
		theRdbPackage.createPackageContents();
		theDmlPackage.createPackageContents();

		// Initialize created meta-data
		theOperationsPackage.initializePackageContents();
		theRdbPackage.initializePackageContents();
		theDmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationsPackage.eNS_URI, theOperationsPackage);
		return theOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelOperation() {
		return modelOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSchema() {
		return addSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSchema_Name() {
		return (EAttribute)addSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSequence() {
		return addSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSequence_OwningSchemaName() {
		return (EAttribute)addSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSequence_Name() {
		return (EAttribute)addSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSequence_CacheSize() {
		return (EAttribute)addSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddIndex() {
		return addIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIndex_OwningSchemaName() {
		return (EAttribute)addIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIndex_OwningTableName() {
		return (EAttribute)addIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIndex_Name() {
		return (EAttribute)addIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIndex_ColumnsNames() {
		return (EAttribute)addIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddTable() {
		return addTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTable_OwningSchemaName() {
		return (EAttribute)addTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTable_Name() {
		return (EAttribute)addTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddColumn() {
		return addColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddColumn_OwningSchemaName() {
		return (EAttribute)addColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddColumn_OwningTableName() {
		return (EAttribute)addColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddColumn_Name() {
		return (EAttribute)addColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddColumn_Type() {
		return (EAttribute)addColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddColumn_DefaultValue() {
		return (EAttribute)addColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddUniqueIndex() {
		return addUniqueIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUniqueIndex_OwningSchemaName() {
		return (EAttribute)addUniqueIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUniqueIndex_OwningTableName() {
		return (EAttribute)addUniqueIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUniqueIndex_Name() {
		return (EAttribute)addUniqueIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUniqueIndex_UnderlyingIndexName() {
		return (EAttribute)addUniqueIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddPrimaryKey() {
		return addPrimaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimaryKey_OwningSchemaName() {
		return (EAttribute)addPrimaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimaryKey_OwningTableName() {
		return (EAttribute)addPrimaryKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimaryKey_Name() {
		return (EAttribute)addPrimaryKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimaryKey_UnderlyingIndexName() {
		return (EAttribute)addPrimaryKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddForeignKey() {
		return addForeignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_OwningSchemaName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_OwningTableName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_Name() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_TargetTableName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_ConstrainedColumnName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_TargetColumnsNames() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNotNullConstraint() {
		return addNotNullConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNullConstraint_OwningSchemaName() {
		return (EAttribute)addNotNullConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNullConstraint_OwningTableName() {
		return (EAttribute)addNotNullConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNullConstraint_OwningColumnName() {
		return (EAttribute)addNotNullConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNullConstraint_Name() {
		return (EAttribute)addNotNullConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactory getOperationsFactory() {
		return (OperationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelOperationEClass = createEClass(MODEL_OPERATION);

		addSchemaEClass = createEClass(ADD_SCHEMA);
		createEAttribute(addSchemaEClass, ADD_SCHEMA__NAME);

		addSequenceEClass = createEClass(ADD_SEQUENCE);
		createEAttribute(addSequenceEClass, ADD_SEQUENCE__OWNING_SCHEMA_NAME);
		createEAttribute(addSequenceEClass, ADD_SEQUENCE__NAME);
		createEAttribute(addSequenceEClass, ADD_SEQUENCE__CACHE_SIZE);

		addIndexEClass = createEClass(ADD_INDEX);
		createEAttribute(addIndexEClass, ADD_INDEX__OWNING_SCHEMA_NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__OWNING_TABLE_NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__COLUMNS_NAMES);

		addTableEClass = createEClass(ADD_TABLE);
		createEAttribute(addTableEClass, ADD_TABLE__OWNING_SCHEMA_NAME);
		createEAttribute(addTableEClass, ADD_TABLE__NAME);

		addColumnEClass = createEClass(ADD_COLUMN);
		createEAttribute(addColumnEClass, ADD_COLUMN__OWNING_SCHEMA_NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__OWNING_TABLE_NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__TYPE);
		createEAttribute(addColumnEClass, ADD_COLUMN__DEFAULT_VALUE);

		addUniqueIndexEClass = createEClass(ADD_UNIQUE_INDEX);
		createEAttribute(addUniqueIndexEClass, ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME);
		createEAttribute(addUniqueIndexEClass, ADD_UNIQUE_INDEX__OWNING_TABLE_NAME);
		createEAttribute(addUniqueIndexEClass, ADD_UNIQUE_INDEX__NAME);
		createEAttribute(addUniqueIndexEClass, ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME);

		addPrimaryKeyEClass = createEClass(ADD_PRIMARY_KEY);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__OWNING_SCHEMA_NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__OWNING_TABLE_NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__UNDERLYING_INDEX_NAME);

		addForeignKeyEClass = createEClass(ADD_FOREIGN_KEY);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__OWNING_TABLE_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__TARGET_TABLE_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES);

		addNotNullConstraintEClass = createEClass(ADD_NOT_NULL_CONSTRAINT);
		createEAttribute(addNotNullConstraintEClass, ADD_NOT_NULL_CONSTRAINT__OWNING_SCHEMA_NAME);
		createEAttribute(addNotNullConstraintEClass, ADD_NOT_NULL_CONSTRAINT__OWNING_TABLE_NAME);
		createEAttribute(addNotNullConstraintEClass, ADD_NOT_NULL_CONSTRAINT__OWNING_COLUMN_NAME);
		createEAttribute(addNotNullConstraintEClass, ADD_NOT_NULL_CONSTRAINT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RdbPackage theRdbPackage = (RdbPackage)EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addSchemaEClass.getESuperTypes().add(this.getModelOperation());
		addSequenceEClass.getESuperTypes().add(this.getModelOperation());
		addIndexEClass.getESuperTypes().add(this.getModelOperation());
		addTableEClass.getESuperTypes().add(this.getModelOperation());
		addColumnEClass.getESuperTypes().add(this.getModelOperation());
		addUniqueIndexEClass.getESuperTypes().add(this.getModelOperation());
		addPrimaryKeyEClass.getESuperTypes().add(this.getModelOperation());
		addForeignKeyEClass.getESuperTypes().add(this.getModelOperation());
		addNotNullConstraintEClass.getESuperTypes().add(this.getModelOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(modelOperationEClass, ModelOperation.class, "ModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSchemaEClass, AddSchema.class, "AddSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSequenceEClass, AddSequence.class, "AddSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSequence_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSequence_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSequence_CacheSize(), ecorePackage.getEInt(), "cacheSize", null, 0, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addIndexEClass, AddIndex.class, "AddIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddIndex_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_ColumnsNames(), ecorePackage.getEString(), "columnsNames", null, 1, -1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTableEClass, AddTable.class, "AddTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddTable_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addColumnEClass, AddColumn.class, "AddColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddColumn_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_Type(), theRdbPackage.getPrimitiveType(), "type", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addUniqueIndexEClass, AddUniqueIndex.class, "AddUniqueIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddUniqueIndex_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddUniqueIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUniqueIndex_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddUniqueIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUniqueIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddUniqueIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUniqueIndex_UnderlyingIndexName(), ecorePackage.getEString(), "underlyingIndexName", null, 1, 1, AddUniqueIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addPrimaryKeyEClass, AddPrimaryKey.class, "AddPrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddPrimaryKey_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_UnderlyingIndexName(), ecorePackage.getEString(), "underlyingIndexName", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addForeignKeyEClass, AddForeignKey.class, "AddForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddForeignKey_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_TargetTableName(), ecorePackage.getEString(), "targetTableName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_ConstrainedColumnName(), ecorePackage.getEString(), "constrainedColumnName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_TargetColumnsNames(), ecorePackage.getEString(), "targetColumnsNames", null, 1, -1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addNotNullConstraintEClass, AddNotNullConstraint.class, "AddNotNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddNotNullConstraint_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddNotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNullConstraint_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddNotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNullConstraint_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, AddNotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNullConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddNotNullConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //OperationsPackageImpl
