  
/** Required package class namespace */
package testing.advancedclasses;

/** 
 * AmongUs.java - enforcing "the rules" of Among Us (and sports)
 *
 * @author Mr. Wachs 
 * @since 25-Nov-2021 
*/
public interface AmongUs extends Sports
{
    
    /**
     * Call a meeting to end the game
     * 
     * @param name the name of the team calling the meeting
     * @return the game is over (true) or not (false)
     */
    boolean callMeeting(String name);

    /**
     * Asks a question to an opponent
     * 
     * @return the answer to the question
     */
    String askQuestion();
    
    /**
     * Find a body in the game 
     * 
     * @param who the person looking
     * @return the name of the body
     */
    String findBody(String who);
    
}