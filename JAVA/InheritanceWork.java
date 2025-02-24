public class InheritanceWork {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.address = "Pokhara";
        s1. age = 25;
        s1. rollNo = 5;

        Person p1 = new Person();
        p1.name = "Hari";
        p1.address = "Kathmandu";
        p1.age = 30;

        p1.printInfo();
        s1.studentInfo();

    }
}

class Person {
    String name;
    String address;
    int age;

    void printInfo(){
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
        System.out.println("Age is "+age);
    }
}

class Student extends Person{
    int rollNo;

    void studentInfo(){
        printInfo();
        System.out.println("Roll number is "+rollNo);

    }

}