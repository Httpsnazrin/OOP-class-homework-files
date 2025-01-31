public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("V8", "Red", 2015, "Mustang", "Ford", "Gasoline", "USA", 30000);

        myCar.displayCar();

        double discount = myCar.calculateDiscount();
        double finalPrice = myCar.finalPrice();

        System.out.println("Discount: $" + discount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }
}
