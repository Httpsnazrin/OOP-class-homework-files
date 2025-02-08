import java.util.Random;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this(name, surname, year);
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this(name, surname, year, father, mother);
        this.iq = iq;
        this.pet = pet;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.nickname);
        }
    }

    public void describePet() {
        if (pet != null) {
            if (pet.trickLevel > 50) {
                System.out.println("I have a " + pet.species + " that is " + pet.age + " years old, he is very sly.");
            } else {
                System.out.println("I have a " + pet.species + " that is " + pet.age + " years old, he is almost not sly.");
            }
        }
    }

    public boolean feedPet(boolean isItTimeForFeeding) {
        if (isItTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            if (pet.trickLevel > randomNumber) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + name + "'s " + pet.species + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + mother.name + " " + mother.surname + ", father=" + father.name + " " + father.surname +
                ", pet=" + pet.toString() + "}";
    }
}
