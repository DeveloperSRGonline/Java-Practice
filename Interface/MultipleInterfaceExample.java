interface Animal
{
    void eat();
}

interface Vehicle
{
    void move();
}


class Robot implements Animal , Vehicle
{
    @Override
    public void eat()
    {
        System.out.println("Roblt is eating.");
    }

    @Override
    public void move()
    {
        System.out.println("Robot is moving.");
    }
}

public class MultipleInterfaceExample
{
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.eat();// calls method from Animal interface
        robot.move();// calls method from vehicle interface
    }
}