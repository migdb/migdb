/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

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
 *   <li>{@link mm.app.ModelGeneration#getModelRoot <em>Model Root</em>}</li>
 *   <li>{@link mm.app.ModelGeneration#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mm.app.ModelGeneration#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getModelGeneration()
 * @model
 * @generated
 */
public interface ModelGeneration extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelRoot#getModelGenerations <em>Model Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Root</em>' container reference.
	 * @see mm.app.AppPackage#getModelGeneration_ModelRoot()
	 * @see mm.app.ModelRoot#getModelGenerations
	 * @model opposite="modelGenerations" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	ModelRoot getModelRoot();

	/**
	 * Returns the value of the '<em><b>Is Missing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Missing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Missing</em>' attribute.
	 * @see #setIsMissing(boolean)
	 * @see mm.app.AppPackage#getModelGeneration_IsMissing()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsMissing();

	/**
	 * Sets the value of the '{@link mm.app.ModelGeneration#isIsMissing <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Missing</em>' attribute.
	 * @see #isIsMissing()
	 * @generated
	 */
	void setIsMissing(boolean value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link mm.app.ModelEntity}.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelEntity#getOwningGeneration <em>Owning Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see mm.app.AppPackage#getModelGeneration_Entities()
	 * @see mm.app.ModelEntity#getOwningGeneration
	 * @model opposite="owningGeneration" containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelEntity> getEntities();

} // ModelGeneration
