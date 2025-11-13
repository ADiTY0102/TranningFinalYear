package DAY_08;

import java.util.Scanner;

public class CodeForce118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result ="";
        for(int i=0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u'||ch =='y' ){
                continue;
            }
           result += "."+ch;
        }
        System.out.println(result.toLowerCase());
        sc.close();
    }
}
