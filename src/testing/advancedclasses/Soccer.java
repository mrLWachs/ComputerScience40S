
/** required package class namespace */
package testing.advancedclasses;


/**
 * Soccer - interface enforcing the rules of Soccer
 *
 * @author Mr. Wachs 
 * @since 5-Nov-2018 
 */
public interface Soccer extends Sports
{

    /**
     * The home team scores a goal
     */
    void homeGoal();
    
    /**
     * The visiting team scores a goal
     */
    void visitingGoal();
    
    /**
     * The end of a half of soccer
     */
    void endHalf();
    
    /**
     * Determines the name of the winning team
     * 
     * @return the winning team name
     */
    String winner();
    
}
