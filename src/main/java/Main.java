public class Main {
    public static void main(String[] args) {

        /* try {
            Expendedor exp = new Expendedor(5, 300);
            Moneda1000 m1000 = new Moneda1000();
            Moneda100 m100 = new Moneda100();
            Moneda500 m500 = new Moneda500();
            Moneda1500 m1500 = new Moneda1500();

            Comprador comprador = new Comprador(m1000, seleccionarProducto.coca.getOpcion(), exp);

            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());

            //Moneda m = null;
            //Comprador c=null;
            //exp.comprarProducto(m,3);
        }catch (){} */

        Expendedor exp = new Expendedor(5, 300);
        Comprador c = null;
        Moneda m = null;

        try {
         Moneda1000 m1000 = new Moneda1000();
         Moneda100 m100 = new Moneda100();
         Moneda500 m500 = new Moneda500();
         Moneda1500 m1500 = new Moneda1500();
         Comprador comprador = new Comprador(null, seleccionarProducto.coca.getOpcion(), exp);

         System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());

         } catch (PagoInsuficienteException ins) {
            int devolucion = m.getValor();
            System.out.println("No le alcanza, " + "tenga su devolucion " + devolucion);
         } catch (NoHayProductoException noHay) {
            int devolucion = m.getValor();
            System.out.println("No queda el dulce o bebida elegido," + "devolucion " + devolucion);
         } catch (PagoIncorrectoException ErrorEnPago) {
            System.out.println("Error en su pago, intente nuevamente");
         }
        }
    }