/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.operations.*;

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
public class OperationsFactoryImpl extends EFactoryImpl implements OperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationsFactory init() {
		try {
			OperationsFactory theOperationsFactory = (OperationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collectionspro.eu/jam/mm/rdb-ops"); 
			if (theOperationsFactory != null) {
				return theOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactoryImpl() {
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
			case OperationsPackage.ADD_SCHEMA: return createAddSchema();
			case OperationsPackage.ADD_SEQUENCE: return createAddSequence();
			case OperationsPackage.ADD_INDEX: return createAddIndex();
			case OperationsPackage.ADD_TABLE: return createAddTable();
			case OperationsPackage.RENAME_TABLE: return createRenameTable();
			case OperationsPackage.REMOVE_TABLE: return createRemoveTable();
			case OperationsPackage.ADD_COLUMN: return createAddColumn();
			case OperationsPackage.RENAME_COLUMN: return createRenameColumn();
			case OperationsPackage.COPY_INSTANCES: return createCopyInstances();
			case OperationsPackage.REMOVE_COLUMN: return createRemoveColumn();
			case OperationsPackage.ADD_UNIQUE_INDEX: return createAddUniqueIndex();
			case OperationsPackage.ADD_PRIMARY_KEY: return createAddPrimaryKey();
			case OperationsPackage.ADD_FOREIGN_KEY: return createAddForeignKey();
			case OperationsPackage.REMOVE_TABLE_CONSTRAINT: return createRemoveTableConstraint();
			case OperationsPackage.ADD_NOT_NULL_CONSTRAINT: return createAddNotNullConstraint();
			case OperationsPackage.REMOVE_COLUMN_CONSTRAINT: return createRemoveColumnConstraint();
			case OperationsPackage.REMOVE_INDEX: return createRemoveIndex();
			case OperationsPackage.SET_COLUMN_TYPE: return createSetColumnType();
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE: return createSetColumnDefaultValue();
			case OperationsPackage.REMOVE_DEFAULT_VALUE: return createRemoveDefaultValue();
			case OperationsPackage.REMOVE_SEQUENCE: return createRemoveSequence();
			case OperationsPackage.CHECK_INSTANCES: return createCheckInstances();
			case OperationsPackage.ADD_INSTANCES: return createAddInstances();
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
			case OperationsPackage.MERGE_TYPE:
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
			case OperationsPackage.MERGE_TYPE:
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
	public AddUniqueIndex createAddUniqueIndex() {
		AddUniqueIndexImpl addUniqueIndex = new AddUniqueIndexImpl();
		return addUniqueIndex;
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
	public RemoveTableConstraint createRemoveTableConstraint() {
		RemoveTableConstraintImpl removeTableConstraint = new RemoveTableConstraintImpl();
		return removeTableConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNotNullConstraint createAddNotNullConstraint() {
		AddNotNullConstraintImpl addNotNullConstraint = new AddNotNullConstraintImpl();
		return addNotNullConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveColumnConstraint createRemoveColumnConstraint() {
		RemoveColumnConstraintImpl removeColumnConstraint = new RemoveColumnConstraintImpl();
		return removeColumnConstraint;
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
	public CheckInstances createCheckInstances() {
		CheckInstancesImpl checkInstances = new CheckInstancesImpl();
		return checkInstances;
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
	public OperationsPackage getOperationsPackage() {
		return (OperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationsPackage getPackage() {
		return OperationsPackage.eINSTANCE;
	}

} //OperationsFactoryImpl
