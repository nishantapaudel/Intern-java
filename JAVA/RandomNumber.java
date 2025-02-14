public class RandomNumber {
    public static void main(String[] args) {
        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = Math.random();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random integer within a specific range (e.g., 0 to 99)
        int randomIntInRange = (int) (Math.random() * 100); // 0 (inclusive) to 100 (exclusive)
        System.out.println("Random Integer in Range: " + randomIntInRange);

        // Generate a random integer in a custom range (e.g., 10 to 20)
        int min = 10;
        int max = 20;
        int randomIntInCustomRange = (int) (Math.random() * (max - min + 1)) + min; //formula
        System.out.println("Random Integer in Custom Range: " + randomIntInCustomRange);
    }
}