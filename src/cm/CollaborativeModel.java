/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Vamos a poner algo acá
 * 
 * saludos
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeModel#getAwarenessKind <em>Awareness Kind</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getAwarenessInfo <em>Awareness Info</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumSubActivityValues <em>Enum Sub Activity Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getMembersKindValues <em>Members Kind Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumActivityKindValues <em>Enum Activity Kind Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumInteractionValues <em>Enum Interaction Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumPlayerKindValues <em>Enum Player Kind Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumHapticEffectValues <em>Enum Haptic Effect Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumHapticPriorityValues <em>Enum Haptic Priority Values</em>}</li>
 *   <li>{@link cm.CollaborativeModel#getEnumHapticOrderValues <em>Enum Haptic Order Values</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeModel()
 * @model
 * @generated
 */
public interface CollaborativeModel extends Model {
	/**
	 * Returns the value of the '<em><b>Awareness Kind</b></em>' containment reference list.
	 * The list contents are of type {@link cm.AwarenessKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awareness Kind</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeModel_AwarenessKind()
	 * @model containment="true"
	 * @generated
	 */
	EList<AwarenessKind> getAwarenessKind();

	/**
	 * Returns the value of the '<em><b>Awareness Info</b></em>' containment reference list.
	 * The list contents are of type {@link cm.Awareness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awareness Info</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeModel_AwarenessInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Awareness> getAwarenessInfo();

	/**
	 * Returns the value of the '<em><b>Enum Sub Activity Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.EnumSubActivityKind}.
	 * The literals are from the enumeration {@link cm.EnumSubActivityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Sub Activity Values</em>' attribute list.
	 * @see cm.EnumSubActivityKind
	 * @see cm.CmPackage#getCollaborativeModel_EnumSubActivityValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<EnumSubActivityKind> getEnumSubActivityValues();

	/**
	 * Returns the value of the '<em><b>Members Kind Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.EnumGroupKind}.
	 * The literals are from the enumeration {@link cm.EnumGroupKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members Kind Values</em>' attribute list.
	 * @see cm.EnumGroupKind
	 * @see cm.CmPackage#getCollaborativeModel_MembersKindValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<EnumGroupKind> getMembersKindValues();

	/**
	 * Returns the value of the '<em><b>Enum Activity Kind Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.EnumActivityKind}.
	 * The literals are from the enumeration {@link cm.EnumActivityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Activity Kind Values</em>' attribute list.
	 * @see cm.EnumActivityKind
	 * @see cm.CmPackage#getCollaborativeModel_EnumActivityKindValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<EnumActivityKind> getEnumActivityKindValues();

	/**
	 * Returns the value of the '<em><b>Enum Interaction Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.EnumInteraction}.
	 * The literals are from the enumeration {@link cm.EnumInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Interaction Values</em>' attribute list.
	 * @see cm.EnumInteraction
	 * @see cm.CmPackage#getCollaborativeModel_EnumInteractionValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<EnumInteraction> getEnumInteractionValues();

	/**
	 * Returns the value of the '<em><b>Enum Player Kind Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.EnumPlayerKind}.
	 * The literals are from the enumeration {@link cm.EnumPlayerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Player Kind Values</em>' attribute list.
	 * @see cm.EnumPlayerKind
	 * @see cm.CmPackage#getCollaborativeModel_EnumPlayerKindValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<EnumPlayerKind> getEnumPlayerKindValues();

	/**
	 * Returns the value of the '<em><b>Enum Haptic Effect Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.HapticRoleEffect}.
	 * The literals are from the enumeration {@link cm.HapticRoleEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Haptic Effect Values</em>' attribute list.
	 * @see cm.HapticRoleEffect
	 * @see cm.CmPackage#getCollaborativeModel_EnumHapticEffectValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<HapticRoleEffect> getEnumHapticEffectValues();

	/**
	 * Returns the value of the '<em><b>Enum Haptic Priority Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.HapticRolePriority}.
	 * The literals are from the enumeration {@link cm.HapticRolePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Haptic Priority Values</em>' attribute list.
	 * @see cm.HapticRolePriority
	 * @see cm.CmPackage#getCollaborativeModel_EnumHapticPriorityValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<HapticRolePriority> getEnumHapticPriorityValues();

	/**
	 * Returns the value of the '<em><b>Enum Haptic Order Values</b></em>' attribute list.
	 * The list contents are of type {@link cm.HapticRoleOrder}.
	 * The literals are from the enumeration {@link cm.HapticRoleOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Haptic Order Values</em>' attribute list.
	 * @see cm.HapticRoleOrder
	 * @see cm.CmPackage#getCollaborativeModel_EnumHapticOrderValues()
	 * @model derived="true"
	 * @generated
	 */
	EList<HapticRoleOrder> getEnumHapticOrderValues();

} // CollaborativeModel
