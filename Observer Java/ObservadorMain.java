public class ObservadorMain 
{
    public static void main(String[] args) 
    {
        ObservadorUno s1 = new ObservadorUno();
        ObservadorDos s2 = new ObservadorDos();
         
        SujetoPublicador p = new SujetoPublicador();
         
        p.adjuntar(s1);
        p.adjuntar(s2);
         
        p.notificar(new Mensaje("Mensaje"));
        p.notificar(new Mensaje("Hola"));
    }
}