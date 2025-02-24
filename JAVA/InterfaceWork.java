public class InterfaceWork {
    public static void main(String[] args) {
        car c = new car();
        c.run();
        c.info();

        bike b = new bike();
        b.run();


    }
}

interface Vehicle{
    void run();
}
interface Engine{
    void info();
}

class car implements Vehicle,Engine{ // We can achieve multiple inheritance via interface.
    public void run(){
        System.out.println("Car rus with 4 wheel......");
    }
    public void info() {
        System.out.println("8v engine");

    }
}

class bike implements Vehicle{
    public void run() {
        System.out.println("Bike runs with 2 wheel......");

    }
}
