package DAY_11;

import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 4, 7, 8, 1 };
        int result[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        System.out.println("Printing Next bigger elements: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
