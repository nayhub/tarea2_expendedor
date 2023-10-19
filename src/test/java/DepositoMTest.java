import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
    public class DepositoMTest {
        @Test
        @DisplayName("Prueba de agregar y obtener monedas del depósito")
        public void testGetMoneda() {
            DepositoM deposito = new DepositoM();

            Moneda moneda1 = new Moneda100();
            Moneda moneda2 = new Moneda500();
            Moneda moneda3 = new Moneda1000();

            // Agrega algunas monedas al depósito
            deposito.addMoneda(moneda1);
            deposito.addMoneda(moneda2);
            deposito.addMoneda(moneda3);

            assertEquals(moneda1, deposito.getMoneda());
            assertEquals(moneda2, deposito.getMoneda());
            assertEquals(moneda3, deposito.getMoneda());
            assertNull(deposito.getMoneda());
        }
    }