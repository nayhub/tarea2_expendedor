/**
 * Clase que representa un dulce de Snickers
 * Hereda de la clase Dulce
 */
public class Snickers extends Dulce {
    /**
     * Constructor de la clase Snickers
     * @param serie El número de serie del dulce.
     */
    public Snickers(int serie) {
        super(serie);
    }
    /**
     * Método abstracto que devuelve el nombre del dulce
     * @return El nombre del dulce
     */
    @Override
    public String sonido() {
        //super.sonido()
        return "Snickers";
    }
}
