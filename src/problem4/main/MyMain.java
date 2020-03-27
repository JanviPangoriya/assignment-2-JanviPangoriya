/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
   public static void main(String[] args) {
   MyBinarySearchTree tree = new MyBinarySearchTree();
   MyQueue queue = new MyQueue();
   System.out.println("how many elemnt do you want to add");
     Scanner scanner = new Scanner(System.in);
     for(int i=0;i<Integer.parseInt(scanner.nextLine();i++)
         {
           tree.add(Integer.parseInt(scanner.nextLine()));
         }
      queue.enqueue(tree.root);
      queue.printQueue();
         }
         }
