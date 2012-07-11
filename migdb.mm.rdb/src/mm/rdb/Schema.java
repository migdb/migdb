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
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.rdb.Schema#getOwningModel <em>Owning Model</em>}</li>
 *   <li>{@link mm.rdb.Schema#getName <em>Name</em>}</li>
 *   <li>{@link mm.rdb.Schema#getTables <em>Tables</em>}</li>
 *   <li>{@link mm.rdb.Schema#getSequences <em>Sequences</em>}</li>
 *   <li>{@link mm.rdb.Schema#getIndexes <em>Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.rdb.RdbPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.rdb.ModelGeneration#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Model</em>' container reference.
	 * @see #setOwningModel(ModelGeneration)
	 * @see mm.rdb.RdbPackage#getSchema_OwningModel()
	 * @see mm.rdb.ModelGeneration#getSchemas
	 * @model opposite="schemas" required="true" transient="false" derived="true"
	 * @generated
	 */
	ModelGeneration getOwningModel();

	/**
	 * Sets the value of the '{@link mm.rdb.Schema#getOwningModel <em>Owning Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Model</em>' container reference.
	 * @see #getOwningModel()
	 * @generated
	 */
	void setOwningModel(ModelGeneration value);

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
	 * @see mm.rdb.RdbPackage#getSchema_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.rdb.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.Table}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Table#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getSchema_Tables()
	 * @see mm.rdb.Table#getOwningSchema
	 * @model opposite="owningSchema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.Sequence}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Sequence#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getSchema_Sequences()
	 * @see mm.rdb.Sequence#getOwningSchema
	 * @model opposite="owningSchema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Sequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link mm.rdb.Index}.
	 * It is bidirectional and its opposite is '{@link mm.rdb.Index#getOwningSchema <em>Owning Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see mm.rdb.RdbPackage#getSchema_Indexes()
	 * @see mm.rdb.Index#getOwningSchema
	 * @model opposite="owningSchema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Index> getIndexes();

} // Schema
