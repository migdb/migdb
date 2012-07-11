/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops.impl;

import java.util.Collection;

import mm.app.ops.ExtractClass;
import mm.app.ops.OpsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.ops.impl.ExtractClassImpl#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.ExtractClassImpl#getExtractPropertiesNames <em>Extract Properties Names</em>}</li>
 *   <li>{@link mm.app.ops.impl.ExtractClassImpl#getExtractClassName <em>Extract Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractClassImpl extends ModelOperationImpl implements ExtractClass {
	/**
	 * The default value of the '{@link #getSourceClassName() <em>Source Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceClassName() <em>Source Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassName()
	 * @generated
	 * @ordered
	 */
	protected String sourceClassName = SOURCE_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtractPropertiesNames() <em>Extract Properties Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractPropertiesNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extractPropertiesNames;

	/**
	 * The default value of the '{@link #getExtractClassName() <em>Extract Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRACT_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtractClassName() <em>Extract Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractClassName()
	 * @generated
	 * @ordered
	 */
	protected String extractClassName = EXTRACT_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.EXTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceClassName() {
		return sourceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClassName(String newSourceClassName) {
		String oldSourceClassName = sourceClassName;
		sourceClassName = newSourceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME, oldSourceClassName, sourceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtractPropertiesNames() {
		if (extractPropertiesNames == null) {
			extractPropertiesNames = new EDataTypeUniqueEList<String>(String.class, this, OpsPackage.EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES);
		}
		return extractPropertiesNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtractClassName() {
		return extractClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractClassName(String newExtractClassName) {
		String oldExtractClassName = extractClassName;
		extractClassName = newExtractClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.EXTRACT_CLASS__EXTRACT_CLASS_NAME, oldExtractClassName, extractClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				return getSourceClassName();
			case OpsPackage.EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES:
				return getExtractPropertiesNames();
			case OpsPackage.EXTRACT_CLASS__EXTRACT_CLASS_NAME:
				return getExtractClassName();
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
			case OpsPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				setSourceClassName((String)newValue);
				return;
			case OpsPackage.EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES:
				getExtractPropertiesNames().clear();
				getExtractPropertiesNames().addAll((Collection<? extends String>)newValue);
				return;
			case OpsPackage.EXTRACT_CLASS__EXTRACT_CLASS_NAME:
				setExtractClassName((String)newValue);
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
			case OpsPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				setSourceClassName(SOURCE_CLASS_NAME_EDEFAULT);
				return;
			case OpsPackage.EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES:
				getExtractPropertiesNames().clear();
				return;
			case OpsPackage.EXTRACT_CLASS__EXTRACT_CLASS_NAME:
				setExtractClassName(EXTRACT_CLASS_NAME_EDEFAULT);
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
			case OpsPackage.EXTRACT_CLASS__SOURCE_CLASS_NAME:
				return SOURCE_CLASS_NAME_EDEFAULT == null ? sourceClassName != null : !SOURCE_CLASS_NAME_EDEFAULT.equals(sourceClassName);
			case OpsPackage.EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES:
				return extractPropertiesNames != null && !extractPropertiesNames.isEmpty();
			case OpsPackage.EXTRACT_CLASS__EXTRACT_CLASS_NAME:
				return EXTRACT_CLASS_NAME_EDEFAULT == null ? extractClassName != null : !EXTRACT_CLASS_NAME_EDEFAULT.equals(extractClassName);
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
		result.append(" (sourceClassName: ");
		result.append(sourceClassName);
		result.append(", extractPropertiesNames: ");
		result.append(extractPropertiesNames);
		result.append(", extractClassName: ");
		result.append(extractClassName);
		result.append(')');
		return result.toString();
	}

} //ExtractClassImpl
