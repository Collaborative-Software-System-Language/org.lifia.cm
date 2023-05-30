/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeActivityNode#getCollaborativeActivity <em>Collaborative Activity</em>}</li>
 *   <li>{@link cm.CollaborativeActivityNode#getMyEvent <em>My Event</em>}</li>
 *   <li>{@link cm.CollaborativeActivityNode#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.CollaborativeActivityNode#getGroupKind <em>Group Kind</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeActivityNode()
 * @model
 * @generated
 */
public interface CollaborativeActivityNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Collaborative Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborative Activity</em>' reference.
	 * @see #setCollaborativeActivity(CollaborativeActivity)
	 * @see cm.CmPackage#getCollaborativeActivityNode_CollaborativeActivity()
	 * @model
	 * @generated
	 */
	CollaborativeActivity getCollaborativeActivity();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivityNode#getCollaborativeActivity <em>Collaborative Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaborative Activity</em>' reference.
	 * @see #getCollaborativeActivity()
	 * @generated
	 */
	void setCollaborativeActivity(CollaborativeActivity value);

	/**
	 * Returns the value of the '<em><b>My Event</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Event</em>' reference list.
	 * @see cm.CmPackage#getCollaborativeActivityNode_MyEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getMyEvent();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumActivityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumActivityKind
	 * @see #setKind(EnumActivityKind)
	 * @see cm.CmPackage#getCollaborativeActivityNode_Kind()
	 * @model
	 * @generated
	 */
	EnumActivityKind getKind();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivityNode#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see cm.EnumActivityKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EnumActivityKind value);

	/**
	 * Returns the value of the '<em><b>Group Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumGroupKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Kind</em>' attribute.
	 * @see cm.EnumGroupKind
	 * @see #setGroupKind(EnumGroupKind)
	 * @see cm.CmPackage#getCollaborativeActivityNode_GroupKind()
	 * @model
	 * @generated
	 */
	EnumGroupKind getGroupKind();

	/**
	 * Sets the value of the '{@link cm.CollaborativeActivityNode#getGroupKind <em>Group Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Kind</em>' attribute.
	 * @see cm.EnumGroupKind
	 * @see #getGroupKind()
	 * @generated
	 */
	void setGroupKind(EnumGroupKind value);

} // CollaborativeActivityNode
