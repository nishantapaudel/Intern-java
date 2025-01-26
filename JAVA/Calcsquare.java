import java.util.Scanner;
public class Calcsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num1 = sc.nextInt();

        int Square = num1 * num1;

        System.out.println("The square of the number is: "+Square);


    }
}
