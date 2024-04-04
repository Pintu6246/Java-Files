class mobile{
    String brand;
    int id;
    static int price;

    

    static{
        price=1000;
        // System.out.println("in static");
    }

    public static void show1(mobile ob){
        System.out.println("is static");
        System.out.println(ob.brand+" : "+price+" : "+ob.id);

        }
    public void show(){
        System.out.println(brand+" : "+price+" : "+id);
    }
}


public class Static {

    public static void main(String[] args) throws ClassNotFoundException {
        mobile ob=new mobile();
        mobile ob1=new mobile();
        ob.brand="mi";
        ob.id=45678;
        ob1.brand="RCB";
        ob1.id=5678;
        ob.show();
        ob1.show();
        mobile.show1(ob);
        mobile.show1(ob1);
        //Class.forName("mobile");      //loads only perticular class
        
    } 
}
