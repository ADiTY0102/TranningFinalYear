package DAY_11;

import java.util.Stack;

public class LeetCode739 {
    
    public static void main(String[] args) {
        int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        System.out.println("Printing Next bigger elements: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = st.peek() - i;
            }
            st.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
