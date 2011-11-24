/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.RdbPackage;
import mm.rdb.Schema;
import mm.rdb.Sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.SequenceImpl#getOwningSchema <em>Owning Schema</em>}</li>
 *   <li>{@link mm.rdb.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.impl.SequenceImpl#getCacheSize <em>Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends EObjectImpl implements Sequence {
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
	 * The default value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheSize()
	 * @generated
	 * @ordered
	 */
	protected int cacheSize = CACHE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getOwningSchema() {
		if (eContainerFeatureID() != RdbPackage.SEQUENCE__OWNING_SCHEMA) return null;
		return (Schema)eContainer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCacheSize() {
		return cacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheSize(int newCacheSize) {
		int oldCacheSize = cacheSize;
		cacheSize = newCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.SEQUENCE__CACHE_SIZE, oldCacheSize, cacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbPackage.SEQUENCE__OWNING_SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, RdbPackage.SEQUENCE__OWNING_SCHEMA, msgs);
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
			case RdbPackage.SEQUENCE__OWNING_SCHEMA:
				return eBasicSetContainer(null, RdbPackage.SEQUENCE__OWNING_SCHEMA, msgs);
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
			case RdbPackage.SEQUENCE__OWNING_SCHEMA:
				return eInternalContainer().eInverseRemove(this, RdbPackage.SCHEMA__SEQUENCES, Schema.class, msgs);
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
			case RdbPackage.SEQUENCE__OWNING_SCHEMA:
				return getOwningSchema();
			case RdbPackage.SEQUENCE__NAME:
				return getName();
			case RdbPackage.SEQUENCE__CACHE_SIZE:
				return getCacheSize();
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
			case RdbPackage.SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case RdbPackage.SEQUENCE__CACHE_SIZE:
				setCacheSize((Integer)newValue);
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
			case RdbPackage.SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbPackage.SEQUENCE__CACHE_SIZE:
				setCacheSize(CACHE_SIZE_EDEFAULT);
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
			case RdbPackage.SEQUENCE__OWNING_SCHEMA:
				return getOwningSchema() != null;
			case RdbPackage.SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbPackage.SEQUENCE__CACHE_SIZE:
				return cacheSize != CACHE_SIZE_EDEFAULT;
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
		result.append(", cacheSize: ");
		result.append(cacheSize);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl
