import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first name: ");
        String fname = sc.nextLine();
        System.out.println("Enter the last name: ");
        String lname = sc.nextLine();

        System.out.println("My name is: "+fname +" "+lname);

    }
}
