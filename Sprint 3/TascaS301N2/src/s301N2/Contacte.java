package s301N2;

public class Contacte {

	private String nom;
	private String cognoms;
	private Direccio direccio;
	private NumeroTelefon numeroTelefon;

	public Contacte(String nom, String cognoms, Direccio direccio, NumeroTelefon numeroTelefon) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.direccio = direccio;
		this.numeroTelefon = numeroTelefon;
	}

	public String getNom() {
		return nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public Direccio getDireccio() {
		return direccio;
	}

	public NumeroTelefon getNumeroTelefon() {
		return numeroTelefon;
	}

}
