/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.InsertInstances#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.InsertInstances#getSourceTableName <em>Source Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.InsertInstances#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.InsertInstances#getSourceColumnsNames <em>Source Columns Names</em>}</li>
 *   <li>{@link mm.rdb.ops.InsertInstances#getTargetColumnsNames <em>Target Columns Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getInsertInstances()
 * @model
 * @generated
 */
public interface InsertInstances extends ModelOperation {
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
	 * @see mm.rdb.ops.OpsPackage#getInsertInstances_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.InsertInstances#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #getOwningSchemaName()
	 * @generated
	 */
	void setOwningSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Source Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Table Name</em>' attribute.
	 * @see #setSourceTableName(String)
	 * @see mm.rdb.ops.OpsPackage#getInsertInstances_SourceTableName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.InsertInstances#getSourceTableName <em>Source Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table Name</em>' attribute.
	 * @see #getSourceTableName()
	 * @generated
	 */
	void setSourceTableName(String value);

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
	 * @see mm.rdb.ops.OpsPackage#getInsertInstances_TargetTableName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.InsertInstances#getTargetTableName <em>Target Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table Name</em>' attribute.
	 * @see #getTargetTableName()
	 * @generated
	 */
	void setTargetTableName(String value);

	/**
	 * Returns the value of the '<em><b>Source Columns Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Columns Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Columns Names</em>' attribute list.
	 * @see mm.rdb.ops.OpsPackage#getInsertInstances_SourceColumnsNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSourceColumnsNames();

	/**
	 * Returns the value of the '<em><b>Target Columns Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Columns Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Columns Names</em>' attribute list.
	 * @see mm.rdb.ops.OpsPackage#getInsertInstances_TargetColumnsNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTargetColumnsNames();

} // InsertInstances
