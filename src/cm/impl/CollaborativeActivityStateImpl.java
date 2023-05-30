/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeActivity;
import cm.CollaborativeActivityState;
import cm.EnumSubActivityKind;
import cm.RoleElementOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.internal.impl.VertexImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Activity State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeActivityStateImpl#getCollaborativeActivity <em>Collaborative Activity</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityStateImpl#getAssignedRoleElementOperation <em>Assigned Role Element Operation</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityStateImpl#getOutgoingRoleElementOperation <em>Outgoing Role Element Operation</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityStateImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityStateImpl#getMyEvent <em>My Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeActivityStateImpl extends VertexImpl implements CollaborativeActivityState {
	/**
	 * The cached value of the '{@link #getCollaborativeActivity() <em>Collaborative Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborativeActivity()
	 * @generated
	 * @ordered
	 */
	protected CollaborativeActivity collaborativeActivity;

	/**
	 * The cached value of the '{@link #getAssignedRoleElementOperation() <em>Assigned Role Element Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedRoleElementOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleElementOperation> assignedRoleElementOperation;

	/**
	 * The cached value of the '{@link #getOutgoingRoleElementOperation() <em>Outgoing Role Element Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingRoleElementOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleElementOperation> outgoingRoleElementOperation;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSubActivityKind KIND_EDEFAULT = EnumSubActivityKind.UNDEFINED_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EnumSubActivityKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyEvent() <em>My Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> myEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeActivityStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_ACTIVITY_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeActivity getCollaborativeActivity() {
		if (collaborativeActivity != null && collaborativeActivity.eIsProxy()) {
			InternalEObject oldCollaborativeActivity = (InternalEObject)collaborativeActivity;
			collaborativeActivity = (CollaborativeActivity)eResolveProxy(oldCollaborativeActivity);
			if (collaborativeActivity != oldCollaborativeActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY, oldCollaborativeActivity, collaborativeActivity));
			}
		}
		return collaborativeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeActivity basicGetCollaborativeActivity() {
		return collaborativeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollaborativeActivity(CollaborativeActivity newCollaborativeActivity) {
		CollaborativeActivity oldCollaborativeActivity = collaborativeActivity;
		collaborativeActivity = newCollaborativeActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY, oldCollaborativeActivity, collaborativeActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleElementOperation> getAssignedRoleElementOperation() {
		if (assignedRoleElementOperation == null) {
			assignedRoleElementOperation = new EObjectResolvingEList<RoleElementOperation>(RoleElementOperation.class, this, CmPackage.COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION);
		}
		return assignedRoleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleElementOperation> getOutgoingRoleElementOperation() {
		if (outgoingRoleElementOperation == null) {
			outgoingRoleElementOperation = new EObjectResolvingEList<RoleElementOperation>(RoleElementOperation.class, this, CmPackage.COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION);
		}
		return outgoingRoleElementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumSubActivityKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(EnumSubActivityKind newKind) {
		EnumSubActivityKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY_STATE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getMyEvent() {
		if (myEvent == null) {
			myEvent = new EObjectContainmentEList<Event>(Event.class, this, CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT);
		}
		return myEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT:
				return ((InternalEList<?>)getMyEvent()).basicRemove(otherEnd, msgs);
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
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY:
				if (resolve) return getCollaborativeActivity();
				return basicGetCollaborativeActivity();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				return getAssignedRoleElementOperation();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION:
				return getOutgoingRoleElementOperation();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__KIND:
				return getKind();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT:
				return getMyEvent();
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
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY:
				setCollaborativeActivity((CollaborativeActivity)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				getAssignedRoleElementOperation().clear();
				getAssignedRoleElementOperation().addAll((Collection<? extends RoleElementOperation>)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION:
				getOutgoingRoleElementOperation().clear();
				getOutgoingRoleElementOperation().addAll((Collection<? extends RoleElementOperation>)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__KIND:
				setKind((EnumSubActivityKind)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT:
				getMyEvent().clear();
				getMyEvent().addAll((Collection<? extends Event>)newValue);
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
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY:
				setCollaborativeActivity((CollaborativeActivity)null);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				getAssignedRoleElementOperation().clear();
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION:
				getOutgoingRoleElementOperation().clear();
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT:
				getMyEvent().clear();
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
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__COLLABORATIVE_ACTIVITY:
				return collaborativeActivity != null;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__ASSIGNED_ROLE_ELEMENT_OPERATION:
				return assignedRoleElementOperation != null && !assignedRoleElementOperation.isEmpty();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__OUTGOING_ROLE_ELEMENT_OPERATION:
				return outgoingRoleElementOperation != null && !outgoingRoleElementOperation.isEmpty();
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__KIND:
				return kind != KIND_EDEFAULT;
			case CmPackage.COLLABORATIVE_ACTIVITY_STATE__MY_EVENT:
				return myEvent != null && !myEvent.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //CollaborativeActivityStateImpl
