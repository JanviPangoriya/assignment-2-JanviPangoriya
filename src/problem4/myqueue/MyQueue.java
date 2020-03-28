/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.node.TreeNode;
import static problem1.mybst.MyBinarySearchTree.preOrder;
import static problem1.mybst.MyBinarySearchTree.preOrderString;
public class MyQueue {
   private Node front; 
   private Node end;
   private Node tmp;
   private int size;
    public MyQueue() {
        front = null;
        end = null;
        tmp = null;
        size = 0;

    }
   
}
