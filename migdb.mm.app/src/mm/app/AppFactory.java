/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm.app.AppPackage
 * @generated
 */
public interface AppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppFactory eINSTANCE = mm.app.impl.AppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Root</em>'.
	 * @generated
	 */
	ModelRoot createModelRoot();

	/**
	 * Returns a new object of class '<em>Model Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Generation</em>'.
	 * @generated
	 */
	ModelGeneration createModelGeneration();

	/**
	 * Returns a new object of class '<em>Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Class</em>'.
	 * @generated
	 */
	AbstractClass createAbstractClass();

	/**
	 * Returns a new object of class '<em>Primitive Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Class</em>'.
	 * @generated
	 */
	PrimitiveClass createPrimitiveClass();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppPackage getAppPackage();

} //AppFactory
