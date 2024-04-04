

public class Wrapper {
    public static void main(String[] args) {

        int n=10;
        Integer nInteger=new Integer(n);    //boxing
        Integer nInteger2 =n;               //autoboxing
        System.out.println(nInteger+"(boxing),"+nInteger2+"(auto-boxing)");  

        
        int n1=nInteger.intValue();
        int n2=nInteger;
        System.out.println(n1+"(unboxing),"+n2+"(auto-unboxing)");  

        String a="20";                  //special case in Integer wrapper class
        int str=Integer.parseInt(a);
        System.out.println(str+3);
    }
}
