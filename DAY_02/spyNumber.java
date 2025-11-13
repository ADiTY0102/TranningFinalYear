package DAY_02;

public class spyNumber {
    public static void main(String[] args) {
        int n = 1124;
        System.out.println("Number: " + n);

        int sum = 0;
        int product = 1;
        int temp = n;
        while(temp >0){
            int rem = temp %10;
            sum += rem;
            product *= rem;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println("It is a spy number.");
        } else {
            System.out.println("It is not a spy number.");
        }
    }
}
