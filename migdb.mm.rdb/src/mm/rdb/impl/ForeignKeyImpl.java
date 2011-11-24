/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import java.util.Collection;

import mm.rdb.Column;
import mm.rdb.ForeignKey;
import mm.rdb.RdbPackage;
import mm.rdb.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.ForeignKeyImpl#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link mm.rdb.impl.ForeignKeyImpl#getConstrainedColumn <em>Constrained Column</em>}</li>
 *   <li>{@link mm.rdb.impl.ForeignKeyImpl#getTargetColumns <em>Target Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends TableConstraintImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getTargetTable() <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTable()
	 * @generated
	 * @ordered
	 */
	protected Table targetTable;

	/**
	 * The cached value of the '{@link #getConstrainedColumn() <em>Constrained Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedColumn()
	 * @generated
	 * @ordered
	 */
	protected Column constrainedColumn;

	/**
	 * The cached value of the '{@link #getTargetColumns() <em>Target Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> targetColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTargetTable() {
		if (targetTable != null && targetTable.eIsProxy()) {
			InternalEObject oldTargetTable = (InternalEObject)targetTable;
			targetTable = (Table)eResolveProxy(oldTargetTable);
			if (targetTable != oldTargetTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
			}
		}
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTargetTable() {
		return targetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTable(Table newTargetTable) {
		Table oldTargetTable = targetTable;
		targetTable = newTargetTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.FOREIGN_KEY__TARGET_TABLE, oldTargetTable, targetTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getConstrainedColumn() {
		if (constrainedColumn != null && constrainedColumn.eIsProxy()) {
			InternalEObject oldConstrainedColumn = (InternalEObject)constrainedColumn;
			constrainedColumn = (Column)eResolveProxy(oldConstrainedColumn);
			if (constrainedColumn != oldConstrainedColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN, oldConstrainedColumn, constrainedColumn));
			}
		}
		return constrainedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetConstrainedColumn() {
		return constrainedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedColumn(Column newConstrainedColumn) {
		Column oldConstrainedColumn = constrainedColumn;
		constrainedColumn = newConstrainedColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN, oldConstrainedColumn, constrainedColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getTargetColumns() {
		if (targetColumns == null) {
			targetColumns = new EObjectResolvingEList<Column>(Column.class, this, RdbPackage.FOREIGN_KEY__TARGET_COLUMNS);
		}
		return targetColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbPackage.FOREIGN_KEY__TARGET_TABLE:
				if (resolve) return getTargetTable();
				return basicGetTargetTable();
			case RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN:
				if (resolve) return getConstrainedColumn();
				return basicGetConstrainedColumn();
			case RdbPackage.FOREIGN_KEY__TARGET_COLUMNS:
				return getTargetColumns();
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
			case RdbPackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)newValue);
				return;
			case RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN:
				setConstrainedColumn((Column)newValue);
				return;
			case RdbPackage.FOREIGN_KEY__TARGET_COLUMNS:
				getTargetColumns().clear();
				getTargetColumns().addAll((Collection<? extends Column>)newValue);
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
			case RdbPackage.FOREIGN_KEY__TARGET_TABLE:
				setTargetTable((Table)null);
				return;
			case RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN:
				setConstrainedColumn((Column)null);
				return;
			case RdbPackage.FOREIGN_KEY__TARGET_COLUMNS:
				getTargetColumns().clear();
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
			case RdbPackage.FOREIGN_KEY__TARGET_TABLE:
				return targetTable != null;
			case RdbPackage.FOREIGN_KEY__CONSTRAINED_COLUMN:
				return constrainedColumn != null;
			case RdbPackage.FOREIGN_KEY__TARGET_COLUMNS:
				return targetColumns != null && !targetColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyImpl
