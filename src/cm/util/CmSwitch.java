/**
 */
package cm.util;

import cm.*;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityContent;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cm.CmPackage
 * @generated
 */
public class CmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSwitch() {
		if (modelPackage == null) {
			modelPackage = CmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CmPackage.COLLABORATIVE_ELEMENT: {
				CollaborativeElement collaborativeElement = (CollaborativeElement)theEObject;
				T result = caseCollaborativeElement(collaborativeElement);
				if (result == null) result = caseClass(collaborativeElement);
				if (result == null) result = caseEncapsulatedClassifier(collaborativeElement);
				if (result == null) result = caseBehavioredClassifier(collaborativeElement);
				if (result == null) result = caseStructuredClassifier(collaborativeElement);
				if (result == null) result = caseClassifier(collaborativeElement);
				if (result == null) result = caseNamespace(collaborativeElement);
				if (result == null) result = caseRedefinableElement(collaborativeElement);
				if (result == null) result = caseType(collaborativeElement);
				if (result == null) result = caseTemplateableElement(collaborativeElement);
				if (result == null) result = casePackageableElement(collaborativeElement);
				if (result == null) result = caseNamedElement(collaborativeElement);
				if (result == null) result = caseParameterableElement(collaborativeElement);
				if (result == null) result = caseElement(collaborativeElement);
				if (result == null) result = caseEModelElement(collaborativeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATION_ROLE: {
				CollaborationRole collaborationRole = (CollaborationRole)theEObject;
				T result = caseCollaborationRole(collaborationRole);
				if (result == null) result = caseClass(collaborationRole);
				if (result == null) result = caseEncapsulatedClassifier(collaborationRole);
				if (result == null) result = caseBehavioredClassifier(collaborationRole);
				if (result == null) result = caseStructuredClassifier(collaborationRole);
				if (result == null) result = caseClassifier(collaborationRole);
				if (result == null) result = caseNamespace(collaborationRole);
				if (result == null) result = caseRedefinableElement(collaborationRole);
				if (result == null) result = caseType(collaborationRole);
				if (result == null) result = caseTemplateableElement(collaborationRole);
				if (result == null) result = casePackageableElement(collaborationRole);
				if (result == null) result = caseNamedElement(collaborationRole);
				if (result == null) result = caseParameterableElement(collaborationRole);
				if (result == null) result = caseElement(collaborationRole);
				if (result == null) result = caseEModelElement(collaborationRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseClass(user);
				if (result == null) result = caseEncapsulatedClassifier(user);
				if (result == null) result = caseBehavioredClassifier(user);
				if (result == null) result = caseStructuredClassifier(user);
				if (result == null) result = caseClassifier(user);
				if (result == null) result = caseNamespace(user);
				if (result == null) result = caseRedefinableElement(user);
				if (result == null) result = caseType(user);
				if (result == null) result = caseTemplateableElement(user);
				if (result == null) result = casePackageableElement(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = caseParameterableElement(user);
				if (result == null) result = caseElement(user);
				if (result == null) result = caseEModelElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.SHARED_OBJECT: {
				SharedObject sharedObject = (SharedObject)theEObject;
				T result = caseSharedObject(sharedObject);
				if (result == null) result = caseCollaborativeElement(sharedObject);
				if (result == null) result = caseClass(sharedObject);
				if (result == null) result = caseEncapsulatedClassifier(sharedObject);
				if (result == null) result = caseBehavioredClassifier(sharedObject);
				if (result == null) result = caseStructuredClassifier(sharedObject);
				if (result == null) result = caseClassifier(sharedObject);
				if (result == null) result = caseNamespace(sharedObject);
				if (result == null) result = caseRedefinableElement(sharedObject);
				if (result == null) result = caseType(sharedObject);
				if (result == null) result = caseTemplateableElement(sharedObject);
				if (result == null) result = casePackageableElement(sharedObject);
				if (result == null) result = caseNamedElement(sharedObject);
				if (result == null) result = caseParameterableElement(sharedObject);
				if (result == null) result = caseElement(sharedObject);
				if (result == null) result = caseEModelElement(sharedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_ASSOCIATION: {
				CollaborativeAssociation collaborativeAssociation = (CollaborativeAssociation)theEObject;
				T result = caseCollaborativeAssociation(collaborativeAssociation);
				if (result == null) result = caseAssociation(collaborativeAssociation);
				if (result == null) result = caseClassifier(collaborativeAssociation);
				if (result == null) result = caseRelationship(collaborativeAssociation);
				if (result == null) result = caseNamespace(collaborativeAssociation);
				if (result == null) result = caseRedefinableElement(collaborativeAssociation);
				if (result == null) result = caseType(collaborativeAssociation);
				if (result == null) result = caseTemplateableElement(collaborativeAssociation);
				if (result == null) result = casePackageableElement(collaborativeAssociation);
				if (result == null) result = caseNamedElement(collaborativeAssociation);
				if (result == null) result = caseParameterableElement(collaborativeAssociation);
				if (result == null) result = caseElement(collaborativeAssociation);
				if (result == null) result = caseEModelElement(collaborativeAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseCollaborativeElement(tool);
				if (result == null) result = caseClass(tool);
				if (result == null) result = caseEncapsulatedClassifier(tool);
				if (result == null) result = caseBehavioredClassifier(tool);
				if (result == null) result = caseStructuredClassifier(tool);
				if (result == null) result = caseClassifier(tool);
				if (result == null) result = caseNamespace(tool);
				if (result == null) result = caseRedefinableElement(tool);
				if (result == null) result = caseType(tool);
				if (result == null) result = caseTemplateableElement(tool);
				if (result == null) result = casePackageableElement(tool);
				if (result == null) result = caseNamedElement(tool);
				if (result == null) result = caseParameterableElement(tool);
				if (result == null) result = caseElement(tool);
				if (result == null) result = caseEModelElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_ACTIVITY: {
				CollaborativeActivity collaborativeActivity = (CollaborativeActivity)theEObject;
				T result = caseCollaborativeActivity(collaborativeActivity);
				if (result == null) result = caseCollaborativeElement(collaborativeActivity);
				if (result == null) result = caseClass(collaborativeActivity);
				if (result == null) result = caseEncapsulatedClassifier(collaborativeActivity);
				if (result == null) result = caseBehavioredClassifier(collaborativeActivity);
				if (result == null) result = caseStructuredClassifier(collaborativeActivity);
				if (result == null) result = caseClassifier(collaborativeActivity);
				if (result == null) result = caseNamespace(collaborativeActivity);
				if (result == null) result = caseRedefinableElement(collaborativeActivity);
				if (result == null) result = caseType(collaborativeActivity);
				if (result == null) result = caseTemplateableElement(collaborativeActivity);
				if (result == null) result = casePackageableElement(collaborativeActivity);
				if (result == null) result = caseNamedElement(collaborativeActivity);
				if (result == null) result = caseParameterableElement(collaborativeActivity);
				if (result == null) result = caseElement(collaborativeActivity);
				if (result == null) result = caseEModelElement(collaborativeActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.WORKSPACE: {
				Workspace workspace = (Workspace)theEObject;
				T result = caseWorkspace(workspace);
				if (result == null) result = caseCollaborativeElement(workspace);
				if (result == null) result = caseClass(workspace);
				if (result == null) result = caseEncapsulatedClassifier(workspace);
				if (result == null) result = caseBehavioredClassifier(workspace);
				if (result == null) result = caseStructuredClassifier(workspace);
				if (result == null) result = caseClassifier(workspace);
				if (result == null) result = caseNamespace(workspace);
				if (result == null) result = caseRedefinableElement(workspace);
				if (result == null) result = caseType(workspace);
				if (result == null) result = caseTemplateableElement(workspace);
				if (result == null) result = casePackageableElement(workspace);
				if (result == null) result = caseNamedElement(workspace);
				if (result == null) result = caseParameterableElement(workspace);
				if (result == null) result = caseElement(workspace);
				if (result == null) result = caseEModelElement(workspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.LOCATION_RELATIONSHIP: {
				LocationRelationship locationRelationship = (LocationRelationship)theEObject;
				T result = caseLocationRelationship(locationRelationship);
				if (result == null) result = caseCollaborativeAssociation(locationRelationship);
				if (result == null) result = caseAssociation(locationRelationship);
				if (result == null) result = caseClassifier(locationRelationship);
				if (result == null) result = caseRelationship(locationRelationship);
				if (result == null) result = caseNamespace(locationRelationship);
				if (result == null) result = caseRedefinableElement(locationRelationship);
				if (result == null) result = caseType(locationRelationship);
				if (result == null) result = caseTemplateableElement(locationRelationship);
				if (result == null) result = casePackageableElement(locationRelationship);
				if (result == null) result = caseNamedElement(locationRelationship);
				if (result == null) result = caseParameterableElement(locationRelationship);
				if (result == null) result = caseElement(locationRelationship);
				if (result == null) result = caseEModelElement(locationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.USE_RELATIONSHIP: {
				UseRelationship useRelationship = (UseRelationship)theEObject;
				T result = caseUseRelationship(useRelationship);
				if (result == null) result = caseCollaborativeAssociation(useRelationship);
				if (result == null) result = caseAssociation(useRelationship);
				if (result == null) result = caseClassifier(useRelationship);
				if (result == null) result = caseRelationship(useRelationship);
				if (result == null) result = caseNamespace(useRelationship);
				if (result == null) result = caseRedefinableElement(useRelationship);
				if (result == null) result = caseType(useRelationship);
				if (result == null) result = caseTemplateableElement(useRelationship);
				if (result == null) result = casePackageableElement(useRelationship);
				if (result == null) result = caseNamedElement(useRelationship);
				if (result == null) result = caseParameterableElement(useRelationship);
				if (result == null) result = caseElement(useRelationship);
				if (result == null) result = caseEModelElement(useRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.PARTICIPATION_RELATIONSHIP: {
				ParticipationRelationship participationRelationship = (ParticipationRelationship)theEObject;
				T result = caseParticipationRelationship(participationRelationship);
				if (result == null) result = caseCollaborativeAssociation(participationRelationship);
				if (result == null) result = caseAssociation(participationRelationship);
				if (result == null) result = caseClassifier(participationRelationship);
				if (result == null) result = caseRelationship(participationRelationship);
				if (result == null) result = caseNamespace(participationRelationship);
				if (result == null) result = caseRedefinableElement(participationRelationship);
				if (result == null) result = caseType(participationRelationship);
				if (result == null) result = caseTemplateableElement(participationRelationship);
				if (result == null) result = casePackageableElement(participationRelationship);
				if (result == null) result = caseNamedElement(participationRelationship);
				if (result == null) result = caseParameterableElement(participationRelationship);
				if (result == null) result = caseElement(participationRelationship);
				if (result == null) result = caseEModelElement(participationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_MODEL: {
				CollaborativeModel collaborativeModel = (CollaborativeModel)theEObject;
				T result = caseCollaborativeModel(collaborativeModel);
				if (result == null) result = caseModel(collaborativeModel);
				if (result == null) result = casePackage(collaborativeModel);
				if (result == null) result = caseNamespace(collaborativeModel);
				if (result == null) result = casePackageableElement(collaborativeModel);
				if (result == null) result = caseTemplateableElement(collaborativeModel);
				if (result == null) result = caseNamedElement(collaborativeModel);
				if (result == null) result = caseParameterableElement(collaborativeModel);
				if (result == null) result = caseElement(collaborativeModel);
				if (result == null) result = caseEModelElement(collaborativeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.SESSION_RELATIONSHIP: {
				SessionRelationship sessionRelationship = (SessionRelationship)theEObject;
				T result = caseSessionRelationship(sessionRelationship);
				if (result == null) result = caseCollaborativeAssociation(sessionRelationship);
				if (result == null) result = caseAssociation(sessionRelationship);
				if (result == null) result = caseClassifier(sessionRelationship);
				if (result == null) result = caseRelationship(sessionRelationship);
				if (result == null) result = caseNamespace(sessionRelationship);
				if (result == null) result = caseRedefinableElement(sessionRelationship);
				if (result == null) result = caseType(sessionRelationship);
				if (result == null) result = caseTemplateableElement(sessionRelationship);
				if (result == null) result = casePackageableElement(sessionRelationship);
				if (result == null) result = caseNamedElement(sessionRelationship);
				if (result == null) result = caseParameterableElement(sessionRelationship);
				if (result == null) result = caseElement(sessionRelationship);
				if (result == null) result = caseEModelElement(sessionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.BELONGS_RELATIONSHIP: {
				BelongsRelationship belongsRelationship = (BelongsRelationship)theEObject;
				T result = caseBelongsRelationship(belongsRelationship);
				if (result == null) result = caseSessionRelationship(belongsRelationship);
				if (result == null) result = caseCollaborativeAssociation(belongsRelationship);
				if (result == null) result = caseAssociation(belongsRelationship);
				if (result == null) result = caseClassifier(belongsRelationship);
				if (result == null) result = caseRelationship(belongsRelationship);
				if (result == null) result = caseNamespace(belongsRelationship);
				if (result == null) result = caseRedefinableElement(belongsRelationship);
				if (result == null) result = caseType(belongsRelationship);
				if (result == null) result = caseTemplateableElement(belongsRelationship);
				if (result == null) result = casePackageableElement(belongsRelationship);
				if (result == null) result = caseNamedElement(belongsRelationship);
				if (result == null) result = caseParameterableElement(belongsRelationship);
				if (result == null) result = caseElement(belongsRelationship);
				if (result == null) result = caseEModelElement(belongsRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.SHARED_RELATIONSHIP: {
				SharedRelationship sharedRelationship = (SharedRelationship)theEObject;
				T result = caseSharedRelationship(sharedRelationship);
				if (result == null) result = caseSessionRelationship(sharedRelationship);
				if (result == null) result = caseCollaborativeAssociation(sharedRelationship);
				if (result == null) result = caseAssociation(sharedRelationship);
				if (result == null) result = caseClassifier(sharedRelationship);
				if (result == null) result = caseRelationship(sharedRelationship);
				if (result == null) result = caseNamespace(sharedRelationship);
				if (result == null) result = caseRedefinableElement(sharedRelationship);
				if (result == null) result = caseType(sharedRelationship);
				if (result == null) result = caseTemplateableElement(sharedRelationship);
				if (result == null) result = casePackageableElement(sharedRelationship);
				if (result == null) result = caseNamedElement(sharedRelationship);
				if (result == null) result = caseParameterableElement(sharedRelationship);
				if (result == null) result = caseElement(sharedRelationship);
				if (result == null) result = caseEModelElement(sharedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.ROLE_MAPPING: {
				RoleMapping roleMapping = (RoleMapping)theEObject;
				T result = caseRoleMapping(roleMapping);
				if (result == null) result = caseClass(roleMapping);
				if (result == null) result = caseEncapsulatedClassifier(roleMapping);
				if (result == null) result = caseBehavioredClassifier(roleMapping);
				if (result == null) result = caseStructuredClassifier(roleMapping);
				if (result == null) result = caseClassifier(roleMapping);
				if (result == null) result = caseNamespace(roleMapping);
				if (result == null) result = caseRedefinableElement(roleMapping);
				if (result == null) result = caseType(roleMapping);
				if (result == null) result = caseTemplateableElement(roleMapping);
				if (result == null) result = casePackageableElement(roleMapping);
				if (result == null) result = caseNamedElement(roleMapping);
				if (result == null) result = caseParameterableElement(roleMapping);
				if (result == null) result = caseElement(roleMapping);
				if (result == null) result = caseEModelElement(roleMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_PROCESS: {
				CollaborativeProcess collaborativeProcess = (CollaborativeProcess)theEObject;
				T result = caseCollaborativeProcess(collaborativeProcess);
				if (result == null) result = caseActivity(collaborativeProcess);
				if (result == null) result = caseBehavior(collaborativeProcess);
				if (result == null) result = caseClass(collaborativeProcess);
				if (result == null) result = caseEncapsulatedClassifier(collaborativeProcess);
				if (result == null) result = caseBehavioredClassifier(collaborativeProcess);
				if (result == null) result = caseStructuredClassifier(collaborativeProcess);
				if (result == null) result = caseClassifier(collaborativeProcess);
				if (result == null) result = caseNamespace(collaborativeProcess);
				if (result == null) result = caseRedefinableElement(collaborativeProcess);
				if (result == null) result = caseType(collaborativeProcess);
				if (result == null) result = caseTemplateableElement(collaborativeProcess);
				if (result == null) result = casePackageableElement(collaborativeProcess);
				if (result == null) result = caseNamedElement(collaborativeProcess);
				if (result == null) result = caseParameterableElement(collaborativeProcess);
				if (result == null) result = caseElement(collaborativeProcess);
				if (result == null) result = caseEModelElement(collaborativeProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE: {
				CollaborativeActivityNode collaborativeActivityNode = (CollaborativeActivityNode)theEObject;
				T result = caseCollaborativeActivityNode(collaborativeActivityNode);
				if (result == null) result = caseActivityNode(collaborativeActivityNode);
				if (result == null) result = caseRedefinableElement(collaborativeActivityNode);
				if (result == null) result = caseActivityContent(collaborativeActivityNode);
				if (result == null) result = caseNamedElement(collaborativeActivityNode);
				if (result == null) result = caseElement(collaborativeActivityNode);
				if (result == null) result = caseEModelElement(collaborativeActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE: {
				CollaborativeActivityState collaborativeActivityState = (CollaborativeActivityState)theEObject;
				T result = caseCollaborativeActivityState(collaborativeActivityState);
				if (result == null) result = caseVertex(collaborativeActivityState);
				if (result == null) result = caseNamedElement(collaborativeActivityState);
				if (result == null) result = caseElement(collaborativeActivityState);
				if (result == null) result = caseEModelElement(collaborativeActivityState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.AWARENESS: {
				Awareness awareness = (Awareness)theEObject;
				T result = caseAwareness(awareness);
				if (result == null) result = caseClass(awareness);
				if (result == null) result = caseEncapsulatedClassifier(awareness);
				if (result == null) result = caseBehavioredClassifier(awareness);
				if (result == null) result = caseStructuredClassifier(awareness);
				if (result == null) result = caseClassifier(awareness);
				if (result == null) result = caseNamespace(awareness);
				if (result == null) result = caseRedefinableElement(awareness);
				if (result == null) result = caseType(awareness);
				if (result == null) result = caseTemplateableElement(awareness);
				if (result == null) result = casePackageableElement(awareness);
				if (result == null) result = caseNamedElement(awareness);
				if (result == null) result = caseParameterableElement(awareness);
				if (result == null) result = caseElement(awareness);
				if (result == null) result = caseEModelElement(awareness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.AWARENESS_KIND: {
				AwarenessKind awarenessKind = (AwarenessKind)theEObject;
				T result = caseAwarenessKind(awarenessKind);
				if (result == null) result = caseClass(awarenessKind);
				if (result == null) result = caseEncapsulatedClassifier(awarenessKind);
				if (result == null) result = caseBehavioredClassifier(awarenessKind);
				if (result == null) result = caseStructuredClassifier(awarenessKind);
				if (result == null) result = caseClassifier(awarenessKind);
				if (result == null) result = caseNamespace(awarenessKind);
				if (result == null) result = caseRedefinableElement(awarenessKind);
				if (result == null) result = caseType(awarenessKind);
				if (result == null) result = caseTemplateableElement(awarenessKind);
				if (result == null) result = casePackageableElement(awarenessKind);
				if (result == null) result = caseNamedElement(awarenessKind);
				if (result == null) result = caseParameterableElement(awarenessKind);
				if (result == null) result = caseElement(awarenessKind);
				if (result == null) result = caseEModelElement(awarenessKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_PROCESS_EDGE: {
				CollaborativeProcessEdge collaborativeProcessEdge = (CollaborativeProcessEdge)theEObject;
				T result = caseCollaborativeProcessEdge(collaborativeProcessEdge);
				if (result == null) result = caseActivityEdge(collaborativeProcessEdge);
				if (result == null) result = caseRedefinableElement(collaborativeProcessEdge);
				if (result == null) result = caseNamedElement(collaborativeProcessEdge);
				if (result == null) result = caseElement(collaborativeProcessEdge);
				if (result == null) result = caseEModelElement(collaborativeProcessEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.ROLE_ELEMENT_OPERATION: {
				RoleElementOperation roleElementOperation = (RoleElementOperation)theEObject;
				T result = caseRoleElementOperation(roleElementOperation);
				if (result == null) result = caseClass(roleElementOperation);
				if (result == null) result = caseEncapsulatedClassifier(roleElementOperation);
				if (result == null) result = caseBehavioredClassifier(roleElementOperation);
				if (result == null) result = caseStructuredClassifier(roleElementOperation);
				if (result == null) result = caseClassifier(roleElementOperation);
				if (result == null) result = caseNamespace(roleElementOperation);
				if (result == null) result = caseRedefinableElement(roleElementOperation);
				if (result == null) result = caseType(roleElementOperation);
				if (result == null) result = caseTemplateableElement(roleElementOperation);
				if (result == null) result = casePackageableElement(roleElementOperation);
				if (result == null) result = caseNamedElement(roleElementOperation);
				if (result == null) result = caseParameterableElement(roleElementOperation);
				if (result == null) result = caseElement(roleElementOperation);
				if (result == null) result = caseEModelElement(roleElementOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.ELEMENT_OPERATION: {
				ElementOperation elementOperation = (ElementOperation)theEObject;
				T result = caseElementOperation(elementOperation);
				if (result == null) result = caseClass(elementOperation);
				if (result == null) result = caseEncapsulatedClassifier(elementOperation);
				if (result == null) result = caseBehavioredClassifier(elementOperation);
				if (result == null) result = caseStructuredClassifier(elementOperation);
				if (result == null) result = caseClassifier(elementOperation);
				if (result == null) result = caseNamespace(elementOperation);
				if (result == null) result = caseRedefinableElement(elementOperation);
				if (result == null) result = caseType(elementOperation);
				if (result == null) result = caseTemplateableElement(elementOperation);
				if (result == null) result = casePackageableElement(elementOperation);
				if (result == null) result = caseNamedElement(elementOperation);
				if (result == null) result = caseParameterableElement(elementOperation);
				if (result == null) result = caseElement(elementOperation);
				if (result == null) result = caseEModelElement(elementOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION: {
				CollaborativeProtocolTransition collaborativeProtocolTransition = (CollaborativeProtocolTransition)theEObject;
				T result = caseCollaborativeProtocolTransition(collaborativeProtocolTransition);
				if (result == null) result = caseProtocolTransition(collaborativeProtocolTransition);
				if (result == null) result = caseTransition(collaborativeProtocolTransition);
				if (result == null) result = caseNamespace(collaborativeProtocolTransition);
				if (result == null) result = caseRedefinableElement(collaborativeProtocolTransition);
				if (result == null) result = caseNamedElement(collaborativeProtocolTransition);
				if (result == null) result = caseElement(collaborativeProtocolTransition);
				if (result == null) result = caseEModelElement(collaborativeProtocolTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.MODEL_LIST: {
				ModelList modelList = (ModelList)theEObject;
				T result = caseModelList(modelList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CmPackage.HAPTIC_INDICATOR: {
				HapticIndicator hapticIndicator = (HapticIndicator)theEObject;
				T result = caseHapticIndicator(hapticIndicator);
				if (result == null) result = caseClass(hapticIndicator);
				if (result == null) result = caseEncapsulatedClassifier(hapticIndicator);
				if (result == null) result = caseBehavioredClassifier(hapticIndicator);
				if (result == null) result = caseStructuredClassifier(hapticIndicator);
				if (result == null) result = caseClassifier(hapticIndicator);
				if (result == null) result = caseNamespace(hapticIndicator);
				if (result == null) result = caseRedefinableElement(hapticIndicator);
				if (result == null) result = caseType(hapticIndicator);
				if (result == null) result = caseTemplateableElement(hapticIndicator);
				if (result == null) result = casePackageableElement(hapticIndicator);
				if (result == null) result = caseNamedElement(hapticIndicator);
				if (result == null) result = caseParameterableElement(hapticIndicator);
				if (result == null) result = caseElement(hapticIndicator);
				if (result == null) result = caseEModelElement(hapticIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeElement(CollaborativeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationRole(CollaborationRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedObject(SharedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeAssociation(CollaborativeAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeActivity(CollaborativeActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspace(Workspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationRelationship(LocationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseRelationship(UseRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipationRelationship(ParticipationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeModel(CollaborativeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionRelationship(SessionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belongs Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belongs Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelongsRelationship(BelongsRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedRelationship(SharedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleMapping(RoleMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeProcess(CollaborativeProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeActivityNode(CollaborativeActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Activity State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Activity State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeActivityState(CollaborativeActivityState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awareness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwareness(Awareness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awareness Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awareness Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwarenessKind(AwarenessKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Process Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Process Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeProcessEdge(CollaborativeProcessEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Element Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Element Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleElementOperation(RoleElementOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementOperation(ElementOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeProtocolTransition(CollaborativeProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelList(ModelList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Haptic Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Haptic Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHapticIndicator(HapticIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.eclipse.uml2.uml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.eclipse.uml2.uml.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityContent(ActivityContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CmSwitch
