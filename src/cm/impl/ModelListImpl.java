/**
 */
package cm.impl;

import cm.CmPackage;
import cm.CollaborativeModel;
import cm.ModelList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cm.impl.ModelListImpl#getCollaborativeModelList <em>Collaborative Model List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelListImpl extends MinimalEObjectImpl.Container implements ModelList {
	/**
	 * The cached value of the '{@link #getCollaborativeModelList() <em>Collaborative Model List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborativeModelList()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborativeModel> collaborativeModelList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmPackage.Literals.MODEL_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollaborativeModel> getCollaborativeModelList() {
		if (collaborativeModelList == null) {
			collaborativeModelList = new EObjectContainmentEList<CollaborativeModel>(CollaborativeModel.class, this, CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST);
		}
		return collaborativeModelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST:
				return ((InternalEList<?>)getCollaborativeModelList()).basicRemove(otherEnd, msgs);
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
			case CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST:
				return getCollaborativeModelList();
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
			case CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST:
				getCollaborativeModelList().clear();
				getCollaborativeModelList().addAll((Collection<? extends CollaborativeModel>)newValue);
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
			case CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST:
				getCollaborativeModelList().clear();
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
			case CmPackage.MODEL_LIST__COLLABORATIVE_MODEL_LIST:
				return collaborativeModelList != null && !collaborativeModelList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelListImpl
