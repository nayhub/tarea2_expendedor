public class Expendedor {
    private Deposito <Producto> coca;
    private Deposito <Producto> sprite;
    private Deposito <Producto> fanta;
    private Deposito <Producto> Super8;
    private Deposito <Producto> snikers;
    private DepositoM monVu;
    private  int precio;
    //public static final int  COCA = 1;
    //public static final int  SPRITE = 2;
    public Expendedor(int numBebidas) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        Super8 = new Deposito<>();
        snikers = new Deposito<>();
        monVu = new DepositoM();
        //precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Producto ft = new Fanta(300 + i);
            fanta.addProducto(ft);
            Producto s8 = new Super8(i);
            Super8.addProducto(s8);
            Producto sn = new Snickers((50 + i));
            snikers.addProducto(sn);

        }
    }

    public Producto comprarProducto(Moneda m, int n) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if (m == null)
            throw new PagoIncorrectoException("Pago Invalido");
        if (m != null) {
            if (n == seleccionarProducto.coca.getOpcion() && m.getValor() >= seleccionarProducto.coca.getValor()) {
                Producto b = coca.getProducto();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - seleccionarProducto.coca.getValor()) / 100; i++) {
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
            if (b == null) {
                throw new NoHayProductoException("No hay producto disponible");
                }
            if (m.getValor() < seleccionarProducto.coca.getValor()) {
              throw new PagoInsuficienteException("Pago insuficiente");
            }
           return b;
            }else if (n == seleccionarProducto.sprite.getOpcion() && m.getValor() >= seleccionarProducto.sprite.getValor()){
                Producto b = sprite.getProducto();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - seleccionarProducto.sprite.getValor()) / 100; i++) {
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return b;
            }else if (n == seleccionarProducto.fanta.getOpcion() &&  m.getValor() >= seleccionarProducto.fanta.getValor()){
                Producto b = fanta.getProducto();
                if(b != null){
                    for(int i = 0; i < (m.getValor() - seleccionarProducto.fanta.getValor()) / 100;i++){
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return b;
            }else if (n == seleccionarProducto.super8.getOpcion() && m.getValor() >= seleccionarProducto.super8.getValor()){
                Producto d = Super8.getProducto();

                if(d != null){
                    for(int i = 0; i < (m.getValor() - seleccionarProducto.super8.getValor()) / 100;i++){

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return d;
            }else if (n == seleccionarProducto.snickers.getOpcion() && m.getValor() >= seleccionarProducto.snickers.getValor()){
                Producto d = snikers.getProducto();

                if(d != null){
                    for(int i = 0; i < (m.getValor() - seleccionarProducto.snickers.getValor()) / 100;i++){

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return d;
            }
            else{
                monVu.addMoneda(m);
                return null;
            }
        }else {
            monVu.addMoneda(m);
            return null;
        }
    }
    public int getPrecio(){ return precio; }
    public Moneda getVuelto(){ return monVu.getMoneda(); }
}