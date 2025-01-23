import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Principal is: ");
        double P = sc.nextDouble();

        System.out.println("Time is: ");
        double T = sc.nextDouble();

        System.out.println("Rate is: ");
        double R = sc.nextDouble();

        double SI = P * T * R / 100;

        System.out.println("Simple Interest is: "+SI);


    }
    }
