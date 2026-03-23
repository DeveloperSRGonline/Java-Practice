class Animal{
    void eat(){
        System.err.println("The animal can eat");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.err.println("dog barks!");
    }
}

public class Main
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}