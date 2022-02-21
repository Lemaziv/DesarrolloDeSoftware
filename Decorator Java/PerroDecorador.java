abstract class PerroDecorador implements PerroInterfaz {
    private PerroInterfaz perro;
    public PerroDecorador(PerroInterfaz a) {
        perro = a;
    }

    public void existir() {
        perro.existir();
    }
}
