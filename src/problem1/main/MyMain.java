/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import java.util.Scanner;

public class MyMain {
  public static void main(String[] args) {
  MyBinarySearchTree tree = new MyBinarySearchTree();
    Scanner scanner = new Scanner(System.in);
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
    tree.add(scanner.nextInt());
}
