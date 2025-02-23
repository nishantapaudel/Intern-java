public class EncapsulationWork {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.setId(1);
        b1.setName("Zara");

        Bag b2 = new Bag();
        b2.setId(2);
        b2.setName("Gucci");

        System.out.println(b1.getId());
        System.out.println(b1.getName());

        System.out.println(b2.getId());
        System.out.println(b2.getName());
    }
}

class Bag {
    //properties
    private int id;

    private String name;

    //Creating getter and setter
int getId(){
    return this.id;
}
String getName (){
    return this.name;
}

void setId(int id){
    if(id==0) {
        System.out.println("Invalid id");
    }  else{
            this.id = id;

        }

}

void setName(String name){
    this.name = name;
}
}



