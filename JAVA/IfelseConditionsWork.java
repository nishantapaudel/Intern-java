import java.util.Scanner;
public class IfelseConditionsWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if ( age <= 17 ) {
            System.out.println("You are not eligibe to vote.");
        } else {
            System.out.println("You are eligible to vote");
        }
        }

    }

