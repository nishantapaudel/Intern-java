public class ConstructorWork {
    public static void main(String[] args) {
        Book b1 = new Book(1,200,"www",1200);
        Book b2 = new Book(1,200,"www",1200);
        Book b3 = new Book(1,200,"www",1200);

     //   b1.printInfo();
       // b2.printInfo();
        //  b3.printInfo();

        Book [] books = {b1,b2,b3};

        for(Book b: books){
            b.printInfo();

        }


    }

}

class Book {
    // Properties

    int id;
    int numberOfPage;
    String name;
    double price;

    //Constructor

    Book(int id, int numberOfPage, String name, double price) {
        this.id = id;
        this.numberOfPage = numberOfPage;
        this.name = name;
        this.price = price;
    }

// other methods

    void printInfo() {
        System.out.println("Book id is: " + this.id);
        System.out.println("Book name is: " + this.name);
        System.out.println("Total number of pages is: " + this.numberOfPage);
        System.out.println("Book price is: " + this.price);
        System.out.println("------------------- \n");
    }
}

