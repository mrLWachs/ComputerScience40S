
/** Required package class namespace */
package testing.advancedclasses;


/**
 * Football.java - enforcing "the rules" of football (and sports)
 * 
 * @author Mr. Wachs
 * @since May 25, 2021
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
