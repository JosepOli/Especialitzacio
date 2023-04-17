package s303n1;

public class Arbre {

	private double altura;
	private double preu;

	public Arbre(double altura, double preu) {
		super();
		this.altura = altura;
		this.preu = preu;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Arbre [altura=" + altura + ", preu=" + preu + "]";
	}

}
