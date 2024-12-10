
package extras.collections;

import java.util.*;


public class LinkedListImported
{

    public LinkedListImported() {
        final int SIZE = 100;
        //int[] array = new int[SIZE];
        Integer[] array = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(SIZE);
        }
        String text = Arrays.toString(array);
        System.out.println("Array:\t\t\t" + text);
        /////////////////////////////////////////////////////////////////
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer integer : array) {
            linkedList.add(integer);
        }
        System.out.println("LinkedList:\t\t" + linkedList);
        /////////////////////////////////////////////////////////////////
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : array) {
            arrayList.add(integer);
        }
        System.out.println("ArrayList:\t\t" + arrayList);
        /////////////////////////////////////////////////////////////////
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : array) {
            stack.push(integer);
        }
        System.out.println("Stack:\t\t\t" + stack);
        /////////////////////////////////////////////////////////////////
        Vector<Integer> vector = new Vector<>();
        for (Integer integer : array) {
            vector.add(integer);
        }
        System.out.println("Vector:\t\t\t" + vector);
        /////////////////////////////////////////////////////////////////        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer integer : array) {
            priorityQueue.add(integer);
        }
        System.out.println("PriorityQueue:\t\t" + priorityQueue);
        /////////////////////////////////////////////////////////////////
        System.out.println("\nNow some ADT methods...\n");
        /////////////////////////////////////////////////////////////////
        Arrays.sort(array);
        System.out.println("Sort Array:\t\t" + Arrays.toString(array));
        /////////////////////////////////////////////////////////////////
        //linkedList = linkedList.reversed();
        //System.out.println("Reversed LinkedList:\t" + linkedList);
        /////////////////////////////////////////////////////////////////
        int value = array[SIZE/2];
        arrayList.remove(value);
        System.out.println("ArrayList Remove " + value + ":\t" + arrayList);
        /////////////////////////////////////////////////////////////////
        Integer i = stack.pop();
        System.out.println("Stack pop " + i + ":\t\t" + stack);
        /////////////////////////////////////////////////////////////////
        vector.removeElementAt(2);
        System.out.println("Vector remove 2:\t" + vector);
        /////////////////////////////////////////////////////////////////
        Integer[] a = (Integer[])vector.toArray(array);
        System.out.println("Vector to array:\t" + vector);
        System.out.println("Array:\t\t\t" + Arrays.toString(a));
        /////////////////////////////////////////////////////////////////
        UserInterface ui = new UserInterface();
    }

}
