/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops;

import mm.app.ModelRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ops.ModelOperation#getModelRoot <em>Model Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.ops.OpsPackage#getModelOperation()
 * @model abstract="true"
 * @generated
 */
public interface ModelOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelRoot#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Root</em>' container reference.
	 * @see mm.app.ops.OpsPackage#getModelOperation_ModelRoot()
	 * @see mm.app.ModelRoot#getOperations
	 * @model opposite="operations" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	ModelRoot getModelRoot();

} // ModelOperation
