public class RECUSSION {
    public static void print(int n){
        if(n>0 && n<=100){
            System.out.println("cse"+n);
            print(n-1);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("CSE");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        print(100);
    }
}
