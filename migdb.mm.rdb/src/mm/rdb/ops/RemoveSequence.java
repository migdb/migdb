/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ops.RemoveSequence#getSequenceName <em>Sequence Name</em>}</li>
 *   <li>{@link mm.rdb.ops.RemoveSequence#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.ops.OpsPackage#getRemoveSequence()
 * @model
 * @generated
 */
public interface RemoveSequence extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Name</em>' attribute.
	 * @see #setSequenceName(String)
	 * @see mm.rdb.ops.OpsPackage#getRemoveSequence_SequenceName()
	 * @model required="true"
	 * @generated
	 */
	String getSequenceName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.RemoveSequence#getSequenceName <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Name</em>' attribute.
	 * @see #getSequenceName()
	 * @generated
	 */
	void setSequenceName(String value);

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
	 * @see mm.rdb.ops.OpsPackage#getRemoveSequence_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.ops.RemoveSequence#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #getOwningSchemaName()
	 * @generated
	 */
	void setOwningSchemaName(String value);

} // RemoveSequence
