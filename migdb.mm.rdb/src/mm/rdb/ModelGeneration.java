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
 * A representation of the model object '<em><b>Model Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ModelGeneration#getModelRoot <em>Model Root</em>}</li>
 *   <li>{@link mm.rdb.ModelGeneration#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mm.rdb.ModelGeneration#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getModelGeneration()
 * @model
 * @generated
 */
public interface ModelGeneration extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.ModelRoot#getModelGenerations <em>Model Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Root</em>' container reference.
	 * @see #setModelRoot(ModelRoot)
	 * @see mm.rdb.RdbPackage#getModelGeneration_ModelRoot()
	 * @see mm.rdb.ModelRoot#getModelGenerations
	 * @model opposite="modelGenerations" required="true" transient="false"
	 * @generated
	 */
	ModelRoot getModelRoot();

	/**
	 * Sets the value of the '{@link mm.rdb.ModelGeneration#getModelRoot <em>Model Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Root</em>' container reference.
	 * @see #getModelRoot()
	 * @generated
	 */
	void setModelRoot(ModelRoot value);

	/**
	 * Returns the value of the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Missing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Missing</em>' attribute.
	 * @see #setIsMissing(boolean)
	 * @see mm.rdb.RdbPackage#getModelGeneration_IsMissing()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMissing();

	/**
	 * Sets the value of the '{@link mm.rdb.ModelGeneration#isIsMissing <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Missing</em>' attribute.
	 * @see #isIsMissing()
	 * @generated
	 */
	void setIsMissing(boolean value);

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getModelGeneration_Schemas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Schema> getSchemas();

} // ModelGeneration
