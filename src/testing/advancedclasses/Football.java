
/** required package class namespace */
package testing.advancedclasses;


/**
 * Football.java - interface enforcing the rules of football
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:40:04 PM
 */
public interface Football 
{

    /**
     * A team scoring some amount of points 
     * 
     * @param points the amount of points scored
     * @param name the name of the team who scored
     */
    void score(int points, String name);
    
    /**
     * End of this quarter of football
     * 
     * @param quarter the quarter ending
     */
    void endOfQuarter(int quarter);
    
}
