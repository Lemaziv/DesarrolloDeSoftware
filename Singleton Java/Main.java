public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Singleton a = Singleton.getSingleton();
        Singleton b = Singleton.getSingleton();
    }
}