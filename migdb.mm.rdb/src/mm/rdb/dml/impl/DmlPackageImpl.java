/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.dml.impl;

import mm.rdb.RdbPackage;

import mm.rdb.dml.ColumnReference;
import mm.rdb.dml.DmlFactory;
import mm.rdb.dml.DmlPackage;
import mm.rdb.dml.Query;

import mm.rdb.impl.RdbPackageImpl;

import mm.rdb.operations.OperationsPackage;

import mm.rdb.operations.impl.OperationsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmlPackageImpl extends EPackageImpl implements DmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnReferenceEClass = null;

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
	 * @see mm.rdb.dml.DmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmlPackageImpl() {
		super(eNS_URI, DmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmlPackage init() {
		if (isInited) return (DmlPackage)EPackage.Registry.INSTANCE.getEPackage(DmlPackage.eNS_URI);

		// Obtain or create and register package
		DmlPackageImpl theDmlPackage = (DmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RdbPackageImpl theRdbPackage = (RdbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) instanceof RdbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI) : RdbPackage.eINSTANCE);
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) : OperationsPackage.eINSTANCE);

		// Create package meta-data objects
		theDmlPackage.createPackageContents();
		theRdbPackage.createPackageContents();
		theOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theDmlPackage.initializePackageContents();
		theRdbPackage.initializePackageContents();
		theOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmlPackage.eNS_URI, theDmlPackage);
		return theDmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_ColumnReferences() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnReference() {
		return columnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnReference_Reference() {
		return (EReference)columnReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmlFactory getDmlFactory() {
		return (DmlFactory)getEFactoryInstance();
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
		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__COLUMN_REFERENCES);

		columnReferenceEClass = createEClass(COLUMN_REFERENCE);
		createEReference(columnReferenceEClass, COLUMN_REFERENCE__REFERENCE);
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
		RdbPackage theRdbPackage = (RdbPackage)EPackage.Registry.INSTANCE.getEPackage(RdbPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_ColumnReferences(), this.getColumnReference(), null, "columnReferences", null, 1, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnReferenceEClass, ColumnReference.class, "ColumnReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnReference_Reference(), theRdbPackage.getColumn(), null, "reference", null, 1, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// DVU
		createDVUAnnotations();
	}

	/**
	 * Initializes the annotations for <b>DVU</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDVUAnnotations() {
		String source = "DVU";		
		addAnnotation
		  (getQuery_ColumnReferences(), 
		   source, 
		   new String[] {
			 "subsets", "self.columns"
		   });
	}

} //DmlPackageImpl
