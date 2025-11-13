package DAY_11;

public class LeetCode746 {
    
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }

    public static void main(String[] args) {
       
        int[] cost1 = {10, 15, 20};
        System.out.println("Minimum cost for [10, 15, 20]: " + minCostClimbingStairs(cost1.clone()) + " (Expected: 15)");

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println("Minimum cost for [1, 100, ..., 1]: " + minCostClimbingStairs(cost2.clone()) + " (Expected: 6)");
    }
}
