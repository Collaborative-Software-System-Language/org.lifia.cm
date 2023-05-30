/**
 */
package cm;

import org.eclipse.uml2.uml.ProtocolTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeProtocolTransition#getRoleElementOperation <em>Role Element Operation</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeProtocolTransition()
 * @model
 * @generated
 */
public interface CollaborativeProtocolTransition extends ProtocolTransition {
	/**
	 * Returns the value of the '<em><b>Role Element Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Element Operation</em>' reference.
	 * @see #setRoleElementOperation(RoleElementOperation)
	 * @see cm.CmPackage#getCollaborativeProtocolTransition_RoleElementOperation()
	 * @model
	 * @generated
	 */
	RoleElementOperation getRoleElementOperation();

	/**
	 * Sets the value of the '{@link cm.CollaborativeProtocolTransition#getRoleElementOperation <em>Role Element Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Element Operation</em>' reference.
	 * @see #getRoleElementOperation()
	 * @generated
	 */
	void setRoleElementOperation(RoleElementOperation value);

} // CollaborativeProtocolTransition
