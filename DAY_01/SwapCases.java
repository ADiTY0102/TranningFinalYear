import java.util.Scanner;
public class SwapCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to swap cases: ");
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch >= 65 && ch<= 90){//cap to sm
                System.out.print((char)(ch + 32));

            }else if(ch >= 97 && ch <= 122){
                System.out.print((char)(ch-32));
        }
        }
        sc.close();
    }
}
