
/** required package class namespace */
package testing.advancedclasses;


/**
 * PermissionForm.java - interface enforcing the rules of a permission form
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:41:27 PM
 */
public interface PermissionForm 
{

    /**
     * Represents a signed permission form
     */
    static final boolean SIGNED = true;
    
    /**
     * Represents an unsigned permission form
     */
    static final boolean NOT_SIGNED = false; 
    
    /**
     * Signing the permission form
     */
    void sign();
    
    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    boolean haveYouGotItSigned();
    
}