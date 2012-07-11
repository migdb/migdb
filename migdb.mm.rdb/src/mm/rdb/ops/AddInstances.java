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
 * A representation of the model object '<em><b>Add Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.AddInstances#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.ops.AddInstances#getSourceTableName <em>Source Table Name</em>}</li>
 *   <li>{@link mm.rdb.ops.AddInstances#getTargetTableNames <em>Target Table Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getAddInstances()
 * @model
 * @generated
 */
public interface AddInstances extends ModelOperation {
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
	 * @see mm.rdb.ops.OpsPackage#getAddInstances_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.AddInstances#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
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
	 * @see mm.rdb.ops.OpsPackage#getAddInstances_SourceTableName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.AddInstances#getSourceTableName <em>Source Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Table Name</em>' attribute.
	 * @see #getSourceTableName()
	 * @generated
	 */
	void setSourceTableName(String value);

	/**
	 * Returns the value of the '<em><b>Target Table Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Table Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table Names</em>' attribute list.
	 * @see mm.rdb.ops.OpsPackage#getAddInstances_TargetTableNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTargetTableNames();

} // AddInstances
