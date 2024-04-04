
class Bnkjhkjm{
    public void show() throws ClassNotFoundException{
        Class.forName("string");
    }
    
}

public class Throws {
    static{
        System.out.println("class loader");
    }
    public static void main(String[] args)  {
        
        Bnkjhkjm obj =new Bnkjhkjm();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
