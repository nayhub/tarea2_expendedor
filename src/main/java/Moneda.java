public abstract class Moneda implements Comparable <Moneda> {
    public Moneda() { }

    @Override
    public int compareTo(Moneda o) {
        return Integer.compare(getValor(),(o.getValor()));
    }

    public Moneda getSerie() { return this; }
    public abstract int getValor();

}