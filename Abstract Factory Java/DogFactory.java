public class DogFactory implements AbstractFactory {

    @Override
    public Dog create() {
        return new ShibaInu();
    }
}
