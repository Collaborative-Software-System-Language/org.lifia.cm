/**
 */
package cm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Haptic Role Effect</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cm.CmPackage#getHapticRoleEffect()
 * @model
 * @generated
 */
public enum HapticRoleEffect implements Enumerator {
	/**
	 * The '<em><b>Reinforcement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REINFORCEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REINFORCEMENT(0, "Reinforcement", "Reinforcement"),

	/**
	 * The '<em><b>Complementary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENTARY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEMENTARY(1, "Complementary", "Complementary");

	/**
	 * The '<em><b>Reinforcement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REINFORCEMENT
	 * @model name="Reinforcement"
	 * @generated
	 * @ordered
	 */
	public static final int REINFORCEMENT_VALUE = 0;

	/**
	 * The '<em><b>Complementary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENTARY
	 * @model name="Complementary"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENTARY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Haptic Role Effect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HapticRoleEffect[] VALUES_ARRAY =
		new HapticRoleEffect[] {
			REINFORCEMENT,
			COMPLEMENTARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Haptic Role Effect</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HapticRoleEffect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Haptic Role Effect</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HapticRoleEffect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HapticRoleEffect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Haptic Role Effect</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HapticRoleEffect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HapticRoleEffect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Haptic Role Effect</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HapticRoleEffect get(int value) {
		switch (value) {
			case REINFORCEMENT_VALUE: return REINFORCEMENT;
			case COMPLEMENTARY_VALUE: return COMPLEMENTARY;
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
	private HapticRoleEffect(int value, String name, String literal) {
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
	
} //HapticRoleEffect
