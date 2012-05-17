/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.testing.impl;

import mm.testing.ModelRoot;
import mm.testing.Result;
import mm.testing.TestingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.testing.impl.ResultImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link mm.testing.impl.ResultImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link mm.testing.impl.ResultImpl#getOwningModel <em>Owning Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends EObjectImpl implements Result {
	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String errorMessage = ERROR_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningModel() <em>Owning Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningModel()
	 * @generated
	 * @ordered
	 */
	protected ModelRoot owningModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorMessage(String newErrorMessage) {
		String oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.RESULT__ERROR_MESSAGE, oldErrorMessage, errorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.RESULT__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot getOwningModel() {
		if (owningModel != null && owningModel.eIsProxy()) {
			InternalEObject oldOwningModel = (InternalEObject)owningModel;
			owningModel = (ModelRoot)eResolveProxy(oldOwningModel);
			if (owningModel != oldOwningModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestingPackage.RESULT__OWNING_MODEL, oldOwningModel, owningModel));
			}
		}
		return owningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot basicGetOwningModel() {
		return owningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningModel(ModelRoot newOwningModel, NotificationChain msgs) {
		ModelRoot oldOwningModel = owningModel;
		owningModel = newOwningModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingPackage.RESULT__OWNING_MODEL, oldOwningModel, newOwningModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningModel(ModelRoot newOwningModel) {
		if (newOwningModel != owningModel) {
			NotificationChain msgs = null;
			if (owningModel != null)
				msgs = ((InternalEObject)owningModel).eInverseRemove(this, TestingPackage.MODEL_ROOT__RESULT, ModelRoot.class, msgs);
			if (newOwningModel != null)
				msgs = ((InternalEObject)newOwningModel).eInverseAdd(this, TestingPackage.MODEL_ROOT__RESULT, ModelRoot.class, msgs);
			msgs = basicSetOwningModel(newOwningModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.RESULT__OWNING_MODEL, newOwningModel, newOwningModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestingPackage.RESULT__OWNING_MODEL:
				if (owningModel != null)
					msgs = ((InternalEObject)owningModel).eInverseRemove(this, TestingPackage.MODEL_ROOT__RESULT, ModelRoot.class, msgs);
				return basicSetOwningModel((ModelRoot)otherEnd, msgs);
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
			case TestingPackage.RESULT__OWNING_MODEL:
				return basicSetOwningModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingPackage.RESULT__ERROR_MESSAGE:
				return getErrorMessage();
			case TestingPackage.RESULT__IS_VALID:
				return isIsValid();
			case TestingPackage.RESULT__OWNING_MODEL:
				if (resolve) return getOwningModel();
				return basicGetOwningModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestingPackage.RESULT__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
				return;
			case TestingPackage.RESULT__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case TestingPackage.RESULT__OWNING_MODEL:
				setOwningModel((ModelRoot)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestingPackage.RESULT__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
				return;
			case TestingPackage.RESULT__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case TestingPackage.RESULT__OWNING_MODEL:
				setOwningModel((ModelRoot)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestingPackage.RESULT__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
			case TestingPackage.RESULT__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
			case TestingPackage.RESULT__OWNING_MODEL:
				return owningModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (errorMessage: ");
		result.append(errorMessage);
		result.append(", isValid: ");
		result.append(isValid);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
