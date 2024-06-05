import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class shape {
    int lenght , breadth;
    public shape(int l, int b){
        this.lenght = l;
        this.breadth = b;
    }
    public double area(){
        System.out.println(this.breadth*this.lenght);
        return this.breadth*this.lenght;
    }
}

class square extends shape{
    static int sCount;
    public  square(int l){
        super(l,l);
    }
}
class rectangle extends shape{
    static int rCount;
    public  rectangle(int l, int b){
        super(l,b);
    }
}

class operation{
    public static void main(String[] args) {
        square s1 = new square(4);
        rectangle r1 = new rectangle(2,4);
        s1.area();
        r1.area();
    }
}