/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import mm.rdb.operations.ModelOperation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.ModelRoot#getModelGenerations <em>Model Generations</em>}</li>
 *   <li>{@link mm.rdb.ModelRoot#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Generations</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.ModelGeneration}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.ModelGeneration#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Generations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Generations</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getModelRoot_ModelGenerations()
	 * @see mm.rdb.ModelGeneration#getModelRoot
	 * @model opposite="modelRoot" containment="true" required="true"
	 * @generated
	 */
	EList<ModelGeneration> getModelGenerations();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.operations.ModelOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getModelRoot_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelOperation> getOperations();

} // ModelRoot
