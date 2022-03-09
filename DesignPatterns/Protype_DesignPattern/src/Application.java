public class Application {
    public static void main(String[] args){
        Registry registry = new Registry();
        Elephant elephant = (Elephant) registry.getAnimal(AnimalType.ELEPHANT);
        System.out.println(elephant);

        elephant.setAnimalSize("Adult Elephant");

        System.out.println(elephant);

        Elephant elephant1 = (Elephant) registry.getAnimal(AnimalType.ELEPHANT);
        System.out.println(elephant1);
    }
}
