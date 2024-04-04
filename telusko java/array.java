// import java.util.Scanner;
// class student {
//     int roll;
//     String name;
//     int marks;    
// }
// public class array {
//     public static void main(String[] args) {
//         Scanner myScanner=new Scanner(System.in);
//         student s1=new student();
//         student s2=new student();
//         student s3=new student();

//         s1.roll=myScanner.nextInt();
//         myScanner.nextLine();
//         s1.name=myScanner.nextLine();
//         s1.marks=myScanner.nextInt();
        
//         s2.roll=myScanner.nextInt();
//         myScanner.nextLine();
//         s2.name=myScanner.nextLine();
//         s2.marks=myScanner.nextInt();
        
//         s3.roll=myScanner.nextInt();
//         myScanner.nextLine();
//         s3.name=myScanner.nextLine();
//         s3.marks=myScanner.nextInt();

//         student students[]=new student[3];
        
//         students[0]=s1;
//         students[1]=s2;
//         students[2]=s3;

//         for(int i=0;i<students.length;i++)
//         {
//             System.out.print(students[i].roll+"   ");
//             System.out.print(students[i].name+"   ");
//             System.out.println(students[i].marks+"   ");
//         }
//         System.out.println();
//         for(student stud:students){
//             System.out.println(stud.name+" : "+stud.marks);
//         }
//     }

// }
class Student{
    private int roll;
    private String name;
    private int marks;
    //setters and getters are used to get and set the data 
    public int setRoll(int r){
        this.roll=r;
        return r;
    }
    public String setName(String n){
        this.name=n;
        return n;
    }
    public int setmarks(int m){
        this.marks=m;
        return m;
    }
    public int getRoll() {
        return this.roll;
    }
    public String getName() {
        return this.name;
    }
    public int getMarks() {
        return this.marks;
    }
}

// object is used as datatype in to the array, each objects are stored in the 
//array and when called all students are printed with their variables
public class array {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student student[]=new Student[3];
        s1.setName(" Praveen kumar");
        s1.setRoll(96);
        s1.setmarks(100);
        s2.setName(" Amma");
        s2.setRoll(97);
        s2.setmarks(120);        
        s3.setName(" Appa");
        s3.setRoll(98);
        s3.setmarks(130);
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        for(int i=0;i<student.length;i++)
        {
            System.out.println(student[i].getRoll()+" : "+student[i].getName()+" : "+student[i].getMarks() );
        }
        // for(Student std:student){
        //     System.out.println(std.roll+" : "+std.name+" : "+std.marks );
        // }
    }
}