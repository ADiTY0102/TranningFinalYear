package DAY_02;

public class strongNumber {
    public static void main(String[] args) {
        int n = 145;
        System.out.println("Number: " + n);

        int temp = n;
        int sum = 0;

        while(temp>0){
            int rem = temp %10;
            int fact = 1;
            for(int i = 1; i <= rem; i++) {
                fact = i;
            }
            sum+=fact;
            temp /= 10;
        }
        if(sum == n) {
            System.out.println("It is a strong number.");
        } else {
            System.out.println("It is not a strong number.");
        }
   }
}
