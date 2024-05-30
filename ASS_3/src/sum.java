public class sum {
    public static int s(int n){
        int r = 0;
        if(n>=1){
            r += n+s(n-1);
        }
        return r;
    }

    public static void main(String[] args) {
        int r=0;
        int n = 20;
        for (int i = 1; i <= n ; i++) {
            r += i;
        }
        System.out.println(r);

        System.out.println(s(n));
    }
}
