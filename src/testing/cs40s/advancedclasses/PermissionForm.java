
/** Required package class namespace */
package testing.cs40s.advancedclasses;


/**
 * PermissionForm.java - enforcing "the rules" of a permission form. Note: this
 * interface has two "properties" (that have to be marked as final)
 *
 * @author Mr. Wachs
 * @since June 2023
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
