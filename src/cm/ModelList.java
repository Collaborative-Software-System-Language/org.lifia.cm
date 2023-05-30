/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.ModelList#getCollaborativeModelList <em>Collaborative Model List</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getModelList()
 * @model
 * @generated
 */
public interface ModelList extends EObject {
	/**
	 * Returns the value of the '<em><b>Collaborative Model List</b></em>' containment reference list.
	 * The list contents are of type {@link cm.CollaborativeModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborative Model List</em>' containment reference list.
	 * @see cm.CmPackage#getModelList_CollaborativeModelList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollaborativeModel> getCollaborativeModelList();

} // ModelList
