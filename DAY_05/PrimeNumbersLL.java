package DAY_05;

import java.util.Scanner;

public class PrimeNumbersLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    PrimeNumbersLL() {
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

    void display() {
        if (head == null) {
            System.out.println("Empty LL");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void deletePrime(int data) {
        while (head != null && isPrime(head.data)) {
            head = head.next;
        }
        Node current = head;

        while (current != null && current.next != null) {
            if (isPrime(current.next.data)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbersLL pn = new PrimeNumbersLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers Want to enter: ");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            int data = sc.nextInt();
            pn.insert(data);
        }

        pn.deletePrime(n);
        pn.display();
        sc.close();
    }
}
