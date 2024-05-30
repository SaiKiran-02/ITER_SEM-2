public class q8 {
    public static double exponet(double x, int n){
        if(n==0 || x==1){
            return 1.0;
        }
        if (n==1){
            return x;
        }
        else if (n>1) {
            return x*exponet(x,n-1);
        }
        return 1/exponet(x,-n);
    }

    public static void main(String[] args) {
        double x =2;
        int n =3;
        System.out.println(exponet(x,n));
    }
}
