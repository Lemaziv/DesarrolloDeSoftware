public class MainPrototype {
    public static void main(String[] args) {
        FactoryPrototype.loadCache();
  
        Carro clonedCarro = (Carro) FactoryPrototype.getCarro("1");
        System.out.println("Carro : " + clonedCarro.getType());

        Carro clonedCarro2 = (Carro) FactoryPrototype.getCarro("2");
        System.out.println("Carro : " + clonedCarro2.getType());
    }
}
