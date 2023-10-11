public abstract class Bebida extends Producto{
    //private int serie;
    public Bebida(int serie){
        super(serie);
        //this.serie = serie;
    }
    public int getSerie() { return serie; }

    @Override
    public String sonido() {
        return null;
    }

    //public abstract String beber();
}