/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.testing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.testing.Result#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link mm.testing.Result#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link mm.testing.Result#getOwningModel <em>Owning Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.testing.TestingPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see mm.testing.TestingPackage#getResult_ErrorMessage()
	 * @model required="true"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link mm.testing.Result#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see mm.testing.TestingPackage#getResult_IsValid()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link mm.testing.Result#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm.testing.ModelRoot#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model</em>' reference.
	 * @see #setOwningModel(ModelRoot)
	 * @see mm.testing.TestingPackage#getResult_OwningModel()
	 * @see mm.testing.ModelRoot#getResult
	 * @model opposite="result" required="true"
	 * @generated
	 */
	ModelRoot getOwningModel();

	/**
	 * Sets the value of the '{@link mm.testing.Result#getOwningModel <em>Owning Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Model</em>' reference.
	 * @see #getOwningModel()
	 * @generated
	 */
	void setOwningModel(ModelRoot value);

} // Result
