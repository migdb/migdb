/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Column Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.SetColumnDefaultValue#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.SetColumnDefaultValue#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.SetColumnDefaultValue#getOwningColumnName <em>Owning Column Name</em>}</li>
 *   <li>{@link mm.rdb.ops.SetColumnDefaultValue#getNewDefaultValue <em>New Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getSetColumnDefaultValue()
 * @model
 * @generated
 */
public interface SetColumnDefaultValue extends ModelOperation {
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
	 * @see mm.rdb.ops.OpsPackage#getSetColumnDefaultValue_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
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
	 * @see mm.rdb.ops.OpsPackage#getSetColumnDefaultValue_OwningTableName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningTableName <em>Owning Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Table Name</em>' attribute.
	 * @see #getOwningTableName()
	 * @generated
	 */
	void setOwningTableName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Column Name</em>' attribute.
	 * @see #setOwningColumnName(String)
	 * @see mm.rdb.ops.OpsPackage#getSetColumnDefaultValue_OwningColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningColumnName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.SetColumnDefaultValue#getOwningColumnName <em>Owning Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Column Name</em>' attribute.
	 * @see #getOwningColumnName()
	 * @generated
	 */
	void setOwningColumnName(String value);

	/**
	 * Returns the value of the '<em><b>New Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Default Value</em>' attribute.
	 * @see #setNewDefaultValue(String)
	 * @see mm.rdb.ops.OpsPackage#getSetColumnDefaultValue_NewDefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getNewDefaultValue();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.SetColumnDefaultValue#getNewDefaultValue <em>New Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Default Value</em>' attribute.
	 * @see #getNewDefaultValue()
	 * @generated
	 */
	void setNewDefaultValue(String value);

} // SetColumnDefaultValue
