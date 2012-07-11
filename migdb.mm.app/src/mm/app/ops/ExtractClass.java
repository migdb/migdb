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
 * A representation of the model object '<em><b>Extract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ops.ExtractClass#getSourceClassName <em>Source Class Name</em>}</li>
 *   <li>{@link mm.app.ops.ExtractClass#getExtractPropertiesNames <em>Extract Properties Names</em>}</li>
 *   <li>{@link mm.app.ops.ExtractClass#getExtractClassName <em>Extract Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.ops.OpsPackage#getExtractClass()
 * @model
 * @generated
 */
public interface ExtractClass extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Source Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class Name</em>' attribute.
	 * @see #setSourceClassName(String)
	 * @see mm.app.ops.OpsPackage#getExtractClass_SourceClassName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceClassName();

	/**
	 * Sets the value of the '{@link mm.app.ops.ExtractClass#getSourceClassName <em>Source Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class Name</em>' attribute.
	 * @see #getSourceClassName()
	 * @generated
	 */
	void setSourceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Extract Properties Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract Properties Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract Properties Names</em>' attribute list.
	 * @see mm.app.ops.OpsPackage#getExtractClass_ExtractPropertiesNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getExtractPropertiesNames();

	/**
	 * Returns the value of the '<em><b>Extract Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extract Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extract Class Name</em>' attribute.
	 * @see #setExtractClassName(String)
	 * @see mm.app.ops.OpsPackage#getExtractClass_ExtractClassName()
	 * @model required="true"
	 * @generated
	 */
	String getExtractClassName();

	/**
	 * Sets the value of the '{@link mm.app.ops.ExtractClass#getExtractClassName <em>Extract Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extract Class Name</em>' attribute.
	 * @see #getExtractClassName()
	 * @generated
	 */
	void setExtractClassName(String value);

} // ExtractClass
