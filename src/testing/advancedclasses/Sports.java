
/** required package class namespace */
package testing.advancedclasses;


/**
 * Sports - the interface for "sports"
 * an interface is a "category" of abstract 
 * concepts. Even more abstract than a abstract 
 * class, it can be thought of as "a set of rules"
 *
 * @author Mr. Wachs 
 * @since 12-Apr-2019 
 */
public interface Sports 
{
    
    void setOpponent(String name);
    
    void setName(String name);

    boolean didIWin();
    
}
