import java.util.Scanner;

public class ValidPasswordCheck {
    public static boolean NumberCheck(long l){
        //start from 6-9
        
           long vld = 1000000000/l;
              if(vld >= 6000000 && vld <= 9000000){
                return true;
              }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String pass = sc.nextLine();
        System.out.print("Mobile: ");
        long num = sc.nextLong();
        NumberCheck(num);
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
       
        int length = pass.length();
        if (length < 8 || length > 15) {
            System.out.println("Invalid Password");
            sc.close();
            return;
        }else{
            for (int i = 0; i < length; i++) {
                char c = pass.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    hasUpper = true;
                } else if (c >= 'a' && c <= 'z') {
                    hasLower = true;
                } else if (c >= '0' && c <= '9') {
                    hasDigit = true;
                } else if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
                    hasSpecial = true;
                }
            }

            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
            if(!NumberCheck(num)){
                System.out.println("Invalid Number");
            }else{
                System.out.println("Valid Number");
            }
        }
        sc.close();
    }
}
