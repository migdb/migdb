/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.InheritanceType;

import mm.app.operations.AddClass;
import mm.app.operations.OperationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#isIsEmbedded <em>Is Embedded</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link mm.app.operations.impl.AddClassImpl#getInheritanceType <em>Inheritance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddClassImpl extends ModelOperationImpl implements AddClass {
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
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected boolean isEmbedded = IS_EMBEDDED_EDEFAULT;

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
	 * The default value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceType INHERITANCE_TYPE_EDEFAULT = InheritanceType._NOT_DEFINED;

	/**
	 * The cached value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected InheritanceType inheritanceType = INHERITANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationsPackage.Literals.ADD_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmbedded() {
		return isEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEmbedded(boolean newIsEmbedded) {
		boolean oldIsEmbedded = isEmbedded;
		isEmbedded = newIsEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__IS_EMBEDDED, oldIsEmbedded, isEmbedded));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceType getInheritanceType() {
		return inheritanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritanceType(InheritanceType newInheritanceType) {
		InheritanceType oldInheritanceType = inheritanceType;
		inheritanceType = newInheritanceType == null ? INHERITANCE_TYPE_EDEFAULT : newInheritanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationsPackage.ADD_CLASS__INHERITANCE_TYPE, oldInheritanceType, inheritanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationsPackage.ADD_CLASS__NAME:
				return getName();
			case OperationsPackage.ADD_CLASS__PARENT:
				return getParent();
			case OperationsPackage.ADD_CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case OperationsPackage.ADD_CLASS__IS_EMBEDDED:
				return isIsEmbedded();
			case OperationsPackage.ADD_CLASS__TABLE_NAME:
				return getTableName();
			case OperationsPackage.ADD_CLASS__INHERITANCE_TYPE:
				return getInheritanceType();
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
			case OperationsPackage.ADD_CLASS__NAME:
				setName((String)newValue);
				return;
			case OperationsPackage.ADD_CLASS__PARENT:
				setParent((String)newValue);
				return;
			case OperationsPackage.ADD_CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case OperationsPackage.ADD_CLASS__IS_EMBEDDED:
				setIsEmbedded((Boolean)newValue);
				return;
			case OperationsPackage.ADD_CLASS__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case OperationsPackage.ADD_CLASS__INHERITANCE_TYPE:
				setInheritanceType((InheritanceType)newValue);
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
			case OperationsPackage.ADD_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_CLASS__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case OperationsPackage.ADD_CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case OperationsPackage.ADD_CLASS__IS_EMBEDDED:
				setIsEmbedded(IS_EMBEDDED_EDEFAULT);
				return;
			case OperationsPackage.ADD_CLASS__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case OperationsPackage.ADD_CLASS__INHERITANCE_TYPE:
				setInheritanceType(INHERITANCE_TYPE_EDEFAULT);
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
			case OperationsPackage.ADD_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OperationsPackage.ADD_CLASS__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case OperationsPackage.ADD_CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case OperationsPackage.ADD_CLASS__IS_EMBEDDED:
				return isEmbedded != IS_EMBEDDED_EDEFAULT;
			case OperationsPackage.ADD_CLASS__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case OperationsPackage.ADD_CLASS__INHERITANCE_TYPE:
				return inheritanceType != INHERITANCE_TYPE_EDEFAULT;
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
		result.append(", parent: ");
		result.append(parent);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isEmbedded: ");
		result.append(isEmbedded);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", inheritanceType: ");
		result.append(inheritanceType);
		result.append(')');
		return result.toString();
	}

} //AddClassImpl
