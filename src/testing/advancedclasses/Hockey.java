
/** required package class namespace */
package testing.advancedclasses;


/**
 * Hockey.java - interface enforcing the rules of hockey
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:38:51 PM
 */
public interface Hockey extends Sports
{

    /**
     * A team scored a goal for 1 point 
     * 
     * @param name the name of the team who scored
     */
    void goal(String name);
    
    /**
     * End of this period of hockey
     * 
     * @param period the period ending
     */
    void endOfPeriod(int period);
    
}
