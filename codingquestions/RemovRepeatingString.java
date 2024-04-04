import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovRepeatingString {

    public static String removedString(String Str){
        Set<Character> repeatedCharacters=new HashSet<>();
        StringBuilder reuslt=new StringBuilder();

        for(Character c:Str.toCharArray()){
            if(repeatedCharacters.add(c))
                reuslt.append(c);
        }
        return reuslt.toString();
    }
    public static void main(String[] args) {
        Scanner mysc=new Scanner(System.in);
        String input=mysc.nextLine();
        System.out.println(removedString(input));
    }
}
