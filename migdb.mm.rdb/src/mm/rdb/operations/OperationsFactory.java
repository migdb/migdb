/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm.rdb.operations.OperationsPackage
 * @generated
 */
public interface OperationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationsFactory eINSTANCE = mm.rdb.operations.impl.OperationsFactoryImpl.init();

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
	 * Returns a new object of class '<em>Add Unique Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Unique Index</em>'.
	 * @generated
	 */
	AddUniqueIndex createAddUniqueIndex();

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
	 * Returns a new object of class '<em>Remove Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Table Constraint</em>'.
	 * @generated
	 */
	RemoveTableConstraint createRemoveTableConstraint();

	/**
	 * Returns a new object of class '<em>Add Not Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Not Null Constraint</em>'.
	 * @generated
	 */
	AddNotNullConstraint createAddNotNullConstraint();

	/**
	 * Returns a new object of class '<em>Remove Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Column Constraint</em>'.
	 * @generated
	 */
	RemoveColumnConstraint createRemoveColumnConstraint();

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
	 * Returns a new object of class '<em>Set Column Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Column Sequence</em>'.
	 * @generated
	 */
	SetColumnSequence createSetColumnSequence();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationsPackage getOperationsPackage();

} //OperationsFactory
