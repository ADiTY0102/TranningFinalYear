import java.util.Scanner;

public class PanCardValidation {
    // 5-4-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String panNum = sc.nextLine();

        int length = panNum.length();
        if (length != 10) {
            System.out.println("Invalid");
        }
        boolean part1 = false, part2 = false, part3 = false;
        for (int i = 0; i < 5; i++) {
            char c = panNum.charAt(i);
            if (c > 65 && c < 90) {
                part1 = true;
            } else {
                part1 = false;
            }
        }
        for (int i = 5; i < 9; i++) {
            char c = panNum.charAt(i);
            if (c > 48 && c < 57) {
                part2 = true;
            } else {
                part2 = false;
            }
        }

       char c = panNum.charAt(panNum.length() - 1);
            if (c >= 'A' && c <= 'Z') {
                part3 = true;
            }else {
                part3 = false;
            }

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);



        if (part1 && part2 && part3) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
