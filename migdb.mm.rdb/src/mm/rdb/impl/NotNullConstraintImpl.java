/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.rdb.impl;

import mm.rdb.NotNullConstraint;
import mm.rdb.RdbPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Null Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotNullConstraintImpl extends ColumnConstraintImpl implements NotNullConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotNullConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbPackage.Literals.NOT_NULL_CONSTRAINT;
	}

} //NotNullConstraintImpl
