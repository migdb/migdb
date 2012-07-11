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
 * A representation of the model object '<em><b>General Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.GeneralClass#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getGeneralClass()
 * @model
 * @generated
 */
public interface GeneralClass extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link mm.app.Property}.
	 * It is bidirectional and its opposite is '{@link mm.app.Property#getOwningGeneralClass <em>Owning General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see mm.app.AppPackage#getGeneralClass_Properties()
	 * @see mm.app.Property#getOwningGeneralClass
	 * @model opposite="owningGeneralClass" containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

} // GeneralClass
