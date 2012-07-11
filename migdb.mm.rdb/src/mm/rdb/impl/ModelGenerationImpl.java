/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import java.util.Collection;

import mm.rdb.ModelGeneration;
import mm.rdb.ModelRoot;
import mm.rdb.RdbPackage;
import mm.rdb.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.rdb.impl.ModelGenerationImpl#getModelRoot <em>Model Root</em>}</li>
 *   <li>{@link mm.rdb.impl.ModelGenerationImpl#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mm.rdb.impl.ModelGenerationImpl#getSchemas <em>Schemas</em>}</li>
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
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schemas;

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
		return RdbPackage.Literals.MODEL_GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot getModelRoot() {
		if (eContainerFeatureID() != RdbPackage.MODEL_GENERATION__MODEL_ROOT) return null;
		return (ModelRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelRoot(ModelRoot newModelRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelRoot, RdbPackage.MODEL_GENERATION__MODEL_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRoot(ModelRoot newModelRoot) {
		if (newModelRoot != eInternalContainer() || (eContainerFeatureID() != RdbPackage.MODEL_GENERATION__MODEL_ROOT && newModelRoot != null)) {
			if (EcoreUtil.isAncestor(this, newModelRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelRoot != null)
				msgs = ((InternalEObject)newModelRoot).eInverseAdd(this, RdbPackage.MODEL_ROOT__MODEL_GENERATIONS, ModelRoot.class, msgs);
			msgs = basicSetModelRoot(newModelRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.MODEL_GENERATION__MODEL_ROOT, newModelRoot, newModelRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbPackage.MODEL_GENERATION__IS_MISSING, oldIsMissing, isMissing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentWithInverseEList<Schema>(Schema.class, this, RdbPackage.MODEL_GENERATION__SCHEMAS, RdbPackage.SCHEMA__OWNING_MODEL);
		}
		return schemas;
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelRoot((ModelRoot)otherEnd, msgs);
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchemas()).basicAdd(otherEnd, msgs);
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				return basicSetModelRoot(null, msgs);
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				return eInternalContainer().eInverseRemove(this, RdbPackage.MODEL_ROOT__MODEL_GENERATIONS, ModelRoot.class, msgs);
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				return getModelRoot();
			case RdbPackage.MODEL_GENERATION__IS_MISSING:
				return isIsMissing();
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				return getSchemas();
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				setModelRoot((ModelRoot)newValue);
				return;
			case RdbPackage.MODEL_GENERATION__IS_MISSING:
				setIsMissing((Boolean)newValue);
				return;
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends Schema>)newValue);
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				setModelRoot((ModelRoot)null);
				return;
			case RdbPackage.MODEL_GENERATION__IS_MISSING:
				setIsMissing(IS_MISSING_EDEFAULT);
				return;
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				getSchemas().clear();
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
			case RdbPackage.MODEL_GENERATION__MODEL_ROOT:
				return getModelRoot() != null;
			case RdbPackage.MODEL_GENERATION__IS_MISSING:
				return isMissing != IS_MISSING_EDEFAULT;
			case RdbPackage.MODEL_GENERATION__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
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
