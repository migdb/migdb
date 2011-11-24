/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.operations.AddSequence#getOwningSchemaName <em>Owning Schema Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddSequence#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.operations.AddSequence#getCacheSize <em>Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.operations.OperationsPackage#getAddSequence()
 * @model
 * @generated
 */
public interface AddSequence extends ModelOperation {
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
	 * @see mm.rdb.operations.OperationsPackage#getAddSequence_OwningSchemaName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningSchemaName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddSequence#getOwningSchemaName <em>Owning Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Schema Name</em>' attribute.
	 * @see #getOwningSchemaName()
	 * @generated
	 */
	void setOwningSchemaName(String value);

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
	 * @see mm.rdb.operations.OperationsPackage#getAddSequence_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddSequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(int)
	 * @see mm.rdb.operations.OperationsPackage#getAddSequence_CacheSize()
	 * @model
	 * @generated
	 */
	int getCacheSize();

	/**
	 * Sets the value of the '{@link mm.rdb.operations.AddSequence#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(int value);

} // AddSequence
