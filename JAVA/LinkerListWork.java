import java.util.Collections;
import java . util.LinkedList;
import java . util. Collections;
public class LinkerListWork {
    public static void main(String[] args) {
        LinkedList<String>names = new LinkedList<String>();

        names.add ("Ram");
        names.add ("Shiva");
        names.add ("Gita");
        names.add ("Hari");
        names.add ("Shyam");

        names.addFirst("ohooo");

        Collections.sort(names);
        for(String name : names){
            System.out.println(name);

        }



    }
}
