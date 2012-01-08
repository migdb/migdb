/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.util;

import mm.rdb.operations.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mm.rdb.operations.OperationsPackage
 * @generated
 */
public class OperationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OperationsPackage.MODEL_OPERATION: {
				ModelOperation modelOperation = (ModelOperation)theEObject;
				T result = caseModelOperation(modelOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_SCHEMA: {
				AddSchema addSchema = (AddSchema)theEObject;
				T result = caseAddSchema(addSchema);
				if (result == null) result = caseModelOperation(addSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_SEQUENCE: {
				AddSequence addSequence = (AddSequence)theEObject;
				T result = caseAddSequence(addSequence);
				if (result == null) result = caseModelOperation(addSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_INDEX: {
				AddIndex addIndex = (AddIndex)theEObject;
				T result = caseAddIndex(addIndex);
				if (result == null) result = caseModelOperation(addIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_TABLE: {
				AddTable addTable = (AddTable)theEObject;
				T result = caseAddTable(addTable);
				if (result == null) result = caseModelOperation(addTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.RENAME_TABLE: {
				RenameTable renameTable = (RenameTable)theEObject;
				T result = caseRenameTable(renameTable);
				if (result == null) result = caseModelOperation(renameTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_TABLE: {
				RemoveTable removeTable = (RemoveTable)theEObject;
				T result = caseRemoveTable(removeTable);
				if (result == null) result = caseModelOperation(removeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_COLUMN: {
				AddColumn addColumn = (AddColumn)theEObject;
				T result = caseAddColumn(addColumn);
				if (result == null) result = caseModelOperation(addColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.RENAME_COLUMN: {
				RenameColumn renameColumn = (RenameColumn)theEObject;
				T result = caseRenameColumn(renameColumn);
				if (result == null) result = caseModelOperation(renameColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_COLUMN: {
				RemoveColumn removeColumn = (RemoveColumn)theEObject;
				T result = caseRemoveColumn(removeColumn);
				if (result == null) result = caseModelOperation(removeColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_UNIQUE_INDEX: {
				AddUniqueIndex addUniqueIndex = (AddUniqueIndex)theEObject;
				T result = caseAddUniqueIndex(addUniqueIndex);
				if (result == null) result = caseModelOperation(addUniqueIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_PRIMARY_KEY: {
				AddPrimaryKey addPrimaryKey = (AddPrimaryKey)theEObject;
				T result = caseAddPrimaryKey(addPrimaryKey);
				if (result == null) result = caseModelOperation(addPrimaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_FOREIGN_KEY: {
				AddForeignKey addForeignKey = (AddForeignKey)theEObject;
				T result = caseAddForeignKey(addForeignKey);
				if (result == null) result = caseModelOperation(addForeignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_NOT_NULL_CONSTRAINT: {
				AddNotNullConstraint addNotNullConstraint = (AddNotNullConstraint)theEObject;
				T result = caseAddNotNullConstraint(addNotNullConstraint);
				if (result == null) result = caseModelOperation(addNotNullConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_TABLE_CONSTRAINT: {
				RemoveTableConstraint removeTableConstraint = (RemoveTableConstraint)theEObject;
				T result = caseRemoveTableConstraint(removeTableConstraint);
				if (result == null) result = caseModelOperation(removeTableConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_COLUMN_CONSTRAINT: {
				RemoveColumnConstraint removeColumnConstraint = (RemoveColumnConstraint)theEObject;
				T result = caseRemoveColumnConstraint(removeColumnConstraint);
				if (result == null) result = caseModelOperation(removeColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_INDEX: {
				RemoveIndex removeIndex = (RemoveIndex)theEObject;
				T result = caseRemoveIndex(removeIndex);
				if (result == null) result = caseModelOperation(removeIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.MOVE_COLUMN: {
				MoveColumn moveColumn = (MoveColumn)theEObject;
				T result = caseMoveColumn(moveColumn);
				if (result == null) result = caseModelOperation(moveColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_COLUMN_TYPE: {
				SetColumnType setColumnType = (SetColumnType)theEObject;
				T result = caseSetColumnType(setColumnType);
				if (result == null) result = caseModelOperation(setColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE: {
				SetColumnDefaultValue setColumnDefaultValue = (SetColumnDefaultValue)theEObject;
				T result = caseSetColumnDefaultValue(setColumnDefaultValue);
				if (result == null) result = caseModelOperation(setColumnDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_DEFAULT_VALUE: {
				RemoveDefaultValue removeDefaultValue = (RemoveDefaultValue)theEObject;
				T result = caseRemoveDefaultValue(removeDefaultValue);
				if (result == null) result = caseModelOperation(removeDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelOperation(ModelOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSchema(AddSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSequence(AddSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddIndex(AddIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddTable(AddTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameTable(RenameTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveTable(RemoveTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddColumn(AddColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameColumn(RenameColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveColumn(RemoveColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Unique Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Unique Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddUniqueIndex(AddUniqueIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddPrimaryKey(AddPrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddForeignKey(AddForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Not Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Not Null Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNotNullConstraint(AddNotNullConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Table Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveTableConstraint(RemoveTableConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveColumnConstraint(RemoveColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveIndex(RemoveIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveColumn(MoveColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetColumnType(SetColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Column Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Column Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetColumnDefaultValue(SetColumnDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveDefaultValue(RemoveDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OperationsSwitch