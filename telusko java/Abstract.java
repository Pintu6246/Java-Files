
abstract class Car{                     //if the class is abstracted the it may or may not 
    public abstract void drive();       //create a abstract method, if created no 
        public void playmusic(){        //writing is done to it 
        System.out.println("playing music");
    }
}
abstract class Mustang extends Car{     // if other class is extending the abstract class 
    public abstract void cool();        //then it must declare the method which was not 
    public void drive(){                //written befor in the abstract class
        System.out.println("Drive the car");
    }
}
class Cooler extends Mustang{
    public void cool() {
        System.out.println("Ac is on");
    }
}

//abstract class =interface

public class Abstract {
    public static void main(String[] args) {
        
        Cooler obj=new Cooler();
        obj.getClass();
        obj.drive();
        obj.playmusic();
        obj.cool();
        
        
    }
}

