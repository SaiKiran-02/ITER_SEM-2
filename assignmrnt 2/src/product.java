public class product {
    int prdID;
    double price;
    int quanity;
    static  int totalPrice;

    public product(int id, double pr, int qun){
        this.prdID = id;
        this.price = pr;
        this.quanity = qun;
    }

    public void display(){
        System.out.println("prd ID: "+this.prdID);
        System.out.println("price: "+this.price);
        System.out.println("quantity: "+this.quanity);
        totalPrice += price;
    }

    public static void main(String[] args) {
        product p[] = new product[5];
        for (int i=0; i<p.length; i++){
            p[i] = new product(i,20,4);
            p[i].display();
        }
        System.out.println(totalPrice);
    }
}
