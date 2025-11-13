package DAY_06;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 5;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == target) {
                System.out.println("Element found at index: " + middle);
                return;
            } else if (arr[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }
    }
}
