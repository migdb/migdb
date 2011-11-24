/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.operations.AddUniqueIndex;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Unique Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.AddUniqueIndexImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddUniqueIndexImpl#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddUniqueIndexImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddUniqueIndexImpl#getUnderlyingIndexName <em>Underlying Index Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddUniqueIndexImpl extends ModelOperationImpl implements AddUniqueIndex {
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
	 * The default value of the '{@link #getUnderlyingIndexName() <em>Underlying Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingIndexName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNDERLYING_INDEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderlyingIndexName() <em>Underlying Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingIndexName()
	 * @generated
	 * @ordered
	 */
	protected String underlyingIndexName = UNDERLYING_INDEX_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddUniqueIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.ADD_UNIQUE_INDEX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_UNIQUE_INDEX__OWNING_TABLE_NAME, oldOwningTableName, owningTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_UNIQUE_INDEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnderlyingIndexName() {
		return underlyingIndexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlyingIndexName(String newUnderlyingIndexName) {
		String oldUnderlyingIndexName = underlyingIndexName;
		underlyingIndexName = newUnderlyingIndexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME, oldUnderlyingIndexName, underlyingIndexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_TABLE_NAME:
				return getOwningTableName();
			case OperationsPackage.ADD_UNIQUE_INDEX__NAME:
				return getName();
			case OperationsPackage.ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME:
				return getUnderlyingIndexName();
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
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_TABLE_NAME:
				setOwningTableName((String)newValue);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__NAME:
				setName((String)newValue);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME:
				setUnderlyingIndexName((String)newValue);
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
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_TABLE_NAME:
				setOwningTableName(OWNING_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME:
				setUnderlyingIndexName(UNDERLYING_INDEX_NAME_EDEFAULT);
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
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.ADD_UNIQUE_INDEX__OWNING_TABLE_NAME:
				return OWNING_TABLE_NAME_EDEFAULT == null ? owningTableName != null : !OWNING_TABLE_NAME_EDEFAULT.equals(owningTableName);
			case OperationsPackage.ADD_UNIQUE_INDEX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperationsPackage.ADD_UNIQUE_INDEX__UNDERLYING_INDEX_NAME:
				return UNDERLYING_INDEX_NAME_EDEFAULT == null ? underlyingIndexName != null : !UNDERLYING_INDEX_NAME_EDEFAULT.equals(underlyingIndexName);
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
		result.append(", name: ");
		result.append(name);
		result.append(", underlyingIndexName: ");
		result.append(underlyingIndexName);
		result.append(')');
		return result.toString();
	}

} //AddUniqueIndexImpl
