/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Table#getOwningSchema <em>Owning Schema</em>}</li>
 *   <li>{@link mm.rdb.Table#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link mm.rdb.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link mm.rdb.Table#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Schema</em>' container reference.
	 * @see mm.rdb.RdbPackage#getTable_OwningSchema()
	 * @see mm.rdb.Schema#getTables
	 * @model opposite="tables" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	Schema getOwningSchema();

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
	 * @see mm.rdb.RdbPackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see mm.rdb.RdbPackage#getTable_PrimaryKey()
	 * @model
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link mm.rdb.Table#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getTable_Columns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.TableConstraint}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.TableConstraint#getOwningTable <em>Owning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getTable_Constraints()
	 * @see mm.rdb.TableConstraint#getOwningTable
	 * @model opposite="owningTable" containment="true" ordered="false"
	 * @generated
	 */
	EList<TableConstraint> getConstraints();

} // Table
