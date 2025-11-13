import java.util.Scanner;

class ArrayOperations {
    // inserting array elements
    public static int top = -1;

    public static void insert(int arr[], int x) {

        if (top >= arr.length) {
            System.out.println("Array is full");
            return;
        }
        arr[++top] = x;
        System.out.println("Inserted " + x);
    }

    public static void display(int arr[]) {
        if (top == -1) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i <= top && i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void delete(int arr[], int index) {
        if (top == -1) {
            System.out.println("empty array");
            return;
        }
        if (index < 0 || index > top) {
            System.out.println("Invalid index");
            return;
        }
        arr[index] = 0;
        System.out.println("Deleted element at index " + index);
    }

    public static void main(String[] args) {
        int arr[] = new int[3];

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Your Choice: ");
            int flag = sc.nextInt();
            switch (flag) {
                case 1:
                    int ele = sc.nextInt();
                    insert(arr, ele);
                    break;

                case 2:
                    display(arr);
                    break;

                case 3:
                    int idx = sc.nextInt();
                    delete(arr, idx);
                    break;

                case 0:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}