/**
 */
package cm.impl;

import cm.CmPackage;
import cm.ElementOperation;
import cm.RoleElementOperation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.CallEvent;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Element Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.RoleElementOperationImpl#getElementOperation <em>Element Operation</em>}</li>
 *   <li>{@link cm.impl.RoleElementOperationImpl#getCallEvent <em>Call Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleElementOperationImpl extends ClassImpl implements RoleElementOperation {
	/**
	 * The cached value of the '{@link #getElementOperation() <em>Element Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementOperation()
	 * @generated
	 * @ordered
	 */
	protected ElementOperation elementOperation;

	/**
	 * The cached value of the '{@link #getCallEvent() <em>Call Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallEvent()
	 * @generated
	 * @ordered
	 */
	protected CallEvent callEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleElementOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.ROLE_ELEMENT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementOperation getElementOperation() {
		if (elementOperation != null && elementOperation.eIsProxy()) {
			InternalEObject oldElementOperation = (InternalEObject)elementOperation;
			elementOperation = (ElementOperation)eResolveProxy(oldElementOperation);
			if (elementOperation != oldElementOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION, oldElementOperation, elementOperation));
			}
		}
		return elementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementOperation basicGetElementOperation() {
		return elementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementOperation(ElementOperation newElementOperation) {
		ElementOperation oldElementOperation = elementOperation;
		elementOperation = newElementOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION, oldElementOperation, elementOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallEvent getCallEvent() {
		return callEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallEvent(CallEvent newCallEvent, NotificationChain msgs) {
		CallEvent oldCallEvent = callEvent;
		callEvent = newCallEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT, oldCallEvent, newCallEvent);
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
	public void setCallEvent(CallEvent newCallEvent) {
		if (newCallEvent != callEvent) {
			NotificationChain msgs = null;
			if (callEvent != null)
				msgs = ((InternalEObject)callEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT, null, msgs);
			if (newCallEvent != null)
				msgs = ((InternalEObject)newCallEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT, null, msgs);
			msgs = basicSetCallEvent(newCallEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT, newCallEvent, newCallEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		if (isSetOwner())    if (elementOperation != null)     return "("+((org.eclipse.uml2.uml.NamedElement) getOwner()).getName().trim()+")"+elementOperation.getName().trim();    else     return "("+((org.eclipse.uml2.uml.NamedElement) getOwner()).getName().trim()+") No ElementOperation";   return "No RoleElementOperation";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT:
				return basicSetCallEvent(null, msgs);
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
			case CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION:
				if (resolve) return getElementOperation();
				return basicGetElementOperation();
			case CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT:
				return getCallEvent();
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
			case CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION:
				setElementOperation((ElementOperation)newValue);
				return;
			case CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT:
				setCallEvent((CallEvent)newValue);
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
			case CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION:
				setElementOperation((ElementOperation)null);
				return;
			case CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT:
				setCallEvent((CallEvent)null);
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
			case CmPackage.ROLE_ELEMENT_OPERATION__ELEMENT_OPERATION:
				return elementOperation != null;
			case CmPackage.ROLE_ELEMENT_OPERATION__CALL_EVENT:
				return callEvent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CmPackage.ROLE_ELEMENT_OPERATION___GET_NAME:
				return getName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleElementOperationImpl
