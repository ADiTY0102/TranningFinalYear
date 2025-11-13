package DAY_06;

public class BinarySearchRecurssion {
    public static int binarySearchRecurssion(int arr[],int high,int low,int x){
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == x) {
                return middle;
            } else if (arr[middle] > x) {
                return binarySearchRecurssion(arr,low,middle-1,x);
            } else {
                return binarySearchRecurssion(arr,middle+1,high,x);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int high = array.length-1;
        int low = 0;
        int x = 5;
        int result = binarySearchRecurssion(array, high, low, x);
        System.out.println("Target Found at: "+result);

    }
}
