public class q5 {
    public static < E > void printArray( E[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+"__");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer i[] = {1,2,3,46,7,8};
        String s[] = {"sai","kiran"};
        Object d[] = {6.8,87.7,9.0};
        printArray(i);
        printArray(s);
        printArray(d);

    }
}
