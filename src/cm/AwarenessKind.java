/**
 */
package cm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Awareness Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cm.AwarenessKind#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see cm.CmPackage#getAwarenessKind()
 * @model
 * @generated
 */
public interface AwarenessKind extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute list.
	 * The list contents are of type {@link cm.AwarenessElement}.
	 * The literals are from the enumeration {@link cm.AwarenessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute list.
	 * @see cm.AwarenessElement
	 * @see cm.CmPackage#getAwarenessKind_Elements()
	 * @model
	 * @generated
	 */
	EList<AwarenessElement> getElements();

} // AwarenessKind
