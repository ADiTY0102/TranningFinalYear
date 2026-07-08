package Two_Pointer;

import java.util.Arrays;

class The2Sum {
    public static int[] twoSum(int nums[], int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int right = nums.length - 1;
        int currentSum = 0;
        while (left < right) {
            currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[] { left, right };
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4 };
        int target = 6;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}