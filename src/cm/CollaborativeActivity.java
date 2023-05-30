/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeActivity#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link cm.CollaborativeActivity#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link cm.CollaborativeActivity#getMyRoles <em>My Roles</em>}</li>
 *   <li>{@link cm.CollaborativeActivity#isIsPersonal <em>Is Personal</em>}</li>
 *   <li>{@link cm.CollaborativeActivity#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeActivity()
 * @model
 * @generated
 */
public interface CollaborativeActivity extends CollaborativeElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(StateMachine)
	 * @see cm.CmPackage#getCollaborativeActivity_Protocol()
	 * @model derived="true"
	 * @generated
	 */
	StateMachine getProtocol();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivity#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see cm.CmPackage#getCollaborativeActivity_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivity#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>My Roles</b></em>' reference list.
	 * The list contents are of type {@link cm.CollaborationRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Roles</em>' reference list.
	 * @see cm.CmPackage#getCollaborativeActivity_MyRoles()
	 * @model
	 * @generated
	 */
	EList<CollaborationRole> getMyRoles();

	/**
	 * Returns the value of the '<em><b>Is Personal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Personal</em>' attribute.
	 * @see #setIsPersonal(boolean)
	 * @see cm.CmPackage#getCollaborativeActivity_IsPersonal()
	 * @model dataType="org.eclipse.uml2.types.Boolean"
	 * @generated
	 */
	boolean isIsPersonal();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivity#isIsPersonal <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Personal</em>' attribute.
	 * @see #isIsPersonal()
	 * @generated
	 */
	void setIsPersonal(boolean value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeActivity_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

} // CollaborativeActivity
