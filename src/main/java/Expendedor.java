public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> Super8;
    private Deposito<Producto> snikers;
    private DepositoM monVu;
    private int precio;

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
        if (m == null) throw new PagoIncorrectoException("Pago Invalido");
        int vuelto = m.getValor();
        Producto cc = null;
        Producto sp = null;
        Producto ft = null;
        Producto sk = null;
        Producto s8 = null;

        switch (n) {
            case 1:
                if (m.getValor() >= seleccionarProducto.coca.getValor()) {
                    cc = (Producto) coca.getProducto();
                    if (cc != null) {
                        vuelto = m.getValor() - seleccionarProducto.coca.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 2:
                if (m.getValor() >= seleccionarProducto.sprite.getValor()) {
                    sp = (Producto) sprite.getProducto();
                    if (sp != null) {
                        vuelto = m.getValor() - seleccionarProducto.sprite.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 3:
                if (m.getValor() >= seleccionarProducto.fanta.getValor()) {
                    ft = (Producto) fanta.getProducto();
                    if (ft != null) {
                        vuelto = m.getValor() - seleccionarProducto.fanta.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 4:
                if (m.getValor() >= seleccionarProducto.snickers.getValor()) {
                    sk = (Producto) snikers.getProducto();
                    if (sk != null) {
                        vuelto = m.getValor() - seleccionarProducto.snickers.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 5:
                if (m.getValor() >= seleccionarProducto.super8.getValor()) {
                    s8 = (Producto) Super8.getProducto();
                    if (s8 != null) {
                        vuelto = m.getValor() - seleccionarProducto.super8.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            default:
                throw new NoHayProductoException("No existe ese producto, elija otro por favor");
        }

        while (vuelto > 0) {
            monVu.addMoneda(new Moneda100());
            vuelto = vuelto - 100;
        }

        switch (n) {
            case 1:
                return cc;
            case 2:
                return sp;
            case 3:
                return ft;
            case 4:
                return sk;
            case 5:
                return s8;
            default:
                return null;
        }
    }

    public int getPrecio () {
        return precio;
    }
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
}

    /*                } else if (n == seleccionarProducto.sprite.getOpcion() && m.getValor() >= seleccionarProducto.sprite.getValor()) {
                        Producto b = sprite.getProducto();
                        if (b != null) {
                            for (int i = 0; i < (m.getValor() - seleccionarProducto.sprite.getValor()) / 100; i++) {
                                Moneda a = new Moneda100();
                                monVu.addMoneda(a);
                            }
                        }
                        return b;
                    } else if (n == seleccionarProducto.fanta.getOpcion() && m.getValor() >= seleccionarProducto.fanta.getValor()) {
                        Producto b = fanta.getProducto();
                        if (b != null) {
                            for (int i = 0; i < (m.getValor() - seleccionarProducto.fanta.getValor()) / 100; i++) {
                                Moneda a = new Moneda100();
                                monVu.addMoneda(a);
                            }
                        }
                        return b;
                    } else if (n == seleccionarProducto.super8.getOpcion() && m.getValor() >= seleccionarProducto.super8.getValor()) {
                        Producto d = Super8.getProducto();

                        if (d != null) {
                            for (int i = 0; i < (m.getValor() - seleccionarProducto.super8.getValor()) / 100; i++) {

                                Moneda a = new Moneda100();
                                monVu.addMoneda(a);
                            }
                        }
                        return d;
                    } else if (n == seleccionarProducto.snickers.getOpcion() && m.getValor() >= seleccionarProducto.snickers.getValor()) {
                        Producto d = snikers.getProducto();

                        if (d != null) {
                            for (int i = 0; i < (m.getValor() - seleccionarProducto.snickers.getValor()) / 100; i++) {

                                Moneda a = new Moneda100();
                                monVu.addMoneda(a);
                            }
                        }
                        return d;
                    } else {
                        monVu.addMoneda(m);
                        return null;
                    }
                } else {
                    monVu.addMoneda(m);
                    return null;
                }
        }
        public int getPrecio () {
            return precio;
        }
        public Moneda getVuelto () {
            return monVu.getMoneda();
        }
    } /*

     */