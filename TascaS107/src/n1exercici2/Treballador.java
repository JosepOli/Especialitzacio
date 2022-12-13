package n1exercici2;

public class Treballador {

	protected String nom;
	protected String cognom;
	protected double preuHora;

	public Treballador(String nom, String cognom, double preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	public int calcularSou(int horesTreballades) {
		return (int) (horesTreballades * preuHora);
	}
}
