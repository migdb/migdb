/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.operations.CopyProperty#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#isEndInOwerload <em>End In Owerload</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#isAddValueNull <em>Add Value Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.operations.OperationsPackage#getCopyProperty()
 * @model
 * @generated
 */
public interface CopyProperty extends ModelOperation {
	/**
	 * Returns the value of the '<em><b>Owning Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class Name</em>' attribute.
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_OwningClassName()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getOwningClassName();

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_PropertyName()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class Name</em>' attribute.
	 * @see #setTargetClassName(String)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_TargetClassName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetClassName();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#getTargetClassName <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class Name</em>' attribute.
	 * @see #getTargetClassName()
	 * @generated
	 */
	void setTargetClassName(String value);

	/**
	 * Returns the value of the '<em><b>End In Owerload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End In Owerload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End In Owerload</em>' attribute.
	 * @see #setEndInOwerload(boolean)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_EndInOwerload()
	 * @model required="true"
	 * @generated
	 */
	boolean isEndInOwerload();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#isEndInOwerload <em>End In Owerload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End In Owerload</em>' attribute.
	 * @see #isEndInOwerload()
	 * @generated
	 */
	void setEndInOwerload(boolean value);

	/**
	 * Returns the value of the '<em><b>Add Value Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Value Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Value Null</em>' attribute.
	 * @see #setAddValueNull(boolean)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_AddValueNull()
	 * @model required="true"
	 * @generated
	 */
	boolean isAddValueNull();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#isAddValueNull <em>Add Value Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Value Null</em>' attribute.
	 * @see #isAddValueNull()
	 * @generated
	 */
	void setAddValueNull(boolean value);

} // CopyProperty
