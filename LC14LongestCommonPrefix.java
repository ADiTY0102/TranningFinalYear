public class LC14LongestCommonPrefix {
    /*
     * Write a function to find the longest common prefix string amongst an array of
     * strings.
     * 
     * If there is no common prefix, return an empty string "".
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * 
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    public static String findPrefix(String[] str){
        if(str==null || str.length == 0){
            return "";
        }
        String prefix = str[0];
        int prefLength =str.length;

        for(int i=0;i<str.length;i++){
            String s = str[i];
            while(prefLength>s.length() || !prefix.equals(s.substring(0, prefLength))){
                prefLength--;
                if(prefLength == 0){
                    return "";
                }
                prefix = s.substring(0,prefLength);
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        System.out.println(findPrefix(str));
    }
}
