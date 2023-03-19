package s301n2;

//Classe abstracta per a l'emmagatzematge d'una adreça
abstract class Direccio {
	protected String carrer;
	protected int numero;
	protected String ciutat;
	protected String codiPostal;
	protected String pais;

	public Direccio(String carrer, int numero, String ciutat, String codiPostal, String pais) {
		this.carrer = carrer;
		this.numero = numero;
		this.ciutat = ciutat;
		this.codiPostal = codiPostal;
		this.pais = pais;
	}

	// Retorna l'adreça formatejada
	public abstract String getDireccioFormatejada();
}