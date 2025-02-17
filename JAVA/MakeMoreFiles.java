import java.io.File;

public class MakeMoreFiles {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            createFile("Hello"+i+".txt");
        }

    }

    public static void createFile(String filename) {
        try {
            File f = new File(filename);
            if (f.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
