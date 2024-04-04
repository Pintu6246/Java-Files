package junit3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AreaTest {

    
    Area obj=new Area();
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
        assertTrue("not matching",Str.equals("sdfg"));
    }

}
