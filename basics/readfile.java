import java.io.File;
public class readfile {
    public static void main(String[] args) {
        File myFile= new File("basics\\text.txt");
        if(myFile.exists()){
            System.out.println("file name:"+myFile.getName());
            System.out.println("file path:"+myFile.getAbsolutePath());
            System.out.println("writable:"+myFile.canWrite());
            System.out.println("readable:"+myFile.canRead());
            System.out.println("file size:"+myFile.length()+" bytes");         
        }
        else{
            System.out.println("file does not exixt");
        }
    }    
}
