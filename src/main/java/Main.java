public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,300);
        Moneda1000 m1000 = new Moneda1000();
        Comprador comprador = new Comprador(m1000, seleccionarProducto.fanta.getOpcion(), exp);

        Moneda m = null;
        Comprador c=null;
        System.out.println(comprador.queConsumiste());
        System.out.println(comprador.cuantoVuelto());
        //exp.comprarProducto(m,3);



    }
}