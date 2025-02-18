import java.io.FileWriter;
public class FileWriterWork {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("File 1.txt",true);
            fw.write("\n Hello my name is Nishanta Paudel.");
            fw.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
