package junit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
// import junit4.courses.JavaCourse;
// import junit4.courses.JunitCourse;
import junit4.courses.*;

public class PurchasedCourseTest {
    PurchasedCourse obj=new PurchasedCourse();
    @Test
    void testProcedeWithCourse() {
        assertTrue(obj.procedeWithCourse(new JunitCourse()));
        assertTrue(obj.procedeWithCourse(new JavaCourse()));
        assertFalse(obj.procedeWithCourse(new SprinbootCourse()));

    }
}
