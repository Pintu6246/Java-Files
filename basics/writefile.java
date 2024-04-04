import java.io.FileWriter;
import java.io.IOException;
public class writefile {
    public static void main(String[] args) {
        try{
            FileWriter mywrite=new FileWriter("basics\\text.txt");
            mywrite.write("Files in java might be tricky, but its fun enough!");
            mywrite.close();
            System.out.println("sucessfully wrote the file");
        }catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
