package DAY_05;

import java.util.Scanner;

public class VovelsRemoveLL {
    Node head;

    class Node {
        char data;
        Node next;

        Node(char d) {
            this.data = d;
            this.next = null;
        }
    }

    VovelsRemoveLL() {
        this.head = null;
    }

    void insert(char data) {
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

    void deleteVovels() {
        while (head != null && isVowel(head.data)) {
            head = head.next;
        }
        Node current = head;

        while (current != null && current.next != null) {
            if (isVowel(current.next.data)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Empty Linked List!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
            }
        }
    }
    boolean isVowel(char ch){
         ch = Character.toLowerCase(ch);
         return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
        VovelsRemoveLL vr = new VovelsRemoveLL();
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            vr.insert(ch);
        }
        vr.deleteVovels();
        System.out.println("Removel of Vowels!");
        vr.display();
        sc.close();
    }
}
