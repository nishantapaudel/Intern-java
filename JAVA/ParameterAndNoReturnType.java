public class ParameterAndNoReturnType {
    public static void main(String[] args) {
        //Parameter and no Return Type
        add(10, 20);
        printAge( 2001);
    }
    public static void add(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("The sum is: "+sum);

    }

    public static void printAge(int birthYear){
        int age = 2025 - birthYear;
        System.out.println("Your Age is: "+age);
    }
}
