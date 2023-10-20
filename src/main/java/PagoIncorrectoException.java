/**
 * Clase que representa una excepción cuando no hay moneda.
 */
public class PagoIncorrectoException extends NullPointerException {
    /**
     * Constructor de la clase PagoIncorrectoException.
     * @param pagoinvalido El mensaje de error a mostrar.
     */
    public PagoIncorrectoException(String pagoinvalido){
        super(pagoinvalido);
    }
}
