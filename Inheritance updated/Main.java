
class Animal {

    void eat() {
        System.err.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {

    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited method form animal class
        dog.bark();
    }
}
