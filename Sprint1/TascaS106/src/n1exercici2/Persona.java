package n1exercici2;

public class Persona {
	// Declarem els atributs de la classe
	String nom;
	String cognom;
	int edat;

	// Constructor per inicialitzar els atributs de la classe
	public Persona(String nom, String cognom, int edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}
	
	

}
