/**
 */
package cm;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.CollaborativeAssociation#isIsPermanent <em>Is Permanent</em>}</li>
 *   <li>{@link cm.CollaborativeAssociation#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link cm.CollaborativeAssociation#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getCollaborativeAssociation()
 * @model abstract="true"
 * @generated
 */
public interface CollaborativeAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Is Permanent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Permanent</em>' attribute.
	 * @see #setIsPermanent(boolean)
	 * @see cm.CmPackage#getCollaborativeAssociation_IsPermanent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsPermanent();

	/**
	 * Sets the value of the '{@link cm.CollaborativeAssociation#isIsPermanent <em>Is Permanent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Permanent</em>' attribute.
	 * @see #isIsPermanent()
	 * @generated
	 */
	void setIsPermanent(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see cm.CmPackage#getCollaborativeAssociation_LowerBound()
	 * @model default="1"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link cm.CollaborativeAssociation#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see cm.CmPackage#getCollaborativeAssociation_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link cm.CollaborativeAssociation#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

} // CollaborativeAssociation
