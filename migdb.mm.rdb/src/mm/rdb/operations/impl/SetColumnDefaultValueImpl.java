/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.operations.OperationsPackage;
import mm.rdb.operations.SetColumnDefaultValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Column Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.SetColumnDefaultValueImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.SetColumnDefaultValueImpl#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.SetColumnDefaultValueImpl#getOwningColumnName <em>Owning Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.SetColumnDefaultValueImpl#getNewDefaultValue <em>New Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetColumnDefaultValueImpl extends ModelOperationImpl implements SetColumnDefaultValue {
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
	 * The default value of the '{@link #getNewDefaultValue() <em>New Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewDefaultValue() <em>New Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String newDefaultValue = NEW_DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetColumnDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.SET_COLUMN_DEFAULT_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME, oldOwningTableName, owningTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME, oldOwningColumnName, owningColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewDefaultValue() {
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDefaultValue(String newNewDefaultValue) {
		String oldNewDefaultValue = newDefaultValue;
		newDefaultValue = newNewDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE, oldNewDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME:
				return getOwningTableName();
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME:
				return getOwningColumnName();
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE:
				return getNewDefaultValue();
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
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME:
				setOwningTableName((String)newValue);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME:
				setOwningColumnName((String)newValue);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE:
				setNewDefaultValue((String)newValue);
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
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME:
				setOwningTableName(OWNING_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME:
				setOwningColumnName(OWNING_COLUMN_NAME_EDEFAULT);
				return;
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE:
				setNewDefaultValue(NEW_DEFAULT_VALUE_EDEFAULT);
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
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_TABLE_NAME:
				return OWNING_TABLE_NAME_EDEFAULT == null ? owningTableName != null : !OWNING_TABLE_NAME_EDEFAULT.equals(owningTableName);
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__OWNING_COLUMN_NAME:
				return OWNING_COLUMN_NAME_EDEFAULT == null ? owningColumnName != null : !OWNING_COLUMN_NAME_EDEFAULT.equals(owningColumnName);
			case OperationsPackage.SET_COLUMN_DEFAULT_VALUE__NEW_DEFAULT_VALUE:
				return NEW_DEFAULT_VALUE_EDEFAULT == null ? newDefaultValue != null : !NEW_DEFAULT_VALUE_EDEFAULT.equals(newDefaultValue);
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
		result.append(", newDefaultValue: ");
		result.append(newDefaultValue);
		result.append(')');
		return result.toString();
	}

} //SetColumnDefaultValueImpl
