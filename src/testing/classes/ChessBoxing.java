
/** Required package class namespace */
package testing.classes;


/**
 * ChessBoxing.java - enforcing "the rules" of chess boxing (and sports)
 *
 * @author Mr. Wachs
 * @since 23-Nov-2022, 11:05:26 AM
 */
public interface ChessBoxing extends Sports
{

    /**
     * A team scoring a piece
     * 
     * @param name the name of the team who took a piece
     */
    void takePiece(String name);
    
    /**
     * A team scoring a punch
     * 
     * @param name the name of the team who punched
     */
    void punch(String name);
    
    /**
     * The passed round of Chess Boxing is over
	 *
     * @param round the round number
     */
    void endOfRound(int round);
    
}
