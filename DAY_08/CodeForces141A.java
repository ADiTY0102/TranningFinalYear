package DAY_08;

import java.util.Arrays;
import java.util.Scanner;

public class CodeForces141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        String Combined = name+host;
        char []combinedChars = Combined.toCharArray();
        char []pileChars = pile.toCharArray();

        Arrays.sort(combinedChars);
        Arrays.sort(pileChars);

         if (Arrays.equals(combinedChars, pileChars)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
