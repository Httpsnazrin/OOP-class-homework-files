public class Main {
    public static void main(String[] args) {
        // Creating the Pet object
        String[] petHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("pisik", "Mestan", 2, 53, petHabits);

        // Creating the Human objects (father, mother, and child)
        Human mother = new Human("Ulviyya", "Muradova", 1986, 120, new String[][] {{"Monday", "wORK"}, {"Saturday", "Cleaning home"}});
        Human father = new Human("Yalchin", "Muradov", 1975, 130, new String[][] {{"Monday", "Work"}, {"Tuesday", "Rest"}});

        // Creating Family
        Family family = new Family(mother, father);
        family.setPet(pet);

        // Creating a Child
        Human child1 = new Human("Nazrin", "Muradli", 2005, 135, new String[][] {{"Monday", "Table tennis"}, {"Friday", "Self-study"}});
        Human child2 = new Human("Parvin", "Muradli", 2010, 120, new String[][] {{"Monday", "Play"}, {"Thursday", "School"}});
        Human child3 = new Human("Cavid", "Muradli", 2007, 130, new String[][] {{"Monday", "Play"}, {"Wednesday", "Fitness"}});

        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);

        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());

        // Deleting a child
        family.deleteChild(0);
        System.out.println(family.toString());
        System.out.println("Family member count: " + family.countFamily());
    }
}
