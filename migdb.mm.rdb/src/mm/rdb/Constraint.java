/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Constraint#getOwningTable <em>Owning Table</em>}</li>
 *   <li>{@link mm.rdb.Constraint#getOwningColumn <em>Owning Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
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
	 * @see mm.rdb.RdbPackage#getConstraint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owning Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Table</em>' reference.
	 * @see #setOwningTable(Table)
	 * @see mm.rdb.RdbPackage#getConstraint_OwningTable()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Table getOwningTable();

	/**
	 * Sets the value of the '{@link mm.rdb.Constraint#getOwningTable <em>Owning Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Table</em>' reference.
	 * @see #getOwningTable()
	 * @generated
	 */
	void setOwningTable(Table value);

	/**
	 * Returns the value of the '<em><b>Owning Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Column</em>' reference.
	 * @see #setOwningColumn(Column)
	 * @see mm.rdb.RdbPackage#getConstraint_OwningColumn()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Column getOwningColumn();

	/**
	 * Sets the value of the '{@link mm.rdb.Constraint#getOwningColumn <em>Owning Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Column</em>' reference.
	 * @see #getOwningColumn()
	 * @generated
	 */
	void setOwningColumn(Column value);

} // Constraint
