public class abstraction {
    public static void main(String[] args) {
        //animal myAnimal=new animal();
        //myAnimal.animalsound();
        System.out.println("sound of animal");
        pig myPig=new pig();
        myPig.animalsound();
        myPig.sleep();
    }
}
abstract class animal {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("sleep sound : Zzzzzzzzzzzzzz");
    }   
}
class pig extends animal{
    public void animalsound(){
        System.out.println("pig says : mheee mhee");
    }
}