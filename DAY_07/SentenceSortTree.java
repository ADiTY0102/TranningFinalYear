package DAY_07;

public class SentenceSortTree {  //
    Node root;
    class Node{
        String data;
        Node left;
        Node right;

        Node(String d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    SentenceSortTree(){
        this.root = null;
    }

    Node insert(Node root,String val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
        }else if(val.compareTo(root.data) >0){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.right);
        System.out.print(root.data +" ");
        inorder(root.left);
    }

    public static void main(String[] args) {
        SentenceSortTree st = new SentenceSortTree();
        String str = "me sentence chage kart ahe ";

        String []words = str.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

        for(String word : words){
            st.root = st.insert(st.root, word);
        }

        System.out.println("Sorted string: ");
        st.inorder(st.root);
    }

}
