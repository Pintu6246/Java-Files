package junit6;

import java.util.Arrays;

public class SortingArray {
    public int[] sortarray(int[] arr){
        for(int i=0;i<100000;i++)
        Arrays.sort(arr);
        return arr;

    }
// public static void main(String[] args) {
//     SortingArray obj=new SortingArray();
//     obj.sortarray(null);
    
// }
}
