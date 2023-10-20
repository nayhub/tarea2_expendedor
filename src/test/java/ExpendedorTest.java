import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpendedorTest {
    @Test
    public void testComprarProducto() throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(10);
        Moneda m = new Moneda1000();
        Producto p = exp.comprarProducto(m, 1);
        assertNotNull(p);
        assertEquals(CocaCola.class, p.getClass());
    }

    @Test
    public void testComprarProductoNoHayProducto() throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(0);
        Moneda m = new Moneda100();
        assertThrows(PagoInsuficienteException.class, () -> exp.comprarProducto(m, 1));
    }

    @Test
    public void testComprarProductoPagoIncorrecto() throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(10);
        Moneda m = null;
        assertThrows(PagoIncorrectoException.class, () -> exp.comprarProducto(m, 1));
    }

    @Test
    public void testComprarProductoPagoInsuficiente() throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Expendedor exp = new Expendedor(3);
        Moneda m = new Moneda100();
        assertThrows(PagoInsuficienteException.class, () -> exp.comprarProducto(m, 5));
    }
}