package n1exercici1;

public class TreballadorOnline extends Treballador {

	final Integer tarifaPlana = 30;
	
	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	@Override
	public int calcularSou(int horesTreballades) {
		return super.calcularSou(horesTreballades) + tarifaPlana;
	}

}
