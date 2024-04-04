import java.util.HashMap;
public class hashmaps {
    public static void main(String[] args) {
        HashMap<String,String>capitals=new HashMap<String,String>();
        capitals.put("India", "Delhi");
        capitals.put("Karnataka", "Bangalore");
        capitals.put("Kerela", "Kochi");
        for(String i:capitals.keySet()){
            System.out.println(i+"="+capitals.get(i));
            //System.out.println(capitals.get(i));
    }    
}
}
