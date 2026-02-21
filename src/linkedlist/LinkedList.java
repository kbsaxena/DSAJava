package linkedlist;

import org.w3c.dom.*;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        //Another way to print using for
        /*for(Node temp=head; temp!=null; temp = temp.next){
            System.out.print(temp.data + " ");
        }*/
    }

    //Using Recursion
    public static void printRec(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        printRec(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(5);

        a.next = b;
        b.next = c;

        printRec(a);
    }
}
