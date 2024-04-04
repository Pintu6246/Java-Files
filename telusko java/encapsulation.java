
class details{
    private int age;
    private String name;

    public details(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public details() {
        age=15;
        name="adolesence";
    }

    public details(String name) {
        this.name = name;
        //age=18;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
}

public class encapsulation{
    public static void main(String[] args) {
        details en=new details();
        details en0= new details("mature");
        details en1=new details(25, "adult");
        en0.setAge(18);
        System.out.println(en.getName()+" : "+en.getAge());
        System.out.println(en0.getName()+" : "+en0.getAge());
        System.out.println(en1.getName()+" : "+en1.getAge());


    }
}