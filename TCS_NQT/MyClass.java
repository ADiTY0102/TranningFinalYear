package TCS_NQT;

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------");
        for (int i = 2; i < r; i++) {
            for (int j = 2; j < c; j++) {
                if (arr[i][j] == arr[i - 1][j - 1]) {
                    System.out.println(arr[i][j] + arr[i - 1][j - 1] + arr[i - 2][j - 2]);
                }
                else {
                    System.out.println(arr[i][j] * arr[i - 1][j - 1] * arr[i - 2][j - 2]);
                }
            }
        }
        sc.close();
    }
}
