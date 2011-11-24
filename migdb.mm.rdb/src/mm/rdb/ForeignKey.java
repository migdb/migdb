/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ForeignKey#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link mm.rdb.ForeignKey#getConstrainedColumn <em>Constrained Column</em>}</li>
 *   <li>{@link mm.rdb.ForeignKey#getTargetColumns <em>Target Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends TableConstraint {
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

	/**
	 * Returns the value of the '<em><b>Constrained Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Column</em>' reference.
	 * @see #setConstrainedColumn(Column)
	 * @see mm.rdb.RdbPackage#getForeignKey_ConstrainedColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getConstrainedColumn();

	/**
	 * Sets the value of the '{@link mm.rdb.ForeignKey#getConstrainedColumn <em>Constrained Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained Column</em>' reference.
	 * @see #getConstrainedColumn()
	 * @generated
	 */
	void setConstrainedColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Target Columns</b></em>' reference list.
	 * The list contents are of type {@link mm.rdb.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Columns</em>' reference list.
	 * @see mm.rdb.RdbPackage#getForeignKey_TargetColumns()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Column> getTargetColumns();

} // ForeignKey
