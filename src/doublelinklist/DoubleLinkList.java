/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinklist;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DoubleLinkList extends Node {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node Head = new Node();
        Head.data = 0;
        Head.next = null;
        int n;
        String cmd = "";
        while (!"n".equals(cmd)) {
            System.out.print("Enter value of Node: ");
            Scanner input = new Scanner(System.in);
            Node new_node = new Node();
            new_node.data = input.nextInt();
            Head.addLast(Head, new_node);
            System.out.print("Here's the list: ");
            Node.printlist(Head);
            System.out.println();
            System.out.print("do u wish to continue?y/n: ");
            Scanner command = new Scanner(System.in);
            cmd = command.nextLine();
            if (null != cmd) switch (cmd) {
                case "del":
                    System.err.println("Enter position of the node to delete: ");
                    Scanner del = new Scanner(System.in);
                    int pos = del.nextInt();
                    Node temp = new Node();
                    temp = Head;
                    Node.deletenode(pos, temp);
                    System.out.print("Here's the list: ");
                    Node.printlist(Head);
                    break;
                case "tra":
                    System.err.print("Here's the list backwards: ");
                    Node.traverseback(Head);
                    break;
            }
            System.out.println();
        }
    }

}
