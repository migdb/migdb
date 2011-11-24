/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.dml.impl;

import java.util.Collection;

import mm.rdb.dml.ColumnReference;
import mm.rdb.dml.DmlPackage;
import mm.rdb.dml.Query;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.dml.impl.QueryImpl#getColumnReferences <em>Column References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
	/**
	 * The cached value of the '{@link #getColumnReferences() <em>Column References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnReference> columnReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DmlPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnReference> getColumnReferences() {
		if (columnReferences == null) {
			columnReferences = new EObjectContainmentEList<ColumnReference>(ColumnReference.class, this, DmlPackage.QUERY__COLUMN_REFERENCES);
		}
		return columnReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DmlPackage.QUERY__COLUMN_REFERENCES:
				return ((InternalEList<?>)getColumnReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DmlPackage.QUERY__COLUMN_REFERENCES:
				return getColumnReferences();
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
			case DmlPackage.QUERY__COLUMN_REFERENCES:
				getColumnReferences().clear();
				getColumnReferences().addAll((Collection<? extends ColumnReference>)newValue);
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
			case DmlPackage.QUERY__COLUMN_REFERENCES:
				getColumnReferences().clear();
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
			case DmlPackage.QUERY__COLUMN_REFERENCES:
				return columnReferences != null && !columnReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
