import java.util.List;
import java.util.Scanner;

class node{
    protected int reg_no;
    protected float marks;
    protected node next;

    node(int r, float m){
        this.reg_no=r;
        this.marks=m;
    }

    public void get(){

        System.out.println("Registration number \n"+reg_no+"marks: \n"+marks);
    }
}

public class LINKED_LIST {
    static  Scanner sc = new Scanner((System.in));
    public static  node create(node start){
        System.out.print("enter the registration number: ");
        int reg = sc.nextInt();
        System.out.print("enter the marks obtained: ");
        float mark = sc.nextFloat();
        start = new node(reg,mark);
        System.out.println("Linkedlist created...........");
        return start;
    }
    //the insertion operation
    //a)i.At the beginning of the list
    public static node inbeg(node start){
        if(start == null){
            start = create(start);
            return start;
        }

        System.out.print("enter the registration number: ");
        int reg = sc.nextInt();
        System.out.print("enter the marks obtained: ");
        float mark = sc.nextFloat();

        node n = new node(reg, mark);
        n.next = start;
        System.out.println("Node is inserted at the begining.");
        return n;
    }
    //a)ii.At the end of the list
    public static node inend(node start){
        if(start == null){
            start = create(start);
            return start;
        }

        System.out.print("enter the registration number: ");
        int reg = sc.nextInt();
        System.out.print("enter the marks obtained: ");
        float mark = sc.nextFloat();

        node n = new node(reg,mark);
        node temp = start;
        while(temp != null)
            temp = temp.next;
        temp = n;
        System.out.println("Node is added at the end of the linked list.");
        return n;
    }

    //a)ii.At any position of the linked list
    public static node inany(node start){
        node temp = start;
        System.out.println("enter the position you want to enter the node.");
        int i = sc.nextInt();
        if (i == 0){
            start = create(start);
            return start;
        }
        else if (i == 1) {
            return inend(start);
        }
        else {
            for (int j = 2; j < i; j++) {
                try {
                    temp = temp.next;
                    if (temp == null)
                        throw new NullPointerException();
                }
                catch (Exception e) {
                    System.out.println("position not present");
                    return start;
                }
            }
        }

        System.out.print("enter the registration number: ");
        int reg = sc.nextInt();
        System.out.print("enter the marks obtained: ");
        float mark = sc.nextFloat();

        node newN = new node(reg,mark);
        newN.next = temp.next;
        temp.next = newN.next;
        System.out.println("Node is inserted at the position: "+i);
        return start;
    }
//    b) The deletion operation
//    i. From the beginning of the list

    public static node delBeg(node start){
        int reg_val = start.reg_no;
        float mark_val = start.marks;

        if (start == null){
            System.out.println("list is empty");
        }
        else {
            start = start.next;
            System.out.println("Node deleted form the begining");
        }
        return start;

    }

