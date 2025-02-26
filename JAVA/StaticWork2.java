public class StaticWork2 {
    public static void main(String[] args) {
        Students.school = "Golden School";
        Students s1 = new Students();
        s1.name = "Shiva";
        s1.address = "Pokhara";

        Students s2 = new Students();
        s2.name = "Shankar";
        s2.address = "Kathmandu";

        System.out.println(s1.school);
        System.out.println(s1.name);
        System.out.println(s1.address);

        System.out.println(s2.school);
        System.out.println(s2.name);
        System.out.println(s2.address);

    }
}

class Students {
    String name;
    String address;
    static String school;

}
