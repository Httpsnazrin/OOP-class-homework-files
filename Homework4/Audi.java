package Homework4;

class Audi extends Car {
    public Audi(String model, int horsepower, String color, int year, double price) {
        super("Audi", model, horsepower, color, year, price);
    }

    @Override
    void accelerate() {
        System.out.println(brand + " " + model + " is accelerating with quattro power!");
    }
}

