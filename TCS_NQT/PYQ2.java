package TCS_NQT;

public class PYQ2 {
    public static void main(String[] args) {
        String arr[] = { "cba", "aaf", "ghi" };
        int n = arr[0].length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) > arr[j - 1].charAt(i)) {
                    continue;
                } else {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
