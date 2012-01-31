/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.Column;
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
 *   <li>{@link mm.rdb.impl.SequenceImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link mm.rdb.impl.SequenceImpl#getSequencedColumn <em>Sequenced Column</em>}</li>
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
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final int START_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected int startValue = START_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSequencedColumn() <em>Sequenced Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencedColumn()
	 * @generated
	 * @ordered
	 */
	protected Column sequencedColumn;

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
	public int getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(int newStartValue) {
		int oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.SEQUENCE__START_VALUE, oldStartValue, startValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getSequencedColumn() {
		if (sequencedColumn != null && sequencedColumn.eIsProxy()) {
			InternalEObject oldSequencedColumn = (InternalEObject)sequencedColumn;
			sequencedColumn = (Column)eResolveProxy(oldSequencedColumn);
			if (sequencedColumn != oldSequencedColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbPackage.SEQUENCE__SEQUENCED_COLUMN, oldSequencedColumn, sequencedColumn));
			}
		}
		return sequencedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetSequencedColumn() {
		return sequencedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequencedColumn(Column newSequencedColumn) {
		Column oldSequencedColumn = sequencedColumn;
		sequencedColumn = newSequencedColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.SEQUENCE__SEQUENCED_COLUMN, oldSequencedColumn, sequencedColumn));
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
			case RdbPackage.SEQUENCE__START_VALUE:
				return getStartValue();
			case RdbPackage.SEQUENCE__SEQUENCED_COLUMN:
				if (resolve) return getSequencedColumn();
				return basicGetSequencedColumn();
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
			case RdbPackage.SEQUENCE__START_VALUE:
				setStartValue((Integer)newValue);
				return;
			case RdbPackage.SEQUENCE__SEQUENCED_COLUMN:
				setSequencedColumn((Column)newValue);
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
			case RdbPackage.SEQUENCE__START_VALUE:
				setStartValue(START_VALUE_EDEFAULT);
				return;
			case RdbPackage.SEQUENCE__SEQUENCED_COLUMN:
				setSequencedColumn((Column)null);
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
			case RdbPackage.SEQUENCE__START_VALUE:
				return startValue != START_VALUE_EDEFAULT;
			case RdbPackage.SEQUENCE__SEQUENCED_COLUMN:
				return sequencedColumn != null;
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
		result.append(", startValue: ");
		result.append(startValue);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl
