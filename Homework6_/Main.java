package Homework6_;


public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("M5 Competition", 625, "Black", 2023, 120000);
        bmw.startEngine();
        bmw.showDetails();
        bmw.accelerate();
        bmw.stopEngine();
        System.out.println("\n");

        Ferrari ferrari = new Ferrari("SF90 Stradale", 986, "Red", 2023, 500000);
        ferrari.startEngine();
        ferrari.showDetails();
        ferrari.accelerate();
        ferrari.stopEngine();
        System.out.println("\n");

        Mercedes mercedes = new Mercedes("AMG GT", 577, "Silver", 2023, 140000);
        mercedes.startEngine();
        mercedes.showDetails();
        mercedes.accelerate();
        mercedes.stopEngine();
        System.out.println("\n");

        Porsche porsche = new Porsche("911 Turbo S", 640, "Blue", 2023, 210000);
        porsche.startEngine();
        porsche.showDetails();
        porsche.accelerate();
        porsche.stopEngine();
        System.out.println("\n");

        Audi audi = new Audi("RS7 Sportback", 591, "Gray", 2023, 130000);
        audi.startEngine();
        audi.showDetails();
        audi.accelerate();
        audi.stopEngine();
    }
}
