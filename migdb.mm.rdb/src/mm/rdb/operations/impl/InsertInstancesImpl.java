/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import java.util.Collection;

import mm.rdb.operations.InsertInstances;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.InsertInstancesImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.InsertInstancesImpl#getSourceTableName <em>Source Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.InsertInstancesImpl#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.InsertInstancesImpl#getSourceColumnsNames <em>Source Columns Names</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.InsertInstancesImpl#getTargetColumnsNames <em>Target Columns Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertInstancesImpl extends ModelOperationImpl implements InsertInstances {
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
	 * The default value of the '{@link #getSourceTableName() <em>Source Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTableName() <em>Source Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTableName()
	 * @generated
	 * @ordered
	 */
	protected String sourceTableName = SOURCE_TABLE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSourceColumnsNames() <em>Source Columns Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnsNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceColumnsNames;

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
	protected InsertInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.INSERT_INSTANCES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.INSERT_INSTANCES__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceTableName() {
		return sourceTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTableName(String newSourceTableName) {
		String oldSourceTableName = sourceTableName;
		sourceTableName = newSourceTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.INSERT_INSTANCES__SOURCE_TABLE_NAME, oldSourceTableName, sourceTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.INSERT_INSTANCES__TARGET_TABLE_NAME, oldTargetTableName, targetTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSourceColumnsNames() {
		if (sourceColumnsNames == null) {
			sourceColumnsNames = new EDataTypeUniqueEList<String>(String.class, this, OperationsPackage.INSERT_INSTANCES__SOURCE_COLUMNS_NAMES);
		}
		return sourceColumnsNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargetColumnsNames() {
		if (targetColumnsNames == null) {
			targetColumnsNames = new EDataTypeUniqueEList<String>(String.class, this, OperationsPackage.INSERT_INSTANCES__TARGET_COLUMNS_NAMES);
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
			case OperationsPackage.INSERT_INSTANCES__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.INSERT_INSTANCES__SOURCE_TABLE_NAME:
				return getSourceTableName();
			case OperationsPackage.INSERT_INSTANCES__TARGET_TABLE_NAME:
				return getTargetTableName();
			case OperationsPackage.INSERT_INSTANCES__SOURCE_COLUMNS_NAMES:
				return getSourceColumnsNames();
			case OperationsPackage.INSERT_INSTANCES__TARGET_COLUMNS_NAMES:
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
			case OperationsPackage.INSERT_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.INSERT_INSTANCES__SOURCE_TABLE_NAME:
				setSourceTableName((String)newValue);
				return;
			case OperationsPackage.INSERT_INSTANCES__TARGET_TABLE_NAME:
				setTargetTableName((String)newValue);
				return;
			case OperationsPackage.INSERT_INSTANCES__SOURCE_COLUMNS_NAMES:
				getSourceColumnsNames().clear();
				getSourceColumnsNames().addAll((Collection<? extends String>)newValue);
				return;
			case OperationsPackage.INSERT_INSTANCES__TARGET_COLUMNS_NAMES:
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
			case OperationsPackage.INSERT_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.INSERT_INSTANCES__SOURCE_TABLE_NAME:
				setSourceTableName(SOURCE_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.INSERT_INSTANCES__TARGET_TABLE_NAME:
				setTargetTableName(TARGET_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.INSERT_INSTANCES__SOURCE_COLUMNS_NAMES:
				getSourceColumnsNames().clear();
				return;
			case OperationsPackage.INSERT_INSTANCES__TARGET_COLUMNS_NAMES:
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
			case OperationsPackage.INSERT_INSTANCES__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.INSERT_INSTANCES__SOURCE_TABLE_NAME:
				return SOURCE_TABLE_NAME_EDEFAULT == null ? sourceTableName != null : !SOURCE_TABLE_NAME_EDEFAULT.equals(sourceTableName);
			case OperationsPackage.INSERT_INSTANCES__TARGET_TABLE_NAME:
				return TARGET_TABLE_NAME_EDEFAULT == null ? targetTableName != null : !TARGET_TABLE_NAME_EDEFAULT.equals(targetTableName);
			case OperationsPackage.INSERT_INSTANCES__SOURCE_COLUMNS_NAMES:
				return sourceColumnsNames != null && !sourceColumnsNames.isEmpty();
			case OperationsPackage.INSERT_INSTANCES__TARGET_COLUMNS_NAMES:
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
		result.append(", sourceTableName: ");
		result.append(sourceTableName);
		result.append(", targetTableName: ");
		result.append(targetTableName);
		result.append(", sourceColumnsNames: ");
		result.append(sourceColumnsNames);
		result.append(", targetColumnsNames: ");
		result.append(targetColumnsNames);
		result.append(')');
		return result.toString();
	}

} //InsertInstancesImpl
