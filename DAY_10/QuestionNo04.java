package DAY_10;

import java.util.Stack;

public class QuestionNo04 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    QuestionNo04(){
        this.head = null;
    }

    void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
         if (head == null) {
            System.out.println("Empty Linked List!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    void reverse(){
        Stack<Node> s = new Stack<>();
        while(head != null){
            s.push(head);
            head = head.next;
        }
        while(!s.isEmpty()){
            Node val = s.pop();
            System.out.print(val.data+" ");
        }
    }

    public static void main(String[] args) {
        QuestionNo04 q = new QuestionNo04();
        q.insert(2);
        q.insert(4);
        q.insert(8);
        q.insert(9);
        q.insert(10);
        System.out.println("Your LL: ");
        q.display();
        System.out.println();
        System.out.println("After reversing LL: ");
        q.reverse();
    }
}
