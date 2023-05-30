/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeElement#getDescription <em>Description</em>}</li>
 *   <li>{@link cm.CollaborativeElement#isSincrono <em>Sincrono</em>}</li>
 *   <li>{@link cm.CollaborativeElement#getElementOperation <em>Element Operation</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeElement()
 * @model abstract="true"
 * @generated
 */
public interface CollaborativeElement extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cm.CmPackage#getCollaborativeElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cm.CollaborativeElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sincrono</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sincrono</em>' attribute.
	 * @see #setSincrono(boolean)
	 * @see cm.CmPackage#getCollaborativeElement_Sincrono()
	 * @model default="true"
	 * @generated
	 */
	boolean isSincrono();

	/**
	 * Sets the value of the '{@link cm.CollaborativeElement#isSincrono <em>Sincrono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sincrono</em>' attribute.
	 * @see #isSincrono()
	 * @generated
	 */
	void setSincrono(boolean value);

	/**
	 * Returns the value of the '<em><b>Element Operation</b></em>' containment reference list.
	 * The list contents are of type {@link cm.ElementOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Operation</em>' containment reference list.
	 * @see cm.CmPackage#getCollaborativeElement_ElementOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementOperation> getElementOperation();

} // CollaborativeElement
