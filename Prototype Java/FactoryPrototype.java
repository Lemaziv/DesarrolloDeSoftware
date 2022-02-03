import java.util.Hashtable;

public class FactoryPrototype {
	
    private static Hashtable<String, Carro> CarroMap  = new Hashtable<String, Carro>();

    public static Carro getCarro(String CarroId) {
        Carro cachedCarro = CarroMap.get(CarroId);
        return (Carro) cachedCarro.clone();
    }

   // for each carro run database query and create carro
   // CarroMap.put(carroKey, carro);
   
    public static void loadCache() {
        Chevy chevy = new Chevy();
        chevy.setId("1");
        CarroMap.put(chevy.getId(),chevy);

        Tsuru tsuru = new Tsuru();
        tsuru.setId("2");
        CarroMap.put(tsuru.getId(),tsuru);
    }
}