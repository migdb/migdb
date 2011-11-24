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
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Index#getOwningSchema <em>Owning Schema</em>}</li>
 *   <li>{@link mm.rdb.Index#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Index#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Schema#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Schema</em>' container reference.
	 * @see mm.rdb.RdbPackage#getIndex_OwningSchema()
	 * @see mm.rdb.Schema#getIndexes
	 * @model opposite="indexes" required="true" transient="false" changeable="false" derived="true"
	 *        annotation="OCL drv='self.columns->first()._owningTable'"
	 * @generated
	 */
	Schema getOwningSchema();

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
	 * @see mm.rdb.RdbPackage#getIndex_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Index#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link mm.rdb.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see mm.rdb.RdbPackage#getIndex_Columns()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumns();

} // Index
