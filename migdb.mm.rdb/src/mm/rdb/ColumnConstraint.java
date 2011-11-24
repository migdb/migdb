/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ColumnConstraint#getOwningColumn <em>Owning Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getColumnConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ColumnConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Owning Column</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Column#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Column</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Column</em>' container reference.
	 * @see mm.rdb.RdbPackage#getColumnConstraint_OwningColumn()
	 * @see mm.rdb.Column#getConstraints
	 * @model opposite="constraints" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	Column getOwningColumn();

} // ColumnConstraint
