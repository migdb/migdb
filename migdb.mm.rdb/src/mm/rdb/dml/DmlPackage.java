/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.dml;

import mm.rdb.RdbPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mm.rdb.dml.DmlFactory
 * @model kind="package"
 * @generated
 */
public interface DmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.collectionspro.eu/jam/mm/rdb-dml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdb-dml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmlPackage eINSTANCE = mm.rdb.dml.impl.DmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm.rdb.dml.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.dml.impl.QueryImpl
	 * @see mm.rdb.dml.impl.DmlPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 0;

	/**
	 * The feature id for the '<em><b>Column References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COLUMN_REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm.rdb.dml.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm.rdb.dml.impl.ColumnReferenceImpl
	 * @see mm.rdb.dml.impl.DmlPackageImpl#getColumnReference()
	 * @generated
	 */
	int COLUMN_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Owning Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__OWNING_TABLE = RdbPackage.COLUMN__OWNING_TABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__NAME = RdbPackage.COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__TYPE = RdbPackage.COLUMN__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__DEFAULT_VALUE = RdbPackage.COLUMN__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__CONSTRAINTS = RdbPackage.COLUMN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__REFERENCE = RdbPackage.COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_FEATURE_COUNT = RdbPackage.COLUMN_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link mm.rdb.dml.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see mm.rdb.dml.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link mm.rdb.dml.Query#getColumnReferences <em>Column References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column References</em>'.
	 * @see mm.rdb.dml.Query#getColumnReferences()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ColumnReferences();

	/**
	 * Returns the meta object for class '{@link mm.rdb.dml.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Reference</em>'.
	 * @see mm.rdb.dml.ColumnReference
	 * @generated
	 */
	EClass getColumnReference();

	/**
	 * Returns the meta object for the reference '{@link mm.rdb.dml.ColumnReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see mm.rdb.dml.ColumnReference#getReference()
	 * @see #getColumnReference()
	 * @generated
	 */
	EReference getColumnReference_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmlFactory getDmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm.rdb.dml.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.dml.impl.QueryImpl
		 * @see mm.rdb.dml.impl.DmlPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Column References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__COLUMN_REFERENCES = eINSTANCE.getQuery_ColumnReferences();

		/**
		 * The meta object literal for the '{@link mm.rdb.dml.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm.rdb.dml.impl.ColumnReferenceImpl
		 * @see mm.rdb.dml.impl.DmlPackageImpl#getColumnReference()
		 * @generated
		 */
		EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REFERENCE__REFERENCE = eINSTANCE.getColumnReference_Reference();

	}

} //DmlPackage
