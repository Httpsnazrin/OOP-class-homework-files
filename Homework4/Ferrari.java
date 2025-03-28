package Homework4;

class Ferrari extends Car {
    public Ferrari(String model, int horsepower, String color, int year, double price) {
        super("Ferrari", model, horsepower, color, year, price);
    }

    @Override
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating with a roar!");
    }
}

