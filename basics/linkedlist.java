import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("ford");
        cars.add("mazad");
       
        for(int i=0;i<cars.size();i++)
            System.out.println(cars.get(i));
        System.out.println(cars.getFirst());  
        cars.addFirst("KIA");     
        System.out.println(cars.getFirst());  

    }    
}
