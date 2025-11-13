public class CountDigitsToDivide {
    public static int countDigits(int num) {
        int count = 0;
        int temp = num; 
        //int result = 0;
        while(temp !=0){
            int mod = temp % 10;
            // result = result * 10 + mod;
            if(num % mod == 0){
                count++;
            }
            temp = temp /10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }
}
