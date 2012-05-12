/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.RenameEntity#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.RenameEntity#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getRenameEntity()
 * @model
 * @generated
 */
public interface RenameEntity extends ModelOperation {
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
	 * @see mm.app.operations.OperationsPackage#getRenameEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.RenameEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see mm.app.operations.OperationsPackage#getRenameEntity_NewName()
	 * @model required="true"
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link mm.app.operations.RenameEntity#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // RenameEntity
