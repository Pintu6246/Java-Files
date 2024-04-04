
import java.util.*;
import java.util.function.Consumer;

//comparable= compairs itself with other objects
//comparator= compaird by the third object og comparator


class Stude implements Comparable<Stude>{
    int age;
    String name;

    public Stude(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Stude [age=" + age + ", name=" + name + "]";
    }
    public int compareTo(Stude o) {
        return this.age>o.age?1:-1;
    }

}
public class Comparible{
    public static void main(String[] args) {
        
        List<Stude> mystud=new ArrayList<>();
        mystud.add(new Stude(56,"M Praveen"));
        mystud.add(new Stude(10,"M Manju"));
        mystud.add(new Stude(73,"M Sneha"));
        mystud.add(new Stude(90,"M Appa"));
        mystud.add(new Stude(38,"M Amma"));

        Collections.sort(mystud);
        
        // for(Stude i: mystud)
        // System.out.println(i);
        // System.out.println();

        // Consumer<Stude> con=new Consumer<Stude>() {
        //     public void accept(Stude n){
        //         System.out.println(n);
        //     }
        // };
        //<Stude> con=n->System.out.println(n);
        mystud.forEach(n->System.out.println(n));//con
    }
}