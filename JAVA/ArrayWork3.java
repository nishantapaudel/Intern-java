import java. util. Scanner;
public class ArrayWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of prices: ");
        int prices = sc.nextInt();
        int [] total = new int[prices];

        System.out.println("Enter the prices: ");
        for (int i=0; i<prices; i++ ){
            total [i]= sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<prices; i++){
            sum = sum + total[i];
        }
        double avg = sum / prices;

        System.out.println("Sum is: "+sum);
        System.out.println(("Average is: "+avg));



    }
}
