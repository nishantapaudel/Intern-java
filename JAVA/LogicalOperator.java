public class LogicalOperator {
    public static void main(String[] args) {

        int Userid = 1234;
        int Password =  5678;

        System.out.println(Userid == 1234 && Password == 5678);//true
        System.out.println(Userid == 12345 && Password == 5678);//false
        System.out.println(Userid == 12345 || Password == 5678);//true
        System.out.println(Userid == 12345 || Password == 56789);//false
        System.out.println(!(Userid == 1234 && Password == 5678));//false
        System.out.println(!(Userid == 12345 && Password == 5678));//true

    }
}
