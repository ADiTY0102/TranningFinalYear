package TCS_NQT;

import java.util.Scanner;

class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int left =0;
        int right = str.length()-1;
        boolean isPalindrome = true;

        while(left<=right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left ++;
            right --;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}