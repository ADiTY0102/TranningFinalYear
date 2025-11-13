package DAY_02;

public class adamNumber {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int n = 12; 
        System.out.println("Number: " + n);

        int square = n * n;
        int reversedSquare = reverseNumber(square);
        int reversedN = reverseNumber(n);
        int reversedSquareOfN = reversedN * reversedN;

        if (reversedSquare == reversedSquareOfN) {
            System.out.println("It is an Adam number.");
        } else {
            System.out.println("It is not an Adam number.");
        }
    }
}
