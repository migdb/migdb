/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.operations.OperationsPackage;
import mm.app.operations.SetEmbedded;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Embedded</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.SetEmbeddedImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.SetEmbeddedImpl#isIsEmbedded <em>Is Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetEmbeddedImpl extends ModelOperationImpl implements SetEmbedded {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected boolean isEmbedded = IS_EMBEDDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetEmbeddedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.SET_EMBEDDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_EMBEDDED__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmbedded() {
		return isEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEmbedded(boolean newIsEmbedded) {
		boolean oldIsEmbedded = isEmbedded;
		isEmbedded = newIsEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_EMBEDDED__IS_EMBEDDED, oldIsEmbedded, isEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.SET_EMBEDDED__NAME:
				return getName();
			case OperationsPackage.SET_EMBEDDED__IS_EMBEDDED:
				return isIsEmbedded();
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
			case OperationsPackage.SET_EMBEDDED__NAME:
				setName((String)newValue);
				return;
			case OperationsPackage.SET_EMBEDDED__IS_EMBEDDED:
				setIsEmbedded((Boolean)newValue);
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
			case OperationsPackage.SET_EMBEDDED__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_EMBEDDED__IS_EMBEDDED:
				setIsEmbedded(IS_EMBEDDED_EDEFAULT);
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
			case OperationsPackage.SET_EMBEDDED__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperationsPackage.SET_EMBEDDED__IS_EMBEDDED:
				return isEmbedded != IS_EMBEDDED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isEmbedded: ");
		result.append(isEmbedded);
		result.append(')');
		return result.toString();
	}

} //SetEmbeddedImpl
