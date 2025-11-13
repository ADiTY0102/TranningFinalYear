package DAY_02;

public class perfactNumber {
    public static void main(String[] args) {
        int n = 28;
        System.out.println("Number: " + n);

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}
