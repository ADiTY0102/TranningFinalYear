package DAY_08;

import java.util.Scanner;

public class CodeForces158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=  sc.nextInt();
        }
        int kscore = arr[k-1];
        for(int i=0;i<n;i++){
            if(arr[i]>=kscore && arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
