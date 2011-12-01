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
 * A representation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.AbstractClass#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getAbstractClass()
 * @model
 * @generated
 */
public interface AbstractClass extends Entity {
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
	 * @see mm.app.AppPackage#getAbstractClass_Properties()
	 * @see mm.app.Property#getOwningClass
	 * @model opposite="owningClass" containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

} // AbstractClass
