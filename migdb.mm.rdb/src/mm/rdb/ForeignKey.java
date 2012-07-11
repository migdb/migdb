/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ForeignKey#getTargetTable <em>Target Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Target Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Table</em>' reference.
	 * @see #setTargetTable(Table)
	 * @see mm.rdb.RdbPackage#getForeignKey_TargetTable()
	 * @model required="true"
	 * @generated
	 */
	Table getTargetTable();

	/**
	 * Sets the value of the '{@link mm.rdb.ForeignKey#getTargetTable <em>Target Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Table</em>' reference.
	 * @see #getTargetTable()
	 * @generated
	 */
	void setTargetTable(Table value);

} // ForeignKey
