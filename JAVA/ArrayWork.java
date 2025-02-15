public class ArrayWork {
    public static void main(String[] args) {
        String [] names = {"Nishanta", "Bigyan", "Ram", "Shyam", "Hari", "Gopal", "Milan"};

        //Index counts from 0
        //Length counts from 1

        System.out.println("Total names: "+names.length);

        //Change name
        names[1]= "Prabin";

        //using for loop

       // for (int i = 0; i < names.length; i++){
         //   System.out.println(names[i]);
        // }

        //using foreach loop

        for(String name: names){
            System.out.println(name);
        }


    }
}
