/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.impl;

import mm.app.AppPackage;
import mm.app.InheritanceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.impl.ClassImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link mm.app.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm.app.impl.ClassImpl#getInheritanceType <em>Inheritance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends AbstractClassImpl implements mm.app.Class {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected mm.app.Class parent;

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
	 * The default value of the '{@link #getInheritanceType() <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceType()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceType INHERITANCE_TYPE_EDEFAULT = InheritanceType.JOINED;

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
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mm.app.Class getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (mm.app.Class)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.CLASS__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mm.app.Class basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(mm.app.Class newParent) {
		mm.app.Class oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.CLASS__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.CLASS__INHERITANCE_TYPE, oldInheritanceType, inheritanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.CLASS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AppPackage.CLASS__IS_ABSTRACT:
				return isIsAbstract();
			case AppPackage.CLASS__INHERITANCE_TYPE:
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
			case AppPackage.CLASS__PARENT:
				setParent((mm.app.Class)newValue);
				return;
			case AppPackage.CLASS__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case AppPackage.CLASS__INHERITANCE_TYPE:
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
			case AppPackage.CLASS__PARENT:
				setParent((mm.app.Class)null);
				return;
			case AppPackage.CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case AppPackage.CLASS__INHERITANCE_TYPE:
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
			case AppPackage.CLASS__PARENT:
				return parent != null;
			case AppPackage.CLASS__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case AppPackage.CLASS__INHERITANCE_TYPE:
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", inheritanceType: ");
		result.append(inheritanceType);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
