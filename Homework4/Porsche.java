package Homework4;

class Porsche extends Car {
    public Porsche(String model, int horsepower, String color, int year, double price) {
        super("Porsche", model, horsepower, color, year, price);
    }

    @Override
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating like a beast!");
    }
}
