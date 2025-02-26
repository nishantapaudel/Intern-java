enum Gender{Male,Female,Other}
public class EnumWork {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.gender = Gender.Male; //you only can put those 3 only
        h1.name = "Ram";
        System.out.println(h1.gender);
    }

}


class Human{

    String name;
    Gender gender;
}