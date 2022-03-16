import java.util.ArrayList;
import java.util.List;
 
public class SujetoPublicador implements Sujeto {
     
    private List<Observador> observadores = new ArrayList<>();
 
    @Override
    public void adjuntar(Observador o) {
        observadores.add(o);
    }
 
    @Override
    public void notificar(Mensaje m) {
        for(Observador o: observadores) {
            o.actualizar(m);
        }
    }
}