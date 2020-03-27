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
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }
}
