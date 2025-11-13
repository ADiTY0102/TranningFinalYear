package DAY_10;

public class QuestionNo01 {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    QuestionNo01() {
        this.root = null;
    }
    Node insert(int value,Node root){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        }else if(value > root.data){
            root.right = insert(value, root.right);
        }else{
            root.left = insert(value, root.left);
        }
        return root;
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        
    }
    public static void main(String[] args) {
        QuestionNo01 q = new QuestionNo01();
        q.root = q.insert(10, q.root);
        q.root = q.insert(20, q.root);
        q.root = q.insert(40, q.root);
        q.root = q.insert(50, q.root);

        q.inorder(null);
    }
}
