import java.io.File;
public class DeleteAllFiles {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            createFile("Hello"+i+".txt");
        }

    }
    public static void createFile(String filename){
        try{
        File f = new File (filename);
        if(f.delete()) {
            System.out.println("File is deleted");
        }else{
            System.out.println("File is not available");
        }
            }catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
