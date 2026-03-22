class Circle {

    float radius;

    void area() {
        float area = 3.14f * radius * radius;
        System.out.println("Area = " + area);
    }
}

class Sphere {

    float radius;

    void volume() {
        float volume = (4 / 3.0f) * 3.14f * radius * radius * radius;
        System.out.println("Volume = " + volume);
    }
}

class Refine
{
    public static void main(String args[])
    {
        Circle c = new Circle();   // object for area
        c.radius = 5;
        c.area();

        Sphere s = new Sphere();   // object for volume
        s.radius = 5;
        s.volume();
    }
}