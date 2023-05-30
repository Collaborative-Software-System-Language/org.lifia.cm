/**
 */
package cm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Group Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cm.CmPackage#getEnumGroupKind()
 * @model
 * @generated
 */
public enum EnumGroupKind implements Enumerator {
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
	 * The '<em><b>Cooperative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE
	 * @generated
	 * @ordered
	 */
	COOPERATIVE_LITERAL(1, "cooperative", "cooperative"),

	/**
	 * The '<em><b>Individual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL
	 * @generated
	 * @ordered
	 */
	INDIVIDUAL_LITERAL(2, "individual", "individual");

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
	 * The '<em><b>Cooperative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE_LITERAL
	 * @model name="cooperative"
	 * @generated
	 * @ordered
	 */
	public static final int COOPERATIVE = 1;

	/**
	 * The '<em><b>Individual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL_LITERAL
	 * @model name="individual"
	 * @generated
	 * @ordered
	 */
	public static final int INDIVIDUAL = 2;

	/**
	 * An array of all the '<em><b>Enum Group Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumGroupKind[] VALUES_ARRAY =
		new EnumGroupKind[] {
			UNDEFINED_LITERAL,
			COOPERATIVE_LITERAL,
			INDIVIDUAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Group Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumGroupKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Group Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumGroupKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumGroupKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Group Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumGroupKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumGroupKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Group Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumGroupKind get(int value) {
		switch (value) {
			case UNDEFINED: return UNDEFINED_LITERAL;
			case COOPERATIVE: return COOPERATIVE_LITERAL;
			case INDIVIDUAL: return INDIVIDUAL_LITERAL;
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
	private EnumGroupKind(int value, String name, String literal) {
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
	
} //EnumGroupKind
