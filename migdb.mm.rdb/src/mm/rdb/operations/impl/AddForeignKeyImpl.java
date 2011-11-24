/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import java.util.Collection;

import mm.rdb.operations.AddForeignKey;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getConstrainedColumnName <em>Constrained Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddForeignKeyImpl#getTargetColumnsNames <em>Target Columns Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddForeignKeyImpl extends ModelOperationImpl implements AddForeignKey {
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
	 * The default value of the '{@link #getTargetTableName() <em>Target Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetTableName() <em>Target Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTableName()
	 * @generated
	 * @ordered
	 */
	protected String targetTableName = TARGET_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstrainedColumnName() <em>Constrained Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINED_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstrainedColumnName() <em>Constrained Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedColumnName()
	 * @generated
	 * @ordered
	 */
	protected String constrainedColumnName = CONSTRAINED_COLUMN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetColumnsNames() <em>Target Columns Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnsNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetColumnsNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.ADD_FOREIGN_KEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_FOREIGN_KEY__OWNING_TABLE_NAME, oldOwningTableName, owningTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetTableName() {
		return targetTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTableName(String newTargetTableName) {
		String oldTargetTableName = targetTableName;
		targetTableName = newTargetTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_FOREIGN_KEY__TARGET_TABLE_NAME, oldTargetTableName, targetTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstrainedColumnName() {
		return constrainedColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedColumnName(String newConstrainedColumnName) {
		String oldConstrainedColumnName = constrainedColumnName;
		constrainedColumnName = newConstrainedColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME, oldConstrainedColumnName, constrainedColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargetColumnsNames() {
		if (targetColumnsNames == null) {
			targetColumnsNames = new EDataTypeUniqueEList<String>(String.class, this, OperationsPackage.ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES);
		}
		return targetColumnsNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_TABLE_NAME:
				return getOwningTableName();
			case OperationsPackage.ADD_FOREIGN_KEY__NAME:
				return getName();
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_TABLE_NAME:
				return getTargetTableName();
			case OperationsPackage.ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME:
				return getConstrainedColumnName();
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES:
				return getTargetColumnsNames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_TABLE_NAME:
				setOwningTableName((String)newValue);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_TABLE_NAME:
				setTargetTableName((String)newValue);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME:
				setConstrainedColumnName((String)newValue);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES:
				getTargetColumnsNames().clear();
				getTargetColumnsNames().addAll((Collection<? extends String>)newValue);
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
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_TABLE_NAME:
				setOwningTableName(OWNING_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_TABLE_NAME:
				setTargetTableName(TARGET_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME:
				setConstrainedColumnName(CONSTRAINED_COLUMN_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES:
				getTargetColumnsNames().clear();
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
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.ADD_FOREIGN_KEY__OWNING_TABLE_NAME:
				return OWNING_TABLE_NAME_EDEFAULT == null ? owningTableName != null : !OWNING_TABLE_NAME_EDEFAULT.equals(owningTableName);
			case OperationsPackage.ADD_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_TABLE_NAME:
				return TARGET_TABLE_NAME_EDEFAULT == null ? targetTableName != null : !TARGET_TABLE_NAME_EDEFAULT.equals(targetTableName);
			case OperationsPackage.ADD_FOREIGN_KEY__CONSTRAINED_COLUMN_NAME:
				return CONSTRAINED_COLUMN_NAME_EDEFAULT == null ? constrainedColumnName != null : !CONSTRAINED_COLUMN_NAME_EDEFAULT.equals(constrainedColumnName);
			case OperationsPackage.ADD_FOREIGN_KEY__TARGET_COLUMNS_NAMES:
				return targetColumnsNames != null && !targetColumnsNames.isEmpty();
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
		result.append(", targetTableName: ");
		result.append(targetTableName);
		result.append(", constrainedColumnName: ");
		result.append(constrainedColumnName);
		result.append(", targetColumnsNames: ");
		result.append(targetColumnsNames);
		result.append(')');
		return result.toString();
	}

} //AddForeignKeyImpl
