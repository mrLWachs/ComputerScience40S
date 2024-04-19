
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
        
        System.out.println("Create a binary tree object...\n");
        
        Tree tree = new Tree();
        
        System.out.println("Insert some values [27,35,75,14,83,61] ");
        System.out.println("into the tree\n");
        
        tree.insert(27);
        tree.insert(35);
        tree.insert(75);
        tree.insert(14);
        tree.insert(83);
        tree.insert(61);        
        
        System.out.println("Search the tree for 14 and 44...\n");
        
        boolean result = tree.search(14);        
        java.lang.System.out.println("Results for 14 = " + result);        
        result = tree.search(44);
        java.lang.System.out.println("Results for 44 = " + result);
        
        
        System.out.println("Non-linear data structure");
    }
        
    
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

    }

}