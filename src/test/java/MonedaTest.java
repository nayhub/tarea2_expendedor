import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    @Test
    void compareTo(){
        Moneda moneda100 = new Moneda100();
        Moneda moneda500 = new Moneda500();
        Moneda moneda1000 = new Moneda1000();
        Moneda moneda1500 = new Moneda1500();

        assertTrue(moneda100.compareTo(moneda500)<0);
        assertTrue(moneda500.compareTo(moneda1000)<0);
        assertTrue(moneda1000.compareTo(moneda1500)<0);
        assertEquals(0, moneda100.compareTo(moneda100));
    }

}