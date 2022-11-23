
/** Required package class namespace */
package testing.classes;


/**
 * PermissionForm.java - description
 *
 * @author Mr. Wachs
 * @since 23-Nov-2022, 11:05:05 AM
 */
public interface PermissionForm 
{
    
    static final boolean SIGNED = true;
    static final boolean NOT_SIGNED = false; 
    
    void sign();
    boolean haveYouGotItSigned();

}
