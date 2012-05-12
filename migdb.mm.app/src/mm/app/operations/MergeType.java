/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app.operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Merge Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mm.app.operations.OperationsPackage#getMergeType()
 * @model
 * @generated
 */
public enum MergeType implements Enumerator {
	/**
	 * The '<em><b>Strict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICT_VALUE
	 * @generated
	 * @ordered
	 */
	STRICT(0, "strict", "strict"),

	/**
	 * The '<em><b>Force</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCE_VALUE
	 * @generated
	 * @ordered
	 */
	FORCE(1, "force", "force"),

	/**
	 * The '<em><b>Tolerant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERANT_VALUE
	 * @generated
	 * @ordered
	 */
	TOLERANT(2, "tolerant", "tolerant");

	/**
	 * The '<em><b>Strict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICT
	 * @model name="strict"
	 * @generated
	 * @ordered
	 */
	public static final int STRICT_VALUE = 0;

	/**
	 * The '<em><b>Force</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Force</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORCE
	 * @model name="force"
	 * @generated
	 * @ordered
	 */
	public static final int FORCE_VALUE = 1;

	/**
	 * The '<em><b>Tolerant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tolerant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOLERANT
	 * @model name="tolerant"
	 * @generated
	 * @ordered
	 */
	public static final int TOLERANT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Merge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MergeType[] VALUES_ARRAY =
		new MergeType[] {
			STRICT,
			FORCE,
			TOLERANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Merge Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MergeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Merge Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MergeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MergeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MergeType get(int value) {
		switch (value) {
			case STRICT_VALUE: return STRICT;
			case FORCE_VALUE: return FORCE;
			case TOLERANT_VALUE: return TOLERANT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MergeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MergeType
