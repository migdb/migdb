/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.StandardClass#getParent <em>Parent</em>}</li>
 *   <li>{@link mm.app.StandardClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm.app.StandardClass#getInheritanceType <em>Inheritance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getStandardClass()
 * @model
 * @generated
 */
public interface StandardClass extends GeneralClass {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(StandardClass)
	 * @see mm.app.AppPackage#getStandardClass_Parent()
	 * @model
	 * @generated
	 */
	StandardClass getParent();

	/**
	 * Sets the value of the '{@link mm.app.StandardClass#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StandardClass value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see mm.app.AppPackage#getStandardClass_IsAbstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mm.app.StandardClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Inheritance Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.app.InheritanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance Type</em>' attribute.
	 * @see mm.app.InheritanceType
	 * @see #setInheritanceType(InheritanceType)
	 * @see mm.app.AppPackage#getStandardClass_InheritanceType()
	 * @model required="true"
	 * @generated
	 */
	InheritanceType getInheritanceType();

	/**
	 * Sets the value of the '{@link mm.app.StandardClass#getInheritanceType <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Type</em>' attribute.
	 * @see mm.app.InheritanceType
	 * @see #getInheritanceType()
	 * @generated
	 */
	void setInheritanceType(InheritanceType value);

} // StandardClass
