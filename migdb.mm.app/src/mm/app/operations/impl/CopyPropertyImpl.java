/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.operations.CopyProperty;
import mm.app.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.CopyPropertyImpl#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.CopyPropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.CopyPropertyImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.CopyPropertyImpl#isEndInOwerload <em>End In Owerload</em>}</li>
 *   <li>{@link mm.app.operations.impl.CopyPropertyImpl#isAddValueNull <em>Add Value Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyPropertyImpl extends ModelOperationImpl implements CopyProperty {
	/**
	 * The default value of the '{@link #getOwningClassName() <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningClassName() <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassName()
	 * @generated
	 * @ordered
	 */
	protected String owningClassName = OWNING_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected String targetClassName = TARGET_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isEndInOwerload() <em>End In Owerload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndInOwerload()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_IN_OWERLOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEndInOwerload() <em>End In Owerload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEndInOwerload()
	 * @generated
	 * @ordered
	 */
	protected boolean endInOwerload = END_IN_OWERLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isAddValueNull() <em>Add Value Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddValueNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_VALUE_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAddValueNull() <em>Add Value Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddValueNull()
	 * @generated
	 * @ordered
	 */
	protected boolean addValueNull = ADD_VALUE_NULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.COPY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningClassName() {
		return owningClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_PROPERTY__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetClassName() {
		return targetClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassName(String newTargetClassName) {
		String oldTargetClassName = targetClassName;
		targetClassName = newTargetClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_PROPERTY__TARGET_CLASS_NAME, oldTargetClassName, targetClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEndInOwerload() {
		return endInOwerload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndInOwerload(boolean newEndInOwerload) {
		boolean oldEndInOwerload = endInOwerload;
		endInOwerload = newEndInOwerload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_PROPERTY__END_IN_OWERLOAD, oldEndInOwerload, endInOwerload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAddValueNull() {
		return addValueNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddValueNull(boolean newAddValueNull) {
		boolean oldAddValueNull = addValueNull;
		addValueNull = newAddValueNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_PROPERTY__ADD_VALUE_NULL, oldAddValueNull, addValueNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.COPY_PROPERTY__OWNING_CLASS_NAME:
				return getOwningClassName();
			case OperationsPackage.COPY_PROPERTY__PROPERTY_NAME:
				return getPropertyName();
			case OperationsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				return getTargetClassName();
			case OperationsPackage.COPY_PROPERTY__END_IN_OWERLOAD:
				return isEndInOwerload();
			case OperationsPackage.COPY_PROPERTY__ADD_VALUE_NULL:
				return isAddValueNull();
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
			case OperationsPackage.COPY_PROPERTY__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case OperationsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				setTargetClassName((String)newValue);
				return;
			case OperationsPackage.COPY_PROPERTY__END_IN_OWERLOAD:
				setEndInOwerload((Boolean)newValue);
				return;
			case OperationsPackage.COPY_PROPERTY__ADD_VALUE_NULL:
				setAddValueNull((Boolean)newValue);
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
			case OperationsPackage.COPY_PROPERTY__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				setTargetClassName(TARGET_CLASS_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_PROPERTY__END_IN_OWERLOAD:
				setEndInOwerload(END_IN_OWERLOAD_EDEFAULT);
				return;
			case OperationsPackage.COPY_PROPERTY__ADD_VALUE_NULL:
				setAddValueNull(ADD_VALUE_NULL_EDEFAULT);
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
			case OperationsPackage.COPY_PROPERTY__OWNING_CLASS_NAME:
				return OWNING_CLASS_NAME_EDEFAULT == null ? owningClassName != null : !OWNING_CLASS_NAME_EDEFAULT.equals(owningClassName);
			case OperationsPackage.COPY_PROPERTY__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case OperationsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? targetClassName != null : !TARGET_CLASS_NAME_EDEFAULT.equals(targetClassName);
			case OperationsPackage.COPY_PROPERTY__END_IN_OWERLOAD:
				return endInOwerload != END_IN_OWERLOAD_EDEFAULT;
			case OperationsPackage.COPY_PROPERTY__ADD_VALUE_NULL:
				return addValueNull != ADD_VALUE_NULL_EDEFAULT;
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
		result.append(" (owningClassName: ");
		result.append(owningClassName);
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", targetClassName: ");
		result.append(targetClassName);
		result.append(", endInOwerload: ");
		result.append(endInOwerload);
		result.append(", addValueNull: ");
		result.append(addValueNull);
		result.append(')');
		return result.toString();
	}

} //CopyPropertyImpl
