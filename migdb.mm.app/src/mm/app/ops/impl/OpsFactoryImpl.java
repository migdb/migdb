/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.ops.impl;

import mm.app.ops.*;

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
public class OpsFactoryImpl extends EFactoryImpl implements OpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpsFactory init() {
		try {
			OpsFactory theOpsFactory = (OpsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collectionspro.eu/jam/mm/app-ops"); 
			if (theOpsFactory != null) {
				return theOpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpsFactoryImpl() {
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
			case OpsPackage.ADD_PRIMITIVE_CLASS: return createAddPrimitiveClass();
			case OpsPackage.ADD_EMBEDDED_CLASS: return createAddEmbeddedClass();
			case OpsPackage.ADD_CLASS: return createAddClass();
			case OpsPackage.RENAME_ENTITY: return createRenameEntity();
			case OpsPackage.SET_PARENT: return createSetParent();
			case OpsPackage.SET_ABSTRACT: return createSetAbstract();
			case OpsPackage.REMOVE_ENTITY: return createRemoveEntity();
			case OpsPackage.ADD_PROPERTY: return createAddProperty();
			case OpsPackage.RENAME_PROPERTY: return createRenameProperty();
			case OpsPackage.REMOVE_PROPERTY: return createRemoveProperty();
			case OpsPackage.SET_TYPE: return createSetType();
			case OpsPackage.SET_OPPOSITE: return createSetOpposite();
			case OpsPackage.SET_BOUNDRIES: return createSetBoundries();
			case OpsPackage.SET_ORDERED: return createSetOrdered();
			case OpsPackage.SET_UNIQUE: return createSetUnique();
			case OpsPackage.COPY_PROPERTY: return createCopyProperty();
			case OpsPackage.MOVE_PROPERTY: return createMoveProperty();
			case OpsPackage.EXTRACT_CLASS: return createExtractClass();
			case OpsPackage.EXTRACT_PARENT: return createExtractParent();
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
			case OpsPackage.MERGE_TYPE:
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
			case OpsPackage.MERGE_TYPE:
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
	public ExtractClass createExtractClass() {
		ExtractClassImpl extractClass = new ExtractClassImpl();
		return extractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractParent createExtractParent() {
		ExtractParentImpl extractParent = new ExtractParentImpl();
		return extractParent;
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
	public OpsPackage getOpsPackage() {
		return (OpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpsPackage getPackage() {
		return OpsPackage.eINSTANCE;
	}

} //OpsFactoryImpl
