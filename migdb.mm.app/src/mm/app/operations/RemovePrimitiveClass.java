/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Primitive Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.RemovePrimitiveClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getRemovePrimitiveClass()
 * @model
 * @generated
 */
public interface RemovePrimitiveClass extends ModelOperation {
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
	 * @see mm.app.operations.OperationsPackage#getRemovePrimitiveClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.RemovePrimitiveClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RemovePrimitiveClass
