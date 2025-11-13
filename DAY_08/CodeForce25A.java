package DAY_08;

import java.util.Scanner;

public class CodeForce25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int eveidx=-1;
        int oddidx=-1;

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] %2 == 0){
                evenCount++;
                eveidx=i+1;
            }else{
                oddCount++;
                oddidx = i+1;
            }
        }

        if (evenCount==1) {
            System.out.println(eveidx);
        }else if(oddCount == 1){
            System.out.println(oddidx);
        }

        sc.close();

    }
}
