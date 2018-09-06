
/** required package class namespace */
package archive2018to2019.advancedclasses;

/**
 * Chess.java - interface enforcing the rules of chess
 *
 * @author Mr. Wachs 
 * @since Oct 4, 2017 
 * @instructor Mr. Wachs
 */
public interface Chess extends Sports
{
    
    /**
     * The opponent makes a move
     */
    void opponentMove();
    
    /**
     * The player makes a move
     */
    void move();
    
    /**
     * The game of chess is over
     */
    void endOfGame();
    
}
