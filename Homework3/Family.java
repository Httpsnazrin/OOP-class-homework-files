package Homework3;
import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    Family(Human mother, Human father){
        this.setMother(mother);
        this.setFather(father);
        this.children = new Human[0];
        this.pet = new Pet();
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public Human getMother(){
        return mother;
    }
    public Human getFather(){
        return father;
    }
    public Human[] getChildren(){
        return children;
    }
    public Pet getPet(){
        return pet;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void setChildren(Human[] children){
        this.children = children;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }
    public void addChild(Human child){
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        children = newChildren;
        child.setFamily(this);
    }
    public boolean delChild(Human given){
        boolean found = false;

        for(Human child : children) {
            if(child.equals(given)) {
                found = true;
                break;
            }
        }
        if(!found) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int index=0;
        for (Human child : children) {
            if (!child.equals(given)) {
                newChildren[index] = child;
                index++;
            }
        }
        children = newChildren;
        return true;
    }
    public boolean delChild(int indexx){
        boolean found = false;

        for(Human child : children) {
            if(child.equals(children[indexx])) {
                found = true;
                break;
            }
        }
        if(!found) {
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        int index=0;
        for (Human child : children) {
            if (!child.equals(children[indexx])) {
                newChildren[index] = child;
                index++;
            }
        }
        children = newChildren;
        return true;
    }
    public int countFamily(){
        return 2+children.length;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Objects.deepEquals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), Arrays.hashCode(getChildren()), getPet());
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class");
    }
}