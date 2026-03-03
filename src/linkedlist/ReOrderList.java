package linkedlist;

public class ReOrderList {
    //i/p = 1 2 3 4 5 6  o/p= 1 6 2 5 3 4
    void reorderlist(Node head) {
        Node slow= head, fast = head;
        while(fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node head2 = slow.next;
        slow.next = null;

        head2 = reverseList(head2);

        Node i = head;
        Node j = head2;

        while(j!=null){
            Node t1 = i.next;
            Node t2 = j.next;

            i.next = j;
            j.next = t1;

            i = t1;
            j = t2;
        }
    }

    Node reverseList(Node head) {
        // code here
        Node prev = null, next = null;
        Node current = head;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
