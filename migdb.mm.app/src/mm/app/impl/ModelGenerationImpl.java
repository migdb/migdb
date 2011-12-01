/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.impl;

import java.util.Collection;

import mm.app.AppPackage;
import mm.app.Entity;
import mm.app.ModelGeneration;
import mm.app.ModelRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.impl.ModelGenerationImpl#getModelRoot <em>Model Root</em>}</li>
 *   <li>{@link mm.app.impl.ModelGenerationImpl#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mm.app.impl.ModelGenerationImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelGenerationImpl extends EObjectImpl implements ModelGeneration {
	/**
	 * The default value of the '{@link #isIsMissing() <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MISSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMissing() <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMissing()
	 * @generated
	 * @ordered
	 */
	protected boolean isMissing = IS_MISSING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelGenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.MODEL_GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot getModelRoot() {
		if (eContainerFeatureID() != AppPackage.MODEL_GENERATION__MODEL_ROOT) return null;
		return (ModelRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMissing() {
		return isMissing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMissing(boolean newIsMissing) {
		boolean oldIsMissing = isMissing;
		isMissing = newIsMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.MODEL_GENERATION__IS_MISSING, oldIsMissing, isMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, AppPackage.MODEL_GENERATION__CLASSES, AppPackage.ENTITY__OWNING_MODEL);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.MODEL_GENERATION__MODEL_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, AppPackage.MODEL_GENERATION__MODEL_ROOT, msgs);
			case AppPackage.MODEL_GENERATION__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
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
			case AppPackage.MODEL_GENERATION__MODEL_ROOT:
				return eBasicSetContainer(null, AppPackage.MODEL_GENERATION__MODEL_ROOT, msgs);
			case AppPackage.MODEL_GENERATION__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case AppPackage.MODEL_GENERATION__MODEL_ROOT:
				return eInternalContainer().eInverseRemove(this, AppPackage.MODEL_ROOT__MODEL_GENERATIONS, ModelRoot.class, msgs);
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
			case AppPackage.MODEL_GENERATION__MODEL_ROOT:
				return getModelRoot();
			case AppPackage.MODEL_GENERATION__IS_MISSING:
				return isIsMissing();
			case AppPackage.MODEL_GENERATION__CLASSES:
				return getClasses();
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
			case AppPackage.MODEL_GENERATION__IS_MISSING:
				setIsMissing((Boolean)newValue);
				return;
			case AppPackage.MODEL_GENERATION__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Entity>)newValue);
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
			case AppPackage.MODEL_GENERATION__IS_MISSING:
				setIsMissing(IS_MISSING_EDEFAULT);
				return;
			case AppPackage.MODEL_GENERATION__CLASSES:
				getClasses().clear();
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
			case AppPackage.MODEL_GENERATION__MODEL_ROOT:
				return getModelRoot() != null;
			case AppPackage.MODEL_GENERATION__IS_MISSING:
				return isMissing != IS_MISSING_EDEFAULT;
			case AppPackage.MODEL_GENERATION__CLASSES:
				return classes != null && !classes.isEmpty();
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
		result.append(" (isMissing: ");
		result.append(isMissing);
		result.append(')');
		return result.toString();
	}

} //ModelGenerationImpl
