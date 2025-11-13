public class Stack {
    int []arr ;
    int top;
    Stack(int size){ //constructor
        arr = new int[size];
        top=-1;
    }
    void push(int x){
        if(top == arr.length-1){
            System.out.println("Stack Overflow");
        }else{
            arr[++top]=x;
        }
    }
    void display(){
        System.out.println("Elements: ");
        if(top==-1){
            System.out.println("Stack is Empty!");
        }else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack underflow!");
        }
        else{
            System.out.println("Peek element: "+arr[top]);
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            top--;
            System.out.println(arr[top]+" Pooped!");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.display();
    }
}
