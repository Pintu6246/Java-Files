package junit5;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class SortingArrayTest {
    SortingArray obj=new SortingArray();
    @Test
    public void test(){

        // try{
        // int[] array={9,8,7,6,5,4,3};
        // obj.sortarray(array);
        // }
        
        // catch(NullPointerException e){
        //     System.out.println("null values in array");
        // }
        final int[] array={9,8,7,6,5,4,3};
        assertThrows(NullPointerException.class, ()->obj.sortarray(array));//fail-> not giving null array

    }


}
