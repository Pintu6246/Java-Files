import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter user name:");
        String username=myobj.nextLine();//nextInt nextDouble nextBoolean nextByte nextFloat nextLong nextShort
        System.out.println("username is "+username);
    }
    
}