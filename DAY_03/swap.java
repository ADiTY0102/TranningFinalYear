//import java.util.Stack;

public class swap {
    public static void swa(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 5, 0, 2, 3, 0, 0 };
        //MOVING ZERO TO LAST in array

        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                for(int j=i+1; j<a.length;j++){
                    if(a[j] != 0){
                        a[i] = a[i] ^ a[j];
                        a[j] = a[i] ^ a[j];
                        a[i] = a[i] ^ a[j];
                    }
                    System.out.println();
                }
            }
            for(int k=0; k<a.length;k++){
                System.out.print(a[k]);
            }
        }

        





        // int n = a.length;
        // int i = 0, j = n - 1;
        // while (i < j) {
        //     while (i < n && a[i] != 0) {
        //         i++;
        //     }
        //     while (j >= 0 && a[j] == 0) {
        //         j--;
        //     }
        //     if (i < j) {
        //         swa(a, i, j);
        //         i++;
        //         j--;
        //     }
        // }
        // for (int k = 0; k < n; k++) {
        //     System.out.print(a[k] + " ");
        // }

        // a = a + b;
        // b = a - b;
        // a = a - b;

        // int temp =a;
        // a=b;
        // b=temp;

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // a = a*b;
        // b = a/b;
        // a = a/b;

        // Stack<Integer> stack = new Stack<>();
        // stack.push(a);
        // stack.push(b);

        // a = stack.pop();
        // b = stack.pop();

    }
}
