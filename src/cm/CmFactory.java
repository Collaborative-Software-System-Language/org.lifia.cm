/**
 */
package cm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cm.CmPackage
 * @generated
 */
public interface CmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmFactory eINSTANCE = cm.impl.CmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collaboration Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaboration Role</em>'.
	 * @generated
	 */
	CollaborationRole createCollaborationRole();

	/**
	 * Returns a new object of class '<em>Shared Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Object</em>'.
	 * @generated
	 */
	SharedObject createSharedObject();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Collaborative Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Activity</em>'.
	 * @generated
	 */
	CollaborativeActivity createCollaborativeActivity();

	/**
	 * Returns a new object of class '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	Workspace createWorkspace();

	/**
	 * Returns a new object of class '<em>Location Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Relationship</em>'.
	 * @generated
	 */
	LocationRelationship createLocationRelationship();

	/**
	 * Returns a new object of class '<em>Use Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Relationship</em>'.
	 * @generated
	 */
	UseRelationship createUseRelationship();

	/**
	 * Returns a new object of class '<em>Participation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participation Relationship</em>'.
	 * @generated
	 */
	ParticipationRelationship createParticipationRelationship();

	/**
	 * Returns a new object of class '<em>Collaborative Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Model</em>'.
	 * @generated
	 */
	CollaborativeModel createCollaborativeModel();

	/**
	 * Returns a new object of class '<em>Belongs Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Belongs Relationship</em>'.
	 * @generated
	 */
	BelongsRelationship createBelongsRelationship();

	/**
	 * Returns a new object of class '<em>Shared Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Relationship</em>'.
	 * @generated
	 */
	SharedRelationship createSharedRelationship();

	/**
	 * Returns a new object of class '<em>Role Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Mapping</em>'.
	 * @generated
	 */
	RoleMapping createRoleMapping();

	/**
	 * Returns a new object of class '<em>Collaborative Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Process</em>'.
	 * @generated
	 */
	CollaborativeProcess createCollaborativeProcess();

	/**
	 * Returns a new object of class '<em>Collaborative Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Activity Node</em>'.
	 * @generated
	 */
	CollaborativeActivityNode createCollaborativeActivityNode();

	/**
	 * Returns a new object of class '<em>Collaborative Activity State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Activity State</em>'.
	 * @generated
	 */
	CollaborativeActivityState createCollaborativeActivityState();

	/**
	 * Returns a new object of class '<em>Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Awareness</em>'.
	 * @generated
	 */
	Awareness createAwareness();

	/**
	 * Returns a new object of class '<em>Awareness Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Awareness Kind</em>'.
	 * @generated
	 */
	AwarenessKind createAwarenessKind();

	/**
	 * Returns a new object of class '<em>Collaborative Process Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Process Edge</em>'.
	 * @generated
	 */
	CollaborativeProcessEdge createCollaborativeProcessEdge();

	/**
	 * Returns a new object of class '<em>Role Element Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Element Operation</em>'.
	 * @generated
	 */
	RoleElementOperation createRoleElementOperation();

	/**
	 * Returns a new object of class '<em>Element Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Operation</em>'.
	 * @generated
	 */
	ElementOperation createElementOperation();

	/**
	 * Returns a new object of class '<em>Collaborative Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Protocol Transition</em>'.
	 * @generated
	 */
	CollaborativeProtocolTransition createCollaborativeProtocolTransition();

	/**
	 * Returns a new object of class '<em>Model List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model List</em>'.
	 * @generated
	 */
	ModelList createModelList();

	/**
	 * Returns a new object of class '<em>Haptic Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Haptic Indicator</em>'.
	 * @generated
	 */
	HapticIndicator createHapticIndicator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CmPackage getCmPackage();

} //CmFactory
