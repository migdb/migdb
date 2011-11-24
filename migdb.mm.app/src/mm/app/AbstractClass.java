/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.AbstractClass#getOwningModel <em>Owning Model</em>}</li>
 *   <li>{@link mm.app.AbstractClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getAbstractClass()
 * @model
 * @generated
 */
public interface AbstractClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelGeneration#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model</em>' container reference.
	 * @see mm.app.AppPackage#getAbstractClass_OwningModel()
	 * @see mm.app.ModelGeneration#getClasses
	 * @model opposite="classes" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	ModelGeneration getOwningModel();

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
	 * @see mm.app.AppPackage#getAbstractClass_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.AbstractClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractClass
