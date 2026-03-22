class Rect{
    int length,breadth;

    // constructor
    Rect()
    {
        length = 4;
        breadth = 5;
    }

    public static void main(String[] args) {
        Rect r = new Rect();
        System.err.println("Area : " + (r.length*r.breadth));
    }
}