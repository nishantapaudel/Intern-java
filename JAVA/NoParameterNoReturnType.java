public class NoParameterNoReturnType {
    //NO Parameter No Return Type
    public static void main(String[] args) {
        printAddress();
    }

    public static void printAddress(){
        System.out.println("Pokhara, Nepal");
        //Calling another method in existing method.
        printComputerInfo();
    }

    public static void printComputerInfo(){
        System.out.println("Computer Name: Acer");
        System.out.println("Computer RAM: 8GB");
        System.out.println("Computer Price: 115000");
    }

}
