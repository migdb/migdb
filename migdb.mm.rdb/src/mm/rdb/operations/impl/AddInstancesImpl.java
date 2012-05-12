/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import java.util.Collection;

import mm.rdb.operations.AddInstances;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.AddInstancesImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddInstancesImpl#getSourceTableName <em>Source Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.AddInstancesImpl#getTargetTableNames <em>Target Table Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddInstancesImpl extends ModelOperationImpl implements AddInstances {
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
	 * The cached value of the '{@link #getTargetTableNames() <em>Target Table Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTableNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetTableNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.ADD_INSTANCES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_INSTANCES__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_INSTANCES__SOURCE_TABLE_NAME, oldSourceTableName, sourceTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargetTableNames() {
		if (targetTableNames == null) {
			targetTableNames = new EDataTypeUniqueEList<String>(String.class, this, OperationsPackage.ADD_INSTANCES__TARGET_TABLE_NAMES);
		}
		return targetTableNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.ADD_INSTANCES__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.ADD_INSTANCES__SOURCE_TABLE_NAME:
				return getSourceTableName();
			case OperationsPackage.ADD_INSTANCES__TARGET_TABLE_NAMES:
				return getTargetTableNames();
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
			case OperationsPackage.ADD_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.ADD_INSTANCES__SOURCE_TABLE_NAME:
				setSourceTableName((String)newValue);
				return;
			case OperationsPackage.ADD_INSTANCES__TARGET_TABLE_NAMES:
				getTargetTableNames().clear();
				getTargetTableNames().addAll((Collection<? extends String>)newValue);
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
			case OperationsPackage.ADD_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_INSTANCES__SOURCE_TABLE_NAME:
				setSourceTableName(SOURCE_TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_INSTANCES__TARGET_TABLE_NAMES:
				getTargetTableNames().clear();
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
			case OperationsPackage.ADD_INSTANCES__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.ADD_INSTANCES__SOURCE_TABLE_NAME:
				return SOURCE_TABLE_NAME_EDEFAULT == null ? sourceTableName != null : !SOURCE_TABLE_NAME_EDEFAULT.equals(sourceTableName);
			case OperationsPackage.ADD_INSTANCES__TARGET_TABLE_NAMES:
				return targetTableNames != null && !targetTableNames.isEmpty();
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
		result.append(", targetTableNames: ");
		result.append(targetTableNames);
		result.append(')');
		return result.toString();
	}

} //AddInstancesImpl
