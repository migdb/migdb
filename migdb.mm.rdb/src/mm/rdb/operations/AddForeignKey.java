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
 * A representation of the model object '<em><b>Add Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getOwningTableName <em>Owning Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getTargetTableName <em>Target Table Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getConstrainedColumnName <em>Constrained Column Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddForeignKey#getTargetColumnsNames <em>Target Columns Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey()
 * @model
 * @generated
 */
public interface AddForeignKey extends ModelOperation {
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
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddForeignKey#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
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
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_OwningTableName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddForeignKey#getOwningTableName <em>Owning Table Name</em>}' attribute.
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
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_TargetTableName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetTableName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddForeignKey#getTargetTableName <em>Target Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table Name</em>' attribute.
	 * @see #getTargetTableName()
	 * @generated
	 */
	void setTargetTableName(String value);

	/**
	 * Returns the value of the '<em><b>Constrained Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Column Name</em>' attribute.
	 * @see #setConstrainedColumnName(String)
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_ConstrainedColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getConstrainedColumnName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddForeignKey#getConstrainedColumnName <em>Constrained Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Column Name</em>' attribute.
	 * @see #getConstrainedColumnName()
	 * @generated
	 */
	void setConstrainedColumnName(String value);

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
	 * @see mm.rdb.operations.OperationsPackage#getAddForeignKey_TargetColumnsNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTargetColumnsNames();

} // AddForeignKey
