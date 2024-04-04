
//polymorphism
public class animal {
    private void animalsound(){
        System.out.println("sounds of animals");
    }
    public static void main(String[] args) {
        animal myAnimal=new animal();
        myAnimal.animalsound();
        pig mypig=new pig();
        mypig.animalsound();
        dog mydog=new dog();
        mydog.animalsound();
    }
}
class pig extends animal{
    protected void animalsound(){
        System.out.println("pig sound : hporr hporr");
    }
}
class dog extends animal{
    protected void animalsound(){
        System.out.println("dog sound : bow wow");
    }
}