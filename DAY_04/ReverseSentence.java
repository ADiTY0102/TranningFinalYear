import java.util.Scanner;

public class ReverseSentence {
    String []str;
    int top;

    public ReverseSentence(int size) {
        str = new String [size];
        top =-1;
    }
    void push(String string){
        if(top == this.str.length-1){
            System.out.println("Empty!");
        }else{
            str[top++] = string;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            //top--;
            System.out.print(str[top--]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Empty");
        }else{
            for(int i=0;i<str.length-1;i++){
                if(str[i] == " "){
                    pop();
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        int n = str.length();
        ReverseSentence rn = new ReverseSentence(n);
        rn.display();
        sc.close();
    }
}
