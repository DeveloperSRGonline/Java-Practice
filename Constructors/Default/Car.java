
class Car {

    String model;
    int year;

    // explicit default constructor
    // this constructor will automatically called when we create object of car class
    public Car() {
        model = "Maruti";
        year = 2023;
    }

    public void display() {
        System.err.println("Model: " + model + "\nYear: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
