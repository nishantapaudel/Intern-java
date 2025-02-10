public class ParameterAndReturnType {
    //Parameter and return type
    public static void main(String[] args) {
        int sum = add(20,30);
        System.out.println("The sum is: "+sum);

        String fname = "Nishanta";
        String lname = " Paudel";
        String fullname= getFullName(fname,lname);
        System.out.println(fullname);

        double interest = getSI(2000,3,4);
        System.out.println("SI is: "+interest);

    }

    public static int add(int n1, int n2){
        return n1+n2;
    }

    public static String getFullName(String fname, String lname){
        return "Full Name is: "+fname+ " "+lname;
    }

    public static double getSI(double p, double t, double r){
        return (p*t*r)/100;
    }

}
