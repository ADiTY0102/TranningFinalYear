import java.util.HashSet;

public class LongestSubString {
    public static int longestSubStringWithoutRep(String s){
        int left = 0;
        int result = 0;
        HashSet <Character> set = new HashSet<>();
        for(int right=0; right < s.length()-1; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result = Math.max(result, right - left +1);
        } 
        return result;
    }
    public static void main(String[] args) {
        int result = longestSubStringWithoutRep(" ");
        System.out.println("Max Length "+result);
    }
}
