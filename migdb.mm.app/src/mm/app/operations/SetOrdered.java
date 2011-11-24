/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Ordered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.SetOrdered#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.operations.SetOrdered#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.SetOrdered#isIsOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getSetOrdered()
 * @model
 * @generated
 */
public interface SetOrdered extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class Name</em>' attribute.
	 * @see #setOwningClassName(String)
	 * @see mm.app.operations.OperationsPackage#getSetOrdered_OwningClassName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningClassName();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetOrdered#getOwningClassName <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class Name</em>' attribute.
	 * @see #getOwningClassName()
	 * @generated
	 */
	void setOwningClassName(String value);

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
	 * @see mm.app.operations.OperationsPackage#getSetOrdered_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetOrdered#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see mm.app.operations.OperationsPackage#getSetOrdered_IsOrdered()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetOrdered#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

} // SetOrdered
