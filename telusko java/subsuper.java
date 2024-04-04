
class  A{

    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    
    public B(){
        //super();      //  a()
        super(5);   //  a(n)
        System.out.println("in B");
    }

    public B(int n){
        //super();    //  a()
        
        super(5);   //  a(n)
       
        System.out.println("in B int");
    }
}

public class subsuper {
    public static void main(String[] args) {
        B obj=new B();      // a()    b()       //super(n):a(n)   b()
        System.out.println();
        B ob=new B(6);    // a()    b(n)      //super(n):a(n)   b(n)
    }
    
}
