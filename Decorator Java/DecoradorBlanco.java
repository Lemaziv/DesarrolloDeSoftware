class DecoradorBlanco extends PerroDecorador {
    public DecoradorBlanco(PerroInterfaz a) {
        super(a);
    }

    public void existir() {
        super.existir();
        DecoraBlanco();
    }

    private void DecoraBlanco() {
        System.out.print("Blanco");
    }
}
