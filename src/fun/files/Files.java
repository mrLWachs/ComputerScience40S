
/** Required package class namespace */
package fun.files;

/** Required API imports */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import testing.Tester;

/**
 * Files - experimenting with saving and opening file (permanent storage)
 * 
 * @author Mr. Wachs
 * @since Mar 1, 2024, 11:31:34 a.m.
*/
public class Files
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public Files(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        
        // To eventually do files, you also need to know about error handling 
        // or the "try catch block"
        
        try {
            // "tries" to run whatever code is in this block
            
            //double number = 3 / 0;
            int[] a = { 1, 2, 3 };
            a[5] = 0;
            
        } 
        catch (ArithmeticException e) {
            // IF, an error occured in the block above try block, that error 
            // is "caught" and code branches to here (instead of crashing)
            System.out.println("Caught ArithmeticException");            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
        
        // Now files...
                
        // HOW TO WRITE "data" TO A FILE..................
        
        String word = "Defenestration";
        
        // Now let's create a file NAME (properly)
        String first  = "C:\\temp\\";
        String middle = "text";
        String last   = ".txt";
        
        String name = first + middle + last;
        
        try {            
            FileWriter  writer  = new FileWriter(name);
            PrintWriter printer = new PrintWriter(writer);
            printer.print(word);
            printer.close();
        } 
        catch (IOException e) {
            System.out.println("File error");
        }
        
        // HOW TO READ "data" FROM A FILE..................

        String newWord = "";
        
        try {
            FileReader     reader = new FileReader(name);
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            buffer.close();
            
            newWord = line;
            System.out.println(newWord);
            
        } 
        catch (IOException e) {
            System.out.println("File error");
        }
    }

}
