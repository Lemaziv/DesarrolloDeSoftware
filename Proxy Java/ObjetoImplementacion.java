public class ObjetoImplementacion implements FuncionObjeto{

    public ObjetoImplementacion() {
        Configuracion();
    }

    @Override
    public void funcion(){
        System.out.println("Hola");
    }

    private void Configuracion() {
        System.out.println("Configurando...");
    }
}
