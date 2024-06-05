class persn{
    String name;
    int age;
    public persn(String n, int a){
        this.name = n;
        this.age = a;
    }
}

class employee extends persn {
    int ID, salary;
    public employee(String n, int age , int id, int sal){
        super(n,age);
        this.ID =  id;
        this.salary = sal;
    }

    public  void dispplay(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(ID);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        employee e1 = new employee("ansuman",15,235,78920);
        e1.dispplay();
    }
}
