/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.CopyInstances#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.CopyInstances#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.CopyInstances#getSourceColumnName <em>Source Column Name</em>}</li>
 *   <li>{@link mm.rdb.ops.CopyInstances#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.CopyInstances#getTargetColumnName <em>Target Column Name</em>}</li>
 *   <li>{@link mm.rdb.ops.CopyInstances#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getCopyInstances()
 * @model
 * @generated
 */
public interface CopyInstances extends ModelOperation {
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
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
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
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_OwningTableName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getOwningTableName <em>Owning Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Table Name</em>' attribute.
	 * @see #getOwningTableName()
	 * @generated
	 */
	void setOwningTableName(String value);

	/**
	 * Returns the value of the '<em><b>Source Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Column Name</em>' attribute.
	 * @see #setSourceColumnName(String)
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_SourceColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceColumnName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getSourceColumnName <em>Source Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Column Name</em>' attribute.
	 * @see #getSourceColumnName()
	 * @generated
	 */
	void setSourceColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Target Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table Name</em>' attribute.
	 * @see #setTargetTableName(String)
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_TargetTableName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getTargetTableName <em>Target Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table Name</em>' attribute.
	 * @see #getTargetTableName()
	 * @generated
	 */
	void setTargetTableName(String value);

	/**
	 * Returns the value of the '<em><b>Target Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Column Name</em>' attribute.
	 * @see #setTargetColumnName(String)
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_TargetColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetColumnName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getTargetColumnName <em>Target Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Column Name</em>' attribute.
	 * @see #getTargetColumnName()
	 * @generated
	 */
	void setTargetColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.rdb.ops.MergeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mm.rdb.ops.MergeType
	 * @see #setType(MergeType)
	 * @see mm.rdb.ops.OpsPackage#getCopyInstances_Type()
	 * @model required="true"
	 * @generated
	 */
	MergeType getType();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.CopyInstances#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mm.rdb.ops.MergeType
	 * @see #getType()
	 * @generated
	 */
	void setType(MergeType value);

} // CopyInstances
