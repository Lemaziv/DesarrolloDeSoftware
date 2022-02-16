public class ObjetoProxy implements FuncionObjeto {
    private static FuncionObjeto object;

    @Override
    public void funcion(){
        if (object == null) {
            object = new ObjetoImplementacion();
        }
        object.funcion();
    }
}
