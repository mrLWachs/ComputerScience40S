
/** required package class namespace */
package testing.advancedclasses;

 
/**
 * BonelessPizza.java - represents boneless pizza
 *
 * @author Mr. Wachs
 * @since Oct. 28, 2019, 10:46:55 a.m.
 */
public class BonelessPizza extends Food
{

    /** 
     * Default constructor for the class 
     */
    public BonelessPizza() {
        super(true, Food.GROUPS[4], "delicious");
    }

    /**
     * How to eat this boneless pizza
     * 
     * @return the nurishment or not
     */
    @Override
    public boolean eat() {
        System.out.println("with your hands");
        return super.nurishment;
    }

    /**
     * Prepares the boneless pizza to be eaten
     */
    @Override
    public void prepare() {
        System.out.println("The same as the other pizzas");
    }

    /**
     * Store the boneless pizza somehow
     */
    @Override
    public void store() {
        System.out.println("In the box, on the counter");
    }
    
}
