/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.RemoveColumn#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.RemoveColumn#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.RemoveColumn#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getRemoveColumn()
 * @model
 * @generated
 */
public interface RemoveColumn extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Owning Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Schema Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #setOwningSchemaName(String)
	 * @see mm.rdb.ops.OpsPackage#getRemoveColumn_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.RemoveColumn#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #getOwningSchemaName()
	 * @generated
	 */
	void setOwningSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Table Name</em>' attribute.
	 * @see #setOwningTableName(String)
	 * @see mm.rdb.ops.OpsPackage#getRemoveColumn_OwningTableName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.RemoveColumn#getOwningTableName <em>Owning Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Table Name</em>' attribute.
	 * @see #getOwningTableName()
	 * @generated
	 */
	void setOwningTableName(String value);

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
	 * @see mm.rdb.ops.OpsPackage#getRemoveColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.RemoveColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RemoveColumn
