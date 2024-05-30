import java.io.DataOutput;

public class q6 {
    public static <T> int count(T[] array, T item){
        int c=0;
        for (T i: array) {
            if(i.equals(item)){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
       Integer ar[] = {1,2,3,4};
       Double dar[] = {1.2,3.4,8.7};
       String sar[] = {"sai ","kiran"};
       count(ar,3);
       count(dar,3.7);
       count(sar,"sj");
    }
}
