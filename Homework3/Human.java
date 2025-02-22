package Homework3;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    Human(String name, String surname, int year, Pet pet, Human mother, Human father, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setPET(pet);
        this.setMother(mother);
        this.setFather(father);
        this.setSchedule(schedule);
    }

    Human(String name, String surname, int year){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }
    Human(String name, String surname, int year, String[][] schedule){
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setSchedule(schedule);
    }
    Human(){

    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getYear(){
        return year;
    }
    public int getIq(){
        return iq;
    }
    public Pet getPET(){
        return pet;
    }
    public Human getMother(){
        return mother;
    }
    public Human getFather(){
        return father;
    }
    public String[][] getSchedule(){
        return schedule;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setIq(int iq){
        this.iq = iq;
    }
    public void setPET(Pet PET){
        this.pet = PET;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void setSchedule(String[][] schedule){
        this.schedule = schedule;
    }
    public void setFamily(Family family){
        this.family = family;
    }

    void greet_PET() {
        System.out.println("Hello, "+ Pet.getNickname());
    }
    void describePET() {
        if(Pet.getTricklevel()>=50){
            System.out.println("I have an"+Pet.getSpecies()+" is "+Pet.getAge()+" years old, he is very sly");
        }
        else {
            System.out.println("I have an"+Pet.getSpecies()+" is "+Pet.getAge()+" years old, he is almost not sly");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return getYear() == human.getYear() && getIq() == human.getIq() && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && Objects.equals(getPET(), human.getPET()) && Objects.equals(getMother(), human.getMother()) && Objects.equals(getFather(), human.getFather()) && Objects.deepEquals(getSchedule(), human.getSchedule());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getYear(), getIq(), getPET(), getMother(), getFather(), Arrays.deepHashCode(getSchedule()));
    }

    @Override
    public String toString() {
        return "HUMAN{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", PET=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class");
    }
}
