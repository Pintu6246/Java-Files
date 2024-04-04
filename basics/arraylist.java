import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars =new ArrayList<String>();
        cars.add("Ford");
        cars.add("Mustang");
        cars.add("KIA");
        cars.add("fFerarri");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars.set(1, "Suziki"));
        System.out.println(cars.remove(3));
        System.out.println(cars.size());
        System.out.println(cars);
        System.out.println();
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
