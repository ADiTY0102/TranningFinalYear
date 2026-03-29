package TCS_NQT;

public class AdamsNumber {
    public static int makeReverse(int temp) {
        int reverse = 0;
        while (temp != 0) {
            int mod = temp % 10;
            reverse = reverse * 10 + mod;
            temp /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = makeReverse(num1);

        int sq1 = makeReverse(num1 * num1);
        int sq2 = num2 * num2;
        System.out.println(sq1 + " " + sq1);

        if (sq1 == sq2) {
            System.out.println("Adams Number: " + num1);
        } else {
            System.out.println("Not Adam's Number: " + num1);
        }
    }
}
// 12 -> 21
// 144 -> 441