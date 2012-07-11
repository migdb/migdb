/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.ModelEntity#getOwningGeneration <em>Owning Generation</em>}</li>
 *   <li>{@link mm.app.ModelEntity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getModelEntity()
 * @model
 * @generated
 */
public interface ModelEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Generation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.app.ModelGeneration#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Generation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Generation</em>' container reference.
	 * @see mm.app.AppPackage#getModelEntity_OwningGeneration()
	 * @see mm.app.ModelGeneration#getEntities
	 * @model opposite="entities" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	ModelGeneration getOwningGeneration();

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
	 * @see mm.app.AppPackage#getModelEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.ModelEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModelEntity
