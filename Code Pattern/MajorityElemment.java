import java.util.Arrays;

public class MajorityElemment {

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int mid = arr.length / 2;

        Arrays.sort(arr);
        System.out.println(arr[mid]);
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
