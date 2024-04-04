import java.util.*;


class MyException extends Exception{
    public MyException(){
        super();
    }

}

public class TryCatch {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int i=myScanner.nextInt();
        int j=0;
        try{
            j=10/i;
            if(i>j){
                throw new MyException();
            }

        }catch(MyException e){
            System.out.println("input error :numerator is lesser, gives default value");
            j=10/1;
        }
        catch(ArithmeticException e){
            System.out.println("cant divide by zero, therefor gives default value");
            j=10/1;
        }catch(Exception e){

            System.out.println("shomething went wrong : "+e);

        }
        System.out.println("result: "+j);
        
    }
}
