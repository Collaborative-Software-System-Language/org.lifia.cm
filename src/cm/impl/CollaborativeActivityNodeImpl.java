/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeActivity;
import cm.CollaborativeActivityNode;
import cm.EnumActivityKind;
import cm.EnumGroupKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.Event;

import org.eclipse.uml2.uml.internal.impl.ActivityNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeActivityNodeImpl#getCollaborativeActivity <em>Collaborative Activity</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityNodeImpl#getMyEvent <em>My Event</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityNodeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityNodeImpl#getGroupKind <em>Group Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeActivityNodeImpl extends ActivityNodeImpl implements CollaborativeActivityNode {
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
	 * The cached value of the '{@link #getMyEvent() <em>My Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> myEvent;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final EnumActivityKind KIND_EDEFAULT = EnumActivityKind.UNDEFINED_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected EnumActivityKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupKind() <em>Group Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupKind()
	 * @generated
	 * @ordered
	 */
	protected static final EnumGroupKind GROUP_KIND_EDEFAULT = EnumGroupKind.UNDEFINED_LITERAL;

	/**
	 * The cached value of the '{@link #getGroupKind() <em>Group Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupKind()
	 * @generated
	 * @ordered
	 */
	protected EnumGroupKind groupKind = GROUP_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_ACTIVITY_NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY, oldCollaborativeActivity, collaborativeActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY, oldCollaborativeActivity, collaborativeActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getMyEvent() {
		if (myEvent == null) {
			myEvent = new EObjectResolvingEList<Event>(Event.class, this, CmPackage.COLLABORATIVE_ACTIVITY_NODE__MY_EVENT);
		}
		return myEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumActivityKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(EnumActivityKind newKind) {
		EnumActivityKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY_NODE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumGroupKind getGroupKind() {
		return groupKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupKind(EnumGroupKind newGroupKind) {
		EnumGroupKind oldGroupKind = groupKind;
		groupKind = newGroupKind == null ? GROUP_KIND_EDEFAULT : newGroupKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND, oldGroupKind, groupKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY:
				if (resolve) return getCollaborativeActivity();
				return basicGetCollaborativeActivity();
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__MY_EVENT:
				return getMyEvent();
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__KIND:
				return getKind();
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND:
				return getGroupKind();
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
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY:
				setCollaborativeActivity((CollaborativeActivity)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__MY_EVENT:
				getMyEvent().clear();
				getMyEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__KIND:
				setKind((EnumActivityKind)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND:
				setGroupKind((EnumGroupKind)newValue);
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
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY:
				setCollaborativeActivity((CollaborativeActivity)null);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__MY_EVENT:
				getMyEvent().clear();
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND:
				setGroupKind(GROUP_KIND_EDEFAULT);
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
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__COLLABORATIVE_ACTIVITY:
				return collaborativeActivity != null;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__MY_EVENT:
				return myEvent != null && !myEvent.isEmpty();
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__KIND:
				return kind != KIND_EDEFAULT;
			case CmPackage.COLLABORATIVE_ACTIVITY_NODE__GROUP_KIND:
				return groupKind != GROUP_KIND_EDEFAULT;
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
		result.append(", groupKind: ");
		result.append(groupKind);
		result.append(')');
		return result.toString();
	}

} //CollaborativeActivityNodeImpl
