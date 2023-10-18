import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> al;
    //private ArrayList<Dulce> dulces;
    public Deposito(){ al = new ArrayList<>(); }
    public void addProducto(T b){ al.add(b); }
    public T getProducto(){

        if(al.size()==0) return null;

        T b = al.remove(0);
        return b;
    }
}