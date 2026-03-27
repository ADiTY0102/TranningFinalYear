package TCS_NQT;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "HelloWorld";
        for (int i = str.length(); i >= 0; i--) {
            StringBuilder rev = new StringBuilder();
            rev.append(str.charAt(i));
            System.out.println(rev);
        }
        sc.close();
    }
}