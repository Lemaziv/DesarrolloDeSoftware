public class DecoratorMain {
    public static void main( String[] args ) {
        PerroInterfaz[] array = {new DecoradorCafe(new Perro()), new DecoradorBlanco(new Perro())};
        for (PerroInterfaz anArray : array) {
            anArray.existir();
            System.out.print(" - ");
        }
    }
}