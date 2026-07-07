//Kadane's algorithumm special thing is that eleminate the number less than 0
public class MaxSubArraySum {
    public static int getMaxSubArraySum(int arr[]) {
        int currentSum = 0;
        int maxSum = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum < 0) { // actual use of kadane's algorithm.
                currentSum = 0;
            }

            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println((getMaxSubArraySum(arr)));
    }
}
