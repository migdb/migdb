/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops.impl;

import mm.rdb.RdbPackage;

import mm.rdb.impl.RdbPackageImpl;

import mm.rdb.ops.AddColumn;
import mm.rdb.ops.AddForeignKey;
import mm.rdb.ops.AddIndex;
import mm.rdb.ops.AddInstances;
import mm.rdb.ops.AddNotNull;
import mm.rdb.ops.AddPrimaryKey;
import mm.rdb.ops.AddSchema;
import mm.rdb.ops.AddSequence;
import mm.rdb.ops.AddTable;
import mm.rdb.ops.AddUnique;
import mm.rdb.ops.CopyInstances;
import mm.rdb.ops.GenerateSequenceNumbers;
import mm.rdb.ops.HasNoInstances;
import mm.rdb.ops.HasNoOwnInstances;
import mm.rdb.ops.InsertInstances;
import mm.rdb.ops.MergeType;
import mm.rdb.ops.ModelOperation;
import mm.rdb.ops.OpsFactory;
import mm.rdb.ops.OpsPackage;
import mm.rdb.ops.RemoveColumn;
import mm.rdb.ops.RemoveConstraint;
import mm.rdb.ops.RemoveDefaultValue;
import mm.rdb.ops.RemoveIndex;
import mm.rdb.ops.RemoveSequence;
import mm.rdb.ops.RemoveTable;
import mm.rdb.ops.RenameColumn;
import mm.rdb.ops.RenameTable;
import mm.rdb.ops.SetColumnDefaultValue;
import mm.rdb.ops.SetColumnType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpsPackageImpl extends EPackageImpl implements OpsPackage {
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
	private EClass renameTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeTableEClass = null;

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
	private EClass renameColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addUniqueEClass = null;

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
	private EClass removeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addNotNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setColumnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setColumnDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasNoOwnInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasNoInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generateSequenceNumbersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeTypeEEnum = null;

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
	 * @see mm.rdb.ops.OpsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpsPackageImpl() {
		super(eNS_URI, OpsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpsPackage init() {
		if (isInited) return (OpsPackage)EPackage.Registry.INSTANCE.getEPackage(OpsPackage.eNS_URI);

		// Obtain or create and register package
		OpsPackageImpl theOpsPackage = (OpsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RdbPackageImpl theRdbPackage = (RdbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) instanceof RdbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) : RdbPackage.eINSTANCE);

		// Create package meta-data objects
		theOpsPackage.createPackageContents();
		theRdbPackage.createPackageContents();

		// Initialize created meta-data
		theOpsPackage.initializePackageContents();
		theRdbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpsPackage.eNS_URI, theOpsPackage);
		return theOpsPackage;
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
	public EAttribute getAddSequence_StartValue() {
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
	public EClass getRenameTable() {
		return renameTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameTable_OwningSchemaName() {
		return (EAttribute)renameTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameTable_Name() {
		return (EAttribute)renameTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameTable_NewName() {
		return (EAttribute)renameTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveTable() {
		return removeTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveTable_OwningSchemaName() {
		return (EAttribute)removeTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveTable_Name() {
		return (EAttribute)removeTableEClass.getEStructuralFeatures().get(1);
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
	public EClass getRenameColumn() {
		return renameColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameColumn_OwningSchemaName() {
		return (EAttribute)renameColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameColumn_OwningTableName() {
		return (EAttribute)renameColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameColumn_Name() {
		return (EAttribute)renameColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameColumn_NewName() {
		return (EAttribute)renameColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyInstances() {
		return copyInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_OwningSchemaName() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_OwningTableName() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_SourceColumnName() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_TargetTableName() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_TargetColumnName() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyInstances_Type() {
		return (EAttribute)copyInstancesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveColumn() {
		return removeColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveColumn_OwningSchemaName() {
		return (EAttribute)removeColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveColumn_OwningTableName() {
		return (EAttribute)removeColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveColumn_Name() {
		return (EAttribute)removeColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddUnique() {
		return addUniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUnique_OwningSchemaName() {
		return (EAttribute)addUniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUnique_OwningTableName() {
		return (EAttribute)addUniqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUnique_Name() {
		return (EAttribute)addUniqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddUnique_OwningColumnName() {
		return (EAttribute)addUniqueEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getAddPrimaryKey_OwningColumnName() {
		return (EAttribute)addPrimaryKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimaryKey_Name() {
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
	public EAttribute getAddForeignKey_OwningColumnName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_Name() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddForeignKey_TargetTableName() {
		return (EAttribute)addForeignKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveConstraint() {
		return removeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveConstraint_OwningSchemaName() {
		return (EAttribute)removeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveConstraint_OwningTableName() {
		return (EAttribute)removeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveConstraint_Name() {
		return (EAttribute)removeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddNotNull() {
		return addNotNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNull_OwningSchemaName() {
		return (EAttribute)addNotNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNull_OwningTableName() {
		return (EAttribute)addNotNullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNull_OwningColumnName() {
		return (EAttribute)addNotNullEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddNotNull_Name() {
		return (EAttribute)addNotNullEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveIndex() {
		return removeIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveIndex_OwningSchemaName() {
		return (EAttribute)removeIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveIndex_Name() {
		return (EAttribute)removeIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetColumnType() {
		return setColumnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnType_OwningSchemaName() {
		return (EAttribute)setColumnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnType_OwningTableName() {
		return (EAttribute)setColumnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnType_OwningColumnName() {
		return (EAttribute)setColumnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnType_NewType() {
		return (EAttribute)setColumnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnType_OldType() {
		return (EAttribute)setColumnTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetColumnDefaultValue() {
		return setColumnDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnDefaultValue_OwningSchemaName() {
		return (EAttribute)setColumnDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnDefaultValue_OwningTableName() {
		return (EAttribute)setColumnDefaultValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnDefaultValue_OwningColumnName() {
		return (EAttribute)setColumnDefaultValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetColumnDefaultValue_NewDefaultValue() {
		return (EAttribute)setColumnDefaultValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveDefaultValue() {
		return removeDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveDefaultValue_OwningSchemaName() {
		return (EAttribute)removeDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveDefaultValue_OwningTableName() {
		return (EAttribute)removeDefaultValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveDefaultValue_OwningColumnName() {
		return (EAttribute)removeDefaultValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveSequence() {
		return removeSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveSequence_SequenceName() {
		return (EAttribute)removeSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveSequence_OwningSchemaName() {
		return (EAttribute)removeSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasNoOwnInstances() {
		return hasNoOwnInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasNoOwnInstances_OwningSchemaName() {
		return (EAttribute)hasNoOwnInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasNoOwnInstances_TableName() {
		return (EAttribute)hasNoOwnInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasNoOwnInstances_DescendantsNames() {
		return (EAttribute)hasNoOwnInstancesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasNoInstances() {
		return hasNoInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasNoInstances_OwningSchemaName() {
		return (EAttribute)hasNoInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasNoInstances_TableName() {
		return (EAttribute)hasNoInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddInstances() {
		return addInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInstances_OwningSchemaName() {
		return (EAttribute)addInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInstances_SourceTableName() {
		return (EAttribute)addInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddInstances_TargetTableNames() {
		return (EAttribute)addInstancesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertInstances() {
		return insertInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertInstances_OwningSchemaName() {
		return (EAttribute)insertInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertInstances_SourceTableName() {
		return (EAttribute)insertInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertInstances_TargetTableName() {
		return (EAttribute)insertInstancesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertInstances_SourceColumnsNames() {
		return (EAttribute)insertInstancesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertInstances_TargetColumnsNames() {
		return (EAttribute)insertInstancesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerateSequenceNumbers() {
		return generateSequenceNumbersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerateSequenceNumbers_OwningSchemaName() {
		return (EAttribute)generateSequenceNumbersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerateSequenceNumbers_TableName() {
		return (EAttribute)generateSequenceNumbersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerateSequenceNumbers_ColumnName() {
		return (EAttribute)generateSequenceNumbersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerateSequenceNumbers_SequenceName() {
		return (EAttribute)generateSequenceNumbersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMergeType() {
		return mergeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsFactory getOpsFactory() {
		return (OpsFactory)getEFactoryInstance();
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
		createEAttribute(addSequenceEClass, ADD_SEQUENCE__START_VALUE);

		addIndexEClass = createEClass(ADD_INDEX);
		createEAttribute(addIndexEClass, ADD_INDEX__OWNING_SCHEMA_NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__OWNING_TABLE_NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__NAME);
		createEAttribute(addIndexEClass, ADD_INDEX__COLUMNS_NAMES);

		addTableEClass = createEClass(ADD_TABLE);
		createEAttribute(addTableEClass, ADD_TABLE__OWNING_SCHEMA_NAME);
		createEAttribute(addTableEClass, ADD_TABLE__NAME);

		renameTableEClass = createEClass(RENAME_TABLE);
		createEAttribute(renameTableEClass, RENAME_TABLE__OWNING_SCHEMA_NAME);
		createEAttribute(renameTableEClass, RENAME_TABLE__NAME);
		createEAttribute(renameTableEClass, RENAME_TABLE__NEW_NAME);

		removeTableEClass = createEClass(REMOVE_TABLE);
		createEAttribute(removeTableEClass, REMOVE_TABLE__OWNING_SCHEMA_NAME);
		createEAttribute(removeTableEClass, REMOVE_TABLE__NAME);

		addColumnEClass = createEClass(ADD_COLUMN);
		createEAttribute(addColumnEClass, ADD_COLUMN__OWNING_SCHEMA_NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__OWNING_TABLE_NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__NAME);
		createEAttribute(addColumnEClass, ADD_COLUMN__TYPE);
		createEAttribute(addColumnEClass, ADD_COLUMN__DEFAULT_VALUE);

		renameColumnEClass = createEClass(RENAME_COLUMN);
		createEAttribute(renameColumnEClass, RENAME_COLUMN__OWNING_SCHEMA_NAME);
		createEAttribute(renameColumnEClass, RENAME_COLUMN__OWNING_TABLE_NAME);
		createEAttribute(renameColumnEClass, RENAME_COLUMN__NAME);
		createEAttribute(renameColumnEClass, RENAME_COLUMN__NEW_NAME);

		copyInstancesEClass = createEClass(COPY_INSTANCES);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__OWNING_SCHEMA_NAME);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__OWNING_TABLE_NAME);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__SOURCE_COLUMN_NAME);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__TARGET_TABLE_NAME);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__TARGET_COLUMN_NAME);
		createEAttribute(copyInstancesEClass, COPY_INSTANCES__TYPE);

		removeColumnEClass = createEClass(REMOVE_COLUMN);
		createEAttribute(removeColumnEClass, REMOVE_COLUMN__OWNING_SCHEMA_NAME);
		createEAttribute(removeColumnEClass, REMOVE_COLUMN__OWNING_TABLE_NAME);
		createEAttribute(removeColumnEClass, REMOVE_COLUMN__NAME);

		addUniqueEClass = createEClass(ADD_UNIQUE);
		createEAttribute(addUniqueEClass, ADD_UNIQUE__OWNING_SCHEMA_NAME);
		createEAttribute(addUniqueEClass, ADD_UNIQUE__OWNING_TABLE_NAME);
		createEAttribute(addUniqueEClass, ADD_UNIQUE__NAME);
		createEAttribute(addUniqueEClass, ADD_UNIQUE__OWNING_COLUMN_NAME);

		addPrimaryKeyEClass = createEClass(ADD_PRIMARY_KEY);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__OWNING_SCHEMA_NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__OWNING_TABLE_NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__OWNING_COLUMN_NAME);
		createEAttribute(addPrimaryKeyEClass, ADD_PRIMARY_KEY__NAME);

		addForeignKeyEClass = createEClass(ADD_FOREIGN_KEY);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__OWNING_TABLE_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__OWNING_COLUMN_NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__NAME);
		createEAttribute(addForeignKeyEClass, ADD_FOREIGN_KEY__TARGET_TABLE_NAME);

		removeConstraintEClass = createEClass(REMOVE_CONSTRAINT);
		createEAttribute(removeConstraintEClass, REMOVE_CONSTRAINT__OWNING_SCHEMA_NAME);
		createEAttribute(removeConstraintEClass, REMOVE_CONSTRAINT__OWNING_TABLE_NAME);
		createEAttribute(removeConstraintEClass, REMOVE_CONSTRAINT__NAME);

		addNotNullEClass = createEClass(ADD_NOT_NULL);
		createEAttribute(addNotNullEClass, ADD_NOT_NULL__OWNING_SCHEMA_NAME);
		createEAttribute(addNotNullEClass, ADD_NOT_NULL__OWNING_TABLE_NAME);
		createEAttribute(addNotNullEClass, ADD_NOT_NULL__OWNING_COLUMN_NAME);
		createEAttribute(addNotNullEClass, ADD_NOT_NULL__NAME);

		removeIndexEClass = createEClass(REMOVE_INDEX);
		createEAttribute(removeIndexEClass, REMOVE_INDEX__OWNING_SCHEMA_NAME);
		createEAttribute(removeIndexEClass, REMOVE_INDEX__NAME);

		setColumnTypeEClass = createEClass(SET_COLUMN_TYPE);
		createEAttribute(setColumnTypeEClass, SET_COLUMN_TYPE__OWNING_SCHEMA_NAME);
		createEAttribute(setColumnTypeEClass, SET_COLUMN_TYPE__OWNING_TABLE_NAME);
		createEAttribute(setColumnTypeEClass, SET_COLUMN_TYPE__OWNING_COLUMN_NAME);
		createEAttribute(setColumnTypeEClass, SET_COLUMN_TYPE__NEW_TYPE);
		createEAttribute(setColumnTypeEClass, SET_COLUMN_TYPE__OLD_TYPE);

		setColumnDefaultValueEClass = createEClass(SET_COLUMN_DEFAULT_VALUE);
		createEAttribute(setColumnDefaultValueEClass, SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME);
		createEAttribute(setColumnDefaultValueEClass, SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME);
		createEAttribute(setColumnDefaultValueEClass, SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME);
		createEAttribute(setColumnDefaultValueEClass, SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE);

		removeDefaultValueEClass = createEClass(REMOVE_DEFAULT_VALUE);
		createEAttribute(removeDefaultValueEClass, REMOVE_DEFAULT_VALUE__OWNING_SCHEMA_NAME);
		createEAttribute(removeDefaultValueEClass, REMOVE_DEFAULT_VALUE__OWNING_TABLE_NAME);
		createEAttribute(removeDefaultValueEClass, REMOVE_DEFAULT_VALUE__OWNING_COLUMN_NAME);

		removeSequenceEClass = createEClass(REMOVE_SEQUENCE);
		createEAttribute(removeSequenceEClass, REMOVE_SEQUENCE__SEQUENCE_NAME);
		createEAttribute(removeSequenceEClass, REMOVE_SEQUENCE__OWNING_SCHEMA_NAME);

		hasNoOwnInstancesEClass = createEClass(HAS_NO_OWN_INSTANCES);
		createEAttribute(hasNoOwnInstancesEClass, HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME);
		createEAttribute(hasNoOwnInstancesEClass, HAS_NO_OWN_INSTANCES__TABLE_NAME);
		createEAttribute(hasNoOwnInstancesEClass, HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES);

		hasNoInstancesEClass = createEClass(HAS_NO_INSTANCES);
		createEAttribute(hasNoInstancesEClass, HAS_NO_INSTANCES__OWNING_SCHEMA_NAME);
		createEAttribute(hasNoInstancesEClass, HAS_NO_INSTANCES__TABLE_NAME);

		addInstancesEClass = createEClass(ADD_INSTANCES);
		createEAttribute(addInstancesEClass, ADD_INSTANCES__OWNING_SCHEMA_NAME);
		createEAttribute(addInstancesEClass, ADD_INSTANCES__SOURCE_TABLE_NAME);
		createEAttribute(addInstancesEClass, ADD_INSTANCES__TARGET_TABLE_NAMES);

		insertInstancesEClass = createEClass(INSERT_INSTANCES);
		createEAttribute(insertInstancesEClass, INSERT_INSTANCES__OWNING_SCHEMA_NAME);
		createEAttribute(insertInstancesEClass, INSERT_INSTANCES__SOURCE_TABLE_NAME);
		createEAttribute(insertInstancesEClass, INSERT_INSTANCES__TARGET_TABLE_NAME);
		createEAttribute(insertInstancesEClass, INSERT_INSTANCES__SOURCE_COLUMNS_NAMES);
		createEAttribute(insertInstancesEClass, INSERT_INSTANCES__TARGET_COLUMNS_NAMES);

		generateSequenceNumbersEClass = createEClass(GENERATE_SEQUENCE_NUMBERS);
		createEAttribute(generateSequenceNumbersEClass, GENERATE_SEQUENCE_NUMBERS__OWNING_SCHEMA_NAME);
		createEAttribute(generateSequenceNumbersEClass, GENERATE_SEQUENCE_NUMBERS__TABLE_NAME);
		createEAttribute(generateSequenceNumbersEClass, GENERATE_SEQUENCE_NUMBERS__COLUMN_NAME);
		createEAttribute(generateSequenceNumbersEClass, GENERATE_SEQUENCE_NUMBERS__SEQUENCE_NAME);

		// Create enums
		mergeTypeEEnum = createEEnum(MERGE_TYPE);
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
		renameTableEClass.getESuperTypes().add(this.getModelOperation());
		removeTableEClass.getESuperTypes().add(this.getModelOperation());
		addColumnEClass.getESuperTypes().add(this.getModelOperation());
		renameColumnEClass.getESuperTypes().add(this.getModelOperation());
		copyInstancesEClass.getESuperTypes().add(this.getModelOperation());
		removeColumnEClass.getESuperTypes().add(this.getModelOperation());
		addUniqueEClass.getESuperTypes().add(this.getModelOperation());
		addPrimaryKeyEClass.getESuperTypes().add(this.getModelOperation());
		addForeignKeyEClass.getESuperTypes().add(this.getModelOperation());
		removeConstraintEClass.getESuperTypes().add(this.getModelOperation());
		addNotNullEClass.getESuperTypes().add(this.getModelOperation());
		removeIndexEClass.getESuperTypes().add(this.getModelOperation());
		setColumnTypeEClass.getESuperTypes().add(this.getModelOperation());
		setColumnDefaultValueEClass.getESuperTypes().add(this.getModelOperation());
		removeDefaultValueEClass.getESuperTypes().add(this.getModelOperation());
		removeSequenceEClass.getESuperTypes().add(this.getModelOperation());
		hasNoOwnInstancesEClass.getESuperTypes().add(this.getModelOperation());
		hasNoInstancesEClass.getESuperTypes().add(this.getModelOperation());
		addInstancesEClass.getESuperTypes().add(this.getModelOperation());
		insertInstancesEClass.getESuperTypes().add(this.getModelOperation());
		generateSequenceNumbersEClass.getESuperTypes().add(this.getModelOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(modelOperationEClass, ModelOperation.class, "ModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSchemaEClass, AddSchema.class, "AddSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSequenceEClass, AddSequence.class, "AddSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSequence_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSequence_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSequence_StartValue(), ecorePackage.getEInt(), "startValue", null, 1, 1, AddSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addIndexEClass, AddIndex.class, "AddIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddIndex_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIndex_ColumnsNames(), ecorePackage.getEString(), "columnsNames", null, 1, -1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTableEClass, AddTable.class, "AddTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddTable_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameTableEClass, RenameTable.class, "RenameTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameTable_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RenameTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, RenameTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameTable_NewName(), ecorePackage.getEString(), "newName", null, 1, 1, RenameTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeTableEClass, RemoveTable.class, "RemoveTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveTable_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addColumnEClass, AddColumn.class, "AddColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddColumn_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_Type(), theRdbPackage.getPrimitiveType(), "type", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddColumn_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameColumnEClass, RenameColumn.class, "RenameColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameColumn_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RenameColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameColumn_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, RenameColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, RenameColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameColumn_NewName(), ecorePackage.getEString(), "newName", null, 1, 1, RenameColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyInstancesEClass, CopyInstances.class, "CopyInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyInstances_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyInstances_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyInstances_SourceColumnName(), ecorePackage.getEString(), "sourceColumnName", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyInstances_TargetTableName(), ecorePackage.getEString(), "targetTableName", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyInstances_TargetColumnName(), ecorePackage.getEString(), "targetColumnName", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyInstances_Type(), this.getMergeType(), "type", null, 1, 1, CopyInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeColumnEClass, RemoveColumn.class, "RemoveColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveColumn_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveColumn_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, RemoveColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addUniqueEClass, AddUnique.class, "AddUnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddUnique_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUnique_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUnique_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddUnique_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, AddUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addPrimaryKeyEClass, AddPrimaryKey.class, "AddPrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddPrimaryKey_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", "", 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimaryKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddPrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addForeignKeyEClass, AddForeignKey.class, "AddForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddForeignKey_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddForeignKey_TargetTableName(), ecorePackage.getEString(), "targetTableName", null, 1, 1, AddForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeConstraintEClass, RemoveConstraint.class, "RemoveConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveConstraint_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveConstraint_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, RemoveConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addNotNullEClass, AddNotNull.class, "AddNotNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddNotNull_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddNotNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNull_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, AddNotNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNull_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, AddNotNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddNotNull_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddNotNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeIndexEClass, RemoveIndex.class, "RemoveIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveIndex_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setColumnTypeEClass, SetColumnType.class, "SetColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetColumnType_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, SetColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnType_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, SetColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnType_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, SetColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnType_NewType(), theRdbPackage.getPrimitiveType(), "newType", null, 1, 1, SetColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnType_OldType(), theRdbPackage.getPrimitiveType(), "oldType", null, 1, 1, SetColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setColumnDefaultValueEClass, SetColumnDefaultValue.class, "SetColumnDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetColumnDefaultValue_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, SetColumnDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnDefaultValue_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, SetColumnDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnDefaultValue_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, SetColumnDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetColumnDefaultValue_NewDefaultValue(), ecorePackage.getEString(), "newDefaultValue", null, 1, 1, SetColumnDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeDefaultValueEClass, RemoveDefaultValue.class, "RemoveDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveDefaultValue_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveDefaultValue_OwningTableName(), ecorePackage.getEString(), "owningTableName", null, 1, 1, RemoveDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveDefaultValue_OwningColumnName(), ecorePackage.getEString(), "owningColumnName", null, 1, 1, RemoveDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeSequenceEClass, RemoveSequence.class, "RemoveSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveSequence_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 1, 1, RemoveSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveSequence_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, RemoveSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasNoOwnInstancesEClass, HasNoOwnInstances.class, "HasNoOwnInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasNoOwnInstances_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, HasNoOwnInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHasNoOwnInstances_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, HasNoOwnInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHasNoOwnInstances_DescendantsNames(), ecorePackage.getEString(), "descendantsNames", null, 0, -1, HasNoOwnInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasNoInstancesEClass, HasNoInstances.class, "HasNoInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasNoInstances_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, HasNoInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHasNoInstances_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, HasNoInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addInstancesEClass, AddInstances.class, "AddInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddInstances_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, AddInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddInstances_SourceTableName(), ecorePackage.getEString(), "sourceTableName", null, 1, 1, AddInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddInstances_TargetTableNames(), ecorePackage.getEString(), "targetTableNames", null, 1, -1, AddInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertInstancesEClass, InsertInstances.class, "InsertInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertInstances_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, InsertInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertInstances_SourceTableName(), ecorePackage.getEString(), "sourceTableName", null, 1, 1, InsertInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertInstances_TargetTableName(), ecorePackage.getEString(), "targetTableName", null, 1, 1, InsertInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertInstances_SourceColumnsNames(), ecorePackage.getEString(), "sourceColumnsNames", null, 1, -1, InsertInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertInstances_TargetColumnsNames(), ecorePackage.getEString(), "targetColumnsNames", null, 1, -1, InsertInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generateSequenceNumbersEClass, GenerateSequenceNumbers.class, "GenerateSequenceNumbers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerateSequenceNumbers_OwningSchemaName(), ecorePackage.getEString(), "owningSchemaName", null, 1, 1, GenerateSequenceNumbers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateSequenceNumbers_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, GenerateSequenceNumbers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateSequenceNumbers_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, GenerateSequenceNumbers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateSequenceNumbers_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 1, 1, GenerateSequenceNumbers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mergeTypeEEnum, MergeType.class, "MergeType");
		addEEnumLiteral(mergeTypeEEnum, MergeType.STRICT);
		addEEnumLiteral(mergeTypeEEnum, MergeType.FORCE);
		addEEnumLiteral(mergeTypeEEnum, MergeType.TOLERANT);
	}

} //OpsPackageImpl
