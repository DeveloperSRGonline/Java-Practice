
class Rectangle {

    int length;
    int breadth;

    // oritinal main constructor(parameterized also)
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // copy constructor
    public Rectangle(Rectangle obj) {
        length = obj.length;
        breadth = obj.breadth;
    }
    
    

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(r1);
        System.out.println("Area of First Rectangle : "
                + (r1.length * r1.breadth));
        System.out.println("Area of Second Rectangle : "
                + (r2.length * r2.breadth));
    }
}
