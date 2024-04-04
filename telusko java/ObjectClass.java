
// class Laptop{
//     String model;
//     int price;
    
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((model == null) ? 0 : model.hashCode());
//         result = prime * result + price;
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Laptop other = (Laptop) obj;
//         if (model == null) {
//             if (other.model != null)
//                 return false;
//         } else if (!model.equals(other.model))
//             return false;
//         if (price != other.price)
//             return false;
//         return true;
//     }
// }
record Laptop(String model, int price){}/*  this will create constructor to string 
                                            and what are required frm the above comment section*/
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj=new Laptop("vivo",1000);
        Laptop obj1=new Laptop("vivo",1300);
        
        // obj.model="vivo";
        // obj.price=1000;
        // obj1.model="vivo";
        // obj1.price=1000;
                
        System.out.println(obj);
        System.out.println(obj1);
        boolean result=obj.equals(obj1);
        System.out.println(result);

        
    }
    
}
