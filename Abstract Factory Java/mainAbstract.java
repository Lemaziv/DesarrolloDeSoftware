public class mainAbstract{
    public static void main(String[] args) {
        Dog shiba = new DogFactory().create();
        shiba.getDog();
        Color cafe = new ColorFactory().create();
        cafe.getColor();
    }
}
