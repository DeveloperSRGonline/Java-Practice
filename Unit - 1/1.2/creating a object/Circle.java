// writing area of circle code in single class
class Circle
{
    // data member for holding radius
    float radius;

    // method (that calculate area)
    void area(){
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);
    }

    // actual program starts from here
    public static void main(String[] args) {
        // creating circle class object(real world entity)
        Circle c = new Circle();

        // putting value of radius
        c.radius = 5;

        // accessing method (area)
        c.area();
    }
}