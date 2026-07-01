import java.util.Arrays;

public class LC34FindFirstAndLastPosition {
    public static int[] findFirstLastPosition(int target,int[]arr){
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                if(first ==-1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 6;
        
        System.out.println(Arrays.toString(findFirstLastPosition(target,arr)));

    }
}
