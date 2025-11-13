package DAY_02;

public class amstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Number: " + n);
        int temp = n;
        int sum = 0;
        int len = String.valueOf(n).length();

        while (temp > 0) {
          int rem = temp % 10;
          sum += Math.pow(rem,len);
          temp /= 10;  
        }
        if (sum == n) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}
