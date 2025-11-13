package DAY_06;

public class insertionSort {
    public static void insSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j]>current) {
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,5,36,9,87,3};
        System.out.print("Your Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insSort(arr);
        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
