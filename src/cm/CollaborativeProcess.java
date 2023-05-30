/**
 */
package cm;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeProcess#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeProcess()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface CollaborativeProcess extends Activity {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see cm.CmPackage#getCollaborativeProcess_Activity()
	 * @model derived="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link cm.CollaborativeProcess#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // CollaborativeProcess
