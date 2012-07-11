/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ops.CopyProperty#getOwningClassName <em>Owning Class Name</em>}</li>
 *   <li>{@link mm.app.ops.CopyProperty#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.ops.CopyProperty#getTargetClassName <em>Target Class Name</em>}</li>
 *   <li>{@link mm.app.ops.CopyProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.ops.OpsPackage#getCopyProperty()
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
	 * @see mm.app.ops.OpsPackage#getCopyProperty_OwningClassName()
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
	 * @see mm.app.ops.OpsPackage#getCopyProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.ops.CopyProperty#getName <em>Name</em>}' attribute.
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
	 * @see mm.app.ops.OpsPackage#getCopyProperty_TargetClassName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetClassName();

	/**
	 * Sets the value of the '{@link mm.app.ops.CopyProperty#getTargetClassName <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class Name</em>' attribute.
	 * @see #getTargetClassName()
	 * @generated
	 */
	void setTargetClassName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.app.ops.MergeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mm.app.ops.MergeType
	 * @see #setType(MergeType)
	 * @see mm.app.ops.OpsPackage#getCopyProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	MergeType getType();

	/**
	 * Sets the value of the '{@link mm.app.ops.CopyProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mm.app.ops.MergeType
	 * @see #getType()
	 * @generated
	 */
	void setType(MergeType value);

} // CopyProperty
