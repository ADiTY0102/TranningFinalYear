package DAY_05;

import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }

    }

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "<-->");
                current = current.next;
            }
            System.out.println();
        }
    }

    void deleteStart(int element) {
        if (head.data == element && head.next == null) {
            head = null;
            tail = null;
        } else if (head.data == element) {
            head = head.next;
            head.prev = null;
        } else {
            Node current = head.next;
            while (current != null) {
                if (current.data == element) {

                    if (current.next != null) {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    } else {

                        current.prev.next = null;
                        tail = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1: insert \nPress 2: display \npress 3: Delete \nPress 0:exit");
            int flag = sc.nextInt();
            switch (flag) {
                case 1:
                    int data = sc.nextInt();
                    dl.insert(data);
                    System.out.println("Inserted!");
                    break;
                case 2:
                    System.out.println("Your Linked List: ");
                    dl.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter elment to Delete!");
                    int n = sc.nextInt();
                    dl.deleteStart(n);
                    System.out.println("Deleted!");
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
