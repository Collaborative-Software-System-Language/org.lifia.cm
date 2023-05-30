/**
 */
package cm.impl;

import cm.Awareness;
import cm.AwarenessKind;
import cm.CmPackage;
import cm.CollaborativeElement;
import cm.EnumInteraction;
import cm.EnumPlayerKind;
import cm.HapticIndicator;
import cm.HapticRoleEffect;
import cm.HapticRoleOrder;
import cm.HapticRolePriority;

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

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Awareness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.AwarenessImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getShownIn <em>Shown In</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#isModal <em>Modal</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getHapticIndicator <em>Haptic Indicator</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link cm.impl.AwarenessImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwarenessImpl extends ClassImpl implements Awareness {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected AwarenessKind kind;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> source;

	/**
	 * The cached value of the '{@link #getShownIn() <em>Shown In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShownIn()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborativeElement> shownIn;

	/**
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected boolean modal = MODAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final EnumInteraction INTERACTION_EDEFAULT = EnumInteraction.UNDEFINED;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EnumInteraction interaction = INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayer() <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected static final EnumPlayerKind PLAYER_EDEFAULT = EnumPlayerKind.UNDEFINED;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EnumPlayerKind player = PLAYER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHapticIndicator() <em>Haptic Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHapticIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<HapticIndicator> hapticIndicator;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final HapticRolePriority PRIORITY_EDEFAULT = HapticRolePriority.PRIMARY;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected HapticRolePriority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final HapticRoleOrder ORDER_EDEFAULT = HapticRoleOrder.INITIAL;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected HapticRoleOrder order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final HapticRoleEffect EFFECT_EDEFAULT = HapticRoleEffect.REINFORCEMENT;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected HapticRoleEffect effect = EFFECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwarenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.AWARENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AwarenessKind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (AwarenessKind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.AWARENESS__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwarenessKind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(AwarenessKind newKind) {
		AwarenessKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Event>(Event.class, this, CmPackage.AWARENESS__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollaborativeElement> getShownIn() {
		if (shownIn == null) {
			shownIn = new EObjectResolvingEList<CollaborativeElement>(CollaborativeElement.class, this, CmPackage.AWARENESS__SHOWN_IN);
		}
		return shownIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__SYNCHRONOUS, oldSynchronous, synchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModal() {
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModal(boolean newModal) {
		boolean oldModal = modal;
		modal = newModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__MODAL, oldModal, modal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumInteraction getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteraction(EnumInteraction newInteraction) {
		EnumInteraction oldInteraction = interaction;
		interaction = newInteraction == null ? INTERACTION_EDEFAULT : newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumPlayerKind getPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(EnumPlayerKind newPlayer) {
		EnumPlayerKind oldPlayer = player;
		player = newPlayer == null ? PLAYER_EDEFAULT : newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HapticIndicator> getHapticIndicator() {
		if (hapticIndicator == null) {
			hapticIndicator = new EObjectContainmentEList<HapticIndicator>(HapticIndicator.class, this, CmPackage.AWARENESS__HAPTIC_INDICATOR);
		}
		return hapticIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HapticRolePriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(HapticRolePriority newPriority) {
		HapticRolePriority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HapticRoleOrder getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(HapticRoleOrder newOrder) {
		HapticRoleOrder oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HapticRoleEffect getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(HapticRoleEffect newEffect) {
		HapticRoleEffect oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.AWARENESS__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.AWARENESS__HAPTIC_INDICATOR:
				return ((InternalEList<?>)getHapticIndicator()).basicRemove(otherEnd, msgs);
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
			case CmPackage.AWARENESS__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case CmPackage.AWARENESS__SOURCE:
				return getSource();
			case CmPackage.AWARENESS__SHOWN_IN:
				return getShownIn();
			case CmPackage.AWARENESS__SYNCHRONOUS:
				return isSynchronous();
			case CmPackage.AWARENESS__TRANSIENT:
				return isTransient();
			case CmPackage.AWARENESS__MODAL:
				return isModal();
			case CmPackage.AWARENESS__INTERACTION:
				return getInteraction();
			case CmPackage.AWARENESS__PLAYER:
				return getPlayer();
			case CmPackage.AWARENESS__HAPTIC_INDICATOR:
				return getHapticIndicator();
			case CmPackage.AWARENESS__PRIORITY:
				return getPriority();
			case CmPackage.AWARENESS__ORDER:
				return getOrder();
			case CmPackage.AWARENESS__EFFECT:
				return getEffect();
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
			case CmPackage.AWARENESS__KIND:
				setKind((AwarenessKind)newValue);
				return;
			case CmPackage.AWARENESS__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Event>)newValue);
				return;
			case CmPackage.AWARENESS__SHOWN_IN:
				getShownIn().clear();
				getShownIn().addAll((Collection<? extends CollaborativeElement>)newValue);
				return;
			case CmPackage.AWARENESS__SYNCHRONOUS:
				setSynchronous((Boolean)newValue);
				return;
			case CmPackage.AWARENESS__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case CmPackage.AWARENESS__MODAL:
				setModal((Boolean)newValue);
				return;
			case CmPackage.AWARENESS__INTERACTION:
				setInteraction((EnumInteraction)newValue);
				return;
			case CmPackage.AWARENESS__PLAYER:
				setPlayer((EnumPlayerKind)newValue);
				return;
			case CmPackage.AWARENESS__HAPTIC_INDICATOR:
				getHapticIndicator().clear();
				getHapticIndicator().addAll((Collection<? extends HapticIndicator>)newValue);
				return;
			case CmPackage.AWARENESS__PRIORITY:
				setPriority((HapticRolePriority)newValue);
				return;
			case CmPackage.AWARENESS__ORDER:
				setOrder((HapticRoleOrder)newValue);
				return;
			case CmPackage.AWARENESS__EFFECT:
				setEffect((HapticRoleEffect)newValue);
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
			case CmPackage.AWARENESS__KIND:
				setKind((AwarenessKind)null);
				return;
			case CmPackage.AWARENESS__SOURCE:
				getSource().clear();
				return;
			case CmPackage.AWARENESS__SHOWN_IN:
				getShownIn().clear();
				return;
			case CmPackage.AWARENESS__SYNCHRONOUS:
				setSynchronous(SYNCHRONOUS_EDEFAULT);
				return;
			case CmPackage.AWARENESS__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case CmPackage.AWARENESS__MODAL:
				setModal(MODAL_EDEFAULT);
				return;
			case CmPackage.AWARENESS__INTERACTION:
				setInteraction(INTERACTION_EDEFAULT);
				return;
			case CmPackage.AWARENESS__PLAYER:
				setPlayer(PLAYER_EDEFAULT);
				return;
			case CmPackage.AWARENESS__HAPTIC_INDICATOR:
				getHapticIndicator().clear();
				return;
			case CmPackage.AWARENESS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CmPackage.AWARENESS__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case CmPackage.AWARENESS__EFFECT:
				setEffect(EFFECT_EDEFAULT);
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
			case CmPackage.AWARENESS__KIND:
				return kind != null;
			case CmPackage.AWARENESS__SOURCE:
				return source != null && !source.isEmpty();
			case CmPackage.AWARENESS__SHOWN_IN:
				return shownIn != null && !shownIn.isEmpty();
			case CmPackage.AWARENESS__SYNCHRONOUS:
				return synchronous != SYNCHRONOUS_EDEFAULT;
			case CmPackage.AWARENESS__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case CmPackage.AWARENESS__MODAL:
				return modal != MODAL_EDEFAULT;
			case CmPackage.AWARENESS__INTERACTION:
				return interaction != INTERACTION_EDEFAULT;
			case CmPackage.AWARENESS__PLAYER:
				return player != PLAYER_EDEFAULT;
			case CmPackage.AWARENESS__HAPTIC_INDICATOR:
				return hapticIndicator != null && !hapticIndicator.isEmpty();
			case CmPackage.AWARENESS__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case CmPackage.AWARENESS__ORDER:
				return order != ORDER_EDEFAULT;
			case CmPackage.AWARENESS__EFFECT:
				return effect != EFFECT_EDEFAULT;
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
		result.append(" (synchronous: ");
		result.append(synchronous);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", modal: ");
		result.append(modal);
		result.append(", interaction: ");
		result.append(interaction);
		result.append(", player: ");
		result.append(player);
		result.append(", priority: ");
		result.append(priority);
		result.append(", order: ");
		result.append(order);
		result.append(", effect: ");
		result.append(effect);
		result.append(')');
		return result.toString();
	}

} //AwarenessImpl
