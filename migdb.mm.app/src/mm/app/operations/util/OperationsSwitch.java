/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.util;

import mm.app.operations.*;

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
 * @see mm.app.operations.OperationsPackage
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
			case OperationsPackage.ADD_CLASS: {
				AddClass addClass = (AddClass)theEObject;
				T result = caseAddClass(addClass);
				if (result == null) result = caseModelOperation(addClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.RENAME_CLASS: {
				RenameClass renameClass = (RenameClass)theEObject;
				T result = caseRenameClass(renameClass);
				if (result == null) result = caseModelOperation(renameClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_PARENT: {
				SetParent setParent = (SetParent)theEObject;
				T result = caseSetParent(setParent);
				if (result == null) result = caseModelOperation(setParent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_ABSTRACT: {
				SetAbstract setAbstract = (SetAbstract)theEObject;
				T result = caseSetAbstract(setAbstract);
				if (result == null) result = caseModelOperation(setAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_ENTITY: {
				RemoveEntity removeEntity = (RemoveEntity)theEObject;
				T result = caseRemoveEntity(removeEntity);
				if (result == null) result = caseModelOperation(removeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_PROPERTY: {
				AddProperty addProperty = (AddProperty)theEObject;
				T result = caseAddProperty(addProperty);
				if (result == null) result = caseModelOperation(addProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.RENAME_PROPERTY: {
				RenameProperty renameProperty = (RenameProperty)theEObject;
				T result = caseRenameProperty(renameProperty);
				if (result == null) result = caseModelOperation(renameProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = caseModelOperation(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_OPPOSITE: {
				SetOpposite setOpposite = (SetOpposite)theEObject;
				T result = caseSetOpposite(setOpposite);
				if (result == null) result = caseModelOperation(setOpposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_BOUNDRIES: {
				SetBoundries setBoundries = (SetBoundries)theEObject;
				T result = caseSetBoundries(setBoundries);
				if (result == null) result = caseModelOperation(setBoundries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_ORDERED: {
				SetOrdered setOrdered = (SetOrdered)theEObject;
				T result = caseSetOrdered(setOrdered);
				if (result == null) result = caseModelOperation(setOrdered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.SET_UNIQUE: {
				SetUnique setUnique = (SetUnique)theEObject;
				T result = caseSetUnique(setUnique);
				if (result == null) result = caseModelOperation(setUnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.REMOVE_PROPERTY: {
				RemoveProperty removeProperty = (RemoveProperty)theEObject;
				T result = caseRemoveProperty(removeProperty);
				if (result == null) result = caseModelOperation(removeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.COPY_PROPERTY: {
				CopyProperty copyProperty = (CopyProperty)theEObject;
				T result = caseCopyProperty(copyProperty);
				if (result == null) result = caseModelOperation(copyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.MOVE_PROPERTY: {
				MoveProperty moveProperty = (MoveProperty)theEObject;
				T result = caseMoveProperty(moveProperty);
				if (result == null) result = caseModelOperation(moveProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_PRIMITIVE_CLASS: {
				AddPrimitiveClass addPrimitiveClass = (AddPrimitiveClass)theEObject;
				T result = caseAddPrimitiveClass(addPrimitiveClass);
				if (result == null) result = caseModelOperation(addPrimitiveClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationsPackage.ADD_EMBEDDED_CLASS: {
				AddEmbeddedClass addEmbeddedClass = (AddEmbeddedClass)theEObject;
				T result = caseAddEmbeddedClass(addEmbeddedClass);
				if (result == null) result = caseModelOperation(addEmbeddedClass);
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
	 * Returns the result of interpreting the object as an instance of '<em>Add Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddClass(AddClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameClass(RenameClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetParent(SetParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAbstract(SetAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveEntity(RemoveEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddProperty(AddProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameProperty(RenameProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Opposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Opposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOpposite(SetOpposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Boundries</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Boundries</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetBoundries(SetBoundries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Ordered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Ordered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOrdered(SetOrdered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetUnique(SetUnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveProperty(RemoveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyProperty(CopyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveProperty(MoveProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Primitive Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Primitive Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddPrimitiveClass(AddPrimitiveClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Embedded Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Embedded Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddEmbeddedClass(AddEmbeddedClass object) {
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
