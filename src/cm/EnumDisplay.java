/**
 */
package cm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Display</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cm.CmPackage#getEnumDisplay()
 * @model
 * @generated
 */
public enum EnumDisplay implements Enumerator {
	/**
	 * The '<em><b>Visual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VISUAL(0, "visual", "visual"),

	/**
	 * The '<em><b>Haptic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAPTIC_VALUE
	 * @generated
	 * @ordered
	 */
	HAPTIC(1, "haptic", "haptic"),

	/**
	 * The '<em><b>Audio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIO(2, "audio", "audio");

	/**
	 * The '<em><b>Visual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISUAL
	 * @model name="visual"
	 * @generated
	 * @ordered
	 */
	public static final int VISUAL_VALUE = 0;

	/**
	 * The '<em><b>Haptic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAPTIC
	 * @model name="haptic"
	 * @generated
	 * @ordered
	 */
	public static final int HAPTIC_VALUE = 1;

	/**
	 * The '<em><b>Audio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIO
	 * @model name="audio"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Enum Display</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDisplay[] VALUES_ARRAY =
		new EnumDisplay[] {
			VISUAL,
			HAPTIC,
			AUDIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Display</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumDisplay> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Display</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDisplay get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDisplay result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Display</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDisplay getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDisplay result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Display</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDisplay get(int value) {
		switch (value) {
			case VISUAL_VALUE: return VISUAL;
			case HAPTIC_VALUE: return HAPTIC;
			case AUDIO_VALUE: return AUDIO;
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
	private EnumDisplay(int value, String name, String literal) {
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
	
} //EnumDisplay
