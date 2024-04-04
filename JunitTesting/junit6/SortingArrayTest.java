package junit6;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.Test;

public class SortingArrayTest {
    SortingArray obj=new SortingArray();
    @Test
    public void test(){

        int[] array={9,8,7,6,5,4,3};
        assertTimeout(Duration.ofMillis(10), ()->obj.sortarray(array));

    }


}
