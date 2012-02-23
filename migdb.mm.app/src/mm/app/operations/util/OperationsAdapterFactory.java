/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.util;

import mm.app.operations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm.app.operations.OperationsPackage
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
			public Adapter caseAddPrimitiveClass(AddPrimitiveClass object) {
				return createAddPrimitiveClassAdapter();
			}
			@Override
			public Adapter caseAddEmbeddedClass(AddEmbeddedClass object) {
				return createAddEmbeddedClassAdapter();
			}
			@Override
			public Adapter caseAddClass(AddClass object) {
				return createAddClassAdapter();
			}
			@Override
			public Adapter caseRenameEntity(RenameEntity object) {
				return createRenameEntityAdapter();
			}
			@Override
			public Adapter caseSetParent(SetParent object) {
				return createSetParentAdapter();
			}
			@Override
			public Adapter caseSetAbstract(SetAbstract object) {
				return createSetAbstractAdapter();
			}
			@Override
			public Adapter caseRemoveEntity(RemoveEntity object) {
				return createRemoveEntityAdapter();
			}
			@Override
			public Adapter caseAddProperty(AddProperty object) {
				return createAddPropertyAdapter();
			}
			@Override
			public Adapter caseRenameProperty(RenameProperty object) {
				return createRenamePropertyAdapter();
			}
			@Override
			public Adapter caseRemoveProperty(RemoveProperty object) {
				return createRemovePropertyAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseSetOpposite(SetOpposite object) {
				return createSetOppositeAdapter();
			}
			@Override
			public Adapter caseSetBoundries(SetBoundries object) {
				return createSetBoundriesAdapter();
			}
			@Override
			public Adapter caseSetOrdered(SetOrdered object) {
				return createSetOrderedAdapter();
			}
			@Override
			public Adapter caseSetUnique(SetUnique object) {
				return createSetUniqueAdapter();
			}
			@Override
			public Adapter caseCopyProperty(CopyProperty object) {
				return createCopyPropertyAdapter();
			}
			@Override
			public Adapter caseMoveProperty(MoveProperty object) {
				return createMovePropertyAdapter();
			}
			@Override
			public Adapter caseExtractClass(ExtractClass object) {
				return createExtractClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link mm.app.operations.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.ModelOperation
	 * @generated
	 */
	public Adapter createModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.AddPrimitiveClass <em>Add Primitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.AddPrimitiveClass
	 * @generated
	 */
	public Adapter createAddPrimitiveClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.AddEmbeddedClass <em>Add Embedded Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.AddEmbeddedClass
	 * @generated
	 */
	public Adapter createAddEmbeddedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.AddClass <em>Add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.AddClass
	 * @generated
	 */
	public Adapter createAddClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.RenameEntity
	 * @generated
	 */
	public Adapter createRenameEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetParent <em>Set Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetParent
	 * @generated
	 */
	public Adapter createSetParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetAbstract <em>Set Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetAbstract
	 * @generated
	 */
	public Adapter createSetAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.RemoveEntity
	 * @generated
	 */
	public Adapter createRemoveEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.AddProperty <em>Add Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.AddProperty
	 * @generated
	 */
	public Adapter createAddPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.RenameProperty <em>Rename Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.RenameProperty
	 * @generated
	 */
	public Adapter createRenamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.RemoveProperty <em>Remove Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.RemoveProperty
	 * @generated
	 */
	public Adapter createRemovePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetOpposite <em>Set Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetOpposite
	 * @generated
	 */
	public Adapter createSetOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetBoundries <em>Set Boundries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetBoundries
	 * @generated
	 */
	public Adapter createSetBoundriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetOrdered <em>Set Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetOrdered
	 * @generated
	 */
	public Adapter createSetOrderedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.SetUnique <em>Set Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.SetUnique
	 * @generated
	 */
	public Adapter createSetUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.CopyProperty <em>Copy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.CopyProperty
	 * @generated
	 */
	public Adapter createCopyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.MoveProperty <em>Move Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.MoveProperty
	 * @generated
	 */
	public Adapter createMovePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.operations.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.operations.ExtractClass
	 * @generated
	 */
	public Adapter createExtractClassAdapter() {
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
