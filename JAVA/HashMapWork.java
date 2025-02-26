import java.util.HashMap;
public class HashMapWork {
    public static void main(String[] args) {

        HashMap<String, String> capital = new HashMap<String, String>();
        capital.put("Nepal", "Kathmandu");
        capital.put("India", "New Delhi");

       // System.out.println(capital.get("India"));

     //   for (String i : capital.keySet()) {
       //     System.out.println(i);
      //  }

      //  for (String i : capital.values()){
       //     System.out.println(i);
     //   }

        for (String i : capital.keySet()) {
            System.out.println("The Capital of "+i+ " is "+capital.get(i));
        }





    }
}
