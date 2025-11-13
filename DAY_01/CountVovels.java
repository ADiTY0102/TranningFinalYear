import java.util.Scanner;
public class CountVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to count vowels: ");
        String name = sc.nextLine();
        //return vovels count
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
        sc.close();

    }
}
//ASCCI Code Data for a to z && A to Z
// a = 97, z = 122  
// A = 65, Z = 90