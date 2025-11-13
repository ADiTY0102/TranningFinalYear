package DAY_02;

public class palindrome {
    public static void main(String[] args) {
        //number
        int num = 1221;
        int originalNum = num;
        int reversedNum = 0;

        while(originalNum!=0){
            int mod = originalNum % 10;
            reversedNum = reversedNum * 10 + mod;
            originalNum = originalNum / 10;
        }
        System.out.println("Reversed Number: " + reversedNum);
        if(reversedNum == num){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
