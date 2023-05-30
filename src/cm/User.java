/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.User#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link cm.CollaborationRole}.
	 * It is bidirectional and its opposite is '{@link cm.CollaborationRole#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see cm.CmPackage#getUser_CollaborationRole()
	 * @see cm.CollaborationRole#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<CollaborationRole> getCollaborationRole();

} // User
