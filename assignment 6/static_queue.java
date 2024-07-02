import java.util.Scanner;

public class static_queue {
    static Scanner sc = new Scanner(System.in);
    public static final int max = 5;
    public static int f =-1;
    public static int r = -1;
    static int q[] = new int[max];
    public static void insert(){

        if(r == max){
            System.out.println("QUEUE overflow");
        }
        else {
            if (f == -1){
                f = 0;
            }
            else {
                System.out.println("enter data.");
                q[++r]= sc.nextInt();
            }
        }
    }

    public static void delete(){
        if(r==f){
            f =-1;
            r =-1;
        }
        else {
            f++;
        }
    }

    public static void display(){
        for(int i=f; i<=r;i++){
            System.out.println(q[i]);
        }
    }

    public static void main(String[] args) {

    }
}
