package Homework4;

class Mercedes extends Car {
    public Mercedes(String model, int horsepower, String color, int year, double price) {
        super("Mercedes", model, horsepower, color, year, price);
    }

    @Override
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating elegantly!");
    }
}