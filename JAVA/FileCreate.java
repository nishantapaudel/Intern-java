import java.io.File;
public class FileCreate {
    public static void main(String[] args) {
        try {
            File f = new File("Hello.txt");
            if(f.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");

        }
    }
}