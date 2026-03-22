
class abc {

    float pi, radius;

    abc(float p, float r) {
        pi = p;
        radius = r;
    }

    // method area
    void area() {
        float ar = pi * radius * radius;
        System.err.println("Area : " + ar);
    }

    // method display
    void display() {
        System.err.println("Pi : " + pi);
        System.err.println("Radius : " + radius);
    }
}

class Area {

    public static void main(String[] args) {
        abc a = new abc(3.14f, 5.0f);
        a.display();
        a.area();
    }
}
