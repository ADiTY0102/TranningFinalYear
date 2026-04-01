package TCS_NQT;

/*Question: Inputs and expected Outputs!
 * PS D:\ALL PROGRAMS\TranningFinalYear\TCS_NQT> java PYQ1.java
 * CRICKET
 * true
 * -------------
 * PS D:\ALL PROGRAMS\TranningFinalYear\TCS_NQT> java PYQ1.java
 * cricket
 * true
 * ------------
 * PS D:\ALL PROGRAMS\TranningFinalYear\TCS_NQT> java PYQ1.java
 * Cricket
 * true
 * ------------
 * PS D:\ALL PROGRAMS\TranningFinalYear\TCS_NQT> java PYQ1.java
 * CriCkET
 * false
 */

import java.util.Scanner;

public class PYQ1 {
    public static boolean isAllCapatil(String s) {
        for (char ch : s.toCharArray()) {
            if (ch < 'A' || ch > 'Z') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllSmall(String s) {
        for (char ch : s.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllSmallExceptFirst(String s) {
        for (char ch : s.substring(1).toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = false;

        if (isAllCapatil(str) || isAllSmall(str) || isAllSmallExceptFirst(str)) {
            result = true;
        }
        System.out.println(result);
        sc.close();
    }
}
