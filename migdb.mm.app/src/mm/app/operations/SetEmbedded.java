/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Embedded</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.SetEmbedded#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.SetEmbedded#isIsEmbedded <em>Is Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getSetEmbedded()
 * @model
 * @generated
 */
public interface SetEmbedded extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm.app.operations.OperationsPackage#getSetEmbedded_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetEmbedded#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Embedded</em>' attribute.
	 * @see #setIsEmbedded(boolean)
	 * @see mm.app.operations.OperationsPackage#getSetEmbedded_IsEmbedded()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsEmbedded();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetEmbedded#isIsEmbedded <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Embedded</em>' attribute.
	 * @see #isIsEmbedded()
	 * @generated
	 */
	void setIsEmbedded(boolean value);

} // SetEmbedded
