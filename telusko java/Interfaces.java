// interface Computer{
//     /*public abstract*/ void code();
// }
// class Laptops implements Computer{
//     public void code(){
//         System.out.println("code, complie, run");
//     }

// }
// class Desktops implements Computer{
//     public void code(){
//         System.out.println("code, complie, run, faster");
//     }

// }
// class Developer{
//     public void devApp(Computer com)
//     {
//         com.code();
//     }

// }


// public class Interfaces {
//     public static void main(String[] args) {
//         Computer lap=new Laptops();
//         Computer desk= new Desktops();
//         Developer deve=new Developer();
//         deve.devApp(desk);
//         deve.devApp(lap);        
//     }
// }


// class - class = extends
// class - interface = impliments
// interface - interface = extends


interface Ab {

    int number=109;         //final and static is used automatically for instance variables 
    String area="BAnglore"; //final and static is used automatically for instance variables 
    void show();
    void mucic();
}
interface Cd extends Ab{
    void run();
}
interface Ed extends Cd{
    void eat();
}


class Bcd implements Ed{

    public void show() {
       System.out.println("showing A");
    }

    public void mucic() {
        System.out.println("music playing");
    }

    public void run() {
        System.out.println("running..");
    }   

    public void eat(){
        System.out.println("eating...");
    }
    
}
public class Interfaces {

    public static void main(String[] args) {
        
        Ed obj= new Bcd();
        obj.show();
        obj.run();
        System.out.println(Ab.number);
        System.out.println(Ab.area);
        obj.mucic();
        obj.eat();
    }
}
