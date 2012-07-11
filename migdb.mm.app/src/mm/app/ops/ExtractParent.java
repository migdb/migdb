/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ops.ExtractParent#getSourceClassesName <em>Source Classes Name</em>}</li>
 *   <li>{@link mm.app.ops.ExtractParent#getExtractPropertiesName <em>Extract Properties Name</em>}</li>
 *   <li>{@link mm.app.ops.ExtractParent#getExtractParentName <em>Extract Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.ops.OpsPackage#getExtractParent()
 * @model
 * @generated
 */
public interface ExtractParent extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Source Classes Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Classes Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Classes Name</em>' attribute list.
	 * @see mm.app.ops.OpsPackage#getExtractParent_SourceClassesName()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSourceClassesName();

	/**
	 * Returns the value of the '<em><b>Extract Properties Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract Properties Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract Properties Name</em>' attribute list.
	 * @see mm.app.ops.OpsPackage#getExtractParent_ExtractPropertiesName()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getExtractPropertiesName();

	/**
	 * Returns the value of the '<em><b>Extract Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract Parent Name</em>' attribute.
	 * @see #setExtractParentName(String)
	 * @see mm.app.ops.OpsPackage#getExtractParent_ExtractParentName()
	 * @model required="true"
	 * @generated
	 */
	String getExtractParentName();

	/**
	 * Sets the value of the '{@link mm.app.ops.ExtractParent#getExtractParentName <em>Extract Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extract Parent Name</em>' attribute.
	 * @see #getExtractParentName()
	 * @generated
	 */
	void setExtractParentName(String value);

} // ExtractParent
