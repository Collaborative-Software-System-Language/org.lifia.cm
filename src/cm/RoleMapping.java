/**
 */
package cm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.RoleMapping#getSource <em>Source</em>}</li>
 *   <li>{@link cm.RoleMapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getRoleMapping()
 * @model
 * @generated
 */
public interface RoleMapping extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CollaborationRole)
	 * @see cm.CmPackage#getRoleMapping_Source()
	 * @model required="true"
	 * @generated
	 */
	CollaborationRole getSource();

	/**
	 * Sets the value of the '{@link cm.RoleMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CollaborationRole value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CollaborationRole)
	 * @see cm.CmPackage#getRoleMapping_Target()
	 * @model required="true"
	 * @generated
	 */
	CollaborationRole getTarget();

	/**
	 * Sets the value of the '{@link cm.RoleMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CollaborationRole value);

} // RoleMapping
