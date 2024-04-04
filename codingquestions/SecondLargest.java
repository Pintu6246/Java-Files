import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70};
        
       
        
        Arrays.sort(numbers);
        System.out.println((numbers[numbers.length-2]));

        }
        
        }