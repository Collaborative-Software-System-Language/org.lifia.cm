/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeProtocolTransition;
import cm.RoleElementOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ProtocolTransitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeProtocolTransitionImpl#getRoleElementOperation <em>Role Element Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeProtocolTransitionImpl extends ProtocolTransitionImpl implements CollaborativeProtocolTransition {
	/**
	 * The cached value of the '{@link #getRoleElementOperation() <em>Role Element Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleElementOperation()
	 * @generated
	 * @ordered
	 */
	protected RoleElementOperation roleElementOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeProtocolTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_PROTOCOL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleElementOperation getRoleElementOperation() {
		if (roleElementOperation != null && roleElementOperation.eIsProxy()) {
			InternalEObject oldRoleElementOperation = (InternalEObject)roleElementOperation;
			roleElementOperation = (RoleElementOperation)eResolveProxy(oldRoleElementOperation);
			if (roleElementOperation != oldRoleElementOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION, oldRoleElementOperation, roleElementOperation));
			}
		}
		return roleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleElementOperation basicGetRoleElementOperation() {
		return roleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleElementOperation(RoleElementOperation newRoleElementOperation) {
		RoleElementOperation oldRoleElementOperation = roleElementOperation;
		roleElementOperation = newRoleElementOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION, oldRoleElementOperation, roleElementOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION:
				if (resolve) return getRoleElementOperation();
				return basicGetRoleElementOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION:
				setRoleElementOperation((RoleElementOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION:
				setRoleElementOperation((RoleElementOperation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROTOCOL_TRANSITION__ROLE_ELEMENT_OPERATION:
				return roleElementOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //CollaborativeProtocolTransitionImpl
