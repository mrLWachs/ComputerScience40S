/*
 *  Mr. Wachs' classes - Java Computer Science learning file Hogwarts.java
 *  for project ComputerScience40S on 1-Apr-2019 at 2:09:40 PM by lawrence.wachs
 */


/** required package class namespace */
package testing.advancedclasses;



/**
 * Hogwarts.java - 
 *
 * @author Mr. Wachs 
 * @since 1-Apr-2019 
 */
public class Hogwarts 
{

    private Wizard wizards[];
    private int index;
    
    // encapsulated (locked in the class)
    
    public void enterStation9ThreeQuarters(Wizard wizard){
        wizards[index] = wizard;
        index++;
    }
    
    
    
}
