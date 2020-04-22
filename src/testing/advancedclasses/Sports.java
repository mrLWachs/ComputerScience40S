
/** required package class namespace */
package testing.advancedclasses;


/**
 * Sports.java - the interface for "sports" an interface is a "category" of 
 * abstract concepts. Even more abstract than a abstract class, it can be 
 * thought of as "a set of rules"
 *
 * @author Mr. Wachs
 * @since 22-Apr-2020, 1:37:25 PM
 */
public interface Sports 
{
    
    /**
     * Mutator setting the name of the player
     * 
     * @param name the name of this player
     */
    void setName(String name);
    
    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    void setOpponent(String name);
    
    /**
     * Determines if the sports game is over (with a winner)
     * 
     * @return there was a winner (true) or not (false)
     */
    boolean didIWin();    

}
