package junit4;
import junit4.courses.*;
public class PurchasedCourse {

    public boolean procedeWithCourse(j4 courseJ4){
    return courseJ4.coursePurchased();
    }
    public static void main(String[] args) {
        PurchasedCourse objCourse=new PurchasedCourse();
        objCourse.procedeWithCourse(new JavaCourse());
        objCourse.procedeWithCourse(new JunitCourse());
        objCourse.procedeWithCourse(new SprinbootCourse());

    }
}
