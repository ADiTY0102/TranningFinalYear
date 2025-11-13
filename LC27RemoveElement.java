public class LC27RemoveElement {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2 };
        int key = 2;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
           
            if(arr[i] != key){
                arr[index] = arr[i];
                index++; 
            }
        }
        System.out.println(index);
    }
}
