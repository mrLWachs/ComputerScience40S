  
/** Required package class namespace */
package testing.unit3;

/** 
 * Football.java - enforcing "the rules" of football (and sports). Interfaces 
 * can inherit from other interfaces ("can follow the rules of other rules"). 
 * This is like classes inheriting from other classes.
 *
 * @author Mr. Wachs 
 * @since 20-May-2022 
*/
public interface Football extends Sports
{

    /**
     * A team scoring some points
     * 
     * @param name the name of the team who scored
     * @param points the number of points scored
     */
    void score(String name, int points);
    
    /**
     * The passed quarter of football is over
	 *
     * @param quarter the quarter number
     */
    void endOfQuarter(int quarter);
    
}