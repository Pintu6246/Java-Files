// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class Comparator1{
//     public static void main(String[] args) {
//         Comparator<Integer> com=new Comparator<Integer>() { //comparator is used in sorting 
//         public int compare(Integer i, Integer j){           //of values based on our requirements

//             if( i%10>j%10)
//                 return 1;
//             else
//                 return -1;
//             }
//         };
        
//         List<Integer> mystud=new ArrayList<>();
//         mystud.add(56);
//         mystud.add(10);
//         mystud.add(73);
//         mystud.add(90);
//         mystud.add(38);

//         Collections.sort(mystud,com);// com object of Comparator is used for sorting of our needs
        
//         for(int i: mystud)
//         System.out.println(i);

//     }
// }


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
class Studen{
    int age;
    String name;

    public Studen(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Studen [age=" + age + ", name=" + name + "]";
    }

}
// change of Integer to the class type(Integer to Studen)
public class Comparator1{
    public static void main(String[] args) {
        // Comparator<Studen> com=new Comparator<Studen>() { 
        // public int compare(Studen i, Studen j){
        //     if( i.age>j.age)
        //         return 1;
        //     else
        //         return -1;
        //     }
        // };


        //or
        
        Comparator<Studen> com=(i,j)->{return i.age>j.age?1:-1;};
        
        List<Studen> mystud=new ArrayList<>();
        mystud.add(new Studen(56,"M Praveen"));
        mystud.add(new Studen(10,"M Manju"));
        mystud.add(new Studen(73,"M Sneha"));
        mystud.add(new Studen(90,"M Appa"));
        mystud.add(new Studen(38,"M Amma"));

        Collections.sort(mystud,com);   // Collection is a class it contains sort method by inputing the datatype or object                                  
        for(Studen i: mystud)           // it also contains the comparator where to sort based on the requirements
        System.out.println(i);

    }
}