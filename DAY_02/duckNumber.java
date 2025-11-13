package DAY_02;
public class duckNumber {
    public static void main(String[] args) {
        int num = 1023;
        System.out.println("Number: " + num);

        boolean isDuck = false;
        int temp = num; 
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == 0 && temp != num) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }
        if (isDuck) {
            System.out.println("It is a duck number.");
        } else {
            System.out.println("It is not a duck number.");
        }
    }
}
