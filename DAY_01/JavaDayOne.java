public class JavaDayOne {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }   
    public static void main(String[] args) {
        //
        System.out.println("printing prime nubmer from 21 to 40");
        for (int i = 21; i <= 40; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}