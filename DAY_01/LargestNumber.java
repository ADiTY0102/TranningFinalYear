import java.util.Collections;
import java.util.PriorityQueue;

public class LargestNumber {
    public static void main(String[] args) {
        int nums[] = {3, 30, 34, 5, 90}; 


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            pq.offer(num);
        }
        System.out.println("First Largest "+pq.peek());
        pq.poll();
        System.out.println("Second Largest "+pq.peek());
        pq.poll();


        // Alternative approach using a simple loop


        // int firstLargest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;
        // int thirdLargest = Integer.MIN_VALUE;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] > firstLargest){
        //         thirdLargest =  secondLargest;
        //         secondLargest = firstLargest; 
        //         firstLargest = nums[i];
        //     }else if(nums[i] > secondLargest && nums[i] != firstLargest){
        //         thirdLargest = secondLargest;
        //         secondLargest = nums[i];
        //     }else if(nums[i] > thirdLargest && nums[i]!= secondLargest && nums[i]!=firstLargest){
        //         thirdLargest = nums[i];
        //     }
        // }
        // System.out.println("First largest element: " + firstLargest);
        // System.out.println("First largest element: " + secondLargest);
        // System.out.println("First largest element: " + thirdLargest);
    }
}
