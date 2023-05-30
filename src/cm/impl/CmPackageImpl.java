/**
 */
package cm.impl;

import cm.Awareness;
import cm.AwarenessElement;
import cm.AwarenessKind;
import cm.BelongsRelationship;
import cm.CmFactory;
import cm.CmPackage;
import cm.CollaborationRole;
import cm.CollaborativeActivity;
import cm.CollaborativeActivityNode;
import cm.CollaborativeActivityState;
import cm.CollaborativeAssociation;
import cm.CollaborativeElement;
import cm.CollaborativeModel;
import cm.CollaborativeProcess;
import cm.CollaborativeProcessEdge;
import cm.CollaborativeProtocolTransition;
import cm.ElementOperation;
import cm.EnumActivityKind;
import cm.EnumDisplay;
import cm.EnumGroupKind;
import cm.EnumHapticKind;
import cm.EnumInteraction;
import cm.EnumPlayerKind;
import cm.EnumSubActivityKind;
import cm.HapticIndicator;
import cm.HapticRoleEffect;
import cm.HapticRoleOrder;
import cm.HapticRolePriority;
import cm.LocationRelationship;
import cm.ModelList;
import cm.ParticipationRelationship;
import cm.RoleElementOperation;
import cm.RoleMapping;
import cm.SessionRelationship;
import cm.SharedObject;
import cm.SharedRelationship;
import cm.Tool;
import cm.UseRelationship;
import cm.User;
import cm.Workspace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmPackageImpl extends EPackageImpl implements CmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass belongsRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeActivityStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awarenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awarenessKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeProcessEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleElementOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeProtocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hapticIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumActivityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGroupKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSubActivityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum awarenessElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPlayerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumHapticKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDisplayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hapticRoleEffectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hapticRolePriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hapticRoleOrderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cm.CmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmPackageImpl() {
		super(eNS_URI, CmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmPackage init() {
		if (isInited) return (CmPackage)EPackage.Registry.INSTANCE.getEPackage(CmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CmPackageImpl theCmPackage = registeredCmPackage instanceof CmPackageImpl ? (CmPackageImpl)registeredCmPackage : new CmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCmPackage.createPackageContents();

		// Initialize created meta-data
		theCmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmPackage.eNS_URI, theCmPackage);
		return theCmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeElement() {
		return collaborativeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeElement_Description() {
		return (EAttribute)collaborativeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeElement_Sincrono() {
		return (EAttribute)collaborativeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeElement_ElementOperation() {
		return (EReference)collaborativeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborationRole() {
		return collaborationRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborationRole_Qualification() {
		return (EAttribute)collaborationRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborationRole_User() {
		return (EReference)collaborationRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborationRole_AssignedRoleElementOperation() {
		return (EReference)collaborationRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_CollaborationRole() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSharedObject() {
		return sharedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSharedObject_Lockable() {
		return (EAttribute)sharedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSharedObject_Persistent() {
		return (EAttribute)sharedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeAssociation() {
		return collaborativeAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeAssociation_IsPermanent() {
		return (EAttribute)collaborativeAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeAssociation_LowerBound() {
		return (EAttribute)collaborativeAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeAssociation_UpperBound() {
		return (EAttribute)collaborativeAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Reference() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_URL() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Display() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeActivity() {
		return collaborativeActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivity_Protocol() {
		return (EReference)collaborativeActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeActivity_Purpose() {
		return (EAttribute)collaborativeActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivity_MyRoles() {
		return (EReference)collaborativeActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeActivity_IsPersonal() {
		return (EAttribute)collaborativeActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivity_Event() {
		return (EReference)collaborativeActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspace_Linked() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspace_Workspace() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspace_InnerWorkspace() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocationRelationship() {
		return locationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseRelationship() {
		return useRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipationRelationship() {
		return participationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeModel() {
		return collaborativeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeModel_AwarenessKind() {
		return (EReference)collaborativeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeModel_AwarenessInfo() {
		return (EReference)collaborativeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumSubActivityValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_MembersKindValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumActivityKindValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumInteractionValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumPlayerKindValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumHapticEffectValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumHapticPriorityValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeModel_EnumHapticOrderValues() {
		return (EAttribute)collaborativeModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSessionRelationship() {
		return sessionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBelongsRelationship() {
		return belongsRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSharedRelationship() {
		return sharedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleMapping() {
		return roleMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleMapping_Source() {
		return (EReference)roleMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleMapping_Target() {
		return (EReference)roleMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeProcess() {
		return collaborativeProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeProcess_Activity() {
		return (EReference)collaborativeProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeActivityNode() {
		return collaborativeActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityNode_CollaborativeActivity() {
		return (EReference)collaborativeActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityNode_MyEvent() {
		return (EReference)collaborativeActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeActivityNode_Kind() {
		return (EAttribute)collaborativeActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeActivityNode_GroupKind() {
		return (EAttribute)collaborativeActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeActivityState() {
		return collaborativeActivityStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityState_CollaborativeActivity() {
		return (EReference)collaborativeActivityStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityState_AssignedRoleElementOperation() {
		return (EReference)collaborativeActivityStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityState_OutgoingRoleElementOperation() {
		return (EReference)collaborativeActivityStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeActivityState_Kind() {
		return (EAttribute)collaborativeActivityStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeActivityState_MyEvent() {
		return (EReference)collaborativeActivityStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwareness() {
		return awarenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_Kind() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_Source() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_ShownIn() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Synchronous() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Transient() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Modal() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Interaction() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Player() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_HapticIndicator() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Priority() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Order() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Effect() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwarenessKind() {
		return awarenessKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwarenessKind_Elements() {
		return (EAttribute)awarenessKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeProcessEdge() {
		return collaborativeProcessEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeProcessEdge_RoleMapping() {
		return (EReference)collaborativeProcessEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeProcessEdge_RoleElementOperation() {
		return (EReference)collaborativeProcessEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleElementOperation() {
		return roleElementOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleElementOperation_ElementOperation() {
		return (EReference)roleElementOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleElementOperation_CallEvent() {
		return (EReference)roleElementOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRoleElementOperation__GetName() {
		return roleElementOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementOperation() {
		return elementOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementOperation_Operation() {
		return (EReference)elementOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElementOperation__GetName() {
		return elementOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeProtocolTransition() {
		return collaborativeProtocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollaborativeProtocolTransition_RoleElementOperation() {
		return (EReference)collaborativeProtocolTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelList() {
		return modelListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelList_CollaborativeModelList() {
		return (EReference)modelListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHapticIndicator() {
		return hapticIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHapticIndicator_Kind() {
		return (EAttribute)hapticIndicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHapticIndicator_Duration() {
		return (EAttribute)hapticIndicatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHapticIndicator_Period() {
		return (EAttribute)hapticIndicatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHapticIndicator_Amplitude() {
		return (EAttribute)hapticIndicatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHapticIndicator_Repetitions() {
		return (EAttribute)hapticIndicatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumActivityKind() {
		return enumActivityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumGroupKind() {
		return enumGroupKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumSubActivityKind() {
		return enumSubActivityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAwarenessElement() {
		return awarenessElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumInteraction() {
		return enumInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumPlayerKind() {
		return enumPlayerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumHapticKind() {
		return enumHapticKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumDisplay() {
		return enumDisplayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHapticRoleEffect() {
		return hapticRoleEffectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHapticRolePriority() {
		return hapticRolePriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHapticRoleOrder() {
		return hapticRoleOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmFactory getCmFactory() {
		return (CmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collaborativeElementEClass = createEClass(COLLABORATIVE_ELEMENT);
		createEAttribute(collaborativeElementEClass, COLLABORATIVE_ELEMENT__DESCRIPTION);
		createEAttribute(collaborativeElementEClass, COLLABORATIVE_ELEMENT__SINCRONO);
		createEReference(collaborativeElementEClass, COLLABORATIVE_ELEMENT__ELEMENT_OPERATION);

		collaborationRoleEClass = createEClass(COLLABORATION_ROLE);
		createEAttribute(collaborationRoleEClass, COLLABORATION_ROLE__QUALIFICATION);
		createEReference(collaborationRoleEClass, COLLABORATION_ROLE__USER);
		createEReference(collaborationRoleEClass, COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__COLLABORATION_ROLE);

		sharedObjectEClass = createEClass(SHARED_OBJECT);
		createEAttribute(sharedObjectEClass, SHARED_OBJECT__LOCKABLE);
		createEAttribute(sharedObjectEClass, SHARED_OBJECT__PERSISTENT);

		collaborativeAssociationEClass = createEClass(COLLABORATIVE_ASSOCIATION);
		createEAttribute(collaborativeAssociationEClass, COLLABORATIVE_ASSOCIATION__IS_PERMANENT);
		createEAttribute(collaborativeAssociationEClass, COLLABORATIVE_ASSOCIATION__LOWER_BOUND);
		createEAttribute(collaborativeAssociationEClass, COLLABORATIVE_ASSOCIATION__UPPER_BOUND);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__REFERENCE);
		createEAttribute(toolEClass, TOOL__URL);
		createEAttribute(toolEClass, TOOL__DISPLAY);

		collaborativeActivityEClass = createEClass(COLLABORATIVE_ACTIVITY);
		createEReference(collaborativeActivityEClass, COLLABORATIVE_ACTIVITY__PROTOCOL);
		createEAttribute(collaborativeActivityEClass, COLLABORATIVE_ACTIVITY__PURPOSE);
		createEReference(collaborativeActivityEClass, COLLABORATIVE_ACTIVITY__MY_ROLES);
		createEAttribute(collaborativeActivityEClass, COLLABORATIVE_ACTIVITY__IS_PERSONAL);
		createEReference(collaborativeActivityEClass, COLLABORATIVE_ACTIVITY__EVENT);

		workspaceEClass = createEClass(WORKSPACE);
		createEReference(workspaceEClass, WORKSPACE__LINKED);
		createEReference(workspaceEClass, WORKSPACE__WORKSPACE);
		createEReference(workspaceEClass, WORKSPACE__INNER_WORKSPACE);

		locationRelationshipEClass = createEClass(LOCATION_RELATIONSHIP);

		useRelationshipEClass = createEClass(USE_RELATIONSHIP);

		participationRelationshipEClass = createEClass(PARTICIPATION_RELATIONSHIP);

		collaborativeModelEClass = createEClass(COLLABORATIVE_MODEL);
		createEReference(collaborativeModelEClass, COLLABORATIVE_MODEL__AWARENESS_KIND);
		createEReference(collaborativeModelEClass, COLLABORATIVE_MODEL__AWARENESS_INFO);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES);
		createEAttribute(collaborativeModelEClass, COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES);

		sessionRelationshipEClass = createEClass(SESSION_RELATIONSHIP);

		belongsRelationshipEClass = createEClass(BELONGS_RELATIONSHIP);

		sharedRelationshipEClass = createEClass(SHARED_RELATIONSHIP);

		roleMappingEClass = createEClass(ROLE_MAPPING);
		createEReference(roleMappingEClass, ROLE_MAPPING__SOURCE);
		createEReference(roleMappingEClass, ROLE_MAPPING__TARGET);

		collaborativeProcessEClass = createEClass(COLLABORATIVE_PROCESS);
		createEReference(collaborativeProcessEClass, COLLABORATIVE_PROCESS__ACTIVITY);

		collaborativeActivityNodeEClass = createEClass(COLLABORATIVE_ACTIVITY_NODE);
		createEReference(collaborativeActivityNodeEClass, COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY);
		createEReference(collaborativeActivityNodeEClass, COLLABORATIVE_ACTIVITY_NODE__MY_EVENT);
		createEAttribute(collaborativeActivityNodeEClass, COLLABORATIVE_ACTIVITY_NODE__KIND);
		createEAttribute(collaborativeActivityNodeEClass, COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND);

		collaborativeActivityStateEClass = createEClass(COLLABORATIVE_ACTIVITY_STATE);
		createEReference(collaborativeActivityStateEClass, COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY);
		createEReference(collaborativeActivityStateEClass, COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION);
		createEReference(collaborativeActivityStateEClass, COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION);
		createEAttribute(collaborativeActivityStateEClass, COLLABORATIVE_ACTIVITY_STATE__KIND);
		createEReference(collaborativeActivityStateEClass, COLLABORATIVE_ACTIVITY_STATE__MY_EVENT);

		awarenessEClass = createEClass(AWARENESS);
		createEReference(awarenessEClass, AWARENESS__KIND);
		createEReference(awarenessEClass, AWARENESS__SOURCE);
		createEReference(awarenessEClass, AWARENESS__SHOWN_IN);
		createEAttribute(awarenessEClass, AWARENESS__SYNCHRONOUS);
		createEAttribute(awarenessEClass, AWARENESS__TRANSIENT);
		createEAttribute(awarenessEClass, AWARENESS__MODAL);
		createEAttribute(awarenessEClass, AWARENESS__INTERACTION);
		createEAttribute(awarenessEClass, AWARENESS__PLAYER);
		createEReference(awarenessEClass, AWARENESS__HAPTIC_INDICATOR);
		createEAttribute(awarenessEClass, AWARENESS__PRIORITY);
		createEAttribute(awarenessEClass, AWARENESS__ORDER);
		createEAttribute(awarenessEClass, AWARENESS__EFFECT);

		awarenessKindEClass = createEClass(AWARENESS_KIND);
		createEAttribute(awarenessKindEClass, AWARENESS_KIND__ELEMENTS);

		collaborativeProcessEdgeEClass = createEClass(COLLABORATIVE_PROCESS_EDGE);
		createEReference(collaborativeProcessEdgeEClass, COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING);
		createEReference(collaborativeProcessEdgeEClass, COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION);

		roleElementOperationEClass = createEClass(ROLE_ELEMENT_OPERATION);
		createEReference(roleElementOperationEClass, ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION);
		createEReference(roleElementOperationEClass, ROLE_ELEMENT_OPERATION__CALL_EVENT);
		createEOperation(roleElementOperationEClass, ROLE_ELEMENT_OPERATION___GET_NAME);

		elementOperationEClass = createEClass(ELEMENT_OPERATION);
		createEReference(elementOperationEClass, ELEMENT_OPERATION__OPERATION);
		createEOperation(elementOperationEClass, ELEMENT_OPERATION___GET_NAME);

		collaborativeProtocolTransitionEClass = createEClass(COLLABORATIVE_PROTOCOL_TRANSITION);
		createEReference(collaborativeProtocolTransitionEClass, COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION);

		modelListEClass = createEClass(MODEL_LIST);
		createEReference(modelListEClass, MODEL_LIST__COLLABORATIVE_MODEL_LIST);

		hapticIndicatorEClass = createEClass(HAPTIC_INDICATOR);
		createEAttribute(hapticIndicatorEClass, HAPTIC_INDICATOR__KIND);
		createEAttribute(hapticIndicatorEClass, HAPTIC_INDICATOR__DURATION);
		createEAttribute(hapticIndicatorEClass, HAPTIC_INDICATOR__PERIOD);
		createEAttribute(hapticIndicatorEClass, HAPTIC_INDICATOR__AMPLITUDE);
		createEAttribute(hapticIndicatorEClass, HAPTIC_INDICATOR__REPETITIONS);

		// Create enums
		enumActivityKindEEnum = createEEnum(ENUM_ACTIVITY_KIND);
		enumGroupKindEEnum = createEEnum(ENUM_GROUP_KIND);
		enumSubActivityKindEEnum = createEEnum(ENUM_SUB_ACTIVITY_KIND);
		awarenessElementEEnum = createEEnum(AWARENESS_ELEMENT);
		enumInteractionEEnum = createEEnum(ENUM_INTERACTION);
		enumPlayerKindEEnum = createEEnum(ENUM_PLAYER_KIND);
		enumHapticKindEEnum = createEEnum(ENUM_HAPTIC_KIND);
		enumDisplayEEnum = createEEnum(ENUM_DISPLAY);
		hapticRoleEffectEEnum = createEEnum(HAPTIC_ROLE_EFFECT);
		hapticRolePriorityEEnum = createEEnum(HAPTIC_ROLE_PRIORITY);
		hapticRoleOrderEEnum = createEEnum(HAPTIC_ROLE_ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collaborativeElementEClass.getESuperTypes().add(theUMLPackage.getClass_());
		collaborationRoleEClass.getESuperTypes().add(theUMLPackage.getClass_());
		userEClass.getESuperTypes().add(theUMLPackage.getClass_());
		sharedObjectEClass.getESuperTypes().add(this.getCollaborativeElement());
		collaborativeAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		toolEClass.getESuperTypes().add(this.getCollaborativeElement());
		collaborativeActivityEClass.getESuperTypes().add(this.getCollaborativeElement());
		workspaceEClass.getESuperTypes().add(this.getCollaborativeElement());
		locationRelationshipEClass.getESuperTypes().add(this.getCollaborativeAssociation());
		useRelationshipEClass.getESuperTypes().add(this.getCollaborativeAssociation());
		participationRelationshipEClass.getESuperTypes().add(this.getCollaborativeAssociation());
		collaborativeModelEClass.getESuperTypes().add(theUMLPackage.getModel());
		sessionRelationshipEClass.getESuperTypes().add(this.getCollaborativeAssociation());
		belongsRelationshipEClass.getESuperTypes().add(this.getSessionRelationship());
		sharedRelationshipEClass.getESuperTypes().add(this.getSessionRelationship());
		roleMappingEClass.getESuperTypes().add(theUMLPackage.getClass_());
		collaborativeProcessEClass.getESuperTypes().add(theUMLPackage.getActivity());
		collaborativeActivityNodeEClass.getESuperTypes().add(theUMLPackage.getActivityNode());
		collaborativeActivityStateEClass.getESuperTypes().add(theUMLPackage.getVertex());
		awarenessEClass.getESuperTypes().add(theUMLPackage.getClass_());
		awarenessKindEClass.getESuperTypes().add(theUMLPackage.getClass_());
		collaborativeProcessEdgeEClass.getESuperTypes().add(theUMLPackage.getActivityEdge());
		roleElementOperationEClass.getESuperTypes().add(theUMLPackage.getClass_());
		elementOperationEClass.getESuperTypes().add(theUMLPackage.getClass_());
		collaborativeProtocolTransitionEClass.getESuperTypes().add(theUMLPackage.getProtocolTransition());
		hapticIndicatorEClass.getESuperTypes().add(theUMLPackage.getClass_());

		// Initialize classes, features, and operations; add parameters
		initEClass(collaborativeElementEClass, CollaborativeElement.class, "CollaborativeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaborativeElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CollaborativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeElement_Sincrono(), theEcorePackage.getEBoolean(), "sincrono", "true", 0, 1, CollaborativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeElement_ElementOperation(), this.getElementOperation(), null, "elementOperation", null, 0, -1, CollaborativeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationRoleEClass, CollaborationRole.class, "CollaborationRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaborationRole_Qualification(), ecorePackage.getEString(), "qualification", null, 0, 1, CollaborationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationRole_User(), this.getUser(), this.getUser_CollaborationRole(), "user", null, 0, 1, CollaborationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationRole_AssignedRoleElementOperation(), this.getRoleElementOperation(), null, "assignedRoleElementOperation", null, 0, -1, CollaborationRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_CollaborationRole(), this.getCollaborationRole(), this.getCollaborationRole_User(), "collaborationRole", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedObjectEClass, SharedObject.class, "SharedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedObject_Lockable(), ecorePackage.getEBoolean(), "lockable", "false", 0, 1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedObject_Persistent(), ecorePackage.getEBoolean(), "persistent", "false", 0, 1, SharedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeAssociationEClass, CollaborativeAssociation.class, "CollaborativeAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaborativeAssociation_IsPermanent(), ecorePackage.getEBoolean(), "isPermanent", "false", 0, 1, CollaborativeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeAssociation_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 0, 1, CollaborativeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeAssociation_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, CollaborativeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_URL(), theEcorePackage.getEString(), "URL", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Display(), this.getEnumDisplay(), "display", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeActivityEClass, CollaborativeActivity.class, "CollaborativeActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeActivity_Protocol(), theUMLPackage.getStateMachine(), null, "protocol", null, 0, 1, CollaborativeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeActivity_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, CollaborativeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivity_MyRoles(), this.getCollaborationRole(), null, "myRoles", null, 0, -1, CollaborativeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeActivity_IsPersonal(), theTypesPackage.getBoolean(), "isPersonal", null, 0, 1, CollaborativeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivity_Event(), theUMLPackage.getEvent(), null, "event", null, 0, -1, CollaborativeActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkspace_Linked(), this.getWorkspace(), null, "linked", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_Workspace(), this.getWorkspace(), this.getWorkspace_InnerWorkspace(), "workspace", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_InnerWorkspace(), this.getWorkspace(), this.getWorkspace_Workspace(), "innerWorkspace", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationRelationshipEClass, LocationRelationship.class, "LocationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(useRelationshipEClass, UseRelationship.class, "UseRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(participationRelationshipEClass, ParticipationRelationship.class, "ParticipationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborativeModelEClass, CollaborativeModel.class, "CollaborativeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeModel_AwarenessKind(), this.getAwarenessKind(), null, "awarenessKind", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeModel_AwarenessInfo(), this.getAwareness(), null, "awarenessInfo", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumSubActivityValues(), this.getEnumSubActivityKind(), "enumSubActivityValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_MembersKindValues(), this.getEnumGroupKind(), "membersKindValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumActivityKindValues(), this.getEnumActivityKind(), "enumActivityKindValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumInteractionValues(), this.getEnumInteraction(), "enumInteractionValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumPlayerKindValues(), this.getEnumPlayerKind(), "enumPlayerKindValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumHapticEffectValues(), this.getHapticRoleEffect(), "enumHapticEffectValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumHapticPriorityValues(), this.getHapticRolePriority(), "enumHapticPriorityValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeModel_EnumHapticOrderValues(), this.getHapticRoleOrder(), "enumHapticOrderValues", null, 0, -1, CollaborativeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sessionRelationshipEClass, SessionRelationship.class, "SessionRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(belongsRelationshipEClass, BelongsRelationship.class, "BelongsRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedRelationshipEClass, SharedRelationship.class, "SharedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleMappingEClass, RoleMapping.class, "RoleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleMapping_Source(), this.getCollaborationRole(), null, "source", null, 1, 1, RoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleMapping_Target(), this.getCollaborationRole(), null, "target", null, 1, 1, RoleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeProcessEClass, CollaborativeProcess.class, "CollaborativeProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeProcess_Activity(), theUMLPackage.getActivity(), null, "activity", null, 0, 1, CollaborativeProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeActivityNodeEClass, CollaborativeActivityNode.class, "CollaborativeActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeActivityNode_CollaborativeActivity(), this.getCollaborativeActivity(), null, "collaborativeActivity", null, 0, 1, CollaborativeActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivityNode_MyEvent(), theUMLPackage.getEvent(), null, "myEvent", null, 0, -1, CollaborativeActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeActivityNode_Kind(), this.getEnumActivityKind(), "kind", null, 0, 1, CollaborativeActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeActivityNode_GroupKind(), this.getEnumGroupKind(), "groupKind", null, 0, 1, CollaborativeActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeActivityStateEClass, CollaborativeActivityState.class, "CollaborativeActivityState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeActivityState_CollaborativeActivity(), this.getCollaborativeActivity(), null, "collaborativeActivity", null, 1, 1, CollaborativeActivityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivityState_AssignedRoleElementOperation(), this.getRoleElementOperation(), null, "assignedRoleElementOperation", null, 0, -1, CollaborativeActivityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivityState_OutgoingRoleElementOperation(), this.getRoleElementOperation(), null, "outgoingRoleElementOperation", null, 0, -1, CollaborativeActivityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeActivityState_Kind(), this.getEnumSubActivityKind(), "kind", "undefined", 0, 1, CollaborativeActivityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeActivityState_MyEvent(), theUMLPackage.getEvent(), null, "myEvent", null, 0, -1, CollaborativeActivityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awarenessEClass, Awareness.class, "Awareness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwareness_Kind(), this.getAwarenessKind(), null, "kind", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_Source(), theUMLPackage.getEvent(), null, "source", null, 0, -1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_ShownIn(), this.getCollaborativeElement(), null, "shownIn", null, 1, -1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Synchronous(), theEcorePackage.getEBoolean(), "synchronous", "true", 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Transient(), theEcorePackage.getEBoolean(), "transient", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Modal(), theEcorePackage.getEBoolean(), "modal", "false", 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Interaction(), this.getEnumInteraction(), "interaction", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Player(), this.getEnumPlayerKind(), "player", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_HapticIndicator(), this.getHapticIndicator(), null, "hapticIndicator", null, 0, -1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Priority(), this.getHapticRolePriority(), "priority", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Order(), this.getHapticRoleOrder(), "order", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwareness_Effect(), this.getHapticRoleEffect(), "effect", null, 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awarenessKindEClass, AwarenessKind.class, "AwarenessKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwarenessKind_Elements(), this.getAwarenessElement(), "elements", null, 0, -1, AwarenessKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeProcessEdgeEClass, CollaborativeProcessEdge.class, "CollaborativeProcessEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeProcessEdge_RoleMapping(), this.getRoleMapping(), null, "roleMapping", null, 0, -1, CollaborativeProcessEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeProcessEdge_RoleElementOperation(), this.getRoleElementOperation(), null, "roleElementOperation", null, 0, 1, CollaborativeProcessEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleElementOperationEClass, RoleElementOperation.class, "RoleElementOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleElementOperation_ElementOperation(), this.getElementOperation(), null, "elementOperation", null, 0, 1, RoleElementOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleElementOperation_CallEvent(), theUMLPackage.getCallEvent(), null, "callEvent", null, 0, 1, RoleElementOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoleElementOperation__GetName(), theTypesPackage.getString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementOperationEClass, ElementOperation.class, "ElementOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementOperation_Operation(), theUMLPackage.getOperation(), null, "operation", null, 0, 1, ElementOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElementOperation__GetName(), theTypesPackage.getString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collaborativeProtocolTransitionEClass, CollaborativeProtocolTransition.class, "CollaborativeProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeProtocolTransition_RoleElementOperation(), this.getRoleElementOperation(), null, "roleElementOperation", null, 0, 1, CollaborativeProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelListEClass, ModelList.class, "ModelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelList_CollaborativeModelList(), this.getCollaborativeModel(), null, "collaborativeModelList", null, 0, -1, ModelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hapticIndicatorEClass, HapticIndicator.class, "HapticIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHapticIndicator_Kind(), this.getEnumHapticKind(), "kind", null, 0, 1, HapticIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHapticIndicator_Duration(), theTypesPackage.getInteger(), "duration", null, 0, 1, HapticIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHapticIndicator_Period(), theTypesPackage.getInteger(), "period", null, 0, 1, HapticIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHapticIndicator_Amplitude(), theTypesPackage.getInteger(), "amplitude", null, 0, 1, HapticIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHapticIndicator_Repetitions(), theTypesPackage.getInteger(), "repetitions", null, 0, 1, HapticIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumActivityKindEEnum, EnumActivityKind.class, "EnumActivityKind");
		addEEnumLiteral(enumActivityKindEEnum, EnumActivityKind.UNDEFINED_LITERAL);
		addEEnumLiteral(enumActivityKindEEnum, EnumActivityKind.INOUT_LITERAL);
		addEEnumLiteral(enumActivityKindEEnum, EnumActivityKind.IN_LITERAL);
		addEEnumLiteral(enumActivityKindEEnum, EnumActivityKind.OUT_LITERAL);

		initEEnum(enumGroupKindEEnum, EnumGroupKind.class, "EnumGroupKind");
		addEEnumLiteral(enumGroupKindEEnum, EnumGroupKind.UNDEFINED_LITERAL);
		addEEnumLiteral(enumGroupKindEEnum, EnumGroupKind.COOPERATIVE_LITERAL);
		addEEnumLiteral(enumGroupKindEEnum, EnumGroupKind.INDIVIDUAL_LITERAL);

		initEEnum(enumSubActivityKindEEnum, EnumSubActivityKind.class, "EnumSubActivityKind");
		addEEnumLiteral(enumSubActivityKindEEnum, EnumSubActivityKind.UNDEFINED_LITERAL);
		addEEnumLiteral(enumSubActivityKindEEnum, EnumSubActivityKind.SHARE_INFO_LITERAL);
		addEEnumLiteral(enumSubActivityKindEEnum, EnumSubActivityKind.ANALISYS_LITERAL);
		addEEnumLiteral(enumSubActivityKindEEnum, EnumSubActivityKind.DESICION_MAKING_LITERAL);
		addEEnumLiteral(enumSubActivityKindEEnum, EnumSubActivityKind.INPUT_DATA_LITERAL);

		initEEnum(awarenessElementEEnum, AwarenessElement.class, "AwarenessElement");
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.PRECENCE);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.LOCATION);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.DENSITY);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.USER_INFO);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.ROL);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.ACTIVITY_LEVEL);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.ACTION);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.HISTORY);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.INTENTION);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.BOOBMARKS);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.CHANGE);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.EXPECTATION);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.OBJECTS);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.VISIBILITY);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.ABILITIES);
		addEEnumLiteral(awarenessElementEEnum, AwarenessElement.INFLUENCE);

		initEEnum(enumInteractionEEnum, EnumInteraction.class, "EnumInteraction");
		addEEnumLiteral(enumInteractionEEnum, EnumInteraction.UNDEFINED);
		addEEnumLiteral(enumInteractionEEnum, EnumInteraction.GOESAWAY);
		addEEnumLiteral(enumInteractionEEnum, EnumInteraction.POSTPONABLE);

		initEEnum(enumPlayerKindEEnum, EnumPlayerKind.class, "EnumPlayerKind");
		addEEnumLiteral(enumPlayerKindEEnum, EnumPlayerKind.UNDEFINED);
		addEEnumLiteral(enumPlayerKindEEnum, EnumPlayerKind.CONTINUOUS);
		addEEnumLiteral(enumPlayerKindEEnum, EnumPlayerKind.CYCLIC);

		initEEnum(enumHapticKindEEnum, EnumHapticKind.class, "EnumHapticKind");
		addEEnumLiteral(enumHapticKindEEnum, EnumHapticKind.PLATEAU);
		addEEnumLiteral(enumHapticKindEEnum, EnumHapticKind.UPWARD_SLOPE);
		addEEnumLiteral(enumHapticKindEEnum, EnumHapticKind.DOWNWARD_SLOPE);
		addEEnumLiteral(enumHapticKindEEnum, EnumHapticKind.HILL);
		addEEnumLiteral(enumHapticKindEEnum, EnumHapticKind.COMPOSITE);

		initEEnum(enumDisplayEEnum, EnumDisplay.class, "EnumDisplay");
		addEEnumLiteral(enumDisplayEEnum, EnumDisplay.VISUAL);
		addEEnumLiteral(enumDisplayEEnum, EnumDisplay.HAPTIC);
		addEEnumLiteral(enumDisplayEEnum, EnumDisplay.AUDIO);

		initEEnum(hapticRoleEffectEEnum, HapticRoleEffect.class, "HapticRoleEffect");
		addEEnumLiteral(hapticRoleEffectEEnum, HapticRoleEffect.REINFORCEMENT);
		addEEnumLiteral(hapticRoleEffectEEnum, HapticRoleEffect.COMPLEMENTARY);

		initEEnum(hapticRolePriorityEEnum, HapticRolePriority.class, "HapticRolePriority");
		addEEnumLiteral(hapticRolePriorityEEnum, HapticRolePriority.PRIMARY);
		addEEnumLiteral(hapticRolePriorityEEnum, HapticRolePriority.SECONDARY);

		initEEnum(hapticRoleOrderEEnum, HapticRoleOrder.class, "HapticRoleOrder");
		addEEnumLiteral(hapticRoleOrderEEnum, HapticRoleOrder.INITIAL);
		addEEnumLiteral(hapticRoleOrderEEnum, HapticRoleOrder.FOLLOW_UP);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (collaborativeProcessEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
	}

} //CmPackageImpl
