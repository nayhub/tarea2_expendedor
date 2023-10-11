public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito Super8;
    private DepositoM monVu;
    private  int precio;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        Super8 = new Deposito();
        monVu = new DepositoM();
        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Producto s8 = new Super8(000 + i);
            Super8.addProducto(s8);

        }
    }

    public Producto comprarProducto(Moneda m, int n) {
        if (m != null && m.getValor() >= precio) {
            if (n == 1) {
                Producto b = coca.getProducto();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }

                    return b;
                }
            }else if (n == 2){

                Producto b = sprite.getProducto();

                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                    return b;
                }
            }else if (n == 3){
                Producto d = Super8.getProducto();

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

            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }
    public int getPrecio(){ return precio; }
    public Moneda getVuelto(){ return monVu.getMoneda(); }
}