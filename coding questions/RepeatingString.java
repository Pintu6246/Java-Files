import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatingString {

    public static Set<Character> repeatingString(String Str){
        Set<Character> seen=new HashSet<>();
        Set<Character> repeating=new HashSet<>();
        for(char c:Str.toCharArray()){
            if(!seen.add(c)){
                repeating.add(c);
                              
            }
        }
        return repeating;
    }
    public static void main(String[] args) {
        Scanner mysc=new Scanner(System.in);
        String input=mysc.nextLine();
        System.out.println(repeatingString(input));
    }
}
