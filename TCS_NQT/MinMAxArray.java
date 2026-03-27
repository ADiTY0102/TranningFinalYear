package TCS_NQT;
import java.util.*;

public class MinMAxArray {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 9, 2 };
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }
        Collections.sort(l);
        System.out.println(l.get(arr.length - 1));

    }
}
