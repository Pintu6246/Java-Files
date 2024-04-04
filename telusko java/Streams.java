import java.util.*;
import java.util.stream.*;

public class Streams{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(5,6,2,7,3,10,0,4,8);
        
        // Stream<Integer> s1=nums.stream();//s1 used only one method
        // Stream<Integer> s2=s1.filter(n->n%2==0);//s2 used only one method   //Returns a stream consisting of the results of applying the give function to the elements of this stream.
        // Stream<Integer> s3=s2.map(n->n*2);//s3 used only one method     //Returns an {@code IntStream} consisting of the results of applying the given function to the elements of this stream.
        // int res=s3.reduce(0,(c,e)->c+e);

        int res=nums.stream()
                    .filter(n->n%2==0)
                    .map(n->n*2)
                    .reduce(0, (c,e)->c+e);
        System.out.println(res);

        Stream<Integer> sorted=nums.stream()
                                    .filter(n->n%2==0)
                                    .sorted();
        sorted.forEach(n->System.out.println(n));

    }
}