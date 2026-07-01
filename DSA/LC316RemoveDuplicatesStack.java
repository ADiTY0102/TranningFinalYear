import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LC316RemoveDuplicatesStack{
    public static String removeDuplicates(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        Stack <Character> stack = new Stack<>();
        Set <Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                continue;
            }

            while(!stack.isEmpty() && s.charAt(i) < stack.peek() && i< map.getOrDefault(stack.peek(),-1)){
                set.remove(stack.pop());
            }
            set.add(s.charAt(i));
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "bcabc";
        String result = removeDuplicates(str);
        System.out.println(result);
    }
}