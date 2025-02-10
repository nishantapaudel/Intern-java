public class MethodOverloading {
    public static void main(String[] args) {
        add(1.5, 2, 3);

    }

    public static void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("The number is: " + sum);
    }

    public static void add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        System.out.println("The number is: " + sum);
    }
// Suits given parameter
    public static void add(double n1, int n2, int n3) {
        double sum = n1 + n2 + n3;
        System.out.println("The number is: " + sum);
    }
}

