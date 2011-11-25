/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.dml;

import mm.rdb.Column;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.dml.ColumnReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.dml.DmlPackage#getColumnReference()
 * @model
 * @generated
 */
public interface ColumnReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Column)
	 * @see mm.rdb.dml.DmlPackage#getColumnReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	Column getReference();

	/**
	 * Sets the value of the '{@link mm.rdb.dml.ColumnReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Column value);

} // ColumnReference
