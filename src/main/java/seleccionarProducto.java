public enum seleccionarProducto {
    coca(1, 1000),
    sprite(2, 1000),
    fanta(3, 1000),
    snickers(4, 500),
    super8(5, 500);

    private int opcion;
    private int valor;

    seleccionarProducto(int opcion, int valor) {
        this.opcion = opcion;
        this.valor = valor;
    }

    public int getOpcion() {
        return opcion;
    }

    public int getValor() {
        return valor;
    }
}
