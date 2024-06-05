import java.util.Scanner;

class person{
    String name;
    int age;
   public person(String n, int a){
       this.name = n;
       this.age = a;
   }
    public void display(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person p1 = new person(sc.nextLine(),sc.nextInt());
        person p2 = new person("swati",18);
        p1.display();
        p2.display();

        if(p1.age>p2.age)
            System.out.println(p2.name+" is younger");
        else
            System.out.println(p1.name+" is younger.");
    }
}
