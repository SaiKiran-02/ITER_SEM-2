//public class pow {
//    public  static double p(int b, int p){
//        if(p == 0 || b == 1){
//            return 1.0;
//        }
//        else {
//            return b*p(b,p-1);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(p(5,3));
//    }
//}


public class pow {

    public static int reverseNumber(int number) {
        if (number < 10) {
            return number;
        } else {
            int l = number % 10;
            int r= number / 10;
            int revRemain = reverseNumber(r);
            int n = (int) Math.log10(r) + 1;
            return (int) (l * Math.pow(10, n) + revRemain);
        }
    }

    public static void main(String[] args) {
        int number = 5789;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println();
    }

}

