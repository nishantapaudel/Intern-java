public class StaticWork {
    public static void main(String[] args) {
        Box.info = "Hello";
        System.out.println(Box.info);

        System.out.println(Database.getInfo());
    }
}

class Box{
    static String info;
}

class Database{
    static String getInfo(){
        return "Localhost";
    }

}

