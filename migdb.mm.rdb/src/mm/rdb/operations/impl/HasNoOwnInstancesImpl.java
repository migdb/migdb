/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import java.util.Collection;

import mm.rdb.operations.HasNoOwnInstances;
import mm.rdb.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has No Own Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.operations.impl.HasNoOwnInstancesImpl#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.HasNoOwnInstancesImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.impl.HasNoOwnInstancesImpl#getDescendantsNames <em>Descendants Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasNoOwnInstancesImpl extends ModelOperationImpl implements HasNoOwnInstances {
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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescendantsNames() <em>Descendants Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendantsNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descendantsNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasNoOwnInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.HAS_NO_OWN_INSTANCES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME, oldOwningSchemaName, owningSchemaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.HAS_NO_OWN_INSTANCES__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescendantsNames() {
		if (descendantsNames == null) {
			descendantsNames = new EDataTypeUniqueEList<String>(String.class, this, OperationsPackage.HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES);
		}
		return descendantsNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME:
				return getOwningSchemaName();
			case OperationsPackage.HAS_NO_OWN_INSTANCES__TABLE_NAME:
				return getTableName();
			case OperationsPackage.HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES:
				return getDescendantsNames();
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
			case OperationsPackage.HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName((String)newValue);
				return;
			case OperationsPackage.HAS_NO_OWN_INSTANCES__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case OperationsPackage.HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES:
				getDescendantsNames().clear();
				getDescendantsNames().addAll((Collection<? extends String>)newValue);
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
			case OperationsPackage.HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME:
				setOwningSchemaName(OWNING_SCHEMA_NAME_EDEFAULT);
				return;
			case OperationsPackage.HAS_NO_OWN_INSTANCES__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES:
				getDescendantsNames().clear();
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
			case OperationsPackage.HAS_NO_OWN_INSTANCES__OWNING_SCHEMA_NAME:
				return OWNING_SCHEMA_NAME_EDEFAULT == null ? owningSchemaName != null : !OWNING_SCHEMA_NAME_EDEFAULT.equals(owningSchemaName);
			case OperationsPackage.HAS_NO_OWN_INSTANCES__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case OperationsPackage.HAS_NO_OWN_INSTANCES__DESCENDANTS_NAMES:
				return descendantsNames != null && !descendantsNames.isEmpty();
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
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", descendantsNames: ");
		result.append(descendantsNames);
		result.append(')');
		return result.toString();
	}

} //HasNoOwnInstancesImpl
