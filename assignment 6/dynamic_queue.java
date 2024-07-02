import java.util.Scanner;

class node{
    int info;
    node next;

    public node(int i){
        this.info = i;
    }
}
public class dynamic_queue {
    static Scanner sc = new Scanner(System.in);
    static node f = null;
    static node r = null;
    public static void insert(){
        System.out.println("enter data");
        int data = sc.nextInt();
        node n = new node(data);
        n.next = null;
        if ( r == null){
            f = n;
            r = n;
        }
        else {
            r.next = n;
            r = n;
        }
    }

    public static void delete(){
        if (f == null){
            System.out.println("queu undet flow");
        }
        else {
            if (f == null) {
                r =null;
            }
            f = f.next;
        }
    }

    public static void display(){
        if (f == null ){
            System.out.println("empty queue");
        }
        else {
            node temp = f;
            while (f!=null){
                System.out.println(temp.info);
            }
        }
    }

    public static void main(String[] args) {

    }
}
