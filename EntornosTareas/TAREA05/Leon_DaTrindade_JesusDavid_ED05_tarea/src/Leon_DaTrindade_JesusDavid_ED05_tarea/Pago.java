package Leon_DaTrindade_JesusDavid_ED05_tarea;
import java.util.Date;
/**
 * Almacenaremos la fecha de la compra, qué socio la realiza y el número de tarjeta que nos ofrece, cuyo valor hemos de comprobar si es válido.
 */
public class Pago {

	private long tarjeta;
	private Date fecha;
	private Socio socio;

	public Pago() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tarjeta
	 * @param fecha
	 * @param socio
	 */
	public Pago(long tarjeta, Date fecha, Socio socio) {
		throw new UnsupportedOperationException();
	}

	public long getTarjeta() {
		return this.tarjeta;
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(long tarjeta) {
		this.tarjeta = tarjeta;
	}

	/**
	 * 
	 * @param numero
	 */
	public boolean comprobarTarjeta(long numero) {
		throw new UnsupportedOperationException();
	}

}