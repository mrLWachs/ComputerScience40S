
/** required package class namespace */
package testing;

/** required imports */
import testing.advancedclasses.Banana;
import testing.advancedclasses.CSTeacher;
import testing.advancedclasses.Doctor;
import testing.advancedclasses.Donut;
import testing.advancedclasses.HighSchoolStudent;
import testing.advancedclasses.Husky;
import testing.advancedclasses.Meeting;
import testing.advancedclasses.MrWachs;
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
     
        // Second student object (occupies different memory spaces)
        Person jeanie = new Person();
        jeanie.name = "Jeanette";
        jeanie.talk();   
        
        // Third person (uses the overloaded constructor)
        Person dave = new Person("David Davidson",17);
        dave.talk();
        
        // Fourth person...
        Person david = new Person("David Davidson",17);
        david.talk();   
        
        // class using inheritance of a new student object 
        Student student = new Student();                // new student object
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
        
        if (archie.equals(betty))   System.out.println("archie == betty");
        if (archie.equals(jughead)) System.out.println("archie == jughead");
        
        // test toString, equals, clone on Student
        
        Student emma  = new Student("Emma Nelson",17,false,100);
        Student jimmy = new Student("Jimmy Brooks",18,true,101);
        Student terri = emma.clone();
        
        System.out.println(emma.toString());
        System.out.println(jimmy.toString());
        System.out.println(terri.toString());
        
        if (emma.equals(jimmy)) System.out.println("emma == jimmy");
        if (emma.equals(terri)) System.out.println("emma == terri");
        
        // Create Teacher objects which associates with student
        // and test this object's toString(), clone(), and 
        // equals() methods...
        
        Teacher teacher = new Teacher("Mr. Teacherson");
        
        // assign student objects to the teacher object using the correct
        // "addressing" to find the correect spot to "put" each student
        
        teacher.students[0] = emma;
        teacher.students[1] = jimmy;
        teacher.students[2] = terri;
        teacher.students[3] = student;
        teacher.students[4] = new Student("Smelly Teenager",15,true,111);
        // Here we have added an "annoynomous" object (a student)
        
        System.out.println(teacher.toString());
     
        Teacher substitute = teacher.clone();        
        if (teacher.equals(substitute)) System.out.println("teacher == sub");
        
        // Add a new student (an annoynmous object) to the clone teacher        
        substitute.students[5] = new Student("Young Kid", 10, false, 5);
        
        // output both teacher objects (to see the differences)
        
        System.out.println(teacher.toString());
        System.out.println(substitute);
     
        if (teacher.equals(substitute)) System.out.println("teacher==sub");
                        
        // output our "static" variable
        
        System.out.println("Total students is " + zach.total);
        System.out.println("Total students is " + Student.total);
        
        // call (invoke) a static method
        
        person.endTheWorld();
        student.endTheWorld();
        teacher.endTheWorld();
        
        // static methods can be invoked (called) from the class in addition
        // to the objects
        
        Person.endTheWorld();
        Student.endTheWorld();
        Teacher.endTheWorld();
          
        // call method that uses instanceof operator        
        whatIs(object1);
        whatIs(person);
        whatIs(student);
        whatIs(teacher);        
        String thing = "Hello World";        
        whatIs(thing);
        
        // show the static class variable (property)        
        System.out.println(jimmy.totalStudents);
        
        // create some high school and huskies        
        HighSchoolStudent jeff = new HighSchoolStudent(105);
        Husky havoc = new Husky(2665);
        
        // create more objects
        Doctor    doctor   = new Doctor();
        CSTeacher compTech = new CSTeacher("Mr. Code");
        MrWachs   mrWachs  = new MrWachs("Mr. Wachs");
                
        // use the method again        
        whatIs(jeff);
        whatIs(havoc);
        whatIs(doctor);
        whatIs(compTech);
        whatIs(mrWachs);
        
        // use some polymorphism....  
        Meeting meeting = new Meeting();        // create meeting object
        meeting.attend(person);                 // add various child objects
        meeting.attend(student);                // using polymorphic method
        meeting.attend(doctor);                 // arguments
        meeting.attend(teacher);
        meeting.attend(archie);
        meeting.attend(betty);
        meeting.attend(compTech);
        meeting.attend(emma);
        meeting.attend(havoc);
        meeting.attend(jeff);
        meeting.attend(jimmy);
        meeting.attend(jughead);
        meeting.attend(terri);
        meeting.attend(mrWachs);        
        meeting.hold();                         // hold the mmeting
        
        // create objects from classes that inherited from an abstract class:
        Banana banana = new Banana();
        Donut  donut  = new Donut();
        
        // call the polymorphic method of person objects 
        mrWachs.haveDinner(donut);
        mrWachs.haveDinner(banana);
                
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
        if (object instanceof Object)            name += "Object -> ";
        if (object instanceof Person)            name += "Person -> ";
        if (object instanceof Student)           name += "Student -> ";
        if (object instanceof Teacher)           name += "Teacher -> ";
        if (object instanceof HighSchoolStudent) name += "High School -> ";
        if (object instanceof Husky)             name += "Husky -> ";
        if (object instanceof Doctor)            name += "Doctor -> ";
        if (object instanceof CSTeacher)         name += "CS Teacher -> ";
        if (object instanceof MrWachs)           name += "MrWachs -> ";        
        if (object instanceof String)            name += "String -> ";
        name += "Object";
        System.out.println(name);        
    }
        
}
