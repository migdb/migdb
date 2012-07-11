/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Opposite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ops.SetOpposite#getFirstClassName <em>First Class Name</em>}</li>
 *   <li>{@link mm.app.ops.SetOpposite#getFirstPropertyName <em>First Property Name</em>}</li>
 *   <li>{@link mm.app.ops.SetOpposite#getSecondClassName <em>Second Class Name</em>}</li>
 *   <li>{@link mm.app.ops.SetOpposite#getSecondPropertyName <em>Second Property Name</em>}</li>
 *   <li>{@link mm.app.ops.SetOpposite#isIsOpposite <em>Is Opposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.ops.OpsPackage#getSetOpposite()
 * @model
 * @generated
 */
public interface SetOpposite extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>First Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Class Name</em>' attribute.
	 * @see #setFirstClassName(String)
	 * @see mm.app.ops.OpsPackage#getSetOpposite_FirstClassName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstClassName();

	/**
	 * Sets the value of the '{@link mm.app.ops.SetOpposite#getFirstClassName <em>First Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Class Name</em>' attribute.
	 * @see #getFirstClassName()
	 * @generated
	 */
	void setFirstClassName(String value);

	/**
	 * Returns the value of the '<em><b>First Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Property Name</em>' attribute.
	 * @see #setFirstPropertyName(String)
	 * @see mm.app.ops.OpsPackage#getSetOpposite_FirstPropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstPropertyName();

	/**
	 * Sets the value of the '{@link mm.app.ops.SetOpposite#getFirstPropertyName <em>First Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Property Name</em>' attribute.
	 * @see #getFirstPropertyName()
	 * @generated
	 */
	void setFirstPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Second Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Class Name</em>' attribute.
	 * @see #setSecondClassName(String)
	 * @see mm.app.ops.OpsPackage#getSetOpposite_SecondClassName()
	 * @model required="true"
	 * @generated
	 */
	String getSecondClassName();

	/**
	 * Sets the value of the '{@link mm.app.ops.SetOpposite#getSecondClassName <em>Second Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Class Name</em>' attribute.
	 * @see #getSecondClassName()
	 * @generated
	 */
	void setSecondClassName(String value);

	/**
	 * Returns the value of the '<em><b>Second Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Property Name</em>' attribute.
	 * @see #setSecondPropertyName(String)
	 * @see mm.app.ops.OpsPackage#getSetOpposite_SecondPropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getSecondPropertyName();

	/**
	 * Sets the value of the '{@link mm.app.ops.SetOpposite#getSecondPropertyName <em>Second Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Property Name</em>' attribute.
	 * @see #getSecondPropertyName()
	 * @generated
	 */
	void setSecondPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Is Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Opposite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opposite</em>' attribute.
	 * @see #setIsOpposite(boolean)
	 * @see mm.app.ops.OpsPackage#getSetOpposite_IsOpposite()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOpposite();

	/**
	 * Sets the value of the '{@link mm.app.ops.SetOpposite#isIsOpposite <em>Is Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Opposite</em>' attribute.
	 * @see #isIsOpposite()
	 * @generated
	 */
	void setIsOpposite(boolean value);

} // SetOpposite
