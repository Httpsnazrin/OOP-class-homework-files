public class Main {
    public static void main(String[] args) {
        // Creating the Pet object
        String[] petHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, petHabits);

        // Creating the Human objects (father, mother, and child)
        Human mother = new Human("Nazrin", "Muradli", 2005);
        Human father = new Human("Viktor", "Samedov", 2000);
        String[][] schedule = {{"Monday", "Gym"}, {"Tuesday", "Reading"}, {"Wednesday", "Cooking"}};
        Human child = new Human("Michael", "Karleone", 2000, 90, pet, mother, father, schedule);

        // Testing feedPet method
        System.out.println("\nFeeding Pet when it's time:");
        boolean fed = child.feedPet(true);
        System.out.println("Feeding happened: " + fed);

        System.out.println("\nFeeding Pet when it's NOT time:");
        fed = child.feedPet(false);
        System.out.println("Feeding happened: " + fed);
    }
}