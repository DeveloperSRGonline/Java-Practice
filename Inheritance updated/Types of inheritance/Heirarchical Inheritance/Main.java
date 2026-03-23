class Animal
{
    void eat()
    {
        System.out.println("The animal eats food.😋");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("The dog barks!🐶");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("The cat meows🐱");
    }
}

public class Main
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}