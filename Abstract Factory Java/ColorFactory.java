public class ColorFactory implements AbstractFactory {
    @Override
    public Color create() {
        return new Cafe();
    }
}
