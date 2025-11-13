package DAY_05;

import java.util.Scanner;

public class PalindromeDLL {
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

    PalindromeDLL() {
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

    boolean ispalendrome() {
        Node start = head;
        Node end = tail;

        while (start != null && end != null && start != end && start.prev != end) {
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }
        return true;

    }

    public static void main(String[] args) {
        PalindromeDLL pd = new PalindromeDLL();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int temp = data;
        String s = Integer.toString(temp);
        for (char c : s.toCharArray()) {
            pd.insert(c - '0');
        }
        if (pd.ispalendrome()) {
            System.out.println(data + ": Is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }

}
