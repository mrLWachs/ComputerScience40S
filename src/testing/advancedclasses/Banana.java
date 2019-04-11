/*
 *  Mr. Wachs' classes - Java Computer Science learning file Banana.java
 *  for project ComputerScience40S on 11-Apr-2019 at 1:33:10 PM by lawrence.wachs
 */


/** required package class namespace */
package testing.advancedclasses;



/**
 * Banana.java - 
 *
 * @author Mr. Wachs 
 * @since 11-Apr-2019 
 */
public class Banana extends Food
{

    public Banana() {
        super(1);
    }

    @Override
    public void eat() {
        System.out.println("Peel from top");
    }

    @Override
    public boolean shouldCook() {
        return false;
    }

}
