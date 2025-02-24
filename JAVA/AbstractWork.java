public class AbstractWork {
    public static void main(String[] args) {
        Vikings v1 = new Vikings();
        v1.printBookDetails();
        v1.bookPages();

        Ramayan r1 = new Ramayan();
        r1.printBookDetails();
        r1.bookPages();

    }
}

abstract class Books{
    public abstract void bookPages(); // NO Body

    public void printBookDetails(){
        System.out.println("Book Details");

    }
}

class Vikings extends Books{
    public void bookPages(){ //Compulsory to make the method which is written as abstract.
        System.out.println("1000 Pages");
    }
}

class Ramayan extends Books{
    public void bookPages(){
        System.out.println("2000 Pages");
    }
}