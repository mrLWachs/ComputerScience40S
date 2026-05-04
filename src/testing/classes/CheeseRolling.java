/** Required package class namespace */
package testing.classes;
 
/**
 * CheeseRolling.java - Cheese rolling is a traditional English event where 
 * participants hurl themselves down a near-vertical hill in pursuit of an 
 * eight-pound wheel of Double Gloucester. While the cheese is virtually 
 * impossible to catch, the first person to reach the bottom wins the wheel 
 * as a prize for surviving the chaotic descent.
 *
 * @author Mr. Wachs
 * @since May 4, 2026, 8:51:40 AM
 */
public interface CheeseRolling extends Sports
{
    void roll();
    void eat(boolean didTheyThrowUp);
}
