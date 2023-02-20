package n1exercici1;

public class TreballadorPresencial extends Treballador {

	static Integer benzina = 150;
	
	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public int calcularSou(int horesTreballades) {
		return super.calcularSou(horesTreballades) + benzina;
	}

}
