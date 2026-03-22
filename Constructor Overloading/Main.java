class Car {
    String model;
    int year;
    String color;

// Default constructor
    public Car() {
        model = "Maruti";
        year = 2020;
        color = "Black";
    }

// Parameterized constructor with one parameter
    public Car(String model) {

        this.model = model;
        year = 2020;

        color = "Black";
    }

// Parameterized constructor with two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        color = "Black";
    }


// Parameterized constructor with three parameters
    public Car(String model, int year, String color) {

        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void display() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.display(); // Output: Model: Maruti, Year: 2020, Color: Black
        Car car2 = new Car("Tesla");
        car2.display(); // Output: Model: Tesla, Year: 2020, Color: Black
        Car car3 = new Car("BMW", 2023);
        car3.display(); // Output: Model: BMW, Year: 2023, Color: Black
        Car car4 = new Car("Audi", 2022, "Red");
        car4.display(); // Output: Model: Audi, Year: 2022, Color: Red
    }
}
