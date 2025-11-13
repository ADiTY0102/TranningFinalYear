import java.util.Scanner;

public class AddTwoLinkedLists {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    AddTwoLinkedLists() {
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
    void display(){
        if (head == null) {
            System.out.println("Empty Linked List!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public Node addTwoLists(Node l1,Node l2) {
        Node temp = new Node(0);
        Node res = temp;
        int total = 0;
        int carry = 0;
        while(l1 != null || l2!= null || carry !=0){
            total = carry;
            if(l1!=null){
                total += l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                total += l2.data;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total /10;
            temp.next = new Node(num);
            temp = temp.next;
        }
        return res.next;
    }
    public static void main(String[] args) {
        AddTwoLinkedLists l1 = new AddTwoLinkedLists();
        AddTwoLinkedLists l2 = new AddTwoLinkedLists();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: Press 1.Add List 1  2.Add List 2  3.Display Addition");
            int flag = sc.nextInt();
            switch (flag) {
                case 1:
                    int data1 = sc.nextInt();
                    l1.insert(data1);
                    break;
                case 2:
                    int data2 = sc.nextInt();
                    l2.insert(data2);
                    break;
                case 3:
                    AddTwoLinkedLists li = new AddTwoLinkedLists();
                    Node res = li.addTwoLists(l1.head, l2.head);
                    li.head = res;
                    li.display();
                    System.out.println();
                    break;
                case 0: return;
                default:
                sc.close();
                    break;
            }
        }

    }
}
