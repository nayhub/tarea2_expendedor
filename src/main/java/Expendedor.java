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
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        Super8 = new Deposito<>();
        snikers = new Deposito<>();
        monVu = new DepositoM();
        precio = precioBebidas;

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

    public Producto comprarProducto(Moneda m, int n) throws NoHayProductoException, NullPointerException, PagoInsuficienteException {
        if (m == null)
            throw new PagoIncorrectoException("Pago Invalido");
        if (m != null && m.getValor() >= precio) {
            if (n == seleccionarProducto.coca.getOpcion()) {
                Producto b = coca.getProducto();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return b;
            }else if (n == seleccionarProducto.sprite.getOpcion()){
                Producto b = sprite.getProducto();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return b;
            }else if (n == seleccionarProducto.fanta.getOpcion() ){
                Producto b = fanta.getProducto();
                if(b != null){
                    for(int i = 0; i < (m.getValor() - precio) / 100;i++){
                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return b;
            }else if (n == seleccionarProducto.super8.getOpcion()){
                Producto d = Super8.getProducto();

                if(d != null){
                    for(int i = 0; i < (m.getValor() - precio) / 100;i++){

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                }
                return d;
            }else if (n == seleccionarProducto.snickers.getOpcion()){
                Producto d = snikers.getProducto();

                if(d != null){
                    for(int i = 0; i < (m.getValor() - precio) / 100;i++){

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
            //monVu.addMoneda(m);
            //return null;
        }
        //monVu.addMoneda(m);
        return null;
    }
    public int getPrecio(){ return precio; }
    public Moneda getVuelto(){ return monVu.getMoneda(); }
}