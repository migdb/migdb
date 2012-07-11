/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import mm.app.ops.ModelOperation;

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
 *   <li>{@link mm.app.ModelRoot#getModelGenerations <em>Model Generations</em>}</li>
 *   <li>{@link mm.app.ModelRoot#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getModelRoot()
 * @model
 * @generated
 */
public interface ModelRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Generations</b></em>' containment reference list.
	 * The list contents are of type {@link mm.app.ModelGeneration}.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelGeneration#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Generations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Generations</em>' containment reference list.
	 * @see mm.app.AppPackage#getModelRoot_ModelGenerations()
	 * @see mm.app.ModelGeneration#getModelRoot
	 * @model opposite="modelRoot" containment="true" required="true"
	 * @generated
	 */
	EList<ModelGeneration> getModelGenerations();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link mm.app.ops.ModelOperation}.
	 * It is bidirectional and its opposite is '{@link mm.app.ops.ModelOperation#getModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see mm.app.AppPackage#getModelRoot_Operations()
	 * @see mm.app.ops.ModelOperation#getModelRoot
	 * @model opposite="modelRoot" containment="true"
	 * @generated
	 */
	EList<ModelOperation> getOperations();

} // ModelRoot
