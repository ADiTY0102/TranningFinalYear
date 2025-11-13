package DAY_05;

public class StackUsingLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    StackUsingLinkedList() {
        this.head = null;
    }

    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Stack Empty!");
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void pop(){
        if(head == null){
            System.out.println("Empty LL!");
        }
        else{
            Node temp = head;
            temp = head.next;
            head=temp;
            System.out.println("Data Deleted");    
        }
    }
    void display() {
        if (head == null) {
            System.out.println("Stack Empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("Stack: "+temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
