/**
 * Clase que representa una excepción cuando no hay suficientes unidades del producto para la venta.
 */
public class NoHayProductoException extends Exception {
    /**
     * Constructor de la clase NoHayProductoException.
     * @param nohay El mensaje de error a mostrar.
     */
    public NoHayProductoException(String nohay){
        super(nohay);
    }
}
