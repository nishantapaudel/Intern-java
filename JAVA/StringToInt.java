public class StringToInt {
    public static void main(String[] args) {
        String str = "abc";
        try{
        int num = Integer .parseInt(str);
        System.out.println(num);
    } catch (NumberFormatException a){
            System.out.println("invalid input: " + str + " is not a valid number.");
        }

        }
}
