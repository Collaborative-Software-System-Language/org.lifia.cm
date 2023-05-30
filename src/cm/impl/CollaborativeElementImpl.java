/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeElement;
import cm.ElementOperation;

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
 * An implementation of the model object '<em><b>Collaborative Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.CollaborativeElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cm.impl.CollaborativeElementImpl#isSincrono <em>Sincrono</em>}</li>
 *   <li>{@link cm.impl.CollaborativeElementImpl#getElementOperation <em>Element Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CollaborativeElementImpl extends ClassImpl implements CollaborativeElement {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSincrono() <em>Sincrono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSincrono()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINCRONO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSincrono() <em>Sincrono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSincrono()
	 * @generated
	 * @ordered
	 */
	protected boolean sincrono = SINCRONO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementOperation() <em>Element Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementOperation> elementOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.COLLABORATIVE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSincrono() {
		return sincrono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSincrono(boolean newSincrono) {
		boolean oldSincrono = sincrono;
		sincrono = newSincrono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.COLLABORATIVE_ELEMENT__SINCRONO, oldSincrono, sincrono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementOperation> getElementOperation() {
		if (elementOperation == null) {
			elementOperation = new EObjectContainmentEList<ElementOperation>(ElementOperation.class, this, CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION);
		}
		return elementOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION:
				return ((InternalEList<?>)getElementOperation()).basicRemove(otherEnd, msgs);
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
			case CmPackage.COLLABORATIVE_ELEMENT__DESCRIPTION:
				return getDescription();
			case CmPackage.COLLABORATIVE_ELEMENT__SINCRONO:
				return isSincrono();
			case CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION:
				return getElementOperation();
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
			case CmPackage.COLLABORATIVE_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CmPackage.COLLABORATIVE_ELEMENT__SINCRONO:
				setSincrono((Boolean)newValue);
				return;
			case CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION:
				getElementOperation().clear();
				getElementOperation().addAll((Collection<? extends ElementOperation>)newValue);
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
			case CmPackage.COLLABORATIVE_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ELEMENT__SINCRONO:
				setSincrono(SINCRONO_EDEFAULT);
				return;
			case CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION:
				getElementOperation().clear();
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
			case CmPackage.COLLABORATIVE_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CmPackage.COLLABORATIVE_ELEMENT__SINCRONO:
				return sincrono != SINCRONO_EDEFAULT;
			case CmPackage.COLLABORATIVE_ELEMENT__ELEMENT_OPERATION:
				return elementOperation != null && !elementOperation.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", sincrono: ");
		result.append(sincrono);
		result.append(')');
		return result.toString();
	}

} //CollaborativeElementImpl
