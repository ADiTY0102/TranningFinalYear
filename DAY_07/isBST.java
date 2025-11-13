package DAY_07;

public class isBST {
    Node root;
    class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    isBST(){
        this.root = null;
    }

    boolean isValidBST(Node root){
        if(root == null){
            return false;
        }
        //boolean valid = false;
        if(root.left !=null && root.left.data >root.data){
            return false;
        }else if(root.right != null && root.right.data < root.data){
            return false;
        }else{
            isValidBST(root.left);
            isValidBST(root.right);
        }
        return true;
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

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " > ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        isBST ib = new isBST();
        ib.root = ib.insert(5, ib.root);
        ib.root = ib.insert(2, ib.root);
        ib.root = ib.insert(7, ib.root);
        ib.root = ib.insert(1, ib.root);
        ib.root = ib.insert(4, ib.root);

        ib.inorder(ib.root);
        if(ib.isValidBST(ib.root)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Invalid BST");
        }

    }

}
