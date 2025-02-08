import java.util.Arrays;
import java.util.Random;

public class Human {
     String name;
    String surname;
      int yearOfBirth;
      int iq;
      Pet pet;
      Human mother;
      Human father;
      String[][] schedule;

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String vito, String karleone, int yearOfBirth) {
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.nickname);
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.trickLevel > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.species + " named " + pet.nickname + " who is " + pet.age + " years old, and he is " + slyness + ".");
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    public boolean feedPet(boolean isItTimeForFeeding) {
        if (pet == null) {
            System.out.println("I don't have a pet to feed.");
            return false;
        }

        if (isItTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species + ".");
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101); // Generates a number from 0 to 100

            if (pet.trickLevel > randomNumber) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species + ".");
                return true;
            } else {
                System.out.println("I think " + name + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + yearOfBirth +
                ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + (pet != null ? pet.toString() : "No pet") + "}";
    }
}
