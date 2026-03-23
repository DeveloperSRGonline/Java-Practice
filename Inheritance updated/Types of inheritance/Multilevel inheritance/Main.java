class Animal
{
    void eat()
    {
        System.out.println("The animal eats food.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("dog barks!");
    }
}

class BullDog extends Dog
{
    void play()
    {
        System.out.println("The bulldog plays.");
    }
}

public class Main
{
    public static void main(String[] args) {
        BullDog bd = new BullDog();
        bd.eat();
        bd.bark();
        bd.play();
    }
}