package n1exercici1;

public class Producte {

	private String nom;
	private Integer preu;

	public Producte(String nom, Integer preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getPreu() {
		return preu;
	}

	public void setPreu(Integer preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Producte [nom=" + nom + ", preu=" + preu + "]";
	}

}
