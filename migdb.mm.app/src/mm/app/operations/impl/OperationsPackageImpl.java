/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations.impl;

import mm.app.AppPackage;

import mm.app.impl.AppPackageImpl;

import mm.app.operations.AddClass;
import mm.app.operations.AddEmbeddedClass;
import mm.app.operations.AddPrimitiveClass;
import mm.app.operations.AddProperty;
import mm.app.operations.CopyProperty;
import mm.app.operations.ExtractClass;
import mm.app.operations.MergeType;
import mm.app.operations.ModelOperation;
import mm.app.operations.MoveProperty;
import mm.app.operations.OperationsFactory;
import mm.app.operations.OperationsPackage;
import mm.app.operations.RemoveEntity;
import mm.app.operations.RemoveProperty;
import mm.app.operations.RenameEntity;
import mm.app.operations.RenameProperty;
import mm.app.operations.SetAbstract;
import mm.app.operations.SetBoundries;
import mm.app.operations.SetOpposite;
import mm.app.operations.SetOrdered;
import mm.app.operations.SetParent;
import mm.app.operations.SetType;
import mm.app.operations.SetUnique;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationsPackageImpl extends EPackageImpl implements OperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addPrimitiveClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEmbeddedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setParentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renamePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOppositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setBoundriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOrderedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setUniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mm.app.operations.OperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationsPackageImpl() {
		super(eNS_URI, OperationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperationsPackage init() {
		if (isInited) return (OperationsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI);

		// Obtain or create and register package
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AppPackageImpl theAppPackage = (AppPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI) instanceof AppPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI) : AppPackage.eINSTANCE);

		// Create package meta-data objects
		theOperationsPackage.createPackageContents();
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		theOperationsPackage.initializePackageContents();
		theAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOperationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationsPackage.eNS_URI, theOperationsPackage);
		return theOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelOperation() {
		return modelOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelOperation_ModelRoot() {
		return (EReference)modelOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddPrimitiveClass() {
		return addPrimitiveClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimitiveClass_Name() {
		return (EAttribute)addPrimitiveClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimitiveClass_PrimitiveType() {
		return (EAttribute)addPrimitiveClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddEmbeddedClass() {
		return addEmbeddedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddEmbeddedClass_Name() {
		return (EAttribute)addEmbeddedClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddClass() {
		return addClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddClass_Name() {
		return (EAttribute)addClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddClass_IsAbstract() {
		return (EAttribute)addClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddClass_TableName() {
		return (EAttribute)addClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddClass_InheritanceType() {
		return (EAttribute)addClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameEntity() {
		return renameEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameEntity_Name() {
		return (EAttribute)renameEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameEntity_NewName() {
		return (EAttribute)renameEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetParent() {
		return setParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetParent_Name() {
		return (EAttribute)setParentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetParent_ParentName() {
		return (EAttribute)setParentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAbstract() {
		return setAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAbstract_Name() {
		return (EAttribute)setAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAbstract_IsAbstract() {
		return (EAttribute)setAbstractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveEntity() {
		return removeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveEntity_Name() {
		return (EAttribute)removeEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddProperty() {
		return addPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_OwningClassName() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_Name() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_Type() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_DefaultValue() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_LowerBound() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_UpperBound() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_IsOrdered() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_IsUnique() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_ColumnName() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_ColumnNamePattern() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddProperty_SequenceName() {
		return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameProperty() {
		return renamePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameProperty_OwningClassName() {
		return (EAttribute)renamePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameProperty_Name() {
		return (EAttribute)renamePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameProperty_NewName() {
		return (EAttribute)renamePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveProperty() {
		return removePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveProperty_OwningClassName() {
		return (EAttribute)removePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveProperty_Name() {
		return (EAttribute)removePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_OwningClassName() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Name() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Type() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOpposite() {
		return setOppositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpposite_FirstClassName() {
		return (EAttribute)setOppositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpposite_FirstPropertyName() {
		return (EAttribute)setOppositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpposite_SecondClassName() {
		return (EAttribute)setOppositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpposite_SecondPropertyName() {
		return (EAttribute)setOppositeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOpposite_IsOpposite() {
		return (EAttribute)setOppositeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetBoundries() {
		return setBoundriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBoundries_OwningClassName() {
		return (EAttribute)setBoundriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBoundries_Name() {
		return (EAttribute)setBoundriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBoundries_LowerBound() {
		return (EAttribute)setBoundriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBoundries_UpperBound() {
		return (EAttribute)setBoundriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOrdered() {
		return setOrderedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOrdered_OwningClassName() {
		return (EAttribute)setOrderedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOrdered_Name() {
		return (EAttribute)setOrderedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetOrdered_IsOrdered() {
		return (EAttribute)setOrderedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetUnique() {
		return setUniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetUnique_OwningClassName() {
		return (EAttribute)setUniqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetUnique_Name() {
		return (EAttribute)setUniqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetUnique_IsUnique() {
		return (EAttribute)setUniqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyProperty() {
		return copyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyProperty_OwningClassName() {
		return (EAttribute)copyPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyProperty_Name() {
		return (EAttribute)copyPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyProperty_TargetClassName() {
		return (EAttribute)copyPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyProperty_Type() {
		return (EAttribute)copyPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveProperty() {
		return movePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveProperty_OwningClassName() {
		return (EAttribute)movePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveProperty_Name() {
		return (EAttribute)movePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveProperty_TargetClassName() {
		return (EAttribute)movePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveProperty_Type() {
		return (EAttribute)movePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractClass() {
		return extractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractClass_SourceClassName() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractClass_ExtractPropertiesNames() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractClass_ExtractClassName() {
		return (EAttribute)extractClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMergeType() {
		return mergeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsFactory getOperationsFactory() {
		return (OperationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelOperationEClass = createEClass(MODEL_OPERATION);
		createEReference(modelOperationEClass, MODEL_OPERATION__MODEL_ROOT);

		addPrimitiveClassEClass = createEClass(ADD_PRIMITIVE_CLASS);
		createEAttribute(addPrimitiveClassEClass, ADD_PRIMITIVE_CLASS__NAME);
		createEAttribute(addPrimitiveClassEClass, ADD_PRIMITIVE_CLASS__PRIMITIVE_TYPE);

		addEmbeddedClassEClass = createEClass(ADD_EMBEDDED_CLASS);
		createEAttribute(addEmbeddedClassEClass, ADD_EMBEDDED_CLASS__NAME);

		addClassEClass = createEClass(ADD_CLASS);
		createEAttribute(addClassEClass, ADD_CLASS__NAME);
		createEAttribute(addClassEClass, ADD_CLASS__IS_ABSTRACT);
		createEAttribute(addClassEClass, ADD_CLASS__TABLE_NAME);
		createEAttribute(addClassEClass, ADD_CLASS__INHERITANCE_TYPE);

		renameEntityEClass = createEClass(RENAME_ENTITY);
		createEAttribute(renameEntityEClass, RENAME_ENTITY__NAME);
		createEAttribute(renameEntityEClass, RENAME_ENTITY__NEW_NAME);

		setParentEClass = createEClass(SET_PARENT);
		createEAttribute(setParentEClass, SET_PARENT__NAME);
		createEAttribute(setParentEClass, SET_PARENT__PARENT_NAME);

		setAbstractEClass = createEClass(SET_ABSTRACT);
		createEAttribute(setAbstractEClass, SET_ABSTRACT__NAME);
		createEAttribute(setAbstractEClass, SET_ABSTRACT__IS_ABSTRACT);

		removeEntityEClass = createEClass(REMOVE_ENTITY);
		createEAttribute(removeEntityEClass, REMOVE_ENTITY__NAME);

		addPropertyEClass = createEClass(ADD_PROPERTY);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__OWNING_CLASS_NAME);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__NAME);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__TYPE);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__DEFAULT_VALUE);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__LOWER_BOUND);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__UPPER_BOUND);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__IS_ORDERED);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__IS_UNIQUE);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__COLUMN_NAME);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__COLUMN_NAME_PATTERN);
		createEAttribute(addPropertyEClass, ADD_PROPERTY__SEQUENCE_NAME);

		renamePropertyEClass = createEClass(RENAME_PROPERTY);
		createEAttribute(renamePropertyEClass, RENAME_PROPERTY__OWNING_CLASS_NAME);
		createEAttribute(renamePropertyEClass, RENAME_PROPERTY__NAME);
		createEAttribute(renamePropertyEClass, RENAME_PROPERTY__NEW_NAME);

		removePropertyEClass = createEClass(REMOVE_PROPERTY);
		createEAttribute(removePropertyEClass, REMOVE_PROPERTY__OWNING_CLASS_NAME);
		createEAttribute(removePropertyEClass, REMOVE_PROPERTY__NAME);

		setTypeEClass = createEClass(SET_TYPE);
		createEAttribute(setTypeEClass, SET_TYPE__OWNING_CLASS_NAME);
		createEAttribute(setTypeEClass, SET_TYPE__NAME);
		createEAttribute(setTypeEClass, SET_TYPE__TYPE);

		setOppositeEClass = createEClass(SET_OPPOSITE);
		createEAttribute(setOppositeEClass, SET_OPPOSITE__FIRST_CLASS_NAME);
		createEAttribute(setOppositeEClass, SET_OPPOSITE__FIRST_PROPERTY_NAME);
		createEAttribute(setOppositeEClass, SET_OPPOSITE__SECOND_CLASS_NAME);
		createEAttribute(setOppositeEClass, SET_OPPOSITE__SECOND_PROPERTY_NAME);
		createEAttribute(setOppositeEClass, SET_OPPOSITE__IS_OPPOSITE);

		setBoundriesEClass = createEClass(SET_BOUNDRIES);
		createEAttribute(setBoundriesEClass, SET_BOUNDRIES__OWNING_CLASS_NAME);
		createEAttribute(setBoundriesEClass, SET_BOUNDRIES__NAME);
		createEAttribute(setBoundriesEClass, SET_BOUNDRIES__LOWER_BOUND);
		createEAttribute(setBoundriesEClass, SET_BOUNDRIES__UPPER_BOUND);

		setOrderedEClass = createEClass(SET_ORDERED);
		createEAttribute(setOrderedEClass, SET_ORDERED__OWNING_CLASS_NAME);
		createEAttribute(setOrderedEClass, SET_ORDERED__NAME);
		createEAttribute(setOrderedEClass, SET_ORDERED__IS_ORDERED);

		setUniqueEClass = createEClass(SET_UNIQUE);
		createEAttribute(setUniqueEClass, SET_UNIQUE__OWNING_CLASS_NAME);
		createEAttribute(setUniqueEClass, SET_UNIQUE__NAME);
		createEAttribute(setUniqueEClass, SET_UNIQUE__IS_UNIQUE);

		copyPropertyEClass = createEClass(COPY_PROPERTY);
		createEAttribute(copyPropertyEClass, COPY_PROPERTY__OWNING_CLASS_NAME);
		createEAttribute(copyPropertyEClass, COPY_PROPERTY__NAME);
		createEAttribute(copyPropertyEClass, COPY_PROPERTY__TARGET_CLASS_NAME);
		createEAttribute(copyPropertyEClass, COPY_PROPERTY__TYPE);

		movePropertyEClass = createEClass(MOVE_PROPERTY);
		createEAttribute(movePropertyEClass, MOVE_PROPERTY__OWNING_CLASS_NAME);
		createEAttribute(movePropertyEClass, MOVE_PROPERTY__NAME);
		createEAttribute(movePropertyEClass, MOVE_PROPERTY__TARGET_CLASS_NAME);
		createEAttribute(movePropertyEClass, MOVE_PROPERTY__TYPE);

		extractClassEClass = createEClass(EXTRACT_CLASS);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__SOURCE_CLASS_NAME);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__EXTRACT_PROPERTIES_NAMES);
		createEAttribute(extractClassEClass, EXTRACT_CLASS__EXTRACT_CLASS_NAME);

		// Create enums
		mergeTypeEEnum = createEEnum(MERGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AppPackage theAppPackage = (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addPrimitiveClassEClass.getESuperTypes().add(this.getModelOperation());
		addEmbeddedClassEClass.getESuperTypes().add(this.getModelOperation());
		addClassEClass.getESuperTypes().add(this.getModelOperation());
		renameEntityEClass.getESuperTypes().add(this.getModelOperation());
		setParentEClass.getESuperTypes().add(this.getModelOperation());
		setAbstractEClass.getESuperTypes().add(this.getModelOperation());
		removeEntityEClass.getESuperTypes().add(this.getModelOperation());
		addPropertyEClass.getESuperTypes().add(this.getModelOperation());
		renamePropertyEClass.getESuperTypes().add(this.getModelOperation());
		removePropertyEClass.getESuperTypes().add(this.getModelOperation());
		setTypeEClass.getESuperTypes().add(this.getModelOperation());
		setOppositeEClass.getESuperTypes().add(this.getModelOperation());
		setBoundriesEClass.getESuperTypes().add(this.getModelOperation());
		setOrderedEClass.getESuperTypes().add(this.getModelOperation());
		setUniqueEClass.getESuperTypes().add(this.getModelOperation());
		copyPropertyEClass.getESuperTypes().add(this.getModelOperation());
		movePropertyEClass.getESuperTypes().add(this.getModelOperation());
		extractClassEClass.getESuperTypes().add(this.getModelOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(modelOperationEClass, ModelOperation.class, "ModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelOperation_ModelRoot(), theAppPackage.getModelRoot(), theAppPackage.getModelRoot_Operations(), "modelRoot", null, 1, 1, ModelOperation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(addPrimitiveClassEClass, AddPrimitiveClass.class, "AddPrimitiveClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddPrimitiveClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddPrimitiveClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimitiveClass_PrimitiveType(), theAppPackage.getPrimitiveType(), "primitiveType", null, 1, 1, AddPrimitiveClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEmbeddedClassEClass, AddEmbeddedClass.class, "AddEmbeddedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddEmbeddedClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddEmbeddedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addClassEClass, AddClass.class, "AddClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddClass_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddClass_InheritanceType(), theAppPackage.getInheritanceType(), "inheritanceType", null, 1, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameEntityEClass, RenameEntity.class, "RenameEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, RenameEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameEntity_NewName(), ecorePackage.getEString(), "newName", null, 1, 1, RenameEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setParentEClass, SetParent.class, "SetParent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetParent_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetParent_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, SetParent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setAbstractEClass, SetAbstract.class, "SetAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetAbstract_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetAbstract_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 1, 1, SetAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeEntityEClass, RemoveEntity.class, "RemoveEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addPropertyEClass, AddProperty.class, "AddProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddProperty_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_ColumnNamePattern(), ecorePackage.getEString(), "columnNamePattern", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddProperty_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renamePropertyEClass, RenameProperty.class, "RenameProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameProperty_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, RenameProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, RenameProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameProperty_NewName(), ecorePackage.getEString(), "newName", null, 1, 1, RenameProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removePropertyEClass, RemoveProperty.class, "RemoveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveProperty_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, RemoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, RemoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetType_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Type(), ecorePackage.getEString(), "type", null, 1, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setOppositeEClass, SetOpposite.class, "SetOpposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetOpposite_FirstClassName(), ecorePackage.getEString(), "firstClassName", null, 1, 1, SetOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOpposite_FirstPropertyName(), ecorePackage.getEString(), "firstPropertyName", null, 1, 1, SetOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOpposite_SecondClassName(), ecorePackage.getEString(), "secondClassName", null, 1, 1, SetOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOpposite_SecondPropertyName(), ecorePackage.getEString(), "secondPropertyName", null, 1, 1, SetOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOpposite_IsOpposite(), ecorePackage.getEBoolean(), "isOpposite", null, 1, 1, SetOpposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setBoundriesEClass, SetBoundries.class, "SetBoundries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetBoundries_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, SetBoundries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetBoundries_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetBoundries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetBoundries_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, SetBoundries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetBoundries_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, SetBoundries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setOrderedEClass, SetOrdered.class, "SetOrdered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetOrdered_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, SetOrdered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOrdered_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetOrdered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetOrdered_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 1, 1, SetOrdered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setUniqueEClass, SetUnique.class, "SetUnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetUnique_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, SetUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetUnique_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetUnique_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, SetUnique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyPropertyEClass, CopyProperty.class, "CopyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyProperty_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, CopyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, CopyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyProperty_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 1, 1, CopyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyProperty_Type(), this.getMergeType(), "type", null, 1, 1, CopyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movePropertyEClass, MoveProperty.class, "MoveProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveProperty_OwningClassName(), ecorePackage.getEString(), "owningClassName", null, 1, 1, MoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, MoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveProperty_TargetClassName(), ecorePackage.getEString(), "targetClassName", null, 1, 1, MoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveProperty_Type(), this.getMergeType(), "type", null, 1, 1, MoveProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractClassEClass, ExtractClass.class, "ExtractClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtractClass_SourceClassName(), ecorePackage.getEString(), "sourceClassName", null, 1, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractClass_ExtractPropertiesNames(), ecorePackage.getEString(), "extractPropertiesNames", null, 1, -1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractClass_ExtractClassName(), ecorePackage.getEString(), "extractClassName", null, 1, 1, ExtractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mergeTypeEEnum, MergeType.class, "MergeType");
		addEEnumLiteral(mergeTypeEEnum, MergeType.STRICT);
		addEEnumLiteral(mergeTypeEEnum, MergeType.FORCE);
		addEEnumLiteral(mergeTypeEEnum, MergeType.TOLERANT);
	}

} //OperationsPackageImpl
