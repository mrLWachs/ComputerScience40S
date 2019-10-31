
/** required package class namespace */
package testing.advancedclasses;


/**
 * WiiBoxing.java - interface enforcing the rules of Wii boxing
 *
 * @author Mr. Wachs
 * @since Oct. 30, 2019, 10:49:27 a.m.
 */
public interface WiiBoxing extends Sports
{
        
    /**
     * Punches an opponent
     * 
     * @param name the name of the player punching
     */
    void punch(String name);
    
    /**
     * Blocks a punch from the opponent
     * 
     * @param name the name of the player blocking
     */
    void block(String name);
    
}
