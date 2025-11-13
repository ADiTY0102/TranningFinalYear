package DAY_11;

public class LeetCode198 {
//house robber problem using dp
    
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 3, 1 };
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
            System.out.println(dp[i]);
        }

    }
}
