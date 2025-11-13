package DAY_08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CodeForces236A {
    public static String removeDuplicates(String str) {
        Set<Character> username = new HashSet<>();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!username.contains(ch)) {
                username.add(ch);
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        int n = removeDuplicates(userName).length();

        if (n % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
