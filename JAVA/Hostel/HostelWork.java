package Hostel;

public class HostelWork {
    public static void main(String[] args) {
        Sts s1 = new Sts();
        s1.name = "Nishanta";
        s1.address = "Pokhara";

        System.out.println("Mt name is "+s1.name);
        System.out.println("I live in "+s1.address);
    }

}

class Sts{
    String name;
    String address;
}
