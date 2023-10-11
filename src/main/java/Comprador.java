public class Comprador{
    private String sonido;
    private Expendedor exp;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        this.exp = exp;
        Producto a = exp.comprarProducto(m, cualProducto);

        //Modifiqué el codigo para que funcione con producto pero tira null

        if (a== null) sonido = null;
        else{
            sonido = a.sonido();
        }
        /*
        else if (a instanceof Bebida){
            Producto producto = new Producto(000);
            Bebida b = (Bebida) producto;
            sonido = b.beber();
        }else if( a instanceof Dulce){
            Producto producto = new Producto(000);
            Dulce d = (Dulce) producto;
            sonido = d.comer();
        }

         */


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