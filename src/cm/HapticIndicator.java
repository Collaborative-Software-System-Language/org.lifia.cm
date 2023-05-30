/**
 */
package cm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Haptic Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.HapticIndicator#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.HapticIndicator#getDuration <em>Duration</em>}</li>
 *   <li>{@link cm.HapticIndicator#getPeriod <em>Period</em>}</li>
 *   <li>{@link cm.HapticIndicator#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link cm.HapticIndicator#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getHapticIndicator()
 * @model
 * @generated
 */
public interface HapticIndicator extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumHapticKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumHapticKind
	 * @see #setKind(EnumHapticKind)
	 * @see cm.CmPackage#getHapticIndicator_Kind()
	 * @model
	 * @generated
	 */
	EnumHapticKind getKind();

	/**
	 * Sets the value of the '{@link cm.HapticIndicator#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumHapticKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EnumHapticKind value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see cm.CmPackage#getHapticIndicator_Duration()
	 * @model dataType="org.eclipse.uml2.types.Integer"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link cm.HapticIndicator#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see cm.CmPackage#getHapticIndicator_Period()
	 * @model dataType="org.eclipse.uml2.types.Integer"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link cm.HapticIndicator#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude</em>' attribute.
	 * @see #setAmplitude(int)
	 * @see cm.CmPackage#getHapticIndicator_Amplitude()
	 * @model dataType="org.eclipse.uml2.types.Integer"
	 * @generated
	 */
	int getAmplitude();

	/**
	 * Sets the value of the '{@link cm.HapticIndicator#getAmplitude <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude</em>' attribute.
	 * @see #getAmplitude()
	 * @generated
	 */
	void setAmplitude(int value);

	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' attribute.
	 * @see #setRepetitions(int)
	 * @see cm.CmPackage#getHapticIndicator_Repetitions()
	 * @model dataType="org.eclipse.uml2.types.Integer"
	 * @generated
	 */
	int getRepetitions();

	/**
	 * Sets the value of the '{@link cm.HapticIndicator#getRepetitions <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' attribute.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(int value);

} // HapticIndicator
