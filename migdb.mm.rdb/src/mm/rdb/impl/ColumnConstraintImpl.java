/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.Column;
import mm.rdb.ColumnConstraint;
import mm.rdb.RdbPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.ColumnConstraintImpl#getOwningColumn <em>Owning Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ColumnConstraintImpl extends ConstraintImpl implements ColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.COLUMN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getOwningColumn() {
		if (eContainerFeatureID() != RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN) return null;
		return (Column)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN:
				return eBasicSetContainer(null, RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN:
				return eInternalContainer().eInverseRemove(this, RdbPackage.COLUMN__CONSTRAINTS, Column.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN:
				return getOwningColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdbPackage.COLUMN_CONSTRAINT__OWNING_COLUMN:
				return getOwningColumn() != null;
		}
		return super.eIsSet(featureID);
	}

} //ColumnConstraintImpl
