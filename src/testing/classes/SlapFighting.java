
/** Required package class namespace */
package testing.classes;


/**
 * SlapFighting.java - enforcing "the rules" of slap fighting (and sports)
 *
 * @author Mr. Wachs
 * @since 8-May-2023, 10:10:30 AM
 */
public interface SlapFighting extends Sports
{
    
    /**
     * A player slaps another player
     * 
     * @param slapper the person doing the slapping
     * @param slapie the person who got slapped
     */
    void slap(String slapper, String slapie);
    
    /**
     * Checks if the game is over
     * 
     * @return they are knocked out (true) or not (false)
     */
    boolean isKnockedOut();

}
