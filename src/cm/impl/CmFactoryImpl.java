/**
 */
package cm.impl;

import cm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmFactoryImpl extends EFactoryImpl implements CmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmFactory init() {
		try {
			CmFactory theCmFactory = (CmFactory)EPackage.Registry.INSTANCE.getEFactory(CmPackage.eNS_URI);
			if (theCmFactory != null) {
				return theCmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CmPackage.COLLABORATION_ROLE: return createCollaborationRole();
			case CmPackage.SHARED_OBJECT: return createSharedObject();
			case CmPackage.TOOL: return createTool();
			case CmPackage.COLLABORATIVE_ACTIVITY: return createCollaborativeActivity();
			case CmPackage.WORKSPACE: return createWorkspace();
			case CmPackage.LOCATION_RELATIONSHIP: return createLocationRelationship();
			case CmPackage.USE_RELATIONSHIP: return createUseRelationship();
			case CmPackage.PARTICIPATION_RELATIONSHIP: return createParticipationRelationship();
			case CmPackage.COLLABORATIVE_MODEL: return createCollaborativeModel();
			case CmPackage.BELONGS_RELATIONSHIP: return createBelongsRelationship();
			case CmPackage.SHARED_RELATIONSHIP: return createSharedRelationship();
			case CmPackage.ROLE_MAPPING: return createRoleMapping();
			case CmPackage.COLLABORATIVE_PROCESS: return createCollaborativeProcess();
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE: return createCollaborativeActivityNode();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE: return createCollaborativeActivityState();
			case CmPackage.AWARENESS: return createAwareness();
			case CmPackage.AWARENESS_KIND: return createAwarenessKind();
			case CmPackage.COLLABORATIVE_PROCESS_EDGE: return createCollaborativeProcessEdge();
			case CmPackage.ROLE_ELEMENT_OPERATION: return createRoleElementOperation();
			case CmPackage.ELEMENT_OPERATION: return createElementOperation();
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION: return createCollaborativeProtocolTransition();
			case CmPackage.MODEL_LIST: return createModelList();
			case CmPackage.HAPTIC_INDICATOR: return createHapticIndicator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CmPackage.ENUM_ACTIVITY_KIND:
				return createEnumActivityKindFromString(eDataType, initialValue);
			case CmPackage.ENUM_GROUP_KIND:
				return createEnumGroupKindFromString(eDataType, initialValue);
			case CmPackage.ENUM_SUB_ACTIVITY_KIND:
				return createEnumSubActivityKindFromString(eDataType, initialValue);
			case CmPackage.AWARENESS_ELEMENT:
				return createAwarenessElementFromString(eDataType, initialValue);
			case CmPackage.ENUM_INTERACTION:
				return createEnumInteractionFromString(eDataType, initialValue);
			case CmPackage.ENUM_PLAYER_KIND:
				return createEnumPlayerKindFromString(eDataType, initialValue);
			case CmPackage.ENUM_HAPTIC_KIND:
				return createEnumHapticKindFromString(eDataType, initialValue);
			case CmPackage.ENUM_DISPLAY:
				return createEnumDisplayFromString(eDataType, initialValue);
			case CmPackage.HAPTIC_ROLE_EFFECT:
				return createHapticRoleEffectFromString(eDataType, initialValue);
			case CmPackage.HAPTIC_ROLE_PRIORITY:
				return createHapticRolePriorityFromString(eDataType, initialValue);
			case CmPackage.HAPTIC_ROLE_ORDER:
				return createHapticRoleOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CmPackage.ENUM_ACTIVITY_KIND:
				return convertEnumActivityKindToString(eDataType, instanceValue);
			case CmPackage.ENUM_GROUP_KIND:
				return convertEnumGroupKindToString(eDataType, instanceValue);
			case CmPackage.ENUM_SUB_ACTIVITY_KIND:
				return convertEnumSubActivityKindToString(eDataType, instanceValue);
			case CmPackage.AWARENESS_ELEMENT:
				return convertAwarenessElementToString(eDataType, instanceValue);
			case CmPackage.ENUM_INTERACTION:
				return convertEnumInteractionToString(eDataType, instanceValue);
			case CmPackage.ENUM_PLAYER_KIND:
				return convertEnumPlayerKindToString(eDataType, instanceValue);
			case CmPackage.ENUM_HAPTIC_KIND:
				return convertEnumHapticKindToString(eDataType, instanceValue);
			case CmPackage.ENUM_DISPLAY:
				return convertEnumDisplayToString(eDataType, instanceValue);
			case CmPackage.HAPTIC_ROLE_EFFECT:
				return convertHapticRoleEffectToString(eDataType, instanceValue);
			case CmPackage.HAPTIC_ROLE_PRIORITY:
				return convertHapticRolePriorityToString(eDataType, instanceValue);
			case CmPackage.HAPTIC_ROLE_ORDER:
				return convertHapticRoleOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborationRole createCollaborationRole() {
		CollaborationRoleImpl collaborationRole = new CollaborationRoleImpl();
		return collaborationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SharedObject createSharedObject() {
		SharedObjectImpl sharedObject = new SharedObjectImpl();
		return sharedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeActivity createCollaborativeActivity() {
		CollaborativeActivityImpl collaborativeActivity = new CollaborativeActivityImpl();
		return collaborativeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationRelationship createLocationRelationship() {
		LocationRelationshipImpl locationRelationship = new LocationRelationshipImpl();
		return locationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseRelationship createUseRelationship() {
		UseRelationshipImpl useRelationship = new UseRelationshipImpl();
		return useRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipationRelationship createParticipationRelationship() {
		ParticipationRelationshipImpl participationRelationship = new ParticipationRelationshipImpl();
		return participationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeModel createCollaborativeModel() {
		CollaborativeModelImpl collaborativeModel = new CollaborativeModelImpl();
		return collaborativeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BelongsRelationship createBelongsRelationship() {
		BelongsRelationshipImpl belongsRelationship = new BelongsRelationshipImpl();
		return belongsRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SharedRelationship createSharedRelationship() {
		SharedRelationshipImpl sharedRelationship = new SharedRelationshipImpl();
		return sharedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleMapping createRoleMapping() {
		RoleMappingImpl roleMapping = new RoleMappingImpl();
		return roleMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeProcess createCollaborativeProcess() {
		CollaborativeProcessImpl collaborativeProcess = new CollaborativeProcessImpl();
		return collaborativeProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeActivityNode createCollaborativeActivityNode() {
		CollaborativeActivityNodeImpl collaborativeActivityNode = new CollaborativeActivityNodeImpl();
		return collaborativeActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeActivityState createCollaborativeActivityState() {
		CollaborativeActivityStateImpl collaborativeActivityState = new CollaborativeActivityStateImpl();
		return collaborativeActivityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Awareness createAwareness() {
		AwarenessImpl awareness = new AwarenessImpl();
		return awareness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwarenessKind createAwarenessKind() {
		AwarenessKindImpl awarenessKind = new AwarenessKindImpl();
		return awarenessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeProcessEdge createCollaborativeProcessEdge() {
		CollaborativeProcessEdgeImpl collaborativeProcessEdge = new CollaborativeProcessEdgeImpl();
		return collaborativeProcessEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleElementOperation createRoleElementOperation() {
		RoleElementOperationImpl roleElementOperation = new RoleElementOperationImpl();
		return roleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementOperation createElementOperation() {
		ElementOperationImpl elementOperation = new ElementOperationImpl();
		return elementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeProtocolTransition createCollaborativeProtocolTransition() {
		CollaborativeProtocolTransitionImpl collaborativeProtocolTransition = new CollaborativeProtocolTransitionImpl();
		return collaborativeProtocolTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelList createModelList() {
		ModelListImpl modelList = new ModelListImpl();
		return modelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HapticIndicator createHapticIndicator() {
		HapticIndicatorImpl hapticIndicator = new HapticIndicatorImpl();
		return hapticIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumActivityKind createEnumActivityKindFromString(EDataType eDataType, String initialValue) {
		EnumActivityKind result = EnumActivityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumActivityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumGroupKind createEnumGroupKindFromString(EDataType eDataType, String initialValue) {
		EnumGroupKind result = EnumGroupKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumGroupKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSubActivityKind createEnumSubActivityKindFromString(EDataType eDataType, String initialValue) {
		EnumSubActivityKind result = EnumSubActivityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumSubActivityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwarenessElement createAwarenessElementFromString(EDataType eDataType, String initialValue) {
		AwarenessElement result = AwarenessElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAwarenessElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumInteraction createEnumInteractionFromString(EDataType eDataType, String initialValue) {
		EnumInteraction result = EnumInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPlayerKind createEnumPlayerKindFromString(EDataType eDataType, String initialValue) {
		EnumPlayerKind result = EnumPlayerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumPlayerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumHapticKind createEnumHapticKindFromString(EDataType eDataType, String initialValue) {
		EnumHapticKind result = EnumHapticKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumHapticKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDisplay createEnumDisplayFromString(EDataType eDataType, String initialValue) {
		EnumDisplay result = EnumDisplay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDisplayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HapticRoleEffect createHapticRoleEffectFromString(EDataType eDataType, String initialValue) {
		HapticRoleEffect result = HapticRoleEffect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHapticRoleEffectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HapticRolePriority createHapticRolePriorityFromString(EDataType eDataType, String initialValue) {
		HapticRolePriority result = HapticRolePriority.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHapticRolePriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HapticRoleOrder createHapticRoleOrderFromString(EDataType eDataType, String initialValue) {
		HapticRoleOrder result = HapticRoleOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHapticRoleOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmPackage getCmPackage() {
		return (CmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmPackage getPackage() {
		return CmPackage.eINSTANCE;
	}

} //CmFactoryImpl
