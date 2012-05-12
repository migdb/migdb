/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations;

import mm.rdb.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.operations.SetColumnType#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.SetColumnType#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.SetColumnType#getOwningColumnName <em>Owning Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.SetColumnType#getNewType <em>New Type</em>}</li>
 *   <li>{@link mm.rdb.operations.SetColumnType#getOldType <em>Old Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.operations.OperationsPackage#getSetColumnType()
 * @model
 * @generated
 */
public interface SetColumnType extends ModelOperation {
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
	 * @see mm.rdb.operations.OperationsPackage#getSetColumnType_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.SetColumnType#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
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
	 * @see mm.rdb.operations.OperationsPackage#getSetColumnType_OwningTableName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.SetColumnType#getOwningTableName <em>Owning Table Name</em>}' attribute.
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
	 * @see mm.rdb.operations.OperationsPackage#getSetColumnType_OwningColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningColumnName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.SetColumnType#getOwningColumnName <em>Owning Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Column Name</em>' attribute.
	 * @see #getOwningColumnName()
	 * @generated
	 */
	void setOwningColumnName(String value);

	/**
	 * Returns the value of the '<em><b>New Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.rdb.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #setNewType(PrimitiveType)
	 * @see mm.rdb.operations.OperationsPackage#getSetColumnType_NewType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getNewType();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.SetColumnType#getNewType <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Old Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.rdb.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #setOldType(PrimitiveType)
	 * @see mm.rdb.operations.OperationsPackage#getSetColumnType_OldType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getOldType();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.SetColumnType#getOldType <em>Old Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #getOldType()
	 * @generated
	 */
	void setOldType(PrimitiveType value);

} // SetColumnType
