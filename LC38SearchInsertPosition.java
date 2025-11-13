public class LC38SearchInsertPosition{
    public static int searchPosition(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 2;
        int ans = searchPosition(arr,target);
        System.out.println(ans);
    }
}