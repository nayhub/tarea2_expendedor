public class Comprador {
    private String sonido;
    private Expendedor exp;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException{
        this.exp = exp;
        Producto a = exp.comprarProducto(m, cualProducto);
        if (a== null) sonido = null;
        else{
            sonido = a.sonido();
        }
        boolean b = true ;
        while(b){

            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;
        }
    }
    public int cuantoVuelto(){ return vuelto; }
    public String queConsumiste(){ return sonido; }
}