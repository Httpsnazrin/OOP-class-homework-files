/**
 * +----------------------------------+
 * |              Car                 |
 * +----------------------------------+
 * | - engine: String                 |
 * | - color: String                  |
 * | - year: int                      |
 * | - model: String                  |
 * | - brand: String                  |
 * | - fuelType: String               |
 * | - country: String                |
 * | - initialPrice: double           |
 * +----------------------------------+
 * | + displayCar(): void             |
 * | + calculateDiscount(): double    |
 * | + finalPrice(): double           |
 * +----------------------------------+
 */

public class Car {
    private String engine;
    private String color;
    private int year;
    private String model;
    private String brand;
    private String fuelType;
    private String country;
    private double initialPrice;

    // Constructor
    public Car(String engine, String color, int year, String model, String brand, String fuelType, String country, double initialPrice) {
        this.engine = engine;
        this.color = color;
        this.year = year;
        this.model = model;
        this.brand = brand;
        this.fuelType = fuelType;
        this.country = country;
        this.initialPrice = initialPrice;
    }

    // Display all car details
    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Engine: " + engine);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Country: " + country);
        System.out.println("Initial Price: $" + initialPrice);
    }

    // Calculate discount
    public double calculateDiscount() {
        return (year <= 2016) ? initialPrice * 0.20 : initialPrice * 0.10;
    }

    // Calculate final price after discount
    public double finalPrice() {
        return initialPrice - calculateDiscount();
    }
}
