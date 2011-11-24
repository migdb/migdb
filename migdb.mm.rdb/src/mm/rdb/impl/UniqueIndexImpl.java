/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.Index;
import mm.rdb.RdbPackage;
import mm.rdb.UniqueIndex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.UniqueIndexImpl#getUnderlyingIndex <em>Underlying Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniqueIndexImpl extends TableConstraintImpl implements UniqueIndex {
	/**
	 * The cached value of the '{@link #getUnderlyingIndex() <em>Underlying Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingIndex()
	 * @generated
	 * @ordered
	 */
	protected Index underlyingIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.UNIQUE_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index getUnderlyingIndex() {
		if (underlyingIndex != null && underlyingIndex.eIsProxy()) {
			InternalEObject oldUnderlyingIndex = (InternalEObject)underlyingIndex;
			underlyingIndex = (Index)eResolveProxy(oldUnderlyingIndex);
			if (underlyingIndex != oldUnderlyingIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX, oldUnderlyingIndex, underlyingIndex));
			}
		}
		return underlyingIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index basicGetUnderlyingIndex() {
		return underlyingIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlyingIndex(Index newUnderlyingIndex) {
		Index oldUnderlyingIndex = underlyingIndex;
		underlyingIndex = newUnderlyingIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX, oldUnderlyingIndex, underlyingIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX:
				if (resolve) return getUnderlyingIndex();
				return basicGetUnderlyingIndex();
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
			case RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX:
				setUnderlyingIndex((Index)newValue);
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
			case RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX:
				setUnderlyingIndex((Index)null);
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
			case RdbPackage.UNIQUE_INDEX__UNDERLYING_INDEX:
				return underlyingIndex != null;
		}
		return super.eIsSet(featureID);
	}

} //UniqueIndexImpl
