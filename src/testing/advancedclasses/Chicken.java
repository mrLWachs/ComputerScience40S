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

    public Chicken() {
        super(2);
    }

    @Override
    public void eat() {
        System.out.println("Fried chicken");
    }

    @Override
    public boolean shouldCook() {
        return true;
    }

}
