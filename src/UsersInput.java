import java.util.Scanner;
public class UsersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter the number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("the sum is :"+sum);
        int diff = num1 - num2;
        System.out.println("the diff is :"+diff);
        int mul = num1 * num2;
        System.out.println("the multiple is: "+mul);



    }
}
