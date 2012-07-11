/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.ops.util;

import mm.rdb.ops.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm.rdb.ops.OpsPackage
 * @generated
 */
public class OpsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpsPackage.eINSTANCE;
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
	protected OpsSwitch<Adapter> modelSwitch =
		new OpsSwitch<Adapter>() {
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
			public Adapter caseAddUnique(AddUnique object) {
				return createAddUniqueAdapter();
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
			public Adapter caseRemoveConstraint(RemoveConstraint object) {
				return createRemoveConstraintAdapter();
			}
			@Override
			public Adapter caseAddNotNull(AddNotNull object) {
				return createAddNotNullAdapter();
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
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.ModelOperation
	 * @generated
	 */
	public Adapter createModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddSchema <em>Add Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddSchema
	 * @generated
	 */
	public Adapter createAddSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddSequence <em>Add Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddSequence
	 * @generated
	 */
	public Adapter createAddSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddIndex <em>Add Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddIndex
	 * @generated
	 */
	public Adapter createAddIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddTable <em>Add Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddTable
	 * @generated
	 */
	public Adapter createAddTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RenameTable <em>Rename Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RenameTable
	 * @generated
	 */
	public Adapter createRenameTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveTable <em>Remove Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveTable
	 * @generated
	 */
	public Adapter createRemoveTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddColumn
	 * @generated
	 */
	public Adapter createAddColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RenameColumn <em>Rename Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RenameColumn
	 * @generated
	 */
	public Adapter createRenameColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.CopyInstances <em>Copy Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.CopyInstances
	 * @generated
	 */
	public Adapter createCopyInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveColumn <em>Remove Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveColumn
	 * @generated
	 */
	public Adapter createRemoveColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddUnique <em>Add Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddUnique
	 * @generated
	 */
	public Adapter createAddUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddPrimaryKey <em>Add Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddPrimaryKey
	 * @generated
	 */
	public Adapter createAddPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddForeignKey <em>Add Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddForeignKey
	 * @generated
	 */
	public Adapter createAddForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveConstraint <em>Remove Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveConstraint
	 * @generated
	 */
	public Adapter createRemoveConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddNotNull <em>Add Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddNotNull
	 * @generated
	 */
	public Adapter createAddNotNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveIndex <em>Remove Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveIndex
	 * @generated
	 */
	public Adapter createRemoveIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.SetColumnType <em>Set Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.SetColumnType
	 * @generated
	 */
	public Adapter createSetColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.SetColumnDefaultValue <em>Set Column Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.SetColumnDefaultValue
	 * @generated
	 */
	public Adapter createSetColumnDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveDefaultValue <em>Remove Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveDefaultValue
	 * @generated
	 */
	public Adapter createRemoveDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.RemoveSequence <em>Remove Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.RemoveSequence
	 * @generated
	 */
	public Adapter createRemoveSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.HasNoOwnInstances <em>Has No Own Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.HasNoOwnInstances
	 * @generated
	 */
	public Adapter createHasNoOwnInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.HasNoInstances <em>Has No Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.HasNoInstances
	 * @generated
	 */
	public Adapter createHasNoInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.AddInstances <em>Add Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.AddInstances
	 * @generated
	 */
	public Adapter createAddInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.InsertInstances <em>Insert Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.InsertInstances
	 * @generated
	 */
	public Adapter createInsertInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.rdb.ops.GenerateSequenceNumbers <em>Generate Sequence Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.rdb.ops.GenerateSequenceNumbers
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

} //OpsAdapterFactory
