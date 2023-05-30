/**
 */
package cm.impl;

import cm.CmPackage;
import cm.EnumHapticKind;
import cm.HapticIndicator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Haptic Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.HapticIndicatorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.impl.HapticIndicatorImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link cm.impl.HapticIndicatorImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link cm.impl.HapticIndicatorImpl#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link cm.impl.HapticIndicatorImpl#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HapticIndicatorImpl extends ClassImpl implements HapticIndicator {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EnumHapticKind KIND_EDEFAULT = EnumHapticKind.PLATEAU;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EnumHapticKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmplitude() <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitude()
	 * @generated
	 * @ordered
	 */
	protected static final int AMPLITUDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmplitude() <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitude()
	 * @generated
	 * @ordered
	 */
	protected int amplitude = AMPLITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int REPETITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepetitions() <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitions()
	 * @generated
	 * @ordered
	 */
	protected int repetitions = REPETITIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HapticIndicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.HAPTIC_INDICATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumHapticKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(EnumHapticKind newKind) {
		EnumHapticKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.HAPTIC_INDICATOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.HAPTIC_INDICATOR__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.HAPTIC_INDICATOR__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmplitude() {
		return amplitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmplitude(int newAmplitude) {
		int oldAmplitude = amplitude;
		amplitude = newAmplitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.HAPTIC_INDICATOR__AMPLITUDE, oldAmplitude, amplitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRepetitions() {
		return repetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepetitions(int newRepetitions) {
		int oldRepetitions = repetitions;
		repetitions = newRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.HAPTIC_INDICATOR__REPETITIONS, oldRepetitions, repetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.HAPTIC_INDICATOR__KIND:
				return getKind();
			case CmPackage.HAPTIC_INDICATOR__DURATION:
				return getDuration();
			case CmPackage.HAPTIC_INDICATOR__PERIOD:
				return getPeriod();
			case CmPackage.HAPTIC_INDICATOR__AMPLITUDE:
				return getAmplitude();
			case CmPackage.HAPTIC_INDICATOR__REPETITIONS:
				return getRepetitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CmPackage.HAPTIC_INDICATOR__KIND:
				setKind((EnumHapticKind)newValue);
				return;
			case CmPackage.HAPTIC_INDICATOR__DURATION:
				setDuration((Integer)newValue);
				return;
			case CmPackage.HAPTIC_INDICATOR__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case CmPackage.HAPTIC_INDICATOR__AMPLITUDE:
				setAmplitude((Integer)newValue);
				return;
			case CmPackage.HAPTIC_INDICATOR__REPETITIONS:
				setRepetitions((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CmPackage.HAPTIC_INDICATOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CmPackage.HAPTIC_INDICATOR__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CmPackage.HAPTIC_INDICATOR__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case CmPackage.HAPTIC_INDICATOR__AMPLITUDE:
				setAmplitude(AMPLITUDE_EDEFAULT);
				return;
			case CmPackage.HAPTIC_INDICATOR__REPETITIONS:
				setRepetitions(REPETITIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CmPackage.HAPTIC_INDICATOR__KIND:
				return kind != KIND_EDEFAULT;
			case CmPackage.HAPTIC_INDICATOR__DURATION:
				return duration != DURATION_EDEFAULT;
			case CmPackage.HAPTIC_INDICATOR__PERIOD:
				return period != PERIOD_EDEFAULT;
			case CmPackage.HAPTIC_INDICATOR__AMPLITUDE:
				return amplitude != AMPLITUDE_EDEFAULT;
			case CmPackage.HAPTIC_INDICATOR__REPETITIONS:
				return repetitions != REPETITIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", duration: ");
		result.append(duration);
		result.append(", period: ");
		result.append(period);
		result.append(", amplitude: ");
		result.append(amplitude);
		result.append(", repetitions: ");
		result.append(repetitions);
		result.append(')');
		return result.toString();
	}

} //HapticIndicatorImpl
