public class Dog extends Pet implements Foulable{

    Species species;
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.DOG;
    }
    @Override
    public void respond() {
        System.out.println("Dog"+getNickName()+" is barking");

    }
    @Override public Species getSpecies() {
        return species;
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

}