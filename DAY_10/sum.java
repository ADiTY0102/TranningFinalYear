package DAY_10;

public class sum {
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,7,8,1,9};
        int target = 12;
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;
        int left =0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            // Shrink the window from the left as long as the sum is >= target
            while (currSum >= target) {
                minLength = Math.min(minLength, i - left + 1);
                currSum -= arr[left];
                left++;
            }
        }
        System.out.println((minLength == Integer.MAX_VALUE) ? 0 : minLength);
    }
}
