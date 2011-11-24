/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;

import mm.app.InheritanceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.AddClass#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.AddClass#getParent <em>Parent</em>}</li>
 *   <li>{@link mm.app.operations.AddClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm.app.operations.AddClass#isIsEmbedded <em>Is Embedded</em>}</li>
 *   <li>{@link mm.app.operations.AddClass#getTableName <em>Table Name</em>}</li>
 *   <li>{@link mm.app.operations.AddClass#getInheritanceType <em>Inheritance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getAddClass()
 * @model
 * @generated
 */
public interface AddClass extends ModelOperation {
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
	 * @see mm.app.operations.OperationsPackage#getAddClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see mm.app.operations.OperationsPackage#getAddClass_Parent()
	 * @model
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see mm.app.operations.OperationsPackage#getAddClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Embedded</em>' attribute.
	 * @see #setIsEmbedded(boolean)
	 * @see mm.app.operations.OperationsPackage#getAddClass_IsEmbedded()
	 * @model
	 * @generated
	 */
	boolean isIsEmbedded();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#isIsEmbedded <em>Is Embedded</em>}' attribute.
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
	 * @see mm.app.operations.OperationsPackage#getAddClass_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#getTableName <em>Table Name</em>}' attribute.
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
	 * @see mm.app.operations.OperationsPackage#getAddClass_InheritanceType()
	 * @model required="true"
	 * @generated
	 */
	InheritanceType getInheritanceType();

	/**
	 * Sets the value of the '{@link mm.app.operations.AddClass#getInheritanceType <em>Inheritance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance Type</em>' attribute.
	 * @see mm.app.InheritanceType
	 * @see #getInheritanceType()
	 * @generated
	 */
	void setInheritanceType(InheritanceType value);

} // AddClass
