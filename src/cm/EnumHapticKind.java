/**
 */
package cm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Haptic Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cm.CmPackage#getEnumHapticKind()
 * @model
 * @generated
 */
public enum EnumHapticKind implements Enumerator {
	/**
	 * The '<em><b>Plateau</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATEAU_VALUE
	 * @generated
	 * @ordered
	 */
	PLATEAU(0, "Plateau", "Plateau"),

	/**
	 * The '<em><b>Upward Slope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPWARD_SLOPE_VALUE
	 * @generated
	 * @ordered
	 */
	UPWARD_SLOPE(1, "UpwardSlope", "UpwardSlope"),

	/**
	 * The '<em><b>Downward Slope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNWARD_SLOPE_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNWARD_SLOPE(2, "DownwardSlope", "DownwardSlope"),

	/**
	 * The '<em><b>Hill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILL_VALUE
	 * @generated
	 * @ordered
	 */
	HILL(3, "Hill", "Hill"),

	/**
	 * The '<em><b>Composite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITE(4, "Composite", "Composite");

	/**
	 * The '<em><b>Plateau</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLATEAU
	 * @model name="Plateau"
	 * @generated
	 * @ordered
	 */
	public static final int PLATEAU_VALUE = 0;

	/**
	 * The '<em><b>Upward Slope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPWARD_SLOPE
	 * @model name="UpwardSlope"
	 * @generated
	 * @ordered
	 */
	public static final int UPWARD_SLOPE_VALUE = 1;

	/**
	 * The '<em><b>Downward Slope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNWARD_SLOPE
	 * @model name="DownwardSlope"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNWARD_SLOPE_VALUE = 2;

	/**
	 * The '<em><b>Hill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HILL
	 * @model name="Hill"
	 * @generated
	 * @ordered
	 */
	public static final int HILL_VALUE = 3;

	/**
	 * The '<em><b>Composite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE
	 * @model name="Composite"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Enum Haptic Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumHapticKind[] VALUES_ARRAY =
		new EnumHapticKind[] {
			PLATEAU,
			UPWARD_SLOPE,
			DOWNWARD_SLOPE,
			HILL,
			COMPOSITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Haptic Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumHapticKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Haptic Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumHapticKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumHapticKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Haptic Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumHapticKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumHapticKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Haptic Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumHapticKind get(int value) {
		switch (value) {
			case PLATEAU_VALUE: return PLATEAU;
			case UPWARD_SLOPE_VALUE: return UPWARD_SLOPE;
			case DOWNWARD_SLOPE_VALUE: return DOWNWARD_SLOPE;
			case HILL_VALUE: return HILL;
			case COMPOSITE_VALUE: return COMPOSITE;
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
	private EnumHapticKind(int value, String name, String literal) {
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
	
} //EnumHapticKind
