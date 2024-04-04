
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class j2Test {

    j2 obj= new j2();
    @Test
    public void name(){
        assertEquals("utniP", j2.inPlaceReverse("Pintu"));
    }

    @Test
    public void fullName(){
        assertEquals("ramuk neevarp", j2.inPlaceReverse("praveen kumar"));
    }

}
