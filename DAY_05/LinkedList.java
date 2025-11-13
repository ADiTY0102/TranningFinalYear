package DAY_05;

import java.util.Scanner;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertTail(int data){
        Node newNode = new Node(data);
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

    void deleteLast(){
        if(head == null){
            System.out.println("Empty LL!");
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Data Deleted!");
        }
    }

    void deleteStart(){
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
            System.out.println("Empty Linked List!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1: insert \nPress 2: display \npress 3: Delete Last \npress 4: Delete Start\nPress 0:exit");
            int flag = sc.nextInt();
            switch (flag) {
                case 1:
                    int data = sc.nextInt();
                    ll.insert(data);
                    System.out.println("Inserted!");
                    break;
                case 2:
                    System.out.println("Your Linked List: ");
                    ll.display();
                    System.out.println();
                    break;
                case 3: 
                    ll.deleteLast();
                break;
                case 4: 
                    ll.deleteStart();
                break;
                case 0:
                    System.out.println("Exit!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
