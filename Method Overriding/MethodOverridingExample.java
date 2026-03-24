class Superclass
{
    // method in the superclass
    public void display()
    {
        System.out.println("Display method of Superclass");
    }
}


class Subclass extends Superclass
{
    // overriding the display() method in the subclass
    @Override
    public void display()
    {
        System.out.println("Display method of Subclass");
    }
}

public class MethodOverridingExample
{
    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.display();// calls method of subclass
    }
}