public class constructer {
    float x=10;
    int y;
    public constructer(){
        x=x*x;        
        System.out.println(x);
    }
    public constructer(int y){
        System.out.println(y);

    }
    public static void main(String[] args) {
        constructer myobj=new constructer();
        constructer myobj1=new constructer(1);
                    
    }
}
