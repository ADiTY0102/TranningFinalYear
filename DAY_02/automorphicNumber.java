package DAY_02;

public class automorphicNumber {
    public static void main(String[] args) {
        int n =76;
        System.out.println("Number: " + n);

        int square = n * n;
        boolean yes = true;
        while(n>0){
            if((square % 10) != (n%10)){
                yes = false;
            }else{
                yes = true;
            }
            square /= 10;
            n /= 10;
        }
        if(yes){
            System.out.println("It is an automorphic number.");
        } else {
            System.out.println("It is not an automorphic number.");
        }

    }
}
