/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops.impl;

import mm.rdb.PrimitiveType;

import mm.rdb.ops.OpsPackage;
import mm.rdb.ops.SetColumnType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.ops.impl.SetColumnTypeImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.impl.SetColumnTypeImpl#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.impl.SetColumnTypeImpl#getOwningColumnName <em>Owning Column Name</em>}</li>
 *   <li>{@link mm.rdb.ops.impl.SetColumnTypeImpl#getNewType <em>New Type</em>}</li>
 *   <li>{@link mm.rdb.ops.impl.SetColumnTypeImpl#getOldType <em>Old Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetColumnTypeImpl extends ModelOperationImpl implements SetColumnType {
	/**
	 * The default value of the '{@link #getOwningSchemaName() <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningSchemaName() <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningSchemaName()
	 * @generated
	 * @ordered
	 */
	protected String owningSchemaName = OWNING_SCHEMA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwningTableName() <em>Owning Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningTableName() <em>Owning Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTableName()
	 * @generated
	 * @ordered
	 */
	protected String owningTableName = OWNING_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwningColumnName() <em>Owning Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningColumnName() <em>Owning Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningColumnName()
	 * @generated
	 * @ordered
	 */
	protected String owningColumnName = OWNING_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType NEW_TYPE_EDEFAULT = PrimitiveType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType newType = NEW_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldType() <em>Old Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType OLD_TYPE_EDEFAULT = PrimitiveType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getOldType() <em>Old Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType oldType = OLD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.SET_COLUMN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningSchemaName() {
		return owningSchemaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningSchemaName(String newOwningSchemaName) {
		String oldOwningSchemaName = owningSchemaName;
		owningSchemaName = newOwningSchemaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.SET_COLUMN_TYPE__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningTableName() {
		return owningTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTableName(String newOwningTableName) {
		String oldOwningTableName = owningTableName;
		owningTableName = newOwningTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.SET_COLUMN_TYPE__OWNING_TABLE_NAME, oldOwningTableName, owningTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningColumnName() {
		return owningColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningColumnName(String newOwningColumnName) {
		String oldOwningColumnName = owningColumnName;
		owningColumnName = newOwningColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.SET_COLUMN_TYPE__OWNING_COLUMN_NAME, oldOwningColumnName, owningColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewType(PrimitiveType newNewType) {
		PrimitiveType oldNewType = newType;
		newType = newNewType == null ? NEW_TYPE_EDEFAULT : newNewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.SET_COLUMN_TYPE__NEW_TYPE, oldNewType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getOldType() {
		return oldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldType(PrimitiveType newOldType) {
		PrimitiveType oldOldType = oldType;
		oldType = newOldType == null ? OLD_TYPE_EDEFAULT : newOldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.SET_COLUMN_TYPE__OLD_TYPE, oldOldType, oldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.SET_COLUMN_TYPE__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OpsPackage.SET_COLUMN_TYPE__OWNING_TABLE_NAME:
				return getOwningTableName();
			case OpsPackage.SET_COLUMN_TYPE__OWNING_COLUMN_NAME:
				return getOwningColumnName();
			case OpsPackage.SET_COLUMN_TYPE__NEW_TYPE:
				return getNewType();
			case OpsPackage.SET_COLUMN_TYPE__OLD_TYPE:
				return getOldType();
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
			case OpsPackage.SET_COLUMN_TYPE__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OWNING_TABLE_NAME:
				setOwningTableName((String)newValue);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OWNING_COLUMN_NAME:
				setOwningColumnName((String)newValue);
				return;
			case OpsPackage.SET_COLUMN_TYPE__NEW_TYPE:
				setNewType((PrimitiveType)newValue);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OLD_TYPE:
				setOldType((PrimitiveType)newValue);
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
			case OpsPackage.SET_COLUMN_TYPE__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OWNING_TABLE_NAME:
				setOwningTableName(OWNING_TABLE_NAME_EDEFAULT);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OWNING_COLUMN_NAME:
				setOwningColumnName(OWNING_COLUMN_NAME_EDEFAULT);
				return;
			case OpsPackage.SET_COLUMN_TYPE__NEW_TYPE:
				setNewType(NEW_TYPE_EDEFAULT);
				return;
			case OpsPackage.SET_COLUMN_TYPE__OLD_TYPE:
				setOldType(OLD_TYPE_EDEFAULT);
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
			case OpsPackage.SET_COLUMN_TYPE__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OpsPackage.SET_COLUMN_TYPE__OWNING_TABLE_NAME:
				return OWNING_TABLE_NAME_EDEFAULT == null ? owningTableName != null : !OWNING_TABLE_NAME_EDEFAULT.equals(owningTableName);
			case OpsPackage.SET_COLUMN_TYPE__OWNING_COLUMN_NAME:
				return OWNING_COLUMN_NAME_EDEFAULT == null ? owningColumnName != null : !OWNING_COLUMN_NAME_EDEFAULT.equals(owningColumnName);
			case OpsPackage.SET_COLUMN_TYPE__NEW_TYPE:
				return newType != NEW_TYPE_EDEFAULT;
			case OpsPackage.SET_COLUMN_TYPE__OLD_TYPE:
				return oldType != OLD_TYPE_EDEFAULT;
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
		result.append(" (owningSchemaName: ");
		result.append(owningSchemaName);
		result.append(", owningTableName: ");
		result.append(owningTableName);
		result.append(", owningColumnName: ");
		result.append(owningColumnName);
		result.append(", newType: ");
		result.append(newType);
		result.append(", oldType: ");
		result.append(oldType);
		result.append(')');
		return result.toString();
	}

} //SetColumnTypeImpl
