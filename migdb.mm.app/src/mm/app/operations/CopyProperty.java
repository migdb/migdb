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
 *   <li>{@link mm.app.operations.CopyProperty#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link mm.app.operations.CopyProperty#getType <em>Type</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.app.operations.MergeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mm.app.operations.MergeType
	 * @see #setType(MergeType)
	 * @see mm.app.operations.OperationsPackage#getCopyProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	MergeType getType();

	/**
	 * Sets the value of the '{@link mm.app.operations.CopyProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mm.app.operations.MergeType
	 * @see #getType()
	 * @generated
	 */
	void setType(MergeType value);

} // CopyProperty
