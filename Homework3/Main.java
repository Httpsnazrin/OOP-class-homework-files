package Homework3;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet(AnimalSpecies.BUNNY, "Fluffy");

        Human John = new Human("John", "Smith", 1985);
        Human Emma = new Human("Emma", "Smith", 1990);

        Family SmithFamily = new Family(Emma, John);

        Human child1 = new Human("Lily", "Smith", 2020, pet1, Emma, John, new String[][]{
                {DAYSOFTHEWEEK.TUESDAY.name(), "School"},
                {DAYSOFTHEWEEK.THURSDAY.name(), "Dance Class"},
                {DAYSOFTHEWEEK.SATURDAY.name(), "Playground"}
        });

        // Print child's details
        System.out.println(child1);
        System.out.println("--------------");

        SmithFamily.addChild(child1);
        System.out.println(SmithFamily);
        System.out.println("Family count: " + SmithFamily.countFamily());

        SmithFamily.delChild(0);
        System.out.println("After deletion:");
        System.out.println(SmithFamily);
        System.out.println("Family count: " + SmithFamily.countFamily());

        Human Jack = new Human("Jack", "Smith", 2008, new String[][]{
                {DAYSOFTHEWEEK.MONDAY.name(), "Football"},
                {DAYSOFTHEWEEK.WEDNESDAY.name(), "Basketball"},
                {DAYSOFTHEWEEK.FRIDAY.name(), "Swimming"}
        });

        SmithFamily.addChild(Jack);
        System.out.println("After adding Jack:");
        System.out.println(SmithFamily);
        System.out.println("Family count: " + SmithFamily.countFamily());
    }
}
