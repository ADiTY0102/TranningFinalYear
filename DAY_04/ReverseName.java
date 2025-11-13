import java.util.Scanner;

public class ReverseName {
    char[] name;
    int top;

    public ReverseName(int size) {
        name = new char[size];
        top =-1;
    }
    void push(char ch){
        if(top == this.name.length - 1){
            System.out.println("Stack Overflow");
        }else{
            name[++top] = ch;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            //top--;
            System.out.print(name[top--]);
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Empty");
        }else{
            for(int i=0;i<=name.length-1;i++){
                pop();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        int n = name.length();
        ReverseName rn = new ReverseName(n);
        for(int i = 0; i < n; i++) {
            rn.push(name.charAt(i));
        }
        rn.display();
        sc.close();
    }
}
