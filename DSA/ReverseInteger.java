public class ReverseInteger {
    public static int reverse(int x) {
        int temp = x;
        int revInt = 0;
        if (x > 0) {
            while (temp != 0) {
                int mod = temp % 10;
                revInt = revInt * 10 + mod;
                temp = temp / 10;
            }
            return revInt;
        }
        return -revInt;
    }
   
    public static void main(String[] args) {
        int x = 12345;
        int result = reverse(x);
        System.out.println(result);
    }
}
