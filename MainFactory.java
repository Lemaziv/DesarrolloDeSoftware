public class MainFactory {
    public static void main(String[] args) {
        Animal dog = new DogFactory().createAnimal();
        dog.print();
        Animal cat = new CatFactory().createAnimal();
        cat.print();
    }
}
