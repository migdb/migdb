/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Column#getOwningTable <em>Owning Table</em>}</li>
 *   <li>{@link mm.rdb.Column#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Column#getType <em>Type</em>}</li>
 *   <li>{@link mm.rdb.Column#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link mm.rdb.Column#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Table</em>' container reference.
	 * @see mm.rdb.RdbPackage#getColumn_OwningTable()
	 * @see mm.rdb.Table#getColumns
	 * @model opposite="columns" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	Table getOwningTable();

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
	 * @see mm.rdb.RdbPackage#getColumn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mm.rdb.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see mm.rdb.RdbPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link mm.rdb.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mm.rdb.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see mm.rdb.RdbPackage#getColumn_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link mm.rdb.Column#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.ColumnConstraint}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.ColumnConstraint#getOwningColumn <em>Owning Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getColumn_Constraints()
	 * @see mm.rdb.ColumnConstraint#getOwningColumn
	 * @model opposite="owningColumn" containment="true" ordered="false"
	 * @generated
	 */
	EList<ColumnConstraint> getConstraints();

} // Column
