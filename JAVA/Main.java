public class Main {
    public static void main(String[] args) {
        //creating object
        Computer c1 = new Computer();
        c1.id = 1;
        c1.name = "Acer";
        c1.price = 115000;

        Computer c2 = new Computer();
        c2.id = 2;
        c2.name = "Dell";
        c2. price = 120000;

        // Print Details from object

        c1.displayInfo();
        System.out.println("\n");
        c2.displayInfo();
    }
}
