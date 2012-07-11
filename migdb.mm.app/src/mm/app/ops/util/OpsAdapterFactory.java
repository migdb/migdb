/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops.util;

import mm.app.ops.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm.app.ops.OpsPackage
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
			public Adapter caseExtractParent(ExtractParent object) {
				return createExtractParentAdapter();
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
	 * Creates a new adapter for an object of class '{@link mm.app.ops.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.ModelOperation
	 * @generated
	 */
	public Adapter createModelOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.AddPrimitiveClass <em>Add Primitive Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.AddPrimitiveClass
	 * @generated
	 */
	public Adapter createAddPrimitiveClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.AddEmbeddedClass <em>Add Embedded Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.AddEmbeddedClass
	 * @generated
	 */
	public Adapter createAddEmbeddedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.AddClass <em>Add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.AddClass
	 * @generated
	 */
	public Adapter createAddClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.RenameEntity <em>Rename Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.RenameEntity
	 * @generated
	 */
	public Adapter createRenameEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetParent <em>Set Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetParent
	 * @generated
	 */
	public Adapter createSetParentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetAbstract <em>Set Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetAbstract
	 * @generated
	 */
	public Adapter createSetAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.RemoveEntity <em>Remove Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.RemoveEntity
	 * @generated
	 */
	public Adapter createRemoveEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.AddProperty <em>Add Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.AddProperty
	 * @generated
	 */
	public Adapter createAddPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.RenameProperty <em>Rename Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.RenameProperty
	 * @generated
	 */
	public Adapter createRenamePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.RemoveProperty <em>Remove Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.RemoveProperty
	 * @generated
	 */
	public Adapter createRemovePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetOpposite <em>Set Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetOpposite
	 * @generated
	 */
	public Adapter createSetOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetBoundries <em>Set Boundries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetBoundries
	 * @generated
	 */
	public Adapter createSetBoundriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetOrdered <em>Set Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetOrdered
	 * @generated
	 */
	public Adapter createSetOrderedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.SetUnique <em>Set Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.SetUnique
	 * @generated
	 */
	public Adapter createSetUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.CopyProperty <em>Copy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.CopyProperty
	 * @generated
	 */
	public Adapter createCopyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.MoveProperty <em>Move Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.MoveProperty
	 * @generated
	 */
	public Adapter createMovePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.ExtractClass <em>Extract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.ExtractClass
	 * @generated
	 */
	public Adapter createExtractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm.app.ops.ExtractParent <em>Extract Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm.app.ops.ExtractParent
	 * @generated
	 */
	public Adapter createExtractParentAdapter() {
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
