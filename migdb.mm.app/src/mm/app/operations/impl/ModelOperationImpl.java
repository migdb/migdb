/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.AppPackage;
import mm.app.ModelRoot;

import mm.app.operations.ModelOperation;
import mm.app.operations.OperationsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.ModelOperationImpl#getModelRoot <em>Model Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelOperationImpl extends EObjectImpl implements ModelOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.MODEL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot getModelRoot() {
		if (eContainerFeatureID() != OperationsPackage.MODEL_OPERATION__MODEL_ROOT) return null;
		return (ModelRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationsPackage.MODEL_OPERATION__MODEL_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OperationsPackage.MODEL_OPERATION__MODEL_ROOT, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationsPackage.MODEL_OPERATION__MODEL_ROOT:
				return eBasicSetContainer(null, OperationsPackage.MODEL_OPERATION__MODEL_ROOT, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OperationsPackage.MODEL_OPERATION__MODEL_ROOT:
				return eInternalContainer().eInverseRemove(this, AppPackage.MODEL_ROOT__OPERATIONS, ModelRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.MODEL_OPERATION__MODEL_ROOT:
				return getModelRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperationsPackage.MODEL_OPERATION__MODEL_ROOT:
				return getModelRoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelOperationImpl
