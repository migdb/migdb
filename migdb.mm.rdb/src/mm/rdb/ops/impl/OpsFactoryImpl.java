/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops.impl;

import mm.rdb.ops.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpsFactoryImpl extends EFactoryImpl implements OpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpsFactory init() {
		try {
			OpsFactory theOpsFactory = (OpsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collectionspro.eu/jam/mm/rdb-ops"); 
			if (theOpsFactory != null) {
				return theOpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpsPackage.ADD_SCHEMA: return createAddSchema();
			case OpsPackage.ADD_SEQUENCE: return createAddSequence();
			case OpsPackage.ADD_INDEX: return createAddIndex();
			case OpsPackage.ADD_TABLE: return createAddTable();
			case OpsPackage.RENAME_TABLE: return createRenameTable();
			case OpsPackage.REMOVE_TABLE: return createRemoveTable();
			case OpsPackage.ADD_COLUMN: return createAddColumn();
			case OpsPackage.RENAME_COLUMN: return createRenameColumn();
			case OpsPackage.COPY_INSTANCES: return createCopyInstances();
			case OpsPackage.REMOVE_COLUMN: return createRemoveColumn();
			case OpsPackage.ADD_UNIQUE: return createAddUnique();
			case OpsPackage.ADD_PRIMARY_KEY: return createAddPrimaryKey();
			case OpsPackage.ADD_FOREIGN_KEY: return createAddForeignKey();
			case OpsPackage.REMOVE_CONSTRAINT: return createRemoveConstraint();
			case OpsPackage.ADD_NOT_NULL: return createAddNotNull();
			case OpsPackage.REMOVE_INDEX: return createRemoveIndex();
			case OpsPackage.SET_COLUMN_TYPE: return createSetColumnType();
			case OpsPackage.SET_COLUMN_DEFAULT_VALUE: return createSetColumnDefaultValue();
			case OpsPackage.REMOVE_DEFAULT_VALUE: return createRemoveDefaultValue();
			case OpsPackage.REMOVE_SEQUENCE: return createRemoveSequence();
			case OpsPackage.HAS_NO_OWN_INSTANCES: return createHasNoOwnInstances();
			case OpsPackage.HAS_NO_INSTANCES: return createHasNoInstances();
			case OpsPackage.ADD_INSTANCES: return createAddInstances();
			case OpsPackage.INSERT_INSTANCES: return createInsertInstances();
			case OpsPackage.GENERATE_SEQUENCE_NUMBERS: return createGenerateSequenceNumbers();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpsPackage.MERGE_TYPE:
				return createMergeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpsPackage.MERGE_TYPE:
				return convertMergeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSchema createAddSchema() {
		AddSchemaImpl addSchema = new AddSchemaImpl();
		return addSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSequence createAddSequence() {
		AddSequenceImpl addSequence = new AddSequenceImpl();
		return addSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddIndex createAddIndex() {
		AddIndexImpl addIndex = new AddIndexImpl();
		return addIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTable createAddTable() {
		AddTableImpl addTable = new AddTableImpl();
		return addTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameTable createRenameTable() {
		RenameTableImpl renameTable = new RenameTableImpl();
		return renameTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveTable createRemoveTable() {
		RemoveTableImpl removeTable = new RemoveTableImpl();
		return removeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddColumn createAddColumn() {
		AddColumnImpl addColumn = new AddColumnImpl();
		return addColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameColumn createRenameColumn() {
		RenameColumnImpl renameColumn = new RenameColumnImpl();
		return renameColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyInstances createCopyInstances() {
		CopyInstancesImpl copyInstances = new CopyInstancesImpl();
		return copyInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveColumn createRemoveColumn() {
		RemoveColumnImpl removeColumn = new RemoveColumnImpl();
		return removeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUnique createAddUnique() {
		AddUniqueImpl addUnique = new AddUniqueImpl();
		return addUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimaryKey createAddPrimaryKey() {
		AddPrimaryKeyImpl addPrimaryKey = new AddPrimaryKeyImpl();
		return addPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddForeignKey createAddForeignKey() {
		AddForeignKeyImpl addForeignKey = new AddForeignKeyImpl();
		return addForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveConstraint createRemoveConstraint() {
		RemoveConstraintImpl removeConstraint = new RemoveConstraintImpl();
		return removeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNotNull createAddNotNull() {
		AddNotNullImpl addNotNull = new AddNotNullImpl();
		return addNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveIndex createRemoveIndex() {
		RemoveIndexImpl removeIndex = new RemoveIndexImpl();
		return removeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetColumnType createSetColumnType() {
		SetColumnTypeImpl setColumnType = new SetColumnTypeImpl();
		return setColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetColumnDefaultValue createSetColumnDefaultValue() {
		SetColumnDefaultValueImpl setColumnDefaultValue = new SetColumnDefaultValueImpl();
		return setColumnDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveDefaultValue createRemoveDefaultValue() {
		RemoveDefaultValueImpl removeDefaultValue = new RemoveDefaultValueImpl();
		return removeDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveSequence createRemoveSequence() {
		RemoveSequenceImpl removeSequence = new RemoveSequenceImpl();
		return removeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasNoOwnInstances createHasNoOwnInstances() {
		HasNoOwnInstancesImpl hasNoOwnInstances = new HasNoOwnInstancesImpl();
		return hasNoOwnInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasNoInstances createHasNoInstances() {
		HasNoInstancesImpl hasNoInstances = new HasNoInstancesImpl();
		return hasNoInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddInstances createAddInstances() {
		AddInstancesImpl addInstances = new AddInstancesImpl();
		return addInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertInstances createInsertInstances() {
		InsertInstancesImpl insertInstances = new InsertInstancesImpl();
		return insertInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateSequenceNumbers createGenerateSequenceNumbers() {
		GenerateSequenceNumbersImpl generateSequenceNumbers = new GenerateSequenceNumbersImpl();
		return generateSequenceNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeType createMergeTypeFromString(EDataType eDataType, String initialValue) {
		MergeType result = MergeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsPackage getOpsPackage() {
		return (OpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpsPackage getPackage() {
		return OpsPackage.eINSTANCE;
	}

} //OpsFactoryImpl
