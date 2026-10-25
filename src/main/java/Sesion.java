
public class Sesion {

	private String fecha;
	private int duracion;
	private boolean realizada;

	/**
	 * Constructor de la clase Sesion.
	 * Inicializa los atributos comunes.
	 */
	public Sesion(String fecha, int duracion) {
		this.fecha = fecha;
		this.duracion = duracion;
		this.realizada = false;
	}

	/**
	 * Registra que la sesion fue realizada.
	 */
	public void registrarRealizacion() {
		this.realizada = true;
	}

	/**
	 * Entrega las indicaciones generales
	 * para asistir a una sesion.
	 */
	public String obtenerIndicaciones() {
		return "Consultar indicaciones de la sesion";
	}
}
