/** Required package class namespace */
package testing.classes;
 
/**
 * Meeting.java - represents a meeting of people
 *
 * @author Mr. Wachs
 * @since Apr 16, 2026, 9:13:13 AM
 */
public class Meeting 
{    
   
    /**
     * Simple phrasing: A "list/collection" of all the people at the meeting
     * Complex phrasing: An array (because of square brackets) of class level
     * objects, the Meeting "has a" (associated with) Person (an array of them)
     */
    public Person[] members;
    
    /**
     * Simple phrasing: It represents how many people are attending the meeting
     * Complex phrasing: the modifier words "private" encapsulates, "int" 
     * defines the data type of this name (or "variable", "property", "field") 
     */
    private int count;
    
    /**
     * Simple phrasing: The maximum number of people that can be at the meeting
     * Complex phrasing: The modifier "final" turns the field into a constant
     */
    private final int MAX;
    
    
    /**
     * Default constructor, set class properties
     */
    public Meeting() {
        MAX   = 500;
        count = 0;
        // Need to "build" (construct, instantiate) our array
        members = new Person[MAX];
        // However, although the array has its size now set up, all the index 
        // values (spots in the array) are filled with "nulls" (no Person 
        // objects/instances are yet in the array)
    }
    
    /**
     * Have a person attend this meeting (technically a mutator method, because
     * it will modify the mutable array property of this class)
     * 
     * @param person a Person object to attend the meeting
     */
    public void attend(Person person) {
        // Assign (put, place) the person object (instance of the Person class)
        // passed into this method's parameter into the first empty (unassigned)
        // index (spot, element, location, subscript) of the array property
        // of the Meeting class (global variable)     
        members[count] = person;
        
         // Now advance the count
        count++;
        
        // Potential out of bounds ("range") error with count, we fix with
        if (count >= MAX) {
            // Potentially we could make the array bigger (resize, 
            // re-dimension) - however, whenever you do this it wipes out
            // (recreates, re-dimensions) all array content. So let's just
            // reassign the count
            count = 0;
        }
    }
    
    /**
     * Hold the meeting for all members (technically this is a accessor method 
     * because it "accesses" the encapsulated array property)
     */
    public void hold() {
        // Make a variable to hold a bunch of potential output data
        String message = "Meeting is about to begin...\n";
        
        // Now we loop through the entire array ("traverse" means to travel to 
        // or visit every spot) from start (index zero) to the finish (index of 
        // the length minus one) - using a NEW type of loop (a new "for" loop)
        // called the "enhanced for loop". To create the enhanced for loop 
        // use the shortcut: type "for" then CTRL + SPACE and pick the fourth 
        // option that appears from the top, or type "fore" and TAB    
        for (Person member : members) {
            // The enhanced for loop should be read as:
            // "for every member in members"
            // The "member" object of type "Person" automatically goes through
            // (traverses) from the start to the end of the array automatically
            // changing "person" each time through the loop to the next element
            // in order...
            
            // Only going to count people (Person objects) that "exist"
            // (that are not a "null")  
            if (member != null) {
                message += "\n\t";             // Add a line break and tab first
                
                // The "instanceof" operator takes an object (instance) on the
                // left hand side (LHS) and the class type on the right hand
                // side (RHS) and it is true if the object 'comes from' that
                // class (is a instance of that class type)                  
                if (member instanceof Athlete)    message += "Athlete    -> ";
                if (member instanceof Piper)      message += "Piper      -> ";
                if (member instanceof Husky)      message += "Husky      -> ";
                if (member instanceof HighSchool) message += "HighSchool -> ";
                if (member instanceof MrWachs)    message += "MrWachs    -> ";
                if (member instanceof Teacher)    message += "Teacher    -> ";
                if (member instanceof CaveDiver)  message += "CaveDiver  -> ";
                if (member instanceof Doctor)     message += "Doctor     -> ";
                if (member instanceof Student)    message += "Student    -> ";
                if (member instanceof Person)     message += "Person     -> "; 
                
                message += "Object";
            }
        }
        
        // Below is another (simpler) example of the enhanced for loop with an 
        // array of integers that loops through the array and can be read as 
        // "for every integer in array" = "for (Integer integer : array)"
        //
        // int[] array = { 6, 7, 67, 0, -67 };  
        // for (Integer integer : array) {
        //    System.out.println(integer);
        // }
                
        // Finally output that message
        message += "\n\nMeeting is complete!";
        System.out.println(message);              
    }
    
}