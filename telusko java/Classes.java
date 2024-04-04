
class Abc{
    public void show(){
        System.out.println("showing");  // even if it is showing it is not printed 
    }
    static class B{
        public void config(){
            System.out.println("configering");
        }
    }

}

// lamda is used in only abstract class and interface
public class Classes {
    public static void main(String[] args) {

        Abc obj= new Abc(){         //anonumous class
            public void show(){         
                System.out.println("new showing");
            }
        };
        obj.show();
        Abc.B obj1=new Abc.B();// Abc.B obj1=obj.new B();   (if static is not used)
        obj1.config();
        
    }
}
