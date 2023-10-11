public abstract class Producto {
    protected int serie;

    public Producto(int serie) {
        this.serie = serie;
    }
    public abstract String sonido();
}
