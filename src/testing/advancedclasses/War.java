
/** required package class namespace */
package testing.advancedclasses;


/**
 * War - interface enforcing the rules of War card game
 *
 * @author Mr. Wachs 
 * @since 5-Nov-2018 
 */
public interface War extends Sports
{

    /**
     * The user plays a card in the game
     */
    void userPlaysCard();
    
    /**
     * The opponent plays a card in the game
     */
    void opponentPlaysCard();
    
    /**
     * Determine if the user won or not
     * 
     * @return user wins (true) or not (false)
     */
    boolean didUserWin();
    
}
