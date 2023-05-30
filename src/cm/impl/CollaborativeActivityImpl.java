/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborationRole;
import cm.CollaborativeActivity;

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
import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeActivityImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityImpl#getMyRoles <em>My Roles</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityImpl#isIsPersonal <em>Is Personal</em>}</li>
 *   <li>{@link cm.impl.CollaborativeActivityImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeActivityImpl extends CollaborativeElementImpl implements CollaborativeActivity {
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected StateMachine protocol;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyRoles() <em>My Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationRole> myRoles;

	/**
	 * The default value of the '{@link #isIsPersonal() <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersonal() <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersonal = IS_PERSONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachine getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (StateMachine)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(StateMachine newProtocol) {
		StateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollaborationRole> getMyRoles() {
		if (myRoles == null) {
			myRoles = new EObjectResolvingEList<CollaborationRole>(CollaborationRole.class, this, CmPackage.COLLABORATIVE_ACTIVITY__MY_ROLES);
		}
		return myRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPersonal() {
		return isPersonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPersonal(boolean newIsPersonal) {
		boolean oldIsPersonal = isPersonal;
		isPersonal = newIsPersonal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ACTIVITY__IS_PERSONAL, oldIsPersonal, isPersonal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, CmPackage.COLLABORATIVE_ACTIVITY__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_ACTIVITY__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case CmPackage.COLLABORATIVE_ACTIVITY__PURPOSE:
				return getPurpose();
			case CmPackage.COLLABORATIVE_ACTIVITY__MY_ROLES:
				return getMyRoles();
			case CmPackage.COLLABORATIVE_ACTIVITY__IS_PERSONAL:
				return isIsPersonal();
			case CmPackage.COLLABORATIVE_ACTIVITY__EVENT:
				return getEvent();
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
			case CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL:
				setProtocol((StateMachine)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__PURPOSE:
				setPurpose((String)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__MY_ROLES:
				getMyRoles().clear();
				getMyRoles().addAll((Collection<? extends CollaborationRole>)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__IS_PERSONAL:
				setIsPersonal((Boolean)newValue);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
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
			case CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL:
				setProtocol((StateMachine)null);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__MY_ROLES:
				getMyRoles().clear();
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__IS_PERSONAL:
				setIsPersonal(IS_PERSONAL_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ACTIVITY__EVENT:
				getEvent().clear();
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
			case CmPackage.COLLABORATIVE_ACTIVITY__PROTOCOL:
				return protocol != null;
			case CmPackage.COLLABORATIVE_ACTIVITY__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case CmPackage.COLLABORATIVE_ACTIVITY__MY_ROLES:
				return myRoles != null && !myRoles.isEmpty();
			case CmPackage.COLLABORATIVE_ACTIVITY__IS_PERSONAL:
				return isPersonal != IS_PERSONAL_EDEFAULT;
			case CmPackage.COLLABORATIVE_ACTIVITY__EVENT:
				return event != null && !event.isEmpty();
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", isPersonal: ");
		result.append(isPersonal);
		result.append(')');
		return result.toString();
	}

} //CollaborativeActivityImpl
