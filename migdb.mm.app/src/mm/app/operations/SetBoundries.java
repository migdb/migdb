/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Boundries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.SetBoundries#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.operations.SetBoundries#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.SetBoundries#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link mm.app.operations.SetBoundries#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getSetBoundries()
 * @model
 * @generated
 */
public interface SetBoundries extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class Name</em>' attribute.
	 * @see #setOwningClassName(String)
	 * @see mm.app.operations.OperationsPackage#getSetBoundries_OwningClassName()
	 * @model required="true"
	 * @generated
	 */
	String getOwningClassName();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetBoundries#getOwningClassName <em>Owning Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class Name</em>' attribute.
	 * @see #getOwningClassName()
	 * @generated
	 */
	void setOwningClassName(String value);

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
	 * @see mm.app.operations.OperationsPackage#getSetBoundries_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetBoundries#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see mm.app.operations.OperationsPackage#getSetBoundries_LowerBound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetBoundries#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see mm.app.operations.OperationsPackage#getSetBoundries_UpperBound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link mm.app.operations.SetBoundries#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // SetBoundries
