package TCS_NQT;

/* https://www.youtube.com/watch?v=TyRmYTcyuHQ (0:47:10 - 1:15:20)
 * Question: 
 * string binary = "0110111"
 * Output = 9
 * Have to return total number of substring containing character as '1';
 * '1' -> 5
 * '11' -> 3
 * '111' -> 1
 * :. total count would be 9
 */
public class PYQ3 {
    public static void main(String[] args) {
        String s = "0110111";
        int count = 0;
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count++;
            } else {
                result += (count * (count + 1) / 2);
                count = 0;
            }
        }
        result += (count * (count + 1) / 2); // calculating before the case 'Index Ouit Ofn Bond' at count->3
        System.out.println("Result " + result);
    }
}
