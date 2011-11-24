/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.operations.AddProperty;
import mm.app.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getColumnNamePattern <em>Column Name Pattern</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddPropertyImpl#getSequenceName <em>Sequence Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddPropertyImpl extends ModelOperationImpl implements AddProperty {
	/**
	 * The default value of the '{@link #getOwningClassName() <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningClassName() <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassName()
	 * @generated
	 * @ordered
	 */
	protected String owningClassName = OWNING_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	protected static final int UPPER_BOUND_EDEFAULT = 0;

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
	protected AddPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.ADD_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningClassName() {
		return owningClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningClassName(String newOwningClassName) {
		String oldOwningClassName = owningClassName;
		owningClassName = newOwningClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__OWNING_CLASS_NAME, oldOwningClassName, owningClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__LOWER_BOUND, oldLowerBound, lowerBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__UPPER_BOUND, oldUpperBound, upperBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__COLUMN_NAME, oldColumnName, columnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__COLUMN_NAME_PATTERN, oldColumnNamePattern, columnNamePattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_PROPERTY__SEQUENCE_NAME, oldSequenceName, sequenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.ADD_PROPERTY__OWNING_CLASS_NAME:
				return getOwningClassName();
			case OperationsPackage.ADD_PROPERTY__NAME:
				return getName();
			case OperationsPackage.ADD_PROPERTY__TYPE:
				return getType();
			case OperationsPackage.ADD_PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case OperationsPackage.ADD_PROPERTY__LOWER_BOUND:
				return getLowerBound();
			case OperationsPackage.ADD_PROPERTY__UPPER_BOUND:
				return getUpperBound();
			case OperationsPackage.ADD_PROPERTY__IS_ORDERED:
				return isIsOrdered();
			case OperationsPackage.ADD_PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME:
				return getColumnName();
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME_PATTERN:
				return getColumnNamePattern();
			case OperationsPackage.ADD_PROPERTY__SEQUENCE_NAME:
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
			case OperationsPackage.ADD_PROPERTY__OWNING_CLASS_NAME:
				setOwningClassName((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME_PATTERN:
				setColumnNamePattern((String)newValue);
				return;
			case OperationsPackage.ADD_PROPERTY__SEQUENCE_NAME:
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
			case OperationsPackage.ADD_PROPERTY__OWNING_CLASS_NAME:
				setOwningClassName(OWNING_CLASS_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME_PATTERN:
				setColumnNamePattern(COLUMN_NAME_PATTERN_EDEFAULT);
				return;
			case OperationsPackage.ADD_PROPERTY__SEQUENCE_NAME:
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
			case OperationsPackage.ADD_PROPERTY__OWNING_CLASS_NAME:
				return OWNING_CLASS_NAME_EDEFAULT == null ? owningClassName != null : !OWNING_CLASS_NAME_EDEFAULT.equals(owningClassName);
			case OperationsPackage.ADD_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperationsPackage.ADD_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OperationsPackage.ADD_PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case OperationsPackage.ADD_PROPERTY__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case OperationsPackage.ADD_PROPERTY__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case OperationsPackage.ADD_PROPERTY__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case OperationsPackage.ADD_PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case OperationsPackage.ADD_PROPERTY__COLUMN_NAME_PATTERN:
				return COLUMN_NAME_PATTERN_EDEFAULT == null ? columnNamePattern != null : !COLUMN_NAME_PATTERN_EDEFAULT.equals(columnNamePattern);
			case OperationsPackage.ADD_PROPERTY__SEQUENCE_NAME:
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
		result.append(" (owningClassName: ");
		result.append(owningClassName);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
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
		result.append(", columnName: ");
		result.append(columnName);
		result.append(", columnNamePattern: ");
		result.append(columnNamePattern);
		result.append(", sequenceName: ");
		result.append(sequenceName);
		result.append(')');
		return result.toString();
	}

} //AddPropertyImpl
