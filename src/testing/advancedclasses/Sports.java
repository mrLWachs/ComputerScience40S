
/** required package class namespace */
package testing.advancedclasses;


/**
 * Sports - interface enforcing the rules of sports
 *
 * @author Mr. Wachs 
 * @since 2-Nov-2018 
 */
public interface Sports 
{
        
    /**
     * Mutator setting the name of the player
     * 
     * @param name the name of this player
     */
    public void setHome(String name);
            
    /**
     * Mutator setting the name of the opponent
     * 
     * @param name the name of this opponent
     */
    public void setVisiting(String name);
    
}
