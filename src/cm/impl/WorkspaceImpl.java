/**
 */
package cm.impl;

import cm.CmPackage;
import cm.Workspace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.WorkspaceImpl#getLinked <em>Linked</em>}</li>
 *   <li>{@link cm.impl.WorkspaceImpl#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link cm.impl.WorkspaceImpl#getInnerWorkspace <em>Inner Workspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkspaceImpl extends CollaborativeElementImpl implements Workspace {
	/**
	 * The cached value of the '{@link #getLinked() <em>Linked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinked()
	 * @generated
	 * @ordered
	 */
	protected EList<Workspace> linked;

	/**
	 * The cached value of the '{@link #getInnerWorkspace() <em>Inner Workspace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerWorkspace()
	 * @generated
	 * @ordered
	 */
	protected EList<Workspace> innerWorkspace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.WORKSPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Workspace> getLinked() {
		if (linked == null) {
			linked = new EObjectResolvingEList<Workspace>(Workspace.class, this, CmPackage.WORKSPACE__LINKED);
		}
		return linked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workspace getWorkspace() {
		if (eContainerFeatureID() != CmPackage.WORKSPACE__WORKSPACE) return null;
		return (Workspace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkspace(Workspace newWorkspace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkspace, CmPackage.WORKSPACE__WORKSPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkspace(Workspace newWorkspace) {
		if (newWorkspace != eInternalContainer() || (eContainerFeatureID() != CmPackage.WORKSPACE__WORKSPACE && newWorkspace != null)) {
			if (EcoreUtil.isAncestor(this, newWorkspace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkspace != null)
				msgs = ((InternalEObject)newWorkspace).eInverseAdd(this, CmPackage.WORKSPACE__INNER_WORKSPACE, Workspace.class, msgs);
			msgs = basicSetWorkspace(newWorkspace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmPackage.WORKSPACE__WORKSPACE, newWorkspace, newWorkspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Workspace> getInnerWorkspace() {
		if (innerWorkspace == null) {
			innerWorkspace = new EObjectContainmentWithInverseEList<Workspace>(Workspace.class, this, CmPackage.WORKSPACE__INNER_WORKSPACE, CmPackage.WORKSPACE__WORKSPACE);
		}
		return innerWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.WORKSPACE__WORKSPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkspace((Workspace)otherEnd, msgs);
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerWorkspace()).basicAdd(otherEnd, msgs);
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
			case CmPackage.WORKSPACE__WORKSPACE:
				return basicSetWorkspace(null, msgs);
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				return ((InternalEList<?>)getInnerWorkspace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CmPackage.WORKSPACE__WORKSPACE:
				return eInternalContainer().eInverseRemove(this, CmPackage.WORKSPACE__INNER_WORKSPACE, Workspace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CmPackage.WORKSPACE__LINKED:
				return getLinked();
			case CmPackage.WORKSPACE__WORKSPACE:
				return getWorkspace();
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				return getInnerWorkspace();
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
			case CmPackage.WORKSPACE__LINKED:
				getLinked().clear();
				getLinked().addAll((Collection<? extends Workspace>)newValue);
				return;
			case CmPackage.WORKSPACE__WORKSPACE:
				setWorkspace((Workspace)newValue);
				return;
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				getInnerWorkspace().clear();
				getInnerWorkspace().addAll((Collection<? extends Workspace>)newValue);
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
			case CmPackage.WORKSPACE__LINKED:
				getLinked().clear();
				return;
			case CmPackage.WORKSPACE__WORKSPACE:
				setWorkspace((Workspace)null);
				return;
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				getInnerWorkspace().clear();
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
			case CmPackage.WORKSPACE__LINKED:
				return linked != null && !linked.isEmpty();
			case CmPackage.WORKSPACE__WORKSPACE:
				return getWorkspace() != null;
			case CmPackage.WORKSPACE__INNER_WORKSPACE:
				return innerWorkspace != null && !innerWorkspace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkspaceImpl
