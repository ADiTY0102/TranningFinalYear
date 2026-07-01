public class LC852PeakElementinMoubtain {
    public static void main(String[] args) {
        int arr[] = { 0 , 10,5, 2 };
        int start = 0;
        int end = arr.length-1;
        
        int mid = (start + end) / 2;
        for (int i = start; i < end; i++) {
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("Peak Element index: " + mid);
                return;
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Peak Element index: " + mid);
    }
}
