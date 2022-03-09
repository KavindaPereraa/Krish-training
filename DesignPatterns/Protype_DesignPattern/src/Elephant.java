public class Elephant extends Animal {

    private String animalSize;

    public String getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "animalSize='" + animalSize + '\'' +
                '}';
    }
}
