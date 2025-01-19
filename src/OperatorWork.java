public class OperatorWork {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;
        int num3 = 100;
        int num4 = 100;

        num1++;
        num2--;
        num3 += 5;
        num4 -= 5;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num1==100);//false
        System.out.println(num1==101);//true
        System.out.println(num1!=101);//false
        System.out.println(num1!= 100);//true
        System.out.println(num1 > 100);//true
        System.out.println(num1 < 100);//false
        System.out.println(num1 >= 101);//true
        System.out.println(num1 <= 101);//true
    }
}
