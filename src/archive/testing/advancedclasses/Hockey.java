
/** required package class namespace */
package archive.testing.advancedclasses;


/**
 * Hockey - interface enforcing the rules of hockey
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public interface Hockey extends Sports
{
    
    /**
     * When a team scores a goal
     * 
     * @param name the name of the team that scored
     */
    void goal(String name);
    
    /**
     * The passed period of hockey is over
     * 
     * @param period the period number
     */
    void endOfPeriod(int period);
    
}
