
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.Person;
import testing.advancedclasses.Student;
import testing.advancedclasses.Teacher;

 
/**
 * AdvancedClassesTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs
 * @since Feb. 28, 2020, 2:00:03 p.m.
 */
public class AdvancedClassesTest 
{

    /**
     * Default constructor, set class properties
     */
    public AdvancedClassesTest() {
        System.out.println("\nAdvanced classes test started...\n");
        
        // Review of classes concepts (properties, methods, object, inheritance)
        
        // using the class to create an object with the default constructor:
        // class object = call constructor method (default)
        Person person = new Person();                   // person object
        person.talk();                                  // calls class method 
        
        // class using inheritance
        Student student = new Student(99);              // new student object
        student.talk();                                 // inherited method
        
        // The Object class (parent class of all classes)
        
        // all classes (including ones we create) inherit from the object 
        // class which is the parent (super) of all classes
        
        Object object1 = new Object();              // parent of all classes
        Object object2 = new Object();
        Object object3 = object1;                   // same memory address
        
        // The toString(), clone(), and equals() methods
                
        System.out.println(object1.toString());         // the toString method
        System.out.println(object2.toString());
        System.out.println(object3.toString());
                        
        if (object1.equals(object2)) System.out.println("1 == 2");
        if (object1.equals(object3)) System.out.println("1 == 3");
                
        // test toString, clone, and equals on Person
        
        Person archie  = new Person("Archie Andrews",17,true);
        Person betty   = new Person("Betty Cooper",16,false);
        Person jughead = archie.clone();
        
        System.out.println(archie.toString());
        System.out.println(betty.toString());
        System.out.println(jughead.toString());
        
        if (archie.equals(betty))   System.out.println("archie==betty");
        if (archie.equals(jughead)) System.out.println("archie==jughead");
        
        // test toString, equals, clone on Student
        
        Student emma  = new Student("Emma Nelson",17,false,100);
        Student jimmy = new Student("Jimmy Brooks",18,true,101);
        Student terri = emma.clone();
        
        System.out.println(emma.toString());
        System.out.println(jimmy.toString());
        System.out.println(terri.toString());
        
        if (emma.equals(jimmy)) System.out.println("emma==jimmy");
        if (emma.equals(terri)) System.out.println("emma==terri");
        
        // create a Teacher object which associates with student
        
        Teacher teacher = new Teacher("Mr. Perino");
        
        teacher.students[0] = emma;
        teacher.students[1] = jimmy;
        teacher.students[2] = terri;
        teacher.students[3] = student;
        
        System.out.println(teacher.toString());
        
        // call method that uses instanceof operator
        
        whatIs(object1);
        whatIs(person);
        whatIs(student);
        whatIs(teacher);        
        String thing = "Hello World";        
        whatIs(thing);
        
        
        
        
        
        
                
        System.out.println("\nAdvanced classes test complete!\n");
    }
     
    /**
     * Checks the passed object and outputs what class type the object is. 
     * This method uses the instanceof operator to do the logic
     * 
     * @param object the object type to check
     */
    private void whatIs(Object object) {
        String name = "This is a ";
        if (object instanceof Person)  name += "Person -> ";
        if (object instanceof Student) name += "Student -> ";
        if (object instanceof Teacher) name += "Teacher -> ";
        if (object instanceof String)  name += "String -> ";
        if (object instanceof Object)  name += "Object -> ";
        System.out.println(name);        
    }

}
