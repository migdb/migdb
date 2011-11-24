/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.PrimitiveClass#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getPrimitiveClass()
 * @model
 * @generated
 */
public interface PrimitiveClass extends AbstractClass {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.app.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see mm.app.PrimitiveType
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see mm.app.AppPackage#getPrimitiveClass_PrimitiveType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link mm.app.PrimitiveClass#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see mm.app.PrimitiveType
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // PrimitiveClass
