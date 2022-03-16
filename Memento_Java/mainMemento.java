public class mainMemento
{
    public static void main(String[] args)
    {
        // Crear el objeto originador/creador
        Memento creador = new Memento("Pedro", "Gil Mena");
        // Crear el objeto gestor/vigilante del Memento
        CareTaker vigilante= new CareTaker();
        // Crear el Memento y asociarlo al objeto gestor
        vigilante.setMemento(creador.createMemento() );
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
        // Modificar los datos del objeto
        creador.setNombre("María");
        creador.setApellidos("Mora Miró");
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
        // Restaurar los datos del objeto
        creador.setMemento( vigilante.getMemento() );
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
    }
}