public class ObservadorUno implements Observador 
{
    @Override
    public void actualizar(Mensaje m) {
        System.out.println("ObservadorUno: " + m.getContenidoMensaje());
    }
}
