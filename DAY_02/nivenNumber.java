package DAY_02;

public class nivenNumber {
    public static void main(String[] args) {
        int n = 18;
        System.out.println("Number: " + n);

        int sum = 0;
        int temp = n;

        while(temp>0){
            int rem = temp%10;
            sum += rem;
            temp /= 10;
        }
        if(n % sum ==0){
            System.out.println("It is a Niven number.");
        } else {
            System.out.println("It is not a Niven number.");
        }
    }
}
