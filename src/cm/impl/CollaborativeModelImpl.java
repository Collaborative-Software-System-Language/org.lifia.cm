/**
 */
package cm.impl;

import cm.Awareness;
import cm.AwarenessKind;
import cm.CmPackage;
import cm.CollaborativeModel;
import cm.EnumActivityKind;
import cm.EnumGroupKind;
import cm.EnumInteraction;
import cm.EnumPlayerKind;
import cm.EnumSubActivityKind;
import cm.HapticRoleEffect;
import cm.HapticRoleOrder;
import cm.HapticRolePriority;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getAwarenessKind <em>Awareness Kind</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getAwarenessInfo <em>Awareness Info</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumSubActivityValues <em>Enum Sub Activity Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getMembersKindValues <em>Members Kind Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumActivityKindValues <em>Enum Activity Kind Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumInteractionValues <em>Enum Interaction Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumPlayerKindValues <em>Enum Player Kind Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumHapticEffectValues <em>Enum Haptic Effect Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumHapticPriorityValues <em>Enum Haptic Priority Values</em>}</li>
 *   <li>{@link cm.impl.CollaborativeModelImpl#getEnumHapticOrderValues <em>Enum Haptic Order Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeModelImpl extends ModelImpl implements CollaborativeModel {
	/**
	 * The cached value of the '{@link #getAwarenessKind() <em>Awareness Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwarenessKind()
	 * @generated
	 * @ordered
	 */
	protected EList<AwarenessKind> awarenessKind;

	/**
	 * The cached value of the '{@link #getAwarenessInfo() <em>Awareness Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwarenessInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<Awareness> awarenessInfo;

	/**
	 * The cached value of the '{@link #getEnumSubActivityValues() <em>Enum Sub Activity Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumSubActivityValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumSubActivityKind> enumSubActivityValues;

	/**
	 * The cached value of the '{@link #getMembersKindValues() <em>Members Kind Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembersKindValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumGroupKind> membersKindValues;

	/**
	 * The cached value of the '{@link #getEnumActivityKindValues() <em>Enum Activity Kind Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumActivityKindValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumActivityKind> enumActivityKindValues;

	/**
	 * The cached value of the '{@link #getEnumInteractionValues() <em>Enum Interaction Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumInteractionValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumInteraction> enumInteractionValues;

	/**
	 * The cached value of the '{@link #getEnumPlayerKindValues() <em>Enum Player Kind Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumPlayerKindValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumPlayerKind> enumPlayerKindValues;

	/**
	 * The cached value of the '{@link #getEnumHapticEffectValues() <em>Enum Haptic Effect Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumHapticEffectValues()
	 * @generated
	 * @ordered
	 */
	protected EList<HapticRoleEffect> enumHapticEffectValues;

	/**
	 * The cached value of the '{@link #getEnumHapticPriorityValues() <em>Enum Haptic Priority Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumHapticPriorityValues()
	 * @generated
	 * @ordered
	 */
	protected EList<HapticRolePriority> enumHapticPriorityValues;

	/**
	 * The cached value of the '{@link #getEnumHapticOrderValues() <em>Enum Haptic Order Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumHapticOrderValues()
	 * @generated
	 * @ordered
	 */
	protected EList<HapticRoleOrder> enumHapticOrderValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwarenessKind> getAwarenessKind() {
		if (awarenessKind == null) {
			awarenessKind = new EObjectContainmentEList<AwarenessKind>(AwarenessKind.class, this, CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND);
		}
		return awarenessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Awareness> getAwarenessInfo() {
		if (awarenessInfo == null) {
			awarenessInfo = new EObjectContainmentEList<Awareness>(Awareness.class, this, CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO);
		}
		return awarenessInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumSubActivityKind> getEnumSubActivityValues() {
		if (enumSubActivityValues == null) {
			enumSubActivityValues = new EDataTypeUniqueEList<EnumSubActivityKind>(EnumSubActivityKind.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES);
		}
		return enumSubActivityValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumGroupKind> getMembersKindValues() {
		if (membersKindValues == null) {
			membersKindValues = new EDataTypeUniqueEList<EnumGroupKind>(EnumGroupKind.class, this, CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES);
		}
		return membersKindValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumActivityKind> getEnumActivityKindValues() {
		if (enumActivityKindValues == null) {
			enumActivityKindValues = new EDataTypeUniqueEList<EnumActivityKind>(EnumActivityKind.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES);
		}
		return enumActivityKindValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumInteraction> getEnumInteractionValues() {
		if (enumInteractionValues == null) {
			enumInteractionValues = new EDataTypeUniqueEList<EnumInteraction>(EnumInteraction.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES);
		}
		return enumInteractionValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumPlayerKind> getEnumPlayerKindValues() {
		if (enumPlayerKindValues == null) {
			enumPlayerKindValues = new EDataTypeUniqueEList<EnumPlayerKind>(EnumPlayerKind.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES);
		}
		return enumPlayerKindValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HapticRoleEffect> getEnumHapticEffectValues() {
		if (enumHapticEffectValues == null) {
			enumHapticEffectValues = new EDataTypeUniqueEList<HapticRoleEffect>(HapticRoleEffect.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES);
		}
		return enumHapticEffectValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HapticRolePriority> getEnumHapticPriorityValues() {
		if (enumHapticPriorityValues == null) {
			enumHapticPriorityValues = new EDataTypeUniqueEList<HapticRolePriority>(HapticRolePriority.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES);
		}
		return enumHapticPriorityValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HapticRoleOrder> getEnumHapticOrderValues() {
		if (enumHapticOrderValues == null) {
			enumHapticOrderValues = new EDataTypeUniqueEList<HapticRoleOrder>(HapticRoleOrder.class, this, CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES);
		}
		return enumHapticOrderValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
				return ((InternalEList<?>)getAwarenessKind()).basicRemove(otherEnd, msgs);
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				return ((InternalEList<?>)getAwarenessInfo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
				return getAwarenessKind();
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				return getAwarenessInfo();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES:
				return getEnumSubActivityValues();
			case CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES:
				return getMembersKindValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES:
				return getEnumActivityKindValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES:
				return getEnumInteractionValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES:
				return getEnumPlayerKindValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES:
				return getEnumHapticEffectValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES:
				return getEnumHapticPriorityValues();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES:
				return getEnumHapticOrderValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
				getAwarenessKind().clear();
				getAwarenessKind().addAll((Collection<? extends AwarenessKind>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				getAwarenessInfo().clear();
				getAwarenessInfo().addAll((Collection<? extends Awareness>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES:
				getEnumSubActivityValues().clear();
				getEnumSubActivityValues().addAll((Collection<? extends EnumSubActivityKind>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES:
				getMembersKindValues().clear();
				getMembersKindValues().addAll((Collection<? extends EnumGroupKind>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES:
				getEnumActivityKindValues().clear();
				getEnumActivityKindValues().addAll((Collection<? extends EnumActivityKind>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES:
				getEnumInteractionValues().clear();
				getEnumInteractionValues().addAll((Collection<? extends EnumInteraction>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES:
				getEnumPlayerKindValues().clear();
				getEnumPlayerKindValues().addAll((Collection<? extends EnumPlayerKind>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES:
				getEnumHapticEffectValues().clear();
				getEnumHapticEffectValues().addAll((Collection<? extends HapticRoleEffect>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES:
				getEnumHapticPriorityValues().clear();
				getEnumHapticPriorityValues().addAll((Collection<? extends HapticRolePriority>)newValue);
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES:
				getEnumHapticOrderValues().clear();
				getEnumHapticOrderValues().addAll((Collection<? extends HapticRoleOrder>)newValue);
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
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
				getAwarenessKind().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				getAwarenessInfo().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES:
				getEnumSubActivityValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES:
				getMembersKindValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES:
				getEnumActivityKindValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES:
				getEnumInteractionValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES:
				getEnumPlayerKindValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES:
				getEnumHapticEffectValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES:
				getEnumHapticPriorityValues().clear();
				return;
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES:
				getEnumHapticOrderValues().clear();
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
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
				return awarenessKind != null && !awarenessKind.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				return awarenessInfo != null && !awarenessInfo.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES:
				return enumSubActivityValues != null && !enumSubActivityValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES:
				return membersKindValues != null && !membersKindValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES:
				return enumActivityKindValues != null && !enumActivityKindValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES:
				return enumInteractionValues != null && !enumInteractionValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES:
				return enumPlayerKindValues != null && !enumPlayerKindValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES:
				return enumHapticEffectValues != null && !enumHapticEffectValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES:
				return enumHapticPriorityValues != null && !enumHapticPriorityValues.isEmpty();
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES:
				return enumHapticOrderValues != null && !enumHapticOrderValues.isEmpty();
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
		result.append(" (enumSubActivityValues: ");
		result.append(enumSubActivityValues);
		result.append(", membersKindValues: ");
		result.append(membersKindValues);
		result.append(", enumActivityKindValues: ");
		result.append(enumActivityKindValues);
		result.append(", enumInteractionValues: ");
		result.append(enumInteractionValues);
		result.append(", enumPlayerKindValues: ");
		result.append(enumPlayerKindValues);
		result.append(", enumHapticEffectValues: ");
		result.append(enumHapticEffectValues);
		result.append(", enumHapticPriorityValues: ");
		result.append(enumHapticPriorityValues);
		result.append(", enumHapticOrderValues: ");
		result.append(enumHapticOrderValues);
		result.append(')');
		return result.toString();
	}

} //CollaborativeModelImpl
