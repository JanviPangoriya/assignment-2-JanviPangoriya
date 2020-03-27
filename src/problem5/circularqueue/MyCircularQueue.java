/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
import problem5.student.Student;
//to implement circular queue
public class MyCircularQueue {
   private static Node rear;
    private static int size;

    public Node getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }
    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

}
