package junit1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class HelloTest {
    Hello obj=new Hello();
    @Test
    public void test(){
        assertEquals(1,obj.show(20));
    }
    @Test
    public void test2(){
        assertEquals(-1, obj.show(10));
    }
    
}
