import java.io.File;
public class deletefile {
    public static void main(String[] args) {
        File myFile=new File("basics\\text.txt");
        if(myFile.delete()){
            System.out.println("file deleted sucessfully:"+myFile.getName());
        }else{
            System.out.println("file not found");
        }
    }
}
