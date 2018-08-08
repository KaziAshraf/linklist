/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinklist;

/**
 *
 * @author User
 */
public class Node {

    int data;
    Node next;
    Node previous;

    public void addLast(Node list, Node item) {
        if (list.next == null) {
            list.next = item;
            item.previous = null;
            item.next = null;
        } else {
            while (list.next != null) {
                list = list.next;
            }
            list.next = item;
            item.previous = list;
            item.next = null;
        }
    }

    public static void printlist(Node list) {
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
    }

    public static void deletenode(int pos, Node list) {
        if (list.next == null) {
            System.out.println("No Nodes to delete");
        } else {
            for (int i = 0; i < pos - 1; i++) {
                list = list.next;
            }
            list.next = list.next.next;
            list.next.previous = list;
        }
    }

    public static void traverseback(Node list) {
        while (list.next != null) {
            list = list.next;
        }
        while (list != null) {
                
            System.err.print(list.data + " ");
            list = list.previous;
        }

    }

}
