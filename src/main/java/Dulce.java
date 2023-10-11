public abstract class Dulce extends Producto {
    //private int serie;

    public Dulce(int serie) {
        super(serie);
        //this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    @Override
    public String sonido() {
        return null;
    }
    //public abstract String comer();

}
