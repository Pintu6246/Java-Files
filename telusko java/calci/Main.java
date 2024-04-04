package calci;

import calci.tools.*;

public class Main {
    public static void main(String[] args) {
        Supercalc ob=new Supercalc();
        System.out.println(ob.add(3, 4));
        System.out.println(ob.sub(7, 5));
        System.out.println(ob.mult(6, 5));
        System.out.println(ob.div(20, 4));
        System.out.println(ob.rem(22, 3));
        System.out.println(ob.pow(2, 3));
    }
    
}
