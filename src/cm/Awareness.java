/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Awareness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.Awareness#getKind <em>Kind</em>}</li>
 *   <li>{@link cm.Awareness#getSource <em>Source</em>}</li>
 *   <li>{@link cm.Awareness#getShownIn <em>Shown In</em>}</li>
 *   <li>{@link cm.Awareness#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link cm.Awareness#isTransient <em>Transient</em>}</li>
 *   <li>{@link cm.Awareness#isModal <em>Modal</em>}</li>
 *   <li>{@link cm.Awareness#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link cm.Awareness#getPlayer <em>Player</em>}</li>
 *   <li>{@link cm.Awareness#getHapticIndicator <em>Haptic Indicator</em>}</li>
 *   <li>{@link cm.Awareness#getPriority <em>Priority</em>}</li>
 *   <li>{@link cm.Awareness#getOrder <em>Order</em>}</li>
 *   <li>{@link cm.Awareness#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getAwareness()
 * @model
 * @generated
 */
public interface Awareness extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(AwarenessKind)
	 * @see cm.CmPackage#getAwareness_Kind()
	 * @model
	 * @generated
	 */
	AwarenessKind getKind();

	/**
	 * Sets the value of the '{@link cm.Awareness#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AwarenessKind value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see cm.CmPackage#getAwareness_Source()
	 * @model
	 * @generated
	 */
	EList<Event> getSource();

	/**
	 * Returns the value of the '<em><b>Shown In</b></em>' reference list.
	 * The list contents are of type {@link cm.CollaborativeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shown In</em>' reference list.
	 * @see cm.CmPackage#getAwareness_ShownIn()
	 * @model required="true"
	 * @generated
	 */
	EList<CollaborativeElement> getShownIn();

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #setSynchronous(boolean)
	 * @see cm.CmPackage#getAwareness_Synchronous()
	 * @model default="true"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link cm.Awareness#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see cm.CmPackage#getAwareness_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link cm.Awareness#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Modal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modal</em>' attribute.
	 * @see #setModal(boolean)
	 * @see cm.CmPackage#getAwareness_Modal()
	 * @model default="false"
	 * @generated
	 */
	boolean isModal();

	/**
	 * Sets the value of the '{@link cm.Awareness#isModal <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modal</em>' attribute.
	 * @see #isModal()
	 * @generated
	 */
	void setModal(boolean value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' attribute.
	 * @see cm.EnumInteraction
	 * @see #setInteraction(EnumInteraction)
	 * @see cm.CmPackage#getAwareness_Interaction()
	 * @model
	 * @generated
	 */
	EnumInteraction getInteraction();

	/**
	 * Sets the value of the '{@link cm.Awareness#getInteraction <em>Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' attribute.
	 * @see cm.EnumInteraction
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(EnumInteraction value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumPlayerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' attribute.
	 * @see cm.EnumPlayerKind
	 * @see #setPlayer(EnumPlayerKind)
	 * @see cm.CmPackage#getAwareness_Player()
	 * @model
	 * @generated
	 */
	EnumPlayerKind getPlayer();

	/**
	 * Sets the value of the '{@link cm.Awareness#getPlayer <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' attribute.
	 * @see cm.EnumPlayerKind
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(EnumPlayerKind value);

	/**
	 * Returns the value of the '<em><b>Haptic Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link cm.HapticIndicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haptic Indicator</em>' containment reference list.
	 * @see cm.CmPackage#getAwareness_HapticIndicator()
	 * @model containment="true"
	 * @generated
	 */
	EList<HapticIndicator> getHapticIndicator();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.HapticRolePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see cm.HapticRolePriority
	 * @see #setPriority(HapticRolePriority)
	 * @see cm.CmPackage#getAwareness_Priority()
	 * @model
	 * @generated
	 */
	HapticRolePriority getPriority();

	/**
	 * Sets the value of the '{@link cm.Awareness#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see cm.HapticRolePriority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(HapticRolePriority value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.HapticRoleOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see cm.HapticRoleOrder
	 * @see #setOrder(HapticRoleOrder)
	 * @see cm.CmPackage#getAwareness_Order()
	 * @model
	 * @generated
	 */
	HapticRoleOrder getOrder();

	/**
	 * Sets the value of the '{@link cm.Awareness#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see cm.HapticRoleOrder
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(HapticRoleOrder value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.HapticRoleEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see cm.HapticRoleEffect
	 * @see #setEffect(HapticRoleEffect)
	 * @see cm.CmPackage#getAwareness_Effect()
	 * @model
	 * @generated
	 */
	HapticRoleEffect getEffect();

	/**
	 * Sets the value of the '{@link cm.Awareness#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see cm.HapticRoleEffect
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(HapticRoleEffect value);

} // Awareness
