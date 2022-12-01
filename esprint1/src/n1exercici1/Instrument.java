package n1exercici1;

public abstract class Instrument {
	
	private String nom;
	private Integer preu;

	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	abstract void tocar();


}
