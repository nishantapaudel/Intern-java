import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWork {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add ("Ram");
        names.add ("Shiva");
        names.add ("Gita");
        names.add ("Hari");
        names.add ("Shyam");

       // names.remove("Shyam");
      //  System.out.println(names.get(2));

        Collections.sort(names);

        for(String name: names){
            System.out.println(name);

        }


    }
}
