package junit5;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class j5 {
    @Test
    public void test(){
        int[] exp={1,2,3,4,5,6};
        int[] act={1,2,3,4,5,6};
        assertArrayEquals(exp, act);

    }
    
}
