/** Required package class namespace */
package testing.extras.trees;

/** Required API imports */
import collections.LinkedList;
import tools.Numbers;

 
/**
 * TreesTest.java - a bonus example of binary trees. Further resources for this 
 * topic can be found here:
 *      - Lecture on topic: https://bit.ly/3D6fNJM
 *      - Older Example: https://bit.ly/4fh6zI2
 *      - Review sheet: https://bit.ly/3D6fNJM
 * 
 * @author Mr. Wachs
 * @since December 2024
 */
public class TreesTest 
{

    /**
     * Default constructor method
     */
    public TreesTest() {
        System.out.println("\nBinary Trees test starting...\n");
        
        // Constants/variables for creating random values......................        
        final int MIN   = 10;
        final int MAX   = 99;
        final int SIZE  = 5;        
        Numbers numbers = new Numbers();
        
        // Creating some TreeNode objects......................................
        BinaryTreeNode<Integer> node1 = 
                new BinaryTreeNode<>(numbers.random(MIN, MAX));
        BinaryTreeNode<Integer> node2 = 
                new BinaryTreeNode<>(numbers.random(MIN, MAX));
        BinaryTreeNode<Integer> node3 = 
                new BinaryTreeNode<>(numbers.random(MIN, MAX),node1,node2);
        // Linking the TreeNodes...............................................
        node1.left  = node2;
        node1.right = node3;
        
        // Testing TreeNode equals..............................................
        if (node1.equals(node2)) System.out.println("TreeNode1=TreeNode2");
        if (node1.equals(node3)) System.out.println("TreeNode1=TreeNode3");
        if (node2.equals(node3)) System.out.println("TreeNode2=TreeNode3");        
        
        // Testing TreeNode toString...........................................
        System.out.println(node1.toString());
        System.out.println(node2.toString());
        System.out.println(node3.toString());
        
        // Creating a Tree object..............................................
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        // Test the insert method..............................................        
        for (int i = 0; i < SIZE; i++) {
            tree.insert(numbers.random(MIN, MAX));
        }
        // Insert one more.....................................................        
        int value = numbers.random(MIN, MAX);
        tree.insert(value);
        
        // Test the search of the tree.........................................        
        System.out.println("Should be found     = " + tree.search(value));
        System.out.println("Should NOT be found = " + tree.search(MIN-1));
        
        // Test toString() and pre, post, in order traversals..................        
        System.out.println(tree.toString());
        
        // Building a second tree (test clone) and test equals.................        
        BinaryTree<Integer> second = new BinaryTree<>();
        for (int i = 0; i < SIZE+1; i++) {
            second.insert(numbers.random(MIN, MAX));
        }
        System.out.println("1st tree -> " + tree.inOrder().toString());
        System.out.println("2nd tree -> " + second.inOrder().toString());
        if (tree.equals(second)) System.out.println("1st==2nd");
        else                      System.out.println("1st!=2nd");
        
        // Building a third tree (test clone) and test equals..................         
        BinaryTree<Integer> third = tree.clone();
        System.out.println("1st tree -> " + tree.inOrder().toString());
        System.out.println("3rd tree -> " + third.inOrder().toString());
        if (tree.equals(third)) System.out.println("1st==3rd");
        else                    System.out.println("1st!=3rd");
        
        // Build all our data structures from each other........................        
        final int WORD_LENGTH = 5;
        Text text = new Text();
        
        // Create variable objects..............................................        
        String variable1 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable2 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable3 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable4 = text.randomWord(WORD_LENGTH).toLowerCase();
        String variable5 = text.randomWord(WORD_LENGTH).toLowerCase();
        
        // Create array from variables..........................................        
        String[] array = {variable1,variable2,variable3,variable4,variable5};
        
        // Create LinkedList from array.........................................        
        LinkedList<String> list = new LinkedList<>(array);
        
        // Output variables, array, list, tree..................................        
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(text.toString(array));
        System.out.println(list);
        System.out.println(tree);
        
        // Now re-building array from LinkedList................................        
        array = list.toArray(array);
        
        // Output array,list,tree again.............................        
        System.out.println(text.toString(array));
        System.out.println(list);
        System.out.println(tree);
        
        System.out.println("\nBinary Trees test complete!\n");
    }
    
}