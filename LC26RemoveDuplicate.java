public class LC26RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        int start = 1;
        
        for(int next=start;next<n;next++){
            if(arr[next] != arr[start-1]){
                arr[start] = arr[next];
                start++;
            }
        }
        System.out.println(start);
    }
}
