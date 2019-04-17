
/** required package class namespace */
package testing.advancedclasses;


/**
 * Soccer - interface enforcing the rules of soccer
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public interface Soccer extends Sports
{
    
    /**
     * A team scores a goal
     * 
     * @param name the name of the team that scored
     */
    void goal(String name);
    
    /**
     * End of a half of the soccer game
     * 
     * @param first is the first half (true) or second (false)
     */
    void endOfHalf(boolean first);
    
}
