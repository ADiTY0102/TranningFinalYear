package TCS_NQT;
import java.util.Scanner;

public class VowelsAndConsonentsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int vov = 0;
        int con = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vov++;
                else
                    con++;
            }
        }
        System.out.println(vov + " " + con);
        sc.close();
    }
}
