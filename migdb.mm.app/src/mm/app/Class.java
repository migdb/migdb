/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.Class#getParent <em>Parent</em>}</li>
 *   <li>{@link mm.app.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm.app.Class#isIsEmbedded <em>Is Embedded</em>}</li>
 *   <li>{@link mm.app.Class#getTableName <em>Table Name</em>}</li>
 *   <li>{@link mm.app.Class#getInheritanceType <em>Inheritance Type</em>}</li>
 *   <li>{@link mm.app.Class#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Class)
	 * @see mm.app.AppPackage#getClass_Parent()
	 * @model
	 * @generated
	 */
	Class getParent();

	/**
	 * Sets the value of the '{@link mm.app.Class#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Class value);

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
	 * @see mm.app.AppPackage#getClass_IsAbstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mm.app.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Embedded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Embedded</em>' attribute.
	 * @see #setIsEmbedded(boolean)
	 * @see mm.app.AppPackage#getClass_IsEmbedded()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsEmbedded();

	/**
	 * Sets the value of the '{@link mm.app.Class#isIsEmbedded <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Embedded</em>' attribute.
	 * @see #isIsEmbedded()
	 * @generated
	 */
	void setIsEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see mm.app.AppPackage#getClass_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link mm.app.Class#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

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
	 * @see mm.app.AppPackage#getClass_InheritanceType()
	 * @model required="true"
	 * @generated
	 */
	InheritanceType getInheritanceType();

	/**
	 * Sets the value of the '{@link mm.app.Class#getInheritanceType <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Type</em>' attribute.
	 * @see mm.app.InheritanceType
	 * @see #getInheritanceType()
	 * @generated
	 */
	void setInheritanceType(InheritanceType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link mm.app.Property}.
	 * It is bidirectional and its opposite is '{@link mm.app.Property#getOwningClass <em>Owning Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see mm.app.AppPackage#getClass_Properties()
	 * @see mm.app.Property#getOwningClass
	 * @model opposite="owningClass" containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

} // Class
