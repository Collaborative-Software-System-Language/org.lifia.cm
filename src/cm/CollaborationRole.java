/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborationRole#getQualification <em>Qualification</em>}</li>
 *   <li>{@link cm.CollaborationRole#getUser <em>User</em>}</li>
 *   <li>{@link cm.CollaborationRole#getAssignedRoleElementOperation <em>Assigned Role Element Operation</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborationRole()
 * @model
 * @generated
 */
public interface CollaborationRole extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see cm.CmPackage#getCollaborationRole_Qualification()
	 * @model
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link cm.CollaborationRole#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cm.User#getCollaborationRole <em>Collaboration Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see cm.CmPackage#getCollaborationRole_User()
	 * @see cm.User#getCollaborationRole
	 * @model opposite="collaborationRole"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link cm.CollaborationRole#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Assigned Role Element Operation</b></em>' containment reference list.
	 * The list contents are of type {@link cm.RoleElementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Role Element Operation</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborationRole_AssignedRoleElementOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleElementOperation> getAssignedRoleElementOperation();

} // CollaborationRole
