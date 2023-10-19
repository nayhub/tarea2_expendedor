import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    private Comprador compradorPrueba;
    private Comprador compradorPrueba2;
    private Comprador compradorPrueba3;
    private Expendedor expendedorPrueba = new Expendedor(3);
    private Moneda monedaPrueba = new Moneda1000();
    private Moneda monedaPrueba2 = new Moneda1500();
    @BeforeEach
    void setUp() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        compradorPrueba = new Comprador(monedaPrueba, 3, expendedorPrueba);
        compradorPrueba2 = new Comprador(monedaPrueba, 4, expendedorPrueba);
        compradorPrueba3 = new Comprador(monedaPrueba2, 5, expendedorPrueba);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test de vuelto")
    public void testvuelto() {
        System.out.println("Tu vuelto es: "+compradorPrueba.cuantoVuelto());
        System.out.println("Tu vuelto es: "+compradorPrueba2.cuantoVuelto());
        System.out.println("Tu vuelto es: "+compradorPrueba3.cuantoVuelto());
        assertEquals(0, compradorPrueba.cuantoVuelto());
        assertEquals(500, compradorPrueba2.cuantoVuelto());
        assertEquals(1000, compradorPrueba3.cuantoVuelto());
    }

    @Test
    @DisplayName("Test Fanta")
    public void nombreProducto() {
        System.out.println(compradorPrueba.queConsumiste());
        assertEquals("Fanta",compradorPrueba.queConsumiste());
        System.out.println(compradorPrueba2.queConsumiste());
        assertEquals("Snickers",compradorPrueba2.queConsumiste());
        System.out.println(compradorPrueba3.queConsumiste());
        assertEquals("*c come un Super8",compradorPrueba3.queConsumiste());
    }
}
