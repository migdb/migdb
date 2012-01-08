/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Inheritance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mm.app.AppPackage#getInheritanceType()
 * @model
 * @generated
 */
public enum InheritanceType implements Enumerator {
	/**
	 * The '<em><b>not defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_NOT_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	_NOT_DEFINED(0, "__not_defined", "__not_defined"),

	/**
	 * The '<em><b>Single Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_TABLE(1, "singleTable", "singleTable"),

	/**
	 * The '<em><b>Table Per Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_PER_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_PER_CLASS(2, "tablePerClass", "tablePerClass"),

	/**
	 * The '<em><b>Joined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOINED_VALUE
	 * @generated
	 * @ordered
	 */
	JOINED(3, "joined", "joined");

	/**
	 * The '<em><b>not defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>not defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_NOT_DEFINED
	 * @model name="__not_defined"
	 * @generated
	 * @ordered
	 */
	public static final int _NOT_DEFINED_VALUE = 0;

	/**
	 * The '<em><b>Single Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_TABLE
	 * @model name="singleTable"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_TABLE_VALUE = 1;

	/**
	 * The '<em><b>Table Per Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Per Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_PER_CLASS
	 * @model name="tablePerClass"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_PER_CLASS_VALUE = 2;

	/**
	 * The '<em><b>Joined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Joined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOINED
	 * @model name="joined"
	 * @generated
	 * @ordered
	 */
	public static final int JOINED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Inheritance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InheritanceType[] VALUES_ARRAY =
		new InheritanceType[] {
			_NOT_DEFINED,
			SINGLE_TABLE,
			TABLE_PER_CLASS,
			JOINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Inheritance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InheritanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Inheritance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritanceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InheritanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inheritance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritanceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InheritanceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Inheritance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InheritanceType get(int value) {
		switch (value) {
			case _NOT_DEFINED_VALUE: return _NOT_DEFINED;
			case SINGLE_TABLE_VALUE: return SINGLE_TABLE;
			case TABLE_PER_CLASS_VALUE: return TABLE_PER_CLASS;
			case JOINED_VALUE: return JOINED;
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
	private InheritanceType(int value, String name, String literal) {
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
	
} //InheritanceType