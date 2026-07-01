import java.util.Stack;

public class ValidParenthisis {
    public static void main(String[] args) {
        String s = "[]{)}";
        Stack<Character> st = new Stack<Character>();
        boolean isValid = true;
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = st.pop();
                if ((ch == '}' && top != '{') ||
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) isValid = false;
        System.out.println(isValid);
    }
}
