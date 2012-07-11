/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.Column;
import mm.rdb.Constraint;
import mm.rdb.RdbPackage;
import mm.rdb.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.impl.ConstraintImpl#getOwningTable <em>Owning Table</em>}</li>
 *   <li>{@link mm.rdb.impl.ConstraintImpl#getOwningColumn <em>Owning Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends EObjectImpl implements Constraint {
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
	 * The cached value of the '{@link #getOwningTable() <em>Owning Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTable()
	 * @generated
	 * @ordered
	 */
	protected Table owningTable;

	/**
	 * The cached value of the '{@link #getOwningColumn() <em>Owning Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningColumn()
	 * @generated
	 * @ordered
	 */
	protected Column owningColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwningTable() {
		if (owningTable != null && owningTable.eIsProxy()) {
			InternalEObject oldOwningTable = (InternalEObject)owningTable;
			owningTable = (Table)eResolveProxy(oldOwningTable);
			if (owningTable != oldOwningTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.CONSTRAINT__OWNING_TABLE, oldOwningTable, owningTable));
			}
		}
		return owningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetOwningTable() {
		return owningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTable(Table newOwningTable) {
		Table oldOwningTable = owningTable;
		owningTable = newOwningTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.CONSTRAINT__OWNING_TABLE, oldOwningTable, owningTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getOwningColumn() {
		if (owningColumn != null && owningColumn.eIsProxy()) {
			InternalEObject oldOwningColumn = (InternalEObject)owningColumn;
			owningColumn = (Column)eResolveProxy(oldOwningColumn);
			if (owningColumn != oldOwningColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.CONSTRAINT__OWNING_COLUMN, oldOwningColumn, owningColumn));
			}
		}
		return owningColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetOwningColumn() {
		return owningColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningColumn(Column newOwningColumn) {
		Column oldOwningColumn = owningColumn;
		owningColumn = newOwningColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.CONSTRAINT__OWNING_COLUMN, oldOwningColumn, owningColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbPackage.CONSTRAINT__NAME:
				return getName();
			case RdbPackage.CONSTRAINT__OWNING_TABLE:
				if (resolve) return getOwningTable();
				return basicGetOwningTable();
			case RdbPackage.CONSTRAINT__OWNING_COLUMN:
				if (resolve) return getOwningColumn();
				return basicGetOwningColumn();
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
			case RdbPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case RdbPackage.CONSTRAINT__OWNING_TABLE:
				setOwningTable((Table)newValue);
				return;
			case RdbPackage.CONSTRAINT__OWNING_COLUMN:
				setOwningColumn((Column)newValue);
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
			case RdbPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbPackage.CONSTRAINT__OWNING_TABLE:
				setOwningTable((Table)null);
				return;
			case RdbPackage.CONSTRAINT__OWNING_COLUMN:
				setOwningColumn((Column)null);
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
			case RdbPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbPackage.CONSTRAINT__OWNING_TABLE:
				return owningTable != null;
			case RdbPackage.CONSTRAINT__OWNING_COLUMN:
				return owningColumn != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
