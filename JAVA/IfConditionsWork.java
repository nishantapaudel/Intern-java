import java.util.Scanner;
public class IfConditionsWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Third NUmber: ");
        int num3 = sc.nextInt();

        //apply if condition.
        if (num1 > num2 && num1 > num3) {
            System.out.println("The first number is greater: i.e "+num1);
        }

            if (num2 > num1 && num2 > num3) {
                System.out.println("The second number is greater: i.e "+num2);
            }

                if (num3 > num1 && num3 > num2) {
                    System.out.println("The third number is greater: i.e "+num3);
                }
        }

    }

