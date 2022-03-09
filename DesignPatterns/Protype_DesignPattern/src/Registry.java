import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<AnimalType, Animal> animals = new HashMap<>();

    public Registry() {
         this.initialize();
    }
    public Animal getAnimal(AnimalType animalType){
        Animal animal=null;
        try {
             animal = (Animal) animals.get(animalType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  animal;
    }

    private void initialize() {

        Tiger tiger =new Tiger();
        tiger.setColorCode(0x64);
        tiger.setAnimalHeight(180);
        tiger.setAnimalName("Rono The Tiger");

        Elephant elephant = new Elephant();
        elephant.setAnimalHeight(200);
        elephant.setAnimalName("Pez The Elephant");
        elephant.setAnimalSize("Baby Elephant");

        animals.put(AnimalType.ELEPHANT,elephant);
        animals.put(AnimalType.TIGER,tiger);
    }
}
