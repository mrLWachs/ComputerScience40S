
/** required package class namespace */
package testing;



/**
 * Output.java - 
 *
 * @author Mr. Wachs 
 * @since 23-May-2019 
 */
public class Output 
{
    private static final int MAX = 200;
    private static final String DIVIDE = "\t= ";
    
    public static void header(String text) {
        text = "\n" + text;
        int length = text.length();
        for (int i = 0; i < (MAX - length); i++) {
            text += ".";
        }
        text += "\n";
        show(text);
    }
    
    public static void show(Object first, Object second,  
                        Object third, Object fourth,
                        Object fifth, Object sixth) {
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        String text6 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();
        if (sixth  != null) text6 = sixth.toString();        
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5 + DIVIDE +
                      text6; 
        show(text);        
    }
    
    public static void show(Object first, Object second,  
                        Object third, Object fourth,
                        Object fifth) {
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        String text5 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();
        if (fifth  != null) text5 = fifth.toString();        
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4 + DIVIDE +
                      text5; 
        show(text);        
    }
    
    public static void show(Object first, Object second,  
                        Object third, Object fourth) {
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        String text4 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();
        if (fourth != null) text4 = fourth.toString();      
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3 + DIVIDE + 
                      text4; 
        show(text);        
    }
    
    public static void show(Object first, Object second,  
                        Object third) {
        String text1 = "null";
        String text2 = "null";
        String text3 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();
        if (third  != null) text3 = third.toString();      
        String text = text1  + DIVIDE + 
                      text2 + DIVIDE + 
                      text3; 
        show(text);        
    }
    
    public static void show(Object first, Object second) {
        String text1 = "null";
        String text2 = "null";
        if (first  != null) text1 = first.toString();
        if (second != null) text2 = second.toString();     
        String text = text1  + DIVIDE + 
                      text2; 
        show(text);        
    }
    
    public static void show(Object first) {
        String text1 = "null";
        if (first  != null) text1 = first.toString();    
        String text = text1; 
        System.out.println(text);        
    }

    public static String show(int[] array) {
        if (array == null) return "null";
        String text = "Array       [";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        return text + array[array.length-1] + "]";
    }
    
    public static String show(Object[] array) {
        if (array == null) return "null";
        String text = "Array       [";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        return text + array[array.length-1] + "]";
    }
        
}
