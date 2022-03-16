public class ObservadorDos implements Observador 
{
    @Override
    public void actualizar(Mensaje m) {
        System.out.println("ObservadorDos: " + m.getContenidoMensaje());
    }
}