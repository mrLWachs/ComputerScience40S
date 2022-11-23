
/** Required package class namespace */
package testing.classes;


/**
 * PermissionForm.java - enforcing "the rules" of a permission form
 *
 * @author Mr. Wachs
 * @since 23-Nov-2022, 11:05:05 AM
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
