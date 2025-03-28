package Homework4;

abstract class Car {
    String brand;
    String model;
    int horsepower;
    String color;
    int year;
    double price;

    public Car(String brand, String model, int horsepower, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    void startEngine() {
        System.out.println(brand + " " + model + " engine is starting...");
    }

    void stopEngine() {
        System.out.println(brand + " " + model + " engine is stopping...");
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Horsepower: " + horsepower + ", Color: " + color + ", Year: " + year + ", Price: $" + price);
    }

    abstract void accelerate();
}