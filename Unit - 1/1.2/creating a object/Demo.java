class Circle
{
    // data member
    float radius;

    // method
    void area()
    {
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);
    }
}

class Demo
{
    public static void main(String[] args) {
        // creating object of circle class
        Circle c = new Circle();

        // accessing radius and putting its value
        c.radius = 5;
        // accessing method of class
        c.area();
    }
}