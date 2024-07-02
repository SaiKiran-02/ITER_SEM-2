import java.util.Scanner;

class stack{
    static Scanner sc = new Scanner(System.in);
    public static final int Max = 3;
    public static int top =-1;
    static  int S []= new int[Max];


    public static void push(){
        if(top == Max){
            System.out.println("Stack overflow");
        }
        else {
            S[++top] = sc.nextInt();
        }
    }

    public static void pop(){
        if(top ==-1){
            System.out.println("stack underflow");
        }
        else {
            top--;
        }
    }

    public static void display() {
        if (top == -1)
            System.out.println("stack is empty");
        else {
            while (top != -1) {
                System.out.println(S[top--]);
            }
        }
    }
}

public class stack_using_array {
    public static void main(String[] args) {
        stack.push();
        stack.pop();
        stack.push();
        stack.push();
        stack.push();
        stack.push();
        stack.push();
        stack.push();
        stack.push();
        stack.display();

    }
}
