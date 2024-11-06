/** Required package class namespace */
package testing.classes;
 
/**
 * Hockey.java - enforcing "the rules" of hockey (and sports). Interfaces can
 * inherit from other interfaces ("can follow the rules of other rules"). This
 * is like classes inheriting from other classes.
 *
 * @author Mr. Wachs
 * @since Nov 6, 2024, 11:40:19 a.m.
 */
public interface Hockey extends Sports
{
    void score(String name);
    void endOfPeriod(int period);
}
