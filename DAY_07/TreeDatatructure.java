package DAY_07;

import java.util.Scanner;

public class TreeDatatructure {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.right = null;
            this.left = null;
        }
    }

    TreeDatatructure() {
        this.root = null;
    }

    Node insert(int value, Node root) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else if (value < root.data) {
            root.left = insert(value, root.left);
        } else {
            root.right = insert(value, root.right);
        }
        return root;
    }

    Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        } else if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = min(root.right);
                root.right = deleteNode(root.right, root.data);
            }
        }
        return root;

    }

    int min(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    void deleteInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (searchDel(root, i)) {
                root = deleteNode(root, i);
            }
        }
    }
    boolean searchDel(Node root,int data){
        if(root == null){
            return false;
        }
        boolean found = false;
        if(root.data == data){
            found = true;
        }else if(data > root.data){
            found = searchDel(root.right, data);
        }else{
            found = searchDel(root.left, data);
        }
        return found;
    }
    Node search(Node root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    int sumOfOddNo(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data % 2 != 0) {
            sum += root.data;
        }
        sum += sumOfOddNo(root.left);
        sum += sumOfOddNo(root.right);
        return sum;
    }

    // void printEven(Node root){
    // if(root == null){
    // System.out.println("No even numbers exist!!");
    // }else if(root.data %2 == 0){
    // return root;
    // }
    // }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " > ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " > ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " > ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeDatatructure td = new TreeDatatructure();
        td.root = td.insert(10, td.root);
        td.root = td.insert(20, td.root);
        td.root = td.insert(25, td.root);
        td.root = td.insert(15, td.root);
        td.root = td.insert(30, td.root);
        td.root = td.insert(35, td.root);
        td.root = td.insert(40, td.root);
        td.root = td.insert(45, td.root);
        td.root = td.insert(50, td.root);
       
       
        // System.out.println("Inorder: ");
        // td.inorder(td.root);
        // System.out.println();
        // System.out.println("Pre-order: ");
        // td.preorder(td.root);
        // System.out.println();
        // System.out.println("Postorder");
        // td.postorder(td.root);
        // System.out.println();
        // System.out.print("Enter kry for Search: ");
        // int key = sc.nextInt();
        // System.out.println(td.search(td.root, key) != null
        // ? "Data found"
        // : "Not Found");

        // int result = td.sumOfOddNo(td.root);
        // System.out.println("Sum of Odd Numbers: " + result);



        // System.out.print("Enter element to delete: ");
        // int val = sc.nextInt();
        // td.root = td.deleteNode(td.root, val);
        // System.out.println();
        // td.inorder(td.root);
        // System.out.println();
        // System.out.println("Successfully Deleted!" + val);

        System.out.println("Before Deletion!");
        td.inorder(td.root);
        System.out.println();

        td.deleteInRange(10, 25);

        System.out.println("After Deletion");
        td.inorder(td.root);
    

        sc.close();
    }
}
