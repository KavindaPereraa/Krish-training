import java.util.concurrent.RecursiveTask;

public  abstract  class Animal implements Cloneable {

    private String animalName;
    private int animalHeight;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalHeight() {
        return animalHeight;
    }

    public void setAnimalHeight(int animalHeight) {
        this.animalHeight = animalHeight;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }

}
