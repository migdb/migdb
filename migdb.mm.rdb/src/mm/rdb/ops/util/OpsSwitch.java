/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops.util;

import mm.rdb.ops.*;

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
 * @see mm.rdb.ops.OpsPackage
 * @generated
 */
public class OpsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsSwitch() {
		if (modelPackage == null) {
			modelPackage = OpsPackage.eINSTANCE;
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
			case OpsPackage.MODEL_OPERATION: {
				ModelOperation modelOperation = (ModelOperation)theEObject;
				T result = caseModelOperation(modelOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_SCHEMA: {
				AddSchema addSchema = (AddSchema)theEObject;
				T result = caseAddSchema(addSchema);
				if (result == null) result = caseModelOperation(addSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_SEQUENCE: {
				AddSequence addSequence = (AddSequence)theEObject;
				T result = caseAddSequence(addSequence);
				if (result == null) result = caseModelOperation(addSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_INDEX: {
				AddIndex addIndex = (AddIndex)theEObject;
				T result = caseAddIndex(addIndex);
				if (result == null) result = caseModelOperation(addIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_TABLE: {
				AddTable addTable = (AddTable)theEObject;
				T result = caseAddTable(addTable);
				if (result == null) result = caseModelOperation(addTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.RENAME_TABLE: {
				RenameTable renameTable = (RenameTable)theEObject;
				T result = caseRenameTable(renameTable);
				if (result == null) result = caseModelOperation(renameTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_TABLE: {
				RemoveTable removeTable = (RemoveTable)theEObject;
				T result = caseRemoveTable(removeTable);
				if (result == null) result = caseModelOperation(removeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_COLUMN: {
				AddColumn addColumn = (AddColumn)theEObject;
				T result = caseAddColumn(addColumn);
				if (result == null) result = caseModelOperation(addColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.RENAME_COLUMN: {
				RenameColumn renameColumn = (RenameColumn)theEObject;
				T result = caseRenameColumn(renameColumn);
				if (result == null) result = caseModelOperation(renameColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.COPY_INSTANCES: {
				CopyInstances copyInstances = (CopyInstances)theEObject;
				T result = caseCopyInstances(copyInstances);
				if (result == null) result = caseModelOperation(copyInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_COLUMN: {
				RemoveColumn removeColumn = (RemoveColumn)theEObject;
				T result = caseRemoveColumn(removeColumn);
				if (result == null) result = caseModelOperation(removeColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_UNIQUE: {
				AddUnique addUnique = (AddUnique)theEObject;
				T result = caseAddUnique(addUnique);
				if (result == null) result = caseModelOperation(addUnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_PRIMARY_KEY: {
				AddPrimaryKey addPrimaryKey = (AddPrimaryKey)theEObject;
				T result = caseAddPrimaryKey(addPrimaryKey);
				if (result == null) result = caseModelOperation(addPrimaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_FOREIGN_KEY: {
				AddForeignKey addForeignKey = (AddForeignKey)theEObject;
				T result = caseAddForeignKey(addForeignKey);
				if (result == null) result = caseModelOperation(addForeignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_CONSTRAINT: {
				RemoveConstraint removeConstraint = (RemoveConstraint)theEObject;
				T result = caseRemoveConstraint(removeConstraint);
				if (result == null) result = caseModelOperation(removeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_NOT_NULL: {
				AddNotNull addNotNull = (AddNotNull)theEObject;
				T result = caseAddNotNull(addNotNull);
				if (result == null) result = caseModelOperation(addNotNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_INDEX: {
				RemoveIndex removeIndex = (RemoveIndex)theEObject;
				T result = caseRemoveIndex(removeIndex);
				if (result == null) result = caseModelOperation(removeIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.SET_COLUMN_TYPE: {
				SetColumnType setColumnType = (SetColumnType)theEObject;
				T result = caseSetColumnType(setColumnType);
				if (result == null) result = caseModelOperation(setColumnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.SET_COLUMN_DEFAULT_VALUE: {
				SetColumnDefaultValue setColumnDefaultValue = (SetColumnDefaultValue)theEObject;
				T result = caseSetColumnDefaultValue(setColumnDefaultValue);
				if (result == null) result = caseModelOperation(setColumnDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_DEFAULT_VALUE: {
				RemoveDefaultValue removeDefaultValue = (RemoveDefaultValue)theEObject;
				T result = caseRemoveDefaultValue(removeDefaultValue);
				if (result == null) result = caseModelOperation(removeDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.REMOVE_SEQUENCE: {
				RemoveSequence removeSequence = (RemoveSequence)theEObject;
				T result = caseRemoveSequence(removeSequence);
				if (result == null) result = caseModelOperation(removeSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.HAS_NO_OWN_INSTANCES: {
				HasNoOwnInstances hasNoOwnInstances = (HasNoOwnInstances)theEObject;
				T result = caseHasNoOwnInstances(hasNoOwnInstances);
				if (result == null) result = caseModelOperation(hasNoOwnInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.HAS_NO_INSTANCES: {
				HasNoInstances hasNoInstances = (HasNoInstances)theEObject;
				T result = caseHasNoInstances(hasNoInstances);
				if (result == null) result = caseModelOperation(hasNoInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.ADD_INSTANCES: {
				AddInstances addInstances = (AddInstances)theEObject;
				T result = caseAddInstances(addInstances);
				if (result == null) result = caseModelOperation(addInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.INSERT_INSTANCES: {
				InsertInstances insertInstances = (InsertInstances)theEObject;
				T result = caseInsertInstances(insertInstances);
				if (result == null) result = caseModelOperation(insertInstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpsPackage.GENERATE_SEQUENCE_NUMBERS: {
				GenerateSequenceNumbers generateSequenceNumbers = (GenerateSequenceNumbers)theEObject;
				T result = caseGenerateSequenceNumbers(generateSequenceNumbers);
				if (result == null) result = caseModelOperation(generateSequenceNumbers);
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
	 * Returns the result of interpreting the object as an instance of '<em>Copy Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyInstances(CopyInstances object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Add Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddUnique(AddUnique object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Remove Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveConstraint(RemoveConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Not Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddNotNull(AddNotNull object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Remove Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveSequence(RemoveSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has No Own Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has No Own Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasNoOwnInstances(HasNoOwnInstances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has No Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has No Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasNoInstances(HasNoInstances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddInstances(AddInstances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Instances</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Instances</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertInstances(InsertInstances object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generate Sequence Numbers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generate Sequence Numbers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerateSequenceNumbers(GenerateSequenceNumbers object) {
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

} //OpsSwitch
