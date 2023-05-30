/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborationRole;
import cm.RoleElementOperation;
import cm.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborationRoleImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link cm.impl.CollaborationRoleImpl#getUser <em>User</em>}</li>
 *   <li>{@link cm.impl.CollaborationRoleImpl#getAssignedRoleElementOperation <em>Assigned Role Element Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationRoleImpl extends ClassImpl implements CollaborationRole {
	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getAssignedRoleElementOperation() <em>Assigned Role Element Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedRoleElementOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleElementOperation> assignedRoleElementOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATION_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualification(String newQualification) {
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATION_ROLE__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATION_ROLE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATION_ROLE__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, CmPackage.USER__COLLABORATION_ROLE, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, CmPackage.USER__COLLABORATION_ROLE, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATION_ROLE__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleElementOperation> getAssignedRoleElementOperation() {
		if (assignedRoleElementOperation == null) {
			assignedRoleElementOperation = new EObjectContainmentEList<RoleElementOperation>(RoleElementOperation.class, this, CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION);
		}
		return assignedRoleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATION_ROLE__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, CmPackage.USER__COLLABORATION_ROLE, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATION_ROLE__USER:
				return basicSetUser(null, msgs);
			case CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				return ((InternalEList<?>)getAssignedRoleElementOperation()).basicRemove(otherEnd, msgs);
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
			case CmPackage.COLLABORATION_ROLE__QUALIFICATION:
				return getQualification();
			case CmPackage.COLLABORATION_ROLE__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				return getAssignedRoleElementOperation();
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
			case CmPackage.COLLABORATION_ROLE__QUALIFICATION:
				setQualification((String)newValue);
				return;
			case CmPackage.COLLABORATION_ROLE__USER:
				setUser((User)newValue);
				return;
			case CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				getAssignedRoleElementOperation().clear();
				getAssignedRoleElementOperation().addAll((Collection<? extends RoleElementOperation>)newValue);
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
			case CmPackage.COLLABORATION_ROLE__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case CmPackage.COLLABORATION_ROLE__USER:
				setUser((User)null);
				return;
			case CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				getAssignedRoleElementOperation().clear();
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
			case CmPackage.COLLABORATION_ROLE__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case CmPackage.COLLABORATION_ROLE__USER:
				return user != null;
			case CmPackage.COLLABORATION_ROLE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				return assignedRoleElementOperation != null && !assignedRoleElementOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (qualification: ");
		result.append(qualification);
		result.append(')');
		return result.toString();
	}

} //CollaborationRoleImpl
