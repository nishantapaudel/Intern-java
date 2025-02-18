public class WorkOnClass {
    public static void main(String[] args) {
        //Creating object: Classname Objectname = new ClassName ();
        House h1 = new House();
        h1.color = "Red";
        h1.price = 300000;
        h1.name = "ABC House";

        House h2 = new House();
        h2.color = "White";
        h2. price = 200000;
        h2.name = "XYZ House";

        h1.printInfo();
        h2.displayColor();

    }
}
//Creating a class

class House{
    //Properties
    String color;
    double price;
    String name;
    //Function

    void printInfo(){
        System.out.println("House name is: "+this.name);
        System.out.println("House color is: "+this.color);
        System.out.println("House price is: "+this.price);
        System.out.println("\n");
    }
    void displayColor(){
        System.out.println("House name is: "+this.name);
        System.out.println("House color is: "+this.color);
    }

}
