/**
 */
package cm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.Tool#getReference <em>Reference</em>}</li>
 *   <li>{@link cm.Tool#getURL <em>URL</em>}</li>
 *   <li>{@link cm.Tool#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends CollaborativeElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see cm.CmPackage#getTool_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link cm.Tool#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see cm.CmPackage#getTool_URL()
	 * @model
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link cm.Tool#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The literals are from the enumeration {@link cm.EnumDisplay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see cm.EnumDisplay
	 * @see #setDisplay(EnumDisplay)
	 * @see cm.CmPackage#getTool_Display()
	 * @model
	 * @generated
	 */
	EnumDisplay getDisplay();

	/**
	 * Sets the value of the '{@link cm.Tool#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see cm.EnumDisplay
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(EnumDisplay value);

} // Tool
