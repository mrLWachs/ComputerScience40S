
/** required package class namespace */
package testing.advancedclasses;

/**
 * PermissionForm.java - 
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public interface PermissionForm 
{

    /**
     * 
     */
    static final boolean IS_SIGNED = true;
    /**
     * 
     */
    static final boolean NOT_SIGNED = false;
       
    /**
     * 
     */
    void sign();
    
    /**
     * 
     * @return 
     */
    boolean hasBeenSigned();
    
}
