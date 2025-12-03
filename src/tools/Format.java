/** Required package class namespace */
package tools;

/**
 * Format.enum - this is an enumeration for formatting the output colors for 
 * System.out. An enumeration (often shortened to 'enum') in Java is a special
 * class type used to define a fixed, finite set of related constants. It is an 
 * alternative to using integer constants for representing a fixed set of values
 * (like days  of the week, months, or cardinal directions). An enum defines a
 * collection of  named constants. Once defined, you cannot create new enum 
 * constants at run time. Unlike simple constants, Java enums are full-fledged
 * classes. They can have constructors, methods, and instance variables. An
 * enum cannot extend any other class.
 * 
 * @author Mr. Wachs
 * @since Dec 3, 2025, 9:25:42 AM
 */
public enum Format 
{
    
    /** 
     * This resets the output colors back to default. You can define the enum 
     * values at the top of the enum in ALL CAPS like constants (because they 
     * are). You can also call a constructor (if you define one) to set the enum
     * properties (if you have any) otherwise they are essentially "numbers" 
     * that can be used for assigning a numeric value to something like an 
     * array or a switch statement, etc.
     */
    RESET ("\033[0m"),  
    BLACK ("\033[0;30m"),   
    RED   ("\033[0;31m"),   
    GREEN ("\033[0;32m"),  
    YELLOW ("\033[0;33m"),  
    BLUE  ("\033[0;34m"),   
    PURPLE ("\033[0;35m"),  
    CYAN  ("\033[0;36m"),  
    WHITE ("\033[0;37m"),  
    BLACK_BOLD ("\033[1;30m"),  
    RED_BOLD   ("\033[1;31m"),   
    GREEN_BOLD ("\033[1;32m"), 
    YELLOW_BOLD ("\033[1;33m"), 
    BLUE_BOLD  ("\033[1;34m"),  
    PURPLE_BOLD ("\033[1;35m"), 
    CYAN_BOLD  ("\033[1;36m"),  
    WHITE_BOLD ("\033[1;37m");
    
    /** 
     * Enums can have properties (like a class) that can be accessed if you 
     * want to define them. They can also be initialized by a constructor. The
     * encapsulated value property of this enum class used by System.out to
     * format the outputs
     */
    private final String value;
    
    
    /**
     * Enums can have constructor methods. The constructor for this enum (class)
     * that is called above with the definition of the enum constants to set the 
     * property to the passed value
     * 
     * @param value the value to set the enum to
     */
    Format(String value) {
        this.value = value;
    }
    
    /**
     * Enums can have other methods. This method over-rides the Enum.Java class
     * object that all enums inherit from. It also over-rides the Object class
     * toString method.
     *  
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return value;
    }
    
}
