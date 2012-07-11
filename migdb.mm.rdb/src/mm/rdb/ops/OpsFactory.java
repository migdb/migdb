/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm.rdb.ops.OpsPackage
 * @generated
 */
public interface OpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpsFactory eINSTANCE = mm.rdb.ops.impl.OpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Schema</em>'.
	 * @generated
	 */
	AddSchema createAddSchema();

	/**
	 * Returns a new object of class '<em>Add Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Sequence</em>'.
	 * @generated
	 */
	AddSequence createAddSequence();

	/**
	 * Returns a new object of class '<em>Add Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Index</em>'.
	 * @generated
	 */
	AddIndex createAddIndex();

	/**
	 * Returns a new object of class '<em>Add Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Table</em>'.
	 * @generated
	 */
	AddTable createAddTable();

	/**
	 * Returns a new object of class '<em>Rename Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Table</em>'.
	 * @generated
	 */
	RenameTable createRenameTable();

	/**
	 * Returns a new object of class '<em>Remove Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Table</em>'.
	 * @generated
	 */
	RemoveTable createRemoveTable();

	/**
	 * Returns a new object of class '<em>Add Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Column</em>'.
	 * @generated
	 */
	AddColumn createAddColumn();

	/**
	 * Returns a new object of class '<em>Rename Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Column</em>'.
	 * @generated
	 */
	RenameColumn createRenameColumn();

	/**
	 * Returns a new object of class '<em>Copy Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Instances</em>'.
	 * @generated
	 */
	CopyInstances createCopyInstances();

	/**
	 * Returns a new object of class '<em>Remove Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Column</em>'.
	 * @generated
	 */
	RemoveColumn createRemoveColumn();

	/**
	 * Returns a new object of class '<em>Add Unique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Unique</em>'.
	 * @generated
	 */
	AddUnique createAddUnique();

	/**
	 * Returns a new object of class '<em>Add Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Primary Key</em>'.
	 * @generated
	 */
	AddPrimaryKey createAddPrimaryKey();

	/**
	 * Returns a new object of class '<em>Add Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Foreign Key</em>'.
	 * @generated
	 */
	AddForeignKey createAddForeignKey();

	/**
	 * Returns a new object of class '<em>Remove Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Constraint</em>'.
	 * @generated
	 */
	RemoveConstraint createRemoveConstraint();

	/**
	 * Returns a new object of class '<em>Add Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Not Null</em>'.
	 * @generated
	 */
	AddNotNull createAddNotNull();

	/**
	 * Returns a new object of class '<em>Remove Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Index</em>'.
	 * @generated
	 */
	RemoveIndex createRemoveIndex();

	/**
	 * Returns a new object of class '<em>Set Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Column Type</em>'.
	 * @generated
	 */
	SetColumnType createSetColumnType();

	/**
	 * Returns a new object of class '<em>Set Column Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Column Default Value</em>'.
	 * @generated
	 */
	SetColumnDefaultValue createSetColumnDefaultValue();

	/**
	 * Returns a new object of class '<em>Remove Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Default Value</em>'.
	 * @generated
	 */
	RemoveDefaultValue createRemoveDefaultValue();

	/**
	 * Returns a new object of class '<em>Remove Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Sequence</em>'.
	 * @generated
	 */
	RemoveSequence createRemoveSequence();

	/**
	 * Returns a new object of class '<em>Has No Own Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has No Own Instances</em>'.
	 * @generated
	 */
	HasNoOwnInstances createHasNoOwnInstances();

	/**
	 * Returns a new object of class '<em>Has No Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has No Instances</em>'.
	 * @generated
	 */
	HasNoInstances createHasNoInstances();

	/**
	 * Returns a new object of class '<em>Add Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Instances</em>'.
	 * @generated
	 */
	AddInstances createAddInstances();

	/**
	 * Returns a new object of class '<em>Insert Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Instances</em>'.
	 * @generated
	 */
	InsertInstances createInsertInstances();

	/**
	 * Returns a new object of class '<em>Generate Sequence Numbers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generate Sequence Numbers</em>'.
	 * @generated
	 */
	GenerateSequenceNumbers createGenerateSequenceNumbers();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpsPackage getOpsPackage();

} //OpsFactory
