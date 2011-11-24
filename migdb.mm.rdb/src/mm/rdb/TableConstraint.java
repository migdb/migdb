/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.TableConstraint#getOwningTable <em>Owning Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getTableConstraint()
 * @model abstract="true"
 * @generated
 */
public interface TableConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Owning Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Table#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Table</em>' container reference.
	 * @see mm.rdb.RdbPackage#getTableConstraint_OwningTable()
	 * @see mm.rdb.Table#getConstraints
	 * @model opposite="constraints" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	Table getOwningTable();

} // TableConstraint
