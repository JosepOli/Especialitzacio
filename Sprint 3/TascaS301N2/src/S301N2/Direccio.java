package S301N2;

public abstract class Direccio {

	private String carrer;
	private String ciutat;
	private String codiPostal;
	private String provincia;
	private String pais;

	public Direccio(String carrer, String ciutat, String codiPostal, String provincia, String pais) {
		this.carrer = carrer;
		this.ciutat = ciutat;
		this.codiPostal = codiPostal;
		this.provincia = provincia;
		this.pais = pais;
	}

	// Getters i setters
	public String getCarrer() {
		return carrer;
	}

	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}

	public String getCiutat() {
		return ciutat;
	}

	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}

	public String getCodiPostal() {
		return codiPostal;
	}

	public void setCodiPostal(String codiPostal) {
		this.codiPostal = codiPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// Mètode  per imprimir la informació de la direcció
	public abstract void imprimirDireccio();
}
