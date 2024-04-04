public class objects {
    int x=10;
    String y="my class is ";
    public static void main(String[] args) {
        
        objects myobj= new objects();
        objects myobj1= new objects();
        System.out.print(myobj.y);
        System.out.println(myobj.x);
        myobj1.x=6;
        System.out.print(myobj1.y);
        System.out.println(myobj1.x);
        myobj.x=12;
        System.out.print(myobj.y);
        System.out.println(myobj.x);
    }
}
