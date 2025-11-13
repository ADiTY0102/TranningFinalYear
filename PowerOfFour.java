public class PowerOfFour {
    public static boolean isPowerOfFour(int n){
        if(n == 1){
            return true;
        }
        return (n&(n-1)) == 0 && (n%3) == 1;
    }

    public static void main(String[] args) {
       boolean result =  isPowerOfFour(5);
        System.out.println(result);
    }
}
