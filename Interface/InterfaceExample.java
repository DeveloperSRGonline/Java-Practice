interface MyInterface
{
    // constant variables (implicity public,static,and final)
    int CONSTANT = 100;

    // Abstract method (no body) [declaration only]
    void method1();

    // default method (introduced in java 8) [ready to use]
    default void method2()
    {
        System.out.println("This is the default method.");
    }

    // static method (introduced in java 8)
    static  void staticMethod()
    {
        System.out.println("This is static method in the interface");
    }
}

class MyClass implements MyInterface
{
    // provideing concrete implementation for the abstract method
    @Override
    public void method1()
    {
        System.out.println("method1 is implemented.");
    }
}

public class InterfaceExample
{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();// calls the implemented method
        obj.method2();// calls the default method form the interface
        MyInterface.staticMethod();// calls the static method from the interface
    }
}