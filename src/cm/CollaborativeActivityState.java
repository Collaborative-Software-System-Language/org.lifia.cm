/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Vertex;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Activity State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeActivityState#getCollaborativeActivity <em>Collaborative Activity</em>}</li>
 *   <li>{@link cm.CollaborativeActivityState#getAssignedRoleElementOperation <em>Assigned Role Element Operation</em>}</li>
 *   <li>{@link cm.CollaborativeActivityState#getOutgoingRoleElementOperation <em>Outgoing Role Element Operation</em>}</li>
 *   <li>{@link cm.CollaborativeActivityState#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.CollaborativeActivityState#getMyEvent <em>My Event</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeActivityState()
 * @model
 * @generated
 */
public interface CollaborativeActivityState extends Vertex {
	/**
	 * Returns the value of the '<em><b>Collaborative Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborative Activity</em>' reference.
	 * @see #setCollaborativeActivity(CollaborativeActivity)
	 * @see cm.CmPackage#getCollaborativeActivityState_CollaborativeActivity()
	 * @model required="true"
	 * @generated
	 */
	CollaborativeActivity getCollaborativeActivity();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivityState#getCollaborativeActivity <em>Collaborative Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaborative Activity</em>' reference.
	 * @see #getCollaborativeActivity()
	 * @generated
	 */
	void setCollaborativeActivity(CollaborativeActivity value);

	/**
	 * Returns the value of the '<em><b>Assigned Role Element Operation</b></em>' reference list.
	 * The list contents are of type {@link cm.RoleElementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Role Element Operation</em>' reference list.
	 * @see cm.CmPackage#getCollaborativeActivityState_AssignedRoleElementOperation()
	 * @model
	 * @generated
	 */
	EList<RoleElementOperation> getAssignedRoleElementOperation();

	/**
	 * Returns the value of the '<em><b>Outgoing Role Element Operation</b></em>' reference list.
	 * The list contents are of type {@link cm.RoleElementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Role Element Operation</em>' reference list.
	 * @see cm.CmPackage#getCollaborativeActivityState_OutgoingRoleElementOperation()
	 * @model
	 * @generated
	 */
	EList<RoleElementOperation> getOutgoingRoleElementOperation();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"undefined"</code>.
	 * The literals are from the enumeration {@link cm.EnumSubActivityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumSubActivityKind
	 * @see #setKind(EnumSubActivityKind)
	 * @see cm.CmPackage#getCollaborativeActivityState_Kind()
	 * @model default="undefined"
	 * @generated
	 */
	EnumSubActivityKind getKind();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivityState#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumSubActivityKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EnumSubActivityKind value);

	/**
	 * Returns the value of the '<em><b>My Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Event</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeActivityState_MyEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getMyEvent();

} // CollaborativeActivityState
