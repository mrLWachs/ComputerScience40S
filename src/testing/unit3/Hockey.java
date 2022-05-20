  
/** Required package class namespace */
package testing.unit3;

/** 
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 *
 * @author Mr. Wachs 
 * @since 20-May-2022 
*/
public interface Hockey extends Sports
{
    
    /**
     * A team scoring a point
     * 
     * @param name the name of the team who scored
     */
    void score(String name);
    
    /**
     * The passed period of hockey is over
	 *
     * @param period the period number
     */
    void endOfPeriod(int period);
    
}