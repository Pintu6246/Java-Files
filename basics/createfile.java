import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args) {
        try{
            File myfile=new File("basics\\text.txt");
            if(myfile.createNewFile()){
                System.out.println("file created: "+myfile.getName());
            }
            else{
                System.out.println("file already exist");
            }
        }
        catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}