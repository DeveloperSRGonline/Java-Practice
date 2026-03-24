
class Animal {

    void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        super.makeSound();// Calling the superclass method
        System.out.println("Dog barks");
    }
}

public class MethodOverridingWithSuper {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
