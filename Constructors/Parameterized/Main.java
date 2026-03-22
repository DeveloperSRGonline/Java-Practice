
class Car {

    String model;
    int year;
// Parameterized constructor

    public Car(String model, int year) {

        this.model = model;
        this.year = year;
    }

    public void display() {

        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {

    public static void main(String[] args) {

// Calls the parameterized constructor
        Car car = new Car("Tesla", 2023);
        car.display(); // Output: Model: Tesla, Year: 2023
    }
}
