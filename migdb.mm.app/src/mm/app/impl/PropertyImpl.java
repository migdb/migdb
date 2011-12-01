/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.impl;

import mm.app.AbstractClass;
import mm.app.AppPackage;
import mm.app.Entity;
import mm.app.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.impl.PropertyImpl#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getOppositeProperty <em>Opposite Property</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#isIsID <em>Is ID</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getColumnNamePattern <em>Column Name Pattern</em>}</li>
 *   <li>{@link mm.app.impl.PropertyImpl#getSequenceName <em>Sequence Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The cached value of the '{@link #getOwningClass() <em>Owning Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClass()
	 * @generated
	 * @ordered
	 */
	protected AbstractClass owningClass;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Entity type;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOppositeProperty() <em>Opposite Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeProperty()
	 * @generated
	 * @ordered
	 */
	protected Property oppositeProperty;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsID() <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsID()
	 * @generated
	 * @ordered
	 */
	protected boolean isID = IS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnNamePattern() <em>Column Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnNamePattern() <em>Column Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String columnNamePattern = COLUMN_NAME_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceName() <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceName()
	 * @generated
	 * @ordered
	 */
	protected String sequenceName = SEQUENCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractClass getOwningClass() {
		if (owningClass != null && owningClass.eIsProxy()) {
			InternalEObject oldOwningClass = (InternalEObject)owningClass;
			owningClass = (AbstractClass)eResolveProxy(oldOwningClass);
			if (owningClass != oldOwningClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.PROPERTY__OWNING_CLASS, oldOwningClass, owningClass));
			}
		}
		return owningClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractClass basicGetOwningClass() {
		return owningClass;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Entity)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Entity newType) {
		Entity oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOppositeProperty() {
		if (oppositeProperty != null && oppositeProperty.eIsProxy()) {
			InternalEObject oldOppositeProperty = (InternalEObject)oppositeProperty;
			oppositeProperty = (Property)eResolveProxy(oldOppositeProperty);
			if (oppositeProperty != oldOppositeProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.PROPERTY__OPPOSITE_PROPERTY, oldOppositeProperty, oppositeProperty));
			}
		}
		return oppositeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOppositeProperty() {
		return oppositeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOppositeProperty(Property newOppositeProperty) {
		Property oldOppositeProperty = oppositeProperty;
		oppositeProperty = newOppositeProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__OPPOSITE_PROPERTY, oldOppositeProperty, oppositeProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsID() {
		return isID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(boolean newIsID) {
		boolean oldIsID = isID;
		isID = newIsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__IS_ID, oldIsID, isID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnNamePattern() {
		return columnNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnNamePattern(String newColumnNamePattern) {
		String oldColumnNamePattern = columnNamePattern;
		columnNamePattern = newColumnNamePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__COLUMN_NAME_PATTERN, oldColumnNamePattern, columnNamePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequenceName() {
		return sequenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceName(String newSequenceName) {
		String oldSequenceName = sequenceName;
		sequenceName = newSequenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.PROPERTY__SEQUENCE_NAME, oldSequenceName, sequenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.PROPERTY__OWNING_CLASS:
				if (resolve) return getOwningClass();
				return basicGetOwningClass();
			case AppPackage.PROPERTY__NAME:
				return getName();
			case AppPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AppPackage.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case AppPackage.PROPERTY__OPPOSITE_PROPERTY:
				if (resolve) return getOppositeProperty();
				return basicGetOppositeProperty();
			case AppPackage.PROPERTY__LOWER_BOUND:
				return getLowerBound();
			case AppPackage.PROPERTY__UPPER_BOUND:
				return getUpperBound();
			case AppPackage.PROPERTY__IS_ORDERED:
				return isIsOrdered();
			case AppPackage.PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case AppPackage.PROPERTY__IS_ID:
				return isIsID();
			case AppPackage.PROPERTY__COLUMN_NAME:
				return getColumnName();
			case AppPackage.PROPERTY__COLUMN_NAME_PATTERN:
				return getColumnNamePattern();
			case AppPackage.PROPERTY__SEQUENCE_NAME:
				return getSequenceName();
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
			case AppPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case AppPackage.PROPERTY__TYPE:
				setType((Entity)newValue);
				return;
			case AppPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AppPackage.PROPERTY__OPPOSITE_PROPERTY:
				setOppositeProperty((Property)newValue);
				return;
			case AppPackage.PROPERTY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case AppPackage.PROPERTY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case AppPackage.PROPERTY__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case AppPackage.PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case AppPackage.PROPERTY__IS_ID:
				setIsID((Boolean)newValue);
				return;
			case AppPackage.PROPERTY__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case AppPackage.PROPERTY__COLUMN_NAME_PATTERN:
				setColumnNamePattern((String)newValue);
				return;
			case AppPackage.PROPERTY__SEQUENCE_NAME:
				setSequenceName((String)newValue);
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
			case AppPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppPackage.PROPERTY__TYPE:
				setType((Entity)null);
				return;
			case AppPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AppPackage.PROPERTY__OPPOSITE_PROPERTY:
				setOppositeProperty((Property)null);
				return;
			case AppPackage.PROPERTY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case AppPackage.PROPERTY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case AppPackage.PROPERTY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case AppPackage.PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case AppPackage.PROPERTY__IS_ID:
				setIsID(IS_ID_EDEFAULT);
				return;
			case AppPackage.PROPERTY__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case AppPackage.PROPERTY__COLUMN_NAME_PATTERN:
				setColumnNamePattern(COLUMN_NAME_PATTERN_EDEFAULT);
				return;
			case AppPackage.PROPERTY__SEQUENCE_NAME:
				setSequenceName(SEQUENCE_NAME_EDEFAULT);
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
			case AppPackage.PROPERTY__OWNING_CLASS:
				return owningClass != null;
			case AppPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppPackage.PROPERTY__TYPE:
				return type != null;
			case AppPackage.PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case AppPackage.PROPERTY__OPPOSITE_PROPERTY:
				return oppositeProperty != null;
			case AppPackage.PROPERTY__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case AppPackage.PROPERTY__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case AppPackage.PROPERTY__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case AppPackage.PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case AppPackage.PROPERTY__IS_ID:
				return isID != IS_ID_EDEFAULT;
			case AppPackage.PROPERTY__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case AppPackage.PROPERTY__COLUMN_NAME_PATTERN:
				return COLUMN_NAME_PATTERN_EDEFAULT == null ? columnNamePattern != null : !COLUMN_NAME_PATTERN_EDEFAULT.equals(columnNamePattern);
			case AppPackage.PROPERTY__SEQUENCE_NAME:
				return SEQUENCE_NAME_EDEFAULT == null ? sequenceName != null : !SEQUENCE_NAME_EDEFAULT.equals(sequenceName);
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isID: ");
		result.append(isID);
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", columnNamePattern: ");
		result.append(columnNamePattern);
		result.append(", sequenceName: ");
		result.append(sequenceName);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
