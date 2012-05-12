/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.operations.CopyInstances;
import mm.rdb.operations.MergeType;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getSourceColumnName <em>Source Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getTargetColumnName <em>Target Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.CopyInstancesImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyInstancesImpl extends ModelOperationImpl implements CopyInstances {
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
	 * The default value of the '{@link #getSourceColumnName() <em>Source Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceColumnName() <em>Source Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnName()
	 * @generated
	 * @ordered
	 */
	protected String sourceColumnName = SOURCE_COLUMN_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetColumnName() <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumnName()
	 * @generated
	 * @ordered
	 */
	protected String targetColumnName = TARGET_COLUMN_NAME_EDEFAULT;

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
	protected CopyInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.COPY_INSTANCES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__OWNING_TABLE_NAME, oldOwningTableName, owningTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceColumnName() {
		return sourceColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceColumnName(String newSourceColumnName) {
		String oldSourceColumnName = sourceColumnName;
		sourceColumnName = newSourceColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__SOURCE_COLUMN_NAME, oldSourceColumnName, sourceColumnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__TARGET_TABLE_NAME, oldTargetTableName, targetTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetColumnName() {
		return targetColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetColumnName(String newTargetColumnName) {
		String oldTargetColumnName = targetColumnName;
		targetColumnName = newTargetColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__TARGET_COLUMN_NAME, oldTargetColumnName, targetColumnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.COPY_INSTANCES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.COPY_INSTANCES__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.COPY_INSTANCES__OWNING_TABLE_NAME:
				return getOwningTableName();
			case OperationsPackage.COPY_INSTANCES__SOURCE_COLUMN_NAME:
				return getSourceColumnName();
			case OperationsPackage.COPY_INSTANCES__TARGET_TABLE_NAME:
				return getTargetTableName();
			case OperationsPackage.COPY_INSTANCES__TARGET_COLUMN_NAME:
				return getTargetColumnName();
			case OperationsPackage.COPY_INSTANCES__TYPE:
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
			case OperationsPackage.COPY_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.COPY_INSTANCES__OWNING_TABLE_NAME:
				setOwningTableName((String)newValue);
				return;
			case OperationsPackage.COPY_INSTANCES__SOURCE_COLUMN_NAME:
				setSourceColumnName((String)newValue);
				return;
			case OperationsPackage.COPY_INSTANCES__TARGET_TABLE_NAME:
				setTargetTableName((String)newValue);
				return;
			case OperationsPackage.COPY_INSTANCES__TARGET_COLUMN_NAME:
				setTargetColumnName((String)newValue);
				return;
			case OperationsPackage.COPY_INSTANCES__TYPE:
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
			case OperationsPackage.COPY_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_INSTANCES__OWNING_TABLE_NAME:
				setOwningTableName(OWNING_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_INSTANCES__SOURCE_COLUMN_NAME:
				setSourceColumnName(SOURCE_COLUMN_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_INSTANCES__TARGET_TABLE_NAME:
				setTargetTableName(TARGET_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_INSTANCES__TARGET_COLUMN_NAME:
				setTargetColumnName(TARGET_COLUMN_NAME_EDEFAULT);
				return;
			case OperationsPackage.COPY_INSTANCES__TYPE:
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
			case OperationsPackage.COPY_INSTANCES__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.COPY_INSTANCES__OWNING_TABLE_NAME:
				return OWNING_TABLE_NAME_EDEFAULT == null ? owningTableName != null : !OWNING_TABLE_NAME_EDEFAULT.equals(owningTableName);
			case OperationsPackage.COPY_INSTANCES__SOURCE_COLUMN_NAME:
				return SOURCE_COLUMN_NAME_EDEFAULT == null ? sourceColumnName != null : !SOURCE_COLUMN_NAME_EDEFAULT.equals(sourceColumnName);
			case OperationsPackage.COPY_INSTANCES__TARGET_TABLE_NAME:
				return TARGET_TABLE_NAME_EDEFAULT == null ? targetTableName != null : !TARGET_TABLE_NAME_EDEFAULT.equals(targetTableName);
			case OperationsPackage.COPY_INSTANCES__TARGET_COLUMN_NAME:
				return TARGET_COLUMN_NAME_EDEFAULT == null ? targetColumnName != null : !TARGET_COLUMN_NAME_EDEFAULT.equals(targetColumnName);
			case OperationsPackage.COPY_INSTANCES__TYPE:
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
		result.append(" (owningSchemaName: ");
		result.append(owningSchemaName);
		result.append(", owningTableName: ");
		result.append(owningTableName);
		result.append(", sourceColumnName: ");
		result.append(sourceColumnName);
		result.append(", targetTableName: ");
		result.append(targetTableName);
		result.append(", targetColumnName: ");
		result.append(targetColumnName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CopyInstancesImpl
