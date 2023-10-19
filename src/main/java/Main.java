public class Main {
    public static void main(String[] args) {

        /*

        {
            Expendedor exp = new Expendedor(5);
            Moneda1000 m1000 = new Moneda1000();
            Moneda100 m100 = new Moneda100();
            Moneda500 m500 = new Moneda500();
            Moneda1500 m1500 = new Moneda1500();

            Comprador comprador = null;
            try {
                comprador = new Comprador(m1000, seleccionarProducto.super8.getOpcion(), exp);
            } catch (PagoInsuficienteException e) {
                throw new RuntimeException(e);
            } catch (NoHayProductoException e) {
                throw new RuntimeException(e);
            }

            /*
            Comprador comprador = null;
            try {
                comprador = new Comprador(m1000, seleccionarProducto.coca.getOpcion(), exp);
            } catch (PagoInsuficienteException e) {
                throw new RuntimeException(e);
            } catch (NoHayProductoException e) {
                throw new RuntimeException(e);
            }



            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());

            //Moneda m = null;
            //Comprador c=null;
            //exp.comprarProducto(m,3);
        }

         */

        Expendedor exp = new Expendedor(2);
        Moneda m = null;
        Comprador comprador = null;

        try {
            Moneda1000 m1000 = new Moneda1000();
            Moneda100 m100 = new Moneda100();
            Moneda500 m500 = new Moneda500();
            Moneda1500 m1500 = new Moneda1500();

            comprador = new Comprador(m100, seleccionarProducto.sprite.getOpcion(), exp);

            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());
            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());
            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());

        } catch (PagoInsuficienteException ins) {
            //nt a = comprador.cuantoVuelto();
            System.out.println("No le alcanza, " + "tenga su devolucion "  );
        } catch (NoHayProductoException noHay) {
            //int a = comprador.cuantoVuelto();
            System.out.println("No queda el dulce o bebida elegido," + "devolucion" );
        } catch (PagoIncorrectoException ErrorEnPago) {
            System.out.println("Error en su pago, intente nuevamente");
        }

    }
    }