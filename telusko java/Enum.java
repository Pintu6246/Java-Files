// enum Status{
//     Running, Pending, Sucess, Failed
// }


// public class Enum {
//      public static void main(String[] args) {
//         //Status[] ss=Status.values();//sets values
//         // for(Status i:ss)
//         //     System.out.println(i+" : "+i.ordinal());   //i= values(Running, Pending, Sucess, Failed)
//         //         //ordinals=indexes
//         Status s=Status.Failed;
//         switch (s) {
//             case Running:
//                 System.out.println("All good");
//                 break;
//             case Pending:
//                 System.out.println("wait");
//                 break;
//             case Sucess:
//                 System.out.println("done");
//                 break;
//             default:
//                 System.out.println("try again");
//                 break;
//         }
//      }
// }

enum Laptop1{
    Macbook(2000), Dell, HP, Lenovo(1300), ThinkPad(1600);
    private int price;
    
    //using ide
    private Laptop1() {
        price=1050;
        System.out.println("default constructor : "+this.name()+" : "+this.price);
    }

    //using ide
    private Laptop1(int price) {
        this.price = price;
        System.out.println("parameterized constructor : "+this.name()+" : "+this.price);
    }

    //using ide
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enum {

    public static void main(String[] args) {
        Laptop1[] laptop=Laptop1.values();
        for(Laptop1 l:laptop){
            System.out.println(l+" : "+l.getPrice());

        }
        
        
    }
}