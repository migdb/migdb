/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm.app.operations.OperationsPackage
 * @generated
 */
public interface OperationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationsFactory eINSTANCE = mm.app.operations.impl.OperationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Class</em>'.
	 * @generated
	 */
	AddClass createAddClass();

	/**
	 * Returns a new object of class '<em>Rename Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Class</em>'.
	 * @generated
	 */
	RenameClass createRenameClass();

	/**
	 * Returns a new object of class '<em>Set Parent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Parent</em>'.
	 * @generated
	 */
	SetParent createSetParent();

	/**
	 * Returns a new object of class '<em>Set Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Abstract</em>'.
	 * @generated
	 */
	SetAbstract createSetAbstract();

	/**
	 * Returns a new object of class '<em>Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Entity</em>'.
	 * @generated
	 */
	RemoveEntity createRemoveEntity();

	/**
	 * Returns a new object of class '<em>Add Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Property</em>'.
	 * @generated
	 */
	AddProperty createAddProperty();

	/**
	 * Returns a new object of class '<em>Rename Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Property</em>'.
	 * @generated
	 */
	RenameProperty createRenameProperty();

	/**
	 * Returns a new object of class '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Type</em>'.
	 * @generated
	 */
	SetType createSetType();

	/**
	 * Returns a new object of class '<em>Set Opposite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Opposite</em>'.
	 * @generated
	 */
	SetOpposite createSetOpposite();

	/**
	 * Returns a new object of class '<em>Set Boundries</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Boundries</em>'.
	 * @generated
	 */
	SetBoundries createSetBoundries();

	/**
	 * Returns a new object of class '<em>Set Ordered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Ordered</em>'.
	 * @generated
	 */
	SetOrdered createSetOrdered();

	/**
	 * Returns a new object of class '<em>Set Unique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Unique</em>'.
	 * @generated
	 */
	SetUnique createSetUnique();

	/**
	 * Returns a new object of class '<em>Remove Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Property</em>'.
	 * @generated
	 */
	RemoveProperty createRemoveProperty();

	/**
	 * Returns a new object of class '<em>Copy Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Property</em>'.
	 * @generated
	 */
	CopyProperty createCopyProperty();

	/**
	 * Returns a new object of class '<em>Move Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Property</em>'.
	 * @generated
	 */
	MoveProperty createMoveProperty();

	/**
	 * Returns a new object of class '<em>Add Primitive Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Primitive Class</em>'.
	 * @generated
	 */
	AddPrimitiveClass createAddPrimitiveClass();

	/**
	 * Returns a new object of class '<em>Add Embedded Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Embedded Class</em>'.
	 * @generated
	 */
	AddEmbeddedClass createAddEmbeddedClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationsPackage getOperationsPackage();

} //OperationsFactory
