class Demo {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        // System.out.println(cars[0]); // This will print "Opel"
        // System.out.println(cars.length);
        
        // loop through the array
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
