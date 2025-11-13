import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15ThreeSum {
    public static List<List<Integer>> findThreeSum(int nums[]){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(total<0){
                    j++;
                }else if(total>0){
                    k--;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]== nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
         
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        System.out.println(findThreeSum(arr));
    }
}
