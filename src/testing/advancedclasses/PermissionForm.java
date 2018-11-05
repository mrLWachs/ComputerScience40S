
/** required package class namespace */
package testing.advancedclasses;


/**
 * PermissionForm - interface enforcing the rules of a school permission form
 *
 * @author Mr. Wachs 
 * @since 5-Nov-2018 
 */
public interface PermissionForm 
{

    /**
     * The form has been signed
     */
    static final boolean SIGNED = true;
    
    /**
     * The form is still unsigned
     */
    static final boolean NOT_SIGNED = false;
        
    /**
     * Signing the permission form
     */
    void sign();
    
    /**
     * Determines if the form is signed or not
     * 
     * @return for is signed or not
     */
    boolean hasBeenSigned();
    
}
