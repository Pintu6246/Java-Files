package calci.tools;

public class Supercalc extends AdCalc{
    public int rem(int a, int b){
        System.out.print("Remainder:");
        return a%b;
    }
    public double pow(int a, int b){
        System.out.print("Power:");
        return Math.pow(a, b);
    }
}
