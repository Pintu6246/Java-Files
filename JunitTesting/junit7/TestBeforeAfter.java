package junit7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestBeforeAfter {
    Area obj=new Area();
    TestBeforeAfter(){
        System.out.println("printing");
    }
    
    @BeforeEach
    void show(){//runs before every tests
        assertNotEquals(76.5, obj.circleArea(5));

    }
    @Test
    void testCircleArea() {
        assertNotEquals(76.5, obj.circleArea(5));
    }

    @Test
    void testSquareArea_Message() {
        assertEquals(576, obj.squareArea(24));
        assertNotEquals(76, obj.squareArea(24),"test failed");

    }
    @Test
    void testSquareArea_LAmda() {
        assertEquals(576, obj.squareArea(24));
        assertNotEquals(76, obj.squareArea(24),()->"test failed");
    }

    @Test
    void assertTrue_method() {
        String Str="asdfg";
        assertTrue("not matching",Str.equals("asdfg"));
    }

}
