/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem1.mybst.MyBinarySearchTree;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
      public static void main(String[] args) {
      MyBinarySearchTree tree = new MyBinarySearchTree();
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many element do you want to add....");
      for(int i=0;i<Integer.parseInt(scanner.nextLine());i++)
      {
            tree.add(scanner.nextInt());
      }
       tree.preOrder(tree.root);
       System.out.println();
       tree.postOrder(tree.root);
       
}
