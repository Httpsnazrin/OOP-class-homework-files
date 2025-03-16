public class RoboCat extends Pet implements Foulable{
    Species species;
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        species=Species.ROBO_CAT;
    }
    @Override
    public void respond() {
        System.out.println("RoboCat"+getNickName()+" is meowing worse than DomesticCat");
    }
    @Override public Species getSpecies() {
        return species;
    }
    @Override
    public void foul() {
        System.out.println("I need to cover it up with RoboCat sand");
    }
}