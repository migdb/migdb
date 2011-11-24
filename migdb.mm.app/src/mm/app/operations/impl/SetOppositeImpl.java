/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.operations.OperationsPackage;
import mm.app.operations.SetOpposite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Opposite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.SetOppositeImpl#getFirstClassName <em>First Class Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.SetOppositeImpl#getFirstPropertyName <em>First Property Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.SetOppositeImpl#getSecondClassName <em>Second Class Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.SetOppositeImpl#getSecondPropertyName <em>Second Property Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.SetOppositeImpl#isIsOpposite <em>Is Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetOppositeImpl extends ModelOperationImpl implements SetOpposite {
	/**
	 * The default value of the '{@link #getFirstClassName() <em>First Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstClassName() <em>First Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstClassName()
	 * @generated
	 * @ordered
	 */
	protected String firstClassName = FIRST_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPropertyName() <em>First Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstPropertyName() <em>First Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String firstPropertyName = FIRST_PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondClassName() <em>Second Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondClassName() <em>Second Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondClassName()
	 * @generated
	 * @ordered
	 */
	protected String secondClassName = SECOND_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondPropertyName() <em>Second Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondPropertyName() <em>Second Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String secondPropertyName = SECOND_PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOpposite() <em>Is Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOpposite() <em>Is Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpposite()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpposite = IS_OPPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetOppositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.SET_OPPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstClassName() {
		return firstClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstClassName(String newFirstClassName) {
		String oldFirstClassName = firstClassName;
		firstClassName = newFirstClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_OPPOSITE__FIRST_CLASS_NAME, oldFirstClassName, firstClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstPropertyName() {
		return firstPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPropertyName(String newFirstPropertyName) {
		String oldFirstPropertyName = firstPropertyName;
		firstPropertyName = newFirstPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_OPPOSITE__FIRST_PROPERTY_NAME, oldFirstPropertyName, firstPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondClassName() {
		return secondClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondClassName(String newSecondClassName) {
		String oldSecondClassName = secondClassName;
		secondClassName = newSecondClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_OPPOSITE__SECOND_CLASS_NAME, oldSecondClassName, secondClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondPropertyName() {
		return secondPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPropertyName(String newSecondPropertyName) {
		String oldSecondPropertyName = secondPropertyName;
		secondPropertyName = newSecondPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_OPPOSITE__SECOND_PROPERTY_NAME, oldSecondPropertyName, secondPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOpposite() {
		return isOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOpposite(boolean newIsOpposite) {
		boolean oldIsOpposite = isOpposite;
		isOpposite = newIsOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_OPPOSITE__IS_OPPOSITE, oldIsOpposite, isOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.SET_OPPOSITE__FIRST_CLASS_NAME:
				return getFirstClassName();
			case OperationsPackage.SET_OPPOSITE__FIRST_PROPERTY_NAME:
				return getFirstPropertyName();
			case OperationsPackage.SET_OPPOSITE__SECOND_CLASS_NAME:
				return getSecondClassName();
			case OperationsPackage.SET_OPPOSITE__SECOND_PROPERTY_NAME:
				return getSecondPropertyName();
			case OperationsPackage.SET_OPPOSITE__IS_OPPOSITE:
				return isIsOpposite();
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
			case OperationsPackage.SET_OPPOSITE__FIRST_CLASS_NAME:
				setFirstClassName((String)newValue);
				return;
			case OperationsPackage.SET_OPPOSITE__FIRST_PROPERTY_NAME:
				setFirstPropertyName((String)newValue);
				return;
			case OperationsPackage.SET_OPPOSITE__SECOND_CLASS_NAME:
				setSecondClassName((String)newValue);
				return;
			case OperationsPackage.SET_OPPOSITE__SECOND_PROPERTY_NAME:
				setSecondPropertyName((String)newValue);
				return;
			case OperationsPackage.SET_OPPOSITE__IS_OPPOSITE:
				setIsOpposite((Boolean)newValue);
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
			case OperationsPackage.SET_OPPOSITE__FIRST_CLASS_NAME:
				setFirstClassName(FIRST_CLASS_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_OPPOSITE__FIRST_PROPERTY_NAME:
				setFirstPropertyName(FIRST_PROPERTY_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_OPPOSITE__SECOND_CLASS_NAME:
				setSecondClassName(SECOND_CLASS_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_OPPOSITE__SECOND_PROPERTY_NAME:
				setSecondPropertyName(SECOND_PROPERTY_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_OPPOSITE__IS_OPPOSITE:
				setIsOpposite(IS_OPPOSITE_EDEFAULT);
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
			case OperationsPackage.SET_OPPOSITE__FIRST_CLASS_NAME:
				return FIRST_CLASS_NAME_EDEFAULT == null ? firstClassName != null : !FIRST_CLASS_NAME_EDEFAULT.equals(firstClassName);
			case OperationsPackage.SET_OPPOSITE__FIRST_PROPERTY_NAME:
				return FIRST_PROPERTY_NAME_EDEFAULT == null ? firstPropertyName != null : !FIRST_PROPERTY_NAME_EDEFAULT.equals(firstPropertyName);
			case OperationsPackage.SET_OPPOSITE__SECOND_CLASS_NAME:
				return SECOND_CLASS_NAME_EDEFAULT == null ? secondClassName != null : !SECOND_CLASS_NAME_EDEFAULT.equals(secondClassName);
			case OperationsPackage.SET_OPPOSITE__SECOND_PROPERTY_NAME:
				return SECOND_PROPERTY_NAME_EDEFAULT == null ? secondPropertyName != null : !SECOND_PROPERTY_NAME_EDEFAULT.equals(secondPropertyName);
			case OperationsPackage.SET_OPPOSITE__IS_OPPOSITE:
				return isOpposite != IS_OPPOSITE_EDEFAULT;
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
		result.append(" (firstClassName: ");
		result.append(firstClassName);
		result.append(", firstPropertyName: ");
		result.append(firstPropertyName);
		result.append(", secondClassName: ");
		result.append(secondClassName);
		result.append(", secondPropertyName: ");
		result.append(secondPropertyName);
		result.append(", isOpposite: ");
		result.append(isOpposite);
		result.append(')');
		return result.toString();
	}

} //SetOppositeImpl
