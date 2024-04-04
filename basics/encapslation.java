public class encapslation {
    private String name;
    public String getName()
    {
        return name;
    }
    public String setName (String newName)
    {
        this.name=newName;
        return newName;
    }
    public static void main(String[] args) {
        encapsulation ob=new encapsulation();
        ob.setName("M praveen kumar");
        String name=ob.getName(); 
        System.out.println(name);       
    }
}
