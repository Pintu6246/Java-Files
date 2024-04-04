interface car{
    public void brand();
    public void carname();
}
class ford implements car{
    public void brand(){
        System.out.println("brand name is ford");
    }
    public void  carname(){
        System.out.println("car name is Ford Mustang");
    }
}

public class interfaces {
    public static void main(String[] args) {
        ford mycar=new ford();
        mycar.brand();
        mycar.carname();
    }
    
}