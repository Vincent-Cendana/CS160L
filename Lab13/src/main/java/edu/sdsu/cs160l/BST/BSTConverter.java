package edu.sdsu.cs160l.BST;
import java.util.Arrays;

public class BSTConverter {

    /*
     * TODO: Given a sorted array of distinct integers,
     *  write a Java program to convert it into a Height Balanced Binary Search Tree (BST).
     *  do not use .insert() method in BST_class or hardcode a tree, use recursive call instead (sortedArrayToBST).
     */

    public static BST_class.Node sortedArrayToBST(int[] arr) {
        if(arr.length == 1) return new BST_class.Node(arr[0]);
        if(arr.length == 0) return null;

        int midIndex = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex);
        int[] right = Arrays.copyOfRange(arr, midIndex+1, arr.length);
        BST_class.Node midNode = new BST_class.Node(arr[midIndex]);

        midNode.left = sortedArrayToBST(left);
        midNode.right = sortedArrayToBST(right);
        return midNode;
    }

    /*public static BST_class.Node sortedArrayToBST(BST_class.Node root, int[] arr)
    {
        if(arr.length == 1) return new BST_class.Node(arr[0]);
        if(arr.length == 0) return null;

        int midIndex = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex);
        int[] right = Arrays.copyOfRange(arr, midIndex+1, arr.length);
        BST_class.Node midNode = new BST_class.Node(arr[midIndex]);

        midNode.left = sortedArrayToBST(root.left, left);
        midNode.right = sortedArrayToBST(root.right, right);
        return midNode;
    }*/


    // Helper method for inorder traversal of the BST to view your output
    public static void inorderTraversal(BST_class.Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.key + " ");
            inorderTraversal(root.right);
        }
    }

    /*
    * Here is an example of a sorted array we want to turn into a BST
    *  Note that if you do it correctly the inorderTraversal should return the
    *  array values in order: 1, 2, 3, 4, 5, 6, 7
     */
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        BST_class.Node root = sortedArrayToBST(sortedArray);
        System.out.println("Inorder Traversal of the BST:");
        inorderTraversal(root);

    }
}
