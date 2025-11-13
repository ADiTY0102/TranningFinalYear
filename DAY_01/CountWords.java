import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count words: ");
        String input = sc.nextLine();
        int count = 0;
        for(int i=0; input.charAt(i) != '\t'; i++) {
            char ch = input.charAt(i);
            if(ch == '\t' || ch == ' ' || ch == '\n') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
