package Homework4;

class BMW extends Car {
    public BMW(String model, int horsepower, String color, int year, double price) {
        super("BMW", model, horsepower, color, year, price);
    }

    @Override
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating smoothly!");
    }
}
