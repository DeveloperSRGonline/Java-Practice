public class Demo {
    int x;
    final int myNum = 15;

    void display() {
        x = 10;
        // myNum = 20; // This will cause a compile-time error
        System.out.println(x);
        System.out.println(myNum);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}