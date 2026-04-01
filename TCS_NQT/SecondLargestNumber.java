package TCS_NQT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondLargestNumber {
    public static Set<Integer> unique(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> uniqueArray = unique(arr);
        System.out.println(uniqueArray.toString());
        sc.close();
    }
}
