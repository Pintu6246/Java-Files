public class string {
    public static void main(String[] args) {
        // String name="M Praveen Kuamr";                           // String literal
        // String name= new String("M Praveen kumar");              // String object
        // System.out.println(name.concat(" is my name"));
        // System.out.println(name.charAt(5));
        // System.out.println(name.hashCode());

        StringBuffer sb=new StringBuffer("M Praveen Kumar");// mutable classes-> StringBuffer and StringBuilder
        sb.delete(0,1);// String buffer is thread safe and builder is not 
        sb.deleteCharAt(5);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" is my name"));
        System.out.println(sb);
    }
    
}
