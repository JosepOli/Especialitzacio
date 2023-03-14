package s301n2;

public class DireccioGenerica implements Direccio {
	private String carrer;
	private String ciutat;
	private String estat;
	private String codiPostal;
	private String pais;

	public DireccioGenerica(String carrer, String ciutat, String estat, String codiPostal, String pais) {
		this.carrer = carrer;
		this.ciutat = ciutat;
		this.estat = estat;
		this.codiPostal = codiPostal;
		this.pais = pais;
	}

	// Retorna la direcció formatejada segons el format del país
	public String getDireccioFormatejada() {
		return carrer + "\n" + ciutat + ", " + estat + " " + codiPostal + "\n" + pais;
	}
}