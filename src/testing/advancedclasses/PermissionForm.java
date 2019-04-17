
/** required package class namespace */
package testing.advancedclasses;


/**
 * PermissionForm - interface enforcing the rules of a permission form
 *
 * @author Mr. Wachs 
 * @since 16-Apr-2019 
 */
public interface PermissionForm 
{
    
    /**
     * Represents a signed permission form
     */
    public static final boolean SIGNED = true;
    
    /**
     * Represents an unsigned permission form
     */
    public static final boolean NOT_SIGNED = false;        
    
    /**
     * Signing the permission form
     */
    public void sign();
    
    /**
     * Determines if the form has been signed or not
     * 
     * @return has been signed (true), or not (false)
     */
    public boolean haveYouGotItSigned();

}
