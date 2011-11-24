/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.dml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.dml.Query#getColumnReferences <em>Column References</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.dml.DmlPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Column References</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.dml.ColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column References</em>' containment reference list.
	 * @see mm.rdb.dml.DmlPackage#getQuery_ColumnReferences()
	 * @model containment="true" required="true"
	 *        annotation="DVU subsets='self.columns'"
	 * @generated
	 */
	EList<ColumnReference> getColumnReferences();

} // Query
