import java.util.Scanner;
public class throwexception {
    static void checkage(){
        Scanner myobj=new Scanner(System.in);
        int a=myobj.nextInt();
        if(a<18){
            throw new ArithmeticException("Access denied-you must be atleast 18 years");
            /*FileNotFoundException 
            ArrayIndexOutOfBoundsException
            SecurityException
            */         
        }
        else{
            System.out.println("Access granted-ou are old enough");
        }
    }
    public static void main(String[] args) {
        System.out.print("enter the age :");
        checkage();
    }
}
