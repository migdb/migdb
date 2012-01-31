/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.operations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationsFactoryImpl extends EFactoryImpl implements OperationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationsFactory init() {
		try {
			OperationsFactory theOperationsFactory = (OperationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collectionspro.eu/jam/mm/app-ops"); 
			if (theOperationsFactory != null) {
				return theOperationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationsPackage.ADD_PRIMITIVE_CLASS: return createAddPrimitiveClass();
			case OperationsPackage.ADD_EMBEDDED_CLASS: return createAddEmbeddedClass();
			case OperationsPackage.ADD_CLASS: return createAddClass();
			case OperationsPackage.RENAME_ENTITY: return createRenameEntity();
			case OperationsPackage.SET_PARENT: return createSetParent();
			case OperationsPackage.SET_ABSTRACT: return createSetAbstract();
			case OperationsPackage.REMOVE_ENTITY: return createRemoveEntity();
			case OperationsPackage.ADD_PROPERTY: return createAddProperty();
			case OperationsPackage.RENAME_PROPERTY: return createRenameProperty();
			case OperationsPackage.REMOVE_PROPERTY: return createRemoveProperty();
			case OperationsPackage.SET_TYPE: return createSetType();
			case OperationsPackage.SET_OPPOSITE: return createSetOpposite();
			case OperationsPackage.SET_BOUNDRIES: return createSetBoundries();
			case OperationsPackage.SET_ORDERED: return createSetOrdered();
			case OperationsPackage.SET_UNIQUE: return createSetUnique();
			case OperationsPackage.COPY_PROPERTY: return createCopyProperty();
			case OperationsPackage.MOVE_PROPERTY: return createMoveProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OperationsPackage.MERGE_TYPE:
				return createMergeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OperationsPackage.MERGE_TYPE:
				return convertMergeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimitiveClass createAddPrimitiveClass() {
		AddPrimitiveClassImpl addPrimitiveClass = new AddPrimitiveClassImpl();
		return addPrimitiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddEmbeddedClass createAddEmbeddedClass() {
		AddEmbeddedClassImpl addEmbeddedClass = new AddEmbeddedClassImpl();
		return addEmbeddedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddClass createAddClass() {
		AddClassImpl addClass = new AddClassImpl();
		return addClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameEntity createRenameEntity() {
		RenameEntityImpl renameEntity = new RenameEntityImpl();
		return renameEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetParent createSetParent() {
		SetParentImpl setParent = new SetParentImpl();
		return setParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAbstract createSetAbstract() {
		SetAbstractImpl setAbstract = new SetAbstractImpl();
		return setAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveEntity createRemoveEntity() {
		RemoveEntityImpl removeEntity = new RemoveEntityImpl();
		return removeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddProperty createAddProperty() {
		AddPropertyImpl addProperty = new AddPropertyImpl();
		return addProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameProperty createRenameProperty() {
		RenamePropertyImpl renameProperty = new RenamePropertyImpl();
		return renameProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveProperty createRemoveProperty() {
		RemovePropertyImpl removeProperty = new RemovePropertyImpl();
		return removeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOpposite createSetOpposite() {
		SetOppositeImpl setOpposite = new SetOppositeImpl();
		return setOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBoundries createSetBoundries() {
		SetBoundriesImpl setBoundries = new SetBoundriesImpl();
		return setBoundries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOrdered createSetOrdered() {
		SetOrderedImpl setOrdered = new SetOrderedImpl();
		return setOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetUnique createSetUnique() {
		SetUniqueImpl setUnique = new SetUniqueImpl();
		return setUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyProperty createCopyProperty() {
		CopyPropertyImpl copyProperty = new CopyPropertyImpl();
		return copyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveProperty createMoveProperty() {
		MovePropertyImpl moveProperty = new MovePropertyImpl();
		return moveProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeType createMergeTypeFromString(EDataType eDataType, String initialValue) {
		MergeType result = MergeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsPackage getOperationsPackage() {
		return (OperationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationsPackage getPackage() {
		return OperationsPackage.eINSTANCE;
	}

} //OperationsFactoryImpl
