
public class SesionVirtual extends Sesion {

    // Almacena el enlace de acceso a la clase virtual.
    private String enlace;

    /**
     * Constructor de SesionVirtual.
     * Recibe la fecha, duracion y enlace.
     */
    public SesionVirtual(String fecha, int duracion, String enlace) {

        // Llama al constructor de la superclase Sesion.
        super(fecha, duracion);

        // Inicializa el atributo propio de SesionVirtual.
        this.enlace = enlace;
    }

    /**
     * Sobrescribe el metodo de la superclase
     * para entregar las indicaciones virtuales.
     */
    @Override
    public String obtenerIndicaciones() {
        return "Ingresar a la clase en: " + enlace;
    }
}
