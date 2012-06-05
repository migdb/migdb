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
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm.app.Property#getOwningGeneralClass <em>Owning General Class</em>}</li>
 *   <li>{@link mm.app.Property#getName <em>Name</em>}</li>
 *   <li>{@link mm.app.Property#getType <em>Type</em>}</li>
 *   <li>{@link mm.app.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link mm.app.Property#getOppositeProperty <em>Opposite Property</em>}</li>
 *   <li>{@link mm.app.Property#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link mm.app.Property#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link mm.app.Property#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link mm.app.Property#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link mm.app.Property#isIsID <em>Is ID</em>}</li>
 *   <li>{@link mm.app.Property#getSequenceName <em>Sequence Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm.app.AppPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning General Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm.app.GeneralClass#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning General Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning General Class</em>' container reference.
	 * @see mm.app.AppPackage#getProperty_OwningGeneralClass()
	 * @see mm.app.GeneralClass#getProperties
	 * @model opposite="properties" required="true" transient="false" changeable="false" derived="true"
	 * @generated
	 */
	GeneralClass getOwningGeneralClass();

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
	 * @see mm.app.AppPackage#getProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm.app.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ModelEntity)
	 * @see mm.app.AppPackage#getProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	ModelEntity getType();

	/**
	 * Sets the value of the '{@link mm.app.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelEntity value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see mm.app.AppPackage#getProperty_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link mm.app.Property#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Opposite Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Property</em>' reference.
	 * @see #setOppositeProperty(Property)
	 * @see mm.app.AppPackage#getProperty_OppositeProperty()
	 * @model
	 * @generated
	 */
	Property getOppositeProperty();

	/**
	 * Sets the value of the '{@link mm.app.Property#getOppositeProperty <em>Opposite Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Property</em>' reference.
	 * @see #getOppositeProperty()
	 * @generated
	 */
	void setOppositeProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see mm.app.AppPackage#getProperty_LowerBound()
	 * @model default="0"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link mm.app.Property#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see mm.app.AppPackage#getProperty_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link mm.app.Property#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see mm.app.AppPackage#getProperty_IsOrdered()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link mm.app.Property#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see mm.app.AppPackage#getProperty_IsUnique()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link mm.app.Property#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(boolean)
	 * @see mm.app.AppPackage#getProperty_IsID()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsID();

	/**
	 * Sets the value of the '{@link mm.app.Property#isIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #isIsID()
	 * @generated
	 */
	void setIsID(boolean value);

	/**
	 * Returns the value of the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Name</em>' attribute.
	 * @see #setSequenceName(String)
	 * @see mm.app.AppPackage#getProperty_SequenceName()
	 * @model
	 * @generated
	 */
	String getSequenceName();

	/**
	 * Sets the value of the '{@link mm.app.Property#getSequenceName <em>Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Name</em>' attribute.
	 * @see #getSequenceName()
	 * @generated
	 */
	void setSequenceName(String value);

} // Property
