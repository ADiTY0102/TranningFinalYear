import java.util.Scanner;

public class CountOfString {
    public static void main(String[] args) {
        // without using inbuilt function
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine() + " ";
        int count = 0;
        //acci code for # = 35
        // dont use .length() method
      for(int i=0;name.charAt(i) != '#';i++){
            char ch = name.charAt(i);
            if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                count++;
            }
        }
        int result  = count;
        System.out.println("Number of characters in the string: " + result);
        sc.close();
    }
}