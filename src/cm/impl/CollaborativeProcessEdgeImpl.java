/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeProcessEdge;
import cm.RoleElementOperation;
import cm.RoleMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ActivityEdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Process Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeProcessEdgeImpl#getRoleMapping <em>Role Mapping</em>}</li>
 *   <li>{@link cm.impl.CollaborativeProcessEdgeImpl#getRoleElementOperation <em>Role Element Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeProcessEdgeImpl extends ActivityEdgeImpl implements CollaborativeProcessEdge {
	/**
	 * The cached value of the '{@link #getRoleMapping() <em>Role Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleMapping> roleMapping;

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
	protected CollaborativeProcessEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_PROCESS_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleMapping> getRoleMapping() {
		if (roleMapping == null) {
			roleMapping = new EObjectContainmentEList<RoleMapping>(RoleMapping.class, this, CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING);
		}
		return roleMapping;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION, oldRoleElementOperation, roleElementOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION, oldRoleElementOperation, roleElementOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING:
				return ((InternalEList<?>)getRoleMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING:
				return getRoleMapping();
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING:
				getRoleMapping().clear();
				getRoleMapping().addAll((Collection<? extends RoleMapping>)newValue);
				return;
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION:
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
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING:
				getRoleMapping().clear();
				return;
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION:
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
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_MAPPING:
				return roleMapping != null && !roleMapping.isEmpty();
			case CmPackage.COLLABORATIVE_PROCESS_EDGE__ROLE_ELEMENT_OPERATION:
				return roleElementOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //CollaborativeProcessEdgeImpl
