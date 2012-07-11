/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops.impl;

import mm.app.ops.CopyProperty;
import mm.app.ops.MergeType;
import mm.app.ops.OpsPackage;

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
 *   <li>{@link mm.app.ops.impl.CopyPropertyImpl#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.CopyPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.CopyPropertyImpl#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.CopyPropertyImpl#getType <em>Type</em>}</li>
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MergeType TYPE_EDEFAULT = MergeType.STRICT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MergeType type = TYPE_EDEFAULT;

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
		return OpsPackage.Literals.COPY_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.COPY_PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.COPY_PROPERTY__TARGET_CLASS_NAME, oldTargetClassName, targetClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MergeType newType) {
		MergeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.COPY_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.COPY_PROPERTY__OWNING_CLASS_NAME:
				return getOwningClassName();
			case OpsPackage.COPY_PROPERTY__NAME:
				return getName();
			case OpsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				return getTargetClassName();
			case OpsPackage.COPY_PROPERTY__TYPE:
				return getType();
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
			case OpsPackage.COPY_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case OpsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				setTargetClassName((String)newValue);
				return;
			case OpsPackage.COPY_PROPERTY__TYPE:
				setType((MergeType)newValue);
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
			case OpsPackage.COPY_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				setTargetClassName(TARGET_CLASS_NAME_EDEFAULT);
				return;
			case OpsPackage.COPY_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OpsPackage.COPY_PROPERTY__OWNING_CLASS_NAME:
				return OWNING_CLASS_NAME_EDEFAULT == null ? owningClassName != null : !OWNING_CLASS_NAME_EDEFAULT.equals(owningClassName);
			case OpsPackage.COPY_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpsPackage.COPY_PROPERTY__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? targetClassName != null : !TARGET_CLASS_NAME_EDEFAULT.equals(targetClassName);
			case OpsPackage.COPY_PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", targetClassName: ");
		result.append(targetClassName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CopyPropertyImpl
