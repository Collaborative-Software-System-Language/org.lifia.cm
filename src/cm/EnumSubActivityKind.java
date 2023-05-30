/**
 */
package cm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Sub Activity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cm.CmPackage#getEnumSubActivityKind()
 * @model
 * @generated
 */
public enum EnumSubActivityKind implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @generated
	 * @ordered
	 */
	UNDEFINED_LITERAL(0, "undefined", "undefined"),

	/**
	 * The '<em><b>Share Info</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARE_INFO
	 * @generated
	 * @ordered
	 */
	SHARE_INFO_LITERAL(1, "shareInfo", "shareInfo"),

	/**
	 * The '<em><b>Analisys</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALISYS
	 * @generated
	 * @ordered
	 */
	ANALISYS_LITERAL(2, "analisys", "analisys"),

	/**
	 * The '<em><b>Desicion Making</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESICION_MAKING
	 * @generated
	 * @ordered
	 */
	DESICION_MAKING_LITERAL(3, "desicionMaking", "desicionMaking"),

	/**
	 * The '<em><b>Input Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_DATA
	 * @generated
	 * @ordered
	 */
	INPUT_DATA_LITERAL(4, "inputData", "inputData");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_LITERAL
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED = 0;

	/**
	 * The '<em><b>Share Info</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARE_INFO_LITERAL
	 * @model name="shareInfo"
	 * @generated
	 * @ordered
	 */
	public static final int SHARE_INFO = 1;

	/**
	 * The '<em><b>Analisys</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALISYS_LITERAL
	 * @model name="analisys"
	 * @generated
	 * @ordered
	 */
	public static final int ANALISYS = 2;

	/**
	 * The '<em><b>Desicion Making</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESICION_MAKING_LITERAL
	 * @model name="desicionMaking"
	 * @generated
	 * @ordered
	 */
	public static final int DESICION_MAKING = 3;

	/**
	 * The '<em><b>Input Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_DATA_LITERAL
	 * @model name="inputData"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_DATA = 4;

	/**
	 * An array of all the '<em><b>Enum Sub Activity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumSubActivityKind[] VALUES_ARRAY =
		new EnumSubActivityKind[] {
			UNDEFINED_LITERAL,
			SHARE_INFO_LITERAL,
			ANALISYS_LITERAL,
			DESICION_MAKING_LITERAL,
			INPUT_DATA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Sub Activity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumSubActivityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Sub Activity Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSubActivityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSubActivityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Sub Activity Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSubActivityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumSubActivityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Sub Activity Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumSubActivityKind get(int value) {
		switch (value) {
			case UNDEFINED: return UNDEFINED_LITERAL;
			case SHARE_INFO: return SHARE_INFO_LITERAL;
			case ANALISYS: return ANALISYS_LITERAL;
			case DESICION_MAKING: return DESICION_MAKING_LITERAL;
			case INPUT_DATA: return INPUT_DATA_LITERAL;
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
	private EnumSubActivityKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //EnumSubActivityKind
