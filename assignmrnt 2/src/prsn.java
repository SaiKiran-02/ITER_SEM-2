
interface DetailInfo{
    void display();
    void count();

}
public class prsn {
    static  int maxCount;
    String name;
    public void count(){
        maxCount = name.length();
    }
    public void display(){

        System.out.println(this.name);
        System.out.println(name.length());
    }

    public static void main(String[] args) {
        prsn p = new prsn();
        p.name = "sai kiran.";
        p.display();
    }
}
