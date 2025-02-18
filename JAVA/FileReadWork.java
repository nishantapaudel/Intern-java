import java.io.File;
import java.util.Scanner;
public class FileReadWork {
    public static void main(String[] args) {
        try{
            File f = new File ("File 1.txt");
                    Scanner reader = new Scanner (f);
                    while(reader.hasNextLine()){
                        String myData = reader.nextLine();
                        System.out.println(myData);
                    }
                    reader.close();

        }catch(Exception e){
            System.out.println("Something went wrong");
        }

    }
}
