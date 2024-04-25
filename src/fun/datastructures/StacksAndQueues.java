
/** Required package class namespace */
package fun.datastructures;
 
/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;


/**
 * StacksAndQueues.java - description
 *
 * @author Mr. Wachs
 * @since April 2024
 */
public class StacksAndQueues 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public StacksAndQueues(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        Simulator.comment("Learn about advanced stacks and queues");
        
        final int TOTAL = 10;
        final int HIGH  = 99;
        final int LOW   = 10;        
        int number = 0;
        Stack stack = new Stack(); 
        System.out.print("Stack push values: \t");
        for (int i = 0; i < TOTAL; i++) {
            number = (int)((HIGH-LOW+1)*Math.random()+LOW);
            stack.push(number);
            System.out.print(number + ",");
        }
        System.out.println("\n.....................");
        System.out.println(stack.toString());
        System.out.println(".....................");
        for (int i = stack.size(); i > 1; i--) {
            System.out.println("pop " + stack.pop());
        }
        System.out.println(".....................");
        System.out.println(stack.toString()); 
        System.out.println(".....................");
        Queue queue = new Queue(); 
        System.out.print("Queue enqueue values: \t");
        for (int i = 0; i < TOTAL; i++) {
            number = (int)((HIGH-LOW+1)*Math.random()+LOW);
            queue.enqueue(number);
            System.out.print(number + ",");
        }
        System.out.println("\n.....................");
        System.out.println(queue.toString());
        System.out.println(".....................");
        for (int i = queue.size(); i > 1; i--) {
            System.out.println("dequeue " + queue.dequeue());
        }
        System.out.println(".....................");
        System.out.println(queue.toString());
        
        System.out.println("A version of a list structure");
    }
    
    
    public class Node {

        public int data;
        public Node next;
        public Node previous;

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Node(int data) {
            this(data,null,null);
        }

    }
    
    
    
    public class Stack {

        private Node top;
        private int length;

        public Stack() {
            top = null;
            length = 0;
        }

        public int size() {
            return length;
        }

        public void push(int data) {
            Node node = new Node(data);        
            if (top != null) node.next = top;    
            top = node;     
            length++; 
        }

        public int pop() {
            if (top == null) return 0;    
            else {             
                length--;                    
                int data = top.data;      
                top = top.next;          
                return data;            
            }  
        }

        public String toString() {
            String text = "Top\n"; 
            Node current = top;  
            while (current != null) {
                text += current.data + "\n";   
                current = current.next;   
            }            
            return text + "Bottom"; 
        }

    }
    
    
    
    public class Queue {
    
        private Node front;
        private Node back;
        private int length;

        public Queue() {
            front = null;
            back = null;
            length = 0;
        }

        public int size() {
            return length;
        }

        public String toString() {                                     
            String text = "Back ";            
            Node current = front;          
            while (current != null) {    
                text += current.data + ",";
                current = current.next; 
            }            
            return text + " Front"; 
        }

        public void enqueue(int data) {
            Node node = new Node(data); 
            if (length == 0) {
                front = node;
                back = node;
            }             
            else {                
                node.next = front;        
                front.previous = node;
                front = node;
            }
            length++;  
        }

        public int dequeue() {
            if (length == 0) return -1; 
            else {                           
                length--;   
                int data = back.data; 
                back = back.previous;  
                back.next.previous = null;
                back.next = null;
                return data;        
            }
        } 

    }
    
}