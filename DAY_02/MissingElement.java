package DAY_02;
public class MissingElement {
    
    public static void main(String[] args) {
        // int arr[] = {1,2,4,5};
        // int n = arr.length;
        // int expectedSum = n*(n+1)/2; //15
        // int actualSum = 0; //18
        // for(int i=0;i<n;i++){
        //     actualSum += arr[i];
        // }
        // int element  = actualSum-expectedSum;
        // System.out.println("Missing Element is: " + element);


        int arr[] = {1, 2, 3, 5, 6};
        int n = arr.length;
        int tot = n*(n+1)/2;
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum-tot);

    }
}
