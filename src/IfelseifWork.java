import java.util.Scanner;
public class IfelseifWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of weeks: ");
        int noOfweek = sc.nextInt();

        if(noOfweek == 1) {
            System.out.println("It's Sunday");
        } else if (noOfweek == 2) {
            System.out.println("It's Monday");
        } else if (noOfweek == 3) {
            System.out.println("It's Tuesday");
        } else if (noOfweek == 4) {
            System.out.println("It's Wednesday");
        } else if (noOfweek == 5) {
            System.out.println("It's Thursday");
        } else if (noOfweek == 6) {
            System.out.println("It's Friday");
        }else if (noOfweek == 7) {
            System.out.println("It's Saturday");
        }else{
            System.out.println("Invalid Number");
        }

    }
}
