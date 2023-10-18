public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,300);
        Moneda1000 m1000 = new Moneda1000();
        Moneda100 m100 = new Moneda100();
        Moneda500 m500 = new Moneda500();
        Moneda1500 m1500 = new Moneda1500();

        Comprador comprador = new Comprador(m1000, seleccionarProducto.coca.getOpcion(), exp);

        Moneda m = null;
        Comprador c=null;
        System.out.println(comprador.queConsumiste());
        System.out.println(comprador.cuantoVuelto());
        //exp.comprarProducto(m,3);



    }
}