/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.Workspace#getLinked <em>Linked</em>}</li>
 *   <li>{@link cm.Workspace#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link cm.Workspace#getInnerWorkspace <em>Inner Workspace</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends CollaborativeElement {
	/**
	 * Returns the value of the '<em><b>Linked</b></em>' reference list.
	 * The list contents are of type {@link cm.Workspace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked</em>' reference list.
	 * @see cm.CmPackage#getWorkspace_Linked()
	 * @model
	 * @generated
	 */
	EList<Workspace> getLinked();

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cm.Workspace#getInnerWorkspace <em>Inner Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' container reference.
	 * @see #setWorkspace(Workspace)
	 * @see cm.CmPackage#getWorkspace_Workspace()
	 * @see cm.Workspace#getInnerWorkspace
	 * @model opposite="innerWorkspace" transient="false"
	 * @generated
	 */
	Workspace getWorkspace();

	/**
	 * Sets the value of the '{@link cm.Workspace#getWorkspace <em>Workspace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' container reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(Workspace value);

	/**
	 * Returns the value of the '<em><b>Inner Workspace</b></em>' containment reference list.
	 * The list contents are of type {@link cm.Workspace}.
	 * It is bidirectional and its opposite is '{@link cm.Workspace#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Workspace</em>' containment reference list.
	 * @see cm.CmPackage#getWorkspace_InnerWorkspace()
	 * @see cm.Workspace#getWorkspace
	 * @model opposite="workspace" containment="true"
	 * @generated
	 */
	EList<Workspace> getInnerWorkspace();

} // Workspace
