  
/** Required package class namespace */
package testing.unit3;

/** 
 * PermissionForm.java - enforcing "the rules" of a permission form
 *
 * @author Mr. Wachs 
 * @since 20-May-2022 
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
    boolean didYouGetItSigned();
    
}