/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.operations.impl;

import mm.rdb.operations.*;

import org.eclipse.emf.ecore.EClass;
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
			OperationsFactory theOperationsFactory = (OperationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.collectionspro.eu/jam/mm/rdb-ops"); 
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
			case OperationsPackage.ADD_SCHEMA: return createAddSchema();
			case OperationsPackage.ADD_SEQUENCE: return createAddSequence();
			case OperationsPackage.ADD_INDEX: return createAddIndex();
			case OperationsPackage.ADD_TABLE: return createAddTable();
			case OperationsPackage.ADD_COLUMN: return createAddColumn();
			case OperationsPackage.ADD_UNIQUE_INDEX: return createAddUniqueIndex();
			case OperationsPackage.ADD_PRIMARY_KEY: return createAddPrimaryKey();
			case OperationsPackage.ADD_FOREIGN_KEY: return createAddForeignKey();
			case OperationsPackage.ADD_NOT_NULL_CONSTRAINT: return createAddNotNullConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSchema createAddSchema() {
		AddSchemaImpl addSchema = new AddSchemaImpl();
		return addSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSequence createAddSequence() {
		AddSequenceImpl addSequence = new AddSequenceImpl();
		return addSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddIndex createAddIndex() {
		AddIndexImpl addIndex = new AddIndexImpl();
		return addIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTable createAddTable() {
		AddTableImpl addTable = new AddTableImpl();
		return addTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddColumn createAddColumn() {
		AddColumnImpl addColumn = new AddColumnImpl();
		return addColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddUniqueIndex createAddUniqueIndex() {
		AddUniqueIndexImpl addUniqueIndex = new AddUniqueIndexImpl();
		return addUniqueIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimaryKey createAddPrimaryKey() {
		AddPrimaryKeyImpl addPrimaryKey = new AddPrimaryKeyImpl();
		return addPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddForeignKey createAddForeignKey() {
		AddForeignKeyImpl addForeignKey = new AddForeignKeyImpl();
		return addForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddNotNullConstraint createAddNotNullConstraint() {
		AddNotNullConstraintImpl addNotNullConstraint = new AddNotNullConstraintImpl();
		return addNotNullConstraint;
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
