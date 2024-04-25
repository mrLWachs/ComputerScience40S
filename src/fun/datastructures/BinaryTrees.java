
/** Required package class namespace */
package fun.datastructures;
 
/** Required API imports */
import testing.Tester;
import utility.io.Simulator;
import utility.io.System;


/**
 * BinaryTrees.java - description
 *
 * @author Mr. Wachs
 * @since April 2024
 */
public class BinaryTrees 
{

    /**
     * Default constructor, set class properties
     * 
     * @param state the run state of this code module
     */
    public BinaryTrees(int state) {
        if (state == Tester.DO_NOT_RUN) {
            return;
        }
        Simulator.comment("Learn about binary trees");
        
        final int TOTAL = 10;
        final int HIGH  = 99;
        final int LOW   = 10;        
        int number = 0;
        Tree tree = new Tree(); 
        System.out.print("Tree Insert values: \t");
        for (int i = 0; i < TOTAL; i++) {
            number = (int)((HIGH-LOW+1)*Math.random()+LOW);
            if (tree.search(number) == false) {
                tree.insert(number);
                java.lang.System.out.print(number + ",");
            }
        }      
        System.out.println("\nSearch: " + number + "  = " + tree.search(number)); 
        System.out.println("Search: 100 = " + tree.search(100)); 
        System.out.print("Pre-order Traversal: \t");
        tree.traverse("pre");
        System.out.print("\nPost-order Traversal: \t");
        tree.traverse("post");
        System.out.print("\nIn-order Traversal: \t");
        tree.traverse("in");    
        System.out.println("");
                
        System.out.println("Non-linear data structure");
    }
        
    
    /**
     * Internal class for the Node for the Binary Tree
     */
    public class Node {

        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data  = data;
            this.left  = null;
            this.right = null;        
        }

        public void insert(int data) {
            if (data < this.data) {
                if (this.left == null) {
                    this.left = new Node(data);
                }
                else {
                    this.left.insert(data);
                }
            }
            else if (data > this.data) {
                if (this.right == null) {
                    this.right = new Node(data);
                }
                else {
                    this.right.insert(data);
                }
            }        
        }

    }
    
    
    /**
     * Internal class for the Binary Tree
     */
    public class Tree {

        private Node root;

        public Tree() {
            root = null;
        }

        public void insert(int data) {
            if (root == null) {
                root = new Node(data);
            }
            else {
                root.insert(data);
            }
        }

        public boolean search(int data) {
            return recusiveSearch(data,root);
        }

        private boolean recusiveSearch(int data, Node current) {
            if (current == null) {
                return false;
            }
            else if (data < current.data) {
                return recusiveSearch(data, current.left);
            }
            else if (data > current.data) {
                return recusiveSearch(data, current.right);
            }
            else {
                return true;
            }
        }
        
        public void traverse(String type) {
            if      (type.equals("pre"))  preOrder(root);
            else if (type.equals("post")) postOrder(root);
            else if (type.equals("in"))   inOrder(root);
        }

        private void preOrder(Node current) {
            if (current != null) {
                System.out.print(current.data + ",");
                preOrder(current.left);
                preOrder(current.right);
            }
        }

        private void postOrder(Node current) {
            if (current != null) {            
                postOrder(current.left);
                postOrder(current.right);
                System.out.print(current.data + ",");
            }
        }

        private void inOrder(Node current) {
            if (current != null) {
                inOrder(current.left);
                System.out.print(current.data + ",");
                inOrder(current.right);
            }
        }

    }

}