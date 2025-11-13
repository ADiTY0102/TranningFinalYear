package DAY_02;

public class frequencyInArray {
    public static void main(String[] args) {
        int arr[] ={5,1,1,2,5,3};
        int n = arr.length;
    
        int freq[] = new int[n];
        for(int i=0;i<n;i++){
        int count = 1;
            if(freq[i] == -1){ 
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            freq[i] = count; 
            System.out.println(arr[i] + " : " + freq[i]);
        }
    }
}
