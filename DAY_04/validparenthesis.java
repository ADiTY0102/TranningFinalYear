// import java.util.Scanner;

// class Stack {
//     char[] array;
//     int top;

//     public Stack(int size) {
//         array = new char[size];
//         top = -1;
//     }

//     void push(char c) {
//         if (top == this.array.length - 1) {
//             System.out.println("Full!");
//         } else {
//             array[++top] = c;
//         }
//     }

//     public char pop() {       
//         return array[top--];
//     }

//     boolean isEmpty() {
//         return top == -1;
//     }

// }

// public class validparenthesis {
//     public static boolean isValidParenthisis(String str){
//         Stack stack = new Stack(str.length());

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch=='{' || ch =='[' || ch=='('){
//                 stack.push(ch);
//             }else if(ch=='}' || ch ==']' || ch==')'){
//                 if(stack.isEmpty() || !isMatching(stack.pop(),ch)){
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();

//     }

//     public static boolean isMatching(char open, char close) {
//         return (open == '(' && close == ')') ||
//                (open == '{' && close == '}') ||
//                (open == '[' && close == ']');
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String parenthesis = sc.nextLine();
//         boolean result = isValidParenthisis(parenthesis);
//         System.out.println(result ? "Valid" : "Invalid");
//         sc.close();
//     }
// }
