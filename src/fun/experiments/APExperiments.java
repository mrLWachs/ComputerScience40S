
package fun.experiments;

import java.util.ArrayList;
import java.util.Iterator;

public class APExperiments
{

    public static void main(String[] args) {
        final double MIN = Double.MIN_VALUE;
        final double MAX = Double.MAX_VALUE;
        final double CHANGE = MIN;
        
        for (double i = MIN; i < MAX; i = i + CHANGE) {
            boolean show = false;
            String text = ("i = " + i + "\t");
            double x = i;
            double a1 = Math.pow(x,0.5);
            double a2 = Math.sqrt(x);

            if (a1 == a2) {
                text += ("true");
                show = true;
            }
            else          text += ("false");

            text += "\ta1 = " + a1 + "\ta2 = " + a2;
            
            if (!show) System.out.println(text);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
//        final int L = 10;
//        final int H = 99;
//        ArrayList<Integer> a = new ArrayList<>();        
//        for (int i = 0; i < H; i++) {
//            int n = (int)((H-L+1)*Math.random()+L);
//            a.add(n);
//        }        
//        System.out.println(a.toString());
        
        
//        Iterator i = a.iterator();   
//        do {       
//            Integer integer = (Integer)i.next();
//            System.out.println("i = " + integer.intValue());
//        } while (i.hasNext());
        
        
        
        
//        Which of the following statements assigns a random integer 
//        between 25 and 60, inclusive, to rn?
//        (A)int rn = (int) (Math.random() * 25) + 36;
//        (B)int rn = (int) (Math.random() * 25) + 60;
//        (C)int rn = (int) (Math.random() * 26) + 60;
//        (D)int rn = (int) (Math.random() * 36) + 25;
//        (E)int rn = (int) (Math.random() * 60) + 25;
//
//        boolean outOfRange1 = false;
//        boolean outOfRange2 = false;
//        boolean outOfRange3 = false;
//        boolean outOfRange4 = false;
//        boolean outOfRange5 = false;
//                
//        final int MAX = 1000000000; // Integer.MAX_VALUE
//        
//        for (int i = 0; i < MAX; i++) {
//            int rn1 = (int) (Math.random() * 25) + 36;
//            int rn2 = (int) (Math.random() * 25) + 60;
//            int rn3 = (int) (Math.random() * 26) + 60;
//            int rn4 = (int) (Math.random() * 36) + 25;
//            int rn5 = (int) (Math.random() * 60) + 25;
//
//            if (rn1 < 25 || rn1 > 60) outOfRange1 = true;
//            if (rn2 < 25 || rn2 > 60) outOfRange2 = true;
//            if (rn3 < 25 || rn3 > 60) outOfRange3 = true;
//            if (rn4 < 25 || rn4 > 60) outOfRange4 = true;
//            if (rn5 < 25 || rn5 > 60) outOfRange5 = true;
//        }
//
//        if (outOfRange1) System.out.println("A went OUT of range");
//        else             System.out.println("A is   IN     range");
//        if (outOfRange2) System.out.println("B went OUT of range");
//        else             System.out.println("B is   IN     range");
//        if (outOfRange3) System.out.println("C went OUT of range");
//        else             System.out.println("C is   IN     range");
//        if (outOfRange4) System.out.println("D went OUT of range");
//        else             System.out.println("D is   IN     range");
//        if (outOfRange5) System.out.println("E went OUT of range");
//        else             System.out.println("E is   IN     range");
        
    }

}
