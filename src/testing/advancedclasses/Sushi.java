/*
 *  Mr. Wachs' classes - Java Computer Science learning file Sushi.java
 *  for project ComputerScience40S on 11-Apr-2019 at 1:33:28 PM by lawrence.wachs
 */


/** required package class namespace */
package testing.advancedclasses;



/**
 * Sushi.java - 
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Sushi extends Food
{

    public Sushi() {
        super(2);
    }

    @Override
    public void eat() {
        System.out.println("California roll");
    }

    @Override
    public boolean shouldCook() {
        return false;
    }

}
