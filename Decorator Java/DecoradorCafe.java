class DecoradorCafe extends PerroDecorador {
    public DecoradorCafe(PerroInterfaz a) {
        super(a);
    }

    public void existir() {
        super.existir();
        DecoraCafe();
    }

    private void DecoraCafe() {
        System.out.print("Cafe");
    }
}
