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
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.testing.ModelRoot#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.testing.TestingPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm.testing.Result#getOwningModel <em>Owning Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Result)
	 * @see mm.testing.TestingPackage#getModelRoot_Result()
	 * @see mm.testing.Result#getOwningModel
	 * @model opposite="owningModel" required="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link mm.testing.ModelRoot#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

} // ModelRoot
