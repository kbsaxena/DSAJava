package binarytrees;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class BinaryTreeNode {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(2);
        Node d = new Node(7);
        Node e = new Node(1);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        print(a);

        System.out.print("Size - " + size(a));

        System.out.print("Sum - " + sum(a));

        System.out.print("Product - " + product(a));
    }

    private static int size(Node root) {
        //base case
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        //base case
        if(root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    private static int product(Node root) {
        //base case
        if(root == null) return 1;
        return root.data * product(root.left) * product(root.right);
    }

    private static int productOfNonZeroElements(Node root) {
        //base case
        if(root == null) return 1;
        int val = (root.data == 0) ? 1 : root.data;
        return val * product(root.left) * product(root.right);
    }

    private static void print(Node root) {
        //base case
        if(root == null) return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }
}
