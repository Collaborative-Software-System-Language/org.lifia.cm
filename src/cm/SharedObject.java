/**
 */
package cm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.SharedObject#isLockable <em>Lockable</em>}</li>
 *   <li>{@link cm.SharedObject#isPersistent <em>Persistent</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getSharedObject()
 * @model
 * @generated
 */
public interface SharedObject extends CollaborativeElement {
	/**
	 * Returns the value of the '<em><b>Lockable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lockable</em>' attribute.
	 * @see #setLockable(boolean)
	 * @see cm.CmPackage#getSharedObject_Lockable()
	 * @model default="false"
	 * @generated
	 */
	boolean isLockable();

	/**
	 * Sets the value of the '{@link cm.SharedObject#isLockable <em>Lockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockable</em>' attribute.
	 * @see #isLockable()
	 * @generated
	 */
	void setLockable(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see cm.CmPackage#getSharedObject_Persistent()
	 * @model default="false"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link cm.SharedObject#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

} // SharedObject
