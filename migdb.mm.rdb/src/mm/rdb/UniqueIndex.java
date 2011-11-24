/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.UniqueIndex#getUnderlyingIndex <em>Underlying Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getUniqueIndex()
 * @model
 * @generated
 */
public interface UniqueIndex extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Underlying Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underlying Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Index</em>' reference.
	 * @see #setUnderlyingIndex(Index)
	 * @see mm.rdb.RdbPackage#getUniqueIndex_UnderlyingIndex()
	 * @model required="true"
	 * @generated
	 */
	Index getUnderlyingIndex();

	/**
	 * Sets the value of the '{@link mm.rdb.UniqueIndex#getUnderlyingIndex <em>Underlying Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Index</em>' reference.
	 * @see #getUnderlyingIndex()
	 * @generated
	 */
	void setUnderlyingIndex(Index value);

} // UniqueIndex
