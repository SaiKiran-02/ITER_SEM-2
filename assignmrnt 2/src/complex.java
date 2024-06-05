class complex {
    double real,img ;
    public void setData(double r, double i){
        this.real =r;
        this.img = i;
    }

    public void display(){
        System.out.println(this.real +" + "+this.img+"i");
    }

    public complex add(complex c1, complex c2){
        complex c3 = new complex();
        c3.real = c1.real + c2.real;
        c3.img = c1.img + c2.img;
        return c3;
    }

}

class op{
    public static void main(String[] args) {
        complex c1= new complex();
        complex c2= new complex();
        c1.real = 2.0;
        c1.img = 4.0;
        c2.real = 4.0;
        c2.img = 2.0;
        c1.setData(c1.real,c1.img);
        c2.setData(c2.real,c2.img);
        complex c3 = new complex();
        c3.add(c1,c2);

        c1.display();
        c2.display();
        c3.display();
    }
}