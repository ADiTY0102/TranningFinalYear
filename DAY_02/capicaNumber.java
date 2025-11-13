package DAY_02;

public class capicaNumber {
    public static void main(String[] args) {
        
        int n = 9;
        System.out.println("Number: " + n);

        String length = Integer.toString(n);
        int size = length.length();

        boolean isCapica = true;
        for (int i = 0; i < size / 2; i++) {
            int leftMod = (int) (n / Math.pow(10, size - i - 1)) % 10;
            int rightMod = (int) (n / Math.pow(10, i)) % 10;
            if (leftMod != rightMod) {
                isCapica = false;
                break;
            }
        }

        if (isCapica) {
            System.out.println(n + " is a capica (palindrome) number.");
        } else {
            System.out.println(n + " is not a capica (palindrome) number.");
        }
    }
}