    //    ii. From the end of the list
    public static node delEnd(node start){
        if (start == null ){
            System.out.println("list is empty");
        }
        else if(start.next == null){
            start = null;
            System.out.println("Last element is deleted from the end and now the list is empty");
        }
        else{
            node temp = start;
            int reg_val = 0;
            float marks_val = 0.0f;
            while (temp.next.next != null){
                reg_val = temp.next.next.reg_no;
                marks_val = temp.next.next.marks;
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("the last Node is deleted of reg: "+reg_val+" and of mark: "+marks_val);
        }
        return start;
    }

    //        iii. From any position in the list

    public static node delAtAny(node start){
        System.out.println("entyer the position you want to delete");
        int i = sc.nextInt();
        node temp = start;
        if (i == 1){
            delBeg(start);
            System.out.println("NODE DELETED AT THE FIRST POSIOTION");
            return start;
        }
        else{

            int j = 2;
            while(j<i){
                try {
                    temp = temp.next;
                    if( temp == null){
                        throw new NullPointerException();
                    }
                }
                catch (NullPointerException e){
                    System.out.println("invalid position, noting to delete");
                    return start;
                }
            }
            j++;
        }
        node pre = temp ;
        pre = pre.next;
        temp.next = pre.next;
        System.out.println("Node deleted");
        return start;
    }

//    iv. delete Node by registration number.
    public  static node delReg(node start){
        if(start==null) {
            System.out.println("list is empty");
            return start;
        }
        else{
            System.out.print(" enter the registration number: ");
            int reg = sc.nextInt();
            node temp = start;
            node before = null;
            if (start.reg_no == reg){
                System.out.println("Node with reg number: "+reg +"deleted sucessfully");
                return start.next;
            }
            boolean key = true;
            while (temp != null){
                if (temp.reg_no == reg){
                    before.next = temp.next;
                    temp.next = null;
                    System.out.println("Node with regd_no " + reg + " deleted successfully.");
                    key = false;
                    return start;
                }
                before = temp;
                temp = temp.next;
            }
            try {
                if (key)
                    throw new NullPointerException();
            }
            catch (NullPointerException e){
                System.out.println("Node with regd_no " + reg + " not found in the list.");
            }
            return start;
        }
    }

//    c) search
    public static void search(node start){
        if (start == null)
            System.out.println("List is empty. Nothing to search.");
        else {
            System.out.println("enter the reg number for search");
            int reg = sc.nextInt();
            node temp = start;
            boolean found = false;
            while(temp != null){
                if (temp.reg_no == reg){
                    System.out.println("enter the mark for teh student");
                    float m = sc.nextFloat();
                    temp.marks = m;
                    System.out.println("mark updated.........");
                    found = true;
                }
                temp = temp.next;
            }
            try{
                if(!found){
                    throw new Exception("Not any node having this reg number.");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

//    5) count the number of nodes present in the list
    public static  int count(node start){
        int c = 0;
        node temp = start;
        while (temp != null){
            c++;
            temp=temp.next;
        }
        return c;
    }
//    6) reverse the linked list
    public static node reverse(node start){
        node rev = null;
        node now = start;
        node NEW;
        while (now!=null){
            NEW = now.next;
            now.next = rev;
            rev = now;
            now = NEW;
        }
        System.out.println("linkes lisat is reversed");
        return rev;
    }

//    7) displaying linked list
    public static void display(node start){
        node temp = start;
        if(temp==null)
        {
            System.out.println("Empty link list");
        }
        else {
            System.out.println("regd.number \t\t marks");
            while (temp != null){
                System.out.println(temp.reg_no+"\t\t\t"+temp.marks);
                temp=temp.next;
            }
            System.out.println("A linked list is displayed.");
        }
    }

//    8) sortting of linked liwst
    public static void sort(node start){
        System.out.println("this will be coded later on......so please wait for the upcoming version.");
    }

    public static void main(String[] args) {

        System.out.println("****************************************|| MENU ||****************************************");
        System.out.println("Enter\n0: exit");
        System.out.println("1: Creation");
        System.out.println("2: Display");
        System.out.println("3: Insert at the beginning");
        System.out.println("4: Insert at the end");
        System.out.println("5: Insert at any position");
        System.out.println("6: Delete from the beginning");
        System.out.println("7: Delete from the end");
        System.out.println("8: Delete from any position");
        System.out.println("9: Delete by student regd_no.");
        System.out.println("10: Search and update mark");
        System.out.println("11: Sort the list");
        System.out.println("12: Count the number of nodes ");
        System.out.println("13: Reverse the Linked list");

        node start = null;
        System.out.println();
        while(true){
            System.out.println("Enter what you would want to do with your list: ");
            int choise = sc.nextInt();
            System.out.println();
            switch (choise){
                case 0:
                    System.out.println("************************************|| THANK YOU ||*************************************}");
                    System.exit(0);
                case 1:
                    start = LINKED_LIST.create(start);
                    break;
                case 2:
                    LINKED_LIST.display(start);
                    break;
                case 3:
                    start = LINKED_LIST.inbeg(start);
                    break;
                case 4:
                    start = LINKED_LIST.inend(start);
                    break;
                case 5:
                    start = LINKED_LIST.inany(start);
                    break;
                case 6:
                    start = LINKED_LIST.delBeg(start);
                    break;
                case 7:
                    start = LINKED_LIST.delEnd(start);
                    break;
                case 8:
                    start = LINKED_LIST.delAtAny(start);
                    break;
                case 9:
                    start = LINKED_LIST.delReg(start);
                    break;
                case 10:
                     LINKED_LIST.search(start);
                     break;
                case 11:
//                    update is coming.
                    LINKED_LIST.sort(start);
                    break;
                case 12:
                    System.out.println("number o fthe nodes in the list is: "+LINKED_LIST.count(start));
                    break;
                case 13:
                    start = LINKED_LIST.reverse(start);
                    break;
                default:
                    System.out.println("Wrong choise...Please enter a valid Choise.");
                    break;
            }
        }
    }




}
