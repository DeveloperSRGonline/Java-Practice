
class Student {

    int rollNo;
    String name;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // object created of student class
        Student s1 = new Student();

        // accessing member of class
        s1.rollNo = 10;
        s1.name = "Shivam";

        // accessing member function
        s1.display();
    }
}
