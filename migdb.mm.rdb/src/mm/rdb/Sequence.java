/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Sequence#getOwningSchema <em>Owning Schema</em>}</li>
 *   <li>{@link mm.rdb.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Sequence#getCacheSize <em>Cache Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Schema#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Schema</em>' container reference.
	 * @see mm.rdb.RdbPackage#getSequence_OwningSchema()
	 * @see mm.rdb.Schema#getSequences
	 * @model opposite="sequences" required="true" transient="false" changeable="false" derived="true"
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
	 * @see mm.rdb.RdbPackage#getSequence_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Size</em>' attribute.
	 * @see #setCacheSize(int)
	 * @see mm.rdb.RdbPackage#getSequence_CacheSize()
	 * @model
	 * @generated
	 */
	int getCacheSize();

	/**
	 * Sets the value of the '{@link mm.rdb.Sequence#getCacheSize <em>Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Size</em>' attribute.
	 * @see #getCacheSize()
	 * @generated
	 */
	void setCacheSize(int value);

} // Sequence
