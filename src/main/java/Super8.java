/**
 * Clase que representa un dulce Super8
 * Hereda de la clase Dulce
 */
public class Super8 extends Dulce {
    /**
     * Constructor de la clase Super8.
     * @param serie El número de serie del dulce
     */

    public Super8(int serie) {
        super(serie);
    }

    /**
     * Método abstracto que devuelve el nombre del dulce
     * @return El nombre del dulce
     */
    @Override
    public String sonido() {
        return "*c come un Super8";
    }
}
