
/** required package class namespace */
package testing.advancedclasses;


/**
 * Football.java - interface enforcing the rules of football
 *
 * @author Mr. Wachs
 * @since Oct. 30, 2019, 10:47:12 a.m.
 */
public interface Football extends Sports
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
