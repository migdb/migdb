/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has No Own Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.operations.HasNoOwnInstances#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.HasNoOwnInstances#getTableName <em>Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.HasNoOwnInstances#getDescendantsNames <em>Descendants Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.operations.OperationsPackage#getHasNoOwnInstances()
 * @model
 * @generated
 */
public interface HasNoOwnInstances extends ModelOperation {
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
	 * @see mm.rdb.operations.OperationsPackage#getHasNoOwnInstances_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.HasNoOwnInstances#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #getOwningSchemaName()
	 * @generated
	 */
	void setOwningSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see mm.rdb.operations.OperationsPackage#getHasNoOwnInstances_TableName()
	 * @model required="true"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.HasNoOwnInstances#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Descendants Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descendants Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descendants Names</em>' attribute list.
	 * @see mm.rdb.operations.OperationsPackage#getHasNoOwnInstances_DescendantsNames()
	 * @model
	 * @generated
	 */
	EList<String> getDescendantsNames();

} // HasNoOwnInstances
