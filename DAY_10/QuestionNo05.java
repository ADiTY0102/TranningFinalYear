package DAY_10;

import java.util.Arrays;

public class QuestionNo05 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    QuestionNo05() {
        this.head = null;
    }

    void insert(int value) {
        Node newNode = new Node(value);
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

    void display() {
    if (head == null) {
        System.out.println("Empty Linked List!");
    } else {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;

        int[] arr = new int[size];
        int index = 0;

        while (temp != null) {
            arr[index++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}


    public static void main(String[] args) {
        QuestionNo05 q = new QuestionNo05();
        q.insert(2);
        q.insert(10);
        q.insert(5);
        q.insert(3);

        q.display();
    }
}
