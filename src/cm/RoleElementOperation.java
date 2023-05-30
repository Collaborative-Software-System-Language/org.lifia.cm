/**
 */
package cm;

import org.eclipse.uml2.uml.CallEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Element Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.RoleElementOperation#getElementOperation <em>Element Operation</em>}</li>
 *   <li>{@link cm.RoleElementOperation#getCallEvent <em>Call Event</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getRoleElementOperation()
 * @model
 * @generated
 */
public interface RoleElementOperation extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Element Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Operation</em>' reference.
	 * @see #setElementOperation(ElementOperation)
	 * @see cm.CmPackage#getRoleElementOperation_ElementOperation()
	 * @model
	 * @generated
	 */
	ElementOperation getElementOperation();

	/**
	 * Sets the value of the '{@link cm.RoleElementOperation#getElementOperation <em>Element Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Operation</em>' reference.
	 * @see #getElementOperation()
	 * @generated
	 */
	void setElementOperation(ElementOperation value);

	/**
	 * Returns the value of the '<em><b>Call Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Event</em>' containment reference.
	 * @see #setCallEvent(CallEvent)
	 * @see cm.CmPackage#getRoleElementOperation_CallEvent()
	 * @model containment="true"
	 * @generated
	 */
	CallEvent getCallEvent();

	/**
	 * Sets the value of the '{@link cm.RoleElementOperation#getCallEvent <em>Call Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Event</em>' containment reference.
	 * @see #getCallEvent()
	 * @generated
	 */
	void setCallEvent(CallEvent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getName();

} // RoleElementOperation
