public class LongestPalindromicSubString {

    public static int calculateLength(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        int n = str.length();
        int maxLength = 1;
        int start = 0;
        // odd-substring
        for (int i = 0; i < n; i++) {
            int len = calculateLength(i - 1, i + 1, str);
            if (len > maxLength) {
                maxLength = len;
                start = i -(len-1) / 2;
            }
        }

        // even-substring
        for (int i = 1; i < n; i++) {
            int len = calculateLength(i, i - 1, str);
            if (len > maxLength) {
                maxLength = len;
                start = i - maxLength / 2;
            }
        }

        System.out.println(str.substring(start, start + maxLength));

    }
}
