class student{
    int mark;
    String name;
    public student(String n, int m){
        try{
            if (m>100 || m<0){
                throw new Exception("MarksOutOfBoundException");
            }
            else {
                this.mark = m;
                System.out.println("data saved.");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        this.name = n;
    }

}
public class q3 {
    public static void main(String[] args) {
        student s1 = new student("sai kiran", 96);
        student s2 = new student("anshuman", 965);
    }

}
