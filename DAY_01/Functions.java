public class Functions {
    public String letsLowerCase(String str){
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lower += (char) (ch + 32);
            } else {
                lower += ch;
            }
        }
        return lower;
    }
    public static String letsUpperCase(String str){
        String upper = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper += (char) (ch - 32);
            } else {
                upper += ch;
            }
        }
        return upper;
    }
    public static String letsTrim(String str){
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && (str.charAt(start) == ' ')) {
            start++;
        }
        while (end >= start && (str.charAt(end) == ' ')) {
            end--;
        }
        return str.substring(start, end + 1);

    }
    public static void main(String[] args) {
        //deriving different functions like toLowercase, toUppercase,trim,split,etc 
        String str = "This is a test string.";
        //without using any built-in functions;
        System.out.println("string" + str);
    }
}
