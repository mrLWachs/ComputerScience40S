/*
 *  Mr. Wachs' classes - Java Computer Science learning file Chicken.java
 *  for project ComputerScience40S on 11-Apr-2019 at 1:33:22 PM by lawrence.wachs
 */


/** required package class namespace */
package testing.advancedclasses;



/**
 * Chicken.java - 
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Chicken extends Food
{

    /** 
     * Default constructor for the class 
     */
    public Chicken() {
        super(2);
    }

    /**
     * How to eat this food object
     */
    @Override
    public void eat() {
        System.out.println("Fried chicken");
    }

    /**
     * Determines if this food item should be cooked or not 
     * 
     * @return should be cooked (true), or not (false)
     */
    @Override
    public boolean shouldCook() {
        return true;
    }

}
