/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Process Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeProcessEdge#getRoleMapping <em>Role Mapping</em>}</li>
 *   <li>{@link cm.CollaborativeProcessEdge#getRoleElementOperation <em>Role Element Operation</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeProcessEdge()
 * @model
 * @generated
 */
public interface CollaborativeProcessEdge extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Role Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link cm.RoleMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Mapping</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeProcessEdge_RoleMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleMapping> getRoleMapping();

	/**
	 * Returns the value of the '<em><b>Role Element Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Element Operation</em>' reference.
	 * @see #setRoleElementOperation(RoleElementOperation)
	 * @see cm.CmPackage#getCollaborativeProcessEdge_RoleElementOperation()
	 * @model
	 * @generated
	 */
	RoleElementOperation getRoleElementOperation();

	/**
	 * Sets the value of the '{@link cm.CollaborativeProcessEdge#getRoleElementOperation <em>Role Element Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Element Operation</em>' reference.
	 * @see #getRoleElementOperation()
	 * @generated
	 */
	void setRoleElementOperation(RoleElementOperation value);

} // CollaborativeProcessEdge
