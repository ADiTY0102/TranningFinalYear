package TCS_NQT;

public class PrecddingZeros {

    public static void main(String[] args) {
        int arr[] = {5,1,0,8,0,3,0,2,12};

        for(int i=0;i<arr.length;i++){
            //if(arr[i]==0 && arr[i+1]==0) continue;
            if(arr[i]==0 || arr[i+1]>=0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}