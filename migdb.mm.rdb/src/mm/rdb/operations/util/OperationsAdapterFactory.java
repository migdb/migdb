/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.util;

import mm.rdb.operations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm.rdb.operations.OperationsPackage
 * @generated
 */
public class OperationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsSwitch<Adapter> modelSwitch =
		new OperationsSwitch<Adapter>() {
			@Override
			public Adapter caseModelOperation(ModelOperation object) {
				return createModelOperationAdapter();
			}
			@Override
			public Adapter caseAddSchema(AddSchema object) {
				return createAddSchemaAdapter();
			}
			@Override
			public Adapter caseAddSequence(AddSequence object) {
				return createAddSequenceAdapter();
			}
			@Override
			public Adapter caseAddIndex(AddIndex object) {
				return createAddIndexAdapter();
			}
			@Override
			public Adapter caseAddTable(AddTable object) {
				return createAddTableAdapter();
			}
			@Override
			public Adapter caseRenameTable(RenameTable object) {
				return createRenameTableAdapter();
			}
			@Override
			public Adapter caseRemoveTable(RemoveTable object) {
				return createRemoveTableAdapter();
			}
			@Override
			public Adapter caseAddColumn(AddColumn object) {
				return createAddColumnAdapter();
			}
			@Override
			public Adapter caseRenameColumn(RenameColumn object) {
				return createRenameColumnAdapter();
			}
			@Override
			public Adapter caseCopyInstances(CopyInstances object) {
				return createCopyInstancesAdapter();
			}
			@Override
			public Adapter caseRemoveColumn(RemoveColumn object) {
				return createRemoveColumnAdapter();
			}
			@Override
			public Adapter caseAddUniqueIndex(AddUniqueIndex object) {
				return createAddUniqueIndexAdapter();
			}
			@Override
			public Adapter caseAddPrimaryKey(AddPrimaryKey object) {
				return createAddPrimaryKeyAdapter();
			}
			@Override
			public Adapter caseAddForeignKey(AddForeignKey object) {
				return createAddForeignKeyAdapter();
			}
			@Override
			public Adapter caseRemoveTableConstraint(RemoveTableConstraint object) {
				return createRemoveTableConstraintAdapter();
			}
			@Override
			public Adapter caseAddNotNullConstraint(AddNotNullConstraint object) {
				return createAddNotNullConstraintAdapter();
			}
			@Override
			public Adapter caseRemoveColumnConstraint(RemoveColumnConstraint object) {
				return createRemoveColumnConstraintAdapter();
			}
			@Override
			public Adapter caseRemoveIndex(RemoveIndex object) {
				return createRemoveIndexAdapter();
			}
			@Override
			public Adapter caseSetColumnType(SetColumnType object) {
				return createSetColumnTypeAdapter();
			}
			@Override
			public Adapter caseSetColumnDefaultValue(SetColumnDefaultValue object) {
				return createSetColumnDefaultValueAdapter();
			}
			@Override
			public Adapter caseRemoveDefaultValue(RemoveDefaultValue object) {
				return createRemoveDefaultValueAdapter();
			}
			@Override
			public Adapter caseRemoveSequence(RemoveSequence object) {
				return createRemoveSequenceAdapter();
			}
			@Override
			public Adapter caseHasNoOwnInstances(HasNoOwnInstances object) {
				return createHasNoOwnInstancesAdapter();
			}
			@Override
			public Adapter caseHasNoInstances(HasNoInstances object) {
				return createHasNoInstancesAdapter();
			}
			@Override
			public Adapter caseAddInstances(AddInstances object) {
				return createAddInstancesAdapter();
			}
			@Override
			public Adapter caseInsertInstances(InsertInstances object) {
				return createInsertInstancesAdapter();
			}
			@Override
			public Adapter caseGenerateSequenceNumbers(GenerateSequenceNumbers object) {
				return createGenerateSequenceNumbersAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.ModelOperation
	 * @generated
	 */
	public Adapter createModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddSchema <em>Add Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddSchema
	 * @generated
	 */
	public Adapter createAddSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddSequence <em>Add Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddSequence
	 * @generated
	 */
	public Adapter createAddSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddIndex
	 * @generated
	 */
	public Adapter createAddIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddTable <em>Add Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddTable
	 * @generated
	 */
	public Adapter createAddTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RenameTable
	 * @generated
	 */
	public Adapter createRenameTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveTable <em>Remove Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveTable
	 * @generated
	 */
	public Adapter createRemoveTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddColumn
	 * @generated
	 */
	public Adapter createAddColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RenameColumn
	 * @generated
	 */
	public Adapter createRenameColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.CopyInstances <em>Copy Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.CopyInstances
	 * @generated
	 */
	public Adapter createCopyInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveColumn <em>Remove Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveColumn
	 * @generated
	 */
	public Adapter createRemoveColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddUniqueIndex <em>Add Unique Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddUniqueIndex
	 * @generated
	 */
	public Adapter createAddUniqueIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddPrimaryKey
	 * @generated
	 */
	public Adapter createAddPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddForeignKey <em>Add Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddForeignKey
	 * @generated
	 */
	public Adapter createAddForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveTableConstraint <em>Remove Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveTableConstraint
	 * @generated
	 */
	public Adapter createRemoveTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddNotNullConstraint <em>Add Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddNotNullConstraint
	 * @generated
	 */
	public Adapter createAddNotNullConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveColumnConstraint <em>Remove Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveColumnConstraint
	 * @generated
	 */
	public Adapter createRemoveColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveIndex <em>Remove Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveIndex
	 * @generated
	 */
	public Adapter createRemoveIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.SetColumnType <em>Set Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.SetColumnType
	 * @generated
	 */
	public Adapter createSetColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.SetColumnDefaultValue <em>Set Column Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.SetColumnDefaultValue
	 * @generated
	 */
	public Adapter createSetColumnDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveDefaultValue <em>Remove Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveDefaultValue
	 * @generated
	 */
	public Adapter createRemoveDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.RemoveSequence <em>Remove Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.RemoveSequence
	 * @generated
	 */
	public Adapter createRemoveSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.HasNoOwnInstances <em>Has No Own Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.HasNoOwnInstances
	 * @generated
	 */
	public Adapter createHasNoOwnInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.HasNoInstances <em>Has No Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.HasNoInstances
	 * @generated
	 */
	public Adapter createHasNoInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.AddInstances <em>Add Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.AddInstances
	 * @generated
	 */
	public Adapter createAddInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.InsertInstances <em>Insert Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.InsertInstances
	 * @generated
	 */
	public Adapter createInsertInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.operations.GenerateSequenceNumbers <em>Generate Sequence Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.operations.GenerateSequenceNumbers
	 * @generated
	 */
	public Adapter createGenerateSequenceNumbersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperationsAdapterFactory
