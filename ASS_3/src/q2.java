import java.util.*;

public class q2 {
//    public static void main(String[] args) {
//        String ar[]  = {"red","green","pink","yellow"};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("ENTER THE COLOUR: ");
//        String c = sc.next();
//        try {
//            System.out.print("ENTER INDEX: ");
//            int in = sc.nextInt();
//            for (int i=0; i<ar.length; i++){
//                if (c.matches(ar[i])){
//                    System.out.println("WOOOOOO!!!!     colour Found.");
//                }
//            }
//            if(in<0 || in>ar.length){
//                throw new Exception("index not found.");
//            }
//            else{
//                if(c.matches(ar[in]))
//                    System.out.println("index matched.");
//                else
//                    System.out.println("index not matched.");
//            }
//        }
//
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ar[] = {"red","pink","green","purple"};
        System.out.println("enter the colour you WANT to find");
        String c = sc.next();
        System.out.println("enter the index num. to acess the colour.");
        int i = sc.nextInt();
        try{
            boolean b = false;
            for (int j = 0; j < ar.length; j++) {
                if(c.matches(ar[j])){
                    b = true;
                }
            }
            if (b) {
                System.out.println("wooooo!!!!!!!!!!!! got it.");
            }
            else {
                throw  new Exception("colour not found.");
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            if(i<0){
                throw new Exception("Index does not contain negative number.");
            }
            if(i>=ar.length){
                throw new Exception("Array index out of bound");
            }
            else {
                System.out.println("the colour is "+ ar[i]);
            }
        }

        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
