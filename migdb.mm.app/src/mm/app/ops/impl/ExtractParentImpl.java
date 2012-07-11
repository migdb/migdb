/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops.impl;

import java.util.Collection;

import mm.app.ops.ExtractParent;
import mm.app.ops.OpsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract Parent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm.app.ops.impl.ExtractParentImpl#getSourceClassesName <em>Source Classes Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.ExtractParentImpl#getExtractPropertiesName <em>Extract Properties Name</em>}</li>
 *   <li>{@link mm.app.ops.impl.ExtractParentImpl#getExtractParentName <em>Extract Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractParentImpl extends ModelOperationImpl implements ExtractParent {
	/**
	 * The cached value of the '{@link #getSourceClassesName() <em>Source Classes Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClassesName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceClassesName;

	/**
	 * The cached value of the '{@link #getExtractPropertiesName() <em>Extract Properties Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractPropertiesName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extractPropertiesName;

	/**
	 * The default value of the '{@link #getExtractParentName() <em>Extract Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRACT_PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtractParentName() <em>Extract Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractParentName()
	 * @generated
	 * @ordered
	 */
	protected String extractParentName = EXTRACT_PARENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractParentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpsPackage.Literals.EXTRACT_PARENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSourceClassesName() {
		if (sourceClassesName == null) {
			sourceClassesName = new EDataTypeUniqueEList<String>(String.class, this, OpsPackage.EXTRACT_PARENT__SOURCE_CLASSES_NAME);
		}
		return sourceClassesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtractPropertiesName() {
		if (extractPropertiesName == null) {
			extractPropertiesName = new EDataTypeUniqueEList<String>(String.class, this, OpsPackage.EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME);
		}
		return extractPropertiesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtractParentName() {
		return extractParentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractParentName(String newExtractParentName) {
		String oldExtractParentName = extractParentName;
		extractParentName = newExtractParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpsPackage.EXTRACT_PARENT__EXTRACT_PARENT_NAME, oldExtractParentName, extractParentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpsPackage.EXTRACT_PARENT__SOURCE_CLASSES_NAME:
				return getSourceClassesName();
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME:
				return getExtractPropertiesName();
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PARENT_NAME:
				return getExtractParentName();
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
			case OpsPackage.EXTRACT_PARENT__SOURCE_CLASSES_NAME:
				getSourceClassesName().clear();
				getSourceClassesName().addAll((Collection<? extends String>)newValue);
				return;
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME:
				getExtractPropertiesName().clear();
				getExtractPropertiesName().addAll((Collection<? extends String>)newValue);
				return;
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PARENT_NAME:
				setExtractParentName((String)newValue);
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
			case OpsPackage.EXTRACT_PARENT__SOURCE_CLASSES_NAME:
				getSourceClassesName().clear();
				return;
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME:
				getExtractPropertiesName().clear();
				return;
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PARENT_NAME:
				setExtractParentName(EXTRACT_PARENT_NAME_EDEFAULT);
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
			case OpsPackage.EXTRACT_PARENT__SOURCE_CLASSES_NAME:
				return sourceClassesName != null && !sourceClassesName.isEmpty();
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PROPERTIES_NAME:
				return extractPropertiesName != null && !extractPropertiesName.isEmpty();
			case OpsPackage.EXTRACT_PARENT__EXTRACT_PARENT_NAME:
				return EXTRACT_PARENT_NAME_EDEFAULT == null ? extractParentName != null : !EXTRACT_PARENT_NAME_EDEFAULT.equals(extractParentName);
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
		result.append(" (sourceClassesName: ");
		result.append(sourceClassesName);
		result.append(", extractPropertiesName: ");
		result.append(extractPropertiesName);
		result.append(", extractParentName: ");
		result.append(extractParentName);
		result.append(')');
		return result.toString();
	}

} //ExtractParentImpl
