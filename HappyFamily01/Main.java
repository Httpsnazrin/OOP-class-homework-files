public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat", "Mestan", 2, 54, new String[]{"meow", "eat", "sleep"});
        Human mother = new Human("Nazrin", "Muradli", 2005);
        Human father = new Human("Murad", "Guliyev", 2006);
        Human human = new Human("Asmar", "Karimli", 2006, 150, pet, mother , father);

        human.greetPet();
        human.describePet();
        pet.eat();
        pet.foul();
        pet.respond();
    }
}
